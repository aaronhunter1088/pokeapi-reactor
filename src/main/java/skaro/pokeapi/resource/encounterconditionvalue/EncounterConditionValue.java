package skaro.pokeapi.resource.encounterconditionvalue;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.encountercondition.EncounterCondition;
import skaro.pokeapi.utils.locale.Localizable;

public class EncounterConditionValue implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private NamedApiResource<EncounterCondition> condition;
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
	 * Get the condition this encounter condition value pertains to
	 * @return the condition
	 */
	public NamedApiResource<EncounterCondition> getCondition() {
		return condition;
	}
	/**
	 * Set the condition this encounter condition value pertains to
	 * @param condition the condition
	 */
	public void setCondition(NamedApiResource<EncounterCondition> condition) {
		this.condition = condition;
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
	 * Returns true if the object is equal to this object based on the id and name
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EncounterConditionValue that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getCondition(), that.getCondition()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Returns a hash code value for the object
	 * @return a hash code value
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getCondition(), getNames());
	}

	/**
	 * Returns a string representation of the object
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "EncounterConditionValue{" +
				"id=" + id +
				", name='" + name + '\'' +
				", condition=" + condition +
				", names=" + names +
				'}';
	}
}
