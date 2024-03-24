package com.abaferas.moneyeye.ui.screen.splash

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.moneyeye.ui.navigation.NavigationHandler
import com.abaferas.moneyeye.ui.screen.auth.login.navigateToLogin
import com.abaferas.moneyeye.ui.screen.auth.signup.navigateToSignup

@Composable
fun ScreenSplash(
    screenSplashViewModel: SplashViewModel = hiltViewModel()
) {
    NavigationHandler(effects = screenSplashViewModel.effect) { effect, navController ->
        when (effect) {
            is SplashUiEffect.NavToLogin -> {
                navController.navigateToLogin()
            }

            is SplashUiEffect.NavToSignup -> {
                navController.navigateToSignup()
            }
        }

    }
}

@Composable
fun ScreenSplashContent(
    state: SplashUiState,
    interaction: SplashInteraction
) {

}


@Preview(
    name = "home",
    device = "id:pixel_7_pro",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ScreenSplashPreview() {
    ScreenSplash()
}