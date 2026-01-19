package skaro.pokeapi.client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import skaro.pokeapi.query.PageQuery;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.NamedApiResourceList;
import skaro.pokeapi.resource.PokeApiResource;

import java.util.List;
import java.util.function.Supplier;

/**
 * Reactive PokeApi client without caching capabilities.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record ReactiveNonCachingPokeApiClient (
        PokeApiEntityFactory entityFactory
) implements PokeApiClient {

    @Override
    public <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls) {
        return entityFactory.getBaseResource(cls);
    }

    @Override
    public <T extends PokeApiResource> Mono<T> getResource(Class<T> cls, String idOrName) {
        return entityFactory.getResource(cls, idOrName);
    }

    @Override
    public <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls, PageQuery query) {
        return entityFactory.getBaseResource(cls, query);
    }

    @Override
    public <T extends PokeApiResource> Mono<T> followResource(Supplier<NamedApiResource<T>> resourceSupplier, Class<T> cls) {
        return Mono.fromSupplier(resourceSupplier)
                .flatMap(resource -> entityFactory.getNamedResource(resource, cls));
    }

    @Override
    public <T extends PokeApiResource> Flux<T> followResources(Supplier<List<NamedApiResource<T>>> resourcesSupplier, Class<T> cls) {
        return Mono.fromSupplier(resourcesSupplier)
                .flatMapMany(resources -> entityFactory.getNamedResources(resources, cls));
    }

}
