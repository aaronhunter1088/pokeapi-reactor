package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GenerationIV {

    @JsonProperty("diamond-pearl")
    private NameIcon diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    private NameIcon heartgoldSoulsilver;
    private NameIcon platinum;

    /**
     * Gets the icon for the HeartGold SoulSilver
     * @return the heartgoldSoulsilver
     */
    public NameIcon getDiamondPearl() {
        return diamondPearl;
    }
    /**
     * Sets the icon for the HeartGold SoulSilver
     * @param diamondPearl the heartgoldSoulsilver to set
     */
    public void setDiamondPearl(NameIcon diamondPearl) {
        this.diamondPearl = diamondPearl;
    }

    /**
     * Gets the icon for the HeartGold SoulSilver
     * @return the heartgoldSilve
     */
    public NameIcon getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }
    /**
     * Sets the icon for the HeartGold SoulSilver
     * @param heartgoldSoulsilver the heartgoldSoulsilver to set
     */
    public void setHeartgoldSoulsilver(NameIcon heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
    }

    /**
     * Gets the icon for the Platinum
     * @return the platinum
     */
    public NameIcon getPlatinum() {
        return platinum;
    }
    /**
     * Sets the icon for the Platinum
     * @param platinum the platinum to set
     */
    public void setPlatinum(NameIcon platinum) {
        this.platinum = platinum;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationIV
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationIV that)) return false;
        return Objects.equals(diamondPearl, that.diamondPearl) && Objects.equals(heartgoldSoulsilver, that.heartgoldSoulsilver) && Objects.equals(platinum, that.platinum);
    }

    /**
     * Returns the hash code of the Ability
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(diamondPearl, heartgoldSoulsilver, platinum);
    }

    /**
     * Returns a string representation of the Ability
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
