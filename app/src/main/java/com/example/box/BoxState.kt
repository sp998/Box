package com.example.box

import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

data class BoxState(val color:MutableState<Color>,
                    val size:MutableState<Dp>,
                    val alignment:MutableState<Alignment>,
                    val rotation:MutableState<Float>,
                    val alpha:MutableState<Float>
                    )
