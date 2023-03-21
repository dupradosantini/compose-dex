package com.example.composedex.model

@kotlinx.serialization.Serializable
data class Pokemon (
    val id: Int,
    val name: String,
    val types: List<PokemonType>
        ){
    val formattedNumber = id.toString().padStart(3,'0')
    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/${formattedNumber}.png"
}

@kotlinx.serialization.Serializable
data class PokemonType (
    val slot: Int,
    val type: GenericType
        )

@kotlinx.serialization.Serializable
data class GenericType(
    val name: String
)