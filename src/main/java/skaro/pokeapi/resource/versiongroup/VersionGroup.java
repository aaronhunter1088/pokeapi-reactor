package skaro.pokeapi.resource.versiongroup;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod;
import skaro.pokeapi.resource.pokedex.Pokedex;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.resource.version.Version;

public class VersionGroup implements PokeApiResource {

	private Integer id;
	private String name;
	private Integer order;
	private NamedApiResource<Generation> generation;
	@JsonProperty("move_learn_methods")
	private List<NamedApiResource<MoveLearnMethod>> moveLearnMethods;
	private List<NamedApiResource<Pokedex>> pokedexes;
	private List<NamedApiResource<Region>> regions;
	private List<NamedApiResource<Version>> versions;

	/** Gets the id for this VersionGroup */
	public Integer getId() {
		return id;
	}
	/** Sets the id for this VersionGroup */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name for this VersionGroup */
	public String getName() {
		return name;
	}
	/** Sets the name for this VersionGroup */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the order for this VersionGroup */
	public Integer getOrder() {
		return order;
	}
	/** Sets the order for this VersionGroup */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/** Gets the generation this VersionGroup belongs to */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/** Sets the generation this VersionGroup belongs to */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/** Gets the move learn methods that are used in this VersionGroup */
	public List<NamedApiResource<MoveLearnMethod>> getMoveLearnMethods() {
		return moveLearnMethods;
	}
	/** Sets the move learn methods that are used in this VersionGroup */
	public void setMoveLearnMethods(List<NamedApiResource<MoveLearnMethod>> moveLearnMethods) {
		this.moveLearnMethods = moveLearnMethods;
	}

	/** Gets the pokedexes that are used in this VersionGroup */
	public List<NamedApiResource<Pokedex>> getPokedexes() {
		return pokedexes;
	}
	/** Sets the pokedexes that are used in this VersionGroup */
	public void setPokedexes(List<NamedApiResource<Pokedex>> pokedexes) {
		this.pokedexes = pokedexes;
	}

	/** Gets the regions that are used in this VersionGroup */
	public List<NamedApiResource<Region>> getRegions() {
		return regions;
	}
	/** Sets the regions that are used in this VersionGroup */
	public void setRegions(List<NamedApiResource<Region>> regions) {
		this.regions = regions;
	}

	/** Gets the versions that are used in this VersionGroup */
	public List<NamedApiResource<Version>> getVersions() {
		return versions;
	}
	/** Sets the versions that are used in this VersionGroup */
	public void setVersions(List<NamedApiResource<Version>> versions) {
		this.versions = versions;
	}

	/** Returns whether the VersionGroup is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof VersionGroup that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getOrder(), that.getOrder()) && Objects.equals(getGeneration(), that.getGeneration()) && Objects.equals(getMoveLearnMethods(), that.getMoveLearnMethods()) && Objects.equals(getPokedexes(), that.getPokedexes()) && Objects.equals(getRegions(), that.getRegions()) && Objects.equals(getVersions(), that.getVersions());
	}

	/** Returns the hash code of the VersionGroup */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getOrder(), getGeneration(), getMoveLearnMethods(), getPokedexes(), getRegions(), getVersions());
	}

	/** Returns the String representation of the VersionGroup */
	@Override
	public String toString() {
		return "VersionGroup{" +
				"id=" + id +
				", name='" + name + '\'' +
				", order=" + order +
				", generation=" + generation +
				", moveLearnMethods=" + moveLearnMethods +
				", pokedexes=" + pokedexes +
				", regions=" + regions +
				", versions=" + versions +
				'}';
	}
}
