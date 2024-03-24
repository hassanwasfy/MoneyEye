package com.abaferas.moneyeye.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.abaferas.moneyeye.ui.screen.home.addHomeScreenRoute
import com.abaferas.moneyeye.ui.screen.splash.addSplashScreenRoute


@Composable
fun MoneyEyeNavGraph() {
    NavHost(
        navController = LocalNavController.current,
        startDestination = Screens.Splash.route
    ) {
        addSplashScreenRoute()
        addHomeScreenRoute()
    }
}

