package com.example.twoforyou_moviedb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.twoforyou_moviedb.screen.rating.RatingScreen
import com.example.twoforyou_moviedb.screen.splash.SplashScreen

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.RatingScreen.route) {
            RatingScreen(navController = navController)
        }

        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

    }
}