package com.hms.movie_tmdb.persistence

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO

@Database(entities = arrayOf(TopRatedMoviesVO::class), version = 1)
abstract class MovieDatabase: RoomDatabase() {

    abstract val topRatedDao: TopRatedDao

    companion object{

        private val DB_Name = "top_rated_movies_db"

        var moviesDB: MovieDatabase? = null

        fun getInstance(context: Context): MovieDatabase{

            if (moviesDB == null){
                moviesDB = Room.databaseBuilder(context, MovieDatabase::class.java, DB_Name)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return moviesDB!!
        }

    }




}