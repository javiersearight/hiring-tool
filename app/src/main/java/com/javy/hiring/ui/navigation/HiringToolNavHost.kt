package com.javy.hiring.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.javy.hiring.ui.navigation.Route.CANDIDATES_SCREEN
import com.javy.hiring.ui.screen.candidates.CandidatesScreen

@Composable
fun HiringToolNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = CANDIDATES_SCREEN
    ) {
        slideInOutComposable(route = CANDIDATES_SCREEN) {
            CandidatesScreen()
        }
    }
}