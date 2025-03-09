package skaro.pokeapi.resource.pokemonform;

import java.util.Objects;

public class PokemonFormSprites {

	private String frontDefault;
	private String frontShiny;
	private String backDefault;
	private String backShiny;

	/**
	 * The default depiction of this Pokémon form from the front in battle
	 * @return the frontDefault
	 */
	public String getFrontDefault() {
		return frontDefault;
	}
	/**
	 * Set the default depiction of this Pokémon form from the front in battle
	 * @param frontDefault the frontDefault to set
	 */
	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	/**
	 * Get the shiny depiction of this Pokémon form from the front in battle
	 * @return the frontShiny
	 */
	public String getFrontShiny() {
		return frontShiny;
	}
	/**
	 * Set the shiny depiction of this Pokémon form from the front in battle
	 * @param frontShiny the frontShiny to set
	 */
	public void setFrontShiny(String frontShiny) {
		this.frontShiny = frontShiny;
	}

	/**
	 * Get the default depiction of this Pokémon form from the back in battle
	 * @return the backDefault
	 */
	public String getBackDefault() {
		return backDefault;
	}
	/**
	 * Set the default depiction of this Pokémon form from the back in battle
	 * @param backDefault the backDefault to set
	 */
	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	/**
	 * Get the shiny depiction of this Pokémon form from the back in battle
	 * @return the backShiny
	 */
	public String getBackShiny() {
		return backShiny;
	}
	/**
	 * Set the shiny depiction of this Pokémon form from the back in battle
	 * @param backShiny the backShiny to set
	 */
	public void setBackShiny(String backShiny) {
		this.backShiny = backShiny;
	}

	/**
	 * Determines whether this PokemonFormSprites is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonFormSprites that)) return false;
        return Objects.equals(getFrontDefault(), that.getFrontDefault()) && Objects.equals(getFrontShiny(), that.getFrontShiny()) && Objects.equals(getBackDefault(), that.getBackDefault()) && Objects.equals(getBackShiny(), that.getBackShiny());
	}

	/**
	 * Generates a hash code for this PokemonFormSprites
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getFrontDefault(), getFrontShiny(), getBackDefault(), getBackShiny());
	}

	/**
	 * Generates a string representation of the PokemonFormSprites
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonFormSprites{" +
				"frontDefault='" + frontDefault + '\'' +
				", frontShiny='" + frontShiny + '\'' +
				", backDefault='" + backDefault + '\'' +
				", backShiny='" + backShiny + '\'' +
				'}';
	}
}
