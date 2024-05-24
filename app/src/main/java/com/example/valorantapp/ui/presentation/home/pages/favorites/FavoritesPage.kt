package com.example.valorantapp.ui.presentation.home.pages.favorites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.valorantapp.ui.theme.black

@Composable
fun FavoritesPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(black)
    ){
        Text(text = "Favorites Page")
    }
}