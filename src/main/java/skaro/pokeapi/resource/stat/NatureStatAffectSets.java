package skaro.pokeapi.resource.stat;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.nature.Nature;

import java.util.List;
import java.util.Objects;

/**
 * Represents sets of natures that affect a stat
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class NatureStatAffectSets {

    private List<NamedApiResource<Nature>> increase;
    private List<NamedApiResource<Nature>> decrease;

    /**
     * Get a list of natures and how they change the referenced stat
     *
     * @return the list of {@link Nature} increase
     */
    public List<NamedApiResource<Nature>> getIncrease() {
        return increase;
    }

    /**
     * Set a list of natures and how they change the referenced stat
     *
     * @param increase the list of {@link Nature} increase
     */
    public void setIncrease(List<NamedApiResource<Nature>> increase) {
        this.increase = increase;
    }

    /**
     * Get a list of natures and how they change the referenced stat
     *
     * @return the list of {@link Nature} decrease
     */
    public List<NamedApiResource<Nature>> getDecrease() {
        return decrease;
    }

    /**
     * Set a list of natures and how they change the referenced stat
     *
     * @param decrease the list of {@link Nature} decrease
     */
    public void setDecrease(List<NamedApiResource<Nature>> decrease) {
        this.decrease = decrease;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of NatureStatAffectSets
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NatureStatAffectSets that)) return false;
        return Objects.equals(getIncrease(), that.getIncrease()) && Objects.equals(getDecrease(), that.getDecrease());
    }

    /**
     * Returns the hash code of the NatureStatAffectSets
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getIncrease(), getDecrease());
    }

    /**
     * Returns a string representation of the NatureStatAffectSets
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NatureStatAffectSets{" +
                "increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}
