package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.stat.Stat;

import java.util.Objects;

/**
 * Represents the changes to a Pokémon's
 * stats due to its nature
 *
 * @author michael ball
 * @since 1.0.8
 */
public class NatureStatChange {

    @JsonProperty("max_change")
    private Integer maxChange;
    @JsonProperty("pokeathlon_stat")
    private NamedApiResource<Stat> pokeathlonStat;

    /**
     * Get the amount of change
     *
     * @return the maxChange
     */
    public Integer getMaxChange() {
        return maxChange;
    }

    /**
     * Sets the amount of change
     *
     * @param maxChange the maxChange
     */
    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    /**
     * Returns the stat that is affected
     *
     * @return the {@link Stat} pokeathlonStat
     */
    public NamedApiResource<Stat> getPokeathlonStat() {
        return pokeathlonStat;
    }

    /**
     * Sets the stat that is affected
     *
     * @param pokeathlonStat the {@link Stat} pokeathlonStat
     */
    public void setPokeathlonStat(NamedApiResource<Stat> pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of NatureStatChange
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NatureStatChange that)) return false;
        return Objects.equals(maxChange, that.maxChange) && Objects.equals(pokeathlonStat, that.pokeathlonStat);
    }

    /**
     * Returns the hash code of the NatureStatChange
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(maxChange, pokeathlonStat);
    }

    /**
     * Returns a string representation of the NatureStatChange
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NatureStatChange{" +
                "maxChange=" + maxChange +
                ", pokeathlonStat=" + pokeathlonStat +
                '}';
    }
}
