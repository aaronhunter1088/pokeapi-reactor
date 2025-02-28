package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VersionEncounterDetail;
import skaro.pokeapi.resource.locationarea.LocationArea;

import java.util.List;

public class LocationEncounterArea {

    private NamedApiResource<LocationArea> locationArea;
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource<LocationArea> getLocationArea() { return locationArea; }
    public void setLocationArea(NamedApiResource<LocationArea> locationArea) { this.locationArea = locationArea; }
    public List<VersionEncounterDetail> getVersionDetails() { return versionDetails; }
    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) { this.versionDetails = versionDetails; }
}
