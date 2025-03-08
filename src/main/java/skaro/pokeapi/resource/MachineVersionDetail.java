package skaro.pokeapi.resource;

import skaro.pokeapi.resource.machine.Machine;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.Objects;

public class MachineVersionDetail {

	private NamedApiResource<Machine> machine;
	private NamedApiResource<VersionGroup> versionGroup;

	/**
	 * Get the machine
	 * @return the machine
	 */
	public NamedApiResource<Machine> getMachine() {
		return machine;
	}
	/**
	 * Set the machine
	 * @param machine the machine to set
	 */
	public void setMachine(NamedApiResource<Machine> machine) {
		this.machine = machine;
	}

	/**
	 * Get the version group
	 * @return the version group
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group
	 * @param versionGroup the version group to set
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * @param o the object to test
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MachineVersionDetail that)) return false;
        return Objects.equals(getMachine(), that.getMachine()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
	}

	/**
	 * Returns a hash code value for the object.
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getMachine(), getVersionGroup());
	}

	/**
	 * Returns a string representation of a MachineVersionDetail.
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
