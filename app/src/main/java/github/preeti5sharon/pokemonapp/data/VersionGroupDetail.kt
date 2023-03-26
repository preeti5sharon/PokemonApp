package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionGroupDetail(
    @Json(name = "level_learned_at")
    val levelLearnedAt: Int? = null,
    @Json(name = "move_learn_method")
    val moveLearnMethod: MoveLearnMethod? = null,
    @Json(name = "version_group")
    val versionGroup: VersionGroup? = null
)
