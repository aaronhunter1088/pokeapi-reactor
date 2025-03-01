package skaro.pokeapi.resource.version;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

public class Version implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;

	/** Gets the id for this Version */
	public Integer getId() {
		return id;
	}
	/** Sets the id for this Version */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name for this Version */
	public String getName() {
		return name;
	}
	/** Sets the name for this Version */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the names for this Version in different languages */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names for this Version in different languages */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the version group this version belongs to */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/** Sets the version group this version belongs to */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/** Returns whether the Version is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Version version)) return false;
        return Objects.equals(getId(), version.getId()) && Objects.equals(getName(), version.getName()) && Objects.equals(getNames(), version.getNames()) && Objects.equals(getVersionGroup(), version.getVersionGroup());
	}

	/** Returns the hash code of the Version */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getNames(), getVersionGroup());
	}

	/** Returns the String representation of the Version */
	@Override
	public String toString() {
		return "Version{" +
				"id=" + id +
				", name='" + name + '\'' +
				", names=" + names +
				", versionGroup=" + versionGroup +
				'}';
	}
}
