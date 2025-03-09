package skaro.pokeapi.resource.ability;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

public class AbilityFlavorText {

	private String flavorText;
	private NamedApiResource<Language> language;
	private NamedApiResource<VersionGroup> versionGroup;

	/**
	 * Get the localized name for an API resource in a specific language
	 * @return the name
	 */
	public String getFlavorText() {
		return flavorText;
	}
	/**
	 * Set the localized name for an API resource in a specific language
	 * @param flavorText the name
	 */
	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	/**
	 * Get the language this text resource is in
	 * @return
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this text resource is in
	 * @param language the language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Get the version group that uses this flavor text
	 * @return the version group
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group that uses this flavor text
	 * @param versionGroup the version group
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Checks whether the object is equal to this ability flavor text
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof AbilityFlavorText that)) return false;
        return Objects.equals(getFlavorText(), that.getFlavorText()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
	}

	/**
	 * Returns a hash code value for the object
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getFlavorText(), getLanguage(), getVersionGroup());
	}

	/**
	 * Returns the AbilityFlavorText object in the form of a string
	 * @return a string representation of the object
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
