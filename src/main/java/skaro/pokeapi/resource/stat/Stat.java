package skaro.pokeapi.resource.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.characteristic.Characteristic;
import skaro.pokeapi.resource.movedamageclass.MoveDamageClass;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the Stat resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
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
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the ID the games use for this stat
     *
     * @return the game index
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set the ID the games use for this stat
     *
     * @param gameIndex the game index
     */
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get whether this stat is only used in battle
     *
     * @return isBattleOnly
     */
    public Boolean isBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Set whether this stat is only used in battle
     *
     * @param isBattleOnly isBattleOnly
     */
    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    /**
     * Get the maximum amount of change to the referenced stat
     *
     * @return the {@link MoveStatAffect} maximum amount of change
     */
    public MoveStatAffectSets getAffectingMoves() {
        return affectingMoves;
    }

    /**
     * Set the maximum amount of change to the referenced stat
     *
     * @param affectingMoves the {@link MoveStatAffect} maximum amount of change
     */
    public void setAffectingMoves(MoveStatAffectSets affectingMoves) {
        this.affectingMoves = affectingMoves;
    }

    /**
     * Get a detail of natures which affect
     * this stat positively or negatively
     *
     * @return the {@link NatureStatAffectSets} increase
     */
    public NatureStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }

    /**
     * Set a detail of natures which affect
     * this stat positively or negatively
     *
     * @param affectingNatures the {@link NatureStatAffectSets} increase
     */
    public void setAffectingNatures(NatureStatAffectSets affectingNatures) {
        this.affectingNatures = affectingNatures;
    }

    /**
     * Get a list of characteristics that are set on
     * a Pokémon when its highest base stat is this stat
     *
     * @return characteristics the {@link Characteristic} list of characteristics
     */
    public List<NamedApiResource<Characteristic>> getCharacteristics() {
        return characteristics;
    }

    /**
     * Set a list of characteristics that are set on
     *
     * @param characteristics the {@link Characteristic} list of characteristics
     */
    public void setCharacteristics(List<NamedApiResource<Characteristic>> characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * Get the move damage class that this stat is directly related to
     *
     * @return the {@link MoveDamageClass} of the move damage class
     */
    public NamedApiResource<MoveDamageClass> getMoveDamageClass() {
        return moveDamageClass;
    }

    /**
     * Set the move damage class that this stat is directly related to
     *
     * @param moveDamageClass the {@link MoveDamageClass} of the move damage class
     */
    public void setMoveDamageClass(NamedApiResource<MoveDamageClass> moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    /**
     * Get the name of this resource in different languages
     *
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource in different languages
     *
     * @param names the {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Stat
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Stat stat)) return false;
        return Objects.equals(getId(), stat.getId()) && Objects.equals(getName(), stat.getName()) && Objects.equals(getGameIndex(), stat.getGameIndex()) && Objects.equals(isBattleOnly(), stat.isBattleOnly()) && Objects.equals(getAffectingMoves(), stat.getAffectingMoves()) && Objects.equals(getAffectingNatures(), stat.getAffectingNatures()) && Objects.equals(getCharacteristics(), stat.getCharacteristics()) && Objects.equals(getMoveDamageClass(), stat.getMoveDamageClass()) && Objects.equals(getNames(), stat.getNames());
    }

    /**
     * Returns the hash code of the Stat
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getGameIndex(), isBattleOnly(), getAffectingMoves(), getAffectingNatures(), getCharacteristics(), getMoveDamageClass(), getNames());
    }

    /**
     * Returns a string representation of the Stat
     *
     * @return the string representation
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
