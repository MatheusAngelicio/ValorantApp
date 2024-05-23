package com.example.valorantapp.ui.presenter.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.valorantapp.ui.theme.black

@Composable
fun SplashPage() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = black
    ) {
        SplashContent()
    }
}

@Preview(showBackground = true)
@Composable
private fun SplashPagePreview() {
    SplashPage()
}
