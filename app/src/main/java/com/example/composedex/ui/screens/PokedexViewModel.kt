package com.example.composedex.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import coil.network.HttpException
import com.example.composedex.PokedexApplication
import com.example.composedex.data.PokemonRepository
import com.example.composedex.model.Pokemon
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface PokedexUiState {
    data class Success(val entries: List<Pokemon>): PokedexUiState
    object Error: PokedexUiState
    object Loading: PokedexUiState
}

class PokedexViewModel(
    private val pokemonRepository: PokemonRepository
): ViewModel() {

    var pokedexUiState: PokedexUiState by mutableStateOf(PokedexUiState.Loading)
    private set

    init {
        getPokemons()
    }

    fun getPokemons(){
        viewModelScope.launch {
            pokedexUiState = try {
                val listResult = pokemonRepository.getPokemon()
                PokedexUiState.Success(entries = listResult)
            } catch (e: IOException){
                PokedexUiState.Error
            } catch (e: HttpException){
                PokedexUiState.Error
            }
        }
    }

    fun getFromStart(){
        viewModelScope.launch {
            pokedexUiState = try {
                val listResult = pokemonRepository.getFromStart()
                PokedexUiState.Success(entries = listResult)
            } catch (e: IOException){
                PokedexUiState.Error
            } catch (e: HttpException){
                PokedexUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as PokedexApplication)
                val pokemonRepository = application.container.repository
                PokedexViewModel(pokemonRepository)
            }
        }
    }

}