package com.example.airui.ui

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class BaseDimension(
    val smallPadding: Dp = 8.dp,
    val mediumPadding: Dp = smallPadding.times(2),
    val largePadding: Dp = smallPadding.times(3),
    val smallIcon: Dp = 24.dp,
    val mediumIcon: Dp = 36.dp,
    val largeIcon: Dp = 48.dp,
)

val dimensionExtraSmall = BaseDimension(
    smallPadding = 2.dp,
    smallIcon = 6.dp,
    mediumIcon = 9.dp,
    largeIcon = 12.dp
)

val dimensionSmall = BaseDimension(
    smallPadding = 4.dp,
    smallIcon = 12.dp,
    mediumIcon = 18.dp,
    largeIcon = 24.dp
)

val dimensionMedium = BaseDimension(
    smallPadding = 8.dp,
    smallIcon = 12.dp,
    mediumIcon = 36.dp,
    largeIcon = 24.dp
)


val dimensionLarge = BaseDimension(
    smallPadding = 12.dp,
    smallIcon = 16.dp,
    mediumIcon = 50.dp,
    largeIcon = 36.dp
)


val LocalBaseDimension = staticCompositionLocalOf { dimensionSmall }
val LocalBaseDimensionExtraSmall = staticCompositionLocalOf { dimensionExtraSmall }
val LocalBaseDimensionSmall = staticCompositionLocalOf { dimensionSmall }
val LocalBaseDimensionMedium = staticCompositionLocalOf { dimensionMedium }
val LocalBaseDimensionLarge = staticCompositionLocalOf { dimensionLarge }