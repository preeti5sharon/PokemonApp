package github.preeti5sharon.pokemonapp.api


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonItemResult(
    val name: String? = null,
    val url: String? = null
)