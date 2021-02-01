package com.github.sasakitomohiro.listcomposesample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    private val _currentScreenType = MutableLiveData(ScreenType.VERTICAL)
    val currentScreenType: LiveData<ScreenType> = _currentScreenType

    fun navigate(screenType: ScreenType) {
        _currentScreenType.value = screenType
    }
}
