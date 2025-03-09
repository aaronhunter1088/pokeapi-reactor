package skaro.pokeapi.resource.locationarea;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

public class EncounterVersionDetails {

	private Integer rate;
	private NamedApiResource<Version> version;

	/**
	 * Get the chance of an encounter to occur
	 * @return an integer value
	 */
	public Integer getRate() {
		return rate;
	}
	/**
	 * Set the chance of an encounter to occur
	 * @param rate the rate
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	/**
	 * Get the version of the game in which the encounter can occur with the given chance
	 * @return a {@link NamedApiResource<Version>} object
	 */
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	/**
	 * Set the version of the game in which the encounter can occur with the given chance
	 * @param version a {@link NamedApiResource<Version>} object
	 */
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}

	/**
	 * Checks whether the EncounterVersionDetails is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EncounterVersionDetails that)) return false;
        return Objects.equals(getRate(), that.getRate()) && Objects.equals(getVersion(), that.getVersion());
	}

	/**
	 * Generate a hash code for the EncounterVersionDetails
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getRate(), getVersion());
	}

	/**
	 * Generate a string representation of the EncounterVersionDetails
	 * @return a string representation of this object
	 */
	@Override
	public String toString() {
		return "EncounterVersionDetails{" +
				"rate=" + rate +
				", version=" + version +
				'}';
	}
}
