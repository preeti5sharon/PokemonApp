package github.preeti5sharon.pokemonapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveX(
    val name: String? = null,
    val url: String? = null
)