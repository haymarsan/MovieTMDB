package com.hms.movie_tmdb.mvp.presenter

import com.hms.movie_tmdb.mvp.view.BaseView

abstract class BasePresenter<T: BaseView> : IBasePresenter {

    protected lateinit var mView: T

    fun initPresenter(view: T){
        mView = view
    }

}