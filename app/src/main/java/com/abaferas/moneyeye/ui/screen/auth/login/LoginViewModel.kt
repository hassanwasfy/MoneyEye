package com.abaferas.moneyeye.ui.screen.auth.login

import androidx.lifecycle.SavedStateHandle
import com.abaferas.moneyeye.domain.utils.Constants
import com.abaferas.moneyeye.ui.base.BaseViewModel
import com.abaferas.moneyeye.ui.base.ErrorUiState
import com.abaferas.moneyeye.ui.base.TextFieldEntry
import com.abaferas.moneyeye.ui.util.EntryValidator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
) : BaseViewModel<LoginUiState, LoginUiEffect>(LoginUiState()), LoginInteraction {

    private val args: LoginArgs = LoginArgs(savedStateHandle = savedStateHandle)
    private val validator = EntryValidator()

    init {

    }

    override fun onEmailValueChange(value: String) {
        if (validator.validateEmail(value)) {
            iState.update {
                it.copy(
                    email = TextFieldEntry(value = value)
                )
            }
        } else {
            iState.update {
                it.copy(
                    email = TextFieldEntry(
                        value = "",
                        error = ErrorUiState(isError = true, Constants.MESSAGE_INVALID_INPUT)
                    )
                )
            }
        }
    }

    override fun onPasswordValueChange(value: String) {
        if (validator.validatePassword(value)) {
            iState.update {
                it.copy(
                    password = TextFieldEntry(
                        value = value
                    )
                )
            }
        } else {
            iState.update {
                it.copy(
                    password = TextFieldEntry(
                        value = "",
                        error = ErrorUiState(
                            isError = true,
                            Constants.MESSAGE_INVALID_INPUT
                        )
                    )
                )
            }
        }
    }
}