package skaro.pokeapi.resource.locationarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.location.Location;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the LocationArea resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class LocationArea implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    @JsonProperty("game_index")
    private Integer gameIndex;
    @JsonProperty("encounter_method_rates")
    private List<EncounterMethodRate> encounterMethodRates;
    private NamedApiResource<Location> location;
    private List<Name> names;
    @JsonProperty("pokemon_encounters")
    private List<PokemonEncounter> pokemonEncounters;

    /**
     * Get the id
     *
     * @return the id
     */
    @Override
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
    @Override
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
     * Get the internal id of an API resource within game data
     *
     * @return the game index
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set the internal id of an API resource within game data
     *
     * @param gameIndex the game index
     */
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get a list of methods in which Pokémon may be encountered
     * in this area and how likely the method will occur depending
     * on the version of the game
     *
     * @return the list of {@link EncounterMethodRate} encounter method rates
     */
    public List<EncounterMethodRate> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    /**
     * Set a list of methods in which Pokémon may be encountered
     * in this area and how likely the method will occur depending
     * on the version of the game
     *
     * @param encounterMethodRates the list of {@link EncounterMethodRate} encounter method rates
     */
    public void setEncounterMethodRates(List<EncounterMethodRate> encounterMethodRates) {
        this.encounterMethodRates = encounterMethodRates;
    }

    /**
     * Get the region this location area can be found in
     *
     * @return the {@link Location} location
     */
    public NamedApiResource<Location> getLocation() {
        return location;
    }

    /**
     * Set the region this location area can be found in
     *
     * @param location the {@link Location} location
     */
    public void setLocation(NamedApiResource<Location> location) {
        this.location = location;
    }

    /**
     * Get the name of this resource listed in different languages
     *
     * @return the list of {@link Name} names
     */
    @Override
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
     * Get a list of Pokémon that can be encountered in this
     * area along with version specific details about the encounter
     *
     * @return the list of {@link PokemonEncounter} pokemon encounters
     */
    public List<PokemonEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }

    /**
     * Set a list of Pokémon that can be encountered in this
     * area along with version specific details about the encounter
     *
     * @param pokemonEncounters the list of {@link PokemonEncounter} pokemon encounters
     */
    public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of LocationArea
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LocationArea that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getGameIndex(), that.getGameIndex()) && Objects.equals(getEncounterMethodRates(), that.getEncounterMethodRates()) && Objects.equals(getLocation(), that.getLocation()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonEncounters(), that.getPokemonEncounters());
    }

    /**
     * Returns the hash code of the LocationArea
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getGameIndex(), getEncounterMethodRates(), getLocation(), getNames(), getPokemonEncounters());
    }

    /**
     * Returns a string representation of the LocationArea
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "LocationArea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gameIndex=" + gameIndex +
                ", encounterMethodRates=" + encounterMethodRates +
                ", location=" + location +
                ", names=" + names +
                ", pokemonEncounters=" + pokemonEncounters +
                '}';
    }
}
