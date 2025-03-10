package skaro.pokeapi.resource.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.moveailment.MoveAilment;
import skaro.pokeapi.resource.movecategory.MoveCategory;

import java.util.Objects;

public class MoveMetaData {

	private NamedApiResource<MoveAilment> ailment;
	private NamedApiResource<MoveCategory> category;
	@JsonProperty("min_hits")
	private Integer minHits;
	@JsonProperty("max_hits")
	private Integer maxHits;
	@JsonProperty("min_turns")
	private Integer minTurns;
	@JsonProperty("max_turns")
	private Integer maxTurns;
	private Integer drain;
	private Integer healing;
	@JsonProperty("crit_rate")
	private Integer critRate;
	@JsonProperty("ailment_chance")
	private Integer ailmentChance;
	@JsonProperty("flinch_chance")
	private Integer flinchChance;
	@JsonProperty("stat_chance")
	private Integer statChance;

	/**
	 * Get the status ailment this move inflicts on its target
	 * @return a {@link NamedApiResource} object
	 */
	public NamedApiResource<MoveAilment> getAilment() {
		return ailment;
	}
	/**
	 * Set the status ailment this move inflicts on its target
	 * @param ailment a {@link NamedApiResource} object
	 */
	public void setAilment(NamedApiResource<MoveAilment> ailment) {
		this.ailment = ailment;
	}

	/**
	 * Get the category of move this move falls under, e.g. damage or ailment
	 * @return a {@link NamedApiResource} object
	 */
	public NamedApiResource<MoveCategory> getCategory() {
		return category;
	}
	/**
	 * Set the category of move this move falls under, e.g. damage or ailment
	 * @param category a {@link NamedApiResource} object
	 */
	public void setCategory(NamedApiResource<MoveCategory> category) {
		this.category = category;
	}

	/**
	 * Get the minimum number of times this move hits.
	 * Null if it always only hits once
	 * @return an integer representing the minimum number of hits
	 */
	public Integer getMinHits() {
		return minHits;
	}
	/**
	 * Set the minimum number of times this move hits.
	 * @param minHits an integer representing the minimum number of hits
	 */
	public void setMinHits(Integer minHits) {
		this.minHits = minHits;
	}

	/**
	 * Get the maximum number of times this move hits.
	 * Null if it always only hits once
	 * @return an integer representing the maximum number of hits
	 */
	public Integer getMaxHits() {
		return maxHits;
	}
	/**
	 * Set the maximum number of times this move hits.
	 * @param maxHits an integer representing the maximum number of hits
	 */
	public void setMaxHits(Integer maxHits) {
		this.maxHits = maxHits;
	}

	/**
	 * Get the minimum number of turns this move continues to take effect.
	 * Null if it always only lasts one turn
	 * @return an integer representing the minimum number of turns
	 */
	public Integer getMinTurns() {
		return minTurns;
	}
	/**
	 * Set the minimum number of turns this move continues to take effect.
	 * @param minTurns an integer representing the minimum number of turns
	 */
	public void setMinTurns(Integer minTurns) {
		this.minTurns = minTurns;
	}

	/**
	 * Get the maximum number of turns this move continues to take effect.
	 * Null if it always only lasts one turn
	 * @return an integer representing the maximum number of turns
	 */
	public Integer getMaxTurns() {
		return maxTurns;
	}
	/**
	 * Set the maximum number of turns this move continues to take effect.
	 * @param maxTurns an integer representing the maximum number of turns
	 */
	public void setMaxTurns(Integer maxTurns) {
		this.maxTurns = maxTurns;
	}

	/**
	 * HP drain (if positive) or Recoil damage
	 * (if negative), in percent of damage done
	 * @return an integer representing the amount of drain
	 */
	public Integer getDrain() {
		return drain;
	}
	/**
	 * Set the amount of HP drain (if positive) or Recoil damage
	 * @param drain an integer representing the amount of drain
	 */
	public void setDrain(Integer drain) {
		this.drain = drain;
	}

	/**
	 * Get the amount of hp gained by the attacking
	 * Pokemon, in percent of it's maximum HP
	 * @return an integer representing the amount of healing
	 */
	public Integer getHealing() {
		return healing;
	}
	/**
	 * Set the amount of hp gained by the attacking
	 * @param healing an integer representing the amount of healing
	 */
	public void setHealing(Integer healing) {
		this.healing = healing;
	}

	/**
	 * Get the critical hit rate bonus
	 * @return an integer representing the critical hit rate bonus
	 */
	public Integer getCritRate() {
		return critRate;
	}
	/**
	 * Set the critical hit rate bonus
	 * @param critRate an integer representing the critical hit rate bonus
	 */
	public void setCritRate(Integer critRate) {
		this.critRate = critRate;
	}

	/**
	 * Get the likelihood this attack will cause an ailment
	 * @return the likelihood this attack will cause an ailment
	 */
	public Integer getAilmentChance() {
		return ailmentChance;
	}
	/**
	 * Set the likelihood this attack will cause an ailment
	 * @param ailmentChance the likelihood this attack will cause an ailment
	 */
	public void setAilmentChance(Integer ailmentChance) {
		this.ailmentChance = ailmentChance;
	}

	/**
	 * Get the likelihood this attack will
	 * cause the target  Pokémon to flinch
	 * @return the likelihood this attack
	 * will cause the target  Pokémon to flinch
	 */
	public Integer getFlinchChance() {
		return flinchChance;
	}
	/**
	 * Set the likelihood this attack will
	 * cause the target  Pokémon to flinch
	 * @param flinchChance the likelihood this
	 * attack will cause the target  Pokémon to flinch
	 */
	public void setFlinchChance(Integer flinchChance) {
		this.flinchChance = flinchChance;
	}

	/**
	 * Get the likelihood this attack will
	 * cause a stat change in the target Pokémon
	 * @return the likelihood this attack will
	 */
	public Integer getStatChance() {
		return statChance;
	}
	/**
	 * Set the likelihood this attack will
	 * @param statChance the likelihood this attack will
	 */
	public void setStatChance(Integer statChance) {
		this.statChance = statChance;
	}

	/**
	 * Checks whether the MoveMetaData is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof MoveMetaData that)) return false;
        return Objects.equals(getAilment(), that.getAilment()) && Objects.equals(getCategory(), that.getCategory()) && Objects.equals(getMinHits(), that.getMinHits()) && Objects.equals(getMaxHits(), that.getMaxHits()) && Objects.equals(getMinTurns(), that.getMinTurns()) && Objects.equals(getMaxTurns(), that.getMaxTurns()) && Objects.equals(getDrain(), that.getDrain()) && Objects.equals(getHealing(), that.getHealing()) && Objects.equals(getCritRate(), that.getCritRate()) && Objects.equals(getAilmentChance(), that.getAilmentChance()) && Objects.equals(getFlinchChance(), that.getFlinchChance()) && Objects.equals(getStatChance(), that.getStatChance());
	}

	/**
	 * Calculate the hash code of the MoveMetaData
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getAilment(), getCategory(), getMinHits(), getMaxHits(), getMinTurns(), getMaxTurns(), getDrain(), getHealing(), getCritRate(), getAilmentChance(), getFlinchChance(), getStatChance());
	}

	/**
	 * Get the string representation of the MoveMetaData
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "MoveMetaData{" +
				"ailment=" + ailment +
				", category=" + category +
				", minHits=" + minHits +
				", maxHits=" + maxHits +
				", minTurns=" + minTurns +
				", maxTurns=" + maxTurns +
				", drain=" + drain +
				", healing=" + healing +
				", critRate=" + critRate +
				", ailmentChance=" + ailmentChance +
				", flinchChance=" + flinchChance +
				", statChance=" + statChance +
				'}';
	}
}
