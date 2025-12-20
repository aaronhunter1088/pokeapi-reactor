package skaro.pokeapi.resource.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.List;
import java.util.Objects;

public class Gender implements PokeApiResource {

    private Integer id;
    private String name;
    @JsonProperty("pokemon_species_details")
    private List<PokemonSpeciesGender> pokemonSpeciesDetails;
    @JsonProperty("required_for_evolution")
    private List<NamedApiResource<PokemonSpecies>> requiredForEvolution;

    /**
     * Get the id
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get a list of Pokémon species that can be this
     * gender and how likely it is that they will be
     *
     * @return a list of {@link PokemonSpeciesGender} Pokémon species details
     */
    public List<PokemonSpeciesGender> getPokemonSpeciesDetails() {
        return pokemonSpeciesDetails;
    }

    /**
     * Set a list of Pokémon species that can be this
     * gender and how likely it is that they will be
     *
     * @param pokemonSpeciesDetails a list of {@link PokemonSpeciesGender} Pokémon species details
     */
    public void setPokemonSpeciesDetails(List<PokemonSpeciesGender> pokemonSpeciesDetails) {
        this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    }

    /**
     * Get a list of Pokémon species that required this
     * gender in order for a Pokémon to evolve into them.
     *
     * @return a list of {@link PokemonSpecies} objects
     */
    public List<NamedApiResource<PokemonSpecies>> getRequiredForEvolution() {
        return requiredForEvolution;
    }

    /**
     * Set A list of Pokémon species that required this
     * gender in order for a Pokémon to evolve into them.
     *
     * @param requiredForEvolution a list of {@link PokemonSpecies} objects
     */
    public void setRequiredForEvolution(List<NamedApiResource<PokemonSpecies>> requiredForEvolution) {
        this.requiredForEvolution = requiredForEvolution;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Gender
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Gender gender)) return false;
        return Objects.equals(getId(), gender.getId()) && Objects.equals(getName(), gender.getName()) && Objects.equals(getPokemonSpeciesDetails(), gender.getPokemonSpeciesDetails()) && Objects.equals(getRequiredForEvolution(), gender.getRequiredForEvolution());
    }

    /**
     * Returns the hash code of the Gender
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPokemonSpeciesDetails(), getRequiredForEvolution());
    }

    /**
     * Returns a string representation of the Gender
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pokemonSpeciesDetails=" + pokemonSpeciesDetails +
                ", requiredForEvolution=" + requiredForEvolution +
                '}';
    }
}
