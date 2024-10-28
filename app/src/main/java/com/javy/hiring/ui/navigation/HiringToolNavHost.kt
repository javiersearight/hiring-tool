package com.javy.hiring.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.javy.hiring.ui.navigation.Route.CANDIDATES_SCREEN
import com.javy.hiring.ui.theme.HiringToolTheme

@Composable
fun HiringToolNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = CANDIDATES_SCREEN
    ) {
        slideInOutComposable(route = CANDIDATES_SCREEN) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Greeting(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HiringToolTheme {
        Greeting("Android")
    }
}