package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FireredLeafgreen(
    @Json(name = "back_default")
    val backDefault: String? = null,
    @Json(name = "back_shiny")
    val backShiny: String? = null,
    @Json(name = "front_default")
    val frontDefault: String? = null,
    @Json(name = "front_shiny")
    val frontShiny: String? = null
)
