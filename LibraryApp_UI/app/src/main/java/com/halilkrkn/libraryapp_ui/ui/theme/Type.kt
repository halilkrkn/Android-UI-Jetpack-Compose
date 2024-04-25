package com.halilkrkn.libraryapp_ui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.halilkrkn.libraryapp_ui.R

val PoppinsFamily = FontFamily(
    Font(R.font.poppins_regular),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)

val NewYorkFamily = FontFamily(
    Font(R.font.newyork),
)

private val defaultTypography = Typography()
// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = PoppinsFamily),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = PoppinsFamily),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = PoppinsFamily),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = PoppinsFamily),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = PoppinsFamily),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = PoppinsFamily),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = PoppinsFamily),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = PoppinsFamily),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = PoppinsFamily),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = PoppinsFamily),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = PoppinsFamily),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = PoppinsFamily),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = PoppinsFamily),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = PoppinsFamily),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = PoppinsFamily)

)