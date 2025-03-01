package skaro.pokeapi.resource.location;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.GenerationGameIndex;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.locationarea.LocationArea;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.utils.locale.Localizable;

public class Location implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private NamedApiResource<Region> region;
	private List<Name> names;
	@JsonProperty("game_indices")
	private List<GenerationGameIndex> gameIndices;
	private List<NamedApiResource<LocationArea>> areas;

	/** Gets the id of the location */
	public Integer getId() {
		return id;
	}
	/** Sets the id of the location */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the location */
	public String getName() {
		return name;
	}
	/** Sets the name of the location */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the region this location can be found in */
	public NamedApiResource<Region> getRegion() {
		return region;
	}
	/** Sets the region this location can be found in */
	public void setRegion(NamedApiResource<Region> region) {
		this.region = region;
	}

	/** Gets the names of the location */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the names of the location */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the game indices of the location */
	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}
	/** Sets the game indices of the location */
	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	/** Gets the areas that can be found within this location */
	public List<NamedApiResource<LocationArea>> getAreas() {
		return areas;
	}
	/** Sets the areas that can be found within this location */
	public void setAreas(List<NamedApiResource<LocationArea>> areas) {
		this.areas = areas;
	}

	/** Returns true if the Location is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Location location)) return false;
        return Objects.equals(getId(), location.getId()) && Objects.equals(getName(), location.getName()) && Objects.equals(getRegion(), location.getRegion()) && Objects.equals(getNames(), location.getNames()) && Objects.equals(getGameIndices(), location.getGameIndices()) && Objects.equals(getAreas(), location.getAreas());
	}

	/** Returns the hash code of the Location */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getRegion(), getNames(), getGameIndices(), getAreas());
	}

	/** Returns a string representation of the Location */
	@Override
	public String toString() {
		return "Location{" +
				"id=" + id +
				", name='" + name + '\'' +
				", region=" + region +
				", names=" + names +
				", gameIndices=" + gameIndices +
				", areas=" + areas +
				'}';
	}
}
