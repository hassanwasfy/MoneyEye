package com.abaferas.moneyeye.ui.screen.auth.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.addSignupScreenRoute() {
    composable(Screens.Signup.route) { ScreenSignup() }
}

fun NavController.navigateToSignup() {
    navigate(Screens.Signup.route)
}