package com.ag.sample_multiple_toolbars_drawer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.multiple_toolbars.setupToolbar
import com.ag.sample_multiple_toolbars_drawer.R
import com.ag.sample_multiple_toolbars_drawer.models.IterationFragmentArgs
import com.ag.sample_multiple_toolbars_drawer.utils.defAnim
import com.ag.sample_multiple_toolbars_drawer.utils.initArguments
import com.ag.sample_multiple_toolbars_drawer.utils.navigate
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
        setupToolbar(toolbar)

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