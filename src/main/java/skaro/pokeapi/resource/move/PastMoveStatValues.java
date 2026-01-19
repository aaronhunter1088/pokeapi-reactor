package skaro.pokeapi.resource.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VerboseEffect;
import skaro.pokeapi.resource.type.Type;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.List;
import java.util.Objects;

/**
 * Represents the PastMoveStatValues resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PastMoveStatValues {

    private Integer accuracy;
    @JsonProperty("effect_chance")
    private Integer effectChance;
    private Integer power;
    private Integer pp;
    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries;
    private NamedApiResource<Type> type;
    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;

    /**
     * Get the percent value of how likely this move is to be successful
     *
     * @return an integer representing the percent value of how likely this move is to be successful
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    /**
     * Set the percent value of how likely this move is to be successful
     *
     * @param accuracy an integer representing the percent value of how likely this move is to be successful
     */
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * Get the percent value of how likely it is this moves effect will take effect
     *
     * @return an integer representing the percent value of how likely it is this moves effect will take effect
     */
    public Integer getEffectChance() {
        return effectChance;
    }

    /**
     * Set the percent value of how likely it is this moves effect will take effect
     *
     * @param effectChance an integer representing the percent value of how likely it is this moves effect will take effect
     */
    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    /**
     * Get the base power of this move with a value of 0 if it does not have a base power
     *
     * @return an integer representing the base power of this move with a value of 0 if it does not have a base power
     */
    public Integer getPower() {
        return power;
    }

    /**
     * Set the base power of this move with a value of 0 if it does not have a base power
     *
     * @param power an integer representing the base power of this move with a value of 0 if it does not have a base power
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * Get the power points. The number of times this move can be used
     *
     * @return an integer representing the power points. The number of times this move can be used
     */
    public Integer getPp() {
        return pp;
    }

    /**
     * Set the power points. The number of times this move can be used
     *
     * @param pp an integer representing the power points. The number of times this move can be used
     */
    public void setPp(Integer pp) {
        this.pp = pp;
    }

    /**
     * Get the effect of this move listed in different languages
     *
     * @return a list of {@link VerboseEffect} objects
     */
    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Set the effect of this move listed in different languages
     *
     * @param effectEntries a list of {@link VerboseEffect} objects
     */
    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get the elemental type of this move
     *
     * @return the {@link Type} type
     */
    public NamedApiResource<Type> getType() {
        return type;
    }

    /**
     * Set the elemental type of this move
     *
     * @param type the {@link Type} type
     */
    public void setType(NamedApiResource<Type> type) {
        this.type = type;
    }

    /**
     * Get the version group in which these move stat values were in effect
     *
     * @return the {@link VersionGroup} versionGroup
     */
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set the version group in which these move stat values were in effect
     *
     * @param versionGroup the {@link VersionGroup} versionGroup
     */
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PastMoveStatValues
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PastMoveStatValues that)) return false;
        return Objects.equals(getAccuracy(), that.getAccuracy()) && Objects.equals(getEffectChance(), that.getEffectChance()) && Objects.equals(getPower(), that.getPower()) && Objects.equals(getPp(), that.getPp()) && Objects.equals(getEffectEntries(), that.getEffectEntries()) && Objects.equals(getType(), that.getType()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
    }

    /**
     * Returns the hash code of the PastMoveStatValues
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getAccuracy(), getEffectChance(), getPower(), getPp(), getEffectEntries(), getType(), getVersionGroup());
    }

    /**
     * Returns a string representation of the PastMoveStatValues
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PastMoveStatValues{" +
                "accuracy=" + accuracy +
                ", effectChance=" + effectChance +
                ", power=" + power +
                ", pp=" + pp +
                ", effectEntries=" + effectEntries +
                ", type=" + type +
                ", versionGroup=" + versionGroup +
                '}';
    }
}
