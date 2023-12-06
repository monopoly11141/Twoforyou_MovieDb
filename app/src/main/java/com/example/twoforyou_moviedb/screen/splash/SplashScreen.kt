package com.example.twoforyou_moviedb.screen.splash

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.twoforyou_moviedb.navigation.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    Text("Splash Screen")

    LaunchedEffect(key1 = true) {
        delay(500L)
        navController.navigate(route = Screen.RatingScreen.route)
    }
}