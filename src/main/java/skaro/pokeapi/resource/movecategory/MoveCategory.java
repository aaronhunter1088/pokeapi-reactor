package skaro.pokeapi.resource.movecategory;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.move.Move;

public class MoveCategory implements PokeApiResource {

	private Integer id;
	private String name;
	private List<NamedApiResource<Move>> moves;
	private List<Description> descriptions;

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
	 * Get a list of moves that fall into this category
	 * @return the list of {@link NamedApiResource<Move>} moves
	 */
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	/**
	 * Set the list of moves that fall into this category
	 * @param moves the list of {@link NamedApiResource<Move>} moves
	 */
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	/**
	 * Get the descriptions of this resource in different languages
	 * @return the descriptions
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * Set the descriptions of this resource in different languages
	 * @param descriptions the descriptions
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Checks whether this MoveCategory is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveCategory that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getMoves(), that.getMoves()) && Objects.equals(getDescriptions(), that.getDescriptions());
	}

	/**
	 * Calculate the hash code for this MoveCategory
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getMoves(), getDescriptions());
	}

	/**
	 * Get the string representation of this MoveCategory
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "MoveCategory{" +
				"id=" + id +
				", name='" + name + '\'' +
				", moves=" + moves +
				", descriptions=" + descriptions +
				'}';
	}
}
