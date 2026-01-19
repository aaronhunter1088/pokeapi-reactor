package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.move.Move;

import java.util.List;
import java.util.Objects;

/**
 * Represents the PokemonMove resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PokemonMove {

    private NamedApiResource<Move> move;
    @JsonProperty("version_group_details")
    private List<PokemonMoveVersion> versionGroupDetails;

    /**
     * Get the move the Pokémon can learn
     *
     * @return the {@link Move} the Pokémon can learn
     */
    public NamedApiResource<Move> getMove() {
        return move;
    }

    /**
     * Set the move the Pokémon can learn
     *
     * @param move the {@link Move} the Pokémon can learn
     */
    public void setMove(NamedApiResource<Move> move) {
        this.move = move;
    }

    /**
     * Get the details of the version in which the Pokémon can learn the move
     *
     * @return the {@link PokemonMoveVersion} details
     */
    public List<PokemonMoveVersion> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    /**
     * Set the details of the version in which the Pokémon can learn the move
     *
     * @param versionGroupDetails the {@link PokemonMoveVersion} details
     */
    public void setVersionGroupDetails(List<PokemonMoveVersion> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonMove
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonMove that)) return false;
        return Objects.equals(getMove(), that.getMove()) && Objects.equals(getVersionGroupDetails(), that.getVersionGroupDetails());
    }

    /**
     * Returns the hash code of the PokemonMove
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMove(), getVersionGroupDetails());
    }

    /**
     * Returns a string representation of the PokemonMove
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonMove{" +
                "move=" + move +
                ", versionGroupDetails=" + versionGroupDetails +
                '}';
    }
}
