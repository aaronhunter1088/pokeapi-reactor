package skaro.pokeapi.resource.locationarea;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VersionEncounterDetail;
import skaro.pokeapi.resource.pokemon.Pokemon;

public class PokemonEncounter {

	@JsonProperty("pokemon")
	private NamedApiResource<Pokemon> pokemon;
	@JsonProperty("version_details")
	private List<VersionEncounterDetail> versionDetails;

	/**
	 * Gets the Pokemon being encountered
	 * @return the {@link NamedApiResource<Pokemon>} Pokemon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Sets the Pokemon being encountered
	 * @param pokemon the {@link NamedApiResource<Pokemon>} Pokemon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/** Gets the details of the encounter */
	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}
	/** Sets the details of the encounter */
	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

	/**
	 * Checks whether the PokemonEncounter is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonEncounter that)) return false;
        return Objects.equals(getPokemon(), that.getPokemon()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
	}

	/**
	 * Generate a hash code for the PokemonEncounter
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getPokemon(), getVersionDetails());
	}

	/**
	 * Returns a string representation of the PokemonEncounter
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "PokemonEncounter{" +
				"pokemon=" + pokemon +
				", versionDetails=" + versionDetails +
				'}';
	}
}
