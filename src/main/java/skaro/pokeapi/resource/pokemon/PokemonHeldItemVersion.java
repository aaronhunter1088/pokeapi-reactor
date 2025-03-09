package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

public class PokemonHeldItemVersion {

	private NamedApiResource<Version> version;
	private Integer rarity;

	/**
	 * Get the version in which the item is held
	 * @return the {@link Version} in which the item is held
	 */
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	/**
	 * Set the version in which the item is held
	 * @param version the {@link Version} in which the item is held
	 */
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}

	/**
	 * Get how often the item is held
	 * @return the rarity
	 */
	public Integer getRarity() {
		return rarity;
	}
	/**
	 * Set how often the item is held
	 * @param rarity how often the item is held
	 */
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	/**
	 * Check if this PokemonHeldItemVersion is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonHeldItemVersion that)) return false;
        return Objects.equals(getVersion(), that.getVersion()) && Objects.equals(getRarity(), that.getRarity());
	}

	/**
	 * Generate a hash code for this PokemonHeldItemVersion
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getVersion(), getRarity());
	}

	/**
	 * Get a String representation of this PokemonHeldItemVersion
	 * @return the String representation
	 */
	@Override
	public String toString() {
		return "PokemonHeldItemVersion{" +
				"version=" + version +
				", rarity=" + rarity +
				'}';
	}
}
