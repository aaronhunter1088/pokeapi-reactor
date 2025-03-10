package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

public class VersionGroupFlavorText {

	private String text;
	private NamedApiResource<Language> language;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;

	/**
	 * Get the localized name for an
	 * API resource in a specific language
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * Set the localized name for an
	 * API resource in a specific language
	 * @param text the text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Get the language this name is in
	 * @return the {@link NamedApiResource} language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this name is in
	 * @param language the {@link NamedApiResource} language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Get the version group which uses this flavor text
	 * @return the {@link NamedApiResource} version group
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group which uses this flavor text
	 * @param versionGroup the {@link NamedApiResource} version group
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/** Returns whether the VersionGroupFlavorText is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof VersionGroupFlavorText that)) return false;
        return Objects.equals(getText(), that.getText()) && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
	}

	/** Returns the hash code of the VersionGroupFlavorText */
	@Override
	public int hashCode() {
		return Objects.hash(getText(), getLanguage(), getVersionGroup());
	}

	/** Returns the string representation of the VersionGroupFlavorText */
	@Override
	public String toString() {
		return "VersionGroupFlavorText{" +
				"text='" + text + '\'' +
				", language=" + language +
				", versionGroup=" + versionGroup +
				'}';
	}
}
