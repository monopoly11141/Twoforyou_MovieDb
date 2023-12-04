package com.example.twoforyou_moviedb.navigation

sealed class Screen(val route : String){
    object RatingScreen : Screen(route = "rating_screen")
    object SplashScreen : Screen(route = "splash_screen")
}