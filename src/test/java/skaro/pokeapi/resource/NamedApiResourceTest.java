package skaro.pokeapi.resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import skaro.pokeapi.resource.pokemon.Pokemon;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static skaro.pokeapi.utils.PokeApiConstants.*;

/**
 * Tests for the {@link NamedApiResource} resource
 *
 * @author michael ball
 * @since 2.0.0
 */
public class NamedApiResourceTest {

    @Test
    @DisplayName("Test NamedApiResource is created")
    void testNamedApiResourceIsCreated()
    {
        NamedApiResource<?> unknownResource
                = new NamedApiResource<>();
        assertNotNull(unknownResource, "NamedApiResource should not be null");
        assertNotNull(unknownResource.toString(), "NamedApiResource toString() should not be null");

        NamedApiResource<Pokemon> pokemonResource
                = new NamedApiResource<>(POKEMON_API, POKEMON_API_URL);
        assertNotNull(pokemonResource, "NamedApiResource should not be null");
        assertNotNull(pokemonResource.toString(), "NamedApiResource toString() should not be null");
    }
}
