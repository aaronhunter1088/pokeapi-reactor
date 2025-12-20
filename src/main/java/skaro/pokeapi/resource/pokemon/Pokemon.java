package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VersionGameIndex;
import skaro.pokeapi.resource.pokemonform.PokemonForm;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.List;
import java.util.Objects;

public class Pokemon implements PokeApiResource, Comparable<Pokemon> {

    private Integer id;
    private String name;
    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty("cries")
    private PokemonCries pokemonCries;
    private Integer height;
    @JsonProperty("is_default")
    private Boolean isDefault;
    private Integer order;
    private Integer weight;
    private List<PokemonAbility> abilities;
    @JsonProperty("past_abilities")
    private List<PokemonPastAbility> pastAbilities;
    private List<NamedApiResource<PokemonForm>> forms;
    @JsonProperty("game_indices")
    private List<VersionGameIndex> gameIndices;
    @JsonProperty("held_items")
    private List<PokemonHeldItem> heldItems;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    private List<PokemonMove> moves;
    private PokemonSprites sprites;
    private NamedApiResource<PokemonSpecies> species;
    private List<PokemonStat> stats;
    private List<PokemonType> types;
    @JsonProperty("past_types")
    private List<PokemonTypePast> pastTypes;

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
     * Returns the baseExperience of the Pokémon
     *
     * @return the baseExperience
     */
    public Integer getBaseExperience() {
        return baseExperience;
    }

    /**
     * Sets the baseExperience of the Pokémon
     *
     * @param baseExperience the baseExperience
     */
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    /**
     * Get the cries of the Pokémon
     *
     * @return pokemonCries the cries
     */
    public PokemonCries getPokemonCries() {
        return pokemonCries;
    }

    /**
     * Set the cries of the Pokémon
     *
     * @param pokemonCries the cries
     */
    public void setPokemonCries(PokemonCries pokemonCries) {
        this.pokemonCries = pokemonCries;
    }

    /**
     * Get the height of this Pokémon in decimeters
     *
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Set the height of this Pokémon in decimeters
     *
     * @param height the height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Get for exactly one Pokémon used as
     * the default for each species
     *
     * @return isDefault
     */
    public Boolean isDefault() {
        return isDefault;
    }

    /**
     * Set for exactly one Pokémon used as
     * the default for each species
     *
     * @param isDefault the isDefault
     */
    public void setDefault(Boolean isDefault) {
        isDefault = isDefault;
    }

    /**
     * Get the order for sorting. Almost national order,
     * except families are grouped together
     *
     * @return the order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Set the order for sorting. Almost national order,
     * except families are grouped together
     *
     * @param order the order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get the weight of this Pokémon in hectograms
     *
     * @return the weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Set the weight of this Pokémon in hectograms
     *
     * @param weight the weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Get a list of abilities this Pokémon could potentially have
     *
     * @return the list of {@link PokemonAbility} abilities
     */
    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    /**
     * Set a list of abilities this Pokémon could potentially have
     *
     * @param abilities the list of {@link PokemonAbility} abilities
     */
    public void setAbilities(List<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    /**
     * Get a list of past abilities this Pokémon had
     *
     * @return the list of {@link PokemonPastAbility} pastAbilities
     */
    public List<PokemonPastAbility> getPastAbilities() {
        return pastAbilities;
    }

    /**
     * Set a list of past abilities this Pokémon had
     *
     * @param pastAbilities the list of {@link PokemonPastAbility} pastAbilities
     */
    public void setPastAbilities(List<PokemonPastAbility> pastAbilities) {
        this.pastAbilities = pastAbilities;
    }

    /**
     * Get a list of forms this Pokémon can take on
     *
     * @return the list of {@link PokemonForm} forms
     */
    public List<NamedApiResource<PokemonForm>> getForms() {
        return forms;
    }

    /**
     * Set a list of forms this Pokémon can take on
     *
     * @param forms the list of {@link PokemonForm} forms
     */
    public void setForms(List<NamedApiResource<PokemonForm>> forms) {
        this.forms = forms;
    }

    /**
     * Get a list of game indices relevant to Pokémon item by generation
     *
     * @return the list of {@link VersionGameIndex} gameIndices
     */
    public List<VersionGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Set a list of game indices relevant to Pokémon item by generation
     *
     * @param gameIndices the list of {@link VersionGameIndex} gameIndices
     */
    public void setGameIndices(List<VersionGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get a list of items this Pokémon may be holding when encountered
     *
     * @return the list of {@link PokemonHeldItem} heldItems
     */
    public List<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    /**
     * Set a list of items this Pokémon may be holding when encountered
     *
     * @param heldItems the list of {@link PokemonHeldItem} heldItems
     */
    public void setHeldItems(List<PokemonHeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    /**
     * Get a link to a list of location areas, as well as
     * encounter details pertaining to specific versions
     *
     * @return the locationAreaEncounters
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Set a link to a list of location areas, as well as
     * encounter details pertaining to specific versions
     *
     * @param locationAreaEncounters the locationAreaEncounters
     */
    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    /**
     * Get a list of moves along with learn methods and
     * level details pertaining to specific version groups
     *
     * @return the list of {@link PokemonMove} moves
     */
    public List<PokemonMove> getMoves() {
        return moves;
    }

    /**
     * Set a list of moves along with learn methods and
     * level details pertaining to specific version groups
     *
     * @param moves the list of {@link PokemonMove} moves
     */
    public void setMoves(List<PokemonMove> moves) {
        this.moves = moves;
    }

    /**
     * Get a set of sprites used to depict this Pokémon in the game.
     * A visual representation of the various sprites can be found
     * <a href="https://github.com/PokeAPI/sprites#sprites">here</a>.
     */
    public PokemonSprites getSprites() {
        return sprites;
    }

    /**
     * Set a set of sprites used to depict this Pokémon in the game.
     * A visual representation of the various sprites can be found
     * <a href="https://github.com/PokeAPI/sprites#sprites">here</a>.
     */
    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * Get the species this Pokémon belongs to
     *
     * @return the {@link PokemonSpecies} species
     */
    public NamedApiResource<PokemonSpecies> getSpecies() {
        return species;
    }

    /**
     * Set the species this Pokémon belongs to
     *
     * @param species the {@link PokemonSpecies} species
     */
    public void setSpecies(NamedApiResource<PokemonSpecies> species) {
        this.species = species;
    }

    /**
     * Get a list of base stat values for this Pokémon
     *
     * @return the list of {@link PokemonStat} stats
     */
    public List<PokemonStat> getStats() {
        return stats;
    }

    /**
     * Set a list of base stat values for this Pokémon
     *
     * @param stats the list of {@link PokemonStat} stats
     */
    public void setStats(List<PokemonStat> stats) {
        this.stats = stats;
    }

    /**
     * Get a list of details showing types this Pokémon has
     *
     * @return the list of {@link PokemonType} types
     */
    public List<PokemonType> getTypes() {
        return types;
    }

    /**
     * Set a list of details showing types this Pokémon has
     *
     * @param types the list of {@link PokemonType} types
     */
    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    /**
     * Get a list of details showing types this pokémon had
     * in previous generations
     *
     * @return the list of {@link PokemonTypePast} pastTypes
     */
    public List<PokemonTypePast> getPastTypes() {
        return pastTypes;
    }

    /**
     * Set a list of details showing types this pokémon had
     * in previous generations
     *
     * @param pastTypes the list of {@link PokemonTypePast} pastTypes
     */
    public void setPastTypes(List<PokemonTypePast> pastTypes) {
        this.pastTypes = pastTypes;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Pokemon
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pokemon pokemon)) return false;
        return Objects.equals(getId(), pokemon.getId()) && Objects.equals(getName(), pokemon.getName()) && Objects.equals(getBaseExperience(), pokemon.getBaseExperience()) && Objects.equals(getPokemonCries(), pokemon.getPokemonCries()) && Objects.equals(getHeight(), pokemon.getHeight()) && Objects.equals(isDefault, pokemon.isDefault) && Objects.equals(getOrder(), pokemon.getOrder()) && Objects.equals(getWeight(), pokemon.getWeight()) && Objects.equals(getAbilities(), pokemon.getAbilities()) && Objects.equals(getPastAbilities(), pokemon.getPastAbilities()) && Objects.equals(getForms(), pokemon.getForms()) && Objects.equals(getGameIndices(), pokemon.getGameIndices()) && Objects.equals(getHeldItems(), pokemon.getHeldItems()) && Objects.equals(getLocationAreaEncounters(), pokemon.getLocationAreaEncounters()) && Objects.equals(getMoves(), pokemon.getMoves()) && Objects.equals(getSprites(), pokemon.getSprites()) && Objects.equals(getSpecies(), pokemon.getSpecies()) && Objects.equals(getStats(), pokemon.getStats()) && Objects.equals(getTypes(), pokemon.getTypes()) && Objects.equals(getPastTypes(), pokemon.getPastTypes());
    }

    /**
     * Returns the hash code of the Pokemon
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBaseExperience(), getPokemonCries(), getHeight(), isDefault, getOrder(), getWeight(), getAbilities(), getPastAbilities(), getForms(), getGameIndices(), getHeldItems(), getLocationAreaEncounters(), getMoves(), getSprites(), getSpecies(), getStats(), getTypes(), getPastTypes());
    }

    /**
     * Returns a string representation of the Pokemon
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseExperience=" + baseExperience +
                ", pokemonCries=" + pokemonCries +
                ", height=" + height +
                ", isDefault=" + isDefault +
                ", order=" + order +
                ", weight=" + weight +
                ", abilities=" + abilities +
                ", pastAbilities=" + pastAbilities +
                ", forms=" + forms +
                ", gameIndices=" + gameIndices +
                ", heldItems=" + heldItems +
                ", locationAreaEncounters='" + locationAreaEncounters + '\'' +
                ", moves=" + moves +
                ", sprites=" + sprites +
                ", species=" + species +
                ", stats=" + stats +
                ", types=" + types +
                ", pastTypes=" + pastTypes +
                '}';
    }

    /**
     * Compares the id and name of the pokemon
     *
     * @param pokemon the pokemon to be compared.
     * @return 0 if the id and name are the same, 1 otherwise
     */
    @Override
    public int compareTo(Pokemon pokemon) {
        int idCompare = this.getId().compareTo(pokemon.getId());
        if (idCompare == 0)
            return this.getName().compareTo(pokemon.getName());
        return idCompare;
    }
}
