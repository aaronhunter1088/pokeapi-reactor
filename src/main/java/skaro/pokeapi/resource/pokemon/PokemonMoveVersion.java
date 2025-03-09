package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

public class PokemonMoveVersion {

	private NamedApiResource<MoveLearnMethod> moveLearnMethod;
	private NamedApiResource<VersionGroup> versionGroup;
	private Integer levelLearnedAt;

	/**
	 * Get the method by which the move is learned
	 * @return the {@link MoveLearnMethod} by which the move is learned
	 */
	public NamedApiResource<MoveLearnMethod> getMoveLearnMethod() {
		return moveLearnMethod;
	}
	/**
	 * Set the method by which the move is learned
	 * @param moveLearnMethod the {@link MoveLearnMethod}
	 */
	public void setMoveLearnMethod(NamedApiResource<MoveLearnMethod> moveLearnMethod) {
		this.moveLearnMethod = moveLearnMethod;
	}

	/**
	 * Get the version group in which the move is learned
	 * @return the {@link VersionGroup} in which the move is learned
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group in which the move is learned
	 * @param versionGroup the {@link VersionGroup}
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Get the minimum level at which the move is learned
	 * @return the minimum level at which the move is learned
	 */
	public Integer getLevelLearnedAt() {
		return levelLearnedAt;
	}
	/**
	 * Set the minimum level at which the move is learned
	 * @param levelLearnedAt the minimum level at which the move is learned
	 */
	public void setLevelLearnedAt(Integer levelLearnedAt) {
		this.levelLearnedAt = levelLearnedAt;
	}

	/**
	 * Check if this PokemonMoveVersion is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonMoveVersion that)) return false;
        return Objects.equals(getMoveLearnMethod(), that.getMoveLearnMethod()) && Objects.equals(getVersionGroup(), that.getVersionGroup()) && Objects.equals(getLevelLearnedAt(), that.getLevelLearnedAt());
	}

	/**
	 * Generate a hash code for this PokemonMoveVersion
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getMoveLearnMethod(), getVersionGroup(), getLevelLearnedAt());
	}

	/**
	 * Get a String representation of this PokemonMoveVersion
	 * @return the String representation
	 */
	@Override
	public String toString() {
		return "PokemonMoveVersion{" +
				"moveLearnMethod=" + moveLearnMethod +
				", versionGroup=" + versionGroup +
				", levelLearnedAt=" + levelLearnedAt +
				'}';
	}
}
