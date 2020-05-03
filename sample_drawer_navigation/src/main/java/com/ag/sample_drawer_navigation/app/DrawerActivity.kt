package com.ag.sample_drawer_navigation.app

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.ag.multiple_toolbars.changeStatusBarColor
import com.ag.multiple_toolbars.setupWithNavController
import com.ag.sample_drawer_navigation.R
import kotlinx.android.synthetic.main.activity_drawer.*

class DrawerActivity : AppCompatActivity(R.layout.activity_drawer) {

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
            listOf(
                R.navigation.first_host,
                R.navigation.second_host,
                R.navigation.third_host
            )

        val controller = navigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navHostContainer,
            intent = intent
        )
    }


    fun getDrawerLayout(): DrawerLayout = drawerLayout
}
