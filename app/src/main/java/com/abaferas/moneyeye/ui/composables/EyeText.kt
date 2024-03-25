package com.abaferas.moneyeye.ui.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun EyeText(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Center,
    fontSize: Int = 14,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color.Black,
) {
    Text(
        modifier = modifier,
        text = text,
        textAlign = textAlign,
        fontSize = fontSize.sp,
        fontWeight = fontWeight,
        color = color,
    )
}