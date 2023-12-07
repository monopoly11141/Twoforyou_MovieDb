package com.example.twoforyou_moviedb.data.remote

import com.example.twoforyou_moviedb.data.remote.responses.MovieList
import com.example.twoforyou_moviedb.util.Constant
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface MovieApi {
    @Headers("Accept: application/json")
    @GET("kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList")
    suspend fun getMovie(
        @Query("key") key: String = Constant.API_KEY,
        @Query("targetDt") targetDt: String, //ex.20231204
    ): MovieList


}