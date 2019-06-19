package com.hms.movie_tmdb.mvp.view

import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO

interface HomeView : BaseView {

    fun displayTopRatedMovies(topRatedMoviesList: List<TopRatedMoviesVO>)
    fun showPrompt(message: String)

}