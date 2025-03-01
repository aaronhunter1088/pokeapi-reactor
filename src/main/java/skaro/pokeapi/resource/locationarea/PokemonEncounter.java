package skaro.pokeapi.resource.locationarea;

import java.util.List;

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

}
