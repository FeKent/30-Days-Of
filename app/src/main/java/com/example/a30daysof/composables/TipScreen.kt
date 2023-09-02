package com.example.a30daysof.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a30daysof.data.Tip


@Composable
fun TipScreen(tips: List<Tip>) {
    LazyColumn {
        itemsIndexed(tips) { index, tip ->
            TipCard(
                tip = tip,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}




