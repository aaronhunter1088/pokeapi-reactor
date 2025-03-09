package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.generation.Generation;

import java.util.List;
import java.util.Objects;

public class PokemonTypePast {

    private NamedApiResource<Generation> generation;
    private List<PokemonType> types;

    /**
     * Get the last generation in which the referenced pokémon had the listed types
     * @return the {@link Generation}
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }
    /**
     * Set the last generation in which the referenced pokémon had the listed types
     * @param generation the {@link Generation}
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the types the referenced pokémon had up to and including the listed generation
     * @return the {@link PokemonType}
     */
    public List<PokemonType> getTypes() {
        return types;
    }
    /**
     * Set the types the referenced pokémon had up to and including the listed generation
     * @param types the {@link PokemonType}
     */
    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    /**
     * Check if this PokemonTypePast is equal to another object
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonTypePast that)) return false;
        return Objects.equals(getGeneration(), that.getGeneration()) && Objects.equals(getTypes(), that.getTypes());
    }

    /**
     * Generate a hash code for this PokemonTypePast
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGeneration(), getTypes());
    }

    /**
     * Generate a string representation of this PokemonTypePast
     * @return a string representation
     */
    @Override
    public String toString() {
        return "PokemonTypePast{" +
                "generation=" + generation +
                ", types=" + types +
                '}';
    }
}
