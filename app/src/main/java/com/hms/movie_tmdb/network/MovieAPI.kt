package com.example.movie_tmdb.network

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded

interface MovieAPI {

    @FormUrlEncoded
    fun getTopRatedMovieResponse(@Field ("api_key") api_key: Int,
                                 @Field ("page")page: Int)


}