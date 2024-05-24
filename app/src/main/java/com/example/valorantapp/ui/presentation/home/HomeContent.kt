package com.example.valorantapp.ui.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.valorantapp.ui.presentation.home.navigationItem.navigationItems
import com.example.valorantapp.ui.presentation.home.pages.agents.AgentsPage
import com.example.valorantapp.ui.presentation.home.pages.favorites.FavoritesPage
import com.example.valorantapp.ui.presentation.home.pages.weapons.WeaponsPage
import com.example.valorantapp.ui.presentation.navigation.Routes

@Composable
fun HomeContent(paddingValues: PaddingValues, navController: NavHostController) {
    Box(modifier = androidx.compose.ui.Modifier.padding(paddingValues)) {
        NavHost(
            navController = navController,
            startDestination = navigationItems[0].route
        ) {
            composable(Routes.agentsPageRoute) { AgentsPage() }
            composable(Routes.weaponsPageRoute) { WeaponsPage() }
            composable(Routes.favoritesPageRoute) { FavoritesPage() }
        }
    }
}