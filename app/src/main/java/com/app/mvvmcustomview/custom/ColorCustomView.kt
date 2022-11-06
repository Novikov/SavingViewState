package com.app.mvvmcustomview.custom

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.LifecycleOwner
import com.app.mvvmcustomview.R
import com.app.mvvmcustomview.databinding.ColorCustomViewBinding
import com.app.mvvmcustomview.mvvm.MvvmLinearLayout

class ColorCustomView(
    context: Context,
    attrs: AttributeSet
) : MvvmLinearLayout<CustomViewState, CustomViewModel>(context, attrs) {

    val binding = ColorCustomViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        View.inflate(context, R.layout.color_custom_view, this)
        binding.redButton.setOnClickListener { viewModel.onRedButtonClick() }
        binding.blueButton.setOnClickListener { viewModel.onBlueButtonClick() }
    }

    override val viewModel = CustomViewModel()

    override fun onLifecycleOwnerAttached(lifecycleOwner: LifecycleOwner) {
        observeLiveData(lifecycleOwner)
    }

    private fun observeLiveData(lifecycleOwner: LifecycleOwner) {
        viewModel.getLiveData().observe(
            lifecycleOwner
        ) { color ->
            color?.let { setBackgroundColor(Color.parseColor(it)) }
        }
    }
}
