package skaro.pokeapi.resource.itemattribute;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.utils.locale.Localizable;

public class ItemAttribute implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private List<Description> descriptions;

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
	 * Get a list of items that have this attribute
	 * @return a list of {@link Item} items
	 */
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	/**
	 * Set a list of items that have this attribute
	 * @param items a list of {@link Item} items
	 */
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}

	/**
	 * Get the name of this item attribute listed in different languages
	 * @return the list of {@link Name} names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this item attribute listed in different languages
	 * @param names the list of {@link Name} names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get the description of this item attribute listed in different languages
	 * @return the list of {@link Description} descriptions
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * Set the description of this item attribute listed in different languages
	 * @param descriptions the list of {@link Description} descriptions
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of ItemAttribute
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemAttribute that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getItems(), that.getItems()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getDescriptions(), that.getDescriptions());
	}

	/**
	 * Returns the hash code of the ItemAttribute
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getItems(), getNames(), getDescriptions());
	}

	/**
	 * Returns a string representation of the ItemAttribute
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "ItemAttribute{" +
				"id=" + id +
				", name='" + name + '\'' +
				", items=" + items +
				", names=" + names +
				", descriptions=" + descriptions +
				'}';
	}
}
