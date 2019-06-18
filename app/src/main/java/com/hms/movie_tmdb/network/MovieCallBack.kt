package com.hms.movie_tmdb.network

import com.example.movie_tmdb.network.response.BaseResponse
import com.hms.movie_tmdb.delegates.BaseNetworkDelegate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


open class MovieCallBack<R: BaseResponse, D: BaseNetworkDelegate>(var delegate: D): Callback<R> {


    override fun onFailure(call: Call<R>, t: Throwable) {
        delegate.onFail(t.message!!)
    }

    override fun onResponse(call: Call<R>, response: Response<R>) {
        val dataResponse = response.body()

        if (dataResponse == null){

            delegate.onFail("Response is null")
            return
        }else{
            //Todo change ur code that can be send delegate.onSuccess(Type of Vo) in else case
        }
    }
}