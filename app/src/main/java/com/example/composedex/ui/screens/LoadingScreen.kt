package com.example.composedex.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.Surface
import androidx.compose.material.Text

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colors.secondary,
        modifier = modifier
    ) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column{
                Text("Loading...",
                    color = MaterialTheme.colors.onBackground)
                CircularProgressIndicator( modifier= Modifier.padding(16.dp))
            }
        }
    }
}