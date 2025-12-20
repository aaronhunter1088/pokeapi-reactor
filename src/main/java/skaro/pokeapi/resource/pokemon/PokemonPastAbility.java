package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.generation.Generation;

import java.util.List;
import java.util.Objects;

public class PokemonPastAbility {

    private List<PokemonAbility> abilities;
    private NamedApiResource<Generation> generation;

    /**
     * Get the abilities
     *
     * @return the abilities
     */
    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    /**
     * Set the abilities
     *
     * @param abilities the abilities
     */
    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    /**
     * Get the generation
     *
     * @return the generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the generation
     *
     * @param generation the generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonPastAbility
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonPastAbility that)) return false;
        return Objects.equals(getAbilities(), that.getAbilities()) && Objects.equals(getGeneration(), that.getGeneration());
    }

    /**
     * Returns the hash code of the PokemonPastAbility
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getAbilities(), getGeneration());
    }

    /**
     * Returns a string representation of the PokemonPastAbility
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonPastAbility{" +
                "abilities=" + abilities +
                ", generation=" + generation +
                '}';
    }
}
