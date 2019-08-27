package com.anggit97.cataloguemovie.ui.home.movie

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var SUT: MovieViewModel

    private val dummyTotalItem = 10

    @Before
    fun setUp() {
        SUT = MovieViewModel()
    }

    /**
     * MovieViewModel Test Case :
     * - Periksa apakah list movie tidak null
     * - Periksa apakah total list movie berjumlah 10
     */
    @Test
    fun getMovies_notNullMovieLIst_returnTrue() {
        val result = SUT.getMovies()
        assertNotNull(result)
    }

    @Test
    fun getMovies_movieList_returnTrue() {
        val result = SUT.getMovies()
        assertEquals(result.size, dummyTotalItem)
    }
}
