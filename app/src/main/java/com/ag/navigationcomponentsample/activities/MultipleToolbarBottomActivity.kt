package com.ag.navigationcomponentsample.activities

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.navigation.changeStatusBarColor
import com.ag.navigationcomponentsample.navigation.setupWithNavController
import kotlinx.android.synthetic.main.activity_bottom.*


class MultipleToolbarBottomActivity : AppCompatActivity(R.layout.activity_bottom) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeStatusBarColor(Color.TRANSPARENT)
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {
        val navGraphIds =
            listOf(R.navigation.first_host, R.navigation.second_host, R.navigation.third_host)

        val controller = bottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navHostContainer,
            intent = intent
        )
    }

    fun setBottomColor(@ColorInt color: Int) {
        val colors = intArrayOf(Color.BLACK, color)

        val states = arrayOf(
            intArrayOf(android.R.attr.state_enabled, -android.R.attr.state_checked),
            intArrayOf(android.R.attr.state_enabled, android.R.attr.state_checked)
        )

        bottomNavigationView.itemTextColor = ColorStateList(states, colors)
        bottomNavigationView.itemIconTintList = ColorStateList(states, colors)
    }


}