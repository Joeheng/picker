package com.ozcanalasalvar.datepicker.compose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ozcanalasalvar.datepicker.ui.theme.PickerTheme
import com.ozcanalasalvar.datepicker.ui.theme.colorLightOnBackground

@Composable
fun SelectorView(modifier: Modifier = Modifier, darkModeEnabled: Boolean, offset: Int) {
    Column(
        modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(offset.toFloat())
                .fillMaxWidth()
                .background(if (darkModeEnabled) PickerTheme.colors.onbackground else colorLightOnBackground),
        )


        Column(
            modifier = Modifier
                .weight(1.13f)
                .fillMaxWidth()
                .background(
                    shape = RoundedCornerShape(4.dp),
                    brush = Brush.linearGradient(
                        listOf(
                            Color(0x20714FFF),
                            Color(0x51714FFF),
                            Color(0x20714FFF),
                        )
                    )
                ),
            verticalArrangement = Arrangement.SpaceBetween
        ) {


        }



        Box(
            modifier = Modifier
                .weight(offset.toFloat())
                .fillMaxWidth()
                .background(if (darkModeEnabled) PickerTheme.colors.onbackground else colorLightOnBackground),
        )
    }
}