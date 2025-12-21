package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

/**
 * Represents the first generation
 * of Pokémon games and their sprites
 *
 * @author michael ball
 * @since 1.0.8
 */
public class GenerationI {

    @JsonProperty("red-blue")
    private Sprites redBlue;
    private Sprites yellow;

    /**
     * Get the red-blue sprites
     *
     * @return the {@link Sprites} for red-blue
     */
    public Sprites getRedBlue() {
        return redBlue;
    }

    /**
     * Set the red-blue sprites
     *
     * @param redBlue the {@link Sprites} for red-blue
     */
    public void setRedBlue(Sprites redBlue) {
        this.redBlue = redBlue;
    }

    /**
     * Get the yellow sprites
     *
     * @return the {@link Sprites} for yellow
     */
    public Sprites getYellow() {
        return yellow;
    }

    /**
     * Set the yellow sprites
     *
     * @param yellow the {@link Sprites} for yellow
     */
    public void setYellow(Sprites yellow) {
        this.yellow = yellow;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationI
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationI that)) return false;
        return Objects.equals(getRedBlue(), that.getRedBlue()) && Objects.equals(getYellow(), that.getYellow());
    }

    /**
     * Returns the hash code of the GenerationI
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRedBlue(), getYellow());
    }

    /**
     * Returns a string representation of the GenerationI
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationI{" +
                "redBlue=" + redBlue +
                ", yellow=" + yellow +
                '}';
    }
}
