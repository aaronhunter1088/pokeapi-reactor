package skaro.pokeapi.resource.pokemonhabitat;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the PokemonHabitat resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class PokemonHabitat implements PokeApiResource, Localizable {

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
     * Get a list of PokemonSpecies that can be found in this habitat
     *
     * @return the list of {@link PokemonSpecies} PokemonSpecies
     */
    public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set a list of PokemonSpecies that can be found in this habitat
     *
     * @param pokemonSpecies the list of  {@link PokemonSpecies} PokemonSpecies
     */
    public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonHabitat
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonHabitat that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
    }

    /**
     * Returns the hash code of the PokemonHabitat
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames(), getPokemonSpecies());
    }

    /**
     * Returns a string representation of the PokemonHabitat
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonHabitat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", names=" + names +
                ", pokemonSpecies=" + pokemonSpecies +
                '}';
    }
}
