package skaro.pokeapi.resource.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VerboseEffect;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the Ability resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public record Ability (
    Integer id,
    String name,
    @JsonProperty("is_main_series")
    Boolean mainSeries,
    NamedApiResource<Generation> generation,
    List<Name> names,
    @JsonProperty("effect_entries")
    List<VerboseEffect> effectEntries,
    @JsonProperty("effect_changes")
    List<AbilityEffectChange> effectChanges,
    @JsonProperty("flavor_text_entries")
    List<AbilityFlavorText> flavorTextEntries,
    List<AbilityPokemon> pokemon
) implements PokeApiResource, Localizable {

    public Ability(String name) { this(null, name, null, null, null, null, null, null, null); }


    /**
     * Get the id
     * @return the id
     */
    @Override
    public Integer getId() {
        return id;
    }

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
     * Returns whether the given object o is
     * equal to this instance of Ability
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ability ability)) return false;
        return Objects.equals(id, ability.id) && Objects.equals(name, ability.name) && Objects.equals(mainSeries, ability.mainSeries)
                && Objects.equals(generation, ability.generation) && Objects.equals(names, ability.names)
                && Objects.equals(effectEntries, ability.effectEntries) && Objects.equals(effectChanges, ability.effectChanges)
                && Objects.equals(flavorTextEntries, ability.flavorTextEntries) && Objects.equals(pokemon, ability.pokemon);
    }

    /**
     * Returns the hash code of the Ability
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, mainSeries, generation, name, effectEntries,
                effectChanges, flavorTextEntries, pokemon);
    }

    /**
     * Returns a string representation of the Ability
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Ability{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isMainSeries=" + mainSeries +
                ", generation=" + generation +
                ", names=" + names +
                ", effectEntries=" + effectEntries +
                ", effectChanges=" + effectChanges +
                ", flavorTextEntries=" + flavorTextEntries +
                ", pokemon=" + pokemon +
                '}';
    }
}
