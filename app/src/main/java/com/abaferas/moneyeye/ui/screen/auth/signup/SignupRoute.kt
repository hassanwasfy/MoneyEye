package com.abaferas.moneyeye.ui.screen.auth.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abaferas.moneyeye.ui.navigation.Screens

fun NavGraphBuilder.addSignupScreenRoute() {
    composable(Screens.Signup.route) { ScreenSignup() }
}

fun NavController.navigateToSignup() {
    navigate(Screens.Signup.route)
}