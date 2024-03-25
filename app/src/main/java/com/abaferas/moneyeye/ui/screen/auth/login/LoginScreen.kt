package com.abaferas.moneyeye.ui.screen.auth.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.moneyeye.domain.utils.Constants
import com.abaferas.moneyeye.ui.composables.EyeText
import com.abaferas.moneyeye.ui.composables.EyeTextField
import com.abaferas.moneyeye.ui.navigation.NavigationHandler

@Composable
fun ScreenLogin(
    screenLoginViewModel: LoginViewModel = hiltViewModel()
) {
    val state by screenLoginViewModel.state.collectAsState()
    NavigationHandler(effects = screenLoginViewModel.effect) { nav, effect ->
        when (effect) {

        }
    }

    ScreenLoginContent(state = state, interaction = screenLoginViewModel)
}

@Composable
fun ScreenLoginContent(
    state: LoginUiState,
    interaction: LoginInteraction
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        EyeText(
            modifier = Modifier,
            text = "Welcome back",
            textAlign = TextAlign.Center,
            fontSize = 20,
            fontWeight = FontWeight.Bold,
            color = Color.Green,
        )
        EyeText(
            modifier = Modifier,
            text = "Login to your account",
            textAlign = TextAlign.Center,
            fontSize = 18,
            fontWeight = FontWeight.Medium,
            color = Color.Green,
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.25f))
        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            value = state.email.value,
            onValueChange = interaction::onEmailValueChange,
            label = Constants.LABEL_EMAIL,
            isError = state.email.error.isError,
            errMessage = state.email.error.message,
            keyboardType = KeyboardType.Email,
            action = ImeAction.Next
        )
        EyeTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            value = state.password.value,
            onValueChange = interaction::onPasswordValueChange,
            label = Constants.LABEL_PASSWORD,
            isError = state.password.error.isError,
            errMessage = state.password.error.message,
            keyboardType = KeyboardType.Text,
            action = ImeAction.Done,
            visualTransformation = PasswordVisualTransformation()
        )

        Button(onClick = interaction::onLoginClick) {

        }
    }

}

@Preview(
    name = "home",
    device = "id:pixel_7_pro",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ScreenLoginPreview() {
    ScreenLogin()
}