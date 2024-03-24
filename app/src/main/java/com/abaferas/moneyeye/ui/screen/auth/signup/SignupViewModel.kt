package com.abaferas.moneyeye.ui.screen.auth.signup

import androidx.lifecycle.SavedStateHandle
import com.abaferas.moneyeye.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SignupViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
) : BaseViewModel<SignupUiState, SignupUiEffect>(SignupUiState()), SignupInteraction {

    private val args: SignupArgs = SignupArgs(savedStateHandle = savedStateHandle)

    init {

    }


}