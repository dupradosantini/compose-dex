package com.example.composedex.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
            LazyColumn(
                modifier = Modifier.padding(top= 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                items(pokemonList){
                    Spacer(modifier = Modifier.height(5.dp))
                    PokemonCard(pokemon = it)
                    Spacer(modifier = Modifier.height(35.dp))
                }
                /*items(pokemonList.size){
                    Spacer(modifier = Modifier.height(5.dp))
                    PokemonCard()
                    Spacer(modifier = Modifier.height(35.dp))
                }*/
            }
        }
    }
}


