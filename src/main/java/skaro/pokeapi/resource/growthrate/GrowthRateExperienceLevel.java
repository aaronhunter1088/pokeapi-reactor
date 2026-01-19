package skaro.pokeapi.resource.growthrate;

import java.util.Objects;

/**
 * Represents a level and the experience required to reach it
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class GrowthRateExperienceLevel {

    private Integer level;
    private Integer experience;

    /**
     * Get the level gained
     *
     * @return the level gained
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Set the level gained
     *
     * @param level the level gained
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * Get the amount of experience required to reach the referenced level
     *
     * @return the amount of experience required to reach the referenced level
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * Set the amount of experience required to reach the referenced level
     *
     * @param experience the amount of experience required to reach the referenced level
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GrowthRateExperienceLevel
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GrowthRateExperienceLevel that)) return false;
        return Objects.equals(getLevel(), that.getLevel()) && Objects.equals(getExperience(), that.getExperience());
    }

    /**
     * Returns the hash code of the GrowthRateExperienceLevel
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getLevel(), getExperience());
    }

    /**
     * Returns a string representation of the GrowthRateExperienceLevel
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GrowthRateExperienceLevel{" +
                "level=" + level +
                ", experience=" + experience +
                '}';
    }
}
