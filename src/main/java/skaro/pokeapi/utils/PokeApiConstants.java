package skaro.pokeapi.utils;

/**
 * Constants used in PokeApi module.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record PokeApiConstants()
{
    public static final String CONFIGURATION_PROPERTIES_PREFIX = "skaro.pokeapi";
    public static final String POKEAPI_WEBCLIENT_BEAN = "pokeapiWebClientBean";
    public static final String POKEAPI_JSON_DECODER_BEAN = "pokeapiDecoderBean";
    public static final String POKEAPI_JSON_ENCODER_BEAN = "pokeapiEncoderBean";
    public static final String CACHE_FACADE_BEAN = "pokeApiReactorCacheFacade";

    // Endpoint name constants
    public static final String ABILITY_API = "ability";
    public static final String BERRY_API = "berry";
    public static final String BERRY_FIRMNESS_API = "berry-firmness";
    public static final String BERRY_FLAVOR_API = "berry-flavor";
    public static final String CHARACTERISTIC_API = "characteristic";
    public static final String CONTEST_EFFECT_API = "contest-effect";
    public static final String CONTEST_TYPE_API = "contest-type";
    public static final String EGG_GROUP_API = "egg-group";
    public static final String ENCOUNTER_CONDITION_API = "encounter-condition";
    public static final String ENCOUNTER_CONDITION_VALUE_API = "encounter-condition-value";
    public static final String ENCOUNTER_METHOD_API = "encounter-method";
    public static final String EVOLUTION_CHAIN_API = "evolution-chain";
    public static final String EVOLUTION_TRIGGER_API = "evolution-trigger";
    public static final String GENDER_API = "gender";
    public static final String GENERATION_API = "generation";
    public static final String GROWTH_RATE_API = "growth-rate";
    public static final String ITEM_API = "item";
    public static final String ITEM_ATTRIBUTE_API = "item-attribute";
    public static final String ITEM_CATEGORY_API = "item-category";
    public static final String ITEM_FLING_EFFECT_API = "item-fling-effect";
    public static final String ITEM_POCKET_API = "item-pocket";
    public static final String LANGUAGE_API = "language";
    public static final String LOCATION_API = "location";
    public static final String LOCATION_AREA_API = "location-area";
    public static final String MACHINE_API = "machine";
    public static final String MOVE_API = "move";
    public static final String MOVE_AILMENT_API = "move-ailment";
    public static final String MOVE_BATTLE_STYLE_API = "move-battle-style";
    public static final String MOVE_CATEGORY_API = "move-category";
    public static final String MOVE_DAMAGE_CLASS_API = "move-damage-class";
    public static final String MOVE_LEARN_METHOD_API = "move-learn-method";
    public static final String MOVE_TARGET_API = "move-target";
    public static final String NATURE_API = "nature";
    public static final String PAL_PARK_AREA_API = "pal-park-area";
    public static final String POKEATHLON_STAT_API = "pokeathlon-stat";
    public static final String POKEDEX_API = "pokedex";
    public static final String POKEMON_API = "pokemon";
    public static final String POKEMON_COLOR_API = "pokemon-color";
    public static final String POKEMON_FORM_API = "pokemon-form";
    public static final String POKEMON_HABITAT_API = "pokemon-habitat";
    public static final String POKEMON_SHAPE_API = "pokemon-shape";
    public static final String POKEMON_SPECIES_API = "pokemon-species";
    public static final String REGION_API = "region";
    public static final String STAT_API = "stat";
    public static final String SUPER_CONTEST_EFFECT_API = "super-contest-effect";
    public static final String TYPE_API = "type";
    public static final String VERSION_API = "version";
    public static final String VERSION_GROUP_API = "version-group";

    // Existing URLs
    public static final String BERRY_FLAVOR_API_URL = "https://pokeapi.co/api/v2/berry/berry-flavor";

    public static final String POKEMON_API_URL = "https://pokeapi.co/api/v2/pokemon?limit=10&offset=0";

}
