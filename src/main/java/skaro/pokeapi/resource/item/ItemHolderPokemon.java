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

	/**
	 * Get the pokemon that holds this item
	 * @return the {@link Pokemon} pokemon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Set the pokemon that holds this item
	 * @param pokemon the {@link Pokemon} pokemon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/**
	 * Get the details for the version that this
	 * item is held in by the Pokémon
	 * @return the list of {@link ItemHolderPokemonVersionDetail} version details
	 */
	public List<ItemHolderPokemonVersionDetail> getVersionDetails() {
		return versionDetails;
	}
	/**
	 * Set the details for the version that this
	 * item is held in by the Pokémon
	 * @param versionDetails the list of {@link ItemHolderPokemonVersionDetail} version details
	 */
	public void setVersionDetails(List<ItemHolderPokemonVersionDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of ItemHolderPokemon
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemHolderPokemon that)) return false;
        return Objects.equals(getPokemon(), that.getPokemon()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
	}

	/**
	 * Returns the hash code of the ItemHolderPokemon
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getPokemon(), getVersionDetails());
	}

	/**
	 * Returns a string representation of the ItemHolderPokemon
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "ItemHolderPokemon{" +
				"pokemon=" + pokemon +
				", versionDetails=" + versionDetails +
				'}';
	}
}
