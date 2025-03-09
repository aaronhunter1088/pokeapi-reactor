package skaro.pokeapi.resource.berryflavor;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.berry.Berry;

import java.util.Objects;

public class FlavorBerryMap {

	private Integer potency;
	private NamedApiResource<Berry> berry;

	/**
	 * Get how powerful the referenced flavor is for this berry.
	 * @return the potency
	 */
	public Integer getPotency() {
		return potency;
	}
	/**
	 * Set how powerful the referenced flavor is for this berry.
	 * @param potency the potency
	 */
	public void setPotency(Integer potency) {
		this.potency = potency;
	}

	/**
	 * Get the berry with the referenced flavor
	 * @return the berry
	 */
	public NamedApiResource<Berry> getBerry() {
		return berry;
	}
	/**
	 * Set the berry with the referenced flavor
	 * @param berry the berry
	 */
	public void setBerry(NamedApiResource<Berry> berry) {
		this.berry = berry;
	}

	/**
	 * Checks whether a FlavorBerryMap object is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof FlavorBerryMap that)) return false;
        return Objects.equals(getPotency(), that.getPotency()) && Objects.equals(getBerry(), that.getBerry());
	}

	/**
	 * Returns a hash code value for the object
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getPotency(), getBerry());
	}

	/**
	 * Returns the FlavorBerryMap object in the form of a string
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "FlavorBerryMap{" +
				"potency=" + potency +
				", berry=" + berry +
				'}';
	}
}
