package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GenerationVII {

    @JsonProperty("lets-go-pikachu-lets-go-eevee")
    private NameIcon letsGoPikachuLetsGoEevee;
    @JsonProperty("sun-moon")
    private NameIcon sunMoon;
    @JsonProperty("ultra-sun-ultra-moon")
    private NameIcon ultraSunUltraMoon;
    private NameIcon icons;

    /**
     * Gets the name and icon for the LetsGoPikachuLetsGoEevee
     * @return the {@link NameIcon} object
     */
    public NameIcon getLetsGoPikachuLetsGoEevee() {
        return letsGoPikachuLetsGoEevee;
    }
    /**
     * Sets the name and icon for the LetsGoPikachuLetsGoEevee
     * @param letsGoPikachuLetsGoEevee the {@link NameIcon} object
     */
    public void setLetsGoPikachuLetsGoEevee(NameIcon letsGoPikachuLetsGoEevee) {
        this.letsGoPikachuLetsGoEevee = letsGoPikachuLetsGoEevee;
    }

    /**
     * Gets the name and icon for the SunMoon
     * @return the {@link NameIcon} object
     */
    public NameIcon getSunMoon() {
        return sunMoon;
    }
    /**
     * Sets the name and icon for the SunMoon
     * @param sunMoon the {@link NameIcon} object
     */
    public void setSunMoon(NameIcon sunMoon) {
        this.sunMoon = sunMoon;
    }

    /**
     * Gets the name and icon for the UltraSunUltraMoon
     * @return the {@link NameIcon} object
     */
    public NameIcon getUltraSunUltraMoon() {
        return ultraSunUltraMoon;
    }
    /**
     * Sets the name and icon for the UltraSunUltraMoon
     * @param ultraSunUltraMoon the {@link NameIcon} object
     */
    public void setUltraSunUltraMoon(NameIcon ultraSunUltraMoon) {
        this.ultraSunUltraMoon = ultraSunUltraMoon;
    }

    /**
     * Gets the icons for the GenerationVII
     * @return the {@link NameIcon} object
     */
    public NameIcon getIcons() {
        return icons;
    }
    /**
     * Sets the icons for the GenerationVII
     * @param icons the {@link NameIcon} object
     */
    public void setIcons(NameIcon icons) {
        this.icons = icons;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationVII
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
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(letsGoPikachuLetsGoEevee, sunMoon, ultraSunUltraMoon);
    }

    /**
     * Returns a string representation of the GenerationVII
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
