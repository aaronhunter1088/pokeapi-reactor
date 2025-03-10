package skaro.pokeapi.resource.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class NameIcon {

    @JsonProperty("name_icon")
    private String nameIcon;

    /**
     * Get the url for the icon
     * @return the nameIcon
     */
    public String getNameIcon() {
        return nameIcon;
    }
    /**
     * Set the url for the icon
     * @param nameIcon the nameIcon to set
     */
    public void setNameIcon(String nameIcon) {
        this.nameIcon = nameIcon;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of NameIcon
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof NameIcon nameIcon1)) return false;
        return Objects.equals(getNameIcon(), nameIcon1.getNameIcon());
    }

    /**
     * Returns the hash code of the NameIcon
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(getNameIcon());
    }

    /**
     * Returns a string representation of the Ability
     * @return the string representation
     */
    @Override
    public String toString() {
        return "NameIcon{" +
                "nameIcon='" + nameIcon + '\'' +
                '}';
    }
}
