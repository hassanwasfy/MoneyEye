package com.abaferas.moneyeye.ui.base


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout

abstract class BaseViewModel<UiState : BaseUiState, UiEffect>(state: UiState) : ViewModel() {
    protected val iState = MutableStateFlow(state)
    val state = iState.asStateFlow()

    private val iEffect = MutableSharedFlow<UiEffect>()
    val effect = iEffect.asSharedFlow()

    fun <T> tryToExecute(
        onSuccess: (T) -> Unit = {},
        onError: (errorMsg: String) -> Unit,
        dispatcher: CoroutineDispatcher = Dispatchers.IO,
        execute: suspend () -> T,
    ) {
        viewModelScope.launch(dispatcher) {
            try {
                withTimeout(5000) {
                    val result = execute()
                    onSuccess(result)
                }
            } catch (e: TimeoutCancellationException) {
                onError(e.message.toString())
            } catch (e: NoSuchElementException) {
                onError(e.message.toString())
            }
        }
    }

    protected fun sendUiEffect(uiEffect: UiEffect) {
        viewModelScope.launch(Dispatchers.IO) {
            iEffect.emit(uiEffect)
        }
    }
}