package com.example.valorantapp.presentation.ui.pages.home.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.navOptions
import com.example.valorantapp.core.utils.ValorantSpacing
import com.example.valorantapp.presentation.ui.pages.home.navigationItem.navigationItems
import com.example.valorantapp.presentation.theme.lightGrey
import com.example.valorantapp.presentation.theme.white
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ModalDrawerSheetComponent(
    drawerState: DrawerState,
    scope: CoroutineScope,
    navController: NavController
) {
    var selectedItemIndex by rememberSaveable { mutableStateOf(0) }

    ModalDrawerSheet(
        drawerContainerColor = lightGrey,
    ) {
        Spacer(modifier = Modifier.height(ValorantSpacing.medium))
        navigationItems.forEachIndexed { index, item ->
            NavigationDrawerItem(
                label = { Text(text = item.title) },
                selected = index == selectedItemIndex,
                onClick = {
                    selectedItemIndex = index
                    scope.launch {
                        drawerState.close()
                    }
                    // Configuração para tirar a pagina da pilha conforme navego entre elas
                    val navOptions = navOptions {
                        popUpTo(navController.currentDestination?.id ?: return@navOptions) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                    navController.navigate(item.route, navOptions)
                },
                icon = {
                    Icon(
                        imageVector = if (index == selectedItemIndex) {
                            item.selectedIcon
                        } else {
                            item.unselectedIcon
                        },
                        contentDescription = item.title
                    )
                },
                colors = NavigationDrawerItemDefaults.colors(
                    selectedContainerColor = white,
                    unselectedContainerColor = lightGrey
                ),
                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
            )
        }
    }
}
