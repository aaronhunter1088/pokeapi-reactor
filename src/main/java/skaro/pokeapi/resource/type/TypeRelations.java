package skaro.pokeapi.resource.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;

import java.util.List;
import java.util.Objects;

public class TypeRelations {

    @JsonProperty("no_damage_to")
    private List<NamedApiResource<Type>> noDamageTo;
    @JsonProperty("half_damage_to")
    private List<NamedApiResource<Type>> halfDamageTo;
    @JsonProperty("double_damage_to")
    private List<NamedApiResource<Type>> doubleDamageTo;
    @JsonProperty("no_damage_from")
    private List<NamedApiResource<Type>> noDamageFrom;
    @JsonProperty("half_damage_from")
    private List<NamedApiResource<Type>> halfDamageFrom;
    @JsonProperty("double_damage_from")
    private List<NamedApiResource<Type>> doubleDamageFrom;

    /**
     * Get a list of types this type has no effect on
     *
     * @return the list of {@link Type} noDamageTo
     */
    public List<NamedApiResource<Type>> getNoDamageTo() {
        return noDamageTo;
    }

    /**
     * Set a list of types this type has no effect on
     *
     * @param noDamageTo the list of {@link Type} noDamageTo
     */
    public void setNoDamageTo(List<NamedApiResource<Type>> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }

    /**
     * Get a list of types this type is not very effective against
     *
     * @return the list of {@link Type} halfDamageTo
     */
    public List<NamedApiResource<Type>> getHalfDamageTo() {
        return halfDamageTo;
    }

    /**
     * Set a list of types this type is not very effective against
     *
     * @param halfDamageTo the list of {@link Type} halfDamageTo
     */
    public void setHalfDamageTo(List<NamedApiResource<Type>> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    /**
     * Get a list of types this type is very effective against
     *
     * @return the list of {@link Type} doubleDamageTo
     */
    public List<NamedApiResource<Type>> getDoubleDamageTo() {
        return doubleDamageTo;
    }

    /**
     * Set a list of types this type is very effective against
     *
     * @param doubleDamageTo the list of {@link Type} doubleDamageTo
     */
    public void setDoubleDamageTo(List<NamedApiResource<Type>> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    /**
     * Get a list of types that have no effect on this type
     *
     * @return the list of {@link Type} noDamageFrom
     */
    public List<NamedApiResource<Type>> getNoDamageFrom() {
        return noDamageFrom;
    }

    /**
     * Set a list of types that have no effect on this type
     *
     * @param noDamageFrom the list of {@link Type} noDamageFrom
     */
    public void setNoDamageFrom(List<NamedApiResource<Type>> noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
    }

    /**
     * Get a list of types that are not very effective against this type
     *
     * @return the list of {@link Type} halfDamageFrom
     */
    public List<NamedApiResource<Type>> getHalfDamageFrom() {
        return halfDamageFrom;
    }

    /**
     * Set a list of types that are not very effective against this type
     *
     * @param halfDamageFrom the list of {@link Type} halfDamageFrom
     */
    public void setHalfDamageFrom(List<NamedApiResource<Type>> halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
    }

    /**
     * Get a list of types that are very effective against this type
     *
     * @return the list of {@link Type} doubleDamageFrom
     */
    public List<NamedApiResource<Type>> getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    /**
     * Set a list of types that are very effective against this type
     *
     * @param doubleDamageFrom the list of {@link Type} doubleDamageFrom
     */
    public void setDoubleDamageFrom(List<NamedApiResource<Type>> doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of TypeRelations
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeRelations that)) return false;
        return Objects.equals(getNoDamageTo(), that.getNoDamageTo()) && Objects.equals(getHalfDamageTo(), that.getHalfDamageTo()) && Objects.equals(getDoubleDamageTo(), that.getDoubleDamageTo()) && Objects.equals(getNoDamageFrom(), that.getNoDamageFrom()) && Objects.equals(getHalfDamageFrom(), that.getHalfDamageFrom()) && Objects.equals(getDoubleDamageFrom(), that.getDoubleDamageFrom());
    }

    /**
     * Returns the hash code of the TypeRelations
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getNoDamageTo(), getHalfDamageTo(), getDoubleDamageTo(), getNoDamageFrom(), getHalfDamageFrom(), getDoubleDamageFrom());
    }

    /**
     * Returns a string representation of the TypeRelations
     *
     * @return the string representation
     */
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
