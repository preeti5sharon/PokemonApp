package github.preeti5sharon.pokemonapp.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Versions(
    @Json(name = "generation-i")
    val generationI: GenerationI? = null,
    @Json(name = "generation-ii")
    val generationIi: GenerationIi? = null,
    @Json(name = "generation-iii")
    val generationIii: GenerationIii? = null,
    @Json(name = "generation-iv")
    val generationIv: GenerationIv? = null,
    @Json(name = "generation-v")
    val generationV: GenerationV? = null,
    @Json(name = "generation-vi")
    val generationVi: GenerationVi? = null,
    @Json(name = "generation-vii")
    val generationVii: GenerationVii? = null,
    @Json(name = "generation-viii")
    val generationViii: GenerationViii? = null
)