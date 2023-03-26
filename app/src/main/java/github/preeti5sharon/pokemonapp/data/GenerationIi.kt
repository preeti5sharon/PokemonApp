package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenerationIi(
    val crystal: Crystal? = null,
    val gold: Gold? = null,
    val silver: Silver? = null
)
