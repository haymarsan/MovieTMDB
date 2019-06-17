package com.example.movie_tmdb.network


import com.hms.movie_tmdb.utils.MovieConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitDA:DataAgent {


    var movieAPI: MovieAPI


    init {

       val retrofit = Retrofit.Builder()
           .baseUrl(MovieConstants.BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

         movieAPI = retrofit.create(MovieAPI::class.java)
    }





    override fun loadTopRatedMovies(api_key: Int, page: Int) {

        movieAPI
    }
}