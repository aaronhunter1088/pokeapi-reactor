package skaro.pokeapi.resource.evolutionchain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

public class ChainLink {

	@JsonProperty("is_baby")
	private Boolean isBaby;
	private NamedApiResource<PokemonSpecies> species;
	@JsonProperty("evolution_details")
	private List<EvolutionDetail> evolutionDetails;
	@JsonProperty("evolves_to")
	private List<ChainLink> evolvesTo;
	
	public Boolean getIsBaby() {
		return isBaby;
	}
	public void setIsBaby(Boolean isBaby) {
		this.isBaby = isBaby;
	}
	public NamedApiResource<PokemonSpecies> getSpecies() {
		return species;
	}
	public void setSpecies(NamedApiResource<PokemonSpecies> species) {
		this.species = species;
	}
	public List<EvolutionDetail> getEvolutionDetails() {
		return evolutionDetails;
	}
	public void setEvolutionDetails(List<EvolutionDetail> evolutionDetails) {
		this.evolutionDetails = evolutionDetails;
	}
	public List<ChainLink> getEvolvesTo() {
		return evolvesTo;
	}
	public void setEvolvesTo(List<ChainLink> evolvesTo) {
		this.evolvesTo = evolvesTo;
	}

	@Override
	public String toString() {
		return "ChainLink{" +
				"isBaby=" + isBaby +
				", species=" + species +
				", evolutionDetails=" + evolutionDetails +
				", evolvesTo=" + evolvesTo +
				'}';
	}
}
