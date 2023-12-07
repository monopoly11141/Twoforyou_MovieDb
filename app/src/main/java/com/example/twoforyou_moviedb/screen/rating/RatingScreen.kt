package com.example.twoforyou_moviedb.screen.rating

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun RatingScreen(
    navController: NavController,
    viewModel: RatingScreenViewModel = hiltViewModel()
) {
    viewModel.getMovieList("231204")

}