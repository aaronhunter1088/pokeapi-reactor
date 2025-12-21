package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

/**
 * Represents the fourth generation
 * of Pokémon games and their sprites
 *
 * @author michael ball
 * @since 1.0.8
 */
public class GenerationIV {

    @JsonProperty("diamond-pearl")
    private Sprites diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    private Sprites heartgoldSoulsilver;
    private Sprites platinum;

    /**
     * Get the sprites for the HeartGold SoulSilver
     *
     * @return the {@link Sprites} for heartgoldSoulsilver
     */
    public Sprites getDiamondPearl() {
        return diamondPearl;
    }

    /**
     * Set the sprites for the HeartGold SoulSilver
     *
     * @param diamondPearl the {@link Sprites} for heartgoldSoulsilver
     */
    public void setDiamondPearl(Sprites diamondPearl) {
        this.diamondPearl = diamondPearl;
    }

    /**
     * Get the sprites for the HeartGold SoulSilver
     *
     * @return the {@link Sprites} for heartgoldSilver
     */
    public Sprites getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }

    /**
     * Set the sprites for the HeartGold SoulSilver
     *
     * @param heartgoldSoulsilver the {@link Sprites} for heartgoldSoulsilver
     */
    public void setHeartgoldSoulsilver(Sprites heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
    }

    /**
     * Get the sprites for the Platinum
     *
     * @return the {@link Sprites} for platinum
     */
    public Sprites getPlatinum() {
        return platinum;
    }

    /**
     * Set the sprites for the Platinum
     *
     * @param platinum the {@link Sprites} for platinum
     */
    public void setPlatinum(Sprites platinum) {
        this.platinum = platinum;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationIV
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationIV that)) return false;
        return Objects.equals(diamondPearl, that.diamondPearl) && Objects.equals(heartgoldSoulsilver, that.heartgoldSoulsilver) && Objects.equals(platinum, that.platinum);
    }

    /**
     * Returns the hash code of the GenerationIV
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(diamondPearl, heartgoldSoulsilver, platinum);
    }

    /**
     * Returns a string representation of the GenerationIV
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationIV{" +
                "diamondPearl=" + diamondPearl +
                ", heartgoldSoulsilver=" + heartgoldSoulsilver +
                ", platinum=" + platinum +
                '}';
    }
}
