package com.anggit97.cataloguemovie.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.model.ResultMovie
import com.anggit97.cataloguemovie.utils.showImageRounded
import kotlinx.android.synthetic.main.activity_detail_movie.*
import kotlinx.android.synthetic.main.content_description.*
import kotlinx.android.synthetic.main.content_header.*
import kotlinx.android.synthetic.main.content_score.*

const val EXTRA_ID = "extra_id"
const val EXTRA_TYPE = "extra_type"

class DetailMovieActivity : AppCompatActivity() {

    private var movieId: Int? = null
    private var movieType: Int? = null
    private var movieResult: ResultMovie? = null
    private lateinit var detailMovieViewModel: DetailMovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        handleExtra()

        initViewModel()

        bindView()

        onListener()
    }

    private fun onListener() {
        iv_back.setOnClickListener {
            finish()
        }
    }

    private fun handleExtra() {
        movieId = intent.getIntExtra(EXTRA_ID, 0)
        movieType = intent.getIntExtra(EXTRA_TYPE, 0)
    }

    private fun initViewModel() {
        detailMovieViewModel = ViewModelProviders.of(this).get(DetailMovieViewModel::class.java)
        movieId?.let { mId -> detailMovieViewModel.setMovieId(mId) }
        movieType?.let { mType -> detailMovieViewModel.setMovieType(mType) }
        movieResult = detailMovieViewModel.getSelectedMovie()
    }

    private fun bindView() {
        movieResult?.let { data ->
            iv_thumbnail.showImageRounded(this, data.backdropPath, 80)
            iv_movies.showImageRounded(this, data.backdropPath)
            tv_title_movies.text = data.title
            tv_subtitle_movies.text = data.releaseDate
            tv_score_imdb.text = data.voteAverage.toString().plus("/").plus("10")
            tv_score_popularity.text = data.popularity.toString().plus("%")
            tv_release_date.text = data.releaseDate
            tv_end_date.text = data.releaseDate
            tv_author.text = getString(R.string.author_dummy)
            tv_body_movie.text = data.overview
        }
    }
}
