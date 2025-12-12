package skaro.pokeapi.resource.ability;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VerboseEffect;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.utils.locale.Localizable;

public class Ability implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	@JsonProperty("is_main_series")
	private Boolean mainSeries;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;
	@JsonProperty("effect_changes")
	private List<AbilityEffectChange> effectChanges;
	@JsonProperty("flavor_text_entries")
	private List<AbilityFlavorText> flavorTextEntries;
	private List<AbilityPokemon> pokemon;

	/**
	 * Get the id
	 * @return the id
	 */
	@Override
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
	 * Get the name for this resource
	 * @return the name
	 */
	@Override
	public String getName() {
		return name;
	}
	/**
	 * Set the name for this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get whether or not this ability originated
	 * in the main series of the video games
	 * @return mainSeries
	 */
	public Boolean isMainSeries() {
		return mainSeries;
	}

	/**
	 * Set whether or not this ability originated
	 * in the main series of the video games
	 * @param isMainSeries the value to set
	 */
	public void setMainSeries(Boolean isMainSeries) {
		this.mainSeries = isMainSeries;
	}

	/**
	 * Get the generation this ability originated in
	 * @return the {@link Generation} generation
	 */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/**
	 * Sets the generation this ability originated in
	 * @param generation the {@link Generation} generation
	 * */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/**
	 * Gets the names of this resource listed in different languages
	 * @return the list of {@link Name} name
	 */
	@Override
	public List<Name> getNames() {
		return names;
	}

	/**
	 * Sets the names of this resource listed in different languages
	 * @param names the {@link Name} names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Gets the effect of this ability listed in different languages
	 * @return list of {@link VerboseEffect} verboseEffects
	 */
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	/**
	 * Sets the effects of the ability listed in different languages
	 * @param effectEntries list of {@link VerboseEffect} verboseEffects
	 */
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/**
	 * Gets the list of previous effects this
	 * ability has had across version groups
	 * @return list of {@link AbilityEffectChange} effectChanges
	 */
	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}
	/**
	 * Sets the list of previous effects this
	 * ability has had across version groups
	 * @param effectChanges list of {@link AbilityEffectChange} effectChanges
	 */
	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}

	/**
	 * Gets the flavor text of this
	 * ability listed in different languages
	 * @return list of {@link AbilityFlavorText} flavorTextEntries
	 */
	public List<AbilityFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/**
	 * Sets the flavor text of this
	 * ability listed in different languages
	 * @param flavorTextEntries list of {@link AbilityFlavorText} flavorTextEntries
	 */
	public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/**
	 * Gets a list of Pokémon that could
	 * potentially have this ability
	 * @return list of {@link AbilityPokemon} pokemon
	 */
	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Sets a list of Pokémon that could
	 * potentially have this ability
	 * @param pokemon list of {@link AbilityPokemon} pokemon
	 */
	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of Ability
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Ability ability)) return false;
        return Objects.equals(getId(), ability.getId()) && Objects.equals(getName(), ability.getName()) && Objects.equals(mainSeries, ability.mainSeries) && Objects.equals(getGeneration(), ability.getGeneration()) && Objects.equals(getNames(), ability.getNames()) && Objects.equals(getEffectEntries(), ability.getEffectEntries()) && Objects.equals(getEffectChanges(), ability.getEffectChanges()) && Objects.equals(getFlavorTextEntries(), ability.getFlavorTextEntries()) && Objects.equals(getPokemon(), ability.getPokemon());
	}

	/**
	 * Returns the hash code of the Ability
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), mainSeries, getGeneration(), getNames(), getEffectEntries(), getEffectChanges(), getFlavorTextEntries(), getPokemon());
	}

	/**
	 * Returns a string representation of the Ability
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "Ability{" +
				"id=" + id +
				", name='" + name + '\'' +
				", isMainSeries=" + mainSeries +
				", generation=" + generation +
				", names=" + names +
				", effectEntries=" + effectEntries +
				", effectChanges=" + effectChanges +
				", flavorTextEntries=" + flavorTextEntries +
				", pokemon=" + pokemon +
				'}';
	}
}
