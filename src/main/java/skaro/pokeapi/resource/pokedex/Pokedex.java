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
	 * Get whether or not this pokedex is the main series pokedex
	 * @return the boolean value
	 */
	public Boolean isMainSeries() {
		return isMainSeries;
	}
	/**
	 * Set whether or not this pokedex is the main series pokedex
	 * @param isMainSeries the boolean value
	 */
	public void setIsMainSeries(Boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}

	/**
	 * Get the descriptions of the pokedex
	 * @return the list of {@link Description} objects
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * Set the descriptions of the pokedex
	 * @param descriptions the list of {@link Description} objects
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Get the names of the pokedex
	 * @return the list of {@link Name} names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the names of the pokedex
	 * @param names the list of {@link Name} names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get the Pokémon entries of the pokedex
	 * @return the list of {@link PokemonEntry} pokemon entries
	 */
	public List<PokemonEntry> getPokemonEntries() {
		return pokemonEntries;
	}
	/**
	 * Set the pokemon entries of the pokedex
	 * @param pokemonEntries the list of {@link PokemonEntry} pokemon entries
	 */
	public void setPokemonEntries(List<PokemonEntry> pokemonEntries) {
		this.pokemonEntries = pokemonEntries;
	}

	/**
	 * Get the region this pokedex is relevant to
	 * @return the {@link Region} object
	 */
	public NamedApiResource<Region> getRegion() {
		return region;
	}
	/**
	 * Set the region this pokedex is relevant to
	 * @param region the {@link Region} object
	 */
	public void setRegion(NamedApiResource<Region> region) {
		this.region = region;
	}

	/**
	 * Get the version groups this pokedex is relevant to
	 * @return the list of {@link VersionGroup} objects
	 */
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	/**
	 * Set the version groups this pokedex is relevant to
	 * @param versionGroups the list of {@link VersionGroup} objects
	 */
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of Pokedex
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pokedex pokedex)) return false;
        return Objects.equals(getId(), pokedex.getId()) && Objects.equals(getName(), pokedex.getName()) && Objects.equals(isMainSeries, pokedex.isMainSeries) && Objects.equals(getDescriptions(), pokedex.getDescriptions()) && Objects.equals(getNames(), pokedex.getNames()) && Objects.equals(getPokemonEntries(), pokedex.getPokemonEntries()) && Objects.equals(getRegion(), pokedex.getRegion()) && Objects.equals(getVersionGroups(), pokedex.getVersionGroups());
	}

	/**
	 * Returns the hash code of the Pokedex
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), isMainSeries, getDescriptions(), getNames(), getPokemonEntries(), getRegion(), getVersionGroups());
	}

	/**
	 * Returns a string representation of the Pokedex
	 * @return the string representation
	 */
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
