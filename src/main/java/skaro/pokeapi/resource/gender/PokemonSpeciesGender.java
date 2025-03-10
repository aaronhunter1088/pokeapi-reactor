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
	 * Get the chance of this Pokémon being female, in eighths; or -1 for genderless
	 * @return the rate
	 */
	public Integer getRate() {
		return rate;
	}
	/**
	 * Set the chance of this Pokémon being female, in eighths; or -1 for genderless
	 * @param rate the rate
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	/**
	 * Get a Pokémon species that can be the referenced gender
	 * @return the Pokémon species
	 */
	public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Set a Pokémon species that can be the referenced gender
	 * @param pokemonSpecies the Pokémon species
	 */
	public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Two PokemonSpeciesGender are considered equal if they have the same rate and PokemonSpecies
	 * @param o object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSpeciesGender that)) return false;
        return Objects.equals(getRate(), that.getRate()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/**
	 * Generate a hash code for the PokemonSpeciesGender
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getRate(), getPokemonSpecies());
	}

	/**
	 * Returns a string representation of the PokemonSpeciesGender
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "PokemonSpeciesGender{" +
				"rate=" + rate +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
