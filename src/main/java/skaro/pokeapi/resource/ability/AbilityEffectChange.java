package skaro.pokeapi.resource.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Effect;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.List;
import java.util.Objects;

public class AbilityEffectChange {

    @JsonProperty("effect_entries")
    private List<Effect> effectEntries;
    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;

    /**
     * Get the previous effect of this ability listed in different languages
     *
     * @return a list of {@link Effect} effect entries
     */
    public List<Effect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Set the previous effect of this ability listed in different languages
     *
     * @param effectEntries a list of {@link Effect} effect entries
     */
    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get the version group in which the
     * previous effect of this ability originated
     *
     * @return the {@link VersionGroup} versionGroup
     */
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set the version group in which the
     * previous effect of this ability originated
     *
     * @param versionGroup the {@link VersionGroup} versionGroup
     */
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of AbilityEffectChange
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AbilityEffectChange that)) return false;
        return Objects.equals(getEffectEntries(), that.getEffectEntries()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
    }

    /**
     * Returns the hash code of the AbilityEffectChange
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getEffectEntries(), getVersionGroup());
    }

    /**
     * Returns a string representation of the AbilityEffectChange
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "AbilityEffectChange{" +
                "effectEntries=" + effectEntries +
                ", versionGroup=" + versionGroup +
                '}';
    }
}
