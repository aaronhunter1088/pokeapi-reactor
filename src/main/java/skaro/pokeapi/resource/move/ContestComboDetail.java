package skaro.pokeapi.resource.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;

import java.util.List;
import java.util.Objects;

public class ContestComboDetail {

    @JsonProperty("use_before")
    private List<NamedApiResource<Move>> useBefore;
    @JsonProperty("use_after")
    private List<NamedApiResource<Move>> useAfter;

    /**
     * Get a list of moves to use before this move
     *
     * @return a list of {@link Move} moves
     */
    public List<NamedApiResource<Move>> getUseBefore() {
        return useBefore;
    }

    /**
     * Set a list of moves to use before this move
     *
     * @param useBefore a list of {@link Move} moves
     */
    public void setUseBefore(List<NamedApiResource<Move>> useBefore) {
        this.useBefore = useBefore;
    }

    /**
     * Get a list of moves to use after this move
     *
     * @return a list of {@link Move} moves
     */
    public List<NamedApiResource<Move>> getUseAfter() {
        return useAfter;
    }

    /**
     * Set a list of moves to use after this move
     *
     * @param useAfter a list of {@link Move} moves
     */
    public void setUseAfter(List<NamedApiResource<Move>> useAfter) {
        this.useAfter = useAfter;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ContestComboDetail
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ContestComboDetail that)) return false;
        return Objects.equals(getUseBefore(), that.getUseBefore()) && Objects.equals(getUseAfter(), that.getUseAfter());
    }

    /**
     * Returns the hash code of the ContestComboDetail
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getUseBefore(), getUseAfter());
    }

    /**
     * Returns a string representation of the ContestComboDetail
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ContestComboDetail{" +
                "userBefore=" + useBefore +
                ", userAfter=" + useAfter +
                '}';
    }
}
