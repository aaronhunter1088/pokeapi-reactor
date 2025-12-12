package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.stat.Stat;

import java.util.Objects;

public class PokemonStat {

	private NamedApiResource<Stat> stat;
	private Integer effort;
	@JsonProperty("base_stat")
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
	 * Returns whether the given object o is
	 * equal to this instance of PokemonStat
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonStat that)) return false;
        return Objects.equals(getStat(), that.getStat()) && Objects.equals(getEffort(), that.getEffort()) && Objects.equals(getBaseStat(), that.getBaseStat());
	}

	/**
	 * Returns the hash code of the PokemonStat
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getStat(), getEffort(), getBaseStat());
	}

	/**
	 * Returns a string representation of the PokemonStat
	 * @return the string representation
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
