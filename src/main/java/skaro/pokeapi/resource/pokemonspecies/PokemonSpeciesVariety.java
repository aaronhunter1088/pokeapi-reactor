package skaro.pokeapi.resource.pokemonspecies;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

import java.util.Objects;

public class PokemonSpeciesVariety {

	private Boolean isDefault;
	private NamedApiResource<Pokemon> pokemon;

	/**
	 * Get whether this variety is the default variety.
	 * @return isDefault
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}
	/**
	 * Set whether this variety is the default variety.
	 * @param isDefault isDefault
	 */
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * Get the Pokémon variety
	 * @return the {@link NamedApiResource} of the Pokémon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Set the Pokémon variety
	 * @param pokemon the {@link NamedApiResource} of the Pokémon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/**
	 * Checks if the PokemonSpeciesVariety is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSpeciesVariety that)) return false;
        return Objects.equals(getIsDefault(), that.getIsDefault()) && Objects.equals(getPokemon(), that.getPokemon());
	}

	/**
	 * Generates a hash code for the PokemonSpeciesVariety
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getIsDefault(), getPokemon());
	}

	/**
	 * Generates a string representation of the PokemonSpeciesVariety
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonSpeciesVariety{" +
				"isDefault=" + isDefault +
				", pokemon=" + pokemon +
				'}';
	}
}
