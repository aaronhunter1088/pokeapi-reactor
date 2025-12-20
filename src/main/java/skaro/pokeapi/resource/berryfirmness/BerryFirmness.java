package skaro.pokeapi.resource.berryfirmness;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.berry.Berry;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class BerryFirmness implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<Berry>> berries;
    private List<Name> names;

    /**
     * Get the id
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get a list of the berries with this firmness
     *
     * @return a list of {@link Berry} berries
     */
    public List<NamedApiResource<Berry>> getBerries() {
        return berries;
    }

    /**
     * Set a list of the berries with this firmness
     *
     * @param berries a list of {@link Berry} berries
     */
    public void setBerries(List<NamedApiResource<Berry>> berries) {
        this.berries = berries;
    }

    /**
     * Get the name of this resource listed in different languages
     *
     * @return a list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource listed in different languages
     *
     * @param names a list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of BerryFirmness
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BerryFirmness that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getBerries(), that.getBerries()) && Objects.equals(getNames(), that.getNames());
    }

    /**
     * Returns the hash code of the BerryFirmness
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBerries(), getNames());
    }

    /**
     * Returns a string representation of the BerryFirmness
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "BerryFirmness{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", berries=" + berries +
                ", names=" + names +
                '}';
    }
}
