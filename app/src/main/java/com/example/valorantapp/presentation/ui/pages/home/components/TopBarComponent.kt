package com.example.valorantapp.presentation.ui.pages.home.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.example.valorantapp.presentation.theme.black
import com.example.valorantapp.presentation.theme.white
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent(
    drawerState: DrawerState,
    scope: CoroutineScope,
) {
    TopAppBar(
        title = { Text(text = "Valorant App") },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    drawerState.open()
                }
            }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = white
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = black,
            titleContentColor = white,
            actionIconContentColor = white
        )
    )
}