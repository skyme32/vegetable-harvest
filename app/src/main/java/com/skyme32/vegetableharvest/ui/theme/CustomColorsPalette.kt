package com.skyme32.vegetableharvest.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColorsPalette(
    val extraColor1: Color = Color.Unspecified,
    val extraColor2: Color = Color.Unspecified,
    val extraColor3: Color = Color.Unspecified,
    val extraColor4: Color = Color.Unspecified
)

val LightExtraColor1 = Green200
val LightExtraColor2 = Green500
val LightExtraColor3 = Gray200
val LightExtraColor4 = Color.Gray

val DarkExtraColor1 = Green500
val DarkExtraColor2 = Green200
val DarkExtraColor3 = Color.Gray
val DarkExtraColor4 = Gray200

val LightCustomColorsPalette = CustomColorsPalette(
    extraColor1 = LightExtraColor1,
    extraColor2 = LightExtraColor2,
    extraColor3 = LightExtraColor3,
    extraColor4 = LightExtraColor4
)

val DarkCustomColorsPalette = CustomColorsPalette(
    extraColor1 = DarkExtraColor1,
    extraColor2 = DarkExtraColor2,
    extraColor3 = DarkExtraColor3,
    extraColor4 = DarkExtraColor4
)

val LocalCustomColorsPalette = staticCompositionLocalOf { CustomColorsPalette() }