package skaro.pokeapi.resource.berry;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import skaro.pokeapi.utils.ToStringFormat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Tests for the {@link Berry} resource
 *
 * @author michael ball
 * @since 2.0.0
 */
public class BerryTest
{
    @Test
    @DisplayName("Test Berry is created")
    void testBerryIsCreated()
    {
        Berry emptyBerry = new Berry();
        assertNotNull(emptyBerry, "Expected emptyBerry to not be null");

        Berry cheri = new Berry("cheri");
        assertNotNull(cheri.toString());
        assertEquals(null, cheri.getId(), "Berry ID should be null");
        assertEquals("cheri", cheri.getName(), "Berry name should be cheri");

        Berry chesto = new Berry(2, "chesto");
        assertNotNull(chesto.toString());
        assertEquals(2, chesto.getId(), "Berry ID should be 1");
        assertEquals("chesto", chesto.getName(), "Berry name should be chesto");

    }

    @Test
    @DisplayName("Test Berry != another Berry")
    void testBerryIsNotEqualToAnotherBerry()
    {
        Berry cheri = new Berry(1, "cheri");
        Berry chesto = new Berry(2, "chesto");

        assertNotNull(cheri);
        assertNotNull(chesto);
        assertNotEquals(cheri, chesto);
    }

    @Test
    @DisplayName("Test Berry != 'same' Berry")
    void testHavingSomeBerryNotEqualToSameBerry()
    {
        Berry cheri = new Berry(1, "cheri");
        Berry chesto = new Berry(1, "chesto");

        assertNotNull(cheri);
        assertNotNull(chesto);
        assertNotSame(cheri, chesto);
    }

    @ParameterizedTest
    @DisplayName("Test Berry toString() method")
    @EnumSource(ToStringFormat.class)
    void testToString(ToStringFormat format)
    {
        Berry cheri = new Berry(1, "cheri");

        String basic = cheri.toString(ToStringFormat.BASIC);
        String detailed = cheri.toString(ToStringFormat.DETAILED);
        String defaultWithHash = cheri.toString(ToStringFormat.DEFAULT);

        String expectedString = switch (format) {
            case MINIMAL -> "Berry{id=1, name='cheri'}";
            case BASIC -> basic;
            case DETAILED -> detailed;
            case DEFAULT -> defaultWithHash;
        };

        assertEquals(expectedString, cheri.toString(format));
    }

    @Test
    @DisplayName("Test How Berries Are Compared")
    void testHowBerriesAreCompared()
    {
        Berry cheri = new Berry(1, "cheri");
        Berry chesto = new Berry(2, "chesto");

        List<Berry> berryList = new ArrayList<>();
        berryList.add(chesto);
        berryList.add(cheri);

        assertEquals(chesto, berryList.get(0), "chesto should be first before sorting by ID");
        assertEquals(cheri, berryList.get(1), "cheri should be second before sorting by ID");

        //berryList.sort(Comparator.comparingInt(Berry::getId));
        berryList.sort(Berry::compareTo);

        assertEquals(cheri, berryList.get(0), "cheri should now be first after sorting by ID");
        assertEquals(chesto, berryList.get(1), "chesto should now be second after sorting by ID");

        Berry pecha = new Berry(3, "pecha");

        berryList.add(pecha);
        berryList.sort(Berry::compareTo);

        assertEquals(cheri, berryList.get(0), "cheri should now be first after sorting by ID");
        assertEquals(chesto, berryList.get(1), "chesto should now be second after sorting by ID");
        assertEquals(pecha, berryList.get(2), "pecha should be third after sorting by ID");
    }
}
