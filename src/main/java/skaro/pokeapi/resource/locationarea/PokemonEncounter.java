package skaro.pokeapi.resource.locationarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.VersionEncounterDetail;
import skaro.pokeapi.resource.pokemon.Pokemon;

import java.util.List;
import java.util.Objects;

public class PokemonEncounter {

    @JsonProperty("pokemon")
    private NamedApiResource<Pokemon> pokemon;
    @JsonProperty("version_details")
    private List<VersionEncounterDetail> versionDetails;

    /**
     * Gets the Pokémon being encountered
     *
     * @return the {@link Pokemon} Pokemon
     */
    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }

    /**
     * Sets the Pokémon being encountered
     *
     * @param pokemon the {@link Pokemon} Pokemon
     */
    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Get a list of versions and encounters with Pokémon
     * that might happen in the referenced location area
     *
     * @return a list of {@link VersionEncounterDetail} objects
     */
    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }

    /**
     * Set a list of versions and encounters with Pokémon
     * that might happen in the referenced location area
     *
     * @param versionDetails a list of {@link VersionEncounterDetail} objects
     */
    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonEncounter
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonEncounter that)) return false;
        return Objects.equals(getPokemon(), that.getPokemon()) && Objects.equals(getVersionDetails(), that.getVersionDetails());
    }

    /**
     * Returns the hash code of the PokemonEncounter
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPokemon(), getVersionDetails());
    }

    /**
     * Returns a string representation of the PokemonEncounter
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonEncounter{" +
                "pokemon=" + pokemon +
                ", versionDetails=" + versionDetails +
                '}';
    }
}
