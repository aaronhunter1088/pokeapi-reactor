package skaro.pokeapi.resource.pokemonhabitat;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

public class PokemonHabitat implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

	/**
	 * Gets the id of the PokemonHabitat
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Sets the id of the PokemonHabitat
	 * @param id the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name for this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name for this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the name of this resource listed in different languages
	 * @return the names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this resource listed in different languages
	 * @param names the names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get a list of PokemonSpecies that can be found in this habitat
	 * @return the {@link NamedApiResource} list of PokemonSpecies
	 */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Set a list of PokemonSpecies that can be found in this habitat
	 * @param pokemonSpecies the {@link NamedApiResource} list of PokemonSpecies
	 */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Returns true if the object is an instance of PokemonHabitat
	 * and all of its attributes are equal to this object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonHabitat that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/**
	 * Returns the hash code of the PokemonHabitat
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
	}

	/**
	 * Returns the string representation of the PokemonHabitat
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonHabitat{" +
				"id=" + id +
				", name='" + name + '\'' +
				", names=" + names +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
