package skaro.pokeapi.resource.item;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

public class ItemHolderPokemonVersionDetail {

	private Integer rarity;
	private NamedApiResource<Version> version;

	/** Gets the rarity of the item held by the pokemon */
	public Integer getRarity() {
		return rarity;
	}
	/** Sets the rarity of the item held by the pokemon */
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	/** Gets the version the item is held in by the pokemon */
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	/** Sets the version the item is held in by the pokemon */
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}

	/**
	 * Checks whether the ItemHolderPokemonVersionDetail is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemHolderPokemonVersionDetail that)) return false;
        return Objects.equals(getRarity(), that.getRarity()) && Objects.equals(getVersion(), that.getVersion());
	}

	/**
	 * Generate a hash code for the ItemHolderPokemonVersionDetail
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getRarity(), getVersion());
	}

	/**
	 * Returns a string representation of the ItemHolderPokemonVersionDetail
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "ItemHolderPokemonVersionDetail{" +
				"rarity=" + rarity +
				", version=" + version +
				'}';
	}
}
