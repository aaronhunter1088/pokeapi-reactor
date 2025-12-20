package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue;
import skaro.pokeapi.resource.encountermethod.EncounterMethod;

import java.util.List;
import java.util.Objects;

/**
 * Encounter methods are the ways that
 * Pokémon may be encountered in the wild.
 */
public class Encounter {

    @JsonProperty("min_level")
    private Integer minLevel;
    @JsonProperty("max_level")
    private Integer maxLevel;
    @JsonProperty("condition_values")
    private List<NamedApiResource<EncounterConditionValue>> conditionValues;
    private Integer chance;
    private NamedApiResource<EncounterMethod> method;

    /**
     * Get the lowest level the Pokémon could be encountered at
     *
     * @return the minLevel
     */
    public Integer getMinLevel() {
        return minLevel;
    }

    /**
     * Set the lowest level the Pokémon could be encountered at
     *
     * @param minLevel the minLevel
     */
    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    /**
     * Get the highest level the Pokémon could be encountered at
     *
     * @return the maxLevel
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Set the highest level the Pokémon could be encountered at
     *
     * @param maxLevel the maxLevel
     */
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    /**
     * Get the list of condition values that must
     * be in effect for this encounter to occur
     *
     * @return the list of {@link EncounterConditionValue} conditionValues
     */
    public List<NamedApiResource<EncounterConditionValue>> getConditionValues() {
        return conditionValues;
    }

    /**
     * Set the list of condition values that must
     * be in effect for this encounter to occur
     *
     * @param conditionValues the list of {@link EncounterConditionValue} conditionValues
     */
    public void setConditionValues(List<NamedApiResource<EncounterConditionValue>> conditionValues) {
        this.conditionValues = conditionValues;
    }

    /**
     * Get the percent chance that this encounter will occur
     *
     * @return the chance
     */
    public Integer getChance() {
        return chance;
    }

    /**
     * Set the percent chance that this encounter will occur
     *
     * @param chance the chance
     */
    public void setChance(Integer chance) {
        this.chance = chance;
    }

    /**
     * Get the method by which this encounter happens
     *
     * @return the {@link EncounterMethod} method
     */
    public NamedApiResource<EncounterMethod> getMethod() {
        return method;
    }

    /**
     * Set the method by which this encounter happens
     *
     * @param method the {@link EncounterMethod} method
     */
    public void setMethod(NamedApiResource<EncounterMethod> method) {
        this.method = method;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Encounter
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Encounter encounter)) return false;
        return Objects.equals(getMinLevel(), encounter.getMinLevel()) && Objects.equals(getMaxLevel(), encounter.getMaxLevel()) && Objects.equals(getConditionValues(), encounter.getConditionValues()) && Objects.equals(getChance(), encounter.getChance()) && Objects.equals(getMethod(), encounter.getMethod());
    }

    /**
     * Returns the hash code of the Encounter
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMinLevel(), getMaxLevel(), getConditionValues(), getChance(), getMethod());
    }

    /**
     * Returns a string representation of the Encounter
     *
     * @return the string representation
     */
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
