package com.cristhianbonilla.googlesingkmp

import androidx.compose.foundation.background
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CommonButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.background(Color.Yellow)
    ) {
        Text("Common Button")
    }
}