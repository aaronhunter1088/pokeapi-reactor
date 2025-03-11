package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class GenerationIII {

    private NameIcon colosseum;
    private NameIcon emerald;
    @JsonProperty("firered-leafgreen")
    private NameIcon fireredLeafgreen;
    //@JsonProperty("ruby-sapphire")
    @JsonAlias({"ruby-sapphire", "ruby-saphire"})
    private NameIcon rubySapphire;
    private NameIcon xd;

    /**
     * Get the icon for the colosseum
     * @return the colosseum
     */
    public NameIcon getColosseum() {
        return colosseum;
    }
    /**
     * Set the icon for the colosseum
     * @param colosseum the colosseum to set
     */
    public void setColosseum(NameIcon colosseum) {
        this.colosseum = colosseum;
    }

    /**
     * Get the icon for the emerald
     * @return the emerald
     */
    public NameIcon getEmerald() {
        return emerald;
    }
    /**
     * Set the icon for the emerald
     * @param emerald the emerald to set
     */
    public void setEmerald(NameIcon emerald) {
        this.emerald = emerald;
    }

    /**
     * Get the icon for the firered-leafgreen
     * @return the fireredLeafgreen
     */
    public NameIcon getFireredLeafgreen() {
        return fireredLeafgreen;
    }
    /**
     * Set the icon for the firered-leafgreen
     * @param fireredLeafgreen the fireredLeafgreen to set
     */
    public void setFireredLeafgreen(NameIcon fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    /**
     * Get the icon for the ruby-sapphire
     * @return the rubySapphire
     */
    public NameIcon getRubySapphire() {
        return rubySapphire;
    }
    /**
     * Set the icon for the ruby-sapphire
     * @param rubySapphire the rubySapphire to set
     */
    public void setRubySapphire(NameIcon rubySapphire) {
        this.rubySapphire = rubySapphire;
    }

    /**
     * Get the icon for the xd
     * @return the xd
     */
    public NameIcon getXd() {
        return xd;
    }
    /**
     * Set the icon for the xd
     * @param xd the xd to set
     */
    public void setXd(NameIcon xd) {
        this.xd = xd;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationIII
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
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getColosseum(), getEmerald(), getFireredLeafgreen(), getRubySapphire(), getXd());
    }

    /**
     * Returns a string representation of the GenerationIII
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


