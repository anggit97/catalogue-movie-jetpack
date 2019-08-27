package com.anggit97.cataloguemovie.ui.detail

import com.anggit97.cataloguemovie.model.ResultMovie
import com.anggit97.cataloguemovie.utils.FakeDataTesting
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {

    private lateinit var SUT: DetailMovieViewModel
    private var id = 1
    private var movieType = 1
    private var tvShowType = 2

    private lateinit var dummyMovieEntity: ResultMovie
    private lateinit var dummyTvShowEntity: ResultMovie

    @Before
    fun setUp() {
        SUT = DetailMovieViewModel()
        dummyMovieEntity = FakeDataTesting.generateMovies()[0]
        dummyTvShowEntity = FakeDataTesting.generateTvShow()[0]
    }

    /**
     * DetailViewModel Test Case:
     * - Periksa apakah object ResultMovie tidak null
     * - check apakah type nya 1 (MOVIE_TYPE), periksa apakah nilai dari object result movie sesuai dengan yang diharapkan
     * - check apakah type nya 2 (TV_SHOW_TYPE), periksa apakah nilai dari object result movie sesuai dengan yang diharapkan
     */
    @Test
    fun getSelectedMovie_notNullResultMovie_trueReturned() {
        SUT.setMovieId(id)
        SUT.setMovieType(movieType)
        val result = SUT.getSelectedMovie()
        assertNotNull(result)
    }

    @Test
    fun getSelectedMovie_movieType_trueReturned() {
        SUT.setMovieId(id)
        SUT.setMovieType(movieType)
        val result = SUT.getSelectedMovie()
        assertEquals(result?.id, id)
        assertEquals(result?.title, dummyMovieEntity.title)
    }

    @Test
    fun getSelectedMovie_tvShowType_trueReturned() {
        SUT.setMovieId(id)
        SUT.setMovieType(tvShowType)
        val result = SUT.getSelectedMovie()
        assertEquals(result?.id, id)
        assertEquals(result?.title, dummyTvShowEntity.title)
    }
}
