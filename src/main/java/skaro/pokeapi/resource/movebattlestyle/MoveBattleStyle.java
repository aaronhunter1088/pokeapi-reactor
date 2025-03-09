package skaro.pokeapi.resource.movebattlestyle;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class MoveBattleStyle implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;

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
     * @return the names
     */
    public List<Name> getNames() { return names; }
    /**
     * Set the name of this resource listed in different languages
     * @param names the names
     */
    public void setNames(List<Name> names) { this.names = names; }

    /**
     * Check if two MoveBattleStyle objects are equal
     * @param o the other object
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveBattleStyle that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames());
    }

    /**
     * Generate a hash code for a MoveBattleStyle object
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames());
    }

    /**
     * Get the string representation of a MoveBattleStyle object
     */
    @Override
    public String toString() {
        return "MoveBattleStyle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", names=" + names +
                '}';
    }
}
