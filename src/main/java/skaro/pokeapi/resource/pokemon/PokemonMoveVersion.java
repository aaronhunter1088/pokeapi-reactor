package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

/**
 * Represents the PokemonMoveVersion resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PokemonMoveVersion {

    @JsonProperty("move_learn_method")
    private NamedApiResource<MoveLearnMethod> moveLearnMethod;
    @JsonProperty("version_group")
    private NamedApiResource<VersionGroup> versionGroup;
    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
    private Integer order;

    /**
     * Get the method by which the move is learned
     *
     * @return the {@link MoveLearnMethod} by which the move is learned
     */
    public NamedApiResource<MoveLearnMethod> getMoveLearnMethod() {
        return moveLearnMethod;
    }

    /**
     * Set the method by which the move is learned
     *
     * @param moveLearnMethod the {@link MoveLearnMethod}
     */
    public void setMoveLearnMethod(NamedApiResource<MoveLearnMethod> moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    /**
     * Get the version group in which the move is learned
     *
     * @return the {@link VersionGroup} in which the move is learned
     */
    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set the version group in which the move is learned
     *
     * @param versionGroup the {@link VersionGroup}
     */
    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Get the minimum level at which the move is learned
     *
     * @return the minimum level at which the move is learned
     */
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    /**
     * Set the minimum level at which the move is learned
     *
     * @param levelLearnedAt the minimum level at which the move is learned
     */
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    /**
     * Get the order in which the move is learned
     *
     * @return the order in which the move is learned
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Set the order in which the move is learned
     *
     * @param order the order in which the move is learned
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonMoveVersion
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonMoveVersion that)) return false;
        return Objects.equals(getMoveLearnMethod(), that.getMoveLearnMethod()) && Objects.equals(getVersionGroup(), that.getVersionGroup()) && Objects.equals(getLevelLearnedAt(), that.getLevelLearnedAt()) && Objects.equals(getOrder(), that.getOrder());
    }

    /**
     * Returns the hash code of the PokemonMoveVersion
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMoveLearnMethod(), getVersionGroup(), getLevelLearnedAt(), getOrder());
    }

    /**
     * Returns a string representation of the PokemonMoveVersion
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonMoveVersion{" +
                "moveLearnMethod=" + moveLearnMethod +
                ", versionGroup=" + versionGroup +
                ", levelLearnedAt=" + levelLearnedAt +
                ", order=" + order +
                '}';
    }
}
