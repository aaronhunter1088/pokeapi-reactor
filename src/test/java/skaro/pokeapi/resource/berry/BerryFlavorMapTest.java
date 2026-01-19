package skaro.pokeapi.resource.berry;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.berryflavor.BerryFlavor;
import skaro.pokeapi.utils.ToStringFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static skaro.pokeapi.utils.PokeApiConstants.BERRY_FLAVOR_API;
import static skaro.pokeapi.utils.PokeApiConstants.BERRY_FLAVOR_API_URL;

/**
 * Tests for the {@link BerryFlavorMap} resource
 *
 * @author michael ball
 * @since 2.0.0
 */
public class BerryFlavorMapTest
{
    @Test
    @DisplayName("Test BerryFlavorMap is created")
    void testBerryFlavorMapIsCreated()
    {
        BerryFlavorMap emptyBerryFlavorMap = new BerryFlavorMap();
        assertNotNull(emptyBerryFlavorMap, "No-args BerryFlavorMap should not be null");

        NamedApiResource<BerryFlavor> berryFlavorResource
                = new NamedApiResource<>(BERRY_FLAVOR_API, BERRY_FLAVOR_API_URL);
        BerryFlavorMap berryFlavorMap = new BerryFlavorMap(
                1, berryFlavorResource);

        assertNotNull(berryFlavorMap.toString());
        assertEquals(BERRY_FLAVOR_API, berryFlavorMap.flavor().name(), "BerryFlavor.name should be berry-flavor");
        assertEquals(BERRY_FLAVOR_API_URL, berryFlavorMap.flavor().url(), "BerryFlavor.url may need to be updated");
    }

    @ParameterizedTest
    @DisplayName("Test BerryFlavorMap toString() method")
    @EnumSource(ToStringFormat.class)
    void testToString(ToStringFormat format)
    {
        NamedApiResource<BerryFlavor> berryFlavorResource
                = new NamedApiResource<>(BERRY_FLAVOR_API, BERRY_FLAVOR_API_URL);
        BerryFlavorMap berryFlavorMap = new BerryFlavorMap(
                1, berryFlavorResource);

        String detailed = berryFlavorMap.toString(ToStringFormat.DETAILED);
        String defaultWithHash = berryFlavorMap.toString(ToStringFormat.DEFAULT);
        String expectedString = switch (format) {
            case MINIMAL -> "BerryFlavorMap{potency=1, flavor=NamedApiResource{name='"+ BERRY_FLAVOR_API +"', url='"+ BERRY_FLAVOR_API_URL +"'}}";
            case BASIC -> detailed;
            case DETAILED -> detailed;
            case DEFAULT -> defaultWithHash;
        };

        assertEquals(expectedString, berryFlavorMap.toString(format));
    }
}
