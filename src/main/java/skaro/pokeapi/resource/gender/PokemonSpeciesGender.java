package skaro.pokeapi.resource.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.Objects;

public class PokemonSpeciesGender {

    private Integer rate;
    @JsonProperty("pokemon_species")
    private NamedApiResource<PokemonSpecies> pokemonSpecies;

    /**
     * Get the chance of this Pokémon being female,
     * in eighths; or -1 for genderless
     *
     * @return the rate
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * Set the chance of this Pokémon being female,
     * in eighths; or -1 for genderless
     *
     * @param rate the rate
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * Get a Pokémon species that can be the referenced gender
     *
     * @return the {@link PokemonSpecies} Pokémon species
     */
    public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set a Pokémon species that can be the referenced gender
     *
     * @param pokemonSpecies the Pokémon species
     */
    public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonSpeciesGender
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonSpeciesGender that)) return false;
        return Objects.equals(getRate(), that.getRate()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
    }

    /**
     * Returns the hash code of the PokemonSpeciesGender
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRate(), getPokemonSpecies());
    }

    /**
     * Returns a string representation of the PokemonSpeciesGender
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonSpeciesGender{" +
                "rate=" + rate +
                ", pokemonSpecies=" + pokemonSpecies +
                '}';
    }
}
