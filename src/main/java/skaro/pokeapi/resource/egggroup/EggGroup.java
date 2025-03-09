package skaro.pokeapi.resource.egggroup;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

public class EggGroup implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

	/**
	 * Gets the id of this egg group
	 * @return The id of this egg group
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Sets the id of this egg group
	 * @param id The id of this egg group
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name of this egg group
	 * @return The name of this egg group
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of this egg group
	 * @param name The name of this egg group
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the names of this egg group
	 * @return The names of this egg group
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Sets the names of this egg group
	 * @param names The names of this egg group
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Gets a list of all Pokémon species that are members of this egg group
	 * @return list of {@link NamedApiResource<PokemonSpecies>} objects
	 */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Sets the list of all Pokémon species that are members of this egg group
	 * @param pokemonSpecies list of {@link NamedApiResource<PokemonSpecies>} objects
	 */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/** Returns true if the EggGroup is equal to another EggGroup */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EggGroup eggGroup)) return false;
        return Objects.equals(getId(), eggGroup.getId()) && Objects.equals(getName(), eggGroup.getName()) && Objects.equals(getNames(), eggGroup.getNames()) && Objects.equals(getPokemonSpecies(), eggGroup.getPokemonSpecies());
	}

	/** Returns the hash code of the EggGroup */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
	}

	/** Returns a string representation of the EggGroup */
	@Override
	public String toString() {
		return "EggGroup{" +
				"id=" + id +
				", name='" + name + '\'' +
				", names=" + names +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
