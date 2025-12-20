package skaro.pokeapi.resource.versiongroup;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod;
import skaro.pokeapi.resource.pokedex.Pokedex;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.resource.version.Version;

import java.util.List;
import java.util.Objects;

public class VersionGroup implements PokeApiResource {

    private Integer id;
    private String name;
    private Integer order;
    private NamedApiResource<Generation> generation;
    @JsonProperty("move_learn_methods")
    private List<NamedApiResource<MoveLearnMethod>> moveLearnMethods;
    private List<NamedApiResource<Pokedex>> pokedexes;
    private List<NamedApiResource<Region>> regions;
    private List<NamedApiResource<Version>> versions;

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
     * Get the order for sorting. Almost by date of
     * release, except similar versions are grouped together
     *
     * @return the order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Set the order for sorting. Almost by date of
     * release, except similar versions are grouped together
     *
     * @param order the order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get the generation this version was introduced in
     *
     * @return the {@link Generation} generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the generation this version was introduced in
     *
     * @param generation the {@link Generation} generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the list of methods in which Pokémon
     * can learn moves in this version group
     *
     * @return the list of {@link MoveLearnMethod} moveLearnMethods
     */
    public List<NamedApiResource<MoveLearnMethod>> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    /**
     * Set the list of methods in which Pokémon
     * can learn moves in this version group
     *
     * @param moveLearnMethods the list of {@link MoveLearnMethod} moveLearnMethods
     */
    public void setMoveLearnMethods(List<NamedApiResource<MoveLearnMethod>> moveLearnMethods) {
        this.moveLearnMethods = moveLearnMethods;
    }

    /**
     * Get the list of Pokédexes introduced in this version group
     *
     * @return the list of {@link Pokedex} pokedexes
     */
    public List<NamedApiResource<Pokedex>> getPokedexes() {
        return pokedexes;
    }

    /**
     * Set the list of pokedexes introduced in this version group
     *
     * @param pokedexes the list of {@link Pokedex} pokedexes
     */
    public void setPokedexes(List<NamedApiResource<Pokedex>> pokedexes) {
        this.pokedexes = pokedexes;
    }

    /**
     * Get a list of regions that can be visited in this version group
     *
     * @return the list of {@link Region} regions
     */
    public List<NamedApiResource<Region>> getRegions() {
        return regions;
    }

    /**
     * Set a list of regions that can be visited in this version group
     *
     * @param regions the list of {@link Region} regions
     */
    public void setRegions(List<NamedApiResource<Region>> regions) {
        this.regions = regions;
    }

    /**
     * Gets the versions this version group owns
     *
     * @return the list of {@link Version} versions
     */
    public List<NamedApiResource<Version>> getVersions() {
        return versions;
    }

    /**
     * Sets the versions this version group owns
     *
     * @param versions the list of {@link Version} versions
     */
    public void setVersions(List<NamedApiResource<Version>> versions) {
        this.versions = versions;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of VersionGroup
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VersionGroup that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getOrder(), that.getOrder()) && Objects.equals(getGeneration(), that.getGeneration()) && Objects.equals(getMoveLearnMethods(), that.getMoveLearnMethods()) && Objects.equals(getPokedexes(), that.getPokedexes()) && Objects.equals(getRegions(), that.getRegions()) && Objects.equals(getVersions(), that.getVersions());
    }

    /**
     * Returns the hash code of the VersionGroup
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOrder(), getGeneration(), getMoveLearnMethods(), getPokedexes(), getRegions(), getVersions());
    }

    /**
     * Returns a string representation of the VersionGroup
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "VersionGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", generation=" + generation +
                ", moveLearnMethods=" + moveLearnMethods +
                ", pokedexes=" + pokedexes +
                ", regions=" + regions +
                ", versions=" + versions +
                '}';
    }
}
