package com.example.composedex.utils

fun formatNumber(number: Int): String {
    return number.toString().padStart(3, '0')
}

fun assembleImageUrl(pokeId: Int): String {
    return "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/${
        formatNumber(pokeId)
    }.png"
}