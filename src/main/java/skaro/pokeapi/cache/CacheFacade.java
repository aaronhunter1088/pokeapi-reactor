package skaro.pokeapi.cache;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import skaro.pokeapi.resource.PokeApiResource;

import java.util.List;

/**
 * Facade for cache access
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public interface CacheFacade {

    <T extends PokeApiResource> Mono<T> get(CacheSpec<T> cacheSpec);

    <T extends PokeApiResource> Flux<T> getMany(List<CacheSpec<T>> cacheSpecs);

}
