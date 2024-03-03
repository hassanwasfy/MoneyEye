package com.abaferas.moneyeye.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost


@Composable
fun MoneyEyeNavGraph() {
    NavHost(
        navController = LocalNavController.current,
        startDestination = ""
    ) {

    }
}