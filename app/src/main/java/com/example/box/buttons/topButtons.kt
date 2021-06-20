package com.example.box.buttons

import androidx.compose.ui.graphics.Color
import com.example.box.ButtonModel
//list of buttons that appear at the top of the application
// Use Alignment class to change alignments eg: Alignment.Center, Alignment.TopStart,
// For rotation and alpha use use floating point numbers: eg 0.3f, 90f,180f
val topButtons= listOf<ButtonModel>(
    ButtonModel("red", Color.Red){ boxState->
        boxState.color.value= Color.Red
    },
    ButtonModel("blue", Color.Blue){
        it.color.value= Color.Blue
    },
)