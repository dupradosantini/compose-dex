package com.example.composedex.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composedex.ui.screens.HomeScreen
import com.example.composedex.ui.screens.PokedexViewModel

@Composable
fun PokedexApp(){

    val pokedexViewModel: PokedexViewModel = viewModel(
        factory = PokedexViewModel.Factory
    )

    HomeScreen(
        pokedexUiState = pokedexViewModel.pokedexUiState,
        retryAction = { /*TODO*/ }
    )

}