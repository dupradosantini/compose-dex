package com.example.composedex.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    pokedexUiState: PokedexUiState,
    getMorePokemons: () -> Unit,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier
) {
    when (pokedexUiState) {
        is PokedexUiState.Loading -> LoadingScreen(modifier)
        is PokedexUiState.Error -> ErrorScreen(retryAction, modifier)
        is PokedexUiState.Success ->
            PokedexListingScreen(
                pokemonList = pokedexUiState.entries,
                getMorePokemons = getMorePokemons,
                modifier = modifier
            )
    }
}