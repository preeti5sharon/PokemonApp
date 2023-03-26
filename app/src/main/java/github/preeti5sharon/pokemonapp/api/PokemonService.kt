package github.preeti5sharon.pokemonapp.api

import github.preeti5sharon.pokemonapp.data.PokemonDetailResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonService {
    @GET("pokemon/")
    suspend fun fetchPokemonList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): PokemonListResponse

    // "https://pokeapi.co/api/v2/pokemon/?offset=20&limit=20"
    @GET("pokemon/{index}")
    suspend fun fetchPokemonDetails(
        @Path("index") index: Int
    ): PokemonDetailResponse
// https://pokeapi.co/api/v2/pokemon/23/
}
