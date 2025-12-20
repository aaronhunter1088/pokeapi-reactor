package skaro.pokeapi.resource.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.generation.Generation;

import java.util.Objects;

public class TypeRelationsPast {

    private NamedApiResource<Generation> generation;
    @JsonProperty("damage_relations")
    private TypeRelations damageRelations;

    /**
     * Get the last generation in which the
     * referenced type had the listed damage relations
     *
     * @return the {@link Generation} generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the last generation in which the
     * referenced type had the listed damage relations
     *
     * @param generation the {@link Generation} generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the damage relations the referenced type
     * had up to and including the listed generation
     *
     * @return damageRelations the {@link TypeRelations} damageRelations
     */
    public TypeRelations getDamageRelations() {
        return damageRelations;
    }

    /**
     * Set the damage relations the referenced type
     * had up to and including the listed generation
     *
     * @param damageRelations the {@link TypeRelations} damageRelations
     */
    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of TypeRelationsPast
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeRelationsPast that)) return false;
        return Objects.equals(getGeneration(), that.getGeneration()) && Objects.equals(getDamageRelations(), that.getDamageRelations());
    }

    /**
     * Returns the hash code of the TypeRelationsPast
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGeneration(), getDamageRelations());
    }

    /**
     * Returns a string representation of the TypeRelationsPast
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "TypeRelationsPast{" +
                "generation=" + generation +
                ", damageRelations=" + damageRelations +
                '}';
    }
}
