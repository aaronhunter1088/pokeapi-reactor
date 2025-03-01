package skaro.pokeapi.resource.pokemoncolor;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

public class PokemonColor implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

	/** Gets the id for this PokemonColor */
	public Integer getId() {
		return id;
	}
	/** Sets the id for this PokemonColor */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name for this PokemonColor */
	public String getName() {
		return name;
	}
	/** Sets the name for this PokemonColor */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the names for this PokemonColor in different languages */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names for this PokemonColor in different languages */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets a list of PokemonSpecies that have this PokemonColor */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/** Sets a list of PokemonSpecies that have this PokemonColor */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/** Returns whether the PokemonColor is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonColor that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/** Returns the hash code of the PokemonColor */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
	}

	/** Returns the string representation of the PokemonColor */
	@Override
	public String toString() {
		return "PokemonColor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", names=" + names +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
