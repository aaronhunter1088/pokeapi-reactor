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
	private Boolean isMainSeries;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;
	@JsonProperty("effect_changes")
	private List<AbilityEffectChange> effectChanges;
	@JsonProperty("flavor_text_entries")
	private List<AbilityFlavorText> flavorTextEntries;
	private List<AbilityPokemon> pokemon;

	/** Gets the id of the Ability */
	@Override
	public Integer getId() {
		return id;
	}
	/** Sets the id of the Ability */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the Ability */
	@Override
	public String getName() {
		return name;
	}
	/** Sets the name of the Ability */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets whether or not the Ability is part of the main series */
	public Boolean isMainSeries() {
		return isMainSeries;
	}
	/** Sets whether or not the Ability is part of the main series */
	public void setMainSeries(Boolean mainSeries) {
		isMainSeries = mainSeries;
	}

	/** Gets the generation this Ability was introduced in */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/** Sets the generation this Ability was introduced in */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/** Gets the names the Ability has been given in different languages */
	@Override
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names the Ability has been given in different languages */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the effects of the Ability in different languages */
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	/** Sets the effects of the Ability in different languages */
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/** Gets the effect changes of the Ability */
	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}
	/** Sets the effect changes of the Ability */
	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}

	/** Gets the flavor text entries of the Ability */
	public List<AbilityFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/** Sets the flavor text entries of the Ability */
	public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/** Gets the Pokemon that have this Ability */
	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}
	/** Sets the Pokemon that have this Ability */
	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/** Returns whether the given object o is equal to this instance of Ability */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Ability ability)) return false;
        return Objects.equals(getId(), ability.getId()) && Objects.equals(getName(), ability.getName()) && Objects.equals(isMainSeries, ability.isMainSeries) && Objects.equals(getGeneration(), ability.getGeneration()) && Objects.equals(getNames(), ability.getNames()) && Objects.equals(getEffectEntries(), ability.getEffectEntries()) && Objects.equals(getEffectChanges(), ability.getEffectChanges()) && Objects.equals(getFlavorTextEntries(), ability.getFlavorTextEntries()) && Objects.equals(getPokemon(), ability.getPokemon());
	}

	/** Returns the hash code of the Ability */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), isMainSeries, getGeneration(), getNames(), getEffectEntries(), getEffectChanges(), getFlavorTextEntries(), getPokemon());
	}

	/** Returns a string representation of the Ability */
	@Override
	public String toString() {
		return "Ability{" +
				"id=" + id +
				", name='" + name + '\'' +
				", isMainSeries=" + isMainSeries +
				", generation=" + generation +
				", names=" + names +
				", effectEntries=" + effectEntries +
				", effectChanges=" + effectChanges +
				", flavorTextEntries=" + flavorTextEntries +
				", pokemon=" + pokemon +
				'}';
	}
}
