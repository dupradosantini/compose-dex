package com.example.composedex.network

import com.example.composedex.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiService {

    @GET("pokemon/{number}")
    suspend fun getPokemon(@Path("number") number: Int): Pokemon

}