package skaro.pokeapi.resource.pokemonshape;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class PokemonShape implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    @JsonProperty("awesome_names")
    private List<AwesomeName> awesomeNames;
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
     * Get the "scientific" name of this Pokémon
     * shape listed in different languages
     *
     * @return the list of {@link AwesomeName} awesome names
     */
    public List<AwesomeName> getAwesomeNames() {
        return awesomeNames;
    }

    /**
     * Set the "scientific" name of this Pokémon
     * shape listed in different languages
     *
     * @param awesomeNames the list of {@link AwesomeName} awesome names
     */
    public void setAwesomeNames(List<AwesomeName> awesomeNames) {
        this.awesomeNames = awesomeNames;
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
     * Get a list of the Pokémon species that have this shape
     *
     * @return the list of {@link PokemonSpecies} pokemon species
     */
    public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set a list of the Pokémon species that have this shape
     *
     * @param pokemonSpecies the list of {@link PokemonSpecies} pokemon species
     */
    public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonShape
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonShape that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getAwesomeNames(), that.getAwesomeNames()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonSpecies(), that.getPokemonSpecies());
    }

    /**
     * Returns the hash code of the PokemonShape
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAwesomeNames(), getNames(), getPokemonSpecies());
    }

    /**
     * Returns a string representation of the PokemonShape
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonShape{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", awesomeNames=" + awesomeNames +
                ", names=" + names +
                ", pokemonSpecies=" + pokemonSpecies +
                '}';
    }
}
