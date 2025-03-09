package skaro.pokeapi.resource.type;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.generation.Generation;

import java.util.Objects;

public class TypeRelationsPast {
    
    private NamedApiResource<Generation> generation;
    private TypeRelations damageRelations;

    /**
     * Get the last generation in which the
     * referenced type had the listed damage relations
     * @return the {@link NamedApiResource} generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }
    /**
     * Set the last generation in which the
     * referenced type had the listed damage relations
     * @param generation the {@link NamedApiResource} generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the damage relations the referenced type
     * had up to and including the listed generation
     * @return damageRelations the damageRelations
     */
    public TypeRelations getDamageRelations() {
        return damageRelations;
    }
    /**
     * Setet the damage relations the referenced type
     * had up to and including the listed generation
     * @param damageRelations the damageRelations
     */
    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    /** Returns whether the TypeRelationsPast is equal to another object */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TypeRelationsPast that)) return false;
        return Objects.equals(getGeneration(), that.getGeneration()) && Objects.equals(getDamageRelations(), that.getDamageRelations());
    }

    /** Returns the hash code of the TypeRelationsPast */
    @Override
    public int hashCode() {
        return Objects.hash(getGeneration(), getDamageRelations());
    }

    /** Returns the string representation of the TypeRelationsPast */
    @Override
    public String toString() {
        return "TypeRelationsPast{" +
                "generation=" + generation +
                ", damageRelations=" + damageRelations +
                '}';
    }
}
