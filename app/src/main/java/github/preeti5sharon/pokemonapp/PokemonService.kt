package github.preeti5sharon.pokemonapp

import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonService {
    @GET("pokemon/")
    suspend fun fetchPokemonList(
        @Query("offset") offset:Int,
        @Query("limit") limit:Int
    ): PokemonListResponse
// "https://pokeapi.co/api/v2/pokemon/?offset=20&limit=20"
}