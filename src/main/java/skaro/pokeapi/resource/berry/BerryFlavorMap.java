package skaro.pokeapi.resource.berry;

import org.jspecify.annotations.NonNull;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.berryflavor.BerryFlavor;
import skaro.pokeapi.utils.ToStringFormat;

/**
 * Represents a mapping of a BerryFlavor to
 * its potency for a specific Berry.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record BerryFlavorMap (
    Integer potency,
    NamedApiResource<BerryFlavor> flavor
) {
    /* No-args constructor */
    public BerryFlavorMap() { this(null, null); }

    /**
     * Returns a string representation
     * of the BerryFlavorMap.
     *
     * @return the string representation
     */
    @Override
    public @NonNull String toString() {
        return toString(ToStringFormat.MINIMAL);
    }

    /**
     * Returns a string representation of the BerryFlavorMap.
     *
     * @param format the desired {@link ToStringFormat} format
     * @return the string representation
     */
    public String toString(ToStringFormat format) {
        StringBuilder sb = new StringBuilder();
        sb.append("BerryFlavorMap{");
        return switch (format) {
            case MINIMAL,
                 BASIC,
                 DETAILED-> {
                sb.append("potency=").append(potency)
                .append(", flavor=").append(flavor)
                .append('}');
                yield sb.toString();
            }
            case DEFAULT -> getClass().getName() + "@" + Integer.toHexString(hashCode());
        };
    }
}
