package com.example.valorantapp.presentation.ui.pages.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.valorantapp.presentation.ui.pages.home.navigationItem.navigationItems
import com.example.valorantapp.presentation.ui.pages.home.pages.agents.AgentsPage
import com.example.valorantapp.presentation.ui.pages.home.pages.favorites.FavoritesPage
import com.example.valorantapp.presentation.ui.pages.home.pages.weapons.WeaponsPage
import com.example.valorantapp.presentation.ui.navigation.Routes

@Composable
fun HomeContent(paddingValues: PaddingValues, navController: NavHostController) {
    Box(modifier = Modifier.padding(paddingValues)) {
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