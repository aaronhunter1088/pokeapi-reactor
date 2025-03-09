package skaro.pokeapi.resource.pokedex;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

public class Pokedex implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	@JsonProperty("is_main_series")
	private Boolean isMainSeries;
	private List<Description> descriptions;
	private List<Name> names;
	@JsonProperty("pokemon_entries")
	private List<PokemonEntry> pokemonEntries;
	private NamedApiResource<Region> region;
	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;

	/** Gets the id of the pokedex */
	public Integer getId() {
		return id;
	}
	/** Sets the id of the pokedex */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the pokedex */
	public String getName() {
		return name;
	}
	/** Sets the name of the pokedex */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets whether or not this pokedex is the main series pokedex */
	public Boolean isMainSeries() {
		return isMainSeries;
	}
	/** Sets whether or not this pokedex is the main series pokedex */
	public void setIsMainSeries(Boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}

	/**
	 * Gets the descriptions of the pokedex
	 * @return the list of {@link Description} objects
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * Sets the descriptions of the pokedex
	 * @param descriptions the list of {@link Description} objects
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Gets the names of the pokedex
	 * @return the list of {@link Name} objects
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Sets the names of the pokedex
	 * @param names the list of {@link Name} objects
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Gets the pokemon entries of the pokedex
	 * @return the list of {@link PokemonEntry} objects
	 */
	public List<PokemonEntry> getPokemonEntries() {
		return pokemonEntries;
	}
	/**
	 * Sets the pokemon entries of the pokedex
	 * @param pokemonEntries the list of {@link PokemonEntry} objects
	 */
	public void setPokemonEntries(List<PokemonEntry> pokemonEntries) {
		this.pokemonEntries = pokemonEntries;
	}

	/**
	 * Gets the region this pokedex is relevant to
	 * @return the {@link NamedApiResource<Region>} object
	 */
	public NamedApiResource<Region> getRegion() {
		return region;
	}
	/**
	 * Sets the region this pokedex is relevant to
	 * @param region the {@link NamedApiResource<Region>} object
	 */
	public void setRegion(NamedApiResource<Region> region) {
		this.region = region;
	}

	/**
	 * Gets the version groups this pokedex is relevant to
	 * @return the list of {@link NamedApiResource<VersionGroup>} objects
	 */
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	/**
	 * Sets the version groups this pokedex is relevant to
	 * @param versionGroups the list of {@link NamedApiResource<VersionGroup>} objects
	 */
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}

	/** Returns whether the Pokedex is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pokedex pokedex)) return false;
        return Objects.equals(getId(), pokedex.getId()) && Objects.equals(getName(), pokedex.getName()) && Objects.equals(isMainSeries, pokedex.isMainSeries) && Objects.equals(getDescriptions(), pokedex.getDescriptions()) && Objects.equals(getNames(), pokedex.getNames()) && Objects.equals(getPokemonEntries(), pokedex.getPokemonEntries()) && Objects.equals(getRegion(), pokedex.getRegion()) && Objects.equals(getVersionGroups(), pokedex.getVersionGroups());
	}

	/** Returns the hash code of the pokedex */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), isMainSeries, getDescriptions(), getNames(), getPokemonEntries(), getRegion(), getVersionGroups());
	}

	/** Returns the string representation of the pokedex */
	@Override
	public String toString() {
		return "Pokedex{" +
				"id=" + id +
				", name='" + name + '\'' +
				", isMainSeries=" + isMainSeries +
				", descriptions=" + descriptions +
				", names=" + names +
				", pokemonEntries=" + pokemonEntries +
				", region=" + region +
				", versionGroups=" + versionGroups +
				'}';
	}
}
