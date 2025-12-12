package skaro.pokeapi.resource.evolutionchain;

import java.util.List;
import java.util.Objects;

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

	/**
	 * Get whether or not this link is for a baby Pokémon.
	 * This would only ever be true on the base link
	 * @return true if the link is for a baby Pokémon, false otherwise
	 */
	public Boolean isBaby() {
		return isBaby;
	}
	/**
	 * Set whether or not this link is for a baby Pokémon.
	 * @param isBaby true if the link is for a baby Pokémon, false otherwise
	 */
	public void setIsBaby(Boolean isBaby) {
		this.isBaby = isBaby;
	}

	/**
	 * Get the Pokémon species at this point in the evolution chain
	 * @return the {@link PokemonSpecies} species
	 */
	public NamedApiResource<PokemonSpecies> getSpecies() {
		return species;
	}
	/**
	 * Set the Pokémon species at this point in the evolution chain
	 * @param species the {@link PokemonSpecies} species
	 */
	public void setSpecies(NamedApiResource<PokemonSpecies> species) {
		this.species = species;
	}

	/**
	 * Get all details regarding the specific details
	 * of the referenced Pokémon species evolution.
	 * @return a list of {@link EvolutionDetail} evolution details
	 */
	public List<EvolutionDetail> getEvolutionDetails() {
		return evolutionDetails;
	}
	/**
	 * Set all details regarding the specific details
	 * of the referenced Pokémon species evolution.
	 * @param evolutionDetails a list of {@link EvolutionDetail} evolution details
	 */
	public void setEvolutionDetails(List<EvolutionDetail> evolutionDetails) {
		this.evolutionDetails = evolutionDetails;
	}

	/**
	 * Get a list of chain links
	 * @return a list of {@link ChainLink} chain links
	 */
	public List<ChainLink> getEvolvesTo() {
		return evolvesTo;
	}
	/**
	 * Set a list of chain links
	 * @param evolvesTo a list of {@link ChainLink} chain links
	 */
	public void setEvolvesTo(List<ChainLink> evolvesTo) {
		this.evolvesTo = evolvesTo;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of ChainLink
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ChainLink chainLink)) return false;
        return Objects.equals(isBaby(), chainLink.isBaby()) && Objects.equals(getSpecies(), chainLink.getSpecies()) && Objects.equals(getEvolutionDetails(), chainLink.getEvolutionDetails()) && Objects.equals(getEvolvesTo(), chainLink.getEvolvesTo());
	}

	/**
	 * Returns the hash code of the ChainLink
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(isBaby(), getSpecies(), getEvolutionDetails(), getEvolvesTo());
	}

	/**
	 * Returns a string representation of the ChainLink
	 * @return the string representation
	 */
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
