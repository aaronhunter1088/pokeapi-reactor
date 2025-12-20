package skaro.pokeapi.client;

import skaro.pokeapi.resource.PokeApiResource;

import java.util.Collections;
import java.util.Map;

public class MapEndpointRegistry implements PokeApiEndpointRegistry {

    private final Map<Class<?>, String> endpoints;

    public MapEndpointRegistry(Map<Class<?>, String> endpoints) {
        this.endpoints = Collections.unmodifiableMap(endpoints);
    }

    @Override
    public <T extends PokeApiResource> String getEndpoint(Class<T> resource) {
        return endpoints.get(resource);
    }

}
