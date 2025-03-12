package skaro.pokeapi.resource.contesteffect;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Effect;
import skaro.pokeapi.resource.FlavorText;
import skaro.pokeapi.resource.PokeApiResource;

public class ContestEffect implements PokeApiResource {

	private Integer id;
	private Integer appeal;
	private Integer jam;
	@JsonProperty("effect_entries")
	private List<Effect> effectEntries;
	@JsonProperty("flavor_text_entries")
	private List<FlavorText> flavorTextEntries;

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
	 * Get the base number of hearts the user of this move gets
	 * @return the appeal
	 */
	public Integer getAppeal() {
		return appeal;
	}
	/**
	 * Set the base number of hearts the user of this move gets
	 * @param appeal the appeal
	 */
	public void setAppeal(Integer appeal) {
		this.appeal = appeal;
	}

	/**
	 * Get the base number of hearts the user's opponent loses
	 * @return the jam
	 */
	public Integer getJam() {
		return jam;
	}
	/**
	 * Set the base number of hearts the user's opponent loses
	 * @param jam the jam
	 */
	public void setJam(Integer jam) {
		this.jam = jam;
	}

	/**
	 * Get the result of this contest effect listed in different languages.
	 * @return a list of {@link Effect} objects
	 */
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}
	/**
	 * Set the result of this contest effect listed in different languages
	 * @param effectEntries a list of {@link Effect} objects
	 */
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/**
	 * Get the flavor text of this contest effect listed in different languages
	 * @return a list of {@link FlavorText} objects
	 */
	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/**
	 * Set the flavor text of this contest effect listed in different languages
	 * @param flavorTextEntries a list of {@link FlavorText} objects
	 */
	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/**
	 * Get the name of this class
	 * @return the name
	 */
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of ContestEffect
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ContestEffect that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getAppeal(), that.getAppeal()) && Objects.equals(getJam(), that.getJam()) && Objects.equals(getEffectEntries(), that.getEffectEntries()) && Objects.equals(getFlavorTextEntries(), that.getFlavorTextEntries());
	}

	/**
	 * Returns the hash code of the ContestEffect
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getAppeal(), getJam(), getEffectEntries(), getFlavorTextEntries());
	}

	/**
	 * Returns a string representation of the ContestEffect
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "ContestEffect{" +
				"id=" + id +
				", appeal=" + appeal +
				", jam=" + jam +
				", effectEntries=" + effectEntries +
				", flavorTextEntries=" + flavorTextEntries +
				'}';
	}
}
