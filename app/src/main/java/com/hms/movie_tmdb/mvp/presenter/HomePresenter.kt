package com.hms.movie_tmdb.mvp.presenter

import com.example.movie_tmdb.data.model.ITopRatedMovieModel
import com.example.movie_tmdb.data.model.TopRatedMoviesModel
import com.hms.movie_tmdb.mvp.view.HomeView

class HomePresenter: BasePresenter<HomeView>(), IHomePresenter {

    private val mTopRatedMovieModel = TopRatedMoviesModel

    override fun onUIReady() {
       val topRatedMovieLists =  mTopRatedMovieModel.getTopRatedMovies {error: String -> mView.showPrompt(error)}
        mView.displayTopRatedMovies(topRatedMovieLists)
    }
}