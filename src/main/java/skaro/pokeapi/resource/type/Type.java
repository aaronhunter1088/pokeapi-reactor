package skaro.pokeapi.resource.type;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.GenerationGameIndex;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.resource.movedamageclass.MoveDamageClass;
import skaro.pokeapi.utils.locale.Localizable;

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

	/** Gets the id for this Type */
	public Integer getId() {
		return id;
	}
	/** Sets the id for this Type */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name for this Type */
	public String getName() {
		return name;
	}
	/** Sets the name for this Type */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the damage relations for this Type */
	public TypeRelations getDamageRelations() {
		return damageRelations;
	}
	/** Sets the damage relations for this Type */
	public void setDamageRelations(TypeRelations damageRelations) {
		this.damageRelations = damageRelations;
	}

	/** Gets the past damage relations for this Type */
	public List<TypeRelationsPast> getPastDamageRelations() {
		return pastDamageRelations;
	}
	/** Sets the past damage relations for this Type */
	public void setPastDamageRelations(List<TypeRelationsPast> pastDamageRelations) {
		this.pastDamageRelations = pastDamageRelations;
	}

	/** Gets the game indices for this Type */
	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}
	/** Sets the game indices for this Type */
	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	/** Gets the generation this Type was introduced in */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/** Sets the generation this Type was introduced in */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/** Gets the move damage class for this Type */
	public NamedApiResource<MoveDamageClass> getMoveDamageClass() {
		return moveDamageClass;
	}
	/** Sets the move damage class for this Type */
	public void setMoveDamageClass(NamedApiResource<MoveDamageClass> moveDamageClass) {
		this.moveDamageClass = moveDamageClass;
	}

	/** Gets the names for this Type in different languages */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names for this Type in different languages */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets a list of Pokemon that have this Type */
	public List<TypePokemon> getPokemon() {
		return pokemon;
	}
	/** Sets a list of Pokemon that have this Type */
	public void setPokemon(List<TypePokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/** Gets a list of moves that have this Type */
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	/** Sets a list of moves that have this Type */
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	/** Returns whether the Type is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Type type)) return false;
        return Objects.equals(getId(), type.getId()) && Objects.equals(getName(), type.getName()) && Objects.equals(getDamageRelations(), type.getDamageRelations()) && Objects.equals(getPastDamageRelations(), type.getPastDamageRelations()) && Objects.equals(getGameIndices(), type.getGameIndices()) && Objects.equals(getGeneration(), type.getGeneration()) && Objects.equals(getMoveDamageClass(), type.getMoveDamageClass()) && Objects.equals(getNames(), type.getNames()) && Objects.equals(getPokemon(), type.getPokemon()) && Objects.equals(getMoves(), type.getMoves());
	}

	/** Returns the hash code of the Type */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getDamageRelations(), getPastDamageRelations(), getGameIndices(), getGeneration(), getMoveDamageClass(), getNames(), getPokemon(), getMoves());
	}

	/** Returns the string representation of the Type */
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
				'}';
	}
}
