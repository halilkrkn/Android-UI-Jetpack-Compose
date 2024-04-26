package com.halilkrkn.lifegoalsapp_ui.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val LightColorScheme = lightColorScheme(
    primary = Cyan,
    secondary = Cyan,
    tertiary = Cyan
)

@Composable
fun LifeGoalsApp_UITheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}