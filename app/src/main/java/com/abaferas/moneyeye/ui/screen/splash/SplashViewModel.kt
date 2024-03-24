package com.abaferas.moneyeye.ui.screen.splash

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.abaferas.moneyeye.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SplashViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
) : BaseViewModel<SplashUiState, SplashUiEffect>(SplashUiState()), SplashInteraction {

    private val args: SplashArgs = SplashArgs(savedStateHandle = savedStateHandle)

    init {
        viewModelScope.launch {
            delay(300)
            sendUiEffect(SplashUiEffect.NavToLogin)
        }
    }

}