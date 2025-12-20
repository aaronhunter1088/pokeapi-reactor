package skaro.pokeapi.resource;

import java.util.Objects;

/**
 * A generic type that holds a reference
 * to the name and url of the resource.
 * NamedApiResourceList has results of this type
 */
public class NamedApiResource<T extends PokeApiResource> {

    private String name;
    private String url;

    /**
     * Get the name of the {@link PokeApiResource}
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the {@link PokeApiResource}
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the url of the {@link PokeApiResource}
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the url of the {@link PokeApiResource}
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of NamedApiResource
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NamedApiResource<?> that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getUrl(), that.getUrl());
    }

    /**
     * Returns the hash code of the NamedApiResource
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getUrl());
    }

    /**
     * Gets the string representation of the NamedApiResource
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NamedApiResource{" +
                "name='" + name + '\'' +
                "url='" + url + '\'' +
                '}';
    }
}
