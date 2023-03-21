package com.example.composedex.model

@kotlinx.serialization.Serializable
data class Pokemon (
    val id: Int,
    val name: String,
    val types: List<PokemonType>
        )

@kotlinx.serialization.Serializable
data class PokemonType (
    val slot: Int,
    val type: GenericType
        )

@kotlinx.serialization.Serializable
data class GenericType(
    val name: String
)