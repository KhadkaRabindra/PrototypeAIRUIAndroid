package com.example.airui.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

enum class Breakpoint {
    EXTRA_SMALL,
    SMALL,
    MEDIUM,
    LARGE
}

@Composable
fun getBreakpoint(): Breakpoint =
    when (LocalConfiguration.current.screenWidthDp) {
        in 0 until 576 -> Breakpoint.EXTRA_SMALL
        in 577 until 768 -> Breakpoint.SMALL
        in 769 until 1100 -> Breakpoint.MEDIUM
        else -> Breakpoint.LARGE
    }
