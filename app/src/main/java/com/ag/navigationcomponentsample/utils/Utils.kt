package com.ag.navigationcomponentsample.utils

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.util.TypedValue
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.ag.navigationcomponentsample.R


fun getThemeColorPrimary(context: Context): Int {
    val value = TypedValue()
    context.theme.resolveAttribute(R.attr.colorPrimary, value, true)
    return value.data
}

val defAnim = NavOptions.Builder()
    .setEnterAnim(R.anim.slide_in_right)
    .setExitAnim(R.anim.slide_out_left)
    .setPopEnterAnim(R.anim.slide_in_left)
    .setPopExitAnim(R.anim.slide_out_right)
    .build()


fun NavController.navigate(@IdRes resId: Int, obj: Parcelable, navOptions: NavOptions) {
    val bundle = Bundle()
    bundle.putParcelable(obj::class.simpleName, obj)
    navigate(resId, bundle, navOptions)
}

fun <T : Parcelable?> Fragment.initArguments(clazz: Class<T>, method: () -> Unit): T? {
    return arguments?.getParcelable<T>(clazz.simpleName) ?: method.invoke().let { null }
}