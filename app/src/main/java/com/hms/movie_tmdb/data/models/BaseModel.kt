package com.example.movie_tmdb.data.model

import android.content.Context
import com.example.movie_tmdb.network.DataAgent
import com.example.movie_tmdb.network.RetrofitDA
import com.hms.movie_tmdb.persistence.MovieDatabase

abstract class BaseModel {

    lateinit var mMovieDB: MovieDatabase
    lateinit var mMovieDA: DataAgent



    fun initModel(context: Context){

        mMovieDB = MovieDatabase.getInstance(context)
        mMovieDA = RetrofitDA

    }
}