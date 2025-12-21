package skaro.pokeapi.resource.berryflavor;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.berry.Berry;

import java.util.Objects;

/**
 * Represents a mapping of a Berry to its potency for a specific Flavor
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class FlavorBerryMap {

    private Integer potency;
    private NamedApiResource<Berry> berry;

    /**
     * Get how powerful the referenced flavor is for this berry.
     *
     * @return the potency
     */
    public Integer getPotency() {
        return potency;
    }

    /**
     * Set how powerful the referenced flavor is for this berry.
     *
     * @param potency the potency
     */
    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    /**
     * Get the berry with the referenced flavor
     *
     * @return the {@link Berry} berry
     */
    public NamedApiResource<Berry> getBerry() {
        return berry;
    }

    /**
     * Set the berry with the referenced flavor
     *
     * @param berry the {@link Berry} berry
     */
    public void setBerry(NamedApiResource<Berry> berry) {
        this.berry = berry;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of FlavorBerryMap
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FlavorBerryMap that)) return false;
        return Objects.equals(getPotency(), that.getPotency()) && Objects.equals(getBerry(), that.getBerry());
    }

    /**
     * Returns the hash code of the FlavorBerryMap
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPotency(), getBerry());
    }

    /**
     * Returns a string representation of the FlavorBerryMap
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "FlavorBerryMap{" +
                "potency=" + potency +
                ", berry=" + berry +
                '}';
    }
}
