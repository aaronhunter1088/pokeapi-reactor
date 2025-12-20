package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.movebattlestyle.MoveBattleStyle;

import java.util.Objects;

public class MoveBattleStylePreference {

    @JsonProperty("high_hp_preference")
    private Integer highHpPreference;
    @JsonProperty("low_hp_preference")
    private Integer lowHpPreference;
    @JsonProperty("move_battle_style")
    private NamedApiResource<MoveBattleStyle> moveBattleStyle;

    /**
     * Get the chance of using the move,
     * in percent, if HP is under one half
     *
     * @return the high hp preference
     */
    public Integer getHighHpPreference() {
        return highHpPreference;
    }

    /**
     * Set the chance of using the move,
     * in percent, if HP is under one half
     *
     * @param highHpPreference the high hp preference
     */
    public void setHighHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
    }

    /**
     * Get the chance of using the move,
     * in percent, if HP is over one half
     *
     * @return the low hp preference
     */
    public Integer getLowHpPreference() {
        return lowHpPreference;
    }

    /**
     * Set the chance of using the move,
     * in percent, if HP is over one half
     *
     * @param lowHpPreference the low hp preference
     */
    public void setLowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
    }

    /**
     * Get the move battle style
     *
     * @return the {@link MoveBattleStyle} move battle style
     */
    public NamedApiResource<MoveBattleStyle> getMoveBattleStyle() {
        return moveBattleStyle;
    }

    /**
     * Set the move battle style
     *
     * @param moveBattleStyle the {@link MoveBattleStyle} move battle style
     */
    public void setMoveBattleStyle(NamedApiResource<MoveBattleStyle> moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of MoveBattleStylePreference
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MoveBattleStylePreference that)) return false;
        return Objects.equals(getHighHpPreference(), that.getHighHpPreference()) && Objects.equals(getLowHpPreference(), that.getLowHpPreference()) && Objects.equals(getMoveBattleStyle(), that.getMoveBattleStyle());
    }

    /**
     * Returns the hash code of the MoveBattleStylePreference
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getHighHpPreference(), getLowHpPreference(), getMoveBattleStyle());
    }

    /**
     * Returns a string representation of the MoveBattleStylePreference
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "MoveBattleStylePreference{" +
                "highHpPreference=" + highHpPreference +
                ", lowHpPreference=" + lowHpPreference +
                ", moveBattleStyle=" + moveBattleStyle +
                '}';
    }
}
