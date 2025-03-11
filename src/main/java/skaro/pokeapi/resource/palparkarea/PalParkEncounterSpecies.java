package skaro.pokeapi.resource.palparkarea;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.Objects;

/**
 * Represents a Pokémon species that can
 * be encountered in a pal park area
 */
public class PalParkEncounterSpecies {

    @JsonProperty("base_score")
    private Integer baseScore;
    private Integer rate;
    @JsonAlias({"area", "pokemon_species"})
    private NamedApiResource<? extends PokeApiResource> namedApiResource;

    /**
     * Get the base score given to the player
     * when this Pokémon is caught during a pal park run
     * @return the base score
     */
    public Integer getBaseScore() { return baseScore; }
    /**
     * Set the base score given to the player
     * @param baseScore the base score
     */
    public void setBaseScore(Integer baseScore) { this.baseScore = baseScore; }

    /**
     * Get the base rate for encountering this Pokémon in this pal park area
     * @return the rate
     */
    public Integer getRate() { return rate; }
    /**
     * Set the base rate for encountering this Pokémon in this pal park area
     * @param rate the rate
     */
    public void setRate(Integer rate) { this.rate = rate; }

    /**
     * Get the Pokémon species being encountered
     * PokemonSpecies (area), or PalParkArea (pokemon_species)
     * @return the {@link NamedApiResource<PokemonSpecies>}
     */
    public NamedApiResource<? extends PokeApiResource> getNamedApiResource() { return namedApiResource; }
    /**
     * Set the Pokémon species being encountered
     * PokemonSpecies (area), or PalParkArea (pokemon_species)
     * @param namedApiResource the {@link NamedApiResource<PokemonSpecies>}
     */
    public void setNamedApiResource(NamedApiResource<? extends PokeApiResource> namedApiResource) { this.namedApiResource = namedApiResource; }

    /**
     * Compares this Pokémon entry to another object for equality.
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PalParkEncounterSpecies that)) return false;
        return Objects.equals(getBaseScore(), that.getBaseScore()) && Objects.equals(getRate(), that.getRate()) && Objects.equals(getNamedApiResource(), that.getNamedApiResource());
    }

    /**
     * Generates a hash code for this Pokémon entry
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBaseScore(), getRate(), getNamedApiResource());
    }

    /**
     * Returns a string representation of the Pokémon entry
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PalParkEncounterSpecies{" +
                "baseScore=" + baseScore +
                ", rate=" + rate +
                ", namedApiResource=" + namedApiResource +
                '}';
    }
}
