package skaro.pokeapi.resource.movelearnmethod;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

public class MoveLearnMethod implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Description> descriptions;
	private List<Name> names;
	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;

	/** Gets the id of this move learn method */
	public Integer getId() {
		return id;
	}
	/** Sets the id of this move learn method */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of this move learn method */
	public String getName() {
		return name;
	}
	/** Sets the name of this move learn method */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the descriptions of this move learn method */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/** Sets the descriptions of this move learn method */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/** Gets the names of this move learn method */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names of this move learn method */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the version groups this move learn method can be performed in */
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	/** Sets the version groups this move learn method can be performed in */
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}

	/**
	 * Returns true if the MoveLearnMethod object being compared
	 * is the same as the current MoveLearnMethod object.
	 * @param o The object being compared
	 * @return true if the same, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveLearnMethod that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getVersionGroups(), that.getVersionGroups());
	}

	/** Returns the hash code of the MoveLearnMethod */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getDescriptions(), getNames(), getVersionGroups());
	}

	/** Returns a string representation of the MoveLearnMethod */
	@Override
	public String toString() {
		return "MoveLearnMethod{" +
				"id=" + id +
				", name='" + name + '\'' +
				", descriptions=" + descriptions +
				", names=" + names +
				", versionGroups=" + versionGroups +
				'}';
	}
}
