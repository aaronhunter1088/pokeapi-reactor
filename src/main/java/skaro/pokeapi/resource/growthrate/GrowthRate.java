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

	/** Gets the id of the GrowthRate */
	public Integer getId() {
		return id;
	}
	/** Sets the id of the GrowthRate */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the GrowthRate */
	public String getName() {
		return name;
	}
	/** Sets the name of the GrowthRate */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the formula of the GrowthRate */
	public String getFormula() {
		return formula;
	}
	/** Sets the formula of the GrowthRate */
	public void setFormula(String formula) {
		this.formula = formula;
	}

	/** Gets the descriptions of the GrowthRate */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/** Sets the descriptions of the GrowthRate */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/** Gets the levels of the GrowthRate */
	public List<GrowthRateExperienceLevel> getLevels() {
		return levels;
	}
	/** Sets the levels of the GrowthRate */
	public void setLevels(List<GrowthRateExperienceLevel> levels) {
		this.levels = levels;
	}

	/** Gets the pokemonSpecies of the GrowthRate */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/** Sets the pokemonSpecies of the GrowthRate */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/** Returns true if the GrowthRate is equal to the object being passed, false otherwise */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof GrowthRate that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getFormula(), that.getFormula()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getLevels(), that.getLevels()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/** Returns the hash code of the GrowthRate */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getFormula(), getDescriptions(), getLevels(), getPokemonSpecies());
	}

	/** Returns a string representation of the GrowthRate */
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
