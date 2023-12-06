package com.example.twoforyou_moviedb.di

import com.example.twoforyou_moviedb.network.MovieApi
import com.example.twoforyou_moviedb.util.Constant
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providesMovieApi(): MovieApi {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create(gson)
            )
            .build()
            .create(MovieApi::class.java)

    }

}


