package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Ability(
    val ability: AbilityX? = null,
    @Json(name = "is_hidden")
    val isHidden: Boolean? = null,
    val slot: Int? = null
)
