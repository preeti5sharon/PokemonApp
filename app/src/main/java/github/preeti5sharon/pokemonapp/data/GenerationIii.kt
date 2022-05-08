package github.preeti5sharon.pokemonapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenerationIii(
    val emerald: Emerald? = null,
    @Json(name = "firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen? = null,
    @Json(name = "ruby-sapphire")
    val rubySapphire: RubySapphire? = null
)