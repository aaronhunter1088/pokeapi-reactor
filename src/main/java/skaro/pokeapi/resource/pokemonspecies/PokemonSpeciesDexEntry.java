package skaro.pokeapi.resource.pokemonspecies;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokedex.Pokedex;

import java.util.Objects;

public class PokemonSpeciesDexEntry {

	private Integer entryNumber;
	private NamedApiResource<Pokedex> pokedex;

	/**
	 * Get the index number within the Pokédex
	 * @return the index number
	 */
	public Integer getEntryNumber() {
		return entryNumber;
	}
	/**
	 * Set the index number within the Pokédex
	 * @param entryNumber the index number
	 */
	public void setEntryNumber(Integer entryNumber) {
		this.entryNumber = entryNumber;
	}

	/**
	 * Get the Pokédex the referenced
	 * Pokémon species can be found in.
	 * @return the {@link NamedApiResource} of the Pokédex
	 */
	public NamedApiResource<Pokedex> getPokedex() {
		return pokedex;
	}
	/**
	 * Set the Pokédex the referenced
	 * Pokémon species can be found in.
	 * @param pokedex the {@link NamedApiResource} of the Pokédex
	 */
	public void setPokedex(NamedApiResource<Pokedex> pokedex) {
		this.pokedex = pokedex;
	}

	/**
	 * Checks if the PokemonSpeciesDexEntry is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSpeciesDexEntry that)) return false;
        return Objects.equals(getEntryNumber(), that.getEntryNumber()) && Objects.equals(getPokedex(), that.getPokedex());
	}

	/**
	 * Generates a hash code for the PokemonSpeciesDexEntry
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getEntryNumber(), getPokedex());
	}

	/**
	 * Generates a string representation of the PokemonSpeciesDexEntry
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonSpeciesDexEntry{" +
				"entryNumber=" + entryNumber +
				", pokedex=" + pokedex +
				'}';
	}
}
