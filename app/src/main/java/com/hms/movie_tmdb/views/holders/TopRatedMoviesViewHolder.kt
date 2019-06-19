package com.hms.movie_tmdb.views.holders

import android.view.View
import com.bumptech.glide.Glide
import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO
import com.hms.movie_tmdb.delegates.GetTopRatedDelegate
import kotlinx.android.synthetic.main.viewitem_top_rate_movie.view.*

class TopRatedMoviesViewHolder(var viewItem: View) : BaseViewHolder<TopRatedMoviesVO>(viewItem) {

    override fun bindData(data: TopRatedMoviesVO) {

        if (viewItem.ivTopRatedMovies !=null){
            Glide.with(viewItem)
                .load(data.poster_path)
                .into(viewItem.ivTopRatedMovies)
        }

    }

}