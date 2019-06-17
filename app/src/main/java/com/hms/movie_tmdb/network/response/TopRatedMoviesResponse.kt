package com.example.movie_tmdb.network.response

import com.google.gson.annotations.SerializedName
import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO

class TopRatedMoviesResponse (

    @SerializedName("page")
    val page: Int,

    @SerializedName("total_results")
    val total_results: Int,

    @SerializedName("total_pages")
    val total_pages: Int,

    @SerializedName("results")
    val topRate_results : MutableList<TopRatedMoviesVO>

): BaseResponse()


//"page": 1,
//"total_results": 7330,
//"total_pages