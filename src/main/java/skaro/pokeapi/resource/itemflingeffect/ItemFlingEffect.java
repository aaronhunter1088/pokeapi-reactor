package skaro.pokeapi.resource.itemflingeffect;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Effect;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;

import java.util.List;
import java.util.Objects;

public class ItemFlingEffect implements PokeApiResource {

    private Integer id;
    private String name;
    @JsonProperty("effect_entries")
    private List<Effect> effectEntries;
    private List<NamedApiResource<Item>> items;

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
     * Get the effect entries of this fling effect
     *
     * @return the list of {@link Effect} effect entries
     */
    public List<Effect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Set the effect entries of this fling effect
     *
     * @param effectEntries the list of {@link Effect} effect entries
     */
    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get the items that have this fling effect
     *
     * @return the list of {@link Item} items
     */
    public List<NamedApiResource<Item>> getItems() {
        return items;
    }

    /**
     * Set the items that have this fling effect
     *
     * @param items the list of {@link Item} items
     */
    public void setItems(List<NamedApiResource<Item>> items) {
        this.items = items;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ItemFlingEffect
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemFlingEffect that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getEffectEntries(), that.getEffectEntries()) && Objects.equals(getItems(), that.getItems());
    }

    /**
     * Returns the hash code of the ItemFlingEffect
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEffectEntries(), getItems());
    }

    /**
     * Returns a string representation of the ItemFlingEffect
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ItemFlingEffect{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", effectEntries=" + effectEntries +
                ", items=" + items +
                '}';
    }
}
