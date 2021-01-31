package com.github.sasakitomohiro.listcomposesample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    private val _navigateState = MutableLiveData<ScreenType>()
    val navigateState: LiveData<ScreenType>
        get() = _navigateState

    fun navigate(screenType: ScreenType) {
        _navigateState.value = screenType
    }
}
