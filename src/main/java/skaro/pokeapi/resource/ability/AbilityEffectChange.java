package skaro.pokeapi.resource.ability;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.Effect;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

public class AbilityEffectChange {

	private List<Effect> effectEntries;
	private NamedApiResource<VersionGroup> versionGroup;

	/**
	 * Get the previous effect of this ability listed in different languages
	 * @return a list of {@link Effect} objects
	 */
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}

	/**
	 * Set the previous effect of this ability listed in different languages
	 * @param effectEntries a list of {@link Effect} objects
	 */
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/**
	 * Get The version group in which the
	 * previous effect of this ability originated
	 * @return the version group
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}

	/**
	 * Set The version group in which the
	 * previous effect of this ability originated
	 * @param versionGroup the version group
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Checks whether the object is equal to this ability effect change
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof AbilityEffectChange that)) return false;
        return Objects.equals(getEffectEntries(), that.getEffectEntries()) && Objects.equals(getVersionGroup(), that.getVersionGroup());
	}

	/**
	 * Generate a hash code for this ability effect change
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getEffectEntries(), getVersionGroup());
	}

	/**
	 * Get a string representation of this ability effect change
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "AbilityEffectChange{" +
				"effectEntries=" + effectEntries +
				", versionGroup=" + versionGroup +
				'}';
	}
}
