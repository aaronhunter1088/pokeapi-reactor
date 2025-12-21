package skaro.pokeapi.client;

import skaro.pokeapi.resource.PokeApiResource;

import java.util.Collections;
import java.util.Map;

/**
 * Implementation of PokeApiEndpointRegistry that
 * uses a provided map.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record MapEndpointRegistry (
        Map<Class<?>, String> endpoints
) implements PokeApiEndpointRegistry {

    public MapEndpointRegistry(Map<Class<?>, String> endpoints) { this.endpoints = Collections.unmodifiableMap(endpoints); }

    @Override
    public <T extends PokeApiResource> String getEndpoint(Class<T> resource) {
        return endpoints.get(resource);
    }

}
