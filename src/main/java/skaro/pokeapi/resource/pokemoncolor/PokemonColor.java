package skaro.pokeapi.resource.pokemoncolor;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the PokemonColor resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PokemonColor implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<Name> names;
    @JsonProperty("pokemon_species")
    private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

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
     * Get the names for this resource in different languages
     *
     * @return the list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the names for this resource in different languages
     *
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a list of PokemonSpecies that have this PokemonColor
     *
     * @return the list of {@link PokemonSpecies} PokemonSpecies
     */
    public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set the list of PokemonSpecies that have this PokemonColor
     *
     * @param pokemonSpecies the list of {@link PokemonSpecies} PokemonSpecies
     */
    public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonColor
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonColor that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
    }

    /**
     * Returns the hash code of the PokemonColor
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
    }

    /**
     * Returns a string representation of the PokemonColor
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonColor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", names=" + names +
                ", pokemonSpecies=" + pokemonSpecies +
                '}';
    }
}
