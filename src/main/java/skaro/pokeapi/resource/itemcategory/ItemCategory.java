package skaro.pokeapi.resource.itemcategory;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.itempocket.ItemPocket;
import skaro.pokeapi.utils.locale.Localizable;

public class ItemCategory implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private NamedApiResource<ItemPocket> pocket;

	/**
	 * Get the id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Set the id
	 * @param id the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the name for this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name for this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get a list of items that are a part of this category
	 * @return a list of {@link NamedApiResource<Item>} objects
	 */
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	/**
	 * Set a list of items that are a part of this category
	 * @param items a list of {@link NamedApiResource<Item>} objects
	 */
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}

	/**
	 * Get the name of the category in different languages
	 * @return a list of {@link Name} objects
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of the category in different languages
	 * @param names a list of {@link Name} objects
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get the pocket containing this category
	 * @return a {@link NamedApiResource<ItemPocket>} object
	 */
	public NamedApiResource<ItemPocket> getPocket() {
		return pocket;
	}
	/**
	 * Set the pocket containing this category
	 * @param pocket a {@link NamedApiResource<ItemPocket>} object
	 */
	public void setPocket(NamedApiResource<ItemPocket> pocket) {
		this.pocket = pocket;
	}

	/**
	 * Checks whether the ItemCategory is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemCategory that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getItems(), that.getItems()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPocket(), that.getPocket());
	}

	/**
	 * Generate a hash code for the ItemCategory
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getItems(), getNames(), getPocket());
	}

	/**
	 * Convert the ItemCategory to a String
	 * @return a String representation of this object
	 */
	@Override
	public String toString() {
		return "ItemCategory{" +
				"id=" + id +
				", name='" + name + '\'' +
				", items=" + items +
				", names=" + names +
				", pocket=" + pocket +
				'}';
	}
}
