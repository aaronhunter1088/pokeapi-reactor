package skaro.pokeapi.resource.item;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

/**
 * Represents the details of an item held by a Pokémon
 * in a specific version
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class ItemHolderPokemonVersionDetail {

    private Integer rarity;
    private NamedApiResource<Version> version;

    /**
     * Get how often this Pokémon holds
     * this item in this version
     *
     * @return the rarity
     */
    public Integer getRarity() {
        return rarity;
    }

    /**
     * Set how often this Pokémon holds
     * this item in this version
     *
     * @param rarity the rarity to set
     */
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    /**
     * Get the version that this item is held in by the Pokémon
     *
     * @return the {@link Version} version
     */
    public NamedApiResource<Version> getVersion() {
        return version;
    }

    /**
     * Set the version that this item is held in by the Pokémon
     *
     * @param version the {@link Version} version to set
     */
    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ItemHolderPokemonVersionDetail
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemHolderPokemonVersionDetail that)) return false;
        return Objects.equals(getRarity(), that.getRarity()) && Objects.equals(getVersion(), that.getVersion());
    }

    /**
     * Returns the hash code of the ItemHolderPokemonVersionDetail
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRarity(), getVersion());
    }

    /**
     * Returns a string representation of the ItemHolderPokemonVersionDetail
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ItemHolderPokemonVersionDetail{" +
                "rarity=" + rarity +
                ", version=" + version +
                '}';
    }
}
