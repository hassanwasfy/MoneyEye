package com.abaferas.moneyeye.ui.screen.auth.signup

import com.abaferas.moneyeye.ui.base.BaseUiEffect

sealed class SignupUiEffect : BaseUiEffect {
    data object NavigateUp : SignupUiEffect()
}