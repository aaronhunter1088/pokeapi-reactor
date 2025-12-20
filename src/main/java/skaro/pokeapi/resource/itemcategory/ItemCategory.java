package skaro.pokeapi.resource.itemcategory;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.itempocket.ItemPocket;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class ItemCategory implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<Item>> items;
    private List<Name> names;
    private NamedApiResource<ItemPocket> pocket;

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
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get a list of items that are a part of this category
     *
     * @return a list of {@link Item} items
     */
    public List<NamedApiResource<Item>> getItems() {
        return items;
    }

    /**
     * Set a list of items that are a part of this category
     *
     * @param items a list of {@link Item} items
     */
    public void setItems(List<NamedApiResource<Item>> items) {
        this.items = items;
    }

    /**
     * Get the name of the category in different languages
     *
     * @return a list of {@link Name} objects
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of the category in different languages
     *
     * @param names a list of {@link Name} objects
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get the pocket containing this category
     *
     * @return the {@link ItemPocket} pocket
     */
    public NamedApiResource<ItemPocket> getPocket() {
        return pocket;
    }

    /**
     * Set the pocket containing this category
     *
     * @param pocket the {@link ItemPocket} pocket
     */
    public void setPocket(NamedApiResource<ItemPocket> pocket) {
        this.pocket = pocket;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ItemCategory
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemCategory that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getItems(), that.getItems()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getPocket(), that.getPocket());
    }

    /**
     * Returns the hash code of the ItemCategory
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getItems(), getNames(), getPocket());
    }

    /**
     * Returns a string representation of the ItemCategory
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ItemCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", items=" + items +
                ", names=" + names +
                ", pocket=" + pocket +
                '}';
    }
}
