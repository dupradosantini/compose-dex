package com.example.composedex

import android.app.Application
import com.example.composedex.data.DefaultPokedexAppContainer
import com.example.composedex.data.PokedexAppContainer

class PokedexApplication: Application() {
    lateinit var container: PokedexAppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultPokedexAppContainer()
    }
}