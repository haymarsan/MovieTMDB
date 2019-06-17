package com.example.movie_tmdb.network

interface DataAgent {


   fun loadTopRatedMovies(api_key: Int, page: Int)

}