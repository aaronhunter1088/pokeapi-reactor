package skaro.pokeapi.resource;

import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

/**
 * The localized name for an
 * API resource in a specific language.
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class Name {

    private String name;
    private NamedApiResource<Language> language;

    /**
     * Get the localized name for an
     * API resource in a specific language.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the localized name for an
     * API resource in a specific language.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the language
     *
     * @return the {@link Language} language
     */
    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    /**
     * Set the language
     *
     * @param language the {@link Language} language
     */
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Name
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Name name1)) return false;
        return Objects.equals(getName(), name1.getName()) && Objects.equals(getLanguage(), name1.getLanguage());
    }

    /**
     * Returns the hash code of the Name
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLanguage());
    }

    /**
     * Returns a string representation of the Name
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", language=" + language +
                '}';
    }
}
