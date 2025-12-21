package skaro.pokeapi.client;

import skaro.pokeapi.resource.PokeApiResource;

/**
 * Registry for PokeApi endpoints
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public interface PokeApiEndpointRegistry {

    <T extends PokeApiResource> String getEndpoint(Class<T> resource);

}
