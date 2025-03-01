package skaro.pokeapi.resource.pokemonshape;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

public class PokemonShape implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	@JsonProperty("awesome_names")
	private List<AwesomeName> awesomeNames;
	private List<Name> names;
	@JsonProperty("pokemon_species")
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

	/** Gets the id for this PokemonShape */
	public Integer getId() {
		return id;
	}
	/** Sets the id for this PokemonShape */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name for this PokemonShape */
	public String getName() {
		return name;
	}
	/** Sets the name for this PokemonShape */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the awesome names for this PokemonShape */
	public List<AwesomeName> getAwesomeNames() {
		return awesomeNames;
	}
	/** Sets the awesome names for this PokemonShape */
	public void setAwesomeNames(List<AwesomeName> awesomeNames) {
		this.awesomeNames = awesomeNames;
	}

	/** Gets the names for this PokemonShape in different languages */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names for this PokemonShape in different languages */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets a list of PokemonSpecies that have this PokemonShape */
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	/** Sets a list of PokemonSpecies that have this PokemonShape */
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	/** Returns whether the PokemonShape is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonShape that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getAwesomeNames(), that.getAwesomeNames()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
	}

	/** Returns the hash code of the PokemonShape */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getAwesomeNames(), getNames(), getPokemonSpecies());
	}

	/** Returns the string representation of the PokemonShape */
	@Override
	public String toString() {
		return "PokemonShape{" +
				"id=" + id +
				", name='" + name + '\'' +
				", awesomeNames=" + awesomeNames +
				", names=" + names +
				", pokemonSpecies=" + pokemonSpecies +
				'}';
	}
}
