package com.abaferas.moneyeye.ui.screen.auth.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ScreenLogin(
    screenLoginViewModel: LoginViewModel = hiltViewModel()
) {

}

@Composable
fun ScreenLoginContent(
    state: LoginUiState,
    interaction: LoginInteraction
) {

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