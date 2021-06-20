package com.example.box.buttons

import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.box.ButtonModel
// these are the buttons which appear at the bottom  of the application
// Use Alignment class to change alignments eg: Alignment.Center, Alignment.TopStart,
// For rotation and alpha use use floating point numbers: eg 0.3f, 90f,180f
val bottomButtons= listOf<ButtonModel>(
    ButtonModel("100dp", Color.Cyan){ boxState ->
    boxState.size.value =100.dp
    },

    ButtonModel("50dp",Color.White){ boxState ->
    boxState.size.value = 50.dp
    },
    ButtonModel("400dp",Color.Yellow){ boxState ->
    boxState.size.value = 400.dp
    },
)