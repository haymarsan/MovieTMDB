package com.hms.movie_tmdb.adapter


import android.support.v7.widget.RecyclerView
import com.hms.movie_tmdb.views.holders.BaseViewHolder


abstract class BaseRecyclerAdapter<H : BaseViewHolder<D>, D> : RecyclerView.Adapter<H>() {
    public var mData: MutableList<D>? = null
    init {
       var mData=ArrayList<D>()
    }

    override fun getItemCount(): Int {
        return mData?.size ?: 0
    }

    open override fun onBindViewHolder(viewHolder: H, position: Int) {
            // bind data
        viewHolder.bindData(mData!!.get(position))
    }

    open fun setData(data: List<D>) {
        mData =data.toMutableList()
        notifyDataSetChanged()
    }
    fun appendData(data :List<D> )
    {
        mData!!.addAll(data)
    }

    fun getItems(): List<D> {
        return if (mData == null) java.util.ArrayList<D>() else mData!!

    }

}