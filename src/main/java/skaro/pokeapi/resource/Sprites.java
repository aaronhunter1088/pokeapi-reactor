package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the sprites used to depict a Pokémon
 * form in various in-game situations
 *
 * @author michael ball
 * @since 1.0.8
 */
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
    @JsonProperty("name_icon")
    private String nameIcon;
    @JsonProperty("animated")
    private Sprites animated;

    /**
     * The default depiction of this Pokémon form from the front in battle
     *
     * @return the frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    /**
     * Set the default depiction of this Pokémon form from the front in battle
     *
     * @param frontDefault the frontDefault to set
     */
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * Get the default depiction of this Pokémon form from the back in battle
     *
     * @return the backDefault
     */
    public String getBackDefault() {
        return backDefault;
    }

    /**
     * Set the default depiction of this Pokémon form from the back in battle
     *
     * @param backDefault the backDefault to set
     */
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     *
     * @return the frontMale
     */
    public String getFrontMale() {
        return frontMale;
    }

    /**
     * Set the default depiction of this Pokémon form from the front in battle
     *
     * @param frontMale the frontMale to set
     */
    public void setFrontMale(String frontMale) {
        this.frontMale = frontMale;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     *
     * @return the frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    /**
     * Set the default depiction of this Pokémon form from the front in battle
     *
     * @param frontFemale the frontFemale to set
     */
    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     *
     * @return the backMale
     */
    public String getBackMale() {
        return backMale;
    }

    /**
     * Set the default depiction of this Pokémon form from the front in battle
     *
     * @param backMale the backMale to set
     */
    public void setBackMale(String backMale) {
        this.backMale = backMale;
    }

    /**
     * Get the default depiction of this Pokémon form from the front in battle
     *
     * @return the backFemale
     */
    public String getBackFemale() {
        return backFemale;
    }

    /**
     * Set the default depiction of this Pokémon form from the front in battle
     *
     * @param backFemale the backFemale to set
     */
    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the front in battle
     *
     * @return the frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }

    /**
     * Set the shiny depiction of this Pokémon form from the front in battle
     *
     * @param frontShiny the frontShiny to set
     */
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the back in battle
     *
     * @return the backShiny
     */
    public String getBackShiny() {
        return backShiny;
    }

    /**
     * Set the shiny depiction of this Pokémon form from the back in battle
     *
     * @param backShiny the backShiny to set
     */
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the front in battle
     *
     * @return the frontShinyMale
     */
    public String getFrontShinyMale() {
        return frontShinyMale;
    }

    /**
     * Set the shiny depiction of this Pokémon form from the front in battle
     *
     * @param frontShinyMale the frontShinyMale to set
     */
    public void setFrontShinyMale(String frontShinyMale) {
        this.frontShinyMale = frontShinyMale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the back in battle
     *
     * @return the backShinyMale
     */
    public String getBackShinyMale() {
        return backShinyMale;
    }

    /**
     * Set the shiny depiction of this Pokémon form from the back in battle
     *
     * @param backShinyMale the backShinyMale to set
     */
    public void setBackShinyMale(String backShinyMale) {
        this.backShinyMale = backShinyMale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the front in battle
     *
     * @return the frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    /**
     * Set the shiny depiction of this Pokémon form from the front in battle
     *
     * @param frontShinyFemale the frontShinyFemale to set
     */
    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * Get the shiny depiction of this Pokémon form from the back in battle
     *
     * @return the backShinyFemale
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    /**
     * Set the shiny depiction of this Pokémon form from the back in battle
     *
     * @param backShinyFemale the backShinyFemale to set
     */
    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * Get the gray depiction of this Pokémon form from the front in battle
     *
     * @return the frontGray
     */
    public String getFrontGray() {
        return frontGray;
    }

    /**
     * Set the gray depiction of this Pokémon form from the front in battle
     *
     * @param frontGray the frontGray to set
     */
    public void setFrontGray(String frontGray) {
        this.frontGray = frontGray;
    }

    /**
     * Get the gray depiction of this Pokémon form from the back in battle
     *
     * @return the backGray
     */
    public String getBackGray() {
        return backGray;
    }

    /**
     * Set the gray depiction of this Pokémon form from the back in battle
     *
     * @param backGray the backGray to set
     */
    public void setBackGray(String backGray) {
        this.backGray = backGray;
    }

    /**
     * Get the transparent depiction of this Pokémon form from the front in battle
     *
     * @return the frontTransparent
     */
    public String getFrontTransparent() {
        return frontTransparent;
    }

    /**
     * Set the transparent depiction of this Pokémon form from the front in battle
     *
     * @param frontTransparent the frontTransparent to set
     */
    public void setFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
    }

    /**
     * Get the transparent depiction of this Pokémon form from the back in battle
     *
     * @return the backTransparent
     */
    public String getBackTransparent() {
        return backTransparent;
    }

    /**
     * Set the transparent depiction of this Pokémon form from the back in battle
     *
     * @param backTransparent the backTransparent to set
     */
    public void setBackTransparent(String backTransparent) {
        this.backTransparent = backTransparent;
    }

    /**
     * Get the shiny transparent depiction of this Pokémon form from the front in battle
     *
     * @return the frontShinyTransparent
     */
    public String getFrontShinyTransparent() {
        return frontShinyTransparent;
    }

    /**
     * Set the shiny transparent depiction of this Pokémon form from the front in battle
     *
     * @param frontShinyTransparent the frontShinyTransparent to set
     */
    public void setFrontShinyTransparent(String frontShinyTransparent) {
        this.frontShinyTransparent = frontShinyTransparent;
    }

    /**
     * Get the shiny transparent depiction of this Pokémon form from the back in battle
     *
     * @return the backShinyTransparent
     */
    public String getBackShinyTransparent() {
        return backShinyTransparent;
    }

    /**
     * Set the shiny transparent depiction of this Pokémon form from the back in battle
     *
     * @param backShinyTransparent the backShinyTransparent to set
     */
    public void setBackShinyTransparent(String backShinyTransparent) {
        this.backShinyTransparent = backShinyTransparent;
    }

    /**
     * Get the name icon
     *
     * @return the nameIcon
     */
    public String getNameIcon() {
        return nameIcon;
    }

    /**
     * Set the name icon
     *
     * @param nameIcon the nameIcon to set
     */
    public void setNameIcon(String nameIcon) {
        this.nameIcon = nameIcon;
    }

    /**
     * Get the animated depiction of this Pokémon form from the front in battle
     *
     * @return the animated
     */
    public Sprites getAnimated() {
        return animated;
    }

    /**
     * Set the animated depiction of this Pokémon form from the front in battle
     *
     * @param animated the animated to set
     */
    public void setAnimated(Sprites animated) {
        this.animated = animated;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Sprites
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sprites sprites)) return false;
        return Objects.equals(getFrontDefault(), sprites.getFrontDefault()) && Objects.equals(getBackDefault(), sprites.getBackDefault()) && Objects.equals(getFrontMale(), sprites.getFrontMale()) && Objects.equals(getFrontFemale(), sprites.getFrontFemale()) && Objects.equals(getBackMale(), sprites.getBackMale()) && Objects.equals(getBackFemale(), sprites.getBackFemale()) && Objects.equals(getFrontShiny(), sprites.getFrontShiny()) && Objects.equals(getBackShiny(), sprites.getBackShiny()) && Objects.equals(getFrontShinyMale(), sprites.getFrontShinyMale()) && Objects.equals(getBackShinyMale(), sprites.getBackShinyMale()) && Objects.equals(getFrontShinyFemale(), sprites.getFrontShinyFemale()) && Objects.equals(getBackShinyFemale(), sprites.getBackShinyFemale()) && Objects.equals(getFrontGray(), sprites.getFrontGray()) && Objects.equals(getBackGray(), sprites.getBackGray()) && Objects.equals(getFrontTransparent(), sprites.getFrontTransparent()) && Objects.equals(getBackTransparent(), sprites.getBackTransparent()) && Objects.equals(getFrontShinyTransparent(), sprites.getFrontShinyTransparent()) && Objects.equals(getBackShinyTransparent(), sprites.getBackShinyTransparent()) && Objects.equals(getNameIcon(), sprites.getNameIcon()) && Objects.equals(getAnimated(), sprites.getAnimated());
    }

    /**
     * Returns the hash code of the Sprites
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFrontDefault(), getBackDefault(), getFrontMale(), getFrontFemale(), getBackMale(), getBackFemale(), getFrontShiny(), getBackShiny(), getFrontShinyMale(), getBackShinyMale(), getFrontShinyFemale(), getBackShinyFemale(), getFrontGray(), getBackGray(), getFrontTransparent(), getBackTransparent(), getFrontShinyTransparent(), getBackShinyTransparent(), getNameIcon(), getAnimated());
    }

    /**
     * Returns a string representation of the Sprites
     *
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
                ", frontGray='" + frontGray + '\'' +
                ", backGray='" + backGray + '\'' +
                ", frontTransparent='" + frontTransparent + '\'' +
                ", backTransparent='" + backTransparent + '\'' +
                ", frontShinyTransparent='" + frontShinyTransparent + '\'' +
                ", backShinyTransparent='" + backShinyTransparent + '\'' +
                ", nameIcon='" + nameIcon + '\'' +
                ", animated=" + animated +
                '}';
    }
}
