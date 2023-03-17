package com.example.composedex.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composedex.ui.elements.PokemonCard

@Composable
fun PokedexListingScreen(){

    //Maybe a header

    LazyColumn(
        modifier = Modifier.padding(top= 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        items(5){
            PokemonCard()
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}


