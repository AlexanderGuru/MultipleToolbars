package com.ag.navigationcomponentsample.app

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.ag.navigationcomponentsample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        bottomBtn.setOnClickListener { /*TODO*/ }
        drawerBtn.setOnClickListener { /*TODO*/ }
        comboBtn.setOnClickListener { /*TODO*/ }
    }

}
