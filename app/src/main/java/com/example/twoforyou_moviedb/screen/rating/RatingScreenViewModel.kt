package com.example.twoforyou_moviedb.screen.rating

import androidx.lifecycle.ViewModel
import com.example.twoforyou_moviedb.model.MovieList
import com.example.twoforyou_moviedb.repository.MovieListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RatingScreenViewModel @Inject constructor(private val repository: MovieListRepository) :
    ViewModel() {

    suspend fun getMovieList(targetDate: String): MovieList? {
        return repository.getMovieList(targetDate)
    }

}


