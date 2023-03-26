package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenerationV(
    @Json(name = "black-white")
    val blackWhite: BlackWhite? = null
)
