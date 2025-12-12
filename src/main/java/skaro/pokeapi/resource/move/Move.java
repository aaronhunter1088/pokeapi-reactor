package skaro.pokeapi.resource.move;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.MachineVersionDetail;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.VerboseEffect;
import skaro.pokeapi.resource.ability.AbilityEffectChange;
import skaro.pokeapi.resource.contesteffect.ContestEffect;
import skaro.pokeapi.resource.contesttype.ContestType;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.movedamageclass.MoveDamageClass;
import skaro.pokeapi.resource.movetarget.MoveTarget;
import skaro.pokeapi.resource.pokemon.Pokemon;
import skaro.pokeapi.resource.supercontesteffect.SuperContestEffect;
import skaro.pokeapi.resource.type.Type;
import skaro.pokeapi.utils.locale.Localizable;

public class Move implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer accuracy;
	@JsonProperty("effect_chance")
	private Integer effectChance;
	@JsonProperty("pp")
	private Integer powerPoints;
	private Integer priority;
	private Integer power;
	@JsonProperty("contest_combos")
	private ContestComboSets contestCombos;
	@JsonProperty("contest_type")
	private NamedApiResource<ContestType> contestType;
	@JsonProperty("contest_effect")
	private NamedApiResource<ContestEffect> contestEffect;
	@JsonProperty("damage_class")
	private NamedApiResource<MoveDamageClass> damageClass;
	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;
	@JsonProperty("effect_changes")
	private List<AbilityEffectChange> effectChanges;
	@JsonProperty("flavor_text_entries")
	private List<MoveFlavorText> flavorTextEntries;
	private NamedApiResource<Generation> generation;
	private List<MachineVersionDetail> machines;
	private MoveMetaData meta;
	private List<Name> names;
	@JsonProperty("past_values")
	private List<PastMoveStatValues> pastValues;
	@JsonProperty("stat_changes")
	private List<MoveStatChange> statChanges;
	@JsonProperty("super_contest_effect")
	private NamedApiResource<SuperContestEffect> superContestEffect;
	private NamedApiResource<MoveTarget> target;
	private NamedApiResource<Type> type;
	@JsonProperty("learned_by_pokemon")
	private List<NamedApiResource<Pokemon>> learnedByPokemon;

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
	 * Get the name of this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name of this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the accuracy of the Move
	 * @return the accuracy
	 */
	public Integer getAccuracy() {
		return accuracy;
	}
	/**
	 * Set the accuracy of the Move
	 * @param accuracy the accuracy
	 */
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * Get the effect chance of the Move
	 * @return the effect chance
	 */
	public Integer getEffectChance() {
		return effectChance;
	}
	/**
	 * Set the effect chance of the Move
	 * @param effectChance the effect chance
	 */
	public void setEffectChance(Integer effectChance) {
		this.effectChance = effectChance;
	}

	/**
	 * Get the power points of the Move
	 * @return the power points
	 */
	public Integer getPowerPoints() {
		return powerPoints;
	}
	/**
	 * Set the power points of the Move
	 * @param powerPoints the power points
	 */
	public void setPowerPoints(Integer powerPoints) {
		this.powerPoints = powerPoints;
	}

	/**
	 * Get the priority of the Move
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}
	/**
	 * Set the priority of the Move
	 * @param priority the priority
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * Get the power of the Move
	 * @return the power
	 */
	public Integer getPower() {
		return power;
	}
	/**
	 * Set the power of the Move
	 * @param power the power
	 */
	public void setPower(Integer power) {
		this.power = power;
	}

	/**
	 * Get the contest combos of the Move
	 * @return the {@link ContestComboSets} contest combos
	 */
	public ContestComboSets getContestCombos() {
		return contestCombos;
	}
	/**
	 * Set the contest combos of the Move
	 * @param contestCombos the {@link ContestComboSets} contest combos
	 */
	public void setContestCombos(ContestComboSets contestCombos) {
		this.contestCombos = contestCombos;
	}

	/**
	 * Get the contest type of the Move
	 * @return the {@link ContestType} contest type
	 */
	public NamedApiResource<ContestType> getContestType() {
		return contestType;
	}
	/**
	 * Set the contest type of the Move
	 * @param contestType the {@link ContestType} contest type
	 */
	public void setContestType(NamedApiResource<ContestType> contestType) {
		this.contestType = contestType;
	}

	/**
	 * Get the contest effect of the Move
	 * @return the {@link ContestEffect} contest effect
	 */
	public NamedApiResource<ContestEffect> getContestEffect() {
		return contestEffect;
	}
	/**
	 * Set the contest effect of the Move
	 * @param contestEffect the {@link ContestEffect} contest effect
	 */
	public void setContestEffect(NamedApiResource<ContestEffect> contestEffect) {
		this.contestEffect = contestEffect;
	}

	/**
	 * Get the damage class of the Move
	 * @return the {@link MoveDamageClass} damage class
	 */
	public NamedApiResource<MoveDamageClass> getDamageClass() {
		return damageClass;
	}
	/**
	 * Set the damage class of the Move
	 * @param damageClass the {@link MoveDamageClass} damage class
	 */
	public void setDamageClass(NamedApiResource<MoveDamageClass> damageClass) {
		this.damageClass = damageClass;
	}

	/**
	 * Get the effect entries of the Move
	 * @return the list of {@link VerboseEffect} effect entries
	 */
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	/**
	 * Set the effect entries of the Move
	 * @param effectEntries the list of {@link VerboseEffect} effect entries
	 */
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/**
	 * Get the effect changes of the Move
	 * @return the list of {@link AbilityEffectChange} effect changes
	 */
	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}
	/**
	 * Set the effect changes of the Move
	 * @param effectChanges the list of {@link AbilityEffectChange} effect changes
	 */
	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}

	/**
	 * Get the flavor text entries of the Move
	 * @return the list of {@link MoveFlavorText} flavor text entries
	 */
	public List<MoveFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/**
	 * Set the flavor text entries of the Move
	 * @param flavorTextEntries the list of {@link MoveFlavorText} flavor text entries
	 */
	public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/**
	 * Get the generation of the Move
	 * @return the {@link Generation} generation
	 */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/**
	 * Set the generation of the Move
	 * @param generation the {@link Generation} generation
	 */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/**
	 * Get the machines that teach the Move
	 * @return the list of {@link MachineVersionDetail} machines
	 */
	public List<MachineVersionDetail> getMachines() {
		return machines;
	}
	/**
	 * Set the machines that teach the Move
	 * @param machines the list of {@link MachineVersionDetail} machines
	 */
	public void setMachines(List<MachineVersionDetail> machines) {
		this.machines = machines;
	}

	/**
	 * Get the meta data of the Move
	 * @return the {@link MoveMetaData} meta
	 */
	public MoveMetaData getMeta() {
		return meta;
	}
	/**
	 * Set the meta data of the Move
	 * @param meta the {@link MoveMetaData} meta
	 */
	public void setMeta(MoveMetaData meta) {
		this.meta = meta;
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
	 * Get the past values of the Move
	 * @return the list of {@link PastMoveStatValues} past values
	 */
	public List<PastMoveStatValues> getPastValues() {
		return pastValues;
	}
	/**
	 * Set the past values of the Move
	 * @param pastValues the list of {@link PastMoveStatValues} past values
	 */
	public void setPastValues(List<PastMoveStatValues> pastValues) {
		this.pastValues = pastValues;
	}

	/**
	 * Get the stat changes of the Move
	 * @return the list of {@link MoveStatChange} stat changes
	 */
	public List<MoveStatChange> getStatChanges() {
		return statChanges;
	}
	/**
	 * Set the stat changes of the Move
	 * @param statChanges the list of {@link MoveStatChange} stat changes
	 */
	public void setStatChanges(List<MoveStatChange> statChanges) {
		this.statChanges = statChanges;
	}

	/**
	 * Get the super contest effect of the Move
	 * @return the {@link SuperContestEffect} super contest effect
	 */
	public NamedApiResource<SuperContestEffect> getSuperContestEffect() {
		return superContestEffect;
	}
	/**
	 * Set the super contest effect of the Move
	 * @param superContestEffect the {@link SuperContestEffect} super contest effect
	 */
	public void setSuperContestEffect(NamedApiResource<SuperContestEffect> superContestEffect) {
		this.superContestEffect = superContestEffect;
	}

	/**
	 * Get the target of the Move
	 * @return the {@link MoveTarget} target
	 */
	public NamedApiResource<MoveTarget> getTarget() {
		return target;
	}
	/**
	 * Set the target of the Move
	 * @param target the {@link MoveTarget} target
	 */
	public void setTarget(NamedApiResource<MoveTarget> target) {
		this.target = target;
	}

	/**
	 * Get the type of the Move
	 * @return the {@link Type} type
	 */
	public NamedApiResource<Type> getType() {
		return type;
	}
	/**
	 * Set the type of the Move
	 * @param type the {@link Type} type
	 */
	public void setType(NamedApiResource<Type> type) {
		this.type = type;
	}

	/**
	 * Get a list of Pokémon that can learn moves of this form
	 * @return the list of {@link Pokemon} learnedByPokemon
	 */
	public List<NamedApiResource<Pokemon>> getLearnedByPokemon() {
		return learnedByPokemon;
	}
	/**
	 * Set a list of Pokémon that can learn moves of this form
	 * @param learnedByPokemon the list of {@link Pokemon} learnedByPokemon
	 */
	public void setLearnedByPokemon(List<NamedApiResource<Pokemon>> learnedByPokemon) {
		this.learnedByPokemon = learnedByPokemon;
	}

	/**
	 * Returns whether the given object o is
	 * equal to this instance of Move
	 * @param o the object to compare
	 * @return true if equal otherwise false
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Move move)) return false;
        return Objects.equals(getId(), move.getId()) && Objects.equals(getName(), move.getName()) && Objects.equals(getAccuracy(), move.getAccuracy()) && Objects.equals(getEffectChance(), move.getEffectChance()) && Objects.equals(getPowerPoints(), move.getPowerPoints()) && Objects.equals(getPriority(), move.getPriority()) && Objects.equals(getPower(), move.getPower()) && Objects.equals(getContestCombos(), move.getContestCombos()) && Objects.equals(getContestType(), move.getContestType()) && Objects.equals(getContestEffect(), move.getContestEffect()) && Objects.equals(getDamageClass(), move.getDamageClass()) && Objects.equals(getEffectEntries(), move.getEffectEntries()) && Objects.equals(getEffectChanges(), move.getEffectChanges()) && Objects.equals(getFlavorTextEntries(), move.getFlavorTextEntries()) && Objects.equals(getGeneration(), move.getGeneration()) && Objects.equals(getMachines(), move.getMachines()) && Objects.equals(getMeta(), move.getMeta()) && Objects.equals(getNames(), move.getNames()) && Objects.equals(getPastValues(), move.getPastValues()) && Objects.equals(getStatChanges(), move.getStatChanges()) && Objects.equals(getSuperContestEffect(), move.getSuperContestEffect()) && Objects.equals(getTarget(), move.getTarget()) && Objects.equals(getType(), move.getType());
	}

	/**
	 * Returns the hash code of the Move
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getAccuracy(), getEffectChance(), getPowerPoints(), getPriority(), getPower(), getContestCombos(), getContestType(), getContestEffect(), getDamageClass(), getEffectEntries(), getEffectChanges(), getFlavorTextEntries(), getGeneration(), getMachines(), getMeta(), getNames(), getPastValues(), getStatChanges(), getSuperContestEffect(), getTarget(), getType());
	}

	/**
	 * Returns a string representation of the Move
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "Move{" +
				"id=" + id +
				", name='" + name + '\'' +
				", accuracy=" + accuracy +
				", effectChance=" + effectChance +
				", pp=" + powerPoints +
				", priority=" + priority +
				", power=" + power +
				", contestCombos=" + contestCombos +
				", contestType=" + contestType +
				", contestEffect=" + contestEffect +
				", damageClass=" + damageClass +
				", effectEntries=" + effectEntries +
				", effectChanges=" + effectChanges +
				", flavorTextEntries=" + flavorTextEntries +
				", generation=" + generation +
				", machines=" + machines +
				", meta=" + meta +
				", names=" + names +
				", pastValues=" + pastValues +
				", statChanges=" + statChanges +
				", superContestEffect=" + superContestEffect +
				", target=" + target +
				", type=" + type +
				'}';
	}
}
