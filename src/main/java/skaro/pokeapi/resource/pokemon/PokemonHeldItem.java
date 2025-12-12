package skaro.pokeapi.resource.pokemon;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.item.Item;

public class PokemonHeldItem {

	private NamedApiResource<Item> item;
	@JsonProperty("version_details")
	private List<PokemonHeldItemVersion> versionDetails;

	/**
	 * Get the item the referenced Pokémon holds
	 * @return the {@link Item} the referenced Pokémon holds
	 */
	public NamedApiResource<Item> getItem() {
		return item;
	}
	/**
	 * Set the item the referenced Pokémon holds
	 * @param item the {@link Item} the referenced Pokémon holds
	 */
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}

	/**
	 * Get the details of the versions in which the item is held
	 * @return versionDetails the list of {@link PokemonHeldItemVersion}
	 * details of the versions in which the item is held
	 */
	public List<PokemonHeldItemVersion> getVersionDetails() {
		return versionDetails;
	}
	/**
	 * Set the details of the versions in which the item is held
	 * @param versionDetails the list of {@link PokemonHeldItemVersion}
	 * details of the versions in which the item is held
	 */
	public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
		this.versionDetails = versionDetails;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of PokemonHeldItem
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonHeldItem that)) return false;
        return Objects.equals(getItem(), that.getItem()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
	}

	/**
	 * Returns the hash code of the PokemonHeldItem
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getItem(), getVersionDetails());
	}

	/**
	 * Returns a string representation of the PokemonHeldItem
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonHeldItem{" +
				"item=" + item +
				", versionDetails=" + versionDetails +
				'}';
	}
}
