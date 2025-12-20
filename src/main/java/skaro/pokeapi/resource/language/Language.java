package skaro.pokeapi.resource.language;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class Language implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private Boolean official;
    private String iso639;
    private String iso3166;
    private List<Name> names;

    /**
     * Get the id
     *
     * @return the id
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
     * Get the name for this resource
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name for this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get whether or not the games are published in this language
     *
     * @return true if the games are published in this language, false otherwise
     */
    public Boolean isOfficial() {
        return official;
    }

    /**
     * Set whether or not the games are published in this language
     *
     * @param official true if the games are published in this language, false otherwise
     */
    public void setOfficial(Boolean official) {
        this.official = official;
    }

    /**
     * Get the two-letter code of the country where
     * this language is spoken. Note that it is not unique
     *
     * @return the iso639 code
     */
    public String getIso639() {
        return iso639;
    }

    /**
     * Set the two-letter code of the country where
     *
     * @param iso639 the iso639 code
     */
    public void setIso639(String iso639) {
        this.iso639 = iso639;
    }

    /**
     * Get the two-letter code of the language. Note that it is not unique
     *
     * @return the iso3166 code
     */
    public String getIso3166() {
        return iso3166;
    }

    /**
     * Set the two-letter code of the language
     *
     * @param iso3166 the iso3166 code
     */
    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    /**
     * Get the names of the resource in different languages
     *
     * @return a list of {@link Name} objects
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the names of the resource in different languages
     *
     * @param names a list of {@link Name} objects
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of Language
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Language language)) return false;
        return Objects.equals(getId(), language.getId()) && Objects.equals(getName(), language.getName()) && Objects.equals(official, language.official) && Objects.equals(getIso639(), language.getIso639()) && Objects.equals(getIso3166(), language.getIso3166()) && Objects.equals(getNames(), language.getNames());
    }

    /**
     * Returns the hash code of the Language
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), official, getIso639(), getIso3166(), getNames());
    }

    /**
     * Returns a string representation of the Language
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", official=" + official +
                ", iso639='" + iso639 + '\'' +
                ", iso3166='" + iso3166 + '\'' +
                ", names=" + names +
                '}';
    }
}
