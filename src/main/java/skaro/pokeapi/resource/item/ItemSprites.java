package skaro.pokeapi.resource.item;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	
}
