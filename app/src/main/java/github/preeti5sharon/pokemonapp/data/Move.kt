package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Move(
    val move: MoveX? = null,
    @Json(name = "version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>? = null
)
