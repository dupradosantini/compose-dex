package com.example.composedex.data

import com.example.composedex.model.Pokemon
import com.example.composedex.network.PokemonApiService

interface PokemonRepository {
    suspend fun getPokemon(): List<Pokemon>
    suspend fun getFromStart(): List<Pokemon>
}

class NetworkPokemonRepository(
    private val pokemonApiService: PokemonApiService
) : PokemonRepository {
    private var quantity = 1
    private val pokemonList = mutableListOf<Pokemon>()
    override suspend fun getPokemon(): List<Pokemon> {

        val lastQuantity = quantity
        quantity = lastQuantity + 5

        if (quantity > 152) { // the max number of pokes + 1
            quantity = 152
        }

        for (pokeNumber in lastQuantity until quantity) {
            pokemonList.add(pokemonApiService.getPokemon(pokeNumber))
        }
        return pokemonList.sortedBy { pokemon: Pokemon -> pokemon.id }
    }

    override suspend fun getFromStart(): List<Pokemon> {
        quantity = 1
        pokemonList.removeAll(pokemonList)
        return getPokemon()
    }
}