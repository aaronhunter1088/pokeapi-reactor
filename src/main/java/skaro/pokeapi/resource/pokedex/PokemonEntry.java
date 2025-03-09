package skaro.pokeapi.resource.pokedex;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.Objects;

public class PokemonEntry {

	private Integer entryNumber;
	private NamedApiResource<PokemonSpecies> pokemonSpecies;

	/**
	 * Get the index of this Pokémon species entry within the Pokédex
	 * @return the entryNumber
	 */
	public Integer getEntryNumber() {
		return entryNumber;
	}
	/**
	 * Set the index of this Pokémon species entry within the Pokédex
	 * @param entryNumber the entryNumber
	 */
	public void setEntryNumber(Integer entryNumber) {
		this.entryNumber = entryNumber;
	}

	/**
	 * Get the Pokémon species referenced in this entry
	 * @return the {@link NamedApiResource<PokemonSpecies>} of the Pokémon species
	 */
	public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Set the Pokémon species referenced in this entry
	 * @param pokemonSpecies the {@link NamedApiResource<PokemonSpecies>}
	 */
	public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Compares this Pokémon entry to another object for equality.
	 * Returns true if the object is an instance of
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonEntry that)) return false;
        return Objects.equals(getEntryNumber(), that.getEntryNumber()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/**
	 * Generates a hash code for this Pokémon entry
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getEntryNumber(), getPokemonSpecies());
	}

	/**
	 * Returns the string representation of the Pokémon entry
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
