package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VersionEncounterDetail;
import skaro.pokeapi.resource.locationarea.LocationArea;

import java.util.List;
import java.util.Objects;

public class LocationEncounterArea {

    @JsonProperty("location_area")
    private NamedApiResource<LocationArea> locationArea;
    @JsonProperty("version_details")
    private List<VersionEncounterDetail> versionDetails;

    /**
     * Get the location area
     *
     * @return the {@link LocationArea} location area
     */
    public NamedApiResource<LocationArea> getLocationArea() {
        return locationArea;
    }

    /**
     * Set the location area
     *
     * @param locationArea the {@link LocationArea} location area
     */
    public void setLocationArea(NamedApiResource<LocationArea> locationArea) {
        this.locationArea = locationArea;
    }

    /**
     * Get the version details
     *
     * @return the list of {@link VersionEncounterDetail} version details
     */
    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }

    /**
     * Set the version details
     *
     * @param versionDetails the list of {@link VersionEncounterDetail} version details
     */
    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of LocationEncounterArea
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LocationEncounterArea that)) return false;
        return Objects.equals(getLocationArea(), that.getLocationArea()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
    }

    /**
     * Returns the hash code of the LocationEncounterArea
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getLocationArea(), getVersionDetails());
    }

    /**
     * Returns a string representation of the LocationEncounterArea
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "LocationEncounterArea{" +
                "locationArea=" + locationArea +
                ", versionDetails=" + versionDetails +
                '}';
    }
}
