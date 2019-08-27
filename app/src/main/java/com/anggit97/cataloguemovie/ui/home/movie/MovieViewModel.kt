package com.anggit97.cataloguemovie.ui.home.movie

import androidx.lifecycle.ViewModel
import com.anggit97.cataloguemovie.model.ResultMovie
import com.anggit97.cataloguemovie.utils.FakeData

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
class MovieViewModel : ViewModel() {

    fun getMovies(): ArrayList<ResultMovie> {
        return FakeData.generateMovies()
    }
}