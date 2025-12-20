package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

public class GenerationVI {

    @JsonAlias({"omegaruby-alphasapphire", "omega-ruby-alpha-sapphire"})
    private Sprites omegaRubyAlphaSapphire;
    @JsonProperty("x-y")
    private Sprites xY;

    /**
     * Gets the omega ruby alpha sapphire sprites of this GenerationVI
     *
     * @return the {@link Sprites} for omega ruby alpha sapphire
     */
    public Sprites getOmegaRubyAlphaSapphire() {
        return omegaRubyAlphaSapphire;
    }

    /**
     * Sets the omega ruby alpha sapphire sprites of this GenerationVI
     *
     * @param omegaRubyAlphaSapphire the {@link Sprites} for omega ruby alpha sapphire
     */
    public void setOmegaRubyAlphaSapphire(Sprites omegaRubyAlphaSapphire) {
        this.omegaRubyAlphaSapphire = omegaRubyAlphaSapphire;
    }

    /**
     * Get the xY sprites of this GenerationVI
     *
     * @return the {@link Sprites} for x-y
     */
    public Sprites getxY() {
        return xY;
    }

    /**
     * Sets the xY sprites of this GenerationVI
     *
     * @param xY the {@link Sprites} x-y sprites
     */
    public void setxY(Sprites xY) {
        this.xY = xY;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationVI
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationVI that)) return false;
        return Objects.equals(getOmegaRubyAlphaSapphire(), that.getOmegaRubyAlphaSapphire()) && Objects.equals(getxY(), that.getxY());
    }

    /**
     * Returns the hash code of the GenerationVI
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getOmegaRubyAlphaSapphire(), getxY());
    }

    /**
     * Returns a string representation of the GenerationVI
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationVI{" +
                "omegaRubyAlphaSapphire=" + omegaRubyAlphaSapphire +
                ", xY=" + xY +
                '}';
    }
}
