package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.nature.Nature;

import java.util.Objects;

public class NaturePokeathlonStatAffect {

    @JsonProperty("max_change")
    private Integer maxChange;
    private NamedApiResource<Nature> nature;

    /**
     * Get the maximum amount of change to the referenced Pokéathlon stat
     *
     * @return the maximum amount of change
     */
    public Integer getMaxChange() {
        return maxChange;
    }

    /**
     * Set the maximum amount of change to the referenced Pokéathlon stat
     *
     * @param maxChange the maximum amount of change
     */
    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    /**
     * Get the nature that causes the change
     *
     * @return the {@link Nature} that causes the change
     */
    public NamedApiResource<Nature> getNature() {
        return nature;
    }

    /**
     * Set the nature that causes the change
     *
     * @param nature the {@link Nature} that causes the change
     */
    public void setNature(NamedApiResource<Nature> nature) {
        this.nature = nature;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of NaturePokeathlonStatAffect
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NaturePokeathlonStatAffect that)) return false;
        return Objects.equals(getMaxChange(), that.getMaxChange()) && Objects.equals(getNature(), that.getNature());
    }

    /**
     * Returns the hash code of the NaturePokeathlonStatAffect
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMaxChange(), getNature());
    }

    /**
     * Returns a string representation of the NaturePokeathlonStatAffect
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NaturePokeathlonStatAffect{" +
                "maxChange=" + maxChange +
                ", nature=" + nature +
                '}';
    }
}
