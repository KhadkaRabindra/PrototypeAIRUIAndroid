package com.example.airui.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import com.example.airui.ui.Breakpoint.*

sealed class ThemeMode(val title: String) {
    data object Light: ThemeMode(title = "Light")
    data object Dark: ThemeMode(title = "Dark")
    data object Space: ThemeMode(title = "Space")
}

object BaseTheme {
    val typography: BaseTypography
        @ReadOnlyComposable
        @Composable
        get() = LocalBaseTypography.current
    val colors: BaseColor
        @ReadOnlyComposable
        @Composable
        get() = LocalBaseColorScheme.current
    val dimensions: BaseDimension
        @ReadOnlyComposable
        @Composable
        get() = LocalBaseDimension.current
    val shapes: BaseShape
        @ReadOnlyComposable
        @Composable
        get() = LocalBaseShapes.current
}

@Composable
fun AIRUITheme(
    themeMode: ThemeMode = ThemeMode.Space,
    //typography: BaseTypography = BaseTheme.typography,
    //dimension: BaseDimension = BaseTheme.dimensions,
    //shape: BaseShape = BaseTheme.shapes,
    content: @Composable () -> Unit
) {
    val colors = when (themeMode) {
        ThemeMode.Dark -> DarkColorScheme
        ThemeMode.Light -> LightColorScheme
        ThemeMode.Space -> SpaceColorScheme
    }
    val breakpoint = getBreakpoint()
    val typography = when (breakpoint){
        EXTRA_SMALL -> LocalTypographyExtraSmall.current
        SMALL ->  LocalTypographySmall.current
        MEDIUM ->  LocalTypographyMedium.current
        LARGE ->  LocalTypographyLarge.current
    }
    val dimension = when(breakpoint){
        EXTRA_SMALL -> LocalBaseDimensionExtraSmall.current
        SMALL ->  LocalBaseDimensionSmall.current
        MEDIUM ->  LocalBaseDimensionMedium.current
        LARGE ->  LocalBaseDimensionLarge.current
    }

    val shape = when(breakpoint){
        EXTRA_SMALL -> LocalBaseShapes.current
        SMALL ->  LocalBaseShapes.current
        MEDIUM ->  LocalBaseShapes.current
        LARGE ->  LocalBaseShapes.current
    }

    LaunchedEffect(key1 = colors){
        Log.d("NewsTheme -> ", "Colors changed")
    }
    CompositionLocalProvider(
        LocalBaseColorScheme provides colors,
        LocalBaseTypography provides typography,
        LocalBaseDimension provides dimension,
        LocalBaseShapes provides shape,
    ){
        content()
    }
}