package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

/**
 * Represents the localized flavor text
 * for an API resource in a specific version group
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class VersionGroupFlavorText {

    private String text;
    private NamedApiResource<Language> language;
    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;

    /**
     * Get the localized name for an
     * API resource in a specific language
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Set the localized name for an
     * API resource in a specific language
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
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
     * Get the version group which uses this flavor text
     *
     * @return the {@link VersionGroup} versionGroup
     */
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set the version group which uses this flavor text
     *
     * @param versionGroup the {@link VersionGroup} versionGroup
     */
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of VersionGroupFlavorText
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VersionGroupFlavorText that)) return false;
        return Objects.equals(getText(), that.getText()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
    }

    /**
     * Returns the hash code of the VersionGroupFlavorText
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getText(), getLanguage(), getVersionGroup());
    }

    /**
     * Returns a string representation of the VersionGroupFlavorText
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "VersionGroupFlavorText{" +
                "text='" + text + '\'' +
                ", language=" + language +
                ", versionGroup=" + versionGroup +
                '}';
    }
}
