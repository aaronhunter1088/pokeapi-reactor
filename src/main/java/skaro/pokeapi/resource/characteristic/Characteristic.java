package skaro.pokeapi.resource.characteristic;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Description;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.stat.Stat;

import java.util.List;
import java.util.Objects;

/**
 * Represents the Characteristic resource
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
public class Characteristic implements PokeApiResource {

    private Integer id;
    @JsonProperty("gene_modulo")
    private Integer geneModulo;
    @JsonProperty("possible_values")
    private List<Integer> possibleValues;
    private List<Description> descriptions;
    @JsonProperty("highest_stat")
    private NamedApiResource<Stat> highestStat;

    /**
     * Get the id
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the name
     *
     * @return the class name
     */
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    /**
     * Get the remainder of the highest stat/IV divided by 5
     *
     * @return the gene modulo
     */
    public Integer getGeneModulo() {
        return geneModulo;
    }

    /**
     * Set the remainder of the highest stat/IV divided by 5
     *
     * @param geneModulo the gene modulo
     */
    public void setGeneModulo(Integer geneModulo) {
        this.geneModulo = geneModulo;
    }

    /**
     * Get the possible values of the highest stat that
     * would result in a Pokémon receiving this characteristic
     * when divided by 5
     *
     * @return the possible values
     */
    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    /**
     * Set the possible values of the highest stat that
     * would result in a Pokémon receiving this characteristic
     * when divided by 5
     *
     * @param possibleValues the possible values
     */
    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    /**
     * Get the descriptions of this characteristic listed in different languages
     *
     * @return the {@link Description} descriptions
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Set the descriptions of this characteristic listed in different languages
     *
     * @param descriptions the {@link Description} descriptions
     */
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Get the stat which results in this characteristic
     *
     * @return the {@link Stat} highest stat
     */
    public NamedApiResource<Stat> getHighestStat() {
        return highestStat;
    }

    /**
     * Set the stat which results in this characteristic.
     *
     * @param highestStat the {@link Stat} highest stat
     */
    public void setHighestStat(NamedApiResource<Stat> highestStat) {
        this.highestStat = highestStat;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Characteristic
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Characteristic that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getGeneModulo(), that.getGeneModulo()) && Objects.equals(getPossibleValues(), that.getPossibleValues()) && Objects.equals(getDescriptions(), that.getDescriptions()) && Objects.equals(getHighestStat(), that.getHighestStat());
    }

    /**
     * Returns the hash code of the Characteristic
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGeneModulo(), getPossibleValues(), getDescriptions(), getHighestStat());
    }

    /**
     * Returns a string representation of the Characteristic
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Characteristic{" +
                "id=" + id +
                ", geneModulo=" + geneModulo +
                ", possibleValues=" + possibleValues +
                ", descriptions=" + descriptions +
                ", highestStat=" + highestStat +
                '}';
    }
}
