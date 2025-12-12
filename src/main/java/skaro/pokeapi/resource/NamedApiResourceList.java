package skaro.pokeapi.resource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * NamedApiResponseList, the response from
 * calling endpoints in the registry
 */
public class NamedApiResourceList<T extends PokeApiResource> implements PokeApiResource {

	private Integer count;
	private String next;
	private String previous;
	private List<NamedApiResource<T>> results;

	/**
	 * Get the count
	 * @return the total number of results
	 */
	public Integer getCount() {
		return count;
	}
	/**
	 * Set the count
	 * @param count the number of results
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Get the next page
	 * @return the url to the next page
	 */
	public String getNext() {
		return next;
	}
	/**
	 * Set the next page
	 * @param next the url to the next page
	 */
	public void setNext(String next) {
		this.next = next;
	}

	/**
	 * Get the previous page
	 * @return the url to the previous page
	 */
	public String getPrevious() {
		return previous;
	}
	/**
	 * Set the previous page
	 * @param previous the url to the previous page
	 */
	public void setPrevious(String previous) {
		this.previous = previous;
	}

	/**
	 * Get the results
	 * @return list of {@link NamedApiResource}
	 */
	public List<NamedApiResource<T>> getResults() {
		return results;
	}
	/**
	 * Set the results
	 * @param results list of {@link NamedApiResource}
	 */
	public void setResults(List<NamedApiResource<T>> results) {
		this.results = results;
	}

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
