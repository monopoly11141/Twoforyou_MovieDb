package com.example.twoforyou_moviedb.model


import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("boxOfficeResult")
    val boxOfficeResult: BoxOfficeResult
)