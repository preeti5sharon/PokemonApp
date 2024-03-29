package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveLearnMethod(
    val name: String? = null,
    val url: String? = null
)
