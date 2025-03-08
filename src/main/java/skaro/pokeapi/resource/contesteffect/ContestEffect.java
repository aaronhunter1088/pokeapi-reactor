package skaro.pokeapi.resource.contesteffect;

import java.util.List;

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
	public Integer getJam() {
		return jam;
	}
	public void setJam(Integer jam) {
		this.jam = jam;
	}
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}
	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

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
