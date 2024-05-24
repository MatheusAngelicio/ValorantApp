package com.example.valorantapp.ui.presentation.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.valorantapp.ui.presentation.home.components.ModalDrawerSheetComponent
import com.example.valorantapp.ui.presentation.home.components.TopBarComponent

@Composable
fun HomePage() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()
        val navController = rememberNavController()

        ModalNavigationDrawer(
            drawerContent = {
                ModalDrawerSheetComponent(
                    drawerState = drawerState,
                    scope = scope,
                    navController = navController,
                )
            },
            drawerState = drawerState
        ) {
            Scaffold(
                topBar = {
                    TopBarComponent(drawerState = drawerState, scope = scope)
                }
            ) { paddingValues ->
                HomeContent(
                    paddingValues = paddingValues,
                    navController = navController
                )
            }
        }
    }
}






