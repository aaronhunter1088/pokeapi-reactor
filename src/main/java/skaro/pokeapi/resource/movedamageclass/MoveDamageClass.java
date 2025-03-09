package skaro.pokeapi.resource.movedamageclass;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.utils.locale.Localizable;

public class MoveDamageClass implements PokeApiResource, Localizable {

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
	 * Get a list of moves that fall into this damage class
	 * @return the list of {@link NamedApiResource<Move>} moves
	 */
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	/**
	 * Set a list of moves that fall into this damage class
	 * @param moves the list of {@link NamedApiResource<Move>} moves
	 */
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	/**
	 * Get the names of this resource listed in other languages
	 * @return the names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the names of this resource listed in other languages
	 * @param names the names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Compares this MoveDamageClass to another object to determine if they are equal
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveDamageClass that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getMoves(), that.getMoves()) && Objects.equals(getNames(), that.getNames());
	}

	/**
	 * Calculate the hash code of this MoveDamageClass
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getDescriptions(), getMoves(), getNames());
	}

	/**
	 * Returns a String representation of this MoveDamageClass
	 * @return the MoveDamageClass as a String
	 */
	@Override
	public String toString() {
		return "MoveDamageClass{" +
				"id=" + id +
				", name='" + name + '\'' +
				", descriptions=" + descriptions +
				", moves=" + moves +
				", names=" + names +
				'}';
	}
}
