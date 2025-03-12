package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.machine.Machine;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

public class MachineVersionDetail {

	private NamedApiResource<Machine> machine;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;

	/**
	 * Get the machine that teaches a move from an item
	 * @return the {@link Machine} machine
	 */
	public NamedApiResource<Machine> getMachine() {
		return machine;
	}
	/**
	 * Set the machine that teaches a move from an item
	 * @param machine the {@link Machine} machine
	 */
	public void setMachine(NamedApiResource<Machine> machine) {
		this.machine = machine;
	}

	/**
	 * Get the version group of this specific machine
	 * @return the {@link VersionGroup} versionGroup
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group of this specific machine
	 * @param versionGroup the {@link VersionGroup} versionGroup
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of MachineVersionDetail
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MachineVersionDetail that)) return false;
        return Objects.equals(getMachine(), that.getMachine()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
	}

	/**
	 * Returns the hash code of the MachineVersionDetail
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getMachine(), getVersionGroup());
	}

	/**
	 * Returns a string representation of the MachineVersionDetail
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "MachineVersionDetail{" +
				"machine=" + machine +
				", versionGroup=" + versionGroup +
				'}';
	}
}
