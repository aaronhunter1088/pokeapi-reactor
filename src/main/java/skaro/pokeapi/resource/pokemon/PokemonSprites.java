package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSprites {

	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	@JsonProperty("front_female")
	private String frontFemale;
	@JsonProperty("front_shiny_female")
	private String frontShinyFemale;
	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_shiny")
	private String backShiny;
	@JsonProperty("back_female")
	private String backFemale;
	@JsonProperty("back_shiny_female")
	private String backShinyFemale;
	private OtherSprites other;
	private GenerationSprites versions;

	public OtherSprites getOther() { return other; }
	public void setOther(OtherSprites other) { this.other = other; }
	public GenerationSprites getVersions() { return versions; }
	public void setVersions(GenerationSprites versions) { this.versions = versions; }

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
	 * Check if this PokemonSprites is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSprites that)) return false;
        return Objects.equals(getFrontDefault(), that.getFrontDefault()) && Objects.equals(getFrontShiny(), that.getFrontShiny()) && Objects.equals(getFrontFemale(), that.getFrontFemale()) && Objects.equals(getFrontShinyFemale(), that.getFrontShinyFemale()) && Objects.equals(getBackDefault(), that.getBackDefault()) && Objects.equals(getBackShiny(), that.getBackShiny()) && Objects.equals(getBackFemale(), that.getBackFemale()) && Objects.equals(getBackShinyFemale(), that.getBackShinyFemale());
	}

	/**
	 * Generate a hash code for this PokemonSprites
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getFrontDefault(), getFrontShiny(), getFrontFemale(), getFrontShinyFemale(), getBackDefault(), getBackShiny(), getBackFemale(), getBackShinyFemale());
	}

	/**
	 * Get a String representation of this PokemonSprites
	 * @return the String representation
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
