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
	 * @return the {@link EncounterCondition} condition
	 */
	public NamedApiResource<EncounterCondition> getCondition() {
		return condition;
	}
	/**
	 * Set the condition this encounter condition value pertains to
	 * @param condition the {@link EncounterCondition} condition
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
	 * Returns whether the given object o is
	 * equal to this instance of EncounterConditionValue
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EncounterConditionValue that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getCondition(), that.getCondition()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Returns the hash code of the EncounterConditionValue
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getCondition(), getNames());
	}

	/**
	 * Returns a string representation of the EncounterConditionValue
	 * @return the string representation
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
