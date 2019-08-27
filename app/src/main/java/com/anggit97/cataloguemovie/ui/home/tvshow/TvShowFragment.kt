package com.anggit97.cataloguemovie.ui.home.tvshow


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.model.ResultTvShow
import com.anggit97.cataloguemovie.model.TvShow
import kotlinx.android.synthetic.main.fragment_tv_show.*

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {

    private lateinit var tvShowViewModel: TvShowViewModel
    private lateinit var adapter: TvShowAdapter

    private var tvShowList: MutableList<ResultTvShow> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvShowViewModel = ViewModelProviders.of(this).get(TvShowViewModel::class.java)
        tvShowList = tvShowViewModel.generateTvShow()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        rv_tv_show.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        adapter = TvShowAdapter()
        rv_tv_show.adapter = adapter
        adapter.setMovieList(tvShowList)
    }

    companion object {

        fun newInstance() = TvShowFragment()
    }
}
