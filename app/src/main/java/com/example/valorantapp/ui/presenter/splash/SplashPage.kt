package com.example.valorantapp.ui.presenter.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.valorantapp.R


@Composable
fun SplashPage() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
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
    Column{
        Image(
            painter = painterResource(id = R.drawable.valorant_logo),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever,

        )
    }
}


@Preview(showBackground = true)
@Composable
private fun SplashPagePreview() {
    SplashPage()
}
