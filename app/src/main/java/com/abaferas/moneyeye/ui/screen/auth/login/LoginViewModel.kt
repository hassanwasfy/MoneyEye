package com.abaferas.moneyeye.ui.screen.auth.login

import androidx.lifecycle.SavedStateHandle
import com.abaferas.moneyeye.domain.utils.Constants
import com.abaferas.moneyeye.domain.utils.EntryValidator
import com.abaferas.moneyeye.ui.base.BaseViewModel
import com.abaferas.moneyeye.ui.base.ErrorUiState
import com.abaferas.moneyeye.ui.base.TextFieldEntry
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
        iState.update {
            it.copy(
                email = TextFieldEntry(value = value)
            )
        }
    }

    override fun onPasswordValueChange(value: String) {
        iState.update {
            it.copy(
                password = TextFieldEntry(
                    value = value
                )
            )
        }
    }

    override fun onLoginClick() {
        val email = validator.validateEmail(state.value.email.value)
        val pass = validator.validatePassword(state.value.password.value)

        if (!email) {
            iState.update {
                it.copy(
                    email = TextFieldEntry(
                        value = state.value.email.value,
                        error = ErrorUiState(
                            true,
                            Constants.MESSAGE_INVALID_EMAIL
                        )
                    )
                )
            }
        }
        if (!pass) {
            iState.update {
                it.copy(
                    password = TextFieldEntry(
                        value = state.value.password.value,
                        error = ErrorUiState(
                            true,
                            Constants.MESSAGE_INVALID_PASSWORD
                        )
                    )
                )
            }
        }

        if (email && pass) {
            tryToExecute(
                onSuccess = { result ->

                },
                onError = { error ->

                },
                execute = {

                }
            )
        }
    }
}