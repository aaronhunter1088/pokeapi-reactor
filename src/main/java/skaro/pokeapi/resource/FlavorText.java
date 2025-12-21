package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

/**
 * The localized flavor text for an API resource
 * in a specific language. Note that this text is
 * left unprocessed as it is found in game files.
 * This means that it contains special characters
 * that one might want to replace with their visible
 * de-code-able version. Please check out this
 * <a href="https://github.com/veekun/pokedex/issues/218#issuecomment-339841781">
 * issue</a> to find out more.
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class FlavorText {

    @JsonProperty("flavor_text")
    private String flavorText;
    private NamedApiResource<Language> language;
    private NamedApiResource<Version> version;

    /**
     * Get the localized flavor text for an
     * API resource in a specific language.
     *
     * @return the flavor text
     */
    public String getFlavorText() {
        return flavorText;
    }

    /**
     * Set the localized flavor text for an
     *
     * @param flavorText the flavor text
     */
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    /**
     * Get the language this name is in
     *
     * @return the {@link Language} language
     */
    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    /**
     * Set the language this name is in
     *
     * @param language the {@link Language} language
     */
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

    /**
     * Get the game version this flavor text is extracted from
     *
     * @return the {@link Version} version
     */
    public NamedApiResource<Version> getVersion() {
        return version;
    }

    /**
     * Set the game version this flavor text is extracted from
     *
     * @param version the {@link Version} version
     */
    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of FlavorText
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FlavorText that)) return false;
        return Objects.equals(getFlavorText(), that.getFlavorText()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getVersion(), that.getVersion());
    }

    /**
     * Returns the hash code of the FlavorText
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFlavorText(), getLanguage(), getVersion());
    }

    /**
     * Returns a string representation of the FlavorText
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "FlavorText{" +
                "flavorText='" + flavorText + '\'' +
                ", language=" + language +
                ", version=" + version +
                '}';
    }
}
