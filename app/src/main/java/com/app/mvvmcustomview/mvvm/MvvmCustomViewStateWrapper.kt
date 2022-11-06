package com.app.mvvmcustomview.mvvm

import android.os.Parcelable
import com.app.mvvmcustomview.mvvm.MvvmCustomViewState
import kotlinx.parcelize.Parcelize

//Обертка используемая для сохранения состояния
@Parcelize
class MvvmCustomViewStateWrapper(val superState: Parcelable?, val state: MvvmCustomViewState?) :
    Parcelable
