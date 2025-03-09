package skaro.pokeapi.resource.item;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ItemSprites {

	private String imageUrl;

	/** Gets the default image for the item */
	@JsonProperty("default")
	public String getImageUrl() {
		return imageUrl;
	}
	/** Sets the default image for the item */
	@JsonProperty("default")
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Checks whether the ItemSprites is equal to another object
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ItemSprites that)) return false;
        return Objects.equals(getImageUrl(), that.getImageUrl());
	}

	/**
	 * Generate a hash code for the ItemSprites
	 * @return a hash code value for this object
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(getImageUrl());
	}

	/**
	 * Returns a string representation of the ItemSprites
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return "ItemSprites{" +
				"imageUrl='" + imageUrl + '\'' +
				'}';
	}
}
