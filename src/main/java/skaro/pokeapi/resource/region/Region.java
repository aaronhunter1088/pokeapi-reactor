package skaro.pokeapi.resource.region;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.location.Location;
import skaro.pokeapi.resource.pokedex.Pokedex;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

public class Region implements PokeApiResource, Localizable {

	private Integer id;
	private List<NamedApiResource<Location>> locations;
	private String name;
	private List<Name> names;
	@JsonProperty("main_generation")
	private NamedApiResource<Generation> mainGeneration;
	private List<NamedApiResource<Pokedex>> pokedexes;
	@JsonProperty("version_groups")
	private List<NamedApiResource<VersionGroup>> versionGroups;

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
	 * Get the locations within this region
	 * @return the {@link Location} list of locations
	 */
	public List<NamedApiResource<Location>> getLocations() {
		return locations;
	}
	/**
	 * Set the locations within this region
	 * @param locations the {@link Location} list of locations
	 */
	public void setLocations(List<NamedApiResource<Location>> locations) {
		this.locations = locations;
	}

	/**
	 * Get the name for this resource
	 * @return name the name
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
	 * Get the name of this resource listed in different languages
	 * @return the list of {@link Name} names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the name of this resource listed in different languages
	 * @param names the list of {@link Name} names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get the generation this region was introduced in
	 * @return the {@link Generation} of the main generation
	 */
	public NamedApiResource<Generation> getMainGeneration() {
		return mainGeneration;
	}
	/**
	 * Set the generation this region was introduced in
	 * @param mainGeneration the {@link Generation} of the main generation
	 */
	public void setMainGeneration(NamedApiResource<Generation> mainGeneration) {
		this.mainGeneration = mainGeneration;
	}

	/**
	 * Get a list of Pokédexes that catalogue Pokémon in this region
	 * @return the {@link Pokedex} list of Pokédexes
	 */
	public List<NamedApiResource<Pokedex>> getPokedexes() {
		return pokedexes;
	}
	/**
	 * Set a list of Pokédexes that catalogue pokemon in this region
	 * @param pokedexes the {@link Pokedex} list of Pokédexes
	 */
	public void setPokedexes(List<NamedApiResource<Pokedex>> pokedexes) {
		this.pokedexes = pokedexes;
	}

	/**
	 * Get a list of version groups this region can be visited
	 * @return the {@link VersionGroup} list of version groups
	 */
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	/**
	 * Set a list of version groups this region can be visited
	 * @param versionGroups the {@link VersionGroup} list of version groups
	 */
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of Region
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Region region)) return false;
        return Objects.equals(getId(), region.getId()) && Objects.equals(getLocations(), region.getLocations()) && Objects.equals(getName(), region.getName()) && Objects.equals(getNames(), region.getNames()) && Objects.equals(getMainGeneration(), region.getMainGeneration()) && Objects.equals(getPokedexes(), region.getPokedexes()) && Objects.equals(getVersionGroups(), region.getVersionGroups());
	}

	/**
	 * Returns the hash code of the Region
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getLocations(), getName(), getNames(), getMainGeneration(), getPokedexes(), getVersionGroups());
	}

	/**
	 * Returns a string representation of the Region
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "Region{" +
				"id=" + id +
				", locations=" + locations +
				", name='" + name + '\'' +
				", names=" + names +
				", mainGeneration=" + mainGeneration +
				", pokedexes=" + pokedexes +
				", versionGroups=" + versionGroups +
				'}';
	}
}
