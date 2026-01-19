package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

/**
 * Represents the ninth generation
 * of Pokémon games and their sprites
 *
 * @author michael ball
 * @since 1.0.8
 */
public class GenerationIX {

    @JsonProperty("scarlet-violet")
    private Sprites scarletViolet;

    /**
     * Get the sprites for the generation
     *
     * @return the {@link Sprites} for scarletViolet
     */
    public Sprites getScarletViolet() {
        return scarletViolet;
    }

    /**
     * Set the sprites for the generation
     *
     * @param scarletViolet the {@link Sprites} for scarletViolet
     */
    public void setScarletViolet(Sprites scarletViolet) {
        this.scarletViolet = scarletViolet;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationIX
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationIX that)) return false;
        return Objects.equals(getScarletViolet(), that.getScarletViolet());
    }

    /**
     * Returns the hash code of the GenerationIX
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(getScarletViolet());
    }

    /**
     * Returns a string representation of the GenerationIX
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationIX{" +
                "scarletViolet=" + scarletViolet +
                '}';
    }
}
