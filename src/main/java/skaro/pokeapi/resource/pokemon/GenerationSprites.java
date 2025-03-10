package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.generation.*;

import java.util.Objects;

public class GenerationSprites {

    @JsonProperty("generation-iii")
    GenerationIII generationIII;
    @JsonProperty("generation-iv")
    GenerationIV generationIV;
    @JsonProperty("generation-v")
    GenerationV generationV;
    @JsonProperty("generation-ix")
    GenerationIX generationIX;
    @JsonProperty("generation-vi")
    GenerationVI generationVI;
    @JsonProperty("generation-vii")
    GenerationVII generationVII;
    @JsonProperty("generation-viii")
    GenerationVIII generationVIII;

    /**
     * Returns the generationIII
     * @return the generationIII
     */
    public GenerationIII getGenerationIII() {
        return generationIII;
    }
    /**
     * Sets the generationIII
     * @param generationIII the generationIII
     */
    public void setGenerationIII(GenerationIII generationIII) {
        this.generationIII = generationIII;
    }

    /**
     * Returns the generationIV
     * @return the generationIV
     */
    public GenerationIV getGenerationIV() {
        return generationIV;
    }
    /**
     * Sets the generationIV
     * @param generationIV the generationIV
     */
    public void setGenerationIV(GenerationIV generationIV) {
        this.generationIV = generationIV;
    }

    /**
     * Returns the generationV
     * @return the generationV
     */
    public GenerationV getGenerationV() {
        return generationV;
    }
    /**
     * Sets the generationV
     * @param generationV the generationV
     */
    public void setGenerationV(GenerationV generationV) {
        this.generationV = generationV;
    }

    /**
     * Returns the generationIX
     * @return the generationIX
     */
    public GenerationIX getGenerationIX() {
        return generationIX;
    }
    /**
     * Sets the generationIX
     * @param generationIX the generationIX
     */
    public void setGenerationIX(GenerationIX generationIX) {
        this.generationIX = generationIX;
    }

    /**
     * Returns the generationVI
     * @return the generationVI
     */
    public GenerationVI getGenerationVI() {
        return generationVI;
    }
    /**
     * Sets the generationVI
     * @param generationVI the generationVI
     */
    public void setGenerationVI(GenerationVI generationVI) {
        this.generationVI = generationVI;
    }

    /**
     * Returns the generationVII
     * @return the generationVII
     */
    public GenerationVII getGenerationVII() {
        return generationVII;
    }
    /**
     * Sets the generationVII
     * @param generationVII the generationVII
     */
    public void setGenerationVII(GenerationVII generationVII) {
        this.generationVII = generationVII;
    }

    /**
     * Returns the generationVIII
     * @return the generationVIII
     */
    public GenerationVIII getGenerationVIII() {
        return generationVIII;
    }
    /**
     * Sets the generationVIII
     * @param generationVIII the generationVIII
     */
    public void setGenerationVIII(GenerationVIII generationVIII) {
        this.generationVIII = generationVIII;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationSprites
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationSprites that)) return false;
        return Objects.equals(getGenerationIII(), that.getGenerationIII()) && Objects.equals(getGenerationIV(), that.getGenerationIV()) && Objects.equals(getGenerationV(), that.getGenerationV()) && Objects.equals(getGenerationIX(), that.getGenerationIX()) && Objects.equals(getGenerationVI(), that.getGenerationVI()) && Objects.equals(getGenerationVII(), that.getGenerationVII()) && Objects.equals(getGenerationVIII(), that.getGenerationVIII());
    }

    /**
     * Returns the hash code of the GenerationSprites
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGenerationIII(), getGenerationIV(), getGenerationV(), getGenerationIX(), getGenerationVI(), getGenerationVII(), getGenerationVIII());
    }

    /**
     * Returns a string representation of the GenerationSprites
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationSprites{" +
                "generationIII=" + generationIII +
                ", generationIV=" + generationIV +
                ", generationV=" + generationV +
                ", generationIX=" + generationIX +
                ", generationVI=" + generationVI +
                ", generationVII=" + generationVII +
                ", generationVIII=" + generationVIII +
                '}';
    }
}
