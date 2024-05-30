package com.example.valorantapp.presentation.ui.pages.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.valorantapp.presentation.theme.black

@Composable
fun SplashPage(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = black
    ) {
        SplashContent(navController)
    }
}

@Preview(showBackground = true)
@Composable
private fun SplashPagePreview() {
    val navController = rememberNavController()
    SplashPage(navController)
}
