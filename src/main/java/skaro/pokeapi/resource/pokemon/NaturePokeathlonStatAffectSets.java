package skaro.pokeapi.resource.pokemon;

import java.util.List;
import java.util.Objects;

public class NaturePokeathlonStatAffectSets {

    private List<NaturePokeathlonStatAffect> increase;
    private List<NaturePokeathlonStatAffect> decrease;

    /**
     * Get a list of natures and how they
     * change the referenced Pokéathlon stat
     * @return increase a list of {@link NaturePokeathlonStatAffect} natures
     */
    public List<NaturePokeathlonStatAffect> getIncrease() { return increase; }
    /**
     * Set a list of natures and how they
     * change the referenced Pokéathlon stat
     * @param increase a list of {@link NaturePokeathlonStatAffect} natures
     */
    public void setIncrease(List<NaturePokeathlonStatAffect> increase) { this.increase = increase; }

    /**
     * Get a list of natures and how they
     * change the referenced Pokéathlon stat
     * @return decrease a list of {@link NaturePokeathlonStatAffect} natures
     */
    public List<NaturePokeathlonStatAffect> getDecrease() { return decrease; }
    /**
     * Set a list of natures and how they
     * change the referenced Pokéathlon stat
     * @param decrease a list of {@link NaturePokeathlonStatAffect} natures
     */
    public void setDecrease(List<NaturePokeathlonStatAffect> decrease) { this.decrease = decrease; }

    /**
     * Returns whether the given object o is
     * equal to this instance of NaturePokeathlonStatAffectSets
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NaturePokeathlonStatAffectSets that)) return false;
        return Objects.equals(getIncrease(), that.getIncrease()) && Objects.equals(getDecrease(), that.getDecrease());
    }

    /**
     * Returns the hash code of the NaturePokeathlonStatAffectSets
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getIncrease(), getDecrease());
    }

    /**
     * Returns a string representation of the NaturePokeathlonStatAffectSets
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NaturePokeathlonStatAffectSets{" +
                "increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}
