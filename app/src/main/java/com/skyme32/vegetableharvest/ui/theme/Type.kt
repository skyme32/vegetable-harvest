package com.skyme32.vegetableharvest.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

/*
val FarmFont = FontFamily(
    Font(R.font.farm_house_fs,FontWeight.Normal)
)

val Typography = Typography(
    bodySmall = TextStyle(
        fontFamily = FarmFont,
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FarmFont,
        fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FarmFont,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 19.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FarmFont,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 21.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FarmFont,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FarmFont,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 15.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FarmFont,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 14.sp
    )
)
*/