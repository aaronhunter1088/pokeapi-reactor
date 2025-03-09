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
	 * Get the level of appeal this super contest effect has
	 * @return the level of appeal
	 */
	public Integer getAppeal() {
		return appeal;
	}
	/**
	 * Set the level of appeal this super contest effect has
	 * @param appeal the level of appeal
	 */
	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}

	/**
	 * Get the flavor text of this super contest
	 * effect listed in different languages
	 * @return the flavor text entries
	 */
	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/**
	 * Set the flavor text of this super contest
	 * effect listed in different languages
	 * @param flavorTextEntries the flavor text entries
	 */
	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/**
	 * Get a list of moves that have the
	 * effect when used in super contests
	 * @return the {@link NamedApiResource} lits of moves
	 */
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	/**
	 * Set a list of moves that have the
	 * effect when used in super contests
	 * @param moves the {@link NamedApiResource} list of moves
	 */
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}

	/** Returns the name of this class */
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	/** Returns a string representation of the object */
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
