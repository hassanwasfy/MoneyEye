package com.abaferas.moneyeye.ui.screen.auth.login

import com.abaferas.moneyeye.ui.base.BaseUiState
import com.abaferas.moneyeye.ui.base.ErrorUiState

data class LoginUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState()
) : BaseUiState