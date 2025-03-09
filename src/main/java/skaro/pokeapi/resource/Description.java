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
	 * Get the description
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Set the description
	 * @param description the description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the language
	 * @return the {@link NamedApiResource} language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language
	 * @param language the {@link NamedApiResource} language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/** Returns whether the Description is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Description that)) return false;
        return Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getLanguage(), that.getLanguage());
	}

	/** Returns the hash code of the Description */
	@Override
	public int hashCode() {
		return Objects.hash(getDescription(), getLanguage());
	}

	/** Returns the string representation of the Description */
	@Override
	public String toString() {
		return "Description{" +
				"description='" + description + '\'' +
				", language=" + language +
				'}';
	}
}
