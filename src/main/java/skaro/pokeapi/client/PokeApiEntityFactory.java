package skaro.pokeapi.client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import skaro.pokeapi.query.PageQuery;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.NamedApiResourceList;
import skaro.pokeapi.resource.PokeApiResource;

import java.util.List;

/**
 * Factory interface for creating PokeApi entities
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public interface PokeApiEntityFactory {

    <T extends PokeApiResource> Mono<T> getResource(Class<T> resourceClass, String nameOrId);

    <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getBaseResource(Class<T> resourceClass);

    <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getBaseResource(Class<T> resourceClass, PageQuery query);

    <T extends PokeApiResource> Mono<T> getNamedResource(NamedApiResource<T> resource, Class<T> resourceClass);

    <T extends PokeApiResource> Flux<T> getNamedResources(List<NamedApiResource<T>> resources, Class<T> resourceClass);

}
