package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

public class GenerationVIII {

    @JsonProperty("brilliant-diamond-and-shining-pearl")
    private Sprites brilliantDiamondShiningPearl;
    @JsonProperty("legends-arceus")
    private Sprites legendsArceus;
    @JsonProperty("sword-shield")
    private Sprites swordShield;
    private Sprites icons;

    /**
     * Get the brilliantDiamondShiningPearl sprites
     * @return the {@link Sprites} for brilliantDiamondShiningPearl
     */
    public Sprites getBrilliantDiamondShiningPearl() {
        return brilliantDiamondShiningPearl;
    }
    /**
     * Set the brilliantDiamondShiningPearl sprites
     * @param brilliantDiamondShiningPearl the {@link Sprites} for brilliantDiamondShiningPearl
     */
    public void setBrilliantDiamondShiningPearl(Sprites brilliantDiamondShiningPearl) {
        this.brilliantDiamondShiningPearl = brilliantDiamondShiningPearl;
    }

    /**
     * Get the legendsArceus sprites
     * @return the {@link Sprites} for legendsArceus
     */
    public Sprites getLegendsArceus() {
        return legendsArceus;
    }
    /**
     * Set the legendsArceus sprites
     * @param legendsArceus the {@link Sprites} for legendsArceus
     */
    public void setLegendsArceus(Sprites legendsArceus) {
        this.legendsArceus = legendsArceus;
    }

    /**
     * Get the swordShield sprites
     * @return the {@link Sprites} for swordShield
     */
    public Sprites getSwordShield() {
        return swordShield;
    }
    /**
     * Set the swordShield sprites
     * @param swordShield the {@link Sprites} for swordShield
     */
    public void setSwordShield(Sprites swordShield) {
        this.swordShield = swordShield;
    }

    /**
     * Get the icons
     * @return the {@link Sprites} for icons
     */
    public Sprites getIcons() {
        return icons;
    }
    /**
     * Set the icons
     * @param icons the {@link Sprites} for icons
     */
    public void setIcons(Sprites icons) {
        this.icons = icons;
    }

    /**
     * Get whether the given object o is
     * equal to this instance of GenerationVIII
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationVIII that)) return false;
        return Objects.equals(getBrilliantDiamondShiningPearl(), that.getBrilliantDiamondShiningPearl()) && Objects.equals(getLegendsArceus(), that.getLegendsArceus()) && Objects.equals(getSwordShield(), that.getSwordShield()) && Objects.equals(getIcons(), that.getIcons());
    }

    /**
     * Get the hash code of the GenerationVIII
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBrilliantDiamondShiningPearl(), getLegendsArceus(), getSwordShield(), getIcons());
    }

    /**
     * Get a string representation of the GenerationVIII
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationVIII{" +
                "brilliantDiamondShiningPearl=" + brilliantDiamondShiningPearl +
                ", legendsArceus=" + legendsArceus +
                ", swordShield=" + swordShield +
                ", icons=" + icons +
                '}';
    }
}
