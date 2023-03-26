package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Yellow(
    @Json(name = "back_default")
    val backDefault: String? = null,
    @Json(name = "back_gray")
    val backGray: String? = null,
    @Json(name = "back_transparent")
    val backTransparent: String? = null,
    @Json(name = "front_default")
    val frontDefault: String? = null,
    @Json(name = "front_gray")
    val frontGray: String? = null,
    @Json(name = "front_transparent")
    val frontTransparent: String? = null
)
