package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.version.Version;

import java.util.Objects;

public class VersionGameIndex {

    @JsonProperty("game_index")
    private Integer gameIndex;
    private NamedApiResource<Version> version;

    /**
     * Get the internal id of an API resource within game data
     *
     * @return the gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set the internal id of an API resource within game data
     *
     * @param gameIndex the gameIndex to set
     */
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get the version relevant to this game index
     *
     * @return the {@link Version} version
     */
    public NamedApiResource<Version> getVersion() {
        return version;
    }

    /**
     * Set the version relevant to this game index
     *
     * @param version the {@link Version} version
     */
    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of VersionGameIndex
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VersionGameIndex that)) return false;
        return Objects.equals(getGameIndex(), that.getGameIndex()) && Objects.equals(getVersion(), that.getVersion());
    }

    /**
     * Returns the hash code of the VersionGameIndex
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGameIndex(), getVersion());
    }

    /**
     * Returns a string representation of the VersionGameIndex
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "VersionGameIndex{" +
                "gameIndex=" + gameIndex +
                ", version=" + version +
                '}';
    }
}
