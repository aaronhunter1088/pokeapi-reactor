package skaro.pokeapi.resource.ability;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

public class AbilityPokemon {

	private Boolean isHidden;
	private Integer slot;
	private NamedApiResource<Pokemon> pokemon;

	/**
	 * Get whether or not this a hidden
	 * ability for the referenced Pokémon
	 * @return the isHidden
	 */
	public Boolean isHidden() {
		return isHidden;
	}

	/**
	 * Set whether or not this a hidden
	 * @param isHidden the isHidden
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * Get Pokémon have 3 ability 'slots' which hold
	 * references to possible abilities they could have.
	 * This is the slot of this ability for the
	 * referenced pokemon
	 * @return the slot
	 */
	public Integer getSlot() {
		return slot;
	}

	/**
	 * Set the slot of this ability for the
	 * @param slot the slot
	 */
	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	/**
	 * Get the Pokémon that has the referenced ability
	 * @return the pokemon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}

	/**
	 * Set the Pokémon that has the referenced ability
	 * @param pokemon the pokemon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
}
