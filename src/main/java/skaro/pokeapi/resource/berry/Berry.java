package skaro.pokeapi.resource.berry;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.berryfirmness.BerryFirmness;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.type.Type;

public class Berry implements PokeApiResource {

	private Integer id;
	private String name;
	@JsonProperty("growth_time")
	private Integer growthTime;
	@JsonProperty("max_harvest")
	private Integer maxHarvest;
	@JsonProperty("natural_gift_power")
	private Integer naturalGiftPower;
	private Integer size;
	private Integer smoothness;
	@JsonProperty("soil_dryness")
	private Integer soilDryness;
	private NamedApiResource<BerryFirmness> firmness;
	private List<BerryFlavorMap> flavors;
	private NamedApiResource<Item> item;
	@JsonProperty("natural_gift_type")
	private NamedApiResource<Type> naturalGiftType;

	/**
	 * Get the id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Set the id
	 * @param id the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the name for this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name for this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the time it takes the tree to grow one stage,
	 * in hours. Berry trees go through four of these
	 * growth stages before they can be picked
	 * @return the growthTime
	 */
	public Integer getGrowthTime() {
		return growthTime;
	}
	/**
	 * Set the time it takes the tree to grow one stage,
	 * in hours. Berry trees go through four of these
	 * growth stages before they can be picked
	 * @param growthTime the growthTime
	 */
	public void setGrowthTime(Integer growthTime) {
		this.growthTime = growthTime;
	}

	/**
	 * Get the maximum number of these berries
	 * that can grow on one tree in Generation IV
	 * @return the maxHarvest
	 */
	public Integer getMaxHarvest() {
		return maxHarvest;
	}
	/**
	 * Set the maximum number of these berries
	 * that can grow on one tree in Generation IV
	 * @param maxHarvest the maxHarvest
	 */
	public void setMaxHarvest(Integer maxHarvest) {
		this.maxHarvest = maxHarvest;
	}

	/**
	 * Get the power of the move "Natural Gift"
	 * when used with this Berry.
	 * @return the naturalGiftPower
	 */
	public Integer getNaturalGiftPower() {
		return naturalGiftPower;
	}
	/**
	 * Set the power of the move "Natural Gift"
	 * when used with this Berry.
	 * @param naturalGiftPower the naturalGiftPower
	 */
	public void setNaturalGiftPower(Integer naturalGiftPower) {
		this.naturalGiftPower = naturalGiftPower;
	}

	/**
	 * Get the size of this Berry, in millimeters
	 * @return the size in millimeters
	 */
	public Integer getSize() {
		return size;
	}
	/**
	 * Set the size of this Berry, in millimeters
	 * @param size the size in millimeters
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * Get the smoothness of this Berry, used
	 * in making Pokéblocks or Poffins
	 * @return the smoothness
	 */
	public Integer getSmoothness() {
		return smoothness;
	}
	/**
	 * Set the smoothness of this Berry, used
	 * in making Pokéblocks or Poffins
	 * @param smoothness the smoothness
	 */
	public void setSmoothness(Integer smoothness) {
		this.smoothness = smoothness;
	}

	/**
	 * Get the speed at which this Berry dries out
	 * the soil as it grows. A higher rate means the
	 * soil dries more quickly
	 * @return the soilDryness
	 */
	public Integer getSoilDryness() {
		return soilDryness;
	}
	/**
	 * Set The speed at which this Berry dries out
	 * the soil as it grows. A higher rate means the
	 * soil dries more quickly
	 * @param soilDryness the soilDryness
	 */
	public void setSoilDryness(Integer soilDryness) {
		this.soilDryness = soilDryness;
	}

	/**
	 * Get the firmness of this berry, used
	 * in making Pokéblocks or Poffins
	 * @return the firmness
	 */
	public NamedApiResource<BerryFirmness> getFirmness() {
		return firmness;
	}
	/**
	 * Set the firmness of this berry, used
	 * in making Pokéblocks or Poffins
	 * @param firmness the firmness
	 */
	public void setFirmness(NamedApiResource<BerryFirmness> firmness) {
		this.firmness = firmness;
	}

	/**
	 * Get a list of references to each flavor a berry
	 * can have and the potency of each of those flavors
	 * in regard to this berry
	 * @return a list of {@link BerryFlavorMap} berryFlavorMaps
	 */
	public List<BerryFlavorMap> getFlavors() {
		return flavors;
	}
	/**
	 * Set a list of references to each flavor a berry
	 * can have and the potency of each of those flavors
	 * in regard to this berry
	 * @param flavors a list of {@link BerryFlavorMap} berryFlavorMaps
	 */
	public void setFlavors(List<BerryFlavorMap> flavors) {
		this.flavors = flavors;
	}

	/**
	 * Get the berry reference
	 * @return the {@link NamedApiResource<Item>} berry reference
	 */
	public NamedApiResource<Item> getItem() {
		return item;
	}
	/**
	 * Set the berry reference
	 * @param item the {@link NamedApiResource<Item>} berry reference
	 */
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}

	/**
	 * Get the type inherited by "Natural Gift" when used with this Berry
	 * @return the {@link NamedApiResource<Type>} naturalGiftType
	 */
	public NamedApiResource<Type> getNaturalGiftType() {
		return naturalGiftType;
	}
	/**
	 * Set the type inherited by "Natural Gift" when used with this Berry
	 * @param naturalGiftType the {@link NamedApiResource<Type>} naturalGiftType
	 */
	public void setNaturalGiftType(NamedApiResource<Type> naturalGiftType) {
		this.naturalGiftType = naturalGiftType;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of Berry
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Berry berry)) return false;
        return Objects.equals(getId(), berry.getId()) && Objects.equals(getName(), berry.getName()) && Objects.equals(getGrowthTime(), berry.getGrowthTime()) && Objects.equals(getMaxHarvest(), berry.getMaxHarvest()) && Objects.equals(getNaturalGiftPower(), berry.getNaturalGiftPower()) && Objects.equals(getSize(), berry.getSize()) && Objects.equals(getSmoothness(), berry.getSmoothness()) && Objects.equals(getSoilDryness(), berry.getSoilDryness()) && Objects.equals(getFirmness(), berry.getFirmness()) && Objects.equals(getFlavors(), berry.getFlavors()) && Objects.equals(getItem(), berry.getItem()) && Objects.equals(getNaturalGiftType(), berry.getNaturalGiftType());
	}

	/**
	 * Returns the hash code of the Berry
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getGrowthTime(), getMaxHarvest(), getNaturalGiftPower(), getSize(), getSmoothness(), getSoilDryness(), getFirmness(), getFlavors(), getItem(), getNaturalGiftType());
	}

	/**
	 * Returns a string representation of the Berry
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "Berry{" +
				"id=" + id +
				", name='" + name + '\'' +
				", growthTime=" + growthTime +
				", maxHarvest=" + maxHarvest +
				", naturalGiftPower=" + naturalGiftPower +
				", size=" + size +
				", smoothness=" + smoothness +
				", soilDryness=" + soilDryness +
				", firmness=" + firmness +
				", flavors=" + flavors +
				", item=" + item +
				", naturalGiftType=" + naturalGiftType +
				'}';
	}
}
