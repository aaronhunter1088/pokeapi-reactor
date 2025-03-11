package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GenerationVI {

    @JsonAlias({"omegaruby-alphasapphire", "omega-ruby-alpha-sapphire"})
    private NameIcon omegaRubyAlphaSapphire;
    @JsonProperty("x-y")
    private NameIcon xY;

    /**
     * Gets the omega ruby alpha sapphire icon of this GenerationVI
     * @return the {@link NameIcon} omega ruby alpha sapphire icon
     */
    public NameIcon getOmegaRubyAlphaSapphire() {
        return omegaRubyAlphaSapphire;
    }
    /**
     * Sets the omega ruby alpha sapphire icon of this GenerationVI
     * @param omegaRubyAlphaSapphire the {@link NameIcon} omega ruby alpha sapphire icon
     */
    public void setOmegaRubyAlphaSapphire(NameIcon omegaRubyAlphaSapphire) {
        this.omegaRubyAlphaSapphire = omegaRubyAlphaSapphire;
    }

    /**
     * Get the xY icon of this GenerationVI
     * @return the {@link NameIcon} xY icon
     */
    public NameIcon getxY() {
        return xY;
    }
    /**
     * Sets the xY icon of this GenerationVI
     * @param xY the {@link NameIcon} xY icon
     */
    public void setxY(NameIcon xY) {
        this.xY = xY;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationVI
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
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getOmegaRubyAlphaSapphire(), getxY());
    }

    /**
     * Returns a string representation of the GenerationVI
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
