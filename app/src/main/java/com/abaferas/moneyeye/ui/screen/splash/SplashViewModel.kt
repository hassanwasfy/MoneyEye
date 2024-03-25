package com.abaferas.moneyeye.ui.screen.splash

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import com.abaferas.moneyeye.domain.usecase.user.UserUseCase
import com.abaferas.moneyeye.domain.utils.Constants
import com.abaferas.moneyeye.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SplashViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val userUseCase: UserUseCase
) : BaseViewModel<SplashUiState, SplashUiEffect>(SplashUiState()), SplashInteraction {

    private val args: SplashArgs = SplashArgs(savedStateHandle = savedStateHandle)

    init {
        tryToExecute(
            onSuccess = ::onSuccess,
            onError = ::onError,
            execute = {
                Log.w(Constants.LOG_TAG, userUseCase.getLoginState().toString())
                userUseCase.getLoginState()
            }
        )
    }

    private fun onSuccess(state: Boolean) {
        if (state) {
            sendUiEffect(SplashUiEffect.NavToHome)
        } else {
            sendUiEffect(SplashUiEffect.NavToSignup)
        }
    }

    private fun onError(msg: String) {
        sendUiEffect(SplashUiEffect.NavToSignup)
    }

}