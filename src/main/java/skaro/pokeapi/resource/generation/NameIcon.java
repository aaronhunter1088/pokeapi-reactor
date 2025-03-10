package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class NameIcon {

    @JsonProperty("name_icon")
    private String nameIcon;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("front_female")
    private String frontFemale;
    @JsonProperty("back_female")
    private String backFemale;
    @JsonProperty("back_shiny_female")
    private String backShinyFemale;
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;
    @JsonProperty("animated")
    private NameIcon animated;

    /**
     * Get the url for the icon
     * @return the nameIcon
     */
    public String getNameIcon() {
        return nameIcon;
    }
    /**
     * Set the url for the icon
     * @param nameIcon the nameIcon to set
     */
    public void setNameIcon(String nameIcon) {
        this.nameIcon = nameIcon;
    }

    /**
     * Get the default depiction of this
     * Pokémon from the front in battle
     * @return the frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }
    /**
     * Set the default depiction of this
     * @param frontDefault the frontDefault to set
     */
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * Get the shiny depiction of this
     * Pokémon from the front in battle
     * @return the frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }
    /**
     * Set the shiny depiction of this
     * @param frontShiny the frontShiny to set
     */
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * Get the default depiction of this
     * Pokémon from the back in battle
     * @return the backDefault
     */
    public String getBackDefault() {
        return backDefault;
    }
    /**
     * Set the default depiction of this
     * @param backDefault the backDefault to set
     */
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * Get the shiny depiction of this
     * Pokémon from the back in battle
     * @return the backShiny
     */
    public String getBackShiny() {
        return backShiny;
    }
    /**
     * Set the shiny depiction of this
     * @param backShiny the backShiny to set
     */
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * Get the front female depiction
     * of this Pokemon
     * @return the frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }
    /**
     * Set the front female depiction
     * of this Pokemon
     * @param frontFemale the frontFemale to set
     */
    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * Get the back female depiction
     * of this Pokemon
     * @return the backFemale
     */
    public String getBackFemale() {
        return backFemale;
    }
    /**
     * Set the back female depiction
     * of this Pokemon
     * @param backFemale the backFemale to set
     */
    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * Get the back shiny female depiction
     * of this Pokemon
     * @return the backShinyFemale
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }
    /**
     * Set the back shiny female depiction
     * of this Pokemon
     * @param backShinyFemale the backShinyFemale to set
     */
    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * Get the front shiny female depiction
     * of this Pokemon
     * @return the frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }
    /**
     * Set the front female depiction
     * of this Pokemon
     * @param frontShinyFemale the frontShinyFemale to set
     */
    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * Get the animated depiction of this Pokemon
     * @return the animated
     */
    public NameIcon getAnimated() {
        return animated;
    }
    /**
     * Set the animated depiction of this Pokemon
     * @param animated the animated to set
     */
    public void setAnimated(NameIcon animated) {
        this.animated = animated;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of NameIcon
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NameIcon nameIcon1)) return false;
        return Objects.equals(getNameIcon(), nameIcon1.getNameIcon()) && Objects.equals(getFrontDefault(), nameIcon1.getFrontDefault()) && Objects.equals(getFrontShiny(), nameIcon1.getFrontShiny()) && Objects.equals(getBackDefault(), nameIcon1.getBackDefault()) && Objects.equals(getBackShiny(), nameIcon1.getBackShiny()) && Objects.equals(getFrontFemale(), nameIcon1.getFrontFemale()) && Objects.equals(getBackFemale(), nameIcon1.getBackFemale()) && Objects.equals(getBackShinyFemale(), nameIcon1.getBackShinyFemale()) && Objects.equals(getFrontShinyFemale(), nameIcon1.getFrontShinyFemale()) && Objects.equals(getAnimated(), nameIcon1.getAnimated());
    }

    /**
     * Returns the hash code of the NameIcon
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getNameIcon(), getFrontDefault(), getFrontShiny(), getBackDefault(), getBackShiny(), getFrontFemale(), getBackFemale(), getBackShinyFemale(), getFrontShinyFemale(), getAnimated());
    }

    /**
     * Returns a string representation of the Ability
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NameIcon{" +
                "nameIcon='" + nameIcon + '\'' +
                ", frontDefault='" + frontDefault + '\'' +
                ", frontShiny='" + frontShiny + '\'' +
                ", backDefault='" + backDefault + '\'' +
                ", backShiny='" + backShiny + '\'' +
                ", frontFemale='" + frontFemale + '\'' +
                ", backFemale='" + backFemale + '\'' +
                ", backShinyFemale='" + backShinyFemale + '\'' +
                ", frontShinyFemale='" + frontShinyFemale + '\'' +
                ", animated=" + animated +
                '}';
    }
}
