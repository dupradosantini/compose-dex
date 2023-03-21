package com.example.composedex.data

import com.example.composedex.model.Pokemon
import com.example.composedex.network.PokemonApiService

interface PokemonRepository{
    suspend fun getPokemon(quantity:Int = 151): List<Pokemon>
}

class NetworkPokemonRepository(
    private val pokemonApiService: PokemonApiService
): PokemonRepository {
    override suspend fun getPokemon(quantity: Int): List<Pokemon> {
        val pokemonList = mutableListOf<Pokemon>()
        for(pokeNumber in 1..quantity){
            pokemonList.add(pokemonApiService.getPokemon(pokeNumber))
        }
        return pokemonList
    }
}