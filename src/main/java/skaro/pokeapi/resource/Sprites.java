package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Sprites {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("front_male")
    private String frontMale;
    @JsonProperty("front_female")
    private String frontFemale;
    @JsonProperty("back_male")
    private String backMale;
    @JsonProperty("back_female")
    private String backFemale;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("front_shiny_male")
    private String frontShinyMale;
    @JsonProperty("back_shiny_male")
    private String backShinyMale;
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;
    @JsonProperty("back_shiny_female")
    private String backShinyFemale;
    @JsonProperty("front_gray")
    private String frontGray;
    @JsonProperty("back_gray")
    private String backGray;
    @JsonProperty("front_transparent")
    private String frontTransparent;
    @JsonProperty("back_transparent")
    private String backTransparent;
    @JsonProperty("front_shiny_transparent")
    private String frontShinyTransparent;
    @JsonProperty("back_shiny_transparent")
    private String backShinyTransparent;

    /**
     * The default depiction of this Pokémon form from the front in battle
     * @return the frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }
    /**
     * Set the default depiction of this Pokémon form from the front in battle
     * @param frontDefault the frontDefault to set
     */
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * Get the default depiction of this Pokémon form from the back in battle
     * @return the backDefault
     */
    public String getBackDefault() {
        return backDefault;
    }
    /**
     * Set the default depiction of this Pokémon form from the back in battle
     * @param backDefault the backDefault to set
     */
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     * @return the frontMale
     */
    public String getFrontMale() {
        return frontMale;
    }
    /**
     * Set the default depiction of this Pokémon form from the front in battle
     * @param frontMale the frontMale to set
     */
    public void setFrontMale(String frontMale) {
        this.frontMale = frontMale;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     * @return the frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }
    /**
     * Set the default depiction of this Pokémon form from the front in battle
     * @param frontFemale the frontFemale to set
     */
    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     * @return the backMale
     */
    public String getBackMale() {
        return backMale;
    }
    /**
     * Set the default depiction of this Pokémon form from the front in battle
     * @param backMale the backMale to set
     */
    public void setBackMale(String backMale) {
        this.backMale = backMale;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     * @return the backFemale
     */
    public String getBackFemale() {
        return backFemale;
    }
    /**
     * Set the default depiction of this Pokémon form from the front in battle
     * @param backFemale the backFemale to set
     */
    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the front in battle
     * @return the frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }
    /**
     * Set the shiny depiction of this Pokémon form from the front in battle
     * @param frontShiny the frontShiny to set
     */
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the back in battle
     * @return the backShiny
     */
    public String getBackShiny() {
        return backShiny;
    }
    /**
     * Set the shiny depiction of this Pokémon form from the back in battle
     * @param backShiny the backShiny to set
     */
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the front in battle
     * @return the frontShinyMale
     */
    public String getFrontShinyMale() {
        return frontShinyMale;
    }
    /**
     * Set the shiny depiction of this Pokémon form from the front in battle
     * @param frontShinyMale the frontShinyMale to set
     */
    public void setFrontShinyMale(String frontShinyMale) {
        this.frontShinyMale = frontShinyMale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the back in battle
     * @return the backShinyMale
     */
    public String getBackShinyMale() {
        return backShinyMale;
    }
    /**
     * Set the shiny depiction of this Pokémon form from the back in battle
     * @param backShinyMale the backShinyMale to set
     */
    public void setBackShinyMale(String backShinyMale) {
        this.backShinyMale = backShinyMale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the front in battle
     * @return the frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }
    /**
     * Set the shiny depiction of this Pokémon form from the front in battle
     * @param frontShinyFemale the frontShinyFemale to set
     */
    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the back in battle
     * @return the backShinyFemale
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }
    /**
     * Set the shiny depiction of this Pokémon form from the back in battle
     * @param backShinyFemale the backShinyFemale to set
     */
    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Sprites
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sprites sprites)) return false;
        return Objects.equals(getFrontDefault(), sprites.getFrontDefault()) && Objects.equals(getBackDefault(), sprites.getBackDefault()) && Objects.equals(getFrontMale(), sprites.getFrontMale()) && Objects.equals(getFrontFemale(), sprites.getFrontFemale()) && Objects.equals(getBackMale(), sprites.getBackMale()) && Objects.equals(getBackFemale(), sprites.getBackFemale()) && Objects.equals(getFrontShiny(), sprites.getFrontShiny()) && Objects.equals(getBackShiny(), sprites.getBackShiny()) && Objects.equals(getFrontShinyMale(), sprites.getFrontShinyMale()) && Objects.equals(getBackShinyMale(), sprites.getBackShinyMale()) && Objects.equals(getFrontShinyFemale(), sprites.getFrontShinyFemale()) && Objects.equals(getBackShinyFemale(), sprites.getBackShinyFemale());
    }

    /**
     * Returns the hash code of the Sprites
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFrontDefault(), getBackDefault(), getFrontMale(), getFrontFemale(), getBackMale(), getBackFemale(), getFrontShiny(), getBackShiny(), getFrontShinyMale(), getBackShinyMale(), getFrontShinyFemale(), getBackShinyFemale());
    }

    /**
     * Returns a string representation of the Sprites
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Sprites{" +
                "frontDefault='" + frontDefault + '\'' +
                ", backDefault='" + backDefault + '\'' +
                ", frontMale='" + frontMale + '\'' +
                ", frontFemale='" + frontFemale + '\'' +
                ", backMale='" + backMale + '\'' +
                ", backFemale='" + backFemale + '\'' +
                ", frontShiny='" + frontShiny + '\'' +
                ", backShiny='" + backShiny + '\'' +
                ", frontShinyMale='" + frontShinyMale + '\'' +
                ", backShinyMale='" + backShinyMale + '\'' +
                ", frontShinyFemale='" + frontShinyFemale + '\'' +
                ", backShinyFemale='" + backShinyFemale + '\'' +
                '}';
    }
}
