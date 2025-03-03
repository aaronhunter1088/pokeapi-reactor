package skaro.pokeapi.resource;

public class NamedApiResource<T extends PokeApiResource> extends ApiResource<T> {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
