package skaro.pokeapi.resource;

import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

/**
 * The localized description for an
 * API resource in a specific language.
 */
public class Description {

    private String description;
    private NamedApiResource<Language> language;

    /**
     * Get the localized description for an
     * API resource in a specific language
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the localized description for an
     * API resource in a specific language
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Returns whether the given object o is
     * equal to this instance of Description
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Description that)) return false;
        return Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getLanguage(), that.getLanguage());
    }

    /**
     * Returns the hash code of the Description
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getLanguage());
    }

    /**
     * Returns a string representation of the Description
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Description{" +
                "description='" + description + '\'' +
                ", language=" + language +
                '}';
    }
}
