package com.app.mvvmcustomview.custom

import com.app.mvvmcustomview.mvvm.MvvmCustomViewState
import kotlinx.parcelize.Parcelize

//Имплементация сущности которую будем сохранять
@Parcelize
data class CustomViewState(val hexCode: String?) : MvvmCustomViewState
