package com.anggit97.cataloguemovie.ui.home.tvshow

import androidx.lifecycle.ViewModel
import com.anggit97.cataloguemovie.model.ResultTvShow
import com.anggit97.cataloguemovie.utils.FakeData

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
class TvShowViewModel : ViewModel() {

    fun generateTvShow(): ArrayList<ResultTvShow> {
        return FakeData.generateTvShow()
    }
}