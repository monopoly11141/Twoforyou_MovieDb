package com.example.twoforyou_moviedb.screen.rating

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.twoforyou_moviedb.data.remote.responses.MovieList
import com.example.twoforyou_moviedb.repository.MovieListRepository
import com.example.twoforyou_moviedb.util.Constant
import com.example.twoforyou_moviedb.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RatingScreenViewModel @Inject constructor(private val repository: MovieListRepository) :
    ViewModel() {

    lateinit var result : Resource<MovieList>

    fun getMovieList(targetDate: String) {
        viewModelScope.launch {
            result = repository.getMovieList(targetDate)
            Log.d(TAG, "getMovieList: $result")
        }

    }

}


