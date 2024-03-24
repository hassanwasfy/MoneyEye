package com.abaferas.moneyeye.ui.screen.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ScreenHome(){
    Text(text = "Home")
}


@Preview(
    name = "home",
    device = "id:pixel_7_pro",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ScreenHomePreview() {
    ScreenHome()
}