package com.anggit97.cataloguemovie.ui.home.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.model.ResultMovie
import com.anggit97.cataloguemovie.utils.showImageRounded
import kotlinx.android.synthetic.main.row_item_tv_show.view.*

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.ViewHolder>() {

    private var movieList: MutableList<ResultMovie> = mutableListOf()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindView(model: ResultMovie) {
            with(itemView) {
                tv_title_tv_show.text = model.title
                tv_subtitle_tv_show.text = model.genre
                tv_subtitle_score_value.text = model.voteAverage.toString()
                model.backdropPath?.let { iv_tv_show.showImageRounded(itemView.context, it) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_item_tv_show,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(movieList[position])
    }

    fun setMovieList(movieList: MutableList<ResultMovie>) {
        this.movieList = movieList
        notifyDataSetChanged()
    }
}