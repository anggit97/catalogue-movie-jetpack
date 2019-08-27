package com.anggit97.cataloguemovie.ui.home.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.model.ResultMovie
import com.anggit97.cataloguemovie.utils.showImageRounded
import kotlinx.android.synthetic.main.row_item_movie.view.*

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
class MovieAdapter() : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private var movieList: MutableList<ResultMovie> = mutableListOf()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindView(model: ResultMovie) {
            with(itemView){
                tv_title_movies.text = model.title
                tv_subtitle_movies.text = "Action - ".plus("2 Jam 10 Menit")
                tv_subtitle_imdb.text = model.voteAverage.toString()
                model.backdropPath?.let { iv_movies.showImageRounded(itemView.context, it) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_item_movie,
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