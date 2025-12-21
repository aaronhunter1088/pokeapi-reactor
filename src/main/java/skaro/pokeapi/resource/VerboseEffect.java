package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

/**
 * Represents the localized effect text
 * for an API resource in a specific language
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class VerboseEffect {

    private String effect;
    @JsonProperty("short_effect")
    private String shortEffect;
    private NamedApiResource<Language> language;

    /**
     * Get the localized effect text for
     * an API resource in a specific language
     *
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Set the localized effect text for
     * an API resource in a specific language
     *
     * @param effect the effect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * Get the localized effect text in brief
     *
     * @return the shortEffect
     */
    public String getShortEffect() {
        return shortEffect;
    }

    /**
     * Set the localized effect text in brief
     *
     * @param shortEffect the shortEffect
     */
    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
    }

    /**
     * Get the language this effect is in
     *
     * @return the {@link Language} language
     */
    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    /**
     * Set the language this effect is in
     *
     * @param language the {@link Language} language
     */
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of VerboseEffect
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VerboseEffect that)) return false;
        return Objects.equals(getEffect(), that.getEffect()) && Objects.equals(getShortEffect(), that.getShortEffect()) && Objects.equals(getLanguage(), that.getLanguage());
    }

    /**
     * Returns the hash code of the VerboseEffect
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getEffect(), getShortEffect(), getLanguage());
    }

    /**
     * Returns a string representation of the VerboseEffect
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "VerboseEffect{" +
                "effect='" + effect + '\'' +
                ", shortEffect='" + shortEffect + '\'' +
                ", language=" + language +
                '}';
    }
}
