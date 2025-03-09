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

	/** Gets the id of the Move */
	public Integer getId() {
		return id;
	}
	/** Sets the id of the Move */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Gets the name of the Move */
	public String getName() {
		return name;
	}
	/** Sets the name of the Move */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the accuracy of the Move */
	public Integer getAccuracy() {
		return accuracy;
	}
	/** Sets the accuracy of the Move */
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	/** Gets the effect chance of the Move */
	public Integer getEffectChance() {
		return effectChance;
	}
	/** Sets the effect chance of the Move */
	public void setEffectChance(Integer effectChance) {
		this.effectChance = effectChance;
	}

	/** Gets the power points of the Move */
	public Integer getPowerPoints() {
		return powerPoints;
	}
	/** Sets the power points of the Move */
	public void setPowerPoints(Integer powerPoints) {
		this.powerPoints = powerPoints;
	}

	/** Gets the priority of the Move */
	public Integer getPriority() {
		return priority;
	}
	/** Sets the priority of the Move */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/** Gets the power of the Move */
	public Integer getPower() {
		return power;
	}
	/** Sets the power of the Move */
	public void setPower(Integer power) {
		this.power = power;
	}

	/** Gets the contest combos of the Move */
	public ContestComboSets getContestCombos() {
		return contestCombos;
	}
	/** Sets the contest combos of the Move */
	public void setContestCombos(ContestComboSets contestCombos) {
		this.contestCombos = contestCombos;
	}

	/** Gets the contest type of the Move */
	public NamedApiResource<ContestType> getContestType() {
		return contestType;
	}
	/** Sets the contest type of the Move */
	public void setContestType(NamedApiResource<ContestType> contestType) {
		this.contestType = contestType;
	}

	/** Gets the contest effect of the Move */
	public NamedApiResource<ContestEffect> getContestEffect() {
		return contestEffect;
	}
	/** Sets the contest effect of the Move */
	public void setContestEffect(NamedApiResource<ContestEffect> contestEffect) {
		this.contestEffect = contestEffect;
	}

	/** Gets the damage class of the Move */
	public NamedApiResource<MoveDamageClass> getDamageClass() {
		return damageClass;
	}
	/** Sets the damage class of the Move */
	public void setDamageClass(NamedApiResource<MoveDamageClass> damageClass) {
		this.damageClass = damageClass;
	}

	/** Gets the effect entries of the Move */
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	/** Sets the effect entries of the Move */
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	/** Gets the effect changes of the Move */
	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}
	/** Sets the effect changes of the Move */
	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}

	/** Gets the flavor text entries of the Move */
	public List<MoveFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	/** Sets the flavor text entries of the Move */
	public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	/** Gets the generation of the Move */
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	/** Sets the generation of the Move */
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}

	/** Gets the machines that teach the Move */
	public List<MachineVersionDetail> getMachines() {
		return machines;
	}
	/** Sets the machines that teach the Move */
	public void setMachines(List<MachineVersionDetail> machines) {
		this.machines = machines;
	}

	/** Gets the meta data of the Move */
	public MoveMetaData getMeta() {
		return meta;
	}
	/** Sets the meta data of the Move */
	public void setMeta(MoveMetaData meta) {
		this.meta = meta;
	}

	/** Gets the name of this resource listed in different languages */
	public List<Name> getNames() {
		return names;
	}
	/** Sets the name of this resource listed in different languages */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/** Gets the past values of the Move */
	public List<PastMoveStatValues> getPastValues() {
		return pastValues;
	}
	/** Sets the past values of the Move */
	public void setPastValues(List<PastMoveStatValues> pastValues) {
		this.pastValues = pastValues;
	}

	/** Gets the stat changes of the Move */
	public List<MoveStatChange> getStatChanges() {
		return statChanges;
	}
	/** Sets the stat changes of the Move */
	public void setStatChanges(List<MoveStatChange> statChanges) {
		this.statChanges = statChanges;
	}

	/** Gets the super contest effect of the Move */
	public NamedApiResource<SuperContestEffect> getSuperContestEffect() {
		return superContestEffect;
	}
	/** Sets the super contest effect of the Move */
	public void setSuperContestEffect(NamedApiResource<SuperContestEffect> superContestEffect) {
		this.superContestEffect = superContestEffect;
	}

	/** Gets the target of the Move */
	public NamedApiResource<MoveTarget> getTarget() {
		return target;
	}
	/** Sets the target of the Move */
	public void setTarget(NamedApiResource<MoveTarget> target) {
		this.target = target;
	}

	/** Gets the type of the Move */
	public NamedApiResource<Type> getType() {
		return type;
	}
	/** Sets the type of the Move */
	public void setType(NamedApiResource<Type> type) {
		this.type = type;
	}

	/** Returns whether the Move is equal to another object */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Move move)) return false;
        return Objects.equals(getId(), move.getId()) && Objects.equals(getName(), move.getName()) && Objects.equals(getAccuracy(), move.getAccuracy()) && Objects.equals(getEffectChance(), move.getEffectChance()) && Objects.equals(getPowerPoints(), move.getPowerPoints()) && Objects.equals(getPriority(), move.getPriority()) && Objects.equals(getPower(), move.getPower()) && Objects.equals(getContestCombos(), move.getContestCombos()) && Objects.equals(getContestType(), move.getContestType()) && Objects.equals(getContestEffect(), move.getContestEffect()) && Objects.equals(getDamageClass(), move.getDamageClass()) && Objects.equals(getEffectEntries(), move.getEffectEntries()) && Objects.equals(getEffectChanges(), move.getEffectChanges()) && Objects.equals(getFlavorTextEntries(), move.getFlavorTextEntries()) && Objects.equals(getGeneration(), move.getGeneration()) && Objects.equals(getMachines(), move.getMachines()) && Objects.equals(getMeta(), move.getMeta()) && Objects.equals(getNames(), move.getNames()) && Objects.equals(getPastValues(), move.getPastValues()) && Objects.equals(getStatChanges(), move.getStatChanges()) && Objects.equals(getSuperContestEffect(), move.getSuperContestEffect()) && Objects.equals(getTarget(), move.getTarget()) && Objects.equals(getType(), move.getType());
	}

	/** Returns the hash code of the Move */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getAccuracy(), getEffectChance(), getPowerPoints(), getPriority(), getPower(), getContestCombos(), getContestType(), getContestEffect(), getDamageClass(), getEffectEntries(), getEffectChanges(), getFlavorTextEntries(), getGeneration(), getMachines(), getMeta(), getNames(), getPastValues(), getStatChanges(), getSuperContestEffect(), getTarget(), getType());
	}

	/** Returns the string representation of the Move */
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
