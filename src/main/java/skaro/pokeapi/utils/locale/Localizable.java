package skaro.pokeapi.utils.locale;

import skaro.pokeapi.resource.Name;

import java.util.List;

/**
 * Interface for entities that have localized names
 *
 * @author skaro
 * @since 1.0.1
 */
public interface Localizable {

    List<Name> getNames();

}
