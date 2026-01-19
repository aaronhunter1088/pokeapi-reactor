package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.generation.Generation;

import java.util.List;
import java.util.Objects;

/**
 * Represents the types a Pokémon had in a past generation
 *
 * @author Joost Franssen
 * @since 1.0.4
 */
public class PokemonTypePast {

    private NamedApiResource<Generation> generation;
    private List<PokemonType> types;

    /**
     * Get the last generation in which the referenced pokémon had the listed types
     *
     * @return the {@link Generation}
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the last generation in which the referenced pokémon had the listed types
     *
     * @param generation the {@link Generation}
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the types the referenced pokémon had up to and including the listed generation
     *
     * @return the {@link PokemonType}
     */
    public List<PokemonType> getTypes() {
        return types;
    }

    /**
     * Set the types the referenced pokémon had up to and including the listed generation
     *
     * @param types the {@link PokemonType}
     */
    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonTypePast
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonTypePast that)) return false;
        return Objects.equals(getGeneration(), that.getGeneration()) && Objects.equals(getTypes(), that.getTypes());
    }

    /**
     * Returns the hash code of the PokemonTypePast
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGeneration(), getTypes());
    }

    /**
     * Returns a string representation of the PokemonTypePast
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonTypePast{" +
                "generation=" + generation +
                ", types=" + types +
                '}';
    }
}
