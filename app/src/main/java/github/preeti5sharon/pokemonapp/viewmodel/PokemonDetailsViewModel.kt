package github.preeti5sharon.pokemonapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import github.preeti5sharon.pokemonapp.data.PokemonDetailResponse
import github.preeti5sharon.pokemonapp.paging.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    private val _pokemonDetailsData = MutableStateFlow<PokemonDetailResponse?>(null)
    val pokemonDetailsData = _pokemonDetailsData.asStateFlow()
    fun getPokemonDetails(index: Int) = viewModelScope.launch {
        val response = repository.getPokemonDetails(index)
        _pokemonDetailsData.value = response
    }
}
