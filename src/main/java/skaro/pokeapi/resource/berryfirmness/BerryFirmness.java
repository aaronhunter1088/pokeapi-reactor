package skaro.pokeapi.resource.berryfirmness;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.berry.Berry;
import skaro.pokeapi.utils.locale.Localizable;

public class BerryFirmness implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Berry>> berries;
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
	 * Get a list of the berries with this firmness
	 * @return a list of {@link NamedApiResource} objects
	 */
	public List<NamedApiResource<Berry>> getBerries() {
		return berries;
	}

	/**
	 * Set a list of the berries with this firmness
	 * @param berries a list of {@link NamedApiResource} objects
	 */
	public void setBerries(List<NamedApiResource<Berry>> berries) {
		this.berries = berries;
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
	 * Returns true if the object is a {@code BerryFirmness} with the same id and name
	 * @param o the object to compare
	 * @return true if the object is a {@code BerryFirmness} with the same id and name
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof BerryFirmness that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getBerries(), that.getBerries()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Returns a hash code value for the object
	 * @return a hash code value for the object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getBerries(), getNames());
	}

	/**
	 * Returns a string representation of the object
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "BerryFirmness{" +
				"id=" + id +
				", name='" + name + '\'' +
				", berries=" + berries +
				", names=" + names +
				'}';
	}
}
