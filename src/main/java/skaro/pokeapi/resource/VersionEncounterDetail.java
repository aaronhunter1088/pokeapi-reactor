package skaro.pokeapi.resource;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.version.Version;

public class VersionEncounterDetail {

	private NamedApiResource<Version> version;
	private Integer maxChance;
	private List<Encounter> encounterDetails;

	/** Gets the game version this encounter happens in */
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	/** Sets the game version this encounter happens in */
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}

	/** Gets the total percentage of all encounter potential. */
	public Integer getMaxChance() {
		return maxChance;
	}
	/** Sets the total percentage of all encounter potential. */
	public void setMaxChance(Integer maxChance) {
		this.maxChance = maxChance;
	}

	/** Gets the list of encounters and their specifics */
	public List<Encounter> getEncounterDetails() {
		return encounterDetails;
	}
	/** Sets the list of encounters and their specifics. */
	public void setEncounterDetails(List<Encounter> encounterDetails) {
		this.encounterDetails = encounterDetails;
	}

	/** Returns whether the VersionEncounterDetail is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof VersionEncounterDetail that)) return false;
        return Objects.equals(getVersion(), that.getVersion()) && Objects.equals(getMaxChance(), that.getMaxChance()) && Objects.equals(getEncounterDetails(), that.getEncounterDetails());
	}

	/** Returns the hash code of the VersionEncounterDetail */
	@Override
	public int hashCode() {
		return Objects.hash(getVersion(), getMaxChance(), getEncounterDetails());
	}

	/** Returns the string representation of the VersionEncounterDetail */
	@Override
	public String toString() {
		return "VersionEncounterDetail{" +
				"version=" + version +
				", maxChance=" + maxChance +
				", encounterDetails=" + encounterDetails +
				'}';
	}
}
