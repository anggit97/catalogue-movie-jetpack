package com.anggit97.cataloguemovie.ui.home.tvshow

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
class TvShowFragmentTest {

    @get:Rule
    val activityTestRule: ActivityTestRule<SingleFragmentActivity> =
        ActivityTestRule(SingleFragmentActivity::class.java)

    @Before
    fun setUp() {
        activityTestRule.activity.setFragmentInViewPager(TvShowFragment.newInstance(), "TV Show")
    }

    @Test
    fun name() {
        onView(withId(R.id.rv_tv_show)).apply {
            check(matches(isDisplayed()))
            check(RecyclerViewItemCountAssertion(11))
        }
    }
}