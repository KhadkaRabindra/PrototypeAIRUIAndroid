package com.example.prototypeairuiandroid.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.example.airui.ui.BaseTheme

@Composable
fun NewsButton(
    modifier: Modifier = Modifier,
    backgroundColor: Color = BaseTheme.colors.primary,
    contentColor: Color = contentColorFor(backgroundColor = backgroundColor),
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = BaseTheme.shapes.buttonShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor,
        ),
        content = content,
    )
}

@Composable
fun NewsText(
    modifier: Modifier = Modifier,
    style: TextStyle = BaseTheme.typography.title,
    textColor: Color = BaseTheme.colors.onBackground,
    textAlign: TextAlign = TextAlign.Start,
    text: String,
) {
    Text(
        modifier = modifier,
        text = text,
        style = style,
        textAlign = textAlign,
        color = textColor,
    )
}