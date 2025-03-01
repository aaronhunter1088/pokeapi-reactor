package skaro.pokeapi.resource.locationarea;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.location.Location;
import skaro.pokeapi.utils.locale.Localizable;

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

	/** Gets the id of the LocationArea */
	@Override
	public Integer getId() {
		return id;
	}
	/** Sets the id of the LocationArea */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the LocationArea */
	@Override
	public String getName() {
		return name;
	}
	/** Sets the name of the LocationArea */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the game index of the LocationArea */
	public Integer getGameIndex() {
		return gameIndex;
	}
	/** Sets the game index of the LocationArea */
	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	/** Gets the encounter method rates of the LocationArea */
	public List<EncounterMethodRate> getEncounterMethodRates() {
		return encounterMethodRates;
	}
	/** Sets the encounter method rates of the LocationArea */
	public void setEncounterMethodRates(List<EncounterMethodRate> encounterMethodRates) {
		this.encounterMethodRates = encounterMethodRates;
	}

	/** Gets the location of the LocationArea */
	public NamedApiResource<Location> getLocation() {
		return location;
	}
	/** Sets the location of the LocationArea */
	public void setLocation(NamedApiResource<Location> location) {
		this.location = location;
	}

	/** Gets the names of the LocationArea */
	@Override
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names of the LocationArea */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the pokemon encounters of the LocationArea */
	public List<PokemonEncounter> getPokemonEncounters() {
		return pokemonEncounters;
	}
	/** Sets the pokemon encounters of the LocationArea */
	public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
		this.pokemonEncounters = pokemonEncounters;
	}

	/** Returns whether the LocationArea is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof LocationArea that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getGameIndex(), that.getGameIndex()) && Objects.equals(getEncounterMethodRates(), that.getEncounterMethodRates()) && Objects.equals(getLocation(), that.getLocation()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPokemonEncounters(), that.getPokemonEncounters());
	}

	/** Returns the hash code of the LocationArea */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getGameIndex(), getEncounterMethodRates(), getLocation(), getNames(), getPokemonEncounters());
	}

	/** Returns the string representation of the LocationArea */
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
