package skaro.pokeapi.resource.stat;

import java.util.List;
import java.util.Objects;

/**
 * Represents sets of moves that affect a stat
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class MoveStatAffectSets {

    private List<MoveStatAffect> increase;
    private List<MoveStatAffect> decrease;

    /**
     * Get a list of moves and how they change the referenced stat
     *
     * @return the list of {@link MoveStatAffect} increase
     */
    public List<MoveStatAffect> getIncrease() {
        return increase;
    }

    /**
     * Set a list of moves and how they change the referenced stat
     *
     * @param increase the list of {@link MoveStatAffect} increase
     */
    public void setIncrease(List<MoveStatAffect> increase) {
        this.increase = increase;
    }

    /**
     * Get a list of moves and how they change the referenced stat
     *
     * @return the list of {@link MoveStatAffect} decrease
     */
    public List<MoveStatAffect> getDecrease() {
        return decrease;
    }

    /**
     * Set a list of moves and how they change the referenced stat
     *
     * @param decrease the list of {@link MoveStatAffect} decrease
     */
    public void setDecrease(List<MoveStatAffect> decrease) {
        this.decrease = decrease;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveStatAffectSets
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveStatAffectSets that)) return false;
        return Objects.equals(getIncrease(), that.getIncrease()) && Objects.equals(getDecrease(), that.getDecrease());
    }

    /**
     * Returns the hash code of the MoveStatAffectSets
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getIncrease(), getDecrease());
    }

    /**
     * Returns a string representation of the MoveStatAffectSets
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "MoveStatAffectSets{" +
                "increase=" + increase +
                ", decrease=" + decrease +
                '}';
    }
}
