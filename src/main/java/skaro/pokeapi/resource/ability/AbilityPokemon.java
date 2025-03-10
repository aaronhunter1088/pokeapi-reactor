package skaro.pokeapi.resource.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

import java.util.Objects;

public class AbilityPokemon {

	@JsonProperty("is_hidden")
	private Boolean isHidden;
	private Integer slot;
	private NamedApiResource<Pokemon> pokemon;

	/**
	 * Get whether or not this a hidden
	 * ability for the referenced Pokémon
	 * @return isHidden
	 */
	public Boolean isHidden() {
		return isHidden;
	}

	/**
	 * Set whether or not this a hidden
	 * ability for the referenced Pokémon
	 * @param isHidden isHidden
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * Get the slot of this ability for the
	 * referenced Pokemon. Pokémon have 3
	 * ability 'slots' which hold references
	 * to possible abilities they could have.
	 * @return the slot
	 */
	public Integer getSlot() {
		return slot;
	}

	/**
	 * Set the slot of this ability for the
	 * referenced Pokemon. Pokémon have 3
	 * ability 'slots' which hold references
	 * to possible abilities they could have.
	 * @param slot the slot
	 */
	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	/**
	 * Get the Pokémon this ability could belong to
	 * @return the {@link NamedApiResource<Pokemon>} pokemon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}

	/**
	 * Set the Pokémon this ability could belong to
	 * @param pokemon the {@link NamedApiResource<Pokemon>} pokemon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of AbilityPokemon
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof AbilityPokemon that)) return false;
        return Objects.equals(isHidden, that.isHidden) && Objects.equals(getSlot(), that.getSlot()) && Objects.equals(getPokemon(), that.getPokemon());
	}

	/**
	 * Returns the hash code of the AbilityPokemon
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(isHidden, getSlot(), getPokemon());
	}

	/**
	 * Returns a string representation of the AbilityPokemon
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "AbilityPokemon{" +
				"isHidden=" + isHidden +
				", slot=" + slot +
				", pokemon=" + pokemon +
				'}';
	}
}
