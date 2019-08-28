package com.anggit97.cataloguemovie.ui.home.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.testing.SingleFragmentActivity
import com.anggit97.cataloguemovie.utils.RecyclerViewItemCountAssertion
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
class MovieFragmentTest {

    @get:Rule
    val activitytestRule: ActivityTestRule<SingleFragmentActivity> =
        ActivityTestRule(SingleFragmentActivity::class.java)

    @Before
    fun setUp() {
        activitytestRule.activity.setFragmentInViewPager(MovieFragment.newInstance(), "Movie")
    }

    /**
     * Movie Fragment Test :
     * Periksa apakah recyclerview movies tampil
     * Periksa apakah total item pada recyclerview movies adalah 10
     */
    @Test
    fun name() {
        onView(withId(R.id.rv_tv_show)).apply {
            check(matches(isDisplayed()))
            check(RecyclerViewItemCountAssertion(10))
        }
    }
}