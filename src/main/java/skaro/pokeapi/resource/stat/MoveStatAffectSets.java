package skaro.pokeapi.resource.stat;

import java.util.List;
import java.util.Objects;

public class MoveStatAffectSets {

	private List<MoveStatAffect> increase;
	private List<MoveStatAffect> decrease;

	/**
	 * Get a list of moves and how they change the referenced stat
	 * @return increase
	 */
	public List<MoveStatAffect> getIncrease() {
		return increase;
	}
	/**
	 * Set a list of moves and how they change the referenced stat
	 * @param increase the increase
	 */
	public void setIncrease(List<MoveStatAffect> increase) {
		this.increase = increase;
	}

	/**
	 * Get a list of moves and how they change the referenced stat
	 * @return decrease
	 */
	public List<MoveStatAffect> getDecrease() {
		return decrease;
	}
	/**
	 * Set a list of moves and how they change the referenced stat
	 * @param decrease the decrease
	 */
	public void setDecrease(List<MoveStatAffect> decrease) {
		this.decrease = decrease;
	}

	/**
	 * Checks if the MoveStatAffectSets is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveStatAffectSets that)) return false;
        return Objects.equals(getIncrease(), that.getIncrease()) && Objects.equals(getDecrease(), that.getDecrease());
	}

	/**
	 * Generates a hash code for the MoveStatAffectSets
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getIncrease(), getDecrease());
	}

	/**
	 * Generates a string representation of the MoveStatAffectSets
	 */
	@Override
	public String toString() {
		return "MoveStatAffectSets{" +
				"increase=" + increase +
				", decrease=" + decrease +
				'}';
	}
}
