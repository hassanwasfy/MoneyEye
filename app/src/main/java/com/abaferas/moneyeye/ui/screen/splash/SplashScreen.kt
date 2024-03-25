package com.abaferas.moneyeye.ui.screen.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.moneyeye.ui.navigation.NavigationHandler
import com.abaferas.moneyeye.ui.screen.auth.signup.navigateToSignup
import com.abaferas.moneyeye.ui.screen.home.navigateToHome
import com.abaferas.moneyeye.ui.theme.Purple40

@Composable
fun ScreenSplash(
    screenSplashViewModel: SplashViewModel = hiltViewModel()
) {

    Column(
        modifier = Modifier
            .background(Purple40)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            color = Color.White,
            trackColor = Purple40
        )
    }

    NavigationHandler(effects = screenSplashViewModel.effect) { effect, navController ->
        when (effect) {
            is SplashUiEffect.NavToHome -> {
                navController.navigateToHome()
            }

            is SplashUiEffect.NavToSignup -> {
                navController.navigateToSignup()
            }
        }

    }
}