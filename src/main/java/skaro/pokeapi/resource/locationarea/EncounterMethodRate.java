package skaro.pokeapi.resource.locationarea;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.encountermethod.EncounterMethod;

public class EncounterMethodRate {

	private NamedApiResource<EncounterMethod> encounterMethod;
	private List<EncounterVersionDetails> versionDetails;

	/**
	 * Get the method in which Pokémon may be encountered in an area
	 * @return a {@link NamedApiResource<EncounterMethod>} object
	 */
	public NamedApiResource<EncounterMethod> getEncounterMethod() {
		return encounterMethod;
	}
	/**
	 * Set the method in which Pokémon may be encountered in an area
	 * @param encounterMethod a {@link NamedApiResource<EncounterMethod>} object
	 */
	public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
		this.encounterMethod = encounterMethod;
	}

	/**
	 * Get the chance of the encounter to occur on a version of the game
	 * @return a list of {@link EncounterVersionDetails} objects
	 */
	public List<EncounterVersionDetails> getVersionDetails() {
		return versionDetails;
	}
	/**
	 * Set the chance of the encounter to occur on a version of the game
	 * @param versionDetails a list of {@link EncounterVersionDetails} objects
	 */
	public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
		this.versionDetails = versionDetails;
	}

	/**
	 * Checks whether the EncounterMethodRate is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EncounterMethodRate that)) return false;
        return Objects.equals(getEncounterMethod(), that.getEncounterMethod()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
	}

	/**
	 * Generate a hash code for the EncounterMethodRate
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getEncounterMethod(), getVersionDetails());
	}

	/**
	 * Convert the EncounterMethodRate to a String
	 * @return a String representation of this object
	 */
	@Override
	public String toString() {
		return "EncounterMethodRate{" +
				"encounterMethod=" + encounterMethod +
				", versionDetails=" + versionDetails +
				'}';
	}
}
