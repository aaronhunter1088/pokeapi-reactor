package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GenerationVIII {

    @JsonProperty("brilliant-diamond-and-shining-pearl")
    private NameIcon brilliantDiamondShiningPearl;
    @JsonProperty("legends-arceus")
    private NameIcon legendsArceus;
    @JsonProperty("sword-shield")
    private NameIcon swordShield;

    /**
     * Returns the brilliantDiamondShiningPearl icon for the GenerationVIII
     * @return the brilliantDiamondShiningPearl icon
     */
    public NameIcon getBrilliantDiamondShiningPearl() {
        return brilliantDiamondShiningPearl;
    }
    /**
     * Sets the brilliantDiamondShiningPearl icon for the GenerationVIII
     * @param brilliantDiamondShiningPearl the brilliantDiamondShiningPearl icon
     */
    public void setBrilliantDiamondShiningPearl(NameIcon brilliantDiamondShiningPearl) {
        this.brilliantDiamondShiningPearl = brilliantDiamondShiningPearl;
    }

    /**
     * Returns the legendsArceus icon for the GenerationVIII
     * @return the legendsArceus icon
     */
    public NameIcon getLegendsArceus() {
        return legendsArceus;
    }
    /**
     * Sets the legendsArceus icon for the GenerationVIII
     * @param legendsArceus the legendsArceus icon
     */
    public void setLegendsArceus(NameIcon legendsArceus) {
        this.legendsArceus = legendsArceus;
    }

    /**
     * Returns the swordShield icon for the GenerationVIII
     * @return the swordShield icon
     */
    public NameIcon getSwordShield() {
        return swordShield;
    }
    /**
     * Sets the swordShield icon for the GenerationVIII
     * @param swordShield the swordShield icon
     */
    public void setSwordShield(NameIcon swordShield) {
        this.swordShield = swordShield;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationVIII
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationVIII that)) return false;
        return Objects.equals(getBrilliantDiamondShiningPearl(), that.getBrilliantDiamondShiningPearl()) && Objects.equals(getLegendsArceus(), that.getLegendsArceus()) && Objects.equals(getSwordShield(), that.getSwordShield());
    }

    /**
     * Returns the hash code of the GenerationVIII
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBrilliantDiamondShiningPearl(), getLegendsArceus(), getSwordShield());
    }

    /**
     * Returns a string representation of the GenerationVIII
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationVIII{" +
                "brilliantDiamondShiningPearl=" + brilliantDiamondShiningPearl +
                ", legendsArceus=" + legendsArceus +
                ", swordShield=" + swordShield +
                '}';
    }
}
