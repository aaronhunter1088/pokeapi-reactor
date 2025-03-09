package skaro.pokeapi.resource;

/**
 * A generic type that holds a reference
 * to the name and url of a pokemon resource
 */
public class NamedApiResource<T extends PokeApiResource> {

	private String name;
	private String url;

	/**
	 * Get the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the url
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * Set the url
	 * @param url the url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the string representation of the NamedApiResource
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "NamedApiResource{" +
				"name='" + name + '\'' +
				"url='" + url + '\'' +
				'}';
	}
}
