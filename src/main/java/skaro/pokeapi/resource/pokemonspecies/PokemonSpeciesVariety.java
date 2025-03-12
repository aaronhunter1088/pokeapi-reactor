package skaro.pokeapi.resource.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

import java.util.Objects;

public class PokemonSpeciesVariety {

	@JsonProperty("is_default")
	private Boolean isDefault;
	private NamedApiResource<Pokemon> pokemon;

	/**
	 * Get whether this variety is the default variety.
	 * @return isDefault
	 */
	public Boolean isDefault() {
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
	 * @return the {@link Pokemon} of the Pokémon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Set the Pokémon variety
	 * @param pokemon the {@link Pokemon} of the Pokémon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of PokemonSpeciesVariety
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSpeciesVariety that)) return false;
        return Objects.equals(isDefault(), that.isDefault()) && Objects.equals(getPokemon(), that.getPokemon());
	}

	/**
	 * Returns the hash code of the PokemonSpeciesVariety
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(isDefault(), getPokemon());
	}

	/**
	 * Returns a string representation of the PokemonSpeciesVariety
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
