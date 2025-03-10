package skaro.pokeapi.resource.berry;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.berryflavor.BerryFlavor;

import java.util.Objects;

public class BerryFlavorMap {

	private Integer potency;
	private NamedApiResource<BerryFlavor> flavor;

	/**
	 * Get how powerful the referenced flavor is for this berry
	 * @return potency the potency
	 */
	public Integer getPotency() {
		return potency;
	}
	/**
	 * Set how powerful the referenced flavor is for this berry
	 * @param potency the potency
	 */
	public void setPotency(Integer potency) {
		this.potency = potency;
	}

	/**
	 * Get the referenced berry flavor
	 * @return the {@link NamedApiResource<BerryFlavor>} berry flavor
	 */
	public NamedApiResource<BerryFlavor> getFlavor() {
		return flavor;
	}

	/**
	 * Set the referenced berry flavor
	 * @param flavor the {@link NamedApiResource<BerryFlavor>} berry flavor
	 */
	public void setFlavor(NamedApiResource<BerryFlavor> flavor) {
		this.flavor = flavor;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of BerryFlavorMap
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof BerryFlavorMap that)) return false;
        return Objects.equals(getPotency(), that.getPotency()) && Objects.equals(getFlavor(), that.getFlavor());
	}

	/**
	 * Returns the hash code of the BerryFlavorMap
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getPotency(), getFlavor());
	}

	/**
	 * Returns a string representation of the BerryFlavorMap
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "BerryFlavorMap{" +
				"potency=" + potency +
				", flavor=" + flavor +
				'}';
	}
}
