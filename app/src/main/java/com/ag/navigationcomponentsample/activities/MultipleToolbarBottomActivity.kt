package com.ag.navigationcomponentsample.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.navigation.setupWithNavController
import kotlinx.android.synthetic.main.activity_bottom.*

class MultipleToolbarBottomActivity : AppCompatActivity(R.layout.activity_bottom) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

        // Setup the bottom navigation view with a list of navigation graphs
        bottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navHostContainer,
            intent = intent
        )
    }

}