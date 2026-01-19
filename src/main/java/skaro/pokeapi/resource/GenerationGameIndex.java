package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.generation.Generation;

import java.util.Objects;

/**
 * Represents the internal id of an API resource
 * within game data for a specific generation
 *
 * @author JoostFranssen
 * @since 0.0.1-SNAPSHOT
 */
public class GenerationGameIndex {

    @JsonProperty("game_index")
    private Integer gameIndex;
    private NamedApiResource<Generation> generation;

    /**
     * Get the internal id of an API resource within game data
     *
     * @return the game index
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set the internal id of an API resource within game data
     *
     * @param gameIndex the game index
     */
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get the generation relevant to this game index
     *
     * @return the {@link Generation} generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the generation relevant to this game index
     *
     * @param generation the {@link Generation} generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationGameIndex
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationGameIndex that)) return false;
        return Objects.equals(getGameIndex(), that.getGameIndex()) && Objects.equals(getGeneration(), that.getGeneration());
    }

    /**
     * Returns the hash code of the GenerationGameIndex
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGameIndex(), getGeneration());
    }

    /**
     * Returns a string representation of the GenerationGameIndex
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationGameIndex{" +
                "gameIndex=" + gameIndex +
                ", generation=" + generation +
                '}';
    }
}
