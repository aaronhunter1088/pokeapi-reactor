package skaro.pokeapi.resource.type;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.NamedApiResource;

public class TypeRelations {

	private List<NamedApiResource<Type>> noDamageTo;
	private List<NamedApiResource<Type>> halfDamageTo;
	private List<NamedApiResource<Type>> doubleDamageTo;
	private List<NamedApiResource<Type>> noDamageFrom;
	private List<NamedApiResource<Type>> halfDamageFrom;
	private List<NamedApiResource<Type>> doubleDamageFrom;

	/**
	 * Get a list of types this type has no effect on
	 * @return the noDamageTo
	 */
	public List<NamedApiResource<Type>> getNoDamageTo() {
		return noDamageTo;
	}
	/**
	 * Set a list of types this type has no effect on
	 * @param noDamageTo the noDamageTo
	 */
	public void setNoDamageTo(List<NamedApiResource<Type>> noDamageTo) {
		this.noDamageTo = noDamageTo;
	}

	/**
	 * Get a list of types this type is not very effective against
	 * @return the halfDamageTo
	 */
	public List<NamedApiResource<Type>> getHalfDamageTo() {
		return halfDamageTo;
	}
	/**
	 * Set a list of types this type is not very effective against
	 * @param halfDamageTo the halfDamageTo
	 */
	public void setHalfDamageTo(List<NamedApiResource<Type>> halfDamageTo) {
		this.halfDamageTo = halfDamageTo;
	}

	/**
	 * Get a list of types this type is very effective against
	 * @return the doubleDamageTo
	 */
	public List<NamedApiResource<Type>> getDoubleDamageTo() {
		return doubleDamageTo;
	}
	/**
	 * Set a list of types this type is very effective against
	 * @param doubleDamageTo the doubleDamageTo
	 */
	public void setDoubleDamageTo(List<NamedApiResource<Type>> doubleDamageTo) {
		this.doubleDamageTo = doubleDamageTo;
	}

	/**
	 * Get a list of types that have no effect on this type
	 * @return the noDamageFrom
	 */
	public List<NamedApiResource<Type>> getNoDamageFrom() {
		return noDamageFrom;
	}
	/**
	 * Set a list of types that have no effect on this type
	 * @param noDamageFrom the noDamageFrom
	 */
	public void setNoDamageFrom(List<NamedApiResource<Type>> noDamageFrom) {
		this.noDamageFrom = noDamageFrom;
	}

	/**
	 * Get a list of types that are not very effective against this type
	 * @return the halfDamageFrom
	 */
	public List<NamedApiResource<Type>> getHalfDamageFrom() {
		return halfDamageFrom;
	}
	/**
	 * Set a list of types that are not very effective against this type
	 * @param halfDamageFrom the halfDamageFrom
	 */
	public void setHalfDamageFrom(List<NamedApiResource<Type>> halfDamageFrom) {
		this.halfDamageFrom = halfDamageFrom;
	}

	/**
	 * Get a list of types that are very effective against this type
	 * @return the doubleDamageFrom
	 */
	public List<NamedApiResource<Type>> getDoubleDamageFrom() {
		return doubleDamageFrom;
	}
	/**
	 * Set a list of types that are very effective against this type
	 * @param doubleDamageFrom the doubleDamageFrom
	 */
	public void setDoubleDamageFrom(List<NamedApiResource<Type>> doubleDamageFrom) {
		this.doubleDamageFrom = doubleDamageFrom;
	}

	/** Returns whether the TypeRelations is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof TypeRelations that)) return false;
        return Objects.equals(getNoDamageTo(), that.getNoDamageTo()) && Objects.equals(getHalfDamageTo(), that.getHalfDamageTo()) && Objects.equals(getDoubleDamageTo(), that.getDoubleDamageTo()) && Objects.equals(getNoDamageFrom(), that.getNoDamageFrom()) && Objects.equals(getHalfDamageFrom(), that.getHalfDamageFrom()) && Objects.equals(getDoubleDamageFrom(), that.getDoubleDamageFrom());
	}

	/** Returns the hash code of the TypeRelations */
	@Override
	public int hashCode() {
		return Objects.hash(getNoDamageTo(), getHalfDamageTo(), getDoubleDamageTo(), getNoDamageFrom(), getHalfDamageFrom(), getDoubleDamageFrom());
	}

	/** Returns the string representation of the TypeRelations */
	@Override
	public String toString() {
		return "TypeRelations{" +
				"noDamageTo=" + noDamageTo +
				", halfDamageTo=" + halfDamageTo +
				", doubleDamageTo=" + doubleDamageTo +
				", noDamageFrom=" + noDamageFrom +
				", halfDamageFrom=" + halfDamageFrom +
				", doubleDamageFrom=" + doubleDamageFrom +
				'}';
	}
}
