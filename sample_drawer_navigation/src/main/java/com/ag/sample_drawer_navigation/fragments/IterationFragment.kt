package com.ag.sample_drawer_navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.multiple_toolbars.setupToolbar
import com.ag.sample_drawer_navigation.R
import com.ag.sample_drawer_navigation.app.DrawerActivity
import com.ag.sample_drawer_navigation.models.IterationFragmentArgs
import com.ag.sample_drawer_navigation.utils.defAnim
import com.ag.sample_drawer_navigation.utils.initArguments
import com.ag.sample_drawer_navigation.utils.navigate
import kotlinx.android.synthetic.main.fragment_iteration.*

class IterationFragment : Fragment(R.layout.fragment_iteration) {

    private val args by lazy {
        initArguments(IterationFragmentArgs::class.java) {}
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().setTheme(args!!.themeRes)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar(toolbar, (requireActivity() as DrawerActivity).getDrawerLayout())

        iterationText.text = args!!.numberIteration.toString()

        btn.setOnClickListener {
            findNavController().navigate(
                R.id.iterationFragment,
                IterationFragmentArgs(args!!.themeRes, args!!.numberIteration + 1),
                defAnim
            )
        }
    }
}