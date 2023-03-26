package github.preeti5sharon.pokemonapp.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailResponse(
    val abilities: List<Ability>? = null,
    @Json(name = "base_experience")
    val baseExperience: Int? = null,
    val forms: List<Form>? = null,
    @Json(name = "game_indices")
    val gameIndices: List<GameIndice>? = null,
    val height: Int? = null,
    @Json(name = "held_items")
    val heldItems: List<Any>? = null,
    val id: Int? = null,
    @Json(name = "is_default")
    val isDefault: Boolean? = null,
    @Json(name = "location_area_encounters")
    val locationAreaEncounters: String? = null,
    val moves: List<Move>? = null,
    val name: String? = null,
    val order: Int? = null,
    @Json(name = "past_types")
    val pastTypes: List<Any>? = null,
    val species: Species? = null,
    val sprites: Sprites? = null,
    val stats: List<Stat>? = null,
    val types: List<Type>? = null,
    val weight: Int? = null
)
