package skaro.pokeapi.resource.contesttype;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.berryflavor.BerryFlavor;

import java.util.List;
import java.util.Objects;

public class ContestType implements PokeApiResource {

    private Integer id;
    private String name;
    @JsonProperty("berry_flavor")
    private NamedApiResource<BerryFlavor> berryFlavor;
    private List<ContestName> names;

    /**
     * Get the id of this contest type
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id of this contest type
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name of this contest type
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this contest type
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the berry flavor that correlates with this contest type
     *
     * @return the @{link BerryFlavor} berry flavor
     */
    public NamedApiResource<BerryFlavor> getBerryFlavor() {
        return berryFlavor;
    }

    /**
     * Set the berry flavor that correlates with this contest type
     *
     * @param berryFlavor the {@link BerryFlavor} berry flavor
     */
    public void setBerryFlavor(NamedApiResource<BerryFlavor> berryFlavor) {
        this.berryFlavor = berryFlavor;
    }

    /**
     * Get the name of this contest type listed in different languages
     *
     * @return the list of {@link ContestName} names
     */
    public List<ContestName> getNames() {
        return names;
    }

    /**
     * Set the name of this contest type listed in different languages
     *
     * @param names the list of {@link ContestName} names
     */
    public void setNames(List<ContestName> names) {
        this.names = names;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ContestType
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ContestType that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getBerryFlavor(), that.getBerryFlavor()) && Objects.equals(getNames(), that.getNames());
    }

    /**
     * Returns the hash code of the ContestType
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBerryFlavor(), getNames());
    }

    /**
     * Returns a string representation of the ContestType
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ContestType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", berryFlavor=" + berryFlavor +
                ", names=" + names +
                '}';
    }
}
