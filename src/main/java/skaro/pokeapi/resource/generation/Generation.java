package skaro.pokeapi.resource.generation;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.util.Named;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.ability.Ability;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.resource.type.Type;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

public class Generation implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Ability>> abilities;
	private List<Name> names;
	private List<NamedApiResource<Move>> moves;
	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;
	private List<NamedApiResource<Type>> types;
	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;
	@JsonProperty("main_region")
	private NamedApiResource<Region> mainRegion;

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
	 * Get the name for this resource
	 * @return the name
	 */
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
	 * Get a list of abilities that were introduced in this generation
	 * @return a list of {@link NamedApiResource<Ability>} objects
	 */
	public List<NamedApiResource<Ability>> getAbilities() {
		return abilities;
	}
	/**
	 * Set a list of abilities that were introduced in this generation
	 * @param abilities a list of {@link NamedApiResource<Ability>} objects
	 */
	public void setAbilities(List<NamedApiResource<Ability>> abilities) {
		this.abilities = abilities;
	}

	/**
	 * Get the name of this resource listed in different languages
	 * @return a list of {@link Name} objects
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this resource listed in different languages
	 * @param names a list of {@link Name} objects
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get a list of moves that were introduced in this generation
	 * @return a list of {@link NamedApiResource<Move>} objects
	 */
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	/**
	 * Set a list of moves that were introduced in this generation
	 * @param moves a list of {@link NamedApiResource<Move>} objects
	 */
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	/**
	 * Get a list of pokemon species that were introduced in this generation
	 * @return a list of {@link NamedApiResource<PokemonSpecies>} objects
	 */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Set a list of pokemon species that were introduced in this generation
	 * @param pokemonSpecies a list of {@link NamedApiResource<PokemonSpecies>} objects
	 */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Get a list of types that were introduced in this generation
	 * @return a list of {@link NamedApiResource<Type>} objects
	 */
	public List<NamedApiResource<Type>> getTypes() {
		return types;
	}
	/**
	 * Set a list of types that were introduced in this generation
	 * @param types
	 */
	public void setTypes(List<NamedApiResource<Type>> types) {
		this.types = types;
	}

	/**
	 * Get a list of version groups that were introduced in this generation
	 * @return a list of {@link NamedApiResource<VersionGroup>} objects
	 */
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	/**
	 * Set a list of version groups that were introduced in this generation
	 * @param versionGroups a list of {@link NamedApiResource<VersionGroup>} objects
	 */
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}

	/**
	 * Get the main region travelled in this generation
	 * @return the {@link NamedApiResource<Region>} object
	 */
	public NamedApiResource<Region> getMainRegion() {
		return mainRegion;
	}
	/**
	 * Set the main region travelled in this generation
	 * @param mainRegion the {@link NamedApiResource<Region>} object
	 */
	public void setMainRegion(NamedApiResource<Region> mainRegion) {
		this.mainRegion = mainRegion;
	}

	/**
	 * Checks whether the Generation is equal to another object
	 * @param o the object
	 * @return the name
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Generation that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getAbilities(), that.getAbilities()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getMoves(), that.getMoves()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies()) && Objects.equals(getTypes(), that.getTypes()) && Objects.equals(getVersionGroups(), that.getVersionGroups()) && Objects.equals(getMainRegion(), that.getMainRegion());
	}

	/**
	 * Generate a hash code for the Generation
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getAbilities(), getNames(), getMoves(), getPokemonSpecies(), getTypes(), getVersionGroups(), getMainRegion());
	}

	/**
	 * Returns a string representation of the Generation
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "Generation{" +
				"id=" + id +
				", name='" + name + '\'' +
				", abilities=" + abilities +
				", names=" + names +
				", moves=" + moves +
				", pokemonSpecies=" + pokemonSpecies +
				", types=" + types +
				", versionGroups=" + versionGroups +
				", mainRegion=" + mainRegion +
				'}';
	}
}
