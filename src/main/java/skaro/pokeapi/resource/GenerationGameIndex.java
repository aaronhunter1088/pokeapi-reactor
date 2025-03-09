package skaro.pokeapi.resource;

import skaro.pokeapi.resource.generation.Generation;

import java.util.Objects;

public class GenerationGameIndex {

	private Integer gameIndex;
	private NamedApiResource<Generation> generation;

	/**
	 * Get the internal id of an API resource within game data
	 * @return the game index
	 */
	public Integer getGameIndex() {
		return gameIndex;
	}
	/**
	 * Set the internal id of an API resource within game data
	 * @param gameIndex the game index
	 */
	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	/**
	 * Get the generation relevant to this game index
	 * @return the generation
	 */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/**
	 * Set the generation relevant to this game index
	 * @param generation the generation
	 */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/** Returns whether the GenerationGameIndex is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof GenerationGameIndex that)) return false;
        return Objects.equals(getGameIndex(), that.getGameIndex()) && Objects.equals(getGeneration(), that.getGeneration());
	}

	/** Returns the hash code of the GenerationGameIndex */
	@Override
	public int hashCode() {
		return Objects.hash(getGameIndex(), getGeneration());
	}

	/** Returns the string representation of the GenerationGameIndex */
	@Override
	public String toString() {
		return "GenerationGameIndex{" +
				"gameIndex=" + gameIndex +
				", generation=" + generation +
				'}';
	}
}
