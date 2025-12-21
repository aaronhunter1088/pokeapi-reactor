package skaro.pokeapi.resource.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.GenerationGameIndex;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.locationarea.LocationArea;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the Location resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class Location implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private NamedApiResource<Region> region;
    private List<Name> names;
    @JsonProperty("game_indices")
    private List<GenerationGameIndex> gameIndices;
    private List<NamedApiResource<LocationArea>> areas;

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
     * Get the name of this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the region this location can be found in
     *
     * @return the {@link Region} region
     */
    public NamedApiResource<Region> getRegion() {
        return region;
    }

    /**
     * Set the region this location can be found in
     *
     * @param region the {@link Region} region
     */
    public void setRegion(NamedApiResource<Region> region) {
        this.region = region;
    }

    /**
     * Get the name of this resource listed in different languages
     *
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource listed in different languages
     *
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a list of game indices relevant to this
     * location by generation
     *
     * @return a list of {@link GenerationGameIndex} objects
     */
    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Set a list of game indices relevant to this
     * location by generation
     *
     * @param gameIndices a list of {@link GenerationGameIndex} objects
     */
    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get the areas that can be found within this location
     *
     * @return a list of {@link LocationArea} objects
     */
    public List<NamedApiResource<LocationArea>> getAreas() {
        return areas;
    }

    /**
     * Set the areas that can be found within this location
     *
     * @param areas a list of {@link LocationArea} objects
     */
    public void setAreas(List<NamedApiResource<LocationArea>> areas) {
        this.areas = areas;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Location
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Location location)) return false;
        return Objects.equals(getId(), location.getId()) && Objects.equals(getName(), location.getName()) && Objects.equals(getRegion(), location.getRegion()) && Objects.equals(getNames(), location.getNames()) && Objects.equals(getGameIndices(), location.getGameIndices()) && Objects.equals(getAreas(), location.getAreas());
    }

    /**
     * Returns the hash code of the Location
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getRegion(), getNames(), getGameIndices(), getAreas());
    }

    /**
     * Returns a string representation of the Location
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region=" + region +
                ", names=" + names +
                ", gameIndices=" + gameIndices +
                ", areas=" + areas +
                '}';
    }
}
