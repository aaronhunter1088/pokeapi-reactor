package skaro.pokeapi.resource.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.NonNull;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VerboseEffect;
import skaro.pokeapi.resource.berry.Berry;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.utils.ToStringFormat;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Represents the Ability resource.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record Ability (
    Integer id,
    String name,
    @JsonProperty("is_main_series") Boolean mainSeries,
    NamedApiResource<Generation> generation,
    List<Name> names,
    @JsonProperty("effect_entries") List<VerboseEffect> effectEntries,
    @JsonProperty("effect_changes") List<AbilityEffectChange> effectChanges,
    @JsonProperty("flavor_text_entries") List<AbilityFlavorText> flavorTextEntries,
    List<AbilityPokemon> pokemon
) implements PokeApiResource, Localizable, Comparable<Ability> {

    /* Constructor with id and name */
    public Ability(Integer id, String name) { this(id, name, null, null, null, null, null, null, null); }
    /* Constructor with name */
    public Ability(String name) { this(null, name); }
    /* No-args constructor */
    public Ability() { this(null); }

    /**
     * Get the id
     * @return the id
     */
    @Override
    public Integer getId() { return id; }

    /**
     * Get the name for this resource
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets the names of this resource listed in different languages
     * @return the list of {@link Name} name
     */
    @Override
    public List<Name> getNames() {
        return names;
    }

    /**
     * Returns a string representation of the Ability
     *
     * @return the string representation
     */
    @Override
    public @NonNull String toString() {
        return toString(ToStringFormat.MINIMAL);
    }

    /**
     * Returns a string representation of the Ability.
     *
     * @param format the desired {@link ToStringFormat} format
     * @return the string representation
     */
    public String toString(ToStringFormat format) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ability{");
        return switch (format) {
            case MINIMAL -> {
                sb.append("id=").append(getId())
                .append(", name='").append(getName()).append('\'')
                .append('}');
                yield sb.toString();
            }
            case BASIC -> {
                sb.append("id=").append(getId())
                .append(", name='").append(getName()).append('\'')
                .append(", generation=").append(generation)
                .append(", effectEntries=").append(effectEntries)
                .append('}');
                yield sb.toString();
            }
            case DETAILED -> {
                sb.append("id=").append(getId())
                .append(", name='").append(getName()).append('\'')
                .append(", mainSeries=").append(mainSeries)
                .append(", generation=").append(generation)
                .append(", names=").append(getNames())
                .append(", effectEntries=").append(effectEntries)
                .append(", effectChanges=").append(effectChanges)
                .append(", flavorTextEntries=").append(flavorTextEntries)
                .append(", pokemon=").append(pokemon)
                .append('}');
                yield sb.toString();
            }
            case DEFAULT -> getClass().getName() + "@" + Integer.toHexString(hashCode());
        };
    }

    /**
     * Compares this id to other ability's id.
     *
     * @param other the other ability to be compared.
     * @return comparison result
     */
    @Override
    public int compareTo(@NonNull Ability other) {
        Comparator<Ability> cmp = Comparator
                .comparing(Ability::getId, Comparator.nullsFirst(Integer::compareTo));
        return cmp.compare(this, other);
    }
}
