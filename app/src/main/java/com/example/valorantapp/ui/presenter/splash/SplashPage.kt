package com.example.valorantapp.ui.presenter.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.valorantapp.R


@Composable
fun SplashPage() {

    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ){
        SplashContent()
    }

}

@Composable
fun SplashContent() {
    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(
            resId = R.raw.splash_animation
        )
    )

    LottieAnimation(composition = composition, iterations = LottieConstants.IterateForever)
}

@Preview(showBackground = true)
@Composable
private fun SplashPagePreview() {
    SplashPage()
}
