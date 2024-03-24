package com.abaferas.moneyeye.ui.screen.splash

import com.abaferas.moneyeye.ui.base.BaseUiEffect

sealed class SplashUiEffect : BaseUiEffect {
    data object NavToLogin : SplashUiEffect()
    data object NavToSignup : SplashUiEffect()
}