package com.example.twoforyou_moviedb.screen.rating

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.twoforyou_moviedb.model.BoxOfficeResult
import com.example.twoforyou_moviedb.model.MovieList

@Composable
fun RatingScreen(
    navController: NavController,
    viewModel: RatingScreenViewModel = hiltViewModel()
) {

    val movieList = produceState<MovieList>(
        initialValue = MovieList(BoxOfficeResult(boxofficeType = "", dailyBoxOfficeList = emptyList(), showRange = ""))
    ) {
        value = viewModel.getMovieList("231204")!!
    }.value

    Log.d(TAG, "RatingScreen: $movieList")

}