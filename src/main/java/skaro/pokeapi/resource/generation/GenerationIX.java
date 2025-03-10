package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GenerationIX {

    @JsonProperty("scarlet-violet")
    private NameIcon scarletViolet;

    /**
     * Get the name and icon for the generation
     * @return the name and icon
     */
    public NameIcon getScarletViolet() {
        return scarletViolet;
    }
    /**
     * Set the name and icon for the generation
     * @param scarletViolet the name and icon
     */
    public void setScarletViolet(NameIcon scarletViolet) {
        this.scarletViolet = scarletViolet;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationIX
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
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(getScarletViolet());
    }

    /**
     * Returns a string representation of the GenerationIX
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationIX{" +
                "scarletViolet=" + scarletViolet +
                '}';
    }
}
