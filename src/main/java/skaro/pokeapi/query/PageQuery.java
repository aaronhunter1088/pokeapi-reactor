package skaro.pokeapi.query;

public class PageQuery {

    private Integer limit;
    private Integer offset;

    public PageQuery(int limit, int offset) {
        this.limit = limit;
        this.offset = offset;
    }

    /**
     * Get the limit
     *
     * @return The limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Set the limit
     *
     * @param limit The limit
     */
    private void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Get the offset
     *
     * @return The offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Set the offset
     *
     * @param offset The offset
     */
    private void setOffset(Integer offset) {
        this.offset = offset;
    }

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
