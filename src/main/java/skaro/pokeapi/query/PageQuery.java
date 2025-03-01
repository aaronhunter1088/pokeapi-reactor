package skaro.pokeapi.query;

public class PageQuery {

	private Integer limit;
	private Integer offset;

	/** All args constructor **/
	public PageQuery(int limit, int offset) {
		setLimit(limit);
		setOffset(offset);
	}

	/** Gets the limit **/
	public Integer getLimit() {
		return limit;
	}
	/** Sets the limit **/
	private void setLimit(Integer limit) {
		this.limit = limit;
	}

	/** Gets the offset **/
	public Integer getOffset() {
		return offset;
	}
	/** Sets the offset **/
	private void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}
