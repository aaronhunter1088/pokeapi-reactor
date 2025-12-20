package skaro.pokeapi.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

public class OtherSprites {

    @JsonProperty("dream_world")
    private Sprites dreamWorld;
    private Sprites home;
    @JsonProperty("official-artwork")
    private Sprites officialArtwork;
    private Sprites showdown;

    /**
     * Get the dream world sprites
     *
     * @return the {@link Sprites} dreamWorld sprites
     */
    public Sprites getDreamWorld() {
        return dreamWorld;
    }

    /**
     * Set the dream world sprites
     *
     * @param dreamWorld the {@link Sprites} dreamWorld sprites
     */
    public void setDreamWorld(Sprites dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    /**
     * Get the home sprites
     *
     * @return the {@link Sprites} home sprites
     */
    public Sprites getHome() {
        return home;
    }

    /**
     * Set the home sprites
     *
     * @param home the {@link Sprites} home sprites
     */
    public void setHome(Sprites home) {
        this.home = home;
    }

    /**
     * Get the official artwork sprites
     *
     * @return the {@link Sprites} officialArtwork sprites
     */
    public Sprites getOfficialArtwork() {
        return officialArtwork;
    }

    /**
     * Set the official artwork sprites
     *
     * @param officialArtwork the {@link Sprites} officialArtwork sprites
     */
    public void setOfficialArtwork(Sprites officialArtwork) {
        this.officialArtwork = officialArtwork;
    }

    /**
     * Get the showdown sprites
     *
     * @return the {@link Sprites} showdown sprites
     */
    public Sprites getShowdown() {
        return showdown;
    }

    /**
     * Set the showdown sprites
     *
     * @param showdown the {@link Sprites} showdown sprites
     */
    public void setShowdown(Sprites showdown) {
        this.showdown = showdown;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of OtherSprites
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof OtherSprites that)) return false;
        return Objects.equals(getDreamWorld(), that.getDreamWorld()) && Objects.equals(getHome(), that.getHome()) && Objects.equals(getOfficialArtwork(), that.getOfficialArtwork()) && Objects.equals(getShowdown(), that.getShowdown());
    }

    /**
     * Returns the hash code of the OtherSprites
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getDreamWorld(), getHome(), getOfficialArtwork(), getShowdown());
    }

    /**
     * Returns a string representation of the OtherSprites
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "OtherSprites{" +
                "dreamWorld=" + dreamWorld +
                ", home=" + home +
                ", officialArtwork=" + officialArtwork +
                ", showdown=" + showdown +
                '}';
    }
}
