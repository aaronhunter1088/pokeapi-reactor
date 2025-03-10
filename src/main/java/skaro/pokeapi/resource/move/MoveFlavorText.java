package skaro.pokeapi.resource.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.Objects;

public class MoveFlavorText {

	@JsonProperty("flavor_text")
	private String flavorText;
	private NamedApiResource<Language> language;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;

	/**
	 * Get the {@link Localizable} flavor text for an api resource in a specific language
	 * @return a string representing the flavor text
	 */
	public String getFlavorText() {
		return flavorText;
	}
	/**
	 * Set the {@link Localizable} flavor text for an api resource in a specific language
	 * @param flavorText a string representing the flavor text
	 */
	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	/**
	 * Get the language this move flavor text is in
	 * @return a {@link NamedApiResource<Language>} object
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this move flavor text is in
	 * @param language a {@link NamedApiResource<Language>} object
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Get the version group that this move flavor text uses
	 * @return a {@link NamedApiResource<VersionGroup>} object
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group that this move flavor text uses
	 * @param versionGroup a {@link NamedApiResource<VersionGroup>} object
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Checks whether the MoveFlavorText is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveFlavorText that)) return false;
        return Objects.equals(getFlavorText(), that.getFlavorText()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
	}

	/**
	 * Generate a hash code for the MoveFlavorText
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getFlavorText(), getLanguage(), getVersionGroup());
	}

	/**
	 * Get the string representation of the MoveFlavorText
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "MoveFlavorText{" +
				"flavorText='" + flavorText + '\'' +
				", language=" + language +
				", versionGroup=" + versionGroup +
				'}';
	}
}
