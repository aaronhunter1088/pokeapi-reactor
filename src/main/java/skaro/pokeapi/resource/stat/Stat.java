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
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGameIndex() {
		return gameIndex;
	}
	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}
	public Boolean getIsBattleOnly() {
		return isBattleOnly;
	}
	public void setIsBattleOnly(Boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}
	public MoveStatAffectSets getAffectingMoves() {
		return affectingMoves;
	}
	public void setAffectingMoves(MoveStatAffectSets affectingMoves) {
		this.affectingMoves = affectingMoves;
	}
	public NatureStatAffectSets getAffectingNatures() {
		return affectingNatures;
	}
	public void setAffectingNatures(NatureStatAffectSets affectingNatures) {
		this.affectingNatures = affectingNatures;
	}
	public List<NamedApiResource<Characteristic>> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<NamedApiResource<Characteristic>> characteristics) {
		this.characteristics = characteristics;
	}
	public NamedApiResource<MoveDamageClass> getMoveDamageClass() {
		return moveDamageClass;
	}
	public void setMoveDamageClass(NamedApiResource<MoveDamageClass> moveDamageClass) {
		this.moveDamageClass = moveDamageClass;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Stat stat)) return false;
        return Objects.equals(getId(), stat.getId()) && Objects.equals(getName(), stat.getName()) && Objects.equals(getGameIndex(), stat.getGameIndex()) && Objects.equals(getIsBattleOnly(), stat.getIsBattleOnly()) && Objects.equals(getAffectingMoves(), stat.getAffectingMoves()) && Objects.equals(getAffectingNatures(), stat.getAffectingNatures()) && Objects.equals(getCharacteristics(), stat.getCharacteristics()) && Objects.equals(getMoveDamageClass(), stat.getMoveDamageClass()) && Objects.equals(getNames(), stat.getNames());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getGameIndex(), getIsBattleOnly(), getAffectingMoves(), getAffectingNatures(), getCharacteristics(), getMoveDamageClass(), getNames());
	}

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
