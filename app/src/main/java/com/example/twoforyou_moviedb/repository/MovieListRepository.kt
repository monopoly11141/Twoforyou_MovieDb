package com.example.twoforyou_moviedb.repository

import android.content.ContentValues.TAG
import android.util.Log
import com.example.twoforyou_moviedb.model.MovieList
import com.example.twoforyou_moviedb.network.MovieApi
import javax.inject.Inject


class MovieListRepository @Inject constructor(private val movieApi: MovieApi) {

    suspend fun getMovieList(targetDate: String): MovieList? {
        val response = try {
            movieApi.getMovie(targetDate = targetDate)
        } catch (e: Exception) {
            Log.d(TAG, "getMovieList: ${e.message}")
            return null
        }

        Log.d(TAG, "getMovieList: ${response}")
        return response
    }

}