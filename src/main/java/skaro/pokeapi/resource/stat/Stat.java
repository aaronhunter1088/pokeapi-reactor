package skaro.pokeapi.resource.stat;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.characteristic.Characteristic;
import skaro.pokeapi.resource.movedamageclass.MoveDamageClass;
import skaro.pokeapi.utils.locale.Localizable;

public class Stat implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	@JsonProperty("game_index")
	private Integer gameIndex;
	@JsonProperty("is_battle_only")
	private Boolean isBattleOnly;
	@JsonProperty("affecting_moves")
	private MoveStatAffectSets affectingMoves;
	@JsonProperty("affecting_natures")
	private NatureStatAffectSets affectingNatures;
	private List<NamedApiResource<Characteristic>> characteristics;
	@JsonProperty("move_damage_class")
	private NamedApiResource<MoveDamageClass> moveDamageClass;
	private List<Name> names;

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
	 * Get the ID the games use for this stat
	 * @return the game index
	 */
	public Integer getGameIndex() {
		return gameIndex;
	}
	/**
	 * Set the ID the games use for this stat
	 * @param gameIndex the game index
	 */
	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	/**
	 * Get whether this stat is only used in battle
	 * @return isBattleOnly
	 */
	public Boolean getIsBattleOnly() {
		return isBattleOnly;
	}
	/**
	 * Set whether this stat is only used in battle
	 * @param isBattleOnly isBattleOnly
	 */
	public void setIsBattleOnly(Boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}

	/**
	 * Get the maximum amount of change to the referenced stat
	 * @return the maximum amount of change
	 */
	public MoveStatAffectSets getAffectingMoves() {
		return affectingMoves;
	}
	/**
	 * Set the maximum amount of change to the referenced stat
	 * @param affectingMoves the maximum amount of change
	 */
	public void setAffectingMoves(MoveStatAffectSets affectingMoves) {
		this.affectingMoves = affectingMoves;
	}

	/**
	 * Get a list of moves and how they change the referenced stat
	 * @return increase
	 */
	public NatureStatAffectSets getAffectingNatures() {
		return affectingNatures;
	}
	/**
	 * Set a list of moves and how they change the referenced stat
	 * @param affectingNatures the increase
	 */
	public void setAffectingNatures(NatureStatAffectSets affectingNatures) {
		this.affectingNatures = affectingNatures;
	}

	/**
	 * Get a list of characteristics that are set on
	 * a Pokémon when its highest base stat is this stat
	 * @return characteristics the {@link NamedApiResource} list of characteristics
	 */
	public List<NamedApiResource<Characteristic>> getCharacteristics() {
		return characteristics;
	}
	/**
	 * Set a list of characteristics that are set on
	 * @param characteristics the {@link NamedApiResource} list of characteristics
	 */
	public void setCharacteristics(List<NamedApiResource<Characteristic>> characteristics) {
		this.characteristics = characteristics;
	}

	/**
	 * Get the move damage class that this stat is directly related to
	 * @return the {@link NamedApiResource} of the move damage class
	 */
	public NamedApiResource<MoveDamageClass> getMoveDamageClass() {
		return moveDamageClass;
	}
	/**
	 * Set the move damage class that this stat is directly related to
	 * @param moveDamageClass the {@link NamedApiResource} of the move damage class
	 */
	public void setMoveDamageClass(NamedApiResource<MoveDamageClass> moveDamageClass) {
		this.moveDamageClass = moveDamageClass;
	}

	/**
	 * Get the name of this resource in different languages
	 * @return the names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this resource in different languages
	 * @param names the names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Checks whether this Stat is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Stat stat)) return false;
        return Objects.equals(getId(), stat.getId()) && Objects.equals(getName(), stat.getName()) && Objects.equals(getGameIndex(), stat.getGameIndex()) && Objects.equals(getIsBattleOnly(), stat.getIsBattleOnly()) && Objects.equals(getAffectingMoves(), stat.getAffectingMoves()) && Objects.equals(getAffectingNatures(), stat.getAffectingNatures()) && Objects.equals(getCharacteristics(), stat.getCharacteristics()) && Objects.equals(getMoveDamageClass(), stat.getMoveDamageClass()) && Objects.equals(getNames(), stat.getNames());
	}

	/**
	 * Generates a hash code for the Stat
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getGameIndex(), getIsBattleOnly(), getAffectingMoves(), getAffectingNatures(), getCharacteristics(), getMoveDamageClass(), getNames());
	}

	/**
	 * Returns a string representation of the Stat object
	 */
	@Override
	public String toString() {
		return "Stat{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gameIndex=" + gameIndex +
				", isBattleOnly=" + isBattleOnly +
				", affectingMoves=" + affectingMoves +
				", affectingNatures=" + affectingNatures +
				", characteristics=" + characteristics +
				", moveDamageClass=" + moveDamageClass +
				", names=" + names +
				'}';
	}
}
