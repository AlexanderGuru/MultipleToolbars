package com.ag.sample_multiple_toolbars_bottom.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IterationFragmentArgs(
    val themeRes: Int,
    val numberIteration: Int
) : Parcelable