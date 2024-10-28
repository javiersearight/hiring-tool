package com.javy.hiring.ui.screen.candidates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.javy.hiring.R
import com.javy.hiring.ui.screen.LoadingIndicator
import com.javy.hiring.ui.theme.DarkBlue
import com.javy.hiring.ui.theme.White
import com.javy.hiring.ui.viewmodel.candidates.CandidatesViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CandidatesScreen() {

    val viewModel = viewModel<CandidatesViewModel>()
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_name),
                        color = White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                ),
                modifier = Modifier
                    .background(DarkBlue)
            )
        },
        contentWindowInsets = WindowInsets(0.dp)
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            with(uiState) {
                if (isLoading) LoadingIndicator()

                if (candidates.isNotEmpty()) {
                    CandidateList(candidates)
                }
            }
        }
    }
}

@Preview
@Composable
fun CandidateScreenPreview() {
    CandidatesScreen()
}