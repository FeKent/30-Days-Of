@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.a30daysof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a30daysof.composables.TipScreen
import com.example.a30daysof.data.TipRepository.tips
import com.example.a30daysof.ui.theme.A30DaysOfTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A30DaysOfTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TipApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TipApp() {
    Scaffold(
        topBar = { TipTopAppBar() },
        content = {paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                TipScreen(tips = tips)
            }
        }
    )
}

@ExperimentalMaterial3Api
@Composable
fun TipTopAppBar() {
    CenterAlignedTopAppBar(
        title = { Text(text = "30 Programming Tips") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)
    )
}