package skaro.pokeapi.resource.item;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.version.Version;

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
	
}
