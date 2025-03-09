package skaro.pokeapi.resource;

import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

/**
 * The localized effect text for an
 * API resource in a specific language.
 */
public class Effect {

	private String effect;
	private NamedApiResource<Language> language;

	/**
	 * Get the effect
	 * @return the effect
	 */
	public String getEffect() {
		return effect;
	}
	/**
	 * Set the effect
	 * @param effect the effect
	 */
	public void setEffect(String effect) {
		this.effect = effect;
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

	/** Returns whether the Effect is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Effect effect1)) return false;
        return Objects.equals(getEffect(), effect1.getEffect()) && Objects.equals(getLanguage(), effect1.getLanguage());
	}

	/** Returns the hash code of the Effect */
	@Override
	public int hashCode() {
		return Objects.hash(getEffect(), getLanguage());
	}

	/** Returns the string representation of the Effect */
	@Override
	public String toString() {
		return "Effect{" +
				"effect='" + effect + '\'' +
				", language=" + language +
				'}';
	}
}
