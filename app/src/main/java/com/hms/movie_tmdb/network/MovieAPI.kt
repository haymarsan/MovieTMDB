package com.example.movie_tmdb.network

import com.example.movie_tmdb.network.response.TopRatedMoviesResponse
import com.hms.movie_tmdb.utils.MovieConstants
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface MovieAPI {


    companion object{
        const val TOP_RATED = "top_rated"
    }


    @FormUrlEncoded
    @GET(TOP_RATED)
    fun getTopRatedMovieResponse(@Field ("api_key") api_key: Int,
                                 @Field ("page")page: Int) : Call<TopRatedMoviesResponse>


}