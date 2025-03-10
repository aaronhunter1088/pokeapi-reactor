package skaro.pokeapi.resource.pokemonspecies;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.FlavorText;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.egggroup.EggGroup;
import skaro.pokeapi.resource.evolutionchain.EvolutionChain;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.growthrate.GrowthRate;
import skaro.pokeapi.resource.palparkarea.PalParkEncounterSpecies;
import skaro.pokeapi.resource.pokemoncolor.PokemonColor;
import skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat;
import skaro.pokeapi.resource.pokemonshape.PokemonShape;
import skaro.pokeapi.utils.locale.Localizable;

public class PokemonSpecies implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer order;
	@JsonProperty("gender_rate")
	private Integer genderRate;
	@JsonProperty("capture_rate")
	private Integer captureRate;
	@JsonProperty("base_happiness")
	private Integer baseHappiness;
	@JsonProperty("is_baby")
	private Boolean isBaby;
	@JsonProperty("is_legendary")
	private Boolean isLegendary;
	@JsonProperty("is_mythical")
	private Boolean isMythical;
	@JsonProperty("hatch_counter")
	private Integer hatchCounter;
	@JsonProperty("has_gender_differences")
	private Boolean hasGenderDifferences;
	@JsonProperty("forms_switchable")
	private Boolean formsSwitchable;
	@JsonProperty("growth_rate")
	private NamedApiResource<GrowthRate> growthRate;
	@JsonProperty("pokedex_numbers")
	private List<PokemonSpeciesDexEntry> pokedexNumbers;
	@JsonProperty("egg_groups")
	private List<NamedApiResource<EggGroup>> eggGroups;
	private NamedApiResource<PokemonColor> color;
	private NamedApiResource<PokemonShape> shape;
	@JsonProperty("evolves_from_species")
	private NamedApiResource<PokemonSpecies> evolvesFromSpecies;
	@JsonProperty("evolution_chain")
	private NamedApiResource<EvolutionChain> evolutionChain;
	private NamedApiResource<PokemonHabitat> habitat;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	@JsonProperty("flavor_text_entries")
	private List<FlavorText> flavorTextEntries;
	@JsonProperty("form_descriptions")
	private List<Description> formDescriptions;
	private List<Genus> genera;
	private List<PokemonSpeciesVariety> varieties;
	@JsonProperty("pal_park_encounters")
	private List<PalParkEncounterSpecies> palParkEncounters;

	/** Gets the id of the PokemonSpecies */
	@Override
	public Integer getId() {
		return id;
	}
	/** Sets the id of the PokemonSpecies */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the PokemonSpecies */
	@Override
	public String getName() {
		return name;
	}
	/** Sets the name of the PokemonSpecies */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the order */
	public Integer getOrder() {
		return order;
	}
	/** Sets the order */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/** Gets the genderRate */
	public Integer getGenderRate() {
		return genderRate;
	}
	/** Sets the genderRate */
	public void setGenderRate(Integer genderRate) {
		this.genderRate = genderRate;
	}

	/** Gets the captureRate */
	public Integer getCaptureRate() {
		return captureRate;
	}
	/** Sets the captureRate */
	public void setCaptureRate(Integer captureRate) {
		this.captureRate = captureRate;
	}

	/** Gets the baseHappiness */
	public Integer getBaseHappiness() {
		return baseHappiness;
	}
	/** Sets the baseHappiness */
	public void setBaseHappiness(Integer baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	/** Gets the isBaby */
	public Boolean isBaby() {
		return isBaby;
	}
	/** Sets the isBaby */
	public void setBaby(Boolean baby) {
		isBaby = baby;
	}

	/** Gets the isLegendary */
	public Boolean isLegendary() {
		return isLegendary;
	}
	/** Sets the isLegendary */
	public void setLegendary(Boolean legendary) {
		isLegendary = legendary;
	}

	/** Gets the isMythical */
	public Boolean isMythical() {
		return isMythical;
	}
	/** Sets the isMythical */
	public void setMythical(Boolean mythical) {
		isMythical = mythical;
	}

	/** Gets the hatchCounter */
	public Integer getHatchCounter() {
		return hatchCounter;
	}
	/** Sets the hatchCounter */
	public void setHatchCounter(Integer hatchCounter) {
		this.hatchCounter = hatchCounter;
	}

	/** Gets the hasGenderDifferences */
	public Boolean hasGenderDifferences() {
		return hasGenderDifferences;
	}
	/** Sets the hasGenderDifferences */
	public void setHasGenderDifferences(Boolean hasGenderDifferences) {
		this.hasGenderDifferences = hasGenderDifferences;
	}

	/** Gets the formsSwitchable */
	public Boolean isFormsSwitchable() {
		return formsSwitchable;
	}
	/** Sets the formsSwitchable */
	public void setFormsSwitchable(Boolean formsSwitchable) {
		this.formsSwitchable = formsSwitchable;
	}

	/** Gets the growthRate */
	public NamedApiResource<GrowthRate> getGrowthRate() {
		return growthRate;
	}
	/** Sets the growthRate */
	public void setGrowthRate(NamedApiResource<GrowthRate> growthRate) {
		this.growthRate = growthRate;
	}

	/** Gets the pokedexNumbers */
	public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
		return pokedexNumbers;
	}
	/** Sets the pokedexNumbers */
	public void setPokedexNumbers(List<PokemonSpeciesDexEntry> pokedexNumbers) {
		this.pokedexNumbers = pokedexNumbers;
	}

	/** Gets the eggGroups */
	public List<NamedApiResource<EggGroup>> getEggGroups() {
		return eggGroups;
	}
	/** Sets the eggGroups */
	public void setEggGroups(List<NamedApiResource<EggGroup>> eggGroups) {
		this.eggGroups = eggGroups;
	}

	/** Gets the color */
	public NamedApiResource<PokemonColor> getColor() {
		return color;
	}
	/** Sets the color */
	public void setColor(NamedApiResource<PokemonColor> color) {
		this.color = color;
	}

	/** Gets the shape */
	public NamedApiResource<PokemonShape> getShape() {
		return shape;
	}
	/** Sets the shape */
	public void setShape(NamedApiResource<PokemonShape> shape) {
		this.shape = shape;
	}

	/** Gets the evolvesFromSpecies */
	public NamedApiResource<PokemonSpecies> getEvolvesFromSpecies() {
		return evolvesFromSpecies;
	}
	/** Sets the evolvesFromSpecies */
	public void setEvolvesFromSpecies(NamedApiResource<PokemonSpecies> evolvesFromSpecies) {
		this.evolvesFromSpecies = evolvesFromSpecies;
	}

	/** Gets the evolutionChain */
	public NamedApiResource<EvolutionChain> getEvolutionChain() {
		return evolutionChain;
	}
	/** Sets the evolutionChain */
	public void setEvolutionChain(NamedApiResource<EvolutionChain> evolutionChain) {
		this.evolutionChain = evolutionChain;
	}

	/** Gets the habitat */
	public NamedApiResource<PokemonHabitat> getHabitat() {
		return habitat;
	}
	/** Sets the habitat */
	public void setHabitat(NamedApiResource<PokemonHabitat> habitat) {
		this.habitat = habitat;
	}

	/** Gets the generation */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/** Sets the generation */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/** Gets the names */
	@Override
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the flavorTextEntries */
	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/** Sets the flavorTextEntries */
	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/** Gets the formDescriptions */
	public List<Description> getFormDescriptions() {
		return formDescriptions;
	}
	/** Sets the formDescriptions */
	public void setFormDescriptions(List<Description> formDescriptions) {
		this.formDescriptions = formDescriptions;
	}

	/** Gets the genera */
	public List<Genus> getGenera() {
		return genera;
	}
	/** Sets the genera */
	public void setGenera(List<Genus> genera) {
		this.genera = genera;
	}

	/** Gets the varieties */
	public List<PokemonSpeciesVariety> getVarieties() {
		return varieties;
	}
	/** Sets the varieties */
	public void setVarieties(List<PokemonSpeciesVariety> varieties) {
		this.varieties = varieties;
	}

	/**
	 * Returns true if the object is an instance
	 * of PokemonSpecies and all of its fields are
	 * equal to this PokemonSpecies' fields
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonSpecies species)) return false;
        return Objects.equals(getId(), species.getId()) && Objects.equals(getName(), species.getName()) &&
			   Objects.equals(getOrder(), species.getOrder()) && Objects.equals(getGenderRate(), species.getGenderRate()) &&
			   Objects.equals(getCaptureRate(), species.getCaptureRate()) && Objects.equals(getBaseHappiness(), species.getBaseHappiness()) &&
			   Objects.equals(isBaby, species.isBaby) && Objects.equals(isLegendary, species.isLegendary) &&
			   Objects.equals(isMythical, species.isMythical) && Objects.equals(getHatchCounter(), species.getHatchCounter()) &&
			   Objects.equals(hasGenderDifferences(), species.hasGenderDifferences()) && Objects.equals(isFormsSwitchable(), species.isFormsSwitchable()) &&
			   Objects.equals(getGrowthRate(), species.getGrowthRate()) && Objects.equals(getPokedexNumbers(), species.getPokedexNumbers()) &&
			   Objects.equals(getEggGroups(), species.getEggGroups()) && Objects.equals(getColor(), species.getColor()) &&
			   Objects.equals(getShape(), species.getShape()) && Objects.equals(getEvolvesFromSpecies(), species.getEvolvesFromSpecies()) &&
			   Objects.equals(getEvolutionChain(), species.getEvolutionChain()) && Objects.equals(getHabitat(), species.getHabitat()) &&
			   Objects.equals(getGeneration(), species.getGeneration()) && Objects.equals(getNames(), species.getNames()) &&
			   Objects.equals(getFlavorTextEntries(), species.getFlavorTextEntries()) && Objects.equals(getFormDescriptions(), species.getFormDescriptions()) &&
			   Objects.equals(getGenera(), species.getGenera()) && Objects.equals(getVarieties(), species.getVarieties());
	}

	/** Returns the hash code of the PokemonSpecies */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getOrder(), getGenderRate(), getCaptureRate(),
				getBaseHappiness(), isBaby, isLegendary, isMythical, getHatchCounter(),
				hasGenderDifferences(), isFormsSwitchable(), getGrowthRate(), getPokedexNumbers(),
				getEggGroups(), getColor(), getShape(), getEvolvesFromSpecies(), getEvolutionChain(),
				getHabitat(), getGeneration(), getNames(), getFlavorTextEntries(), getFormDescriptions(),
				getGenera(), getVarieties());
	}

	/**
	 * Returns a string representation of the PokemonSpecies
	 */
	@Override
	public String toString() {
		return "PokemonSpecies{" +
				"id=" + id +
				", name='" + name + '\'' +
				", order=" + order +
				", genderRate=" + genderRate +
				", captureRate=" + captureRate +
				", baseHappiness=" + baseHappiness +
				", isBaby=" + isBaby +
				", isLegendary=" + isLegendary +
				", isMythical=" + isMythical +
				", hatchCounter=" + hatchCounter +
				", hasGenderDifferences=" + hasGenderDifferences +
				", formsSwitchable=" + formsSwitchable +
				", growthRate=" + growthRate +
				", pokedexNumbers=" + pokedexNumbers +
				", eggGroups=" + eggGroups +
				", color=" + color +
				", shape=" + shape +
				", evolvesFromSpecies=" + evolvesFromSpecies +
				", evolutionChain=" + evolutionChain +
				", habitat=" + habitat +
				", generation=" + generation +
				", names=" + names +
				", flavorTextEntries=" + flavorTextEntries +
				", formDescriptions=" + formDescriptions +
				", genera=" + genera +
				", varieties=" + varieties +
				'}';
	}
}
