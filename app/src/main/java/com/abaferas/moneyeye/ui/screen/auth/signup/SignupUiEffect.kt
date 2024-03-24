package com.abaferas.moneyeye.ui.screen.auth.signup

sealed class SignupUiEffect : BaseUiEffect {
    data object NavigateUp : SignupUiEffect()
}