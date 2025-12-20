package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

public class GenerationV {

    @JsonProperty("black-white")
    private Sprites blackWhite;
    @JsonProperty("black-2-white-2")
    private Sprites black2White2;

    /**
     * Get the blackWhite sprites
     *
     * @return the {@link Sprites} for blackWhite
     */
    public Sprites getBlackWhite() {
        return blackWhite;
    }

    /**
     * Set the blackWhite sprites
     *
     * @param blackWhite the {@link Sprites} for blackWhite
     */
    public void setBlackWhite(Sprites blackWhite) {
        this.blackWhite = blackWhite;
    }

    /**
     * Get the black2White2 sprites
     *
     * @return the {@link Sprites} for black2White2
     */
    public Sprites getBlack2White2() {
        return black2White2;
    }

    /**
     * Set the black2White2 sprites
     *
     * @param black2White2 the {@link Sprites} for black2White2
     */
    public void setBlack2White2(Sprites black2White2) {
        this.black2White2 = black2White2;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationV
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationV that)) return false;
        return Objects.equals(getBlackWhite(), that.getBlackWhite()) && Objects.equals(getBlack2White2(), that.getBlack2White2());
    }

    /**
     * Returns the hash code of the GenerationV
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBlackWhite(), getBlack2White2());
    }

    /**
     * Returns a string representation of the GenerationV
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationV{" +
                "blackWhite=" + blackWhite +
                ", black2White2=" + black2White2 +
                '}';
    }
}
