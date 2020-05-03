package com.ag.sample_drawer_navigation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.multiple_toolbars.setupToolbar
import com.ag.sample_drawer_navigation.R
import com.ag.sample_drawer_navigation.app.DrawerActivity
import com.ag.sample_drawer_navigation.models.IterationFragmentArgs
import com.ag.sample_drawer_navigation.utils.defAnim
import com.ag.sample_drawer_navigation.utils.navigate
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar, (requireActivity() as DrawerActivity).getDrawerLayout())

        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                IterationFragmentArgs(R.style.FirstFragmentTheme, 0),
                defAnim
            )
        }
    }

}
