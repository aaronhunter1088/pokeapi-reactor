package skaro.pokeapi.resource.locationarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.encountermethod.EncounterMethod;

import java.util.List;
import java.util.Objects;

public class EncounterMethodRate {

    @JsonProperty("encounter_method")
    private NamedApiResource<EncounterMethod> encounterMethod;
    @JsonProperty("version_details")
    private List<EncounterVersionDetails> versionDetails;

    /**
     * Get the method in which Pokémon may be encountered in an area
     *
     * @return a {@link EncounterMethod} object
     */
    public NamedApiResource<EncounterMethod> getEncounterMethod() {
        return encounterMethod;
    }

    /**
     * Set the method in which Pokémon may be encountered in an area
     *
     * @param encounterMethod a {@link EncounterMethod} object
     */
    public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    /**
     * Get the chance of the encounter to occur on a version of the game
     *
     * @return a list of {@link EncounterVersionDetails} objects
     */
    public List<EncounterVersionDetails> getVersionDetails() {
        return versionDetails;
    }

    /**
     * Set the chance of the encounter to occur on a version of the game
     *
     * @param versionDetails a list of {@link EncounterVersionDetails} objects
     */
    public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of EncounterMethodRate
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EncounterMethodRate that)) return false;
        return Objects.equals(getEncounterMethod(), that.getEncounterMethod()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
    }

    /**
     * Returns the hash code of the EncounterMethodRate
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getEncounterMethod(), getVersionDetails());
    }

    /**
     * Returns a string representation of the EncounterMethodRate
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "EncounterMethodRate{" +
                "encounterMethod=" + encounterMethod +
                ", versionDetails=" + versionDetails +
                '}';
    }
}
