package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Other(
    @Json(name = "dream_world")
    val dreamWorld: DreamWorld? = null,
    val home: Home? = null,
    @Json(name = "official-artwork")
    val officialArtwork: OfficialArtwork? = null
)
