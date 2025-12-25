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
class PokemonTest
{
    @Test
    @DisplayName("Test Pokemon is created")
    void testPokemonIsCreated()
    {
        Pokemon pokemon = new Pokemon(1, "Bulbasaur", 7, 69);

        assertNotNull(pokemon.toString());
        assertEquals(1, pokemon.getId(), "Pokemon ID should be 1");
        assertEquals("Bulbasaur", pokemon.getName(), "Pokemon name should be Bulbasaur");
        assertEquals(7, pokemon.height(), "Pokemon height should be 7");
        assertNotNull(pokemon.heightInInches());
        assertEquals(69, pokemon.weight(), "Pokemon weight should be 69");
        assertNotNull(pokemon.weightInPounds());
        assertNotNull(pokemon.pokemonMoveNames());
    }

    @Test
    @DisplayName("Test Pokemon != another Pokemon")
    void testPokemonIsNotEqualToAnotherPokemon()
    {
        Pokemon pichu = new Pokemon(172, "Pichu", 12, 4);

        Pokemon pikachu = new Pokemon(25, "Pikachu", 16, 13);

        assertNotNull(pichu);
        assertNotNull(pikachu);
        assertNotEquals(pichu, pikachu);
    }

    @Test
    @DisplayName("Test Pokemon != 'same' Pokemon")
    void testHavingSomePokemonNotEqualToSamePokemon()
    {
        Pokemon tommy = new Pokemon(25, "Pikachu", 16, 13);

        Pokemon jimmy = new Pokemon(25, "Pikachu", 16, 13);

        assertNotNull(tommy);
        assertNotNull(jimmy);
        assertNotSame(tommy, jimmy);
    }

    @ParameterizedTest
    @DisplayName("Test Pokemon toString() method")
    @EnumSource(ToStringFormat.class)
    void testToString(ToStringFormat format)
    {
        Pokemon pokemon = new Pokemon(150, "Mewtwo", 79, 269, "Green");

        String basic = pokemon.toString(ToStringFormat.BASIC);
        String detailed = pokemon.toString(ToStringFormat.DETAILED);
        String defaultWithHash = pokemon.toString(ToStringFormat.DEFAULT);

        String expectedString = switch (format) {
            case MINIMAL -> "Pokemon{id=150, name='Mewtwo'}";
            case BASIC -> basic;
            case DETAILED -> detailed;
            case DEFAULT -> defaultWithHash;
        };

        assertEquals(expectedString, pokemon.toString(format));
        assertEquals("Green", pokemon.capitalizedColor());
    }

    @Test
    @DisplayName("Test How Pokemon Are Compared")
    void testHowPokemonAreCompared()
    {
        Pokemon charmander = new Pokemon(4, "Charmander", 6, 85);

        Pokemon charmeleon = new Pokemon(5, "Charmeleon", 11, 190);

        List<Pokemon> pkmnList = new ArrayList<>();
        pkmnList.add(charmeleon);
        pkmnList.add(charmander);

        //pkmnList.sort(Comparator.comparingInt(Pokemon::getId));
        pkmnList.sort(Pokemon::compareTo);

        assertEquals(charmander, pkmnList.get(0), "Charmander should be first after sorting by ID");
        assertEquals(charmeleon, pkmnList.get(1), "Charmeleon should be second after sorting by ID");

        Pokemon flame = new Pokemon(4, "Charmander", "Flame", 5, 65);

        pkmnList.add(flame);
        pkmnList.sort(Pokemon::compareTo);

        assertEquals(flame, pkmnList.get(0), "Flame should be first after sorting by ID and name");
        assertEquals(charmander, pkmnList.get(1), "Charmander should be second after sorting by ID and name");
        assertEquals(charmeleon, pkmnList.get(2), "Charmeleon should be third after sorting by ID and name");
    }

    @ParameterizedTest
    @DisplayName("Test Creating Pokemon from")
    @MethodSource("getParty")
    void testCreatingPokemonFrom(Pokemon partyPokemon)
    {
        assertNotNull(partyPokemon);
        assertNull(partyPokemon.nickname(), "Pokemon nickname should be null");

        Pokemon pokemon = Pokemon.from(partyPokemon, Map.of("nickname", "Boss"));

        assertEquals(partyPokemon.getId(), pokemon.getId(), "Pokemon ID should match");
        assertEquals("Boss", pokemon.nickname(), "Pokemon nickname should be 'Boss'");
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
