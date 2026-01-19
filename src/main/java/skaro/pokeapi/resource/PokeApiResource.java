package skaro.pokeapi.resource;

/**
 * Inherited by classes that are returned
 * by the NamedApiResourceList and by the
 * NamedApiResourceList itself.
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public interface PokeApiResource {

    Integer getId();

    String getName();

}
