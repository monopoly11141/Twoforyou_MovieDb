package com.example.twoforyou_moviedb.network

import com.example.twoforyou_moviedb.model.MovieList
import com.example.twoforyou_moviedb.util.Constant
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface MovieApi {

    @GET(Constant.BASE_URL)
    suspend fun getMovie(
        @Query("key") key : String = Constant.API_KEY,
        @Query("targetDt") targetDate : String, //ex.20231204
    ) : MovieList


}