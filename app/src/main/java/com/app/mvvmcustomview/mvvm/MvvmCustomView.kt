package com.app.mvvmcustomview.mvvm

import androidx.lifecycle.LifecycleOwner

interface MvvmCustomView<V : MvvmCustomViewState, T : MvvmCustomViewModel<V>> {
    val viewModel: T

    fun onLifecycleOwnerAttached(lifecycleOwner: LifecycleOwner)
}
