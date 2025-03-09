package skaro.pokeapi.resource.pokemonshape;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

public class AwesomeName {

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
	 * @return the language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this "scientific" name is in
	 * @param language the language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Checks if the AwesomeName is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof AwesomeName that)) return false;
        return Objects.equals(getAwesomeName(), that.getAwesomeName()) && Objects.equals(getLanguage(), that.getLanguage());
	}

	/**
	 * Generates a hash code for the AwesomeName
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getAwesomeName(), getLanguage());
	}

	/**
	 * Generates a string representation of the AwesomeName
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
