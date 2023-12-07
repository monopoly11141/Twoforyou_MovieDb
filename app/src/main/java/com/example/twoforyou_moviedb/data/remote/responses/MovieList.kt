package com.example.twoforyou_moviedb.data.remote.responses


import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("boxOfficeResult")
    val boxOfficeResult: BoxOfficeResult
)