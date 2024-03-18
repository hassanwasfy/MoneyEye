package com.abaferas.moneyeye.ui.navigation

sealed class Screens(val route: String) {
    data object Home: Screens("home")
}