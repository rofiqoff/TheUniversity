package com.rofiqoff.theuniversity.common.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.rofiqoff.theuniversity.R

private val RalewayFonts = FontFamily(
    Font(R.font.raleway_regular, weight = FontWeight.Normal),
    Font(R.font.raleway_medium, weight = FontWeight.Medium),
    Font(R.font.raleway_semi_bold, weight = FontWeight.SemiBold),
    Font(R.font.raleway_bold, weight = FontWeight.Bold),
)

val DarkTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 1.25.sp,
    ),
)

val LightTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        letterSpacing = 0.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = RalewayFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        letterSpacing = 1.25.sp,
    ),
)
