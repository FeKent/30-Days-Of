package com.example.a30daysof.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.example.a30daysof.data.Tip


@Composable
fun TipScreen(tips: List<Tip>) {
    LazyColumn{
        itemsIndexed(tips) { index, tip -> TipCard(tip = tip)}
    }
}




