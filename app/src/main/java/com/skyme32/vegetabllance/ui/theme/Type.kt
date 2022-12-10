package com.skyme32.vegetabllance.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.skyme32.vegetabllance.R

val FarmFont = FontFamily(
    Font(R.font.farm_house_fs,FontWeight.Normal)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FarmFont,
        fontWeight = FontWeight.Normal,
        fontSize = 21.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)