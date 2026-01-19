package skaro.pokeapi.utils;

import skaro.pokeapi.resource.PokeApiResource;

/**
 * Formats for toString methods which
 * controls how detailed the output is.
 *
 * @author michael ball
 * @since 2.0.0
 */
public enum ToStringFormat {

    /**
     * Minimal format includes only
     * the name and id fields for
     * {@link PokeApiResource}
     */
    MINIMAL,
    /**
     * Basic format includes only
     * the most important fields
     */
    BASIC,
    /**
     * Detailed format including
     * all fields
     */
    DETAILED,
    /**
     * Default format
     */
    DEFAULT
}
