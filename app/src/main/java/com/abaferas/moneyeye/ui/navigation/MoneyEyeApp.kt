package com.abaferas.moneyeye.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abaferas.moneyeye.ui.theme.Purple40
import com.google.accompanist.systemuicontroller.rememberSystemUiController


val LocalNavController = compositionLocalOf<NavHostController> { error("No NavController found!") }

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MoneyEyeApp() {
    val navController = rememberNavController()
    CompositionLocalProvider(LocalNavController provides navController) {
        Scaffold {
            val sys = rememberSystemUiController()
            sys.setStatusBarColor(Purple40, darkIcons = false)
            sys.setNavigationBarColor(Purple40, darkIcons = false)
            MoneyEyeNavGraph()
        }
    }
}