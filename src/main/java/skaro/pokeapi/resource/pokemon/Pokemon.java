package skaro.pokeapi.resource.pokemon;

import java.util.List;
import java.util.Objects;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VersionGameIndex;
import skaro.pokeapi.resource.pokemonform.PokemonForm;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

public class Pokemon implements PokeApiResource, Comparable<Pokemon> {

	private Integer id;
	private String name;
	private Integer baseExperience;
	private Integer height;
	private Boolean isDefault;
	private Integer order;
	private Integer weight;
	private List<PokemonAbility> abilities;
	private List<NamedApiResource<PokemonForm>> forms;
	private List<VersionGameIndex> gameIndices;
	private List<PokemonHeldItem> heldItems;
	private String locationAreaEncounters;
	private List<PokemonMove> moves;
	private PokemonSprites sprites;
	private NamedApiResource<PokemonSpecies> species;
	private List<PokemonStat> stats;
	private List<PokemonType> types;
	private List<PokemonTypePast> pastTypes;

	/** Returns the id of the Pokemon */
	@Override
	public Integer getId() {
		return id;
	}
	/** Sets the id of the Pokemon */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Returns the name of the Pokemon */
	@Override
	public String getName() {
		return name;
	}
	/** Sets the name of the Pokemon */
	public void setName(String name) {
		this.name = name;
	}

	/** Returns the baseExperience of the Pokemon */
	public Integer getBaseExperience() {
		return baseExperience;
	}
	/** Sets the baseExperience of the Pokemon */
	public void setBaseExperience(Integer baseExperience) {
		this.baseExperience = baseExperience;
	}

	/** Returns the height of the Pokemon */
	public Integer getHeight() {
		return height;
	}
	/** Sets the height of the Pokemon */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/** Returns whether the Pokemon is the default */
	public Boolean getDefault() {
		return isDefault;
	}
	/** Sets whether the Pokemon is default */
	public void setDefault(Boolean aDefault) {
		isDefault = aDefault;
	}

	/** Returns the order of the Pokemon */
	public Integer getOrder() {
		return order;
	}
	/** Sets the order of the Pokemon */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/** Returns the weight of the Pokemon */
	public Integer getWeight() {
		return weight;
	}
	/** Sets the weight of the Pokemon */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/** Returns the abilities of the Pokemon */
	public List<PokemonAbility> getAbilities() {
		return abilities;
	}
	/** Sets the abilities of the Pokemon */
	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}

	/** Returns the forms of the Pokemon */
	public List<NamedApiResource<PokemonForm>> getForms() {
		return forms;
	}
	/** Sets the forms of the Pokemon */
	public void setForms(List<NamedApiResource<PokemonForm>> forms) {
		this.forms = forms;
	}

	/** Returns the gameIndices of the Pokemon */
	public List<VersionGameIndex> getGameIndices() {
		return gameIndices;
	}
	/** Sets the gameIndices of the Pokemon */
	public void setGameIndices(List<VersionGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	/** Returns the heldItems of the Pokemon */
	public List<PokemonHeldItem> getHeldItems() {
		return heldItems;
	}
	/** Sets the heldItems of the Pokemon */
	public void setHeldItems(List<PokemonHeldItem> heldItems) {
		this.heldItems = heldItems;
	}

	/** Returns the locationAreaEncounters of the Pokemon */
	public String getLocationAreaEncounters() {
		return locationAreaEncounters;
	}
	/** Sets the locationAreaEncounters of the Pokemon */
	public void setLocationAreaEncounters(String locationAreaEncounters) {
		this.locationAreaEncounters = locationAreaEncounters;
	}

	/** Returns the moves of the Pokemon */
	public List<PokemonMove> getMoves() {
		return moves;
	}
	/** Sets the moves of the Pokemon */
	public void setMoves(List<PokemonMove> moves) {
		this.moves = moves;
	}

	/** Returns the sprites of the Pokemon */
	public PokemonSprites getSprites() {
		return sprites;
	}
	/** Sets the sprites of the Pokemon */
	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
	}

	/** Returns the species of the Pokemon */
	public NamedApiResource<PokemonSpecies> getSpecies() {
		return species;
	}
	/** Sets the species of the Pokemon */
	public void setSpecies(NamedApiResource<PokemonSpecies> species) {
		this.species = species;
	}

	/** Returns the stats of the Pokemon */
	public List<PokemonStat> getStats() {
		return stats;
	}
	/** Sets the stats of the Pokemon */
	public void setStats(List<PokemonStat> stats) {
		this.stats = stats;
	}

	/** Returns the types of the Pokemon */
	public List<PokemonType> getTypes() {
		return types;
	}
	/** Sets the types of the Pokemon */
	public void setTypes(List<PokemonType> types) {
		this.types = types;
	}

	/** Returns the pastTypes of the Pokemon */
	public List<PokemonTypePast> getPastTypes() {
		return pastTypes;
	}
	/** Sets the pastTypes of the Pokemon */
	public void setPastTypes(List<PokemonTypePast> pastTypes) {
		this.pastTypes = pastTypes;
	}

	/** Returns whether the given object o
	 *  is equal to this instance of Pokemon
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pokemon)) return false;
		Pokemon pokemon = (Pokemon) o;
		return Objects.equals(getId(), pokemon.getId()) && Objects.equals(getName(), pokemon.getName()) && Objects.equals(getBaseExperience(), pokemon.getBaseExperience()) && Objects.equals(getHeight(), pokemon.getHeight()) && Objects.equals(isDefault, pokemon.isDefault) && Objects.equals(getOrder(), pokemon.getOrder()) && Objects.equals(getWeight(), pokemon.getWeight()) && Objects.equals(getAbilities(), pokemon.getAbilities()) && Objects.equals(getForms(), pokemon.getForms()) && Objects.equals(getGameIndices(), pokemon.getGameIndices()) && Objects.equals(getHeldItems(), pokemon.getHeldItems()) && Objects.equals(getLocationAreaEncounters(), pokemon.getLocationAreaEncounters()) && Objects.equals(getMoves(), pokemon.getMoves()) && Objects.equals(getSprites(), pokemon.getSprites()) && Objects.equals(getSpecies(), pokemon.getSpecies()) && Objects.equals(getStats(), pokemon.getStats()) && Objects.equals(getTypes(), pokemon.getTypes()) && Objects.equals(getPastTypes(), pokemon.getPastTypes());
	}

	/** Returns the hash code of the Pokemon */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getBaseExperience(), getHeight(), isDefault, getOrder(), getWeight(), getAbilities(), getForms(), getGameIndices(), getHeldItems(), getLocationAreaEncounters(), getMoves(), getSprites(), getSpecies(), getStats(), getTypes(), getPastTypes());
	}

	/** Returns a string representation of the Pokemon */
	@Override
	public String toString() {
		return "Pokemon{" +
				"id=" + id +
				", name='" + name + '\'' +
				", baseExperience=" + baseExperience +
				", height=" + height +
				", isDefault=" + isDefault +
				", order=" + order +
				", weight=" + weight +
				", abilities=" + abilities +
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
	 * @param pokemon the pokedex pokemon to be compared.
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
