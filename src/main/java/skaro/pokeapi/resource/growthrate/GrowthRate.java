package skaro.pokeapi.resource.growthrate;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

public class GrowthRate implements PokeApiResource {

	private Integer id;
	private String name;
	private String formula;
	private List<Description> descriptions;
	private List<GrowthRateExperienceLevel> levels;
	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

	/**
	 * Get the id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Set the id
	 * @param id the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the name of this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name of this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the formula used to calculate the rate
	 * at which the Pokémon species gains level
	 * @return the formula
	 */
	public String getFormula() {
		return formula;
	}
	/**
	 * Set the formula used to calculate the rate
	 * at which the Pokémon species gains level
	 * @param formula the formula
	 */
	public void setFormula(String formula) {
		this.formula = formula;
	}

	/**
	 * Get the descriptions of this characteristic
	 * listed in different languages
	 * @return the {@link Description} descriptions
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * Set the descriptions of this characteristic
	 * listed in different languages
	 * @param descriptions the {@link Description} descriptions
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Get a list of levels and the amount of experienced
	 * needed to attain them based on this growth rate
	 * @return the {@link GrowthRateExperienceLevel} levels
	 */
	public List<GrowthRateExperienceLevel> getLevels() {
		return levels;
	}
	/**
	 * Set a list of levels and the amount of experienced
	 * needed to attain them based on this growth rate
	 * @param levels the {@link GrowthRateExperienceLevel} levels
	 */
	public void setLevels(List<GrowthRateExperienceLevel> levels) {
		this.levels = levels;
	}

	/**
	 * Get a list of Pokémon species that gain levels at
	 * this growth rate
	 * @return the {@link PokemonSpecies} pokemonSpecies
	 */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Set a list of Pokémon species that gain levels at
	 * this growth rate
	 * @param pokemonSpecies the {@link PokemonSpecies} pokemonSpecies
	 */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of GrowthRate
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof GrowthRate that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getFormula(), that.getFormula()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getLevels(), that.getLevels()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/**
	 * Returns the hash code of the Ability
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getFormula(), getDescriptions(), getLevels(), getPokemonSpecies());
	}

	/**
	 * Returns a string representation of the Ability
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "GrowthRate{" +
				"id=" + id +
				", name='" + name + '\'' +
				", formula='" + formula + '\'' +
				", descriptions=" + descriptions +
				", levels=" + levels +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
