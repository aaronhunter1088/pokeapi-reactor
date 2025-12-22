package skaro.pokeapi.utils;

/**
 * Constants used in PokeApi module.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record PokeApiConstants() {

    public static final String CONFIGURATION_PROPERTIES_PREFIX = "skaro.pokeapi";
    public static final String POKEAPI_WEBCLIENT_BEAN = "pokeapiWebClientBean";
    public static final String POKEAPI_JSON_DECODER_BEAN = "pokeapiDecoderBean";
    public static final String POKEAPI_JSON_ENCODER_BEAN = "pokeapiEncoderBean";
    public static final String CACHE_FACADE_BEAN = "pokeApiReactorCacheFacade";

    public static final String BERRY_FLAVOR_API_NAME = "berry-flavor";
    public static final String BERRY_FLAVOR_API_URL = "https://pokeapi.co/api/v2/berry/berry-flavor";

    public static final String POKEMON_API_NAME = "pokemon";
    public static final String POKEMON_API_URL = "https://pokeapi.co/api/v2/pokemon?limit=10&offset=0";

}
