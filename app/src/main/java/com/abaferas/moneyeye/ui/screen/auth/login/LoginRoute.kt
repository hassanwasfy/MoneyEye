package com.abaferas.moneyeye.ui.screen.auth.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abaferas.moneyeye.ui.navigation.Screens

fun NavGraphBuilder.addLoginScreenRoute() {
    composable(Screens.Login.route) { ScreenLogin() }
}

fun NavController.navigateToLogin() {
    navigate(Screens.Login.route)
}