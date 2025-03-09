package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.type.Type;

import java.util.Objects;

public class PokemonType {

	private Integer slot;
	private NamedApiResource<Type> type;

	/**
	 * Get the order the Pokémon's types are listed in
	 * @return the slot
	 */
	public Integer getSlot() {
		return slot;
	}
	/**
	 * Set the order the Pokémon's types are listed in
	 * @param slot the slot
	 */
	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	/**
	 * Get the type of the Pokémon
	 * @return the {@link Type} of the Pokémon
	 */
	public NamedApiResource<Type> getType() {
		return type;
	}
	/**
	 * Set the type of the Pokémon
	 * @param type the {@link Type} of the Pokémon
	 */
	public void setType(NamedApiResource<Type> type) {
		this.type = type;
	}

	/**
	 * Check if this PokemonType is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonType that)) return false;
        return Objects.equals(getSlot(), that.getSlot()) && Objects.equals(getType(), that.getType());
	}

	/**
	 * Generate a hash code for this PokemonType
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getSlot(), getType());
	}

	/**
	 * Get a String representation of this PokemonType
	 * @return the String representation
	 */
	@Override
	public String toString() {
		return "PokemonType{" +
				"slot=" + slot +
				", type=" + type +
				'}';
	}
}
