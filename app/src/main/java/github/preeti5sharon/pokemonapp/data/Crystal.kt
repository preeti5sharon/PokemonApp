package github.preeti5sharon.pokemonapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Crystal(
    @Json(name = "back_default")
    val backDefault: String? = null,
    @Json(name = "back_shiny")
    val backShiny: String? = null,
    @Json(name = "back_shiny_transparent")
    val backShinyTransparent: String? = null,
    @Json(name = "back_transparent")
    val backTransparent: String? = null,
    @Json(name = "front_default")
    val frontDefault: String? = null,
    @Json(name = "front_shiny")
    val frontShiny: String? = null,
    @Json(name = "front_shiny_transparent")
    val frontShinyTransparent: String? = null,
    @Json(name = "front_transparent")
    val frontTransparent: String? = null
)