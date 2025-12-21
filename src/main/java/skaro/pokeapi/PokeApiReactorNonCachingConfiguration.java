package skaro.pokeapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import skaro.pokeapi.client.PokeApiClient;
import skaro.pokeapi.client.PokeApiEntityFactory;
import skaro.pokeapi.client.ReactiveNonCachingPokeApiClient;

/**
 * Configuration for PokeApi Reactor client without caching support
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
@Configuration
@Import(PokeApiReactorBaseConfiguration.class)
public class PokeApiReactorNonCachingConfiguration {

    @Bean
    public PokeApiClient pokeApiClient(PokeApiEntityFactory entityFactory) {
        return new ReactiveNonCachingPokeApiClient(entityFactory);
    }

}
