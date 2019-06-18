package com.hms.movie_tmdb.delegates

interface BaseNetworkDelegate {
//Todo should be refector ur parent class that can also send onSuccess
    fun onFail(message: String)

}