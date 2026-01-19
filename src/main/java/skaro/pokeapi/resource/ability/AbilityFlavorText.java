package skaro.pokeapi.resource.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

/**
 * Represents the AbilityFlavorText resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class AbilityFlavorText {

    @JsonProperty("flavor_text")
    private String flavorText;
    private NamedApiResource<Language> language;
    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;

    /**
     * Get the localized name for an API resource in a specific language
     *
     * @return the flavorText
     */
    public String getFlavorText() {
        return flavorText;
    }

    /**
     * Set the localized name for an API resource in a specific language
     *
     * @param flavorText the flavorText
     */
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    /**
     * Get the language this text resource is in
     *
     * @return the {@link Language} language
     */
    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    /**
     * Set the language this text resource is in
     *
     * @param language the {@link Language} language
     */
    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

    /**
     * Get the version group that uses this flavor text
     *
     * @return the {@link VersionGroup} versionGroup
     */
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set the version group that uses this flavor text
     *
     * @param versionGroup the {@link VersionGroup} versionGroup
     */
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of AbilityFlavorText
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AbilityFlavorText that)) return false;
        return Objects.equals(getFlavorText(), that.getFlavorText()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
    }

    /**
     * Returns the hash code of the AbilityFlavorText
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFlavorText(), getLanguage(), getVersionGroup());
    }

    /**
     * Returns a string representation of the AbilityFlavorText
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "AbilityFlavorText{" +
                "flavorText='" + flavorText + '\'' +
                ", language=" + language +
                ", versionGroup=" + versionGroup +
                '}';
    }
}
