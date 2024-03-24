package com.abaferas.moneyeye.ui.screen.auth.signup

import com.abaferas.moneyeye.ui.base.BaseUiState
import com.abaferas.moneyeye.ui.base.ErrorUiState
import com.abaferas.moneyeye.ui.base.TextFieldEntry

data class SignupUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState(),
    val firstName: TextFieldEntry = TextFieldEntry(),
    val lastName: TextFieldEntry = TextFieldEntry(),
    val email: TextFieldEntry = TextFieldEntry(),
    val password: TextFieldEntry = TextFieldEntry(),
    val passwordConfirm: TextFieldEntry = TextFieldEntry(),
    val synced: Boolean = false,
) : BaseUiState