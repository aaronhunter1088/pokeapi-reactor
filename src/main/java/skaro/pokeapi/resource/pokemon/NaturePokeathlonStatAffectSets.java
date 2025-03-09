package skaro.pokeapi.resource.pokemon;

import java.util.List;
import java.util.Objects;

public class NaturePokeathlonStatAffectSets {

    private List<NaturePokeathlonStatAffect> increase;
    private List<NaturePokeathlonStatAffect> decrease;

    /**
     * Get a list of natures and how they
     * change the referenced Pokéathlon stat
     * @return increase a list of natures
     */
    public List<NaturePokeathlonStatAffect> getIncrease() { return increase; }
    /**
     * Set a list of natures and how they
     * change the referenced Pokéathlon stat
     * @param increase a list of natures
     */
    public void setIncrease(List<NaturePokeathlonStatAffect> increase) { this.increase = increase; }

    /**
     * Get a list of natures and how they
     * change the referenced Pokéathlon stat
     * @return decrease a list of natures
     */
    public List<NaturePokeathlonStatAffect> getDecrease() { return decrease; }
    /**
     * Set a list of natures and how they
     * change the referenced Pokéathlon stat
     * @param decrease a list of natures
     */
    public void setDecrease(List<NaturePokeathlonStatAffect> decrease) { this.decrease = decrease; }

    /**
     * Check if this NaturePokeathlonStatAffectSets is equal to another object
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NaturePokeathlonStatAffectSets that)) return false;
        return Objects.equals(getIncrease(), that.getIncrease()) && Objects.equals(getDecrease(), that.getDecrease());
    }

    /**
     * Generate a hash code for this NaturePokeathlonStatAffectSets
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getIncrease(), getDecrease());
    }

    /**
     * Get a String representation of this NaturePokeathlonStatAffectSets
     * @return the String representation
     */
    @Override
    public String toString() {
        return "NaturePokeathlonStatAffectSets{" +
                "increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}
