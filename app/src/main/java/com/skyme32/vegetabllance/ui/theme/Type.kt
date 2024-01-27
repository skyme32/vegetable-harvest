package com.skyme32.vegetabllance.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import com.skyme32.vegetabllance.R

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

/*
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    // Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
*/