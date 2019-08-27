package com.anggit97.cataloguemovie.ui.home.tvshow

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {

    private lateinit var SUT: TvShowViewModel
    private val dummyTotalItem = 11

    @Before
    fun setUp() {
        SUT = TvShowViewModel()
    }

    /**
     * MovieViewModel Test Case :
     * - Periksa apakah list tv show tidak null
     * - Periksa apakah total list tv show berjumlah 11
     */
    @Test
    fun getMovies_notNullMovieLIst_returnTrue() {
        val result = SUT.getTvShow()
        Assert.assertNotNull(result)
    }

    @Test
    fun getMovies_movieList_returnTrue() {
        val result = SUT.getTvShow()
        Assert.assertEquals(result.size, dummyTotalItem)
    }
}