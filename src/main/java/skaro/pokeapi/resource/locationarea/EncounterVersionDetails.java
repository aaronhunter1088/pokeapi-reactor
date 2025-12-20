package skaro.pokeapi.resource.locationarea;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

public class EncounterVersionDetails {

    private Integer rate;
    private NamedApiResource<Version> version;

    /**
     * Get the chance of an encounter to occur
     *
     * @return an integer value
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * Set the chance of an encounter to occur
     *
     * @param rate the rate
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * Get the version of the game in which the encounter can occur with the given chance
     *
     * @return the {@link Version} version
     */
    public NamedApiResource<Version> getVersion() {
        return version;
    }

    /**
     * Set the version of the game in which the encounter can occur with the given chance
     *
     * @param version the {@link Version} version
     */
    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of EncounterVersionDetails
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EncounterVersionDetails that)) return false;
        return Objects.equals(getRate(), that.getRate()) && Objects.equals(getVersion(), that.getVersion());
    }

    /**
     * Returns the hash code of the EncounterVersionDetails
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRate(), getVersion());
    }

    /**
     * Returns a string representation of the EncounterVersionDetails
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "EncounterVersionDetails{" +
                "rate=" + rate +
                ", version=" + version +
                '}';
    }
}
