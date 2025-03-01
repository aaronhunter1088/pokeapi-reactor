package skaro.pokeapi.resource.item;

import java.util.List;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;

public class ItemHolderPokemon {

	private NamedApiResource<Pokemon> pokemon;
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

}
