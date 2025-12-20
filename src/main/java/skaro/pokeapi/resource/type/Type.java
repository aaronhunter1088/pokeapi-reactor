package skaro.pokeapi.resource.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.GenerationGameIndex;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.resource.movedamageclass.MoveDamageClass;
import skaro.pokeapi.resource.pokemon.GenerationSprites;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class Type implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    @JsonProperty("damage_relations")
    private TypeRelations damageRelations;
    @JsonProperty("past_damage_relations")
    private List<TypeRelationsPast> pastDamageRelations;
    @JsonProperty("game_indices")
    private List<GenerationGameIndex> gameIndices;
    private NamedApiResource<Generation> generation;
    @JsonProperty("move_damage_class")
    private NamedApiResource<MoveDamageClass> moveDamageClass;
    private List<Name> names;
    private List<TypePokemon> pokemon;
    private List<NamedApiResource<Move>> moves;
    @JsonProperty("sprites")
    private GenerationSprites generationSprites;

    /**
     * Get the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name for this resource
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get a detail of how effective this
     * type is toward others and vice versa
     *
     * @return the {@link TypeRelations} damageRelations
     */
    public TypeRelations getDamageRelations() {
        return damageRelations;
    }

    /**
     * Set a detail of how effective this
     * type is toward others and vice versa
     *
     * @param damageRelations the {@link TypeRelations} damageRelations
     */
    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    /**
     * Get a list of details of how effective this
     * type was toward others and vice versa in
     * previous generations
     *
     * @return a list of {@link TypeRelationsPast} pastDamageRelations
     */
    public List<TypeRelationsPast> getPastDamageRelations() {
        return pastDamageRelations;
    }

    /**
     * Set a list of details of how effective this
     * type was toward others and vice versa in
     * previous generations
     *
     * @param pastDamageRelations a list of {@link TypeRelationsPast} pastDamageRelations
     */
    public void setPastDamageRelations(List<TypeRelationsPast> pastDamageRelations) {
        this.pastDamageRelations = pastDamageRelations;
    }

    /**
     * Get a list of game indices relevant
     * to this item by generation.
     *
     * @return the list of {@link GenerationGameIndex} gameIndices
     */
    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Set a list of game indices relevant
     * to this item by generation.
     *
     * @param gameIndices the list of {@link GenerationGameIndex} gameIndices
     */
    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get the generation this type was introduced in
     *
     * @return the {@link Generation} generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the generation this type was introduced in
     *
     * @param generation the {@link Generation} generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the class of damage inflicted by this type
     *
     * @return the {@link MoveDamageClass} damage inflicted by this type
     */
    public NamedApiResource<MoveDamageClass> getMoveDamageClass() {
        return moveDamageClass;
    }

    /**
     * Set the class of damage inflicted by this type
     *
     * @param moveDamageClass the  {@link MoveDamageClass} damage inflicted by this type
     */
    public void setMoveDamageClass(NamedApiResource<MoveDamageClass> moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    /**
     * Get the name of this resource
     * listed in different languages
     *
     * @return list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource
     * listed in different languages
     *
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a list of details of Pokémon that have this type
     *
     * @return a list of {@link TypePokemon} Pokémon
     */
    public List<TypePokemon> getPokemon() {
        return pokemon;
    }

    /**
     * Set a list of Pokemon that have this Type
     *
     * @param pokemon a list of {@link TypePokemon} pokemon
     */
    public void setPokemon(List<TypePokemon> pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Get a list of moves that have this Type
     *
     * @return a list of {@link NamedApiResource<Move>} moves
     */
    public List<NamedApiResource<Move>> getMoves() {
        return moves;
    }

    /**
     * Set a list of moves that have this Type
     *
     * @param moves a list of {@link NamedApiResource<Move>} moves
     */
    public void setMoves(List<NamedApiResource<Move>> moves) {
        this.moves = moves;
    }

    /**
     * Gets the sprites for this type
     *
     * @return the {@link GenerationSprites} sprites for this type
     */
    public GenerationSprites getGenerationSprites() {
        return generationSprites;
    }

    /**
     * Sets the sprites for this type
     *
     * @param generationSprites the {@link GenerationSprites} sprites for this type
     */
    public void setGenerationSprites(GenerationSprites generationSprites) {
        this.generationSprites = generationSprites;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Type
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Type type)) return false;
        return Objects.equals(getId(), type.getId()) && Objects.equals(getName(), type.getName()) && Objects.equals(getDamageRelations(), type.getDamageRelations()) && Objects.equals(getPastDamageRelations(), type.getPastDamageRelations()) && Objects.equals(getGameIndices(), type.getGameIndices()) && Objects.equals(getGeneration(), type.getGeneration()) && Objects.equals(getMoveDamageClass(), type.getMoveDamageClass()) && Objects.equals(getNames(), type.getNames()) && Objects.equals(getPokemon(), type.getPokemon()) && Objects.equals(getMoves(), type.getMoves()) && Objects.equals(getGenerationSprites(), type.getGenerationSprites());
    }

    /**
     * Returns the hash code of the Type
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDamageRelations(), getPastDamageRelations(), getGameIndices(), getGeneration(), getMoveDamageClass(), getNames(), getPokemon(), getMoves(), getGenerationSprites());
    }

    /**
     * Returns a string representation of the Type
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", damageRelations=" + damageRelations +
                ", pastDamageRelations=" + pastDamageRelations +
                ", gameIndices=" + gameIndices +
                ", generation=" + generation +
                ", moveDamageClass=" + moveDamageClass +
                ", names=" + names +
                ", pokemon=" + pokemon +
                ", moves=" + moves +
                ", generationSprites=" + generationSprites +
                '}';
    }
}
