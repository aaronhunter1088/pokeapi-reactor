package skaro.pokeapi.resource.evolutionchain;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeResource;
import skaro.pokeapi.resource.item.Item;

public class EvolutionChain implements PokeResource {

	private Integer id;
	private NamedApiResource<Item> babyTriggerItem;
	private ChainLink chain;

	/** Gets the id for this evolution chain resource */
	public Integer getId() {
		return id;
	}
	/** Sets the id for this evolution chain resource */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the item that a Pokemon must be holding
	 * when leveling up to evolve into a Pokemon in
	 * this evolution chain
	 */
	public NamedApiResource<Item> getBabyTriggerItem() {
		return babyTriggerItem;
	}
	/**
	 * Sets the item that a Pokemon must be holding
	 * when leveling up to evolve into a Pokemon in
	 * this evolution chain
	 */
	public void setBabyTriggerItem(NamedApiResource<Item> babyTriggerItem) {
		this.babyTriggerItem = babyTriggerItem;
	}

	/** Gets the chain of Pokemon species that make up this evolution chain */
	public ChainLink getChain() {
		return chain;
	}
	/** Sets the chain of Pokemon species that make up this evolution chain */
	public void setChain(ChainLink chain) {
		this.chain = chain;
	}
	
}
