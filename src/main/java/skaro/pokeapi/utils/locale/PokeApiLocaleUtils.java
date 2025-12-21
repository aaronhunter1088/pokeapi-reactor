package skaro.pokeapi.utils.locale;

import skaro.pokeapi.resource.Name;

import java.util.Optional;

/**
 * Utility class for handling localization in PokeApi resources
 *
 * @author skaro
 * @since 1.0.1
 */
public class PokeApiLocaleUtils {

    /**
     * Returns an Optional containing the Name object in
     * the specified locale if it exists, otherwise an
     * empty Optional
     *
     * @param localizable the localizable object
     * @param locale      the locale to search for
     * @return an Optional possibly containing a Name object
     */
    public static Optional<Name> getInLocale(Localizable localizable, String locale) {
        return localizable.getNames().stream()
                .filter(name -> name.getLanguage().getName().equalsIgnoreCase(locale))
                .findFirst();
    }

}
