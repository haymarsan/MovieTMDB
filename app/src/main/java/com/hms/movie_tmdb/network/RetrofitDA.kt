package com.example.movie_tmdb.network


import com.example.movie_tmdb.network.response.TopRatedMoviesResponse
import com.hms.movie_tmdb.delegates.GetTopRatedDelegate
import com.hms.movie_tmdb.network.MovieCallBack
import com.hms.movie_tmdb.utils.MovieConstants
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitDA:DataAgent {


    var movieAPI: MovieAPI


    init {

       val retrofit = Retrofit.Builder()
           .baseUrl(MovieConstants.BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

         movieAPI = retrofit.create(MovieAPI::class.java)
    }

    override fun loadTopRatedMovies(api_key: Int, page: Int, topRatedMoviesDelegate: GetTopRatedDelegate) {

        var call = movieAPI.getTopRatedMovieResponse(api_key, page)
        call.enqueue(object : MovieCallBack<TopRatedMoviesResponse, GetTopRatedDelegate>(topRatedMoviesDelegate){

            override fun onResponse(call: Call<TopRatedMoviesResponse>, response: Response<TopRatedMoviesResponse>) {
                super.onResponse(call, response)
                var topRateResponse = response.body()
                var topRateMoviesLists = topRateResponse!!.topRate_results
                topRatedMoviesDelegate.onSuccess(topRateMoviesLists)
            }
        })
    }

}