package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.ability.Ability;

import java.util.Objects;

public class PokemonAbility {

	private Boolean isHidden;
	private Integer slot;
	private NamedApiResource<Ability> ability;

	/**
	 * Get whether or not this is a hidden ability
	 * @return isHidden
	 */
	public Boolean isHidden() {
		return isHidden;
	}
	/**
	 * Set whether or not this is a hidden ability
	 * @param isHidden whether or not this is a hidden ability
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * Get the slot this ability occupies in this Pokémon species
	 * @return slot
	 */
	public Integer getSlot() {
		return slot;
	}
	/**
	 * Set the slot this ability occupies in this Pokémon species
	 * @param slot the slot this ability occupies in this Pokémon species
	 */
	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	/**
	 * Get the ability the Pokémon may have
	 * @return the {@link Ability} the Pokémon may have
	 */
	public NamedApiResource<Ability> getAbility() {
		return ability;
	}
	/**
	 * Set the ability the Pokémon may have
	 * @param ability the {@link Ability} the Pokémon may have
	 */
	public void setAbility(NamedApiResource<Ability> ability) {
		this.ability = ability;
	}

	/**
	 * Check if this PokemonAbility is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonAbility that)) return false;
        return Objects.equals(isHidden, that.isHidden) && Objects.equals(getSlot(), that.getSlot()) && Objects.equals(getAbility(), that.getAbility());
	}

	/**
	 * Generate a hash code for this PokemonAbility
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(isHidden, getSlot(), getAbility());
	}

	/**
	 * Get a String representation of this PokemonAbility
	 * @return the String representation
	 */
	@Override
	public String toString() {
		return "PokemonAbility{" +
				"isHidden=" + isHidden +
				", slot=" + slot +
				", ability=" + ability +
				'}';
	}
}
