package skaro.pokeapi.resource.palparkarea;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class PalParkArea implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;
    @JsonProperty("pokemon_encounters")
    private List<PalParkEncounterSpecies> pokemonEncounters;

    /**
     * Get the id
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * Set the id
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name for this resource
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name for this resource
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the names in other languages
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }
    /**
     * Set the names in other languages
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a list of Pokémon encountered in
     * the pal park area along with details
     * @return the list of {@link PalParkEncounterSpecies} pokemon encounters
     */
    public List<PalParkEncounterSpecies> getPokemonEncounters() {
        return pokemonEncounters;
    }
    /**
     * Set the pokemon encounters
     * @param pokemonEncounters the list of {@link PalParkEncounterSpecies} pokemon encounters
     */
    public void setPokemonEncounters(List<PalParkEncounterSpecies> pokemonEncounters) { this.pokemonEncounters = pokemonEncounters; }

    /**
     * Returns whether the given object o is
     * equal to this instance of PalParkArea
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PalParkArea that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonEncounters(), that.getPokemonEncounters());
    }

    /**
     * Returns the hash code of the PalParkArea
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames(), getPokemonEncounters());
    }

    /**
     * Returns a string representation of the PalParkArea
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PalParkArea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", names=" + names +
                ", pokemonEncounters=" + pokemonEncounters +
                '}';
    }
}
