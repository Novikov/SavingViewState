package com.app.mvvmcustomview.mvvm

import android.os.Parcelable
import com.app.mvvmcustomview.mvvm.MvvmCustomViewState
import kotlinx.parcelize.Parcelize

@Parcelize
class MvvmCustomViewStateWrapper(val superState: Parcelable?, val state: MvvmCustomViewState?) :
    Parcelable
