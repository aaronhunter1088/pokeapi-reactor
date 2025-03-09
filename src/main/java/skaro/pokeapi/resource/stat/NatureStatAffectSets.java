package skaro.pokeapi.resource.stat;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.nature.Nature;

public class NatureStatAffectSets {

	private List<NamedApiResource<Nature>> increase;
	private List<NamedApiResource<Nature>> decrease;

	/**
	 * Get a list of natures and how they change the referenced stat
	 * @return increase
	 */
	public List<NamedApiResource<Nature>> getIncrease() {
		return increase;
	}
	/**
	 * Set a list of natures and how they change the referenced stat
	 * @param increase the increase
	 */
	public void setIncrease(List<NamedApiResource<Nature>> increase) {
		this.increase = increase;
	}

	/**
	 * Get a list of natures and how they change the referenced stat
	 * @return decrease
	 */
	public List<NamedApiResource<Nature>> getDecrease() {
		return decrease;
	}
	/**
	 * Set a list of natures and how they change the referenced stat
	 * @param decrease the decrease
	 */
	public void setDecrease(List<NamedApiResource<Nature>> decrease) {
		this.decrease = decrease;
	}

	/**
	 * Checks if the NatureStatAffectSets is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof NatureStatAffectSets that)) return false;
        return Objects.equals(getIncrease(), that.getIncrease()) && Objects.equals(getDecrease(), that.getDecrease());
	}

	/**
	 * Generates a hash code for the NatureStatAffectSets
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getIncrease(), getDecrease());
	}

	/**
	 * Returns a string representation of the NatureStatAffectSets
	 */
	@Override
	public String toString() {
		return "NatureStatAffectSets{" +
				"increase=" + increase +
				", decrease=" + decrease +
				'}';
	}
}
