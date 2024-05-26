package com.example.valorantapp.ui.presentation.pages.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.valorantapp.R
import com.example.valorantapp.common.components.button.ValorantButton
import com.example.valorantapp.common.utils.ValorantSpacing
import com.example.valorantapp.ui.presentation.navigation.Routes.homePageRoute
import com.example.valorantapp.ui.presentation.navigation.Routes.splashPageRoute

@Composable
fun SplashContent(navController: NavController) {
    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(
            resId = R.raw.splash_animation
        )
    )
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever,
            contentScale = ContentScale.FillHeight,
            speed = 3f,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.valorant_logo),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = ValorantSpacing.medium)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                ValorantButton(
                    text = stringResource(id = R.string.start),
                    onClick = {
                        navController.navigate(homePageRoute) {
                            popUpTo(splashPageRoute) { inclusive = true }
                        }
                    }
                )
            }
        }
    }
}