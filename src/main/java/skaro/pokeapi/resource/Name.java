package skaro.pokeapi.resource;

import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

public class Name {

	private String name;
	private NamedApiResource<Language> language;

	/**
	 * Get the localized name for an
	 * API resource in a specific language.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the localized name for an
	 * API resource in a specific language.
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the language
	 * @return the language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}

	/**
	 * Set the language
	 * @param language the language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/** Returns whether the Name is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Name name1)) return false;
        return Objects.equals(getName(), name1.getName()) && Objects.equals(getLanguage(), name1.getLanguage());
	}

	/** Returns the hash code of the Name */
	@Override
	public int hashCode() {
		return Objects.hash(getName(), getLanguage());
	}

	/** Returns the string representation of the Name */
	@Override
	public String toString() {
		return "Name{" +
				"name='" + name + '\'' +
				", language=" + language +
				'}';
	}
}
