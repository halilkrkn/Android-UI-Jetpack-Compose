package com.halilkrkn.lifegoalsapp_ui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.halilkrkn.lifegoalsapp_ui.R

val Poppins = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

private val defaultTypography = Typography()

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = Poppins),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = Poppins),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = Poppins),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = Poppins),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = Poppins),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = Poppins),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = Poppins),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = Poppins),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = Poppins),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = Poppins),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = Poppins),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = Poppins),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = Poppins),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = Poppins),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = Poppins)
)