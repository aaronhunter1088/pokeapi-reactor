package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.NonNull;
import skaro.pokeapi.resource.FlavorText;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VersionGameIndex;
import skaro.pokeapi.resource.pokemonform.PokemonForm;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.ToStringFormat;

import java.util.Comparator;
import java.util.List;

/**
 * Represents the Pokemon resource.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record Pokemon (
        Integer id,
        String name,
        @JsonProperty("base_experience") Integer baseExperience,
        @JsonProperty("cries") PokemonCries pokemonCries,
        Integer height,
        @JsonProperty("is_default") Boolean isDefault,
        Integer order,
        Integer weight,
        List<PokemonAbility> abilities,
        @JsonProperty("past_abilities") List<PokemonPastAbility> pastAbilities,
        List<NamedApiResource<PokemonForm>> forms,
        @JsonProperty("game_indices") List<VersionGameIndex> gameIndices,
        @JsonProperty("held_items") List<PokemonHeldItem> heldItems,
        @JsonProperty("location_area_encounters") String locationAreaEncounters,
        List<PokemonMove> moves,
        PokemonSprites sprites,
        NamedApiResource<PokemonSpecies> species,
        List<PokemonStat> stats,
        List<PokemonType> types,
        @JsonProperty("past_types") List<PokemonTypePast> pastTypes,
        String nickname,
        String type,
        String defaultImage,
        String officialImage,
        String gifImage,
        String shinyImage,
        String color,
        List<FlavorText> descriptions,
        String description,
        List<String> locations,
        List<String> moveNames
) implements PokeApiResource, Comparable<Pokemon> {

    /* Construct with another Pokemon, changing name, nickname, height, weight, and color */
    public Pokemon(Pokemon previous, String name, String nickname, Integer height, Integer weight, String color) {
        this(previous.id, (name != null ? name : previous.name), previous.baseExperience, previous.pokemonCries,
                (height != null ? height : previous.height), previous.isDefault, previous.order, (weight != null ? weight : previous.weight),
                previous.abilities, previous.pastAbilities, previous.forms, previous.gameIndices, previous.heldItems,
                previous.locationAreaEncounters, previous.moves, previous.sprites, previous.species, previous.stats, previous.types,
                previous.pastTypes, (nickname != null ? nickname : previous.nickname), previous.type, previous.defaultImage,
                previous.officialImage, previous.gifImage, previous.shinyImage, (color != null ? color : previous.color),
                previous.descriptions, previous.description, previous.locations, previous.moveNames);
    }
    /* Construct with id, name, nickname, height, weight, and color */
    public Pokemon(Integer id, String name, String nickname, Integer height, Integer weight, String color) { this(id, name, null, null, height, null, null, weight, null, null, null, null, null, null, null, null, null, null, null, null, nickname, null, null, null, null, null, color, null, null, null, null); }
    /* Construct with id, name, nickname, height, and weight */
    public Pokemon(Integer id, String name, String nickname, Integer height, Integer weight) { this(id, name, nickname, height, weight, null); }
    /* Construct with id, name, height, weight, and color */
    public Pokemon(Integer id, String name, Integer height, Integer weight, String color) { this(id, name, null, height, weight, color); }
    /* Construct with id, name, height, and weight */
    public Pokemon(Integer id, String name, Integer height, Integer weight) { this(id, name, null, height, weight, null); }
    /* Construct with id, name, and nickname */
    public Pokemon(Integer id, String name, String nickname) { this(id, name, nickname, null, null); }
    /* Construct with id and name */
    public Pokemon(Integer id, String name) { this(id, name, null); }
    /* Construct with name */
    public Pokemon(String name) { this(null, name); }
    /* No-args constructor */
    public Pokemon() { this(null); }

    /**
     * Get the id.
     *
     * @return the id
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * Get the name of this resource.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Get the move names of the Pokémon.
     *
     * @return the moveNames
     */
    public List<String> getPokemonMoveNames() {
        if (moves == null) {
            return List.of();
        }
        return moves.stream()
                .map(skaro.pokeapi.resource.pokemon.PokemonMove::getMove)
                .map(NamedApiResource::getName)
                .sorted()
                .toList();
    }

    /**
     * Returns the capitalized color of the Pokémon.
     *
     * @return the capitalized color
     */
    public String getCapitalizedColor() {
        if (color == null || color.isEmpty()) {
            return "";
        }
        return color.substring(0,1).toUpperCase() + color.substring(1);
    }

    /**
     * Returns the height in inches.
     *
     * @return the height in inches
     */
    public String getHeightInInches() {
        return String.format("%.0f", height != null ? height * 3.93701 : 0);
    }

    /**
     * Returns the weight in pounds.
     *
     * @return the weight in pounds
     */
    public String getWeightInPounds() {
        return String.format("%.0f", weight != null ? weight * 0.220462 : 0);
    }

    /**
     * Returns a string representation of the Pokemon.
     *
     * @return the string representation
     */
    @Override
    public @NonNull String toString() {
        return toString(ToStringFormat.MINIMAL);
    }

    /**
     * Returns a string representation of the Pokemon.
     *
     * @param format the desired {@link ToStringFormat} format
     * @return the string representation
     */
    public String toString(ToStringFormat format) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{");
        return switch (format) {
            case MINIMAL -> {
                sb.append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append('}');
                yield sb.toString();
            }
            case BASIC -> {
                sb.append("id=").append(id)
                .append(", name='").append(name).append('\'');
                if (nickname != null) sb.append(", nickname='").append(nickname).append('\'');
                sb.append(", height=").append(height)
                .append(", weight=").append(weight)
                .append(", color='").append(color).append('\'')
                .append('}');
                yield sb.toString();
            }
            case DETAILED -> {
                sb.append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", nickname='").append(nickname).append('\'')
                .append(", baseExperience=").append(baseExperience)
                .append(", pokemonCries=").append(pokemonCries)
                .append(", height=").append(height)
                .append(", isDefault=").append(isDefault)
                .append(", order=").append(order)
                .append(", weight=").append(weight)
                .append(", abilities=").append(abilities)
                .append(", pastAbilities=").append(pastAbilities)
                .append(", forms=").append(forms)
                .append(", gameIndices=").append(gameIndices)
                .append(", heldItems=").append(heldItems)
                .append(", locationAreaEncounters='").append(locationAreaEncounters).append('\'')
                .append(", moves=").append(moves)
                .append(", sprites=").append(sprites)
                .append(", species=").append(species)
                .append(", stats=").append(stats)
                .append(", types=").append(types)
                .append(", pastTypes=").append(pastTypes)
                .append(", type='").append(type).append('\'')
                .append(", defaultImage='").append(defaultImage).append('\'')
                .append(", officialImage='").append(officialImage).append('\'')
                .append(", gifImage='").append(gifImage).append('\'')
                .append(", shinyImage='").append(shinyImage).append('\'')
                .append(", color='").append(color).append('\'')
                .append(", descriptions=").append(descriptions)
                .append(", description='").append(description).append('\'')
                .append(", locations=").append(locations)
                .append(", moveNames=").append(moveNames)
                .append('}');
                yield sb.toString();
            }
            case DEFAULT -> getClass().getName() + "@" + Integer.toHexString(hashCode());
        };
    }

    /**
     * Compares this id to other pokemon's id.
     * Then compares by nickname, null nicknames being last.
     *
     * @param other the other pokemon to be compared.
     * @return comparison result
     */
    @Override
    public int compareTo(@NonNull Pokemon other) {
        Comparator<Pokemon> cmp = Comparator
                .comparing(Pokemon::getId, Comparator.nullsFirst(Integer::compareTo))
                .thenComparing(Pokemon::nickname, Comparator.nullsLast(String::compareTo));
        return cmp.compare(this, other);
    }
}
