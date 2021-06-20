package com.example.box.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import com.example.box.BoxState

@Composable
fun Body(
  boxState: BoxState
){
  Box(modifier = Modifier.fillMaxSize(0.9f)){
    Box(modifier = Modifier
      .rotate(boxState.rotation.value)
      .size(boxState.size.value)
      .alpha(boxState.alpha.value)
      .background(boxState.color.value)
      .align(alignment =boxState.alignment.value)
    )

  }
}