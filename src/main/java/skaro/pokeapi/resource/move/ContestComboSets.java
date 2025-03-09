package skaro.pokeapi.resource.move;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ContestComboSets {

	private ContestComboDetail normal;
	private ContestComboDetail superb;

	/**
	 * Get a detail of moves this move can be used before or
	 * after, granting additional appeal points in contests
	 * @return a {@link ContestComboDetail} object
	 */
	public ContestComboDetail getNormal() {
		return normal;
	}
	/**
	 * Set a detail of moves this move can be used before or
	 * after, granting additional appeal points in contests
	 * @param normal a {@link ContestComboDetail} object
	 */
	public void setNormal(ContestComboDetail normal) {
		this.normal = normal;
	}

	/**
	 * Get a detail of moves this move can be used before or
	 * after, granting additional appeal points in super contests
	 * @return a {@link ContestComboDetail} object
	 */
	@JsonProperty("super")
	public ContestComboDetail getSuperb() {
		return superb;
	}
	/**
	 * Set a detail of moves this move can be used before or
	 * after, granting additional appeal points in super contests
	 * @param superb a {@link ContestComboDetail} object
	 */
	@JsonProperty("super")
	public void setSuperb(ContestComboDetail superb) {
		this.superb = superb;
	}

	/**
	 * Checks whether the ContestComboSets is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ContestComboSets that)) return false;
        return Objects.equals(getNormal(), that.getNormal()) && Objects.equals(getSuperb(), that.getSuperb());
	}

	/**
	 * Generate a hash code for the ContestComboSets
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getNormal(), getSuperb());
	}

	/**
	 * Get the string representation of the ContestComboSets
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "ContestComboSets{" +
				"normal=" + normal +
				", superb=" + superb +
				'}';
	}
}
