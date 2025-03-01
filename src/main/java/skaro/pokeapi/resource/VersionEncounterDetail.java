package skaro.pokeapi.resource;

import java.util.List;

import skaro.pokeapi.resource.version.Version;

public class VersionEncounterDetail {

	private NamedApiResource<Version> version;
	private Integer maxChance;
	private List<Encounter> encounterDetails;

	/** Gets the version of the encounter */
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	/** Sets the version of the encounter */
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}

	/** Gets the maximum chance of encountering a Pokemon */
	public Integer getMaxChance() {
		return maxChance;
	}
	/** Sets the maximum chance of encountering a Pokemon */
	public void setMaxChance(Integer maxChance) {
		this.maxChance = maxChance;
	}

	/** Gets the details of the encounter */
	public List<Encounter> getEncounterDetails() {
		return encounterDetails;
	}
	/** Sets the details of the encounter */
	public void setEncounterDetails(List<Encounter> encounterDetails) {
		this.encounterDetails = encounterDetails;
	}
	
}
