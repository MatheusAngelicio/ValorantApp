package com.example.valorantapp.presentation.ui.pages.home.navigationItem

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.valorantapp.presentation.ui.navigation.Routes.agentsPageRoute
import com.example.valorantapp.presentation.ui.navigation.Routes.favoritesPageRoute
import com.example.valorantapp.presentation.ui.navigation.Routes.weaponsPageRoute

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
        selectedIcon = Icons.Filled.Face,
        unselectedIcon = Icons.Outlined.Face
    ),
    NavigationItem(
        title = "Weapons",
        route = weaponsPageRoute,
        selectedIcon = Icons.Filled.Build,
        unselectedIcon = Icons.Outlined.Build,
    ),
    NavigationItem(
        title = "Favorites",
        route = favoritesPageRoute,
        selectedIcon = Icons.Filled.Favorite,
        unselectedIcon = Icons.Outlined.FavoriteBorder
    )
)