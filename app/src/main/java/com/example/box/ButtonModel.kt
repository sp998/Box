package com.example.box

import androidx.compose.ui.graphics.Color

data class ButtonModel(
    val name:String,
    val color:Color,
    val action:(BoxState)->Unit)
