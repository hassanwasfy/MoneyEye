package com.abaferas.moneyeye.ui.screen.auth.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.moneyeye.domain.utils.Constants
import com.abaferas.moneyeye.ui.composables.EyeText
import com.abaferas.moneyeye.ui.composables.EyeTextField

@Composable
fun ScreenSignup(
    screenSignupViewModel: SignupViewModel = hiltViewModel()
) {
    val state by screenSignupViewModel.state.collectAsState()
    ScreenSignupContent(
        state = state,
        interaction = screenSignupViewModel
    )
}

@Composable
fun ScreenSignupContent(
    state: SignupUiState,
    interaction: SignupInteraction
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EyeText(
            modifier = Modifier,
            text = "Welcome!",
            textAlign = TextAlign.Center,
            fontSize = 20,
            fontWeight = FontWeight.Bold,
            color = Color.Green,
        )
        EyeText(
            modifier = Modifier,
            text = "Register your account",
            textAlign = TextAlign.Center,
            fontSize = 18,
            fontWeight = FontWeight.Medium,
            color = Color.Green,
        )
        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = state.firstName.value,
            onValueChange = interaction::onFirstNameChange,
            label = Constants.LABEL_FIRST_NAME,
            isError = state.firstName.error.isError,
            errMessage = state.firstName.error.message,
            action = ImeAction.Next
        )

        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = state.lastName.value,
            onValueChange = interaction::onLastNameChange,
            label = Constants.LABEL_LAST_NAME,
            isError = state.lastName.error.isError,
            errMessage = state.lastName.error.message,
            action = ImeAction.Next
        )

        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = state.email.value,
            onValueChange = interaction::onEmailChange,
            label = Constants.LABEL_EMAIL,
            isError = state.email.error.isError,
            errMessage = state.email.error.message,
            action = ImeAction.Next
        )

        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = state.password.value,
            onValueChange = interaction::onPasswordChange,
            label = Constants.LABEL_PASSWORD,
            isError = state.password.error.isError,
            errMessage = state.password.error.message,
            action = ImeAction.Next
        )

        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = state.passwordConfirm.value,
            onValueChange = interaction::onPasswordConfirmChange,
            label = Constants.LABEL_PASSWORD_CONFIRM,
            isError = state.passwordConfirm.error.isError,
            errMessage = state.passwordConfirm.error.message,
            action = ImeAction.Done
        )
    }
}


@Preview(
    name = "home",
    device = "id:pixel_7_pro",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ScreenSignupPreview() {
    ScreenSignup()
}