package com.ag.navigationcomponentsample.activities

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.navigation.changeStatusBarColor
import com.ag.navigationcomponentsample.navigation.setupWithNavController
import kotlinx.android.synthetic.main.activity_drawer.*

class MultipleToolbarDrawerActivity : AppCompatActivity(R.layout.activity_drawer) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeStatusBarColor(Color.TRANSPARENT)
        if (savedInstanceState == null) {
            setupDrawerNavigation()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupDrawerNavigation()
    }

    private fun setupDrawerNavigation() {
        val navGraphIds =
            listOf(R.navigation.first_host, R.navigation.second_host, R.navigation.third_host)

        val controller = navigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navHostContainer,
            intent = intent
        )
    }
}