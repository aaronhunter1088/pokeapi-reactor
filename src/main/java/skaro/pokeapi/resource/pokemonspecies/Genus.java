package skaro.pokeapi.resource.pokemonspecies;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

public class Genus {

	private String genus;
	private NamedApiResource<Language> language;

	/**
	 * Get the localized genus for the referenced Pokémon species
	 * @return the localized genus
	 */
	public String getGenus() {
		return genus;
	}
	/**
	 * Set the localized genus for the referenced Pokémon species
	 * @param genus the localized genus
	 */
	public void setGenus(String genus) {
		this.genus = genus;
	}

	/**
	 * Get the language this genus is in
	 * @return the {@link Language} of the language
	 */
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	/**
	 * Set the language this genus is in
	 * @param language the {@link Language} of the language
	 */
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of Genus
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Genus genus1)) return false;
        return Objects.equals(getGenus(), genus1.getGenus()) && Objects.equals(getLanguage(), genus1.getLanguage());
	}

	/**
	 * Returns the hash code of the Genus
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getGenus(), getLanguage());
	}

	/**
	 * Returns a string representation of the Genus
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "Genus{" +
				"genus='" + genus + '\'' +
				", language=" + language +
				'}';
	}
}
