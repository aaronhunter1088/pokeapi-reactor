package skaro.pokeapi.resource;

import skaro.pokeapi.resource.language.Language;

import java.util.Objects;

public class VerboseEffect {

	private String effect;
	private String shortEffect;
	private NamedApiResource<Language> language;

	/**
	 * Get the localized effect text for
	 * an API resource in a specific language
	 * @return the effect
	 */
	public String getEffect() {
		return effect;
	}
	/**
	 * Set the localized effect text for
	 * an API resource in a specific language
	 * @param effect the effect
	 */
	public void setEffect(String effect) {
		this.effect = effect;
	}

	/**
	 * Get the localized effect text in brief.
	 * @return the shortEffect
	 */
	public String getShortEffect() {
		return shortEffect;
	}
	/**
	 * Set the localized effect text in brief.
	 * @param shortEffect the shortEffect
	 */
	public void setShortEffect(String shortEffect) {
		this.shortEffect = shortEffect;
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

	/** Returns whether the VerboseEffect is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof VerboseEffect that)) return false;
        return Objects.equals(getEffect(), that.getEffect()) && Objects.equals(getShortEffect(), that.getShortEffect()) && Objects.equals(getLanguage(), that.getLanguage());
	}

	/** Returns the hash code of the VerboseEffect */
	@Override
	public int hashCode() {
		return Objects.hash(getEffect(), getShortEffect(), getLanguage());
	}

	/** Returns the string representation of the VerboseEffect */
	@Override
	public String toString() {
		return "VerboseEffect{" +
				"effect='" + effect + '\'' +
				", shortEffect='" + shortEffect + '\'' +
				", language=" + language +
				'}';
	}
}
