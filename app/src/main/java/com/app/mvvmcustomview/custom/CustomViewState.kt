package com.app.mvvmcustomview.custom

import com.app.mvvmcustomview.mvvm.MvvmCustomViewState
import kotlinx.parcelize.Parcelize

@Parcelize
data class CustomViewState(val hexCode: String?) : MvvmCustomViewState
