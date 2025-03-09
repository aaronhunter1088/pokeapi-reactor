package skaro.pokeapi.resource.type;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

import java.util.Objects;

public class TypePokemon {

	private Integer slot;
	private NamedApiResource<Pokemon> pokemon;

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
	 * Get the Pokémon that has the referenced type
	 * @return the {@link NamedApiResource} Pokémon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Set the Pokémon that has the referenced type
	 * @param pokemon the {@link NamedApiResource} Pokémon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/** Returns whether the TypePokemon is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof TypePokemon that)) return false;
        return Objects.equals(getSlot(), that.getSlot()) && Objects.equals(getPokemon(), that.getPokemon());
	}

	/** Returns the hash code of the TypePokemon */
	@Override
	public int hashCode() {
		return Objects.hash(getSlot(), getPokemon());
	}

	/** Returns the string representation of the TypePokemon */
	@Override
	public String toString() {
		return "TypePokemon{" +
				"slot=" + slot +
				", pokemon=" + pokemon +
				'}';
	}
}
