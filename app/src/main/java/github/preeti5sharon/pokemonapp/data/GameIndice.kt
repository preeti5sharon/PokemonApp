package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GameIndice(
    @Json(name = "game_index")
    val gameIndex: Int? = null,
    val version: Version? = null
)
