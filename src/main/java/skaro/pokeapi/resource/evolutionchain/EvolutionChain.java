package skaro.pokeapi.resource.evolutionchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;

import java.util.Objects;

public class EvolutionChain implements PokeApiResource {

    private Integer id;
    @JsonProperty("baby_trigger_item")
    private NamedApiResource<Item> babyTriggerItem;
    private ChainLink chain;

    /**
     * Gets the id for this evolution chain resource
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id for this evolution chain resource
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the item that a Pokémon must be holding
     * when leveling up to evolve into a Pokémon in
     * this evolution chain
     */
    public NamedApiResource<Item> getBabyTriggerItem() {
        return babyTriggerItem;
    }

    /**
     * Sets the item that a Pokémon must be holding
     * when leveling up to evolve into a Pokémon in
     * this evolution chain
     */
    public void setBabyTriggerItem(NamedApiResource<Item> babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    /**
     * Gets the chain of Pokémon species that make up this evolution chain
     */
    public ChainLink getChain() {
        return chain;
    }

    /**
     * Sets the chain of Pokémon species that make up this evolution chain
     */
    public void setChain(ChainLink chain) {
        this.chain = chain;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    /**
     * Checks whether the EvolutionChain is equal to another object
     *
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EvolutionChain that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getBabyTriggerItem(), that.getBabyTriggerItem()) && Objects.equals(getChain(), that.getChain());
    }

    /**
     * Generate a hash code for the EvolutionChain
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBabyTriggerItem(), getChain());
    }

    /**
     * Returns a string representation of the EvolutionChain
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "EvolutionChain{" +
                "id=" + id +
                ", babyTriggerItem=" + babyTriggerItem +
                ", chain=" + chain +
                '}';
    }
}
