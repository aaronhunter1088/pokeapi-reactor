package skaro.pokeapi.resource.supercontesteffect;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.FlavorText;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.move.Move;

public class SuperContestEffect implements PokeApiResource {

	private Integer id;
	private Integer appeal;
	@JsonProperty("flavor_text_entries")
	private List<FlavorText> flavorTextEntries;
	private List<NamedApiResource<Move>> moves;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAppeal() {
		return appeal;
	}
	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}
	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "SuperContestEffect{" +
				"id=" + id +
				", appeal=" + appeal +
				", flavorTextEntries=" + flavorTextEntries +
				", moves=" + moves +
				'}';
	}
}
