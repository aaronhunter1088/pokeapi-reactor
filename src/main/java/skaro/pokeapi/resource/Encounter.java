package skaro.pokeapi.resource;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue;
import skaro.pokeapi.resource.encountermethod.EncounterMethod;

/**
 * Encounter methods are the ways that
 * Pokémon may be encountered in the wild.
 */
public class Encounter {

	private Integer minLevel;
	private Integer maxLevel;
	private List<NamedApiResource<EncounterConditionValue>> conditionValues;
	private Integer chance;
	private NamedApiResource<EncounterMethod> method;

	/**
	 * Get the lowest level the Pokémon could be encountered at.
	 * @return the minLevel
	 */
	public Integer getMinLevel() {
		return minLevel;
	}
	/**
	 * Set the lowest level the Pokémon could be encountered at.
	 * @param minLevel the minLevel
	 */
	public void setMinLevel(Integer minLevel) {
		this.minLevel = minLevel;
	}

	/**
	 * Get the highest level the Pokémon could be encountered at.
	 * @return the maxLevel
	 */
	public Integer getMaxLevel() {
		return maxLevel;
	}
	/**
	 * Set the highest level the Pokémon could be encountered at.
	 * @param maxLevel the maxLevel
	 */
	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	/**
	 * Get the list of condition values that
	 * must be in effect for this encounter to occur.
	 * @return the conditionValues
	 */
	public List<NamedApiResource<EncounterConditionValue>> getConditionValues() {
		return conditionValues;
	}
	/**
	 * Set the list of condition values that
	 * must be in effect for this encounter to occur.
	 * @param conditionValues the conditionValues
	 */
	public void setConditionValues(List<NamedApiResource<EncounterConditionValue>> conditionValues) {
		this.conditionValues = conditionValues;
	}

	/**
	 * Percent chance that this encounter will occur.
	 * @return the chance
	 */
	public Integer getChance() {
		return chance;
	}
	/**
	 * Set the percent chance that this encounter will occur.
	 * @param chance the chance
	 */
	public void setChance(Integer chance) {
		this.chance = chance;
	}

	/**
	 * Get the method by which this encounter happens.
	 * @return the method
	 */
	public NamedApiResource<EncounterMethod> getMethod() {
		return method;
	}
	/**
	 * Set the method by which this encounter happens.
	 * @param method the method
	 */
	public void setMethod(NamedApiResource<EncounterMethod> method) {
		this.method = method;
	}

	/** Returns whether the Encounter is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Encounter encounter)) return false;
        return Objects.equals(getMinLevel(), encounter.getMinLevel()) && Objects.equals(getMaxLevel(), encounter.getMaxLevel()) && Objects.equals(getConditionValues(), encounter.getConditionValues()) && Objects.equals(getChance(), encounter.getChance()) && Objects.equals(getMethod(), encounter.getMethod());
	}

	/** Returns the hash code of the Encounter */
	@Override
	public int hashCode() {
		return Objects.hash(getMinLevel(), getMaxLevel(), getConditionValues(), getChance(), getMethod());
	}

	/** Returns the string representation of the Encounter */
	@Override
	public String toString() {
		return "Encounter{" +
				"minLevel=" + minLevel +
				", maxLevel=" + maxLevel +
				", conditionValues=" + conditionValues +
				", chance=" + chance +
				", method=" + method +
				'}';
	}
}
