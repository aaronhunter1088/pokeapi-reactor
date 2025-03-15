package skaro.pokeapi.resource.encountermethod;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

public class EncounterMethod implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer order;
	private List<Name> names;

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
	 * Get a good value for sorting
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}
	/**
	 * Set a good value for sorting
	 * @param order the order
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * Get the name of this resource listed in different languages
	 * @return a list of {@link Name} objects
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this resource listed in different languages
	 * @param names a list of {@link Name} objects
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of EncounterMethod
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EncounterMethod that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getOrder(), that.getOrder()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Returns the hash code of the EncounterMethod
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getOrder(), getNames());
	}

	/**
	 * Returns a string representation of the EncounterMethod
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "EncounterMethod{" +
				"id=" + id +
				", name='" + name + '\'' +
				", order=" + order +
				", names=" + names +
				'}';
	}
}
