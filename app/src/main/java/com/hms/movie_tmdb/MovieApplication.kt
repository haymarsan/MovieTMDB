package com.hms.movie_tmdb

import android.app.Application
import com.example.movie_tmdb.data.model.TopRatedMoviesModel

class MovieApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        TopRatedMoviesModel.initModel(applicationContext)

    }


}