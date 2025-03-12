package skaro.pokeapi.resource.pokemonshape;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

public class AwesomeName {

	@JsonProperty("awesome_name")
	private String awesomeName;
	private NamedApiResource<Language> language;

	/**
	 * Ghe localized "scientific" name for an
	 * API resource in a specific language
	 * @return the localized name
	 */
	public String getAwesomeName() {
		return awesomeName;
	}
	/**
	 * Set the localized "scientific" name for an
	 * @param awesomeName the localized name
	 */
	public void setAwesomeName(String awesomeName) {
		this.awesomeName = awesomeName;
	}

	/**
	 * Get the language this "scientific" name is in
	 * @return the {@link Language} language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this "scientific" name is in
	 * @param language the {@link Language} language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of AwesomeName
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof AwesomeName that)) return false;
        return Objects.equals(getAwesomeName(), that.getAwesomeName()) && Objects.equals(getLanguage(), that.getLanguage());
	}

	/**
	 * Returns the hash code of the AwesomeName
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getAwesomeName(), getLanguage());
	}

	/**
	 * Returns a string representation of the AwesomeName
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "AwesomeName{" +
				"awesomeName='" + awesomeName + '\'' +
				", language=" + language +
				'}';
	}
}
