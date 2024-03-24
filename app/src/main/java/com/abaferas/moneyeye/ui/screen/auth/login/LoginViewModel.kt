package com.abaferas.moneyeye.ui.screen.auth.login

import androidx.lifecycle.SavedStateHandle
import com.abaferas.moneyeye.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
) : BaseViewModel<LoginUiState, LoginUiEffect>(LoginUiState()), LoginInteraction {

    private val args: LoginArgs = LoginArgs(savedStateHandle = savedStateHandle)

    init {

    }

}