package skaro.pokeapi.resource.berry;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jspecify.annotations.NonNull;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.berryfirmness.BerryFirmness;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.pokemon.Pokemon;
import skaro.pokeapi.resource.type.Type;
import skaro.pokeapi.utils.ToStringFormat;

import java.util.Comparator;
import java.util.List;

/**
 * Represents the Berry resource.
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record Berry (
    Integer id,
    String name,
    @JsonProperty("growth_time") Integer growthTime,
    @JsonProperty("max_harvest") Integer maxHarvest,
    @JsonProperty("natural_gift_power") Integer naturalGiftPower,
    Integer size,
    Integer smoothness,
    @JsonProperty("soil_dryness") Integer soilDryness,
    NamedApiResource<BerryFirmness> firmness,
    List<BerryFlavorMap> flavors,
    NamedApiResource<Item> item,
    @JsonProperty("natural_gift_type") NamedApiResource<Type> naturalGiftType
) implements PokeApiResource, Comparable<Berry> {

    /* Constructor with id and name */
    public Berry(Integer id, String name) { this(id, name, null, null, null, null, null, null, null, null, null, null); }
    /* Constructor with name */
    public Berry(String name) { this(null, name); }
    /* No-args constructor */
    public Berry() { this(null); }

    /**
     * Get the id
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the Berry
     *
     * @return the string representation
     */
    @Override
    public @NonNull String toString() {
        return toString(ToStringFormat.MINIMAL);
    }

    /**
     * Returns a string representation of the Berry.
     *
     * @param format the desired {@link ToStringFormat} format
     * @return the string representation
     */
    public String toString(ToStringFormat format) {
        StringBuilder sb = new StringBuilder();
        sb.append("Berry{");
        return switch (format) {
            case MINIMAL -> {
                sb.append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append('}');
                yield sb.toString();
            }
            case BASIC -> {
                sb.append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", growthTime=").append(growthTime)
                .append(", size=").append(size)
                .append('}');
                yield sb.toString();
            }
            case DETAILED -> {
                sb.append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", growthTime=").append(growthTime)
                .append(", maxHarvest=").append(maxHarvest)
                .append(", naturalGiftPower=").append(naturalGiftPower)
                .append(", size=").append(size)
                .append(", smoothness=").append(smoothness)
                .append(", soilDryness=").append(soilDryness)
                .append(", firmness=").append(firmness)
                .append(", flavors=").append(flavors)
                .append(", item=").append(item)
                .append(", naturalGiftType=").append(naturalGiftType)
                .append('}');
                yield sb.toString();
            }
            case DEFAULT -> getClass().getName() + "@" + Integer.toHexString(hashCode());
        };
    }

    /**
     * Compares this id to other berry's id.
     *
     * @param other the other berry to be compared.
     * @return comparison result
     */
    @Override
    public int compareTo(@NonNull Berry other) {
        Comparator<Berry> cmp = Comparator
                .comparing(Berry::getId, Comparator.nullsFirst(Integer::compareTo));
        return cmp.compare(this, other);
    }
}
