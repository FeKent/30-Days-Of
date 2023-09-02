package com.example.a30daysof.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysof.data.Tip

@Composable
fun TipCard(tip: Tip) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Blue)
    ) {
        Row(
            modifier = Modifier
                .wrapContentSize()
                .background(color = Color.Green)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Tip: ")
            Text(text = tip.number.toString())
        }
        Column(
            modifier = Modifier
                .padding(8.dp)

        ) {
            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text(text = stringResource(id = tip.title))
            }
            Spacer(modifier = Modifier.size(8.dp))
            Row(modifier = Modifier.background(Color.Gray)) {
                Text(text = stringResource(id = tip.info))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TipPreview() {
    TipCard(Tip.Tip1)
}