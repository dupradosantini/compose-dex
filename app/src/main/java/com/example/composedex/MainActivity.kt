package com.example.composedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composedex.ui.PokedexApp
import com.example.composedex.ui.theme.ComposeDexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDexTheme {
                PokedexApp()
            }
        }
    }
}