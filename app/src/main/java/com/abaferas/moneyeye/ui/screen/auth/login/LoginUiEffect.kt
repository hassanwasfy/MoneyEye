package com.abaferas.moneyeye.ui.screen.auth.login

sealed class LoginUiEffect : BaseUiEffect {
    data object NavigateUp : LoginUiEffect()
}