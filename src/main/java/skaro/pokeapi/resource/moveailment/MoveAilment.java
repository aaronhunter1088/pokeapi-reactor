package skaro.pokeapi.resource.moveailment;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the MoveAilment resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class MoveAilment implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<Move>> moves;
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
     * Get the name of this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get a list of moves that cause this ailment
     *
     * @return the list of {@link Move} moves
     */
    public List<NamedApiResource<Move>> getMoves() {
        return moves;
    }

    /**
     * Set the list of moves that cause this ailment
     *
     * @param moves the list of {@link Move} moves
     */
    public void setMoves(List<NamedApiResource<Move>> moves) {
        this.moves = moves;
    }

    /**
     * Get the name of this resource listed in different languages
     *
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource listed in different languages
     *
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveAilment
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveAilment that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getMoves(), that.getMoves()) && Objects.equals(getNames(), that.getNames());
    }

    /**
     * Returns the hash code of the MoveAilment
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMoves(), getNames());
    }

    /**
     * Returns a string representation of the MoveAilment
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "MoveAilment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", moves=" + moves +
                ", names=" + names +
                '}';
    }
}
