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
    private NamedApiResource<? extends PokeApiResource> pokeApiResource;

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
     * @return the {@link PokemonSpecies} or {@link PalParkArea} pokeApiResource
     */
    public NamedApiResource<? extends PokeApiResource> getPokeApiResource() { return pokeApiResource; }
    /**
     * Set the Pokémon species being encountered
     * @param pokeApiResource the {@link PokemonSpecies} or {@link PalParkArea} pokeApiResource
     */
    public void setPokeApiResource(NamedApiResource<? extends PokeApiResource> pokeApiResource) { this.pokeApiResource = pokeApiResource; }

    /**
     * Returns whether the given object o is
     * equal to this instance of PalParkEncounterSpecies
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PalParkEncounterSpecies that)) return false;
        return Objects.equals(getBaseScore(), that.getBaseScore()) && Objects.equals(getRate(), that.getRate()) && Objects.equals(getPokeApiResource(), that.getPokeApiResource());
    }

    /**
     * Returns the hash code of the PalParkEncounterSpecies
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBaseScore(), getRate(), getPokeApiResource());
    }

    /**
     * Returns a string representation of the PalParkEncounterSpecies
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PalParkEncounterSpecies{" +
                "baseScore=" + baseScore +
                ", rate=" + rate +
                ", namedApiResource=" + pokeApiResource +
                '}';
    }
}
