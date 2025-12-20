package skaro.pokeapi.resource.stat;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.move.Move;

import java.util.Objects;

public class MoveStatAffect {

    private Integer change;
    private NamedApiResource<Move> move;

    /**
     * Get the maximum amount of change to the referenced stat
     *
     * @return the maximum amount of change
     */
    public Integer getChange() {
        return change;
    }

    /**
     * Set the maximum amount of change to the referenced stat
     *
     * @param change the maximum amount of change
     */
    public void setChange(Integer change) {
        this.change = change;
    }

    /**
     * Get the move causing the change
     *
     * @return the {@link Move} causing the move
     */
    public NamedApiResource<Move> getMove() {
        return move;
    }

    /**
     * Set the move causing the change
     *
     * @param move the {@link Move} causing the move
     */
    public void setMove(NamedApiResource<Move> move) {
        this.move = move;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveStatAffect
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveStatAffect that)) return false;
        return Objects.equals(getChange(), that.getChange()) && Objects.equals(getMove(), that.getMove());
    }

    /**
     * Returns the hash code of the MoveStatAffect
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getChange(), getMove());
    }

    /**
     * Returns a string representation of the MoveStatAffect
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "MoveStatAffect{" +
                "change=" + change +
                ", move=" + move +
                '}';
    }
}
