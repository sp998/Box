package com.example.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.box.composables.Body
import com.example.box.composables.IconBar
import com.example.box.buttons.bottomButtons
import com.example.box.buttons.topButtons
import com.example.box.ui.theme.Try1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Try1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                 Column {
                     val boxState =BoxState(
                         remember { mutableStateOf(Color.Red) },
                         remember { mutableStateOf(200.dp)},
                         remember { mutableStateOf(Alignment.Center)},
                         remember { mutableStateOf(0f)},
                         remember { mutableStateOf(1f)}
                     )
                     IconBar(boxState=boxState,names = topButtons)
                     Body(boxState=boxState)
                     IconBar(boxState=boxState, names= bottomButtons)
                 }

                }
            }
        }
    }
}

