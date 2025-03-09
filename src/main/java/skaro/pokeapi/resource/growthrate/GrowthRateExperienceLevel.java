package skaro.pokeapi.resource.growthrate;

import java.util.Objects;

public class GrowthRateExperienceLevel {

	private Integer level;
	private Integer experience;

	/**
	 * Get the level gained
	 * @return the level gained
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * Set the level gained
	 * @param level the level gained
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * Get The amount of experience required to reach the referenced level
	 * @return The amount of experience required to reach the referenced level
	 */
	public Integer getExperience() {
		return experience;
	}
	/**
	 * Set The amount of experience required to reach the referenced level
	 * @param experience The amount of experience required to reach the referenced level
	 */
	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	/**
	 * Two GrowthRateExperienceLevel are considered equal if they have the same level and experience
	 * @param o object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof GrowthRateExperienceLevel that)) return false;
        return Objects.equals(getLevel(), that.getLevel()) && Objects.equals(getExperience(), that.getExperience());
	}

	/**
	 * Generate a hash code for the GrowthRateExperienceLevel
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getLevel(), getExperience());
	}

	/**
	 * Returns a string representation of the GrowthRateExperienceLevel
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "GrowthRateExperienceLevel{" +
				"level=" + level +
				", experience=" + experience +
				'}';
	}
}
