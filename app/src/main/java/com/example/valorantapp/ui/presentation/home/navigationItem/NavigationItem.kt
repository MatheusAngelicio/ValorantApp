package com.example.valorantapp.ui.presentation.home.navigationItem

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.valorantapp.ui.presentation.navigation.Routes.agentsPageRoute
import com.example.valorantapp.ui.presentation.navigation.Routes.favoritesPageRoute
import com.example.valorantapp.ui.presentation.navigation.Routes.weaponsPageRoute

data class NavigationItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)

val navigationItems = listOf(
    NavigationItem(
        title = "Agents",
        route = agentsPageRoute,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    ),
    NavigationItem(
        title = "Weapons",
        route = weaponsPageRoute,
        selectedIcon = Icons.Filled.Info,
        unselectedIcon = Icons.Outlined.Info,
    ),
    NavigationItem(
        title = "Favorites",
        route = favoritesPageRoute,
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings
    )
)