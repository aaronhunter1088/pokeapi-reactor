package skaro.pokeapi.resource;

/**
 * Most resources are of type NamedApiResource
 */
public class NamedApiResource<T extends PokeApiResource> {

	private String name;
	private String url;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "NamedApiResource{" +
				"name='" + name + '\'' +
				"url='" + url + '\'' +
				'}';
	}
}
