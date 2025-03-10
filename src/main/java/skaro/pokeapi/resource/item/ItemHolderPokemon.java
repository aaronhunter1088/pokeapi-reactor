package skaro.pokeapi.resource.item;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

public class ItemHolderPokemon {

	private NamedApiResource<Pokemon> pokemon;
	@JsonProperty("version_details")
	private List<ItemHolderPokemonVersionDetail> versionDetails;

	/** Gets the pokemon that holds the item */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/** Sets the pokemon that holds the item */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/** Gets the details for the version that the item is held in by the pokemon */
	public List<ItemHolderPokemonVersionDetail> getVersionDetails() {
		return versionDetails;
	}
	/** Sets the details for the version that the item is held in by the pokemon */
	public void setVersionDetails(List<ItemHolderPokemonVersionDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

	/**
	 * Checks whether the ItemHolderPokemon is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemHolderPokemon that)) return false;
        return Objects.equals(getPokemon(), that.getPokemon()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
	}

	/**
	 * Generate a hash code for the ItemHolderPokemon
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getPokemon(), getVersionDetails());
	}

	/**
	 * Returns a string representation of the ItemHolderPokemon
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "ItemHolderPokemon{" +
				"pokemon=" + pokemon +
				", versionDetails=" + versionDetails +
				'}';
	}
}
