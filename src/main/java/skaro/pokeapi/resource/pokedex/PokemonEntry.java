package skaro.pokeapi.resource.pokedex;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.Objects;

/**
 * Represents the PokemonEntry resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PokemonEntry {

    @JsonProperty("entry_number")
    private Integer entryNumber;
    @JsonProperty("pokemon_species")
    private NamedApiResource<PokemonSpecies> pokemonSpecies;

    /**
     * Get the index of this Pokémon species entry within the Pokédex
     *
     * @return the entryNumber
     */
    public Integer getEntryNumber() {
        return entryNumber;
    }

    /**
     * Set the index of this Pokémon species entry within the Pokédex
     *
     * @param entryNumber the entryNumber
     */
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    /**
     * Get the Pokémon species referenced in this entry
     *
     * @return the {@link PokemonSpecies} of the Pokémon species
     */
    public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set the Pokémon species referenced in this entry
     *
     * @param pokemonSpecies the {@link PokemonSpecies}
     */
    public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonEntry
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonEntry that)) return false;
        return Objects.equals(getEntryNumber(), that.getEntryNumber()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
    }

    /**
     * Returns the hash code of the PokemonEntry
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getEntryNumber(), getPokemonSpecies());
    }

    /**
     * Returns a string representation of the PokemonEntry
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonEntry{" +
                "entryNumber=" + entryNumber +
                ", pokemonSpecies=" + pokemonSpecies +
                '}';
    }
}
