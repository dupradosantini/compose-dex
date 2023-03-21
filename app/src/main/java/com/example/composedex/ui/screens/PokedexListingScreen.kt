package com.example.composedex.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composedex.model.Pokemon
import com.example.composedex.ui.elements.PokedexAppHeader
import com.example.composedex.ui.elements.PokemonCard

@Composable
fun PokedexListingScreen(
    pokemonList: List<Pokemon>,
    getMorePokemons: () -> Unit,
    modifier: Modifier = Modifier
){
    Surface (
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PokedexAppHeader()

            val state = rememberLazyListState()

            LazyColumn(
                modifier = Modifier.padding(top= 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                state = state
            ){
                if (state.isScrolledToTheEnd()) {
                    getMorePokemons()
                    Log.d("PokedexApp", "Scrolled to end triggered")
                }

                items(pokemonList){
                    Spacer(modifier = Modifier.height(5.dp))
                    PokemonCard(pokemon = it)
                    Spacer(modifier = Modifier.height(35.dp))
                }
            }
        }
    }
}

fun LazyListState.isScrolledToTheEnd() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1


