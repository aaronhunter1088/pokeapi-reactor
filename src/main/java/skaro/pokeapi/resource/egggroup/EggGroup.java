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
	 * Get the names of this resource listed in different languages
	 * @return the {@link Name} names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the names of this resource listed in different languages
	 * @param names the {@link Name} names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Gets a list of all Pokémon species that are members
	 * of this egg group
	 * @return list of {@link PokemonSpecies} objects
	 */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Sets the list of all Pokémon species that are members
	 * of this egg group
	 * @param pokemonSpecies list of {@link PokemonSpecies} objects
	 */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of EggGroup
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EggGroup eggGroup)) return false;
        return Objects.equals(getId(), eggGroup.getId()) && Objects.equals(getName(), eggGroup.getName()) && Objects.equals(getNames(), eggGroup.getNames()) && Objects.equals(getPokemonSpecies(), eggGroup.getPokemonSpecies());
	}

	/**
	 * Returns the hash code of the EggGroup
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
	}

	/**
	 * Returns a string representation of the EggGroup
	 * @return the string representation
	 */
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
