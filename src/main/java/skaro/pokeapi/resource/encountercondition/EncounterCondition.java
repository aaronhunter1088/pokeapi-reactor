package skaro.pokeapi.resource.encountercondition;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the EncounterCondition resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class EncounterCondition implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;
    private List<NamedApiResource<EncounterConditionValue>> values;

    /**
     * Get the id
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the name of this resource listed in different languages
     *
     * @return a list of {@link Name} objects
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource listed in different languages
     *
     * @param names a list of {@link Name} objects
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a list of possible values for this encounter condition
     *
     * @return a list of {@link EncounterConditionValue} objects
     */
    public List<NamedApiResource<EncounterConditionValue>> getValues() {
        return values;
    }

    /**
     * Set a list of possible values for this encounter condition
     *
     * @param values a list of {@link EncounterConditionValue} objects
     */
    public void setValues(List<NamedApiResource<EncounterConditionValue>> values) {
        this.values = values;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of EncounterCondition
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EncounterCondition that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getValues(), that.getValues());
    }

    /**
     * Returns the hash code of the EncounterCondition
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames(), getValues());
    }

    /**
     * Returns a string representation of the EncounterCondition
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "EncounterCondition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", names=" + names +
                ", values=" + values +
                '}';
    }
}
