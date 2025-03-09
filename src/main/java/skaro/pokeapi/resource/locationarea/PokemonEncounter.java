package skaro.pokeapi.resource.locationarea;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VersionEncounterDetail;
import skaro.pokeapi.resource.pokemon.Pokemon;

public class PokemonEncounter {

	private NamedApiResource<LocationArea> locationArea;
	private List<VersionEncounterDetail> versionDetails;

	/** Gets the location area the encounter can occur in */
	public NamedApiResource<LocationArea> getLocationArea() {
		return locationArea;
	}
	/** Sets the location area the encounter can occur in */
	public void setLocationArea(NamedApiResource<LocationArea> locationArea) {
		this.locationArea = locationArea;
	}

	/** Gets the details of the encounter */
	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}
	/** Sets the details of the encounter */
	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

	/**
	 * Checks whether the PokemonEncounter is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonEncounter that)) return false;
        return Objects.equals(getLocationArea(), that.getLocationArea()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
	}

	/**
	 * Generate a hash code for the PokemonEncounter
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getLocationArea(), getVersionDetails());
	}

	/**
	 * Returns a string representation of the PokemonEncounter
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "PokemonEncounter{" +
				"locationArea=" + locationArea +
				", versionDetails=" + versionDetails +
				'}';
	}
}
