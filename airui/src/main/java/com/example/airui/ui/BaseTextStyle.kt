package com.example.airui.ui

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class BaseTypography(
    val headline: TextStyle,
    val title: TextStyle,
    val subtitle: TextStyle,
    val body: TextStyle,
    val caption: TextStyle,
    val button: TextStyle,
)

// Our customized typography property that we will provide to the theme ^_^
val typographyExtraSmall = BaseTypography(
    headline = TextStyle(
        fontSize = 27.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Black,
    ),
    title = TextStyle(
        fontSize = 22.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
    subtitle = TextStyle(
        fontSize = 19.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
)


val typographySmall = BaseTypography(
    headline = TextStyle(
        fontSize = 27.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Black,
    ),
    title = TextStyle(
        fontSize = 32.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
    subtitle = TextStyle(
        fontSize = 19.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
)


val typographyMedium = BaseTypography(
    headline = TextStyle(
        fontSize = 54.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Black,
    ),
    title = TextStyle(
        fontSize = 42.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
    subtitle = TextStyle(
        fontSize = 38.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
)

val typographyLarge = BaseTypography(
    headline = TextStyle(
        fontSize = 27.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Black,
    ),
    title = TextStyle(
        fontSize = 52.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
    subtitle = TextStyle(
        fontSize = 19.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    ),
    caption = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    ),
    button = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
    ),
)

val LocalBaseTypography = staticCompositionLocalOf { typographyExtraSmall }
val LocalTypographyExtraSmall = staticCompositionLocalOf { typographyExtraSmall }
val LocalTypographySmall = staticCompositionLocalOf { typographySmall }
val LocalTypographyMedium = staticCompositionLocalOf { typographyMedium }
val LocalTypographyLarge = staticCompositionLocalOf { typographyLarge }