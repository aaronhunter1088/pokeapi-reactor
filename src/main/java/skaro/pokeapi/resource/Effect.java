package skaro.pokeapi.resource;

import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

/**
 * The localized effect text for an
 * API resource in a specific language.
 */
public class Effect {

    private String effect;
    private NamedApiResource<Language> language;

    /**
     * Get the localized effect text for an
     * API resource in a specific language
     *
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Set the localized effect text for an
     * API resource in a specific language
     *
     * @param effect the effect
     */
    public void setEffect(String effect) {
        this.effect = effect;
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
     * equal to this instance of Effect
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Effect effect1)) return false;
        return Objects.equals(getEffect(), effect1.getEffect()) && Objects.equals(getLanguage(), effect1.getLanguage());
    }

    /**
     * Returns the hash code of the Effect
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getEffect(), getLanguage());
    }

    /**
     * Returns a string representation of the Effect
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Effect{" +
                "effect='" + effect + '\'' +
                ", language=" + language +
                '}';
    }
}
