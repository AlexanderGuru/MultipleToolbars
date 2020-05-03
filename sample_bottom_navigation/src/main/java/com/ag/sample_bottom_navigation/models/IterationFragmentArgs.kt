package com.ag.sample_bottom_navigation.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IterationFragmentArgs(
    val themeRes: Int,
    val numberIteration: Int
) : Parcelable