package skaro.pokeapi.resource.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import skaro.pokeapi.resource.*;
import skaro.pokeapi.resource.evolutionchain.EvolutionChain;
import skaro.pokeapi.resource.itemattribute.ItemAttribute;
import skaro.pokeapi.resource.itemcategory.ItemCategory;
import skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

/**
 * Represents the Item resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class Item implements PokeApiResource, Localizable, Comparable<Item> {

    private Integer id;
    private String name;
    private Integer cost;
    @JsonProperty("fling_power")
    private Integer flingPower;
    @JsonProperty("fling_effect")
    private NamedApiResource<ItemFlingEffect> flingEffect;
    private List<NamedApiResource<ItemAttribute>> attributes;
    private NamedApiResource<ItemCategory> category;
    @JsonProperty("effect_entries")
    private List<VerboseEffect> effectEntries;
    @JsonProperty("flavor_text_entries")
    private List<VersionGroupFlavorText> flavorTextEntries;
    @JsonProperty("game_indices")
    private List<GenerationGameIndex> gameIndices;
    private List<Name> names;
    private ItemSprites sprites;
    @JsonProperty("held_by_pokemon")
    private List<ItemHolderPokemon> heldByPokemon;
    @JsonProperty("baby_trigger_for")
    private NamedApiResource<EvolutionChain> babyTriggerFor;
    private List<MachineVersionDetail> machines;

    /**
     * Get the id
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name of this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the price of this item in stores
     *
     * @return the cost
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * Set the price of this item in stores
     *
     * @param cost the cost
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * Get the power of the move Fling when
     * used with this item
     *
     * @return the flingPower
     */
    public Integer getFlingPower() {
        return flingPower;
    }

    /**
     * Set the power of the move Fling when
     * used with this item
     *
     * @param flingPower the flingPower
     */
    public void setFlingPower(Integer flingPower) {
        this.flingPower = flingPower;
    }

    /**
     * Gets the fling effect of the Item
     *
     * @return the {@link ItemFlingEffect} fling effect of the Item
     */
    public NamedApiResource<ItemFlingEffect> getFlingEffect() {
        return flingEffect;
    }

    /**
     * Sets the fling effect of the Item
     *
     * @param flingEffect the {@link ItemFlingEffect} fling effect of the Item
     */
    public void setFlingEffect(NamedApiResource<ItemFlingEffect> flingEffect) {
        this.flingEffect = flingEffect;
    }

    /**
     * Get a list of attributes this item has
     *
     * @return a list of {@link ItemAttribute} attributes
     */
    public List<NamedApiResource<ItemAttribute>> getAttributes() {
        return attributes;
    }

    /**
     * Set a list of attributes this item has
     *
     * @param attributes a list of {@link ItemAttribute} attributes
     */
    public void setAttributes(List<NamedApiResource<ItemAttribute>> attributes) {
        this.attributes = attributes;
    }

    /**
     * Get the category of items this item falls into
     *
     * @return the {@link ItemCategory} category
     */
    public NamedApiResource<ItemCategory> getCategory() {
        return category;
    }

    /**
     * Set the category of items this item falls into
     *
     * @param category the {@link ItemCategory} category
     */
    public void setCategory(NamedApiResource<ItemCategory> category) {
        this.category = category;
    }

    /**
     * Get the effect of this ability listed in different languages
     *
     * @return list of {@link VerboseEffect} verboseEffects
     */
    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Sets the effect of this ability listed in different languages
     *
     * @param effectEntries list of {@link VerboseEffect} verboseEffects
     */
    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get the flavor text of this ability listed in different languages
     *
     * @return list of {@link VersionGroupFlavorText} flavorTextEntries
     */
    public List<VersionGroupFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Sets the flavor text of this ability listed in different languages
     *
     * @param flavorTextEntries list of {@link VersionGroupFlavorText} flavorTextEntries
     */
    public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get a list of game indices relevant to this item by generation
     *
     * @return a list of {@link GenerationGameIndex} game indices
     */
    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Set a list of game indices relevant to this item by generation
     *
     * @param gameIndices a list of {@link GenerationGameIndex} game indices
     */
    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get the name of this item listed in different languages
     *
     * @return list of {@link Name} names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Sets the names of this item listed in different languages
     *
     * @param names the names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a set of sprites used to depict this item in the game
     *
     * @return the {@link ItemSprites} sprites
     */
    public ItemSprites getSprites() {
        return sprites;
    }

    /**
     * Set a set of sprites used to depict this item in the game
     *
     * @param sprites the {@link ItemSprites} sprites
     */
    public void setSprites(ItemSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * Get a list of Pokémon that might be found
     * in the wild holding this item
     *
     * @return a list of {@link ItemHolderPokemon} heldByPokemon
     */
    public List<ItemHolderPokemon> getHeldByPokemon() {
        return heldByPokemon;
    }

    /**
     * Set a list of Pokémon that might be found
     * in the wild holding this item
     *
     * @param heldByPokemon a list of {@link ItemHolderPokemon} heldByPokemon
     */
    public void setHeldByPokemon(List<ItemHolderPokemon> heldByPokemon) {
        this.heldByPokemon = heldByPokemon;
    }

    /**
     * Get an evolution chain this item requires to
     * produce a bay during mating
     *
     * @return the {@link EvolutionChain} babyTriggerFor
     */
    public NamedApiResource<EvolutionChain> getBabyTriggerFor() {
        return babyTriggerFor;
    }

    /**
     * Set an evolution chain this item requires to
     * produce a bay during mating
     *
     * @param babyTriggerFor the {@link EvolutionChain} babyTriggerFor
     */
    public void setBabyTriggerFor(NamedApiResource<EvolutionChain> babyTriggerFor) {
        this.babyTriggerFor = babyTriggerFor;
    }

    /**
     * Get a list of the machines related to this item
     *
     * @return a list of {@link MachineVersionDetail} machines
     */
    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    /**
     * Set a list of the machines related to this item
     *
     * @param machines a list of {@link MachineVersionDetail} machines
     */
    public void setMachines(List<MachineVersionDetail> machines) {
        this.machines = machines;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Item
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Item item)) return false;
        return Objects.equals(getId(), item.getId()) && Objects.equals(getName(), item.getName()) && Objects.equals(getCost(), item.getCost()) && Objects.equals(getFlingPower(), item.getFlingPower()) && Objects.equals(getFlingEffect(), item.getFlingEffect()) && Objects.equals(getAttributes(), item.getAttributes()) && Objects.equals(getCategory(), item.getCategory()) && Objects.equals(getEffectEntries(), item.getEffectEntries()) && Objects.equals(getFlavorTextEntries(), item.getFlavorTextEntries()) && Objects.equals(getGameIndices(), item.getGameIndices()) && Objects.equals(getNames(), item.getNames()) && Objects.equals(getSprites(), item.getSprites()) && Objects.equals(getHeldByPokemon(), item.getHeldByPokemon()) && Objects.equals(getBabyTriggerFor(), item.getBabyTriggerFor()) && Objects.equals(getMachines(), item.getMachines());
    }

    /**
     * Returns the hash code of the Item
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCost(), getFlingPower(), getFlingEffect(), getAttributes(), getCategory(), getEffectEntries(), getFlavorTextEntries(), getGameIndices(), getNames(), getSprites(), getHeldByPokemon(), getBabyTriggerFor(), getMachines());
    }

    /**
     * Returns a string representation of the Item
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", flingPower=" + flingPower +
                ", flingEffect=" + flingEffect +
                ", attributes=" + attributes +
                ", category=" + category +
                ", effectEntries=" + effectEntries +
                ", flavorTextEntries=" + flavorTextEntries +
                ", gameIndices=" + gameIndices +
                ", names=" + names +
                ", sprites=" + sprites +
                ", heldByPokemon=" + heldByPokemon +
                ", babyTriggerFor=" + babyTriggerFor +
                ", machines=" + machines +
                '}';
    }

    /**
     * Compares the id and name of the item
     *
     * @param item the item to be compared.
     * @return 0 if the id and name are the same, 1 otherwise
     */
    @Override
    public int compareTo(@NotNull Item item) {
        int idCompare = this.getId().compareTo(item.getId());
        if (idCompare == 0)
            return this.getName().compareTo(item.getName());
        return idCompare;
    }
}
