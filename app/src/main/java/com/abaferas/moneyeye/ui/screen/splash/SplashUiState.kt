package com.abaferas.moneyeye.ui.screen.splash

import com.abaferas.moneyeye.ui.base.BaseUiState
import com.abaferas.moneyeye.ui.base.ErrorUiState

data class SplashUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState()
) : BaseUiState