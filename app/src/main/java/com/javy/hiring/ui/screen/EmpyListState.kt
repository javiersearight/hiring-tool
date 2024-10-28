package com.javy.hiring.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.javy.hiring.R

@Composable
fun EmptyListState() {
    Text(text = stringResource(R.string.no_results))
}