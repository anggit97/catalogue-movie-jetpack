package com.anggit97.cataloguemovie.ui.detail

import androidx.lifecycle.ViewModel
import com.anggit97.cataloguemovie.model.ResultMovie
import com.anggit97.cataloguemovie.utils.FakeData

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
class DetailMovieViewModel : ViewModel() {

    private var moviewId: Int? = null
    private var movieType: Int? = null

    fun getSelectedMovie(): ResultMovie? {
        var resultMovie: ResultMovie? = null
        for (data in getMovies()) {
            moviewId?.let { mId ->
                data.id?.let { id ->
                    if (mId == id) {
                        resultMovie = data
                    }
                }
            }
        }
        return resultMovie
    }

    private fun getMovies(): ArrayList<ResultMovie> {
        if (movieType == 1) {
            return FakeData.generateMovies()
        }
        return FakeData.generateTvShow()
    }

    fun setMovieId(movieId: Int) {
        this.moviewId = movieId
    }

    fun setMovieType(movieType: Int){
        this.movieType = movieType
    }
}