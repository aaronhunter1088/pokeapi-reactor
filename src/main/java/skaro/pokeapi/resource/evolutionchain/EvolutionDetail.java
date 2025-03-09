package skaro.pokeapi.resource.evolutionchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.evolutiontrigger.EvolutionTrigger;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.location.Location;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.resource.type.Type;

import java.util.Objects;

public class EvolutionDetail {

	private NamedApiResource<Item> item;
	private NamedApiResource<EvolutionTrigger> trigger;
	private Integer gender;
	@JsonProperty("held_item")
	private NamedApiResource<Item> heldItem;
	@JsonProperty("known_move")
	private NamedApiResource<Move> knownMove;
	@JsonProperty("known_move_type")
	private NamedApiResource<Type> knownMoveType;
	private NamedApiResource<Location> location;
	@JsonProperty("min_level")
	private Integer minLevel;
	@JsonProperty("min_happiness")
	private Integer minHappiness;
	@JsonProperty("min_beauty")
	private Integer minBeauty;
	@JsonProperty("min_affection")
	private Integer minAffection;
	@JsonProperty("needs_overworld_rain")
	private Boolean needsOverworldRain;
	@JsonProperty("party_species")
	private NamedApiResource<PokemonSpecies> partySpecies;
	@JsonProperty("party_type")
	private NamedApiResource<Type> partyType;
	@JsonProperty("relative_physical_stats")
	private Integer relativePhysicalStats;
	@JsonProperty("time_of_day")
	private String timeOfDay;
	@JsonProperty("trade_species")
	private NamedApiResource<PokemonSpecies> tradeSpecies;
	@JsonProperty("turn_upside_down")
	private Boolean turnUpsideDown;

	/**
	 * Get the item required to cause
	 * evolution this into Pokémon species
	 * @return the item
	 */
	public NamedApiResource<Item> getItem() {
		return item;
	}
	/**
	 * Set the item required to cause
	 * evolution this into Pokémon species
	 * @param item the item
	 */
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}

	/**
	 * Get the type of event that triggers
	 * evolution into this Pokémon species
	 * @return the trigger
	 */
	public NamedApiResource<EvolutionTrigger> getTrigger() {
		return trigger;
	}
	/**
	 * Set the type of event that triggers
	 * evolution into this Pokémon species
	 * @param trigger the trigger
	 */
	public void setTrigger(NamedApiResource<EvolutionTrigger> trigger) {
		this.trigger = trigger;
	}

	/**
	 * Get the id of the gender of the evolving Pokémon species
	 * must be in order to evolve into this Pokémon species
	 * @return the gender
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * Set the id of the gender of the evolving Pokémon species
	 * must be in order to evolve into this Pokémon species
	 * @param gender
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * Get The item the evolving Pokémon species must
	 * be holding during the evolution trigger event
	 * to evolve into this Pokémon species
	 * @return the held item
	 */
	public NamedApiResource<Item> getHeldItem() {
		return heldItem;
	}
	/**
	 * Set The item the evolving Pokémon species must
	 * be holding during the evolution trigger event
	 * to evolve into this Pokémon species
	 * @param heldItem the held item
	 */
	public void setHeldItem(NamedApiResource<Item> heldItem) {
		this.heldItem = heldItem;
	}

	/**
	 * Get the move that must be known by the evolving
	 * Pokémon species during the evolution trigger
	 * event in order to evolve into this Pokémon species
	 * @return the known move
	 */
	public NamedApiResource<Move> getKnownMove() {
		return knownMove;
	}
	/**
	 * Set
	 * The move that must be known by the evolving
	 * Pokémon species during the evolution trigger
	 * event in order to evolve into this Pokémon species
	 * @param knownMove the known move
	 */
	public void setKnownMove(NamedApiResource<Move> knownMove) {
		this.knownMove = knownMove;
	}

	/**
	 * Get the evolving Pokémon species must know a move
	 * with this type during the evolution trigger event
	 * in order to evolve into this Pokémon species
	 * @return the known move type
	 */
	public NamedApiResource<Type> getKnownMoveType() {
		return knownMoveType;
	}
	/**
	 * Set the evolving Pokémon species must know a move
	 * with this type during the evolution trigger event
	 * in order to evolve into this Pokémon species
	 * @param knownMoveType the known move type
	 */
	public void setKnownMoveType(NamedApiResource<Type> knownMoveType) {
		this.knownMoveType = knownMoveType;
	}

	/**
	 * Get the location the evolution must be triggered at
	 * @return the {@link NamedApiResource<Location>} location
	 */
	public NamedApiResource<Location> getLocation() {
		return location;
	}

	/**
	 * Set the location the evolution must be triggered at
	 * @param location the {@link NamedApiResource<Location>} location
	 */
	public void setLocation(NamedApiResource<Location> location) {
		this.location = location;
	}

	/**
	 * Get the minimum required level of the evolving
	 * Pokémon species to evolve into this Pokémon species
	 * @return the minimum level
	 */
	public Integer getMinLevel() {
		return minLevel;
	}
	/**
	 * Set the minimum required level of the evolving
	 * Pokémon species to evolve into this Pokémon species
	 * @param minLevel the minimum level
	 */
	public void setMinLevel(Integer minLevel) {
		this.minLevel = minLevel;
	}

	/**
	 * Get the minimum required level of happiness
	 * the evolving Pokémon species to evolve into
	 * this Pokémon species
	 * @return the minimum happiness
	 */
	public Integer getMinHappiness() {
		return minHappiness;
	}
	/**
	 * Set the minimum required level of happiness
	 * the evolving Pokémon species to evolve into
	 * this Pokémon species
	 * @param minHappiness the minimum happiness
	 */
	public void setMinHappiness(Integer minHappiness) {
		this.minHappiness = minHappiness;
	}

	/**
	 * Get the minimum required level of beauty the
	 * evolving Pokémon species to evolve into this
	 * Pokémon species
	 * @return the minimum beauty
	 */
	public Integer getMinBeauty() {
		return minBeauty;
	}
	/**
	 * Set the minimum required level of beauty the
	 * evolving Pokémon species to evolve into this
	 * Pokémon species
	 * @param minBeauty the minimum beauty
	 */
	public void setMinBeauty(Integer minBeauty) {
		this.minBeauty = minBeauty;
	}

	/**
	 * Get the minimum required level of affection
	 * the evolving Pokémon species to evolve into
	 * this Pokémon species
	 * @return the minimum affection
	 */
	public Integer getMinAffection() {
		return minAffection;
	}
	/**
	 * Set the minimum required level of affection
	 * the evolving Pokémon species to evolve into
	 * this Pokémon species
	 * @param minAffection the minimum affection
	 */
	public void setMinAffection(Integer minAffection) {
		this.minAffection = minAffection;
	}

	/**
	 * Get whether or not it must be raining in the
	 * overworld to cause evolution this Pokémon species
	 * @return true if it must be raining, false otherwise
	 */
	public Boolean needsOverworldRain() {
		return needsOverworldRain;
	}
	/**
	 * Set whether or not it must be raining in the
	 * overworld to cause evolution this Pokémon species
	 * @param needsOverworldRain true if it must be raining, false otherwise
	 */
	public void setNeedsOverworldRain(Boolean needsOverworldRain) {
		this.needsOverworldRain = needsOverworldRain;
	}

	/**
	 * Get the Pokémon species that must be in the players
	 * party in order for the evolving Pokémon species to
	 * evolve into this Pokémon species
	 * @return the {@link NamedApiResource<PokemonSpecies>} party species
	 */
	public NamedApiResource<PokemonSpecies> getPartySpecies() {
		return partySpecies;
	}
	/**
	 * Set the Pokémon species that must be in the players
	 * party in order for the evolving Pokémon species to
	 * evolve into this Pokémon species
	 * @param partySpecies the {@link NamedApiResource<PokemonSpecies>} party species
	 */
	public void setPartySpecies(NamedApiResource<PokemonSpecies> partySpecies) {
		this.partySpecies = partySpecies;
	}

	/**
	 * Get the player must have a Pokémon of this type in
	 * their party during the evolution trigger event in
	 * order for the evolving Pokémon species to evolve
	 * into this Pokémon species
	 * @return the {@link NamedApiResource<Type>} party type
	 */
	public NamedApiResource<Type> getPartyType() {
		return partyType;
	}
	/**
	 * Set the player must have a Pokémon of this type in
	 * their party during the evolution trigger event in
	 * order for the evolving Pokémon species to evolve
	 * into this Pokémon species
	 * @param partyType the {@link NamedApiResource<Type>} party type
	 */
	public void setPartyType(NamedApiResource<Type> partyType) {
		this.partyType = partyType;
	}

	/**
	 * Get stats the required relation between the Pokémon's
	 * Attack and Defense stats. 1 means Attack > Defense.
	 * 0 means Attack = Defense. -1 means Attack < Defense
	 * @return the relative physical stats
	 */
	public Integer getRelativePhysicalStats() {
		return relativePhysicalStats;
	}
	/**
	 * Set stats the required relation between the Pokémon's
	 * Attack and Defense stats. 1 means Attack > Defense.
	 * 0 means Attack = Defense. -1 means Attack < Defense
	 * @param relativePhysicalStats the relative physical stats
	 */
	public void setRelativePhysicalStats(Integer relativePhysicalStats) {
		this.relativePhysicalStats = relativePhysicalStats;
	}

	/**
	 * Get the required time of day. Day or night
	 * @return the time of day
	 */
	public String getTimeOfDay() {
		return timeOfDay;
	}
	/**
	 * Set the required time of day. Day or night
	 * @param timeOfDay the time of day
	 */
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	/**
	 * Get the Pokémon species for which this one must be traded.
	 * @return the {@link NamedApiResource<PokemonSpecies>} trade species
	 */
	public NamedApiResource<PokemonSpecies> getTradeSpecies() {
		return tradeSpecies;
	}
	/**
	 * Set the Pokémon species for which this one must be traded.
	 * @param tradeSpecies the {@link NamedApiResource<PokemonSpecies>} trade species
	 */
	public void setTradeSpecies(NamedApiResource<PokemonSpecies> tradeSpecies) {
		this.tradeSpecies = tradeSpecies;
	}

	/**
	 * Get whether or not the 3DS needs to be turned
	 * upside-down as this Pokémon levels up
	 * @return true if the 3DS needs to be turned upside-down, false otherwise
	 */
	public Boolean isTurnUpsideDown() {
		return turnUpsideDown;
	}
	/**
	 * Set whether or not the 3DS needs to be turned
	 * upside-down as this Pokémon levels up
	 * @param turnUpsideDown true if the 3DS needs to be turned upside-down, false otherwise
	 */
	public void setTurnUpsideDown(Boolean turnUpsideDown) {
		this.turnUpsideDown = turnUpsideDown;
	}

	/**
	 * Checks whether the EvolutionDetail is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EvolutionDetail that)) return false;
        return Objects.equals(getItem(), that.getItem()) && Objects.equals(getTrigger(), that.getTrigger()) && Objects.equals(getGender(), that.getGender()) && Objects.equals(getHeldItem(), that.getHeldItem()) && Objects.equals(getKnownMove(), that.getKnownMove()) && Objects.equals(getKnownMoveType(), that.getKnownMoveType()) && Objects.equals(getLocation(), that.getLocation()) && Objects.equals(getMinLevel(), that.getMinLevel()) && Objects.equals(getMinHappiness(), that.getMinHappiness()) && Objects.equals(getMinBeauty(), that.getMinBeauty()) && Objects.equals(getMinAffection(), that.getMinAffection()) && Objects.equals(needsOverworldRain(), that.needsOverworldRain()) && Objects.equals(getPartySpecies(), that.getPartySpecies()) && Objects.equals(getPartyType(), that.getPartyType()) && Objects.equals(getRelativePhysicalStats(), that.getRelativePhysicalStats()) && Objects.equals(getTimeOfDay(), that.getTimeOfDay()) && Objects.equals(getTradeSpecies(), that.getTradeSpecies()) && Objects.equals(isTurnUpsideDown(), that.isTurnUpsideDown());
	}

	/**
	 * Generate a hash code for the EvolutionDetail
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getItem(), getTrigger(), getGender(), getHeldItem(), getKnownMove(), getKnownMoveType(), getLocation(), getMinLevel(), getMinHappiness(), getMinBeauty(), getMinAffection(), needsOverworldRain(), getPartySpecies(), getPartyType(), getRelativePhysicalStats(), getTimeOfDay(), getTradeSpecies(), isTurnUpsideDown());
	}

	/**
	 * Returns a string representation of the EvolutionDetail
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "EvolutionDetail{" +
				"item=" + item +
				", trigger=" + trigger +
				", gender=" + gender +
				", heldItem=" + heldItem +
				", knownMove=" + knownMove +
				", knownMoveType=" + knownMoveType +
				", location=" + location +
				", minLevel=" + minLevel +
				", minHappiness=" + minHappiness +
				", minBeauty=" + minBeauty +
				", minAffection=" + minAffection +
				", needsOverworldRain=" + needsOverworldRain +
				", partySpecies=" + partySpecies +
				", partyType=" + partyType +
				", relativePhysicalStats=" + relativePhysicalStats +
				", timeOfDay='" + timeOfDay + '\'' +
				", tradeSpecies=" + tradeSpecies +
				", turnUpsideDown=" + turnUpsideDown +
				'}';
	}
}
