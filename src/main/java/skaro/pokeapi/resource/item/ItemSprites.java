package skaro.pokeapi.resource.item;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the sprites of an Item
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class ItemSprites {

    private String imageUrl;

    /**
     * Get the default depiction of this item
     *
     * @return the imageUrl
     */
    @JsonProperty("default")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Set the default depiction of this item
     *
     * @param imageUrl the imageUrl to set
     */
    @JsonProperty("default")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of ItemSprites
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemSprites that)) return false;
        return Objects.equals(getImageUrl(), that.getImageUrl());
    }

    /**
     * Returns the hash code of the ItemSprites
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(getImageUrl());
    }

    /**
     * Returns a string representation of the ItemSprites
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "ItemSprites{" +
                "imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
