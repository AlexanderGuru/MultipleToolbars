package com.ag.navigationcomponentsample.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ag.navigationcomponentsample.R
import com.ag.navigationcomponentsample.activities.MultipleToolbarBottomActivity
import com.ag.navigationcomponentsample.models.IterationFragmentArgs
import com.ag.navigationcomponentsample.navigation.setupToolbar
import com.ag.navigationcomponentsample.utils.defAnim
import com.ag.navigationcomponentsample.utils.getThemeColorPrimary
import com.ag.navigationcomponentsample.utils.initArguments
import com.ag.navigationcomponentsample.utils.navigate
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

//    override fun onStart() {
//        super.onStart()
//        (requireActivity() as MultipleToolbarBottomActivity).setBottomColor(
//            getThemeColorPrimary(
//                requireView().context
//            )
//        )
//    }

}