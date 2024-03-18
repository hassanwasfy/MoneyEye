package com.abaferas.moneyeye.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.abaferas.moneyeye.ui.screen.home.addHomeScreenRoute




@Composable
fun MoneyEyeNavGraph() {
    NavHost(
        navController = LocalNavController.current,
        startDestination = Screens.Home.route
    ) {
        addHomeScreenRoute()
    }
}

