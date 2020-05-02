package com.ag.navigationcomponentsample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.navigation.setupToolbar
import kotlinx.android.synthetic.main.fragment_iteration.*

class IterationFragment : Fragment(R.layout.fragment_iteration) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar)

        val options = NavOptions.Builder()
            .setEnterAnim(R.anim.slide_in_right)
            .setExitAnim(R.anim.slide_out_left)
            .setPopEnterAnim(R.anim.slide_in_left)
            .setPopExitAnim(R.anim.slide_out_right)
            .build()


        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                null,
                options
            )
        }
    }

}