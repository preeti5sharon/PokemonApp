package github.preeti5sharon.pokemonapp.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import github.preeti5sharon.pokemonapp.api.PokemonItemResult
import github.preeti5sharon.pokemonapp.api.PokemonService
import java.util.Collections.emptyList

class PokemonPagingSource(private val service: PokemonService) :
    PagingSource<Int, PokemonItemResult>() {
    override fun getRefreshKey(state: PagingState<Int, PokemonItemResult>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonItemResult> {
        return try {
            val offset = params.key ?: 0
            val limit = params.loadSize
            val response = service.fetchPokemonList(offset, limit)
            val list = response.results ?: emptyList()
            val previousKey = if (response.previous.isNullOrEmpty()) null else offset - limit
            val nextKey = if (response.next.isNullOrEmpty()) null else offset + limit
            LoadResult.Page(list, previousKey, nextKey)
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}