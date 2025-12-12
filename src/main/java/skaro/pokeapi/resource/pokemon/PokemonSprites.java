package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PokemonSprites {

	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_shiny")
	private String backShiny;
	@JsonProperty("front_female")
	private String frontFemale;
	@JsonProperty("back_female")
	private String backFemale;
	@JsonProperty("back_shiny_female")
	private String backShinyFemale;
	@JsonProperty("front_shiny_female")
	private String frontShinyFemale;
	private OtherSprites other;
	private GenerationSprites versions;

	/**
	 * Get the default depiction of this
	 * Pokémon from the front in battle
	 * @return the frontDefault
	 */
	public String getFrontDefault() {
		return frontDefault;
	}
	/**
	 * Set the default depiction of this
	 * @param frontDefault the frontDefault to set
	 */
	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	/**
	 * Get the shiny depiction of this
	 * Pokémon from the front in battle
	 * @return the frontShiny
	 */
	public String getFrontShiny() {
		return frontShiny;
	}
	/**
	 * Set the shiny depiction of this
	 * @param frontShiny the frontShiny to set
	 */
	public void setFrontShiny(String frontShiny) {
		this.frontShiny = frontShiny;
	}

	/**
	 * Get the female depiction of this Pokémon from the front in battle
	 * @return the frontFemale
	 */
	public String getFrontFemale() {
		return frontFemale;
	}
	/**
	 * Set the female depiction of this Pokémon from the front in battle
	 * @param frontFemale the frontFemale to set
	 */
	public void setFrontFemale(String frontFemale) {
		this.frontFemale = frontFemale;
	}

	/**
	 * Get the shiny female depiction of this Pokémon from the front in battle
	 * @return the frontShinyFemale
	 */
	public String getFrontShinyFemale() {
		return frontShinyFemale;
	}
	/**
	 * Set the shiny female depiction of this Pokémon from the front in battle
	 * @param frontShinyFemale the frontShinyFemale to set
	 */
	public void setFrontShinyFemale(String frontShinyFemale) {
		this.frontShinyFemale = frontShinyFemale;
	}

	/**
	 * Get the default depiction of this
	 * Pokémon from the back in battle
	 * @return the backDefault
	 */
	public String getBackDefault() {
		return backDefault;
	}
	/**
	 * Set the default depiction of this
	 * Pokémon from the back in battle
	 * @param backDefault the backDefault to set
	 */
	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	/**
	 * Get the shiny depiction of this
	 * Pokémon from the back in battle
	 * @return the backShiny
	 */
	public String getBackShiny() {
		return backShiny;
	}
	/**
	 * Set the shiny depiction of this
	 * Pokémon from the back in battle
	 * @param backShiny the backShiny to set
	 */
	public void setBackShiny(String backShiny) {
		this.backShiny = backShiny;
	}

	/**
	 * Get the back female depiction of this Pokémon from the back in battle
	 * @return the backFemale
	 */
	public String getBackFemale() {
		return backFemale;
	}
	/**
	 * Set the back female depiction of this Pokémon from the back in battle
	 * @param backFemale the backFemale to set
	 */
	public void setBackFemale(String backFemale) {
		this.backFemale = backFemale;
	}

	/**
	 * Get the shiny female depiction of this Pokémon from the back in battle
	 * @return the backShinyFemale
	 */
	public String getBackShinyFemale() {
		return backShinyFemale;
	}
	/**
	 * Set the shiny female depiction of this Pokémon from the back in battle
	 * @param backShinyFemale the backShinyFemale to set
	 */
	public void setBackShinyFemale(String backShinyFemale) {
		this.backShinyFemale = backShinyFemale;
	}

	/**
	 * Get the other sprites
	 * @return the {@link OtherSprites} other sprites
	 */
	public OtherSprites getOther() { return other; }
	/**
	 * Set the other sprites
	 * @param other the {@link OtherSprites} other sprites to set
	 */
	public void setOther(OtherSprites other) { this.other = other; }

	/**
	 * Get the versions generation sprites
	 * @return the {@link GenerationSprites} versions
	 */
	public GenerationSprites getVersions() { return versions; }
	/**
	 * Set the versions generation sprites
	 * @param versions the {@link GenerationSprites} versions to set
	 */
	public void setVersions(GenerationSprites versions) { this.versions = versions; }

	/**
	 * Returns whether the given object o is
	 * equal to this instance of PokemonSprites
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSprites that)) return false;
        return Objects.equals(getFrontDefault(), that.getFrontDefault()) && Objects.equals(getFrontShiny(), that.getFrontShiny()) && Objects.equals(getFrontFemale(), that.getFrontFemale()) && Objects.equals(getFrontShinyFemale(), that.getFrontShinyFemale()) && Objects.equals(getBackDefault(), that.getBackDefault()) && Objects.equals(getBackShiny(), that.getBackShiny()) && Objects.equals(getBackFemale(), that.getBackFemale()) && Objects.equals(getBackShinyFemale(), that.getBackShinyFemale());
	}

	/**
	 * Returns the hash code of the PokemonSprites
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getFrontDefault(), getFrontShiny(), getFrontFemale(), getFrontShinyFemale(), getBackDefault(), getBackShiny(), getBackFemale(), getBackShinyFemale());
	}

	/**
	 * Returns a string representation of the PokemonSprites
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonSprites{" +
				"frontDefault='" + frontDefault + '\'' +
				", frontShiny='" + frontShiny + '\'' +
				", frontFemale='" + frontFemale + '\'' +
				", frontShinyFemale='" + frontShinyFemale + '\'' +
				", backDefault='" + backDefault + '\'' +
				", backShiny='" + backShiny + '\'' +
				", backFemale='" + backFemale + '\'' +
				", backShinyFemale='" + backShinyFemale + '\'' +
				'}';
	}
}
