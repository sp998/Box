package com.example.box.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.box.BoxState
import com.example.box.ButtonModel

@Composable
fun IconBar(
    names:List<ButtonModel> = listOf<ButtonModel>(),
    spacing: Dp =10.dp,
    itemSize:Dp =50.dp,
    boxState:BoxState
){
    LazyRow(Modifier.fillMaxWidth()) {
        items(items=names,itemContent={item->
            MYIcon(name = item.name,backgroundColor = item.color,size=itemSize,boxState,item.action)
            Spacer(modifier = Modifier.size(spacing))
        })
    }
}

@Composable
fun MYIcon(name:String,
           backgroundColor:Color =Color.White,
           size:Dp =50.dp,
           color:BoxState,
           onClick:(BoxState)->Unit
           ){
    Box(modifier = Modifier
        .clickable { onClick(color) }
        .size(size)
        .background(backgroundColor)){
        Text(
            modifier = Modifier.align(Alignment.Center),
            text=name,color=if(backgroundColor==Color.White) Color.Blue else Color.White)
    }

}