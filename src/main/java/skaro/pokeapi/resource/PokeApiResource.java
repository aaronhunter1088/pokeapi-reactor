package skaro.pokeapi.resource;

/**
 * Inherited by classes that are returned
 * by the NamedApiResourceList and by the
 * NamedApiResourceList itself
 */
public interface PokeApiResource {

	Integer getId();
	String getName();

}
