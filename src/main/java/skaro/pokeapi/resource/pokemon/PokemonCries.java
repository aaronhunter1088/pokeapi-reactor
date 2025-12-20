package skaro.pokeapi.resource.pokemon;

import java.util.Objects;

public class PokemonCries {

    private String latest;
    private String legacy;

    /**
     * Get the latest depiction of this Pokémon's cry
     *
     * @return latest
     */
    public String getLatest() {
        return latest;
    }

    /**
     * Set the latest depiction of this Pokémon's cry
     *
     * @param latest the latest
     */
    public void setLatest(String latest) {
        this.latest = latest;
    }

    /**
     * Get the legacy depiction of this Pokémon's cry
     *
     * @return legacy
     */
    public String getLegacy() {
        return legacy;
    }

    /**
     * Set the legacy depiction of this Pokémon's cry
     *
     * @param legacy the legacy
     */
    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonCries
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonCries that)) return false;
        return Objects.equals(getLatest(), that.getLatest()) && Objects.equals(getLegacy(), that.getLegacy());
    }

    /**
     * Returns the hash code of the PokemonCries
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getLatest(), getLegacy());
    }

    /**
     * Returns a string representation of the PokemonCries
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonCries{" +
                "latest='" + latest + '\'' +
                ", legacy='" + legacy + '\'' +
                '}';
    }
}
