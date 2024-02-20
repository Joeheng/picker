package com.ozcanalasalvar.wheelview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SelectionView(
    modifier: Modifier = Modifier,
    selectorOptions: SelectorOptions,
    rowOffset: Int,
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(rowOffset.toFloat())
                .fillMaxWidth(),
        )


        Column(
            modifier = Modifier
                .weight(1.13f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .height(selectorOptions.width)
                    .alpha(selectorOptions.alpha)
                    .background(selectorOptions.color)
                    .fillMaxWidth()
            )
            Box(
                modifier = Modifier
                    .height(selectorOptions.width)
                    .alpha(selectorOptions.alpha)
                    .background(selectorOptions.color)
                    .fillMaxWidth()
            )

        }



        Box(
            modifier = Modifier
                .weight(rowOffset.toFloat())
                .fillMaxWidth(),
        )
    }
}

val Inter = FontFamily(
    listOf(
        Font(R.font.inter_regular, FontWeight.Normal),
        Font(R.font.inter_medium, FontWeight.Medium),
        Font(R.font.inter_semibold, FontWeight.SemiBold),
        Font(R.font.inter_bold, FontWeight.Bold),
        Font(R.font.inter_extrabold, FontWeight.ExtraBold),
        Font(R.font.inter_italic, FontWeight.Normal, style = FontStyle.Italic)
    )
)
