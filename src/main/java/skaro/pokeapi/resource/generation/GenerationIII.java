package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

/**
 * Represents the third generation
 * of Pokémon games and their sprites
 *
 * @author michael ball
 * @since 1.0.8
 */
public class GenerationIII {

    private Sprites colosseum;
    private Sprites emerald;
    @JsonProperty("firered-leafgreen")
    private Sprites fireredLeafgreen;
    @JsonAlias({"ruby-sapphire", "ruby-saphire"})
    private Sprites rubySapphire;
    private Sprites xd;

    /**
     * Get the sprites for the colosseum
     *
     * @return the {@link Sprites} for colosseum
     */
    public Sprites getColosseum() {
        return colosseum;
    }

    /**
     * Set the sprites for the colosseum
     *
     * @param colosseum the {@link Sprites} for colosseum
     */
    public void setColosseum(Sprites colosseum) {
        this.colosseum = colosseum;
    }

    /**
     * Get the sprites for the emerald
     *
     * @return the {@link Sprites} for emerald
     */
    public Sprites getEmerald() {
        return emerald;
    }

    /**
     * Set the sprites for the emerald
     *
     * @param emerald the {@link Sprites} for emerald
     */
    public void setEmerald(Sprites emerald) {
        this.emerald = emerald;
    }

    /**
     * Get the sprites for the firered-leafgreen
     *
     * @return the {@link Sprites} for firered-leafgreen
     */
    public Sprites getFireredLeafgreen() {
        return fireredLeafgreen;
    }

    /**
     * Set the sprites for the firered-leafgreen
     *
     * @param fireredLeafgreen the {@link Sprites} for fireredLeafgreen
     */
    public void setFireredLeafgreen(Sprites fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    /**
     * Get the sprites for the ruby-sapphire
     *
     * @return the {@link Sprites} for rubySapphire
     */
    public Sprites getRubySapphire() {
        return rubySapphire;
    }

    /**
     * Set the sprites for the ruby-sapphire
     *
     * @param rubySapphire the {@link Sprites} for rubySapphire
     */
    public void setRubySapphire(Sprites rubySapphire) {
        this.rubySapphire = rubySapphire;
    }

    /**
     * Get the sprites for the xd
     *
     * @return the {@link Sprites} for xd
     */
    public Sprites getXd() {
        return xd;
    }

    /**
     * Set the sprites for the xd
     *
     * @param xd the {@link Sprites} for xd
     */
    public void setXd(Sprites xd) {
        this.xd = xd;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationIII
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationIII that)) return false;
        return Objects.equals(getColosseum(), that.getColosseum()) && Objects.equals(getEmerald(), that.getEmerald()) && Objects.equals(getFireredLeafgreen(), that.getFireredLeafgreen()) && Objects.equals(getRubySapphire(), that.getRubySapphire()) && Objects.equals(getXd(), that.getXd());
    }

    /**
     * Returns the hash code of the GenerationIII
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getColosseum(), getEmerald(), getFireredLeafgreen(), getRubySapphire(), getXd());
    }

    /**
     * Returns a string representation of the GenerationIII
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationIII{" +
                "colosseum=" + colosseum +
                ", emerald=" + emerald +
                ", fireredLeafgreen=" + fireredLeafgreen +
                ", rubySapphire=" + rubySapphire +
                ", xd=" + xd +
                '}';
    }
}


