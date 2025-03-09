package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.stat.Stat;

import java.util.Objects;

public class PokemonStat {

	private NamedApiResource<Stat> stat;
	private Integer effort;
	private Integer baseStat;

	/**
	 * Get the stat the Pokémon has
	 * @return the {@link Stat} the Pokémon has
	 */
	public NamedApiResource<Stat> getStat() {
		return stat;
	}
	/**
	 * Set the stat the Pokémon has
	 * @param stat the {@link Stat} the Pokémon has
	 */
	public void setStat(NamedApiResource<Stat> stat) {
		this.stat = stat;
	}

	/**
	 * Get the effort points (EV) the Pokémon has in the stat
	 * @return the effort
	 */
	public Integer getEffort() {
		return effort;
	}
	/**
	 * Set the effort points (EV) the Pokémon has in the stat
	 * @param effort the effort
	 */
	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	/**
	 * Get the base value of the stat
	 * @return the baseStat
	 */
	public Integer getBaseStat() {
		return baseStat;
	}
	/**
	 * Set the base value of the stat
	 * @param baseStat the baseStat
	 */
	public void setBaseStat(Integer baseStat) {
		this.baseStat = baseStat;
	}

	/**
	 * Check if this PokemonStat is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonStat that)) return false;
        return Objects.equals(getStat(), that.getStat()) && Objects.equals(getEffort(), that.getEffort()) && Objects.equals(getBaseStat(), that.getBaseStat());
	}

	/**
	 * Generate a hash code for this PokemonStat
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getStat(), getEffort(), getBaseStat());
	}

	/**
	 * Get a String representation of this PokemonStat
	 * @return the String representation
	 */
	@Override
	public String toString() {
		return "PokemonStat{" +
				"stat=" + stat +
				", effort=" + effort +
				", baseStat=" + baseStat +
				'}';
	}
}
