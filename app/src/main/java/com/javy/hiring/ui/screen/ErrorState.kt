package com.javy.hiring.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ErrorState(errorMessage: String?) {
    errorMessage?.let {
        Text(text = errorMessage)
    }
}