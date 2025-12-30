package skaro.pokeapi.resource.pokemon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import skaro.pokeapi.utils.ToStringFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the {@link Pokemon} resource
 *
 * @author michael ball
 * @since 2.0.0
 */
@SuppressWarnings("NonAsciiCharacters") // for usage of: é
class PokemonTest
{
    @Test
    @DisplayName("Test Pokémon is created")
    void testPokémonIsCreated()
    {
        Pokemon pokemon = new Pokemon(1, "Bulbasaur", 7, 69, "Green");

        assertNotNull(pokemon.toString());
        assertEquals(1, pokemon.getId(), "Pokémon ID should be 1");
        assertEquals("Bulbasaur", pokemon.getName(), "Pokémon name should be Bulbasaur");
        assertEquals(7, pokemon.height(), "Pokémon height should be 7");
        assertNotNull(pokemon.heightInInches());
        assertEquals(69, pokemon.weight(), "Pokémon weight should be 69");
        assertNotNull(pokemon.weightInPounds());
        assertNotNull(pokemon.pokemonMoveNames());
        assertEquals("Green", pokemon.capitalizedColor());
        assertEquals("28", pokemon.heightInInches(), "Pokémon height in inches should be 28");
        assertEquals("15", pokemon.weightInPounds(), "Pokémon weight in pounds should be approximately 15");
    }

    @Test
    @DisplayName("Test Pokémon != another Pokémon")
    void testPokémonIsNotEqualToAnotherPokemon()
    {
        Pokemon pichu = new Pokemon();

        Pokemon pikachu = new Pokemon("Pikachu");

        assertNotNull(pichu);
        assertNotNull(pikachu);
        assertNotEquals(pichu, pikachu);
    }

    @Test
    @DisplayName("Test Pokémon != 'same' Pokémon")
    void testPokémonNotEqualToSamePokemon()
    {
        Pokemon tommy = new Pokemon(25, "Pikachu", 16, 13);

        Pokemon jimmy = new Pokemon(25, "Pikachu", 16, 13);

        assertNotNull(tommy);
        assertNotNull(jimmy);
        assertNotSame(tommy, jimmy);
    }

    @ParameterizedTest
    @DisplayName("Test Pokémon toString() method")
    @EnumSource(ToStringFormat.class)
    void testToString(ToStringFormat format)
    {
        Pokemon pokemon = new Pokemon(150, "Mewtwo", 79, 269, "Green");

        String basic = pokemon.toString(ToStringFormat.BASIC);
        String detailed = pokemon.toString(ToStringFormat.DETAILED);
        String defaultWithHash = pokemon.toString(ToStringFormat.DEFAULT);

        String expectedString = switch (format) {
            case MINIMAL -> "Pokémon{id=150, name='Mewtwo'}";
            case BASIC -> basic;
            case DETAILED -> detailed;
            case DEFAULT -> defaultWithHash;
        };

        assertEquals(expectedString, pokemon.toString(format));
    }

    @Test
    @DisplayName("Test How Pokémon Are Compared")
    void testHowPokémonAreCompared()
    {
        Pokemon charmander = new Pokemon(4, "Charmander");

        Pokemon charmeleon = new Pokemon(5, "Charmeleon");

        List<Pokemon> pkmnList = new ArrayList<>();
        pkmnList.add(charmeleon);
        pkmnList.add(charmander);

        //pkmnList.sort(Comparator.comparingInt(Pokemon::getId));
        pkmnList.sort(Pokemon::compareTo);

        assertEquals(charmander, pkmnList.get(0), "Charmander should be first after sorting by ID");
        assertEquals(charmeleon, pkmnList.get(1), "Charmeleon should be second after sorting by ID");

        Pokemon flame = new Pokemon(4, "Charmander", "Flame");

        pkmnList.add(flame);
        pkmnList.sort(Pokemon::compareTo);

        assertEquals(flame, pkmnList.get(0), "Flame should be first after sorting by ID and name");
        assertEquals(charmander, pkmnList.get(1), "Charmander should be second after sorting by ID and name");
        assertEquals(charmeleon, pkmnList.get(2), "Charmeleon should be third after sorting by ID and name");
    }

    @ParameterizedTest
    @DisplayName("Test Adjusting Pokémon from Another Pokémon")
    @MethodSource("getParty")
    void testAdjustingPokémonFrom(Pokemon partyPokémon)
    {
        assertNotNull(partyPokémon);
        assertNull(partyPokémon.nickname(), "Pokémon nickname should be null");
        int id = partyPokémon.getId();
        String originalName = partyPokémon.getName();
        int originalHeight = partyPokémon.height();
        int originalWeight = partyPokémon.weight();

        // Pokémon.setNickname no longer works since Pokémon is immutable
        // so we use from() to recreate a new Pokémon with the desired nickname
        Pokemon updated = Pokemon.from(partyPokémon, Map.of("nickname", "Boss"));

        assertEquals("Boss", updated.nickname(), "Pokémon nickname should be 'Boss'");
        assertEquals(partyPokémon.getId(), updated.getId(), "Pokémon ID should match");
        assertEquals(originalName, updated.getName(), "Pokémon name should match");
        assertEquals(originalHeight, updated.height(), "Pokémon height should match");
        assertEquals(originalWeight, updated.weight(), "Pokémon weight should match");
    }
    private static List<Pokemon> getParty()
    {
        List<Pokemon> party = new ArrayList<>();
        party.add(new Pokemon(99, "Kingler", 13, 60));
        party.add(new Pokemon(4, "Charmander", 6, 85));
        party.add(new Pokemon(7, "Squirtle", 5, 90));
        party.add(new Pokemon(25, "Pikachu", 16, 13));
        party.add(new Pokemon(169, "Crobat", 18, 750));
        return party;
    }
}
