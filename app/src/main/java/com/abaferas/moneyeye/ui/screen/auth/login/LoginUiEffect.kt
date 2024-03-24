package com.abaferas.moneyeye.ui.screen.auth.login

import com.abaferas.moneyeye.ui.base.BaseUiEffect

sealed class LoginUiEffect : BaseUiEffect {
    data object NavigateUp : LoginUiEffect()
}