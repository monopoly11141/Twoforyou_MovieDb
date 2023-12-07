package com.example.twoforyou_moviedb.repository

import android.content.ContentValues.TAG
import android.util.Log
import com.example.twoforyou_moviedb.data.remote.responses.MovieList
import com.example.twoforyou_moviedb.data.remote.MovieApi
import com.example.twoforyou_moviedb.util.Resource
import javax.inject.Inject


class MovieListRepository @Inject constructor(
    private val movieApi: MovieApi
) {

    suspend fun getMovieList(targetDate: String): Resource<MovieList> {
        val response = try {
            movieApi.getMovie(targetDt = targetDate)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }

        Log.d(TAG, "getMovieList: $response")
        return Resource.Success(response)
    }

}