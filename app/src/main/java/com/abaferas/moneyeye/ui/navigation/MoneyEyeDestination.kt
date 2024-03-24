package com.abaferas.moneyeye.ui.navigation

sealed class Screens(val route: String) {
    data object Home: Screens("home")
    data object Splash : Screens("splash")
    data object Settings : Screens("settings")
    data object Login : Screens("login")
    data object Signup : Screens("Signup")
}