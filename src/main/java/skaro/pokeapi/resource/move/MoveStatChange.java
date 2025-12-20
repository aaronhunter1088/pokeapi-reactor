package skaro.pokeapi.resource.move;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.stat.Stat;

import java.util.Objects;

public class MoveStatChange {

    private Integer change;
    private NamedApiResource<Stat> stat;

    /**
     * Get the amount of change
     *
     * @return an integer representing the amount of change
     */
    public Integer getChange() {
        return change;
    }

    /**
     * Set the amount of change
     *
     * @param change an integer representing the amount of change
     */
    public void setChange(Integer change) {
        this.change = change;
    }

    /**
     * Get the stat being affected
     *
     * @return a {@link Stat} object
     */
    public NamedApiResource<Stat> getStat() {
        return stat;
    }

    /**
     * Set the stat being affected
     *
     * @param stat a {@link Stat} object
     */
    public void setStat(NamedApiResource<Stat> stat) {
        this.stat = stat;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveStatChange
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveStatChange that)) return false;
        return Objects.equals(getChange(), that.getChange()) && Objects.equals(getStat(), that.getStat());
    }

    /**
     * Returns the hash code of the MoveStatChange
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getChange(), getStat());
    }

    /**
     * Returns a string representation of the MoveStatChange
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "MoveStatChange{" +
                "change=" + change +
                ", stat=" + stat +
                '}';
    }
}
