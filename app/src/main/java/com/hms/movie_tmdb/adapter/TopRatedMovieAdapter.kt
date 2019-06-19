package com.hms.movie_tmdb.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.hms.movie_tmdb.R
import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO
import com.hms.movie_tmdb.delegates.GetTopRatedDelegate
import com.hms.movie_tmdb.views.holders.TopRatedMoviesViewHolder

class TopRatedMovieAdapter: BaseRecyclerAdapter<TopRatedMoviesViewHolder, TopRatedMoviesVO>() {

    override fun onCreateViewHolder(view: ViewGroup, position: Int): TopRatedMoviesViewHolder {

        val inflater = LayoutInflater.from(view.context)
        val view = inflater.inflate(R.layout.viewitem_top_rate_movie, view, false)
        return TopRatedMoviesViewHolder(view)

    }
}