package github.preeti5sharon.pokemonapp

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

class PokemonRepository(
    private val service: PokemonService
) {
    private val pagingConfig = PagingConfig(pageSize = 10, 10, false, 10)
    fun getPokemonList(): Flow<PagingData<PokemonItemResult>> {
        return Pager(pagingConfig, 0) {
            PokemonPagingSource(service)
        }.flow
    }

    suspend fun getPokemonDetails() = service.fetchPokemonDetails()
}
