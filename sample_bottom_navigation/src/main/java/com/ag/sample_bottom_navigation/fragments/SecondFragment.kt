package com.ag.sample_bottom_navigation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.multiple_toolbars.setupToolbar
import com.ag.sample_bottom_navigation.R
import com.ag.sample_bottom_navigation.app.BottomActivity
import com.ag.sample_bottom_navigation.models.IterationFragmentArgs
import com.ag.sample_bottom_navigation.utils.defAnim
import com.ag.sample_bottom_navigation.utils.getThemeColorPrimary
import com.ag.sample_bottom_navigation.utils.navigate
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar)

        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                IterationFragmentArgs(R.style.SecondFragmentTheme, 1),
                defAnim
            )
        }
    }

    override fun onStart() {
        super.onStart()
        (requireActivity() as BottomActivity).setBottomColor(
            getThemeColorPrimary(
                requireView().context
            )
        )
    }
}