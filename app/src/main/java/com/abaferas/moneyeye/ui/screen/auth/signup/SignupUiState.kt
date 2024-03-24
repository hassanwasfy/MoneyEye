package com.abaferas.moneyeye.ui.screen.auth.signup

import com.abaferas.moneyeye.ui.base.BaseUiState
import com.abaferas.moneyeye.ui.base.ErrorUiState

data class SignupUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState()
) : BaseUiState