package skaro.pokeapi.resource.evolutiontrigger;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

public class EvolutionTrigger implements PokeApiResource, Localizable {

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
	 * Get a list of pokemon species that result from this evolution trigger.
	 * @return a list of {@link PokemonSpecies} pokemon species
	 */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/**
	 * Set a list of pokemon species that result from this evolution trigger.
	 * @param pokemonSpecies a list of {@link PokemonSpecies} pokemon species
	 */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of EvolutionTrigger
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EvolutionTrigger that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/**
	 * Returns the hash code of the EvolutionTrigger
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
	}

	/**
	 * Returns a string representation of the EvolutionTrigger
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "EvolutionTrigger{" +
				"id=" + id +
				", name='" + name + '\'' +
				", names=" + names +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
