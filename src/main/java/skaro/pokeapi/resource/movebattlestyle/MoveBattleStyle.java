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
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() { return names; }
    /**
     * Set the name of this resource listed in different languages
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) { this.names = names; }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveBattleStyle
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveBattleStyle that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames());
    }

    /**
     * Returns the hash code of the MoveBattleStyle
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames());
    }

    /**
     * Returns a string representation of the MoveBattleStyle
     * @return the string representation
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
