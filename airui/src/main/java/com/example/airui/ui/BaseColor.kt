package com.example.airui.ui

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple = Color(0xFF673AB7)
val DarkPurple = Color(0xFF150A28)
val HoneyFlower = Color(0xFF591165)
val Black = Color(0xFF1D1D1D)
val White = Color(0xFFF4F4F4)

@Immutable
data class BaseColor(
    val primary: Color,
    val background: Color,
    val onBackground: Color,
)

val LightColorScheme = BaseColor(
    primary = Purple,
    background = White,
    onBackground = Black,
)

val DarkColorScheme = BaseColor(
    primary = HoneyFlower,
    background = Black,
    onBackground = White,
)

val SpaceColorScheme = BaseColor(
    primary = Purple,
    background = DarkPurple,
    onBackground = White,
)

val LocalBaseColorScheme = staticCompositionLocalOf { LightColorScheme }
val LocalLightColorScheme = staticCompositionLocalOf { LightColorScheme }
val LocalDarkColorScheme = staticCompositionLocalOf { DarkColorScheme }
val LocalSpaceColorScheme= staticCompositionLocalOf { SpaceColorScheme }