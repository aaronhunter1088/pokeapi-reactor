package skaro.pokeapi.resource;

import org.jspecify.annotations.NonNull;

/**
 * A generic type that holds a reference
 * to the name and url of the resource.
 * NamedApiResourceList has results of this type.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record NamedApiResource<T extends PokeApiResource> (
        String name,
        String url
) {
    /* No-args constructor */
    public NamedApiResource() { this(null, null); }

    @Override
    public @NonNull String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NamedApiResource{");
        sb.append("name='").append(name).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
