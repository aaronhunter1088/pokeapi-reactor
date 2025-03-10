package skaro.pokeapi.resource.nature;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.*;
import skaro.pokeapi.resource.berryflavor.BerryFlavor;
import skaro.pokeapi.resource.stat.Stat;
import skaro.pokeapi.utils.locale.Localizable;

public class Nature implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	@JsonProperty("decreased_stat")
	private NamedApiResource<Stat> decreasedStat;
	@JsonProperty("increased_stat")
	private NamedApiResource<Stat> increasedStat;
	@JsonProperty("hates_flavor")
	private NamedApiResource<BerryFlavor> hatesFlavor;
	@JsonProperty("likes_flavor")
	private NamedApiResource<BerryFlavor> likesFlavor;
	private List<Name> names;
	@JsonProperty("move_battle_style_preferences")
	private List<MoveBattleStylePreference> moveBattleStylePreferences;
	@JsonProperty("pokeathlon_stat_changes")
	private List<NatureStatChange> pokeathlonStatChanges;

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
	 * Get the name of this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name of this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the stat decreased by 10% in Pokémon with this nature
	 * @return the {@link NamedApiResource<Stat>} of the decreased stat
	 */
	public NamedApiResource<Stat> getDecreasedStat() {
		return decreasedStat;
	}
	/**
	 * Set the stat decreased by 10% in Pokémon with this nature
	 * @param decreasedStat the {@link NamedApiResource<Stat>} of the decreased stat
	 */
	public void setDecreasedStat(NamedApiResource<Stat> decreasedStat) {
		this.decreasedStat = decreasedStat;
	}

	/**
	 * Get the stat increased by 10% in Pokémon with this nature
	 * @return the {@link NamedApiResource<Stat>} of the increased stat
	 */
	public NamedApiResource<Stat> getIncreasedStat() {
		return increasedStat;
	}
	/**
	 * Set the stat increased by 10% in Pokémon with this nature
	 * @param increasedStat the {@link NamedApiResource<Stat>} of the increased stat
	 */
	public void setIncreasedStat(NamedApiResource<Stat> increasedStat) {
		this.increasedStat = increasedStat;
	}

	/**
	 * Get the flavor hated by Pokémon with this nature
	 * @return the {@link NamedApiResource<BerryFlavor>} of the hated flavor
	 */
	public NamedApiResource<BerryFlavor> getHatesFlavor() {
		return hatesFlavor;
	}
	/**
	 * Set the flavor hated by Pokémon with this nature
	 * @param hatesFlavor the {@link NamedApiResource<BerryFlavor>} of the hated flavor
	 */
	public void setHatesFlavor(NamedApiResource<BerryFlavor> hatesFlavor) {
		this.hatesFlavor = hatesFlavor;
	}

	/**
	 * Get the flavor liked by Pokémon with this nature
	 * @return the {@link NamedApiResource<BerryFlavor>} of the liked flavor
	 */
	public NamedApiResource<BerryFlavor> getLikesFlavor() {
		return likesFlavor;
	}
	/**
	 * Set the flavor liked by Pokémon with this nature
	 * @param likesFlavor the {@link NamedApiResource<BerryFlavor>} of the liked flavor
	 */
	public void setLikesFlavor(NamedApiResource<BerryFlavor> likesFlavor) {
		this.likesFlavor = likesFlavor;
	}

	/**
	 * Get the name of this resource listed in different languages
	 * @return the list of {@link Name} objects
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this resource listed in different languages
	 * @param names the list of {@link Name} objects
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get the battle style preferences for this nature
	 * @return the list of {@link MoveBattleStylePreference} objects
	 */
	public List<MoveBattleStylePreference> getMoveBattleStylePreferences() {
		return moveBattleStylePreferences;
	}
	/**
	 * Set the battle style preferences for this nature
	 * @param moveBattleStylePreferences the list of {@link MoveBattleStylePreference} objects
	 */
	public void setMoveBattleStylePreferences(List<MoveBattleStylePreference> moveBattleStylePreferences) {
		this.moveBattleStylePreferences = moveBattleStylePreferences;
	}

	/**
	 * Get the stat changes for this nature
	 * @return the list of {@link NatureStatChange} objects
	 */
	public List<NatureStatChange> getPokeathlonStatChanges() {
		return pokeathlonStatChanges;
	}
	/**
	 * Set the stat changes for this nature
	 * @param pokeathlonStatChanges the list of {@link NatureStatChange} objects
	 */
	public void setPokeathlonStatChanges(List<NatureStatChange> pokeathlonStatChanges) {
		this.pokeathlonStatChanges = pokeathlonStatChanges;
	}

	/**
	 * Compares this nature to another object for equality.
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Nature nature)) return false;
        return Objects.equals(getId(), nature.getId()) && Objects.equals(getName(), nature.getName()) && Objects.equals(getDecreasedStat(), nature.getDecreasedStat()) && Objects.equals(getIncreasedStat(), nature.getIncreasedStat()) && Objects.equals(getHatesFlavor(), nature.getHatesFlavor()) && Objects.equals(getLikesFlavor(), nature.getLikesFlavor()) && Objects.equals(getNames(), nature.getNames()) && Objects.equals(getMoveBattleStylePreferences(), nature.getMoveBattleStylePreferences()) && Objects.equals(getPokeathlonStatChanges(), nature.getPokeathlonStatChanges());
	}

	/**
	 * Generates a hash code for this nature
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getDecreasedStat(), getIncreasedStat(), getHatesFlavor(), getLikesFlavor(), getNames(), getMoveBattleStylePreferences(), getPokeathlonStatChanges());
	}

	/**
	 * Returns the string representation of this nature
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "Nature{" +
				"id=" + id +
				", name='" + name + '\'' +
				", decreasedStat=" + decreasedStat +
				", increasedStat=" + increasedStat +
				", hatesFlavor=" + hatesFlavor +
				", likesFlavor=" + likesFlavor +
				", names=" + names +
				", moveBattleStylePreferences=" + moveBattleStylePreferences +
				", pokeathlonStatChanges=" + pokeathlonStatChanges +
				'}';
	}
}
