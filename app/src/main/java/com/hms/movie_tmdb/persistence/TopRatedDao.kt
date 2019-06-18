package com.hms.movie_tmdb.persistence

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO


@Dao
interface TopRatedDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertIopRatedMovies(topRatedMovieLists: List<TopRatedMoviesVO>): List<Long>


    @Query("SELECT * FROM top_rated_movie_table")
    fun loadTopRatedMovies(): MutableList<TopRatedMoviesVO>


}