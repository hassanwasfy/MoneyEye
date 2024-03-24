package com.abaferas.moneyeye.ui.screen.splash

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abaferas.moneyeye.ui.navigation.Screens

fun NavGraphBuilder.addSplashScreenRoute() {
    composable(Screens.Splash.route) { ScreenSplash() }
}

fun NavController.navigateToSplash() {
    navigate(Screens.Splash.route)
}