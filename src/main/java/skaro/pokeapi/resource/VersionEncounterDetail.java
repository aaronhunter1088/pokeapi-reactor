package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.version.Version;

import java.util.List;
import java.util.Objects;

public class VersionEncounterDetail {

    private NamedApiResource<Version> version;
    @JsonProperty("max_chance")
    private Integer maxChance;
    @JsonProperty("encounter_details")
    private List<Encounter> encounterDetails;

    /**
     * Gets the game version this encounter happens in
     *
     * @return the {@link Version} version
     */
    public NamedApiResource<Version> getVersion() {
        return version;
    }

    /**
     * Sets the game version this encounter happens in
     *
     * @param version the {@link Version} version
     */
    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }

    /**
     * Gets the total percentage of all encounter potential.
     *
     * @return the maxChance
     */
    public Integer getMaxChance() {
        return maxChance;
    }

    /**
     * Sets the total percentage of all encounter potential.
     *
     * @param maxChance the maxChance
     */
    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    /**
     * Gets the list of encounters and their specifics
     *
     * @return the list of {@link Encounter} encounterDetails
     */
    public List<Encounter> getEncounterDetails() {
        return encounterDetails;
    }

    /**
     * Sets the list of encounters and their specifics.
     *
     * @param encounterDetails the list of {@link Encounter} encounterDetails
     */
    public void setEncounterDetails(List<Encounter> encounterDetails) {
        this.encounterDetails = encounterDetails;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of VersionEncounterDetail
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VersionEncounterDetail that)) return false;
        return Objects.equals(getVersion(), that.getVersion()) && Objects.equals(getMaxChance(), that.getMaxChance()) && Objects.equals(getEncounterDetails(), that.getEncounterDetails());
    }

    /**
     * Returns the hash code of the VersionEncounterDetail
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getVersion(), getMaxChance(), getEncounterDetails());
    }

    /**
     * Returns a string representation of the VersionEncounterDetail
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "VersionEncounterDetail{" +
                "version=" + version +
                ", maxChance=" + maxChance +
                ", encounterDetails=" + encounterDetails +
                '}';
    }
}
