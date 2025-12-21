package skaro.pokeapi.resource.contesttype;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

/**
 * Represents a localized name for a Contest Type
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class ContestName {

    private String name;
    private String color;
    private NamedApiResource<Language> language;

    /**
     * Get the name for this contest.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this contest.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the color associated with this contest's name
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the color associated with this contest's name
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the language this contest's name is in
     *
     * @return the {@link Language} language
     */
    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    /**
     * Set the language this contest's name is in
     *
     * @param language the {@link Language} language
     */
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ContestName
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ContestName that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getColor(), that.getColor()) && Objects.equals(getLanguage(), that.getLanguage());
    }

    /**
     * Returns the hash code of the ContestName
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getLanguage());
    }

    /**
     * Returns a string representation of the ContestName
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ContestName{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", language=" + language +
                '}';
    }
}
