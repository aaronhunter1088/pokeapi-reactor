package skaro.pokeapi.resource.pokemonform;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the PokemonSprites resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PokemonFormSprites {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("back_female")
    private String backFemale;
    @JsonProperty("back_shiny_female")
    private String backShinyFemale;
    @JsonProperty("front_female")
    private String frontFemale;
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;

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
     * Get the back female depiction
     * of this Pokemon
     *
     * @return the backFemale
     */
    public String getBackFemale() {
        return backFemale;
    }

    /**
     * Set the back female depiction
     * of this Pokemon
     *
     * @param backFemale the backFemale to set
     */
    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * Get the back shiny female depiction
     * of this Pokemon
     *
     * @return the backShinyFemale
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    /**
     * Set the back shiny female depiction
     * of this Pokemon
     *
     * @param backShinyFemale the backShinyFemale to set
     */
    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * Get the front female depiction
     * of this Pokemon
     *
     * @return the frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    /**
     * Set the front female depiction
     * of this Pokemon
     *
     * @param frontFemale the frontFemale to set
     */
    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * Get the front shiny female depiction
     * of this Pokemon
     *
     * @return the frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    /**
     * Set the front female depiction
     * of this Pokemon
     *
     * @param frontShinyFemale the frontShinyFemale to set
     */
    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonFormSprites
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonFormSprites that)) return false;
        return Objects.equals(getFrontDefault(), that.getFrontDefault()) && Objects.equals(getFrontShiny(), that.getFrontShiny()) && Objects.equals(getBackDefault(), that.getBackDefault()) && Objects.equals(getBackShiny(), that.getBackShiny()) && Objects.equals(getBackFemale(), that.getBackFemale()) && Objects.equals(getBackShinyFemale(), that.getBackShinyFemale()) && Objects.equals(getFrontFemale(), that.getFrontFemale()) && Objects.equals(getFrontShinyFemale(), that.getFrontShinyFemale());
    }

    /**
     * Returns the hash code of the PokemonFormSprites
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFrontDefault(), getFrontShiny(), getBackDefault(), getBackShiny(), getBackFemale(), getBackShinyFemale(), getFrontFemale(), getFrontShinyFemale());
    }

    /**
     * Returns a string representation of the PokemonFormSprites
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonFormSprites{" +
                "frontDefault='" + frontDefault + '\'' +
                ", frontShiny='" + frontShiny + '\'' +
                ", backDefault='" + backDefault + '\'' +
                ", backShiny='" + backShiny + '\'' +
                ", backFemale='" + backFemale + '\'' +
                ", backShinyFemale='" + backShinyFemale + '\'' +
                ", frontFemale='" + frontFemale + '\'' +
                ", frontShinyFemale='" + frontShinyFemale + '\'' +
                '}';
    }
}
