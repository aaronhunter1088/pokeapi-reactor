package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * NamedApiResponseList, the response from
 * calling endpoints in the registry.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record NamedApiResourceList<T extends PokeApiResource> (
        Integer count,
        String next,
        String previous,
        List<NamedApiResource<T>> results
) implements PokeApiResource {

    /* No-args constructor */
    public NamedApiResourceList() { this(0, null, null, List.<NamedApiResource<T>>of()); }

    @Override
    @JsonIgnore
    public Integer getId() {
        return 0;
    }

    @Override
    @JsonIgnore
    public String getName() {
        return getClass().getSimpleName();
    }

}
