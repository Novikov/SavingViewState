package com.app.mvvmcustomview.mvvm

interface MvvmCustomViewModel<T : MvvmCustomViewState> {
    var state: T?
}
