package com.abaferas.moneyeye.ui.screen.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abaferas.moneyeye.ui.navigation.Screens


fun NavGraphBuilder.addHomeScreenRoute(){
    composable(Screens.Home.route){ ScreenHome() }
}

fun NavController.navigateToHome(){
    navigate(Screens.Home.route)
}