package com.app.mvvmcustomview.mvvm

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.lifecycle.LifecycleOwner

// Базовый класс куда вытеснена общая логика для каждой view для которой необходимо сохранять состояние
abstract class MvvmLinearLayout<V : MvvmCustomViewState, T : MvvmCustomViewModel<V>>(
    context: Context,
    attributeSet: AttributeSet
) : LinearLayout(context, attributeSet), MvvmCustomView<V, T> {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val lifecycleOwner = context as? LifecycleOwner ?: throw LifecycleOwnerNotFoundException()
        onLifecycleOwnerAttached(lifecycleOwner)
    }

    // Сохранение состояния
    override fun onSaveInstanceState(): MvvmCustomViewStateWrapper {
        return MvvmCustomViewStateWrapper(super.onSaveInstanceState(), viewModel.state)
    }

    // Восстановление состояния
    @Suppress("UNCHECKED_CAST")
    override fun onRestoreInstanceState(state: Parcelable?) {
        if (state is MvvmCustomViewStateWrapper) {
            viewModel.state = state.state as V?
            super.onRestoreInstanceState(state.superState)
        }
    }
}
