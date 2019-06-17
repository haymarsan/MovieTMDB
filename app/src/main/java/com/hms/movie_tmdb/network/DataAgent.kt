package com.example.movie_tmdb.network

import com.hms.movie_tmdb.delegates.BaseNetworkDelegate
import com.hms.movie_tmdb.delegates.GetTopRatedDelegate

interface DataAgent {


   fun loadTopRatedMovies(api_key: Int, page: Int, topRatedMoviesDelegate: GetTopRatedDelegate)

}