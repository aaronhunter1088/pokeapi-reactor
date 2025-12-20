package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

public class GenerationVII {

    @JsonProperty("lets-go-pikachu-lets-go-eevee")
    private Sprites letsGoPikachuLetsGoEevee;
    @JsonProperty("sun-moon")
    private Sprites sunMoon;
    @JsonProperty("ultra-sun-ultra-moon")
    private Sprites ultraSunUltraMoon;
    private Sprites icons;

    /**
     * Get the sprites for letsGoPikachuLetsGoEevee
     *
     * @return the {@link Sprites} for letsGoPikachuLetsGoEevee
     */
    public Sprites getLetsGoPikachuLetsGoEevee() {
        return letsGoPikachuLetsGoEevee;
    }

    /**
     * Set the sprites for letsGoPikachuLetsGoEevee
     *
     * @param letsGoPikachuLetsGoEevee the {@link Sprites} for letsGoPikachuLetsGoEevee
     */
    public void setLetsGoPikachuLetsGoEevee(Sprites letsGoPikachuLetsGoEevee) {
        this.letsGoPikachuLetsGoEevee = letsGoPikachuLetsGoEevee;
    }

    /**
     * Get the sprites for sunMoon
     *
     * @return the {@link Sprites} for sunMoon
     */
    public Sprites getSunMoon() {
        return sunMoon;
    }

    /**
     * Set the sprites for the SunMoon
     *
     * @param sunMoon the {@link Sprites} object
     */
    public void setSunMoon(Sprites sunMoon) {
        this.sunMoon = sunMoon;
    }

    /**
     * Get the sprites for the UltraSunUltraMoon
     *
     * @return the {@link Sprites} object
     */
    public Sprites getUltraSunUltraMoon() {
        return ultraSunUltraMoon;
    }

    /**
     * Set the sprites for the UltraSunUltraMoon
     *
     * @param ultraSunUltraMoon the {@link Sprites} object
     */
    public void setUltraSunUltraMoon(Sprites ultraSunUltraMoon) {
        this.ultraSunUltraMoon = ultraSunUltraMoon;
    }

    /**
     * Get the icons for the GenerationVII
     *
     * @return the {@link Sprites} for icons
     */
    public Sprites getIcons() {
        return icons;
    }

    /**
     * Set the icons for the GenerationVII
     *
     * @param icons the {@link Sprites} for icons
     */
    public void setIcons(Sprites icons) {
        this.icons = icons;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationVII
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationVII that)) return false;
        return Objects.equals(letsGoPikachuLetsGoEevee, that.letsGoPikachuLetsGoEevee) && Objects.equals(sunMoon, that.sunMoon) && Objects.equals(ultraSunUltraMoon, that.ultraSunUltraMoon);
    }

    /**
     * Returns the hash code of the GenerationVII
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(letsGoPikachuLetsGoEevee, sunMoon, ultraSunUltraMoon);
    }

    /**
     * Returns a string representation of the GenerationVII
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationVII{" +
                "letsGoPikachuLetsGoEevee=" + letsGoPikachuLetsGoEevee +
                ", sunMoon=" + sunMoon +
                ", ultraSunUltraMoon=" + ultraSunUltraMoon +
                '}';
    }
}
