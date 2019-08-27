package com.anggit97.cataloguemovie.ui.home.movie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.model.ResultMovie
import kotlinx.android.synthetic.main.fragment_movie.*

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {

    private lateinit var adapter: MovieAdapter
    private lateinit var movieViewModel: MovieViewModel

    private var movieList: MutableList<ResultMovie> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movieList = movieViewModel.getMovies()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        rv_movies.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        adapter = MovieAdapter()
        rv_movies.adapter = adapter
        adapter.setMovieList(movieList)
    }

    companion object {

        fun newInstance() = MovieFragment()
    }
}
