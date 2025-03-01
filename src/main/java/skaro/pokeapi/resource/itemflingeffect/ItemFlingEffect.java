package skaro.pokeapi.resource.itemflingeffect;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Effect;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;

public class ItemFlingEffect implements PokeApiResource {

	private Integer id;
	private String name;
	@JsonProperty("effect_entries")
	private List<Effect> effectEntries;
	private List<NamedApiResource<Item>> items;

	/** Gets the id of this fling effect */
	public Integer getId() {
		return id;
	}
	/** Sets the id of this fling effect */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of this fling effect */
	public String getName() {
		return name;
	}
	/** Sets the name of this fling effect */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the effect entries of this fling effect */
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}
	/** Sets the effect entries of this fling effect */
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/** Gets the items that have this fling effect */
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	/** Sets the items that have this fling effect */
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}

	/** Returns true if the ItemFlingEffect is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemFlingEffect that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getEffectEntries(), that.getEffectEntries()) && Objects.equals(getItems(), that.getItems());
	}

	/** Returns the hash code of the ItemFlingEffect */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getEffectEntries(), getItems());
	}

	/** Returns a string representation of the ItemFlingEffect */
	@Override
	public String toString() {
		return "ItemFlingEffect{" +
				"id=" + id +
				", name='" + name + '\'' +
				", effectEntries=" + effectEntries +
				", items=" + items +
				'}';
	}
}
