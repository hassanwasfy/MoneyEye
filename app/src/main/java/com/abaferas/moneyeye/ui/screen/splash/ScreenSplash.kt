package com.abaferas.moneyeye.ui.screen.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ScreenSplash() {

    Text(
        text = "Splash Screen", modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center
    )

}


@Preview(
    name = "home",
    device = "id:pixel_7_pro",
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ScreenSplashPreview() {
    ScreenSplash()
}