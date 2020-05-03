package com.ag.navigationcomponentsample.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.activities.MultipleToolbarBottomActivity
import com.ag.navigationcomponentsample.models.IterationFragmentArgs
import com.ag.navigationcomponentsample.navigation.setupToolbar
import com.ag.navigationcomponentsample.utils.defAnim
import com.ag.navigationcomponentsample.utils.getThemeColorPrimary
import com.ag.navigationcomponentsample.utils.navigate
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar)

        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                IterationFragmentArgs(R.style.SecondFragmentTheme, 0),
                defAnim
            )
        }
    }

    override fun onStart() {
        super.onStart()
        (requireActivity() as MultipleToolbarBottomActivity).setBottomColor(
            getThemeColorPrimary(
                requireView().context
            )
        )
    }
}