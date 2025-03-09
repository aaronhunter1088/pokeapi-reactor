package skaro.pokeapi.resource.contesttype;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

public class ContestName {

	private String name;
	private String color;
	private NamedApiResource<Language> language;

	/**
	 * Get the name for this contest.
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name for this contest.
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the color associated with this contest's name
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Set the color associated with this contest's name
	 * @param color the color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Get the language this contest's name is in
	 * @return the language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this contest's name is in
	 * @param language the language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Two ContestName objects are considered equal if they have the same name, color, and language.
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ContestName that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getColor(), that.getColor()) && Objects.equals(getLanguage(), that.getLanguage());
	}

	/**
	 * The hash code of a ContestName object is based on the name, color, and language.
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getName(), getColor(), getLanguage());
	}

	/**
	 * Returns the name of the contest in the form of a string
	 * @return the name
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
