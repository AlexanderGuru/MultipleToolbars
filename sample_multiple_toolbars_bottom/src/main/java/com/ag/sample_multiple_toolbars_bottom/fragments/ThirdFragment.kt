package com.ag.sample_multiple_toolbars_bottom.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.multiple_toolbars.setupToolbar
import com.ag.sample_multiple_toolbars_bottom.R
import com.ag.sample_multiple_toolbars_bottom.app.BottomActivity
import com.ag.sample_multiple_toolbars_bottom.models.IterationFragmentArgs
import com.ag.sample_multiple_toolbars_bottom.utils.defAnim
import com.ag.sample_multiple_toolbars_bottom.utils.getThemeColorPrimary
import com.ag.sample_multiple_toolbars_bottom.utils.navigate
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment(R.layout.fragment_third) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar)

        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                IterationFragmentArgs(R.style.ThirdFragmentTheme, 1),
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