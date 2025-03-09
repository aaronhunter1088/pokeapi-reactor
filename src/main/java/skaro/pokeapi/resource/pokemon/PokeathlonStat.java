package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class PokeathlonStat implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;
    private NaturePokeathlonStatAffectSets affectingNatures;

    /**
     * Get the id
     * @return the id
     */
    public Integer getId() { return id; }
    /**
     * Set the id
     * @param id the id
     */
    public void setId(Integer id) { this.id = id; }

    /**
     * Get the name for this resource
     * @return the name
     */
    public String getName() { return name; }
    /**
     * Set the name for this resource
     * @param name the name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Get the name of this resource listed in different languages
     * @return a list of names
     */
    public List<Name> getNames() { return names; }
    /**
     * Set the name of this resource listed in different languages
     * @param names a list of names
     */
    public void setNames(List<Name> names) { this.names = names; }

    /**
     * Get a detail of natures which affect this
     * Pokéathlon stat positively or negatively.
     * @return the {@link NaturePokeathlonStatAffectSets} affectingNatures
     */
    public NaturePokeathlonStatAffectSets getAffectingNatures() { return affectingNatures; }
    /**
     * Set a detail of natures which affect this
     * Pokéathlon stat positively or negatively.
     * @param affectingNatures the {@link NaturePokeathlonStatAffectSets} affectingNatures
     */
    public void setAffectingNatures(NaturePokeathlonStatAffectSets affectingNatures) { this.affectingNatures = affectingNatures; }

    /**
     * Check if this PokeathlonStat is equal to another object
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokeathlonStat that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getAffectingNatures(), that.getAffectingNatures());
    }

    /**
     * Generate a hash code for this PokeathlonStat
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames(), getAffectingNatures());
    }

    /**
     * Get a String representation of this PokeathlonStat
     * @return the String representation
     */
    @Override
    public String toString() {
        return "PokeathlonStat{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", names=" + names +
                ", affectingNatures=" + affectingNatures +
                '}';
    }
}
