package skaro.pokeapi.resource.movetarget;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.utils.locale.Localizable;

public class MoveTarget implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<NamedApiResource<Move>> moves;
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
	 * Get the descriptions of this resource
	 * in different languages
	 * @return the list of {@link Description} descriptions
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * Set the descriptions of this resource
	 * in different languages
	 * @param descriptions the list of {@link Description} descriptions
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Get a list of moves that that are directed at this target
	 * @return the list of {@link Move} moves
	 */
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	/**
	 * Set a list of moves that that are directed at this target
	 * @param moves the list of {@link Move} moves
	 */
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	/**
	 * Get the names of this resource in different languages
	 * @return the list of {@link Name} names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the names of this resource in different languages
	 * @param names the list of {@link Name} names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of MoveTarget
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveTarget that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getMoves(), that.getMoves()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Returns the hash code of the MoveTarget
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getDescriptions(), getMoves(), getNames());
	}

	/**
	 * Returns a string representation of the MoveTarget
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "MoveTarget{" +
				"id=" + id +
				", name='" + name + '\'' +
				", descriptions=" + descriptions +
				", moves=" + moves +
				", names=" + names +
				'}';
	}
}
