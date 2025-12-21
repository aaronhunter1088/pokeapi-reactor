package skaro.pokeapi.query;

/**
 * Represents a pagination query with limit and offset
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *
 * @author michael ball
 * @since 2.0.0
 */
public record PageQuery (
    int limit,
    int offset
) {

    /**
     * Returns a string representation of the PageQuery
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PageQuery{" +
                "limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
