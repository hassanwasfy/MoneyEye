package com.abaferas.moneyeye.ui.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun EyeTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isError: Boolean,
    errMessage: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    action: ImeAction = ImeAction.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        label = {
            Text(text = label)
        },
        supportingText = {
            AnimatedVisibility(
                visible = isError,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Text(text = errMessage)
            }
        },
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = action
        ),
        isError = isError,
        visualTransformation = visualTransformation
    )
}