package com.hms.movie_tmdb.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<T>(var view: View) : RecyclerView.ViewHolder(view) {


    abstract fun bindData(data: T)

}