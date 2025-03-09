package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.nature.Nature;

import java.util.Objects;

public class NaturePokeathlonStatAffect {

    private Integer maxChange;
    private NamedApiResource<Nature> nature;

    /**
     * Get the maximum amount of change to the referenced Pokéathlon stat
     * @return the maximum amount of change
     */
    public Integer getMaxChange() { return maxChange; }
    /**
     * Set the maximum amount of change to the referenced Pokéathlon stat
     * @param maxChange the maximum amount of change
     */
    public void setMaxChange(Integer maxChange) { this.maxChange = maxChange; }

    /**
     * Get the nature that causes the change
     * @return the {@link Nature} that causes the change
     */
    public NamedApiResource<Nature> getNature() { return nature; }
    /**
     * Set the nature that causes the change
     * @param nature the {@link Nature} that causes the change
     */
    public void setNature(NamedApiResource<Nature> nature) { this.nature = nature; }

    /**
     * Check if this NaturePokeathlonStatAffect is equal to another object
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NaturePokeathlonStatAffect that)) return false;
        return Objects.equals(getMaxChange(), that.getMaxChange()) && Objects.equals(getNature(), that.getNature());
    }

    /**
     * Generate a hash code for this NaturePokeathlonStatAffect
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMaxChange(), getNature());
    }

    /**
     * Get a String representation of this NaturePokeathlonStatAffect
     * @return the String representation
     */
    @Override
    public String toString() {
        return "NaturePokeathlonStatAffect{" +
                "maxChange=" + maxChange +
                ", nature=" + nature +
                '}';
    }
}
