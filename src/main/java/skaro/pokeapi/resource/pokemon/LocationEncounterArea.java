package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VersionEncounterDetail;
import skaro.pokeapi.resource.locationarea.LocationArea;

import java.util.List;

public class LocationEncounterArea {

    @JsonProperty("location_area")
    private NamedApiResource<LocationArea> locationArea;
    @JsonProperty("version_details")
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource<LocationArea> getLocationArea() { return locationArea; }
    public void setLocationArea(NamedApiResource<LocationArea> locationArea) { this.locationArea = locationArea; }
    public List<VersionEncounterDetail> getVersionDetails() { return versionDetails; }
    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) { this.versionDetails = versionDetails; }
}
