package skaro.pokeapi.resource.generation;

import skaro.pokeapi.resource.Sprites;

import java.util.Objects;

public class GenerationII {

    private Sprites gold;
    private Sprites silver;
    private Sprites crystal;

    /**
     * Get the gold sprites
     *
     * @return the {@link Sprites} for gold
     */
    public Sprites getGold() {
        return gold;
    }

    /**
     * Set the gold sprites
     *
     * @param gold the {@link Sprites} for gold
     */
    public void setGold(Sprites gold) {
        this.gold = gold;
    }

    /**
     * Get the silver sprites
     *
     * @return the {@link Sprites} for silver
     */
    public Sprites getSilver() {
        return silver;
    }

    /**
     * Set the silver sprites
     *
     * @param silver the {@link Sprites} for silver
     */
    public void setSilver(Sprites silver) {
        this.silver = silver;
    }

    /**
     * Get the crystal sprites
     *
     * @return the {@link Sprites} for crystal
     */
    public Sprites getCrystal() {
        return crystal;
    }

    /**
     * Set the crystal sprites
     *
     * @param crystal the {@link Sprites} for crystal
     */
    public void setCrystal(Sprites crystal) {
        this.crystal = crystal;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of GenerationII
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenerationII that)) return false;
        return this == that || (Objects.equals(getGold(), that.getGold()) && Objects.equals(getSilver(), that.getSilver()) && Objects.equals(getCrystal(), that.getCrystal()));
    }

    /**
     * Returns the hash code of the GenerationII
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGold(), getSilver(), getCrystal());
    }

    /**
     * Returns a string representation of the GenerationII
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "GenerationII{" +
                "gold=" + gold +
                ", silver=" + silver +
                ", crystal=" + crystal +
                '}';
    }
}
