package com.halilkrkn.grocery_shop_ui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.halilkrkn.grocery_shop_ui.R

val nunitoFamily = FontFamily(
    Font(R.font.nunito_light, FontWeight.Light),
    Font(R.font.nunito_regular, FontWeight.Normal),
    Font(R.font.nunito_bold, FontWeight.Bold)
)

private val defaultTypography = Typography()
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = nunitoFamily),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = nunitoFamily),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = nunitoFamily),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = nunitoFamily),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = nunitoFamily),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = nunitoFamily),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = nunitoFamily),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = nunitoFamily),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = nunitoFamily),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = nunitoFamily),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = nunitoFamily),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = nunitoFamily),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = nunitoFamily),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = nunitoFamily),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = nunitoFamily)
)

