package skaro.pokeapi.resource.movelearnmethod;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the MoveLearnMethod resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class MoveLearnMethod implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Description> descriptions;
    private List<Name> names;
    @JsonProperty("version_groups")
    private List<NamedApiResource<VersionGroup>> versionGroups;

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
     * Get the name of this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the descriptions of this move learn method
     *
     * @return the list of {@link Description} descriptions
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the descriptions of this move learn method
     *
     * @param descriptions the list of {@link Description} descriptions
     */
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Get the names of this move learn method
     *
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the names of this move learn method
     *
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get the version groups this move learn method can be performed in
     *
     * @return the list of {@link VersionGroup} version groups
     */
    public List<NamedApiResource<VersionGroup>> getVersionGroups() {
        return versionGroups;
    }

    /**
     * Set the version groups this move learn method can be performed in
     *
     * @param versionGroups the list of {@link VersionGroup} version groups
     */
    public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
        this.versionGroups = versionGroups;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveLearnMethod
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveLearnMethod that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getVersionGroups(), that.getVersionGroups());
    }

    /**
     * Returns the hash code of the MoveLearnMethod
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescriptions(), getNames(), getVersionGroups());
    }

    /**
     * Returns a string representation of the MoveLearnMethod
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "MoveLearnMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descriptions=" + descriptions +
                ", names=" + names +
                ", versionGroups=" + versionGroups +
                '}';
    }
}
