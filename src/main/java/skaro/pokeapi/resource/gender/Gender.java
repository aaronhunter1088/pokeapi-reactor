package skaro.pokeapi.resource.gender;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

public class Gender implements PokeApiResource {

	private Integer id;
	private String name;
	@JsonProperty("pokemon_species_details")
	private List<PokemonSpeciesGender> pokemonSpeciesDetails;
	@JsonProperty("required_for_evolution")
	private List<NamedApiResource<PokemonSpecies>> requiredForEvolution;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PokemonSpeciesGender> getPokemonSpeciesDetails() {
		return pokemonSpeciesDetails;
	}
	public void setPokemonSpeciesDetails(List<PokemonSpeciesGender> pokemonSpeciesDetails) {
		this.pokemonSpeciesDetails = pokemonSpeciesDetails;
	}
	public List<NamedApiResource<PokemonSpecies>> getRequiredForEvolution() {
		return requiredForEvolution;
	}
	public void setRequiredForEvolution(List<NamedApiResource<PokemonSpecies>> requiredForEvolution) {
		this.requiredForEvolution = requiredForEvolution;
	}
	
}
