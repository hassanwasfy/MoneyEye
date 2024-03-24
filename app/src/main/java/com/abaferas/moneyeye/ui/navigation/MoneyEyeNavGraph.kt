package com.abaferas.moneyeye.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.abaferas.moneyeye.ui.screen.auth.login.addLoginScreenRoute
import com.abaferas.moneyeye.ui.screen.auth.signup.addSignupScreenRoute
import com.abaferas.moneyeye.ui.screen.home.addHomeScreenRoute
import com.abaferas.moneyeye.ui.screen.splash.addSplashScreenRoute


@Composable
fun MoneyEyeNavGraph() {
    NavHost(
        navController = LocalNavController.current,
        startDestination = Screens.Splash.route
    ) {
        addSplashScreenRoute()
        addSignupScreenRoute()
        addLoginScreenRoute()
        addHomeScreenRoute()
    }
}

