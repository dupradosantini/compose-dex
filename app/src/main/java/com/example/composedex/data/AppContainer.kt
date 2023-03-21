package com.example.composedex.data

import com.example.composedex.network.PokemonApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface PokedexAppContainer {
    val repository: PokemonRepository
}


class DefaultPokedexAppContainer: PokedexAppContainer {

    private val baseUrl = "https://pokeapi.co/api/v2/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(
            GsonConverterFactory.create()
        )
        .baseUrl(baseUrl)
        .build()

    private val retrofitService: PokemonApiService by lazy {
        retrofit.create(PokemonApiService::class.java)
    }

    override val repository: PokemonRepository by lazy {
        NetworkPokemonRepository(retrofitService)
    }


}