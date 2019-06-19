package com.example.movie_tmdb.data.model


import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO
import com.hms.movie_tmdb.delegates.GetTopRatedDelegate
import com.hms.movie_tmdb.utils.MovieConstants

object TopRatedMoviesModel : BaseModel(), ITopRatedMovieModel {


    override fun getTopRatedMovies(error:(String)-> Unit): List<TopRatedMoviesVO> {

        mMovieDA.loadTopRatedMovies(MovieConstants.API_KEY,1, object : GetTopRatedDelegate{

            override fun onSuccess(topRatedMoviesList: MutableList<TopRatedMoviesVO>) {
                val topRatedList = topRatedMoviesList

                mMovieDB.topRatedDao.loadTopRatedMovies()
            }

            override fun onFail(message: String) {
                    error(message)
            }

        })

        val movieList = mMovieDB.topRatedDao.loadTopRatedMovies()
5
        return movieList
    }
}