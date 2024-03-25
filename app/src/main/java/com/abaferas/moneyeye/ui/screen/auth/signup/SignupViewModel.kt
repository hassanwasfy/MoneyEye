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

    override fun onFirstNameChange(value: String) {
        TODO("Not yet implemented")
    }

    override fun onLastNameChange(value: String) {
        TODO("Not yet implemented")
    }

    override fun onEmailChange(value: String) {
        TODO("Not yet implemented")
    }

    override fun onPasswordChange(value: String) {
        TODO("Not yet implemented")
    }

    override fun onPasswordConfirmChange(value: String) {
        TODO("Not yet implemented")
    }

    override fun onSignupClick() {
        TODO("Not yet implemented")
    }

    override fun onLoginClick() {
        TODO("Not yet implemented")
    }

    override fun onAnonymousLoginClick() {
        TODO("Not yet implemented")
    }
}