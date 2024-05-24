package com.example.valorantapp.common.components.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import com.example.valorantapp.ui.theme.white

@Composable
fun ValorantText(
    modifier: Modifier = Modifier,
    text: String,
    fontFamily: FontFamily = FontFamily.Monospace,
    color: Color = white,
) {
    Text(
        modifier = modifier,
        text = text,
        fontFamily = fontFamily,
        color = color,
    )
}