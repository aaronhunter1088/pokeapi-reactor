package skaro.pokeapi.resource.item;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.ApiResource;
import skaro.pokeapi.resource.GenerationGameIndex;
import skaro.pokeapi.resource.MachineVersionDetail;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VerboseEffect;
import skaro.pokeapi.resource.VersionGroupFlavorText;
import skaro.pokeapi.resource.evolutionchain.EvolutionChain;
import skaro.pokeapi.resource.itemattribute.ItemAttribute;
import skaro.pokeapi.resource.itemcategory.ItemCategory;
import skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect;
import skaro.pokeapi.utils.locale.Localizable;

import javax.validation.constraints.NotNull;

public class Item implements PokeApiResource, Localizable, Comparable<Item> {

	private Integer id;
	private String name;
	private Integer cost;
	private Integer flingPower;
	@JsonProperty("fling_effect")
	private NamedApiResource<ItemFlingEffect> flingEffect;
	private List<NamedApiResource<ItemAttribute>> attributes;
	private NamedApiResource<ItemCategory> category;
	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;
	@JsonProperty("flavor_text_entries")
	private List<VersionGroupFlavorText> flavorTextEntries;
	@JsonProperty("game_indices")
	private List<GenerationGameIndex> gameIndices;
	private List<Name> names;
	private ItemSprites sprites;
	@JsonProperty("held_by_pokemon")
	private List<ItemHolderPokemon> heldByPokemon;
	@JsonProperty("baby_trigger_for")
	private ApiResource<EvolutionChain> babyTriggerFor;
	private List<MachineVersionDetail> machines;

	/** Gets the id of the Item */
	public Integer getId() {
		return id;
	}
	/** Sets the id of the Item */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the Item */
	public String getName() {
		return name;
	}
	/** Sets the name of the Item */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the cost of the Item */
	public Integer getCost() {
		return cost;
	}
	/** Sets the cost of the Item */
	public void setCost(Integer cost) {
		this.cost = cost;
	}

	/** Gets the fling power of the Item */
	public Integer getFlingPower() {
		return flingPower;
	}
	/** Sets the fling power of the Item */
	public void setFlingPower(Integer flingPower) {
		this.flingPower = flingPower;
	}

	/** Gets the fling effect of the Item */
	public NamedApiResource<ItemFlingEffect> getFlingEffect() {
		return flingEffect;
	}
	/** Sets the fling effect of the Item */
	public void setFlingEffect(NamedApiResource<ItemFlingEffect> flingEffect) {
		this.flingEffect = flingEffect;
	}

	/** Gets the attributes of the Item */
	public List<NamedApiResource<ItemAttribute>> getAttributes() {
		return attributes;
	}
	/** Sets the attributes of the Item */
	public void setAttributes(List<NamedApiResource<ItemAttribute>> attributes) {
		this.attributes = attributes;
	}

	/** Gets the category of the Item */
	public NamedApiResource<ItemCategory> getCategory() {
		return category;
	}
	/** Sets the category of the Item */
	public void setCategory(NamedApiResource<ItemCategory> category) {
		this.category = category;
	}

	/** Gets the effect entries of the Item */
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	/** Sets the effect entries of the Item */
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/** Gets the flavor text entries of the Item */
	public List<VersionGroupFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/** Sets the flavor text entries of the Item */
	public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/** Gets the game indices of the Item */
	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}
	/** Sets the game indices of the Item */
	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	/** Gets the names of the Item */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names of the Item */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the sprites of the Item */
	public ItemSprites getSprites() {
		return sprites;
	}
	/** Sets the sprites of the Item */
	public void setSprites(ItemSprites sprites) {
		this.sprites = sprites;
	}

	/** Gets the Pokemon that hold the Item */
	public List<ItemHolderPokemon> getHeldByPokemon() {
		return heldByPokemon;
	}
	/** Sets the Pokemon that hold the Item */
	public void setHeldByPokemon(List<ItemHolderPokemon> heldByPokemon) {
		this.heldByPokemon = heldByPokemon;
	}

	/** Gets the EvolutionChain that the Item is a baby trigger for */
	public ApiResource<EvolutionChain> getBabyTriggerFor() {
		return babyTriggerFor;
	}
	/** Sets the EvolutionChain that the Item is a baby trigger for */
	public void setBabyTriggerFor(ApiResource<EvolutionChain> babyTriggerFor) {
		this.babyTriggerFor = babyTriggerFor;
	}

	/** Gets the machines that teach the Item to Pokemon */
	public List<MachineVersionDetail> getMachines() {
		return machines;
	}
	/** Sets the machines that teach the Item to Pokemon */
	public void setMachines(List<MachineVersionDetail> machines) {
		this.machines = machines;
	}

	/**
	 * Returns whether the given object o
	 * is equal to this instance of Item
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Item item)) return false;
        return Objects.equals(getId(), item.getId()) && Objects.equals(getName(), item.getName()) && Objects.equals(getCost(), item.getCost()) && Objects.equals(getFlingPower(), item.getFlingPower()) && Objects.equals(getFlingEffect(), item.getFlingEffect()) && Objects.equals(getAttributes(), item.getAttributes()) && Objects.equals(getCategory(), item.getCategory()) && Objects.equals(getEffectEntries(), item.getEffectEntries()) && Objects.equals(getFlavorTextEntries(), item.getFlavorTextEntries()) && Objects.equals(getGameIndices(), item.getGameIndices()) && Objects.equals(getNames(), item.getNames()) && Objects.equals(getSprites(), item.getSprites()) && Objects.equals(getHeldByPokemon(), item.getHeldByPokemon()) && Objects.equals(getBabyTriggerFor(), item.getBabyTriggerFor()) && Objects.equals(getMachines(), item.getMachines());
	}

	/** Returns the hash code of the Item */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getCost(), getFlingPower(), getFlingEffect(), getAttributes(), getCategory(), getEffectEntries(), getFlavorTextEntries(), getGameIndices(), getNames(), getSprites(), getHeldByPokemon(), getBabyTriggerFor(), getMachines());
	}

	/** Returns a string representation of the Item */
	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", name='" + name + '\'' +
				", cost=" + cost +
				", flingPower=" + flingPower +
				", flingEffect=" + flingEffect +
				", attributes=" + attributes +
				", category=" + category +
				", effectEntries=" + effectEntries +
				", flavorTextEntries=" + flavorTextEntries +
				", gameIndices=" + gameIndices +
				", names=" + names +
				", sprites=" + sprites +
				", heldByPokemon=" + heldByPokemon +
				", babyTriggerFor=" + babyTriggerFor +
				", machines=" + machines +
				'}';
	}

	/**
	 * Compares the id and name of the item
	 * @param item the item to be compared.
	 * @return 0 if the id and name are the same, 1 otherwise
	 */
	@Override
	public int compareTo(@NotNull Item item) {
		int idCompare = this.getId().compareTo(item.getId());
		if (idCompare == 0)
			return this.getName().compareTo(item.getName());
		return idCompare;
	}
}
