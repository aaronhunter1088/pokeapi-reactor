package skaro.pokeapi.resource.ability;

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
 * Tests for the {@link Ability} resource
 *
 * @author michael ball
 * @since 2.0.0
 */
public class AbilityTest
{
    @Test
    @DisplayName("Test Ability is created")
    void testAbilityIsCreated()
    {
        Ability emptyAbility = new Ability();
        assertNotNull(emptyAbility, "Expected Ability to not be null");

        Ability stench = new Ability("stench"); // id: 1
        assertNotNull(stench.toString());
        assertEquals(null, stench.getId(), "Ability ID should be null");
        assertEquals("stench", stench.getName(), "Ability name should be stench");

        Ability drizzle = new Ability(2, "drizzle");
        assertNotNull(drizzle.toString());
        assertEquals(2, drizzle.getId(), "Ability ID should be 2");
        assertEquals("drizzle", drizzle.getName(), "Ability name should be drizzle");
    }

    @Test
    @DisplayName("Test Ability != another Ability")
    void testAbilityIsNotEqualToAnotherAbility()
    {
        Ability stench = new Ability(1, "stench");
        Ability drizzle = new Ability(2, "drizzle");

        assertNotNull(stench);
        assertNotNull(drizzle);
        assertNotEquals(stench, drizzle);
    }

    @Test
    @DisplayName("Test Ability != 'same' Ability")
    void testHavingSomeAbilityNotEqualToSameAbility()
    {
        Ability stench = new Ability(1, "stench");
        Ability drizzle = new Ability(2, "drizzle");

        assertNotNull(stench);
        assertNotNull(drizzle);
        assertNotSame(stench, drizzle);
    }

    @ParameterizedTest
    @DisplayName("Test Ability toString() method")
    @EnumSource(ToStringFormat.class)
    void testToString(ToStringFormat format)
    {
        Ability stench = new Ability(1, "stench");

        String basic = stench.toString(ToStringFormat.BASIC);
        String detailed = stench.toString(ToStringFormat.DETAILED);
        String defaultWithHash = stench.toString(ToStringFormat.DEFAULT);

        String expectedString = switch (format) {
            case MINIMAL -> "Ability{id=1, name='stench'}";
            case BASIC -> basic;
            case DETAILED -> detailed;
            case DEFAULT -> defaultWithHash;
        };

        assertEquals(expectedString, stench.toString(format));
    }

    @Test
    @DisplayName("Test How Abilities Are Compared")
    void testHowAbilitiesAreCompared()
    {
        Ability stench = new Ability(1, "stench");
        Ability drizzle = new Ability(2, "drizzle");

        List<Ability> abilityList = new ArrayList<>();
        abilityList.add(drizzle);
        abilityList.add(stench);

        assertEquals(drizzle, abilityList.get(0), "drizzle should be first before sorting by ID");
        assertEquals(stench, abilityList.get(1), "stench should be second before sorting by ID");

        //abilityList.sort(Comparator.comparingInt(Ability::getId));
        abilityList.sort(Ability::compareTo);

        assertEquals(stench, abilityList.get(0), "stench should now be first after sorting by ID");
        assertEquals(drizzle, abilityList.get(1), "drizzle should now be second after sorting by ID");

        Ability speedBoost = new Ability(3,  "speed-boost");

        abilityList.add(speedBoost);
        abilityList.sort(Ability::compareTo);

        assertEquals(stench, abilityList.get(0), "stench should now be first after sorting by ID");
        assertEquals(drizzle, abilityList.get(1), "drizzle should now be second after sorting by ID");
        assertEquals(speedBoost, abilityList.get(2), "speedBoost should be third after sorting by ID");
    }
}
