package skaro.pokeapi.resource.berryflavor;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.contesttype.ContestType;
import skaro.pokeapi.utils.locale.Localizable;

public class BerryFlavor implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<FlavorBerryMap> berries;
	private NamedApiResource<ContestType> contestType;
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
	 * Get a list of the berries with this flavor
	 * @return a list of {@link FlavorBerryMap} objects
	 */
	public List<FlavorBerryMap> getBerries() {
		return berries;
	}
	/**
	 * Set a list of the berries with this flavor
	 * @param berries a list of {@link FlavorBerryMap} objects
	 */
	public void setBerries(List<FlavorBerryMap> berries) {
		this.berries = berries;
	}

	/**
	 * Get the contest type that correlates with this berry flavor
	 * @return the {@link NamedApiResource<ContestType>} contest type
	 */
	public NamedApiResource<ContestType> getContestType() {
		return contestType;
	}
	/**
	 * Set the contest type that correlates with this berry flavor
	 * @param contestType the {@link NamedApiResource<ContestType>} contest type
	 */
	public void setContestType(NamedApiResource<ContestType> contestType) {
		this.contestType = contestType;
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
	 * Returns true if the object is compared to another object
	 * @param o the object to compare
	 * @return true if the object is equal to this object based on the id, name, berries, contestType, and names
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof BerryFlavor that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getBerries(), that.getBerries()) && Objects.equals(getContestType(), that.getContestType()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Returns a hash code value for the object
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getBerries(), getContestType(), getNames());
	}

	/**
	 * Returns a string representation of the object
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "BerryFlavor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", berries=" + berries +
				", contestType=" + contestType +
				", names=" + names +
				'}';
	}
}
