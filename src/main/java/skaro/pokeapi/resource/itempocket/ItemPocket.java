package skaro.pokeapi.resource.itempocket;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.itemcategory.ItemCategory;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class ItemPocket implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private List<NamedApiResource<ItemCategory>> categories;
    private List<Name> names;

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
     * Get a list of item categories that are relevant to this item pocket
     *
     * @return a list of {@link ItemCategory} objects
     */
    public List<NamedApiResource<ItemCategory>> getCategories() {
        return categories;
    }

    /**
     * Set a list of item categories that are relevant to this item pocket
     *
     * @param categories a list of {@link ItemCategory} objects
     */
    public void setCategories(List<NamedApiResource<ItemCategory>> categories) {
        this.categories = categories;
    }

    /**
     * Get the he name of this resource listed in different languages
     *
     * @return a list of {@link Name} objects
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource listed in different languages
     *
     * @param names a list of {@link Name} objects
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ItemPocket
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemPocket that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getCategories(), that.getCategories()) && Objects.equals(getNames(), that.getNames());
    }

    /**
     * Returns the hash code of the ItemPocket
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCategories(), getNames());
    }

    /**
     * Returns a string representation of the ItemPocket
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ItemPocket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categories=" + categories +
                ", names=" + names +
                '}';
    }
}
