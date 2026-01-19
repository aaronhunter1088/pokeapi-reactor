package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.generation.*;

import java.util.Objects;

/**
 * Represents the various sprite
 * images available for a Pokémon
 *
 * @author michael ball
 * @since 1.0.8
 */
public class GenerationSprites {

    @JsonProperty("generation-i")
    GenerationI generationI;
    @JsonProperty("generation-ii")
    GenerationII generationII;
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
     * Get the generationI
     *
     * @return the generationI
     */
    public GenerationI getGenerationI() {
        return generationI;
    }

    /**
     * Set the generationI
     *
     * @param generationI the generationI
     */
    public void setGenerationI(GenerationI generationI) {
        this.generationI = generationI;
    }

    /**
     * Get the generationII
     *
     * @return the generationII
     */
    public GenerationII getGenerationII() {
        return generationII;
    }

    /**
     * Set the generationII
     *
     * @param generationII the generationII
     */
    public void setGenerationII(GenerationII generationII) {
        this.generationII = generationII;
    }

    /**
     * Get the generationIII
     *
     * @return the generationIII
     */
    public GenerationIII getGenerationIII() {
        return generationIII;
    }

    /**
     * Set the generationIII
     *
     * @param generationIII the generationIII
     */
    public void setGenerationIII(GenerationIII generationIII) {
        this.generationIII = generationIII;
    }

    /**
     * Get the generationIV
     *
     * @return the generationIV
     */
    public GenerationIV getGenerationIV() {
        return generationIV;
    }

    /**
     * Set the generationIV
     *
     * @param generationIV the generationIV
     */
    public void setGenerationIV(GenerationIV generationIV) {
        this.generationIV = generationIV;
    }

    /**
     * Get the generationV
     *
     * @return the generationV
     */
    public GenerationV getGenerationV() {
        return generationV;
    }

    /**
     * Set the generationV
     *
     * @param generationV the generationV
     */
    public void setGenerationV(GenerationV generationV) {
        this.generationV = generationV;
    }

    /**
     * Get the generationIX
     *
     * @return the generationIX
     */
    public GenerationIX getGenerationIX() {
        return generationIX;
    }

    /**
     * Set the generationIX
     *
     * @param generationIX the generationIX
     */
    public void setGenerationIX(GenerationIX generationIX) {
        this.generationIX = generationIX;
    }

    /**
     * Get the generationVI
     *
     * @return the generationVI
     */
    public GenerationVI getGenerationVI() {
        return generationVI;
    }

    /**
     * Set the generationVI
     *
     * @param generationVI the generationVI
     */
    public void setGenerationVI(GenerationVI generationVI) {
        this.generationVI = generationVI;
    }

    /**
     * Get the generationVII
     *
     * @return the generationVII
     */
    public GenerationVII getGenerationVII() {
        return generationVII;
    }

    /**
     * Set the generationVII
     *
     * @param generationVII the generationVII
     */
    public void setGenerationVII(GenerationVII generationVII) {
        this.generationVII = generationVII;
    }

    /**
     * Get the generationVIII
     *
     * @return the generationVIII
     */
    public GenerationVIII getGenerationVIII() {
        return generationVIII;
    }

    /**
     * Set the generationVIII
     *
     * @param generationVIII the generationVIII
     */
    public void setGenerationVIII(GenerationVIII generationVIII) {
        this.generationVIII = generationVIII;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationSprites
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationSprites that)) return false;
        return Objects.equals(getGenerationI(), that.getGenerationI()) && Objects.equals(getGenerationII(), that.getGenerationII()) && Objects.equals(getGenerationIII(), that.getGenerationIII()) && Objects.equals(getGenerationIV(), that.getGenerationIV()) && Objects.equals(getGenerationV(), that.getGenerationV()) && Objects.equals(getGenerationIX(), that.getGenerationIX()) && Objects.equals(getGenerationVI(), that.getGenerationVI()) && Objects.equals(getGenerationVII(), that.getGenerationVII()) && Objects.equals(getGenerationVIII(), that.getGenerationVIII());
    }

    /**
     * Returns the hash code of the GenerationSprites
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGenerationI(), getGenerationII(), getGenerationIII(), getGenerationIV(), getGenerationV(), getGenerationIX(), getGenerationVI(), getGenerationVII(), getGenerationVIII());
    }

    /**
     * Returns a string representation of the GenerationSprites
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationSprites{" +
                "generationI=" + generationI +
                ", generationII=" + generationII +
                ", generationIII=" + generationIII +
                ", generationIV=" + generationIV +
                ", generationV=" + generationV +
                ", generationIX=" + generationIX +
                ", generationVI=" + generationVI +
                ", generationVII=" + generationVII +
                ", generationVIII=" + generationVIII +
                '}';
    }
}
