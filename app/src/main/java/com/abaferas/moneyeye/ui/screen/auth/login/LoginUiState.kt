package com.abaferas.moneyeye.ui.screen.auth.login

import com.abaferas.moneyeye.ui.base.BaseUiState
import com.abaferas.moneyeye.ui.base.ErrorUiState
import com.abaferas.moneyeye.ui.base.TextFieldEntry

data class LoginUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState(),
    val email: TextFieldEntry = TextFieldEntry(),
    val password: TextFieldEntry = TextFieldEntry(),
    val synced: Boolean = false,
) : BaseUiState