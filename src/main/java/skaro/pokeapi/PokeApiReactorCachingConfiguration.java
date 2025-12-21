package skaro.pokeapi;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import skaro.pokeapi.cache.CacheFacade;
import skaro.pokeapi.cache.ReactiveCacheManagerCacheFacade;
import skaro.pokeapi.client.PokeApiClient;
import skaro.pokeapi.client.PokeApiEntityFactory;
import skaro.pokeapi.client.ReactiveCachingPokeApiClient;

import static skaro.pokeapi.utils.locale.PokeApiConstants.CACHE_FACADE_BEAN;

/**
 * Configuration for PokeApi Reactor client with caching support.
 *
 * SuppressWarnings("SpringJavaAutowiringInspection") added
 * because cacheFacade will warn us that the cacheManager bean is
 * missing when it is provided later by the consumer.
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
@Configuration
@Import(PokeApiReactorBaseConfiguration.class)
public class PokeApiReactorCachingConfiguration {

    @Bean(CACHE_FACADE_BEAN)
    public CacheFacade cacheFacade(CacheManager cacheManager) {
        return new ReactiveCacheManagerCacheFacade(cacheManager);
    }

    @Bean
    public PokeApiClient pokeApiClient(PokeApiEntityFactory entityFactory, CacheFacade cacheFacade) {
        return new ReactiveCachingPokeApiClient(entityFactory, cacheFacade);
    }

}
