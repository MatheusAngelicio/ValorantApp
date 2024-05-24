package com.example.valorantapp.common.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.valorantapp.ui.theme.red

@Composable
fun RoundedButton(text: String,  onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(red),
        modifier = Modifier
            .padding(bottom = 16.dp)
    ) {
        Text(
            text = text,
            fontFamily = FontFamily.Monospace
        )
    }
}
