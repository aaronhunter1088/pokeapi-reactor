package skaro.pokeapi.resource.machine;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

public class Machine implements PokeApiResource {

	private Integer id;
	private NamedApiResource<Item> item;
	private NamedApiResource<Move> move;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;

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
	 * Get the Technical or Hidden Machine item that corresponds to this machine
	 * @return a {@link NamedApiResource<Item>} object
	 */
	public NamedApiResource<Item> getItem() {
		return item;
	}
	/**
	 * Set the Technical or Hidden Machine item that corresponds to this machine
	 * @param item a {@link NamedApiResource<Item>} object
	 */
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}

	/**
	 * Get the move that is taught by this machine
	 * @return a {@link NamedApiResource<Move>} object
	 */
	public NamedApiResource<Move> getMove() {
		return move;
	}
	/**
	 * Set the move that is taught by this machine
	 * @param move a {@link NamedApiResource<Move>} object
	 */
	public void setMove(NamedApiResource<Move> move) {
		this.move = move;
	}

	/**
	 * Get the version group that this machine applies to
	 * @return a {@link NamedApiResource<VersionGroup>} object
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group that this machine applies to
	 * @param versionGroup a {@link NamedApiResource<VersionGroup>} object
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Get the name of the this class
	 * @return the name of this class
	 */
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	/**
	 * Checks whether the Machine is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Machine machine)) return false;
        return Objects.equals(getId(), machine.getId()) && Objects.equals(getItem(), machine.getItem()) && Objects.equals(getMove(), machine.getMove()) && Objects.equals(getVersionGroup(), machine.getVersionGroup());
	}

	/**
	 * Generate a hash code for the Machine
	 * @return an integer hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getItem(), getMove(), getVersionGroup());
	}

	/**
	 * Get the string representation of the Machine
	 * @return a string representation
	 */
	@Override
	public String toString() {
		return "Machine{" +
				"id=" + id +
				", item=" + item +
				", move=" + move +
				", versionGroup=" + versionGroup +
				'}';
	}
}
