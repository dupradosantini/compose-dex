package com.example.composedex.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.Surface
import androidx.compose.material.Text

@Composable
fun ErrorScreen(retryAction: () -> Unit, modifier: Modifier) {
    Surface(color = MaterialTheme.colors.secondary) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Loading failed.",
                color = MaterialTheme.colors.onBackground)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = retryAction) {
                Text("Retry")
            }
        }
    }
}