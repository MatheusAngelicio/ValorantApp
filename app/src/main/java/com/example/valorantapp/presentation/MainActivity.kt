package com.example.valorantapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.valorantapp.presentation.ui.pages.home.HomePage
import com.example.valorantapp.presentation.ui.navigation.Routes.homePageRoute
import com.example.valorantapp.presentation.ui.navigation.Routes.splashPageRoute
import com.example.valorantapp.presentation.ui.pages.splash.SplashPage
import com.example.valorantapp.presentation.theme.ValorantAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ValorantAppTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = splashPageRoute
                ) {
                    composable(splashPageRoute) { SplashPage(navController) }
                    composable(homePageRoute) { HomePage() }
                }
            }
        }
    }
}

