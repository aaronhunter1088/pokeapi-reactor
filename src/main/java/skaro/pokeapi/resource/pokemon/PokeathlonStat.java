package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class PokeathlonStat implements PokeApiResource, Localizable {

    private Integer Id;
    private String name;
    private List<Name> names;
    private NaturePokeathlonStatAffectSets affectingNatures;

    public Integer getId() { return Id; }
    public void setId(Integer Id) { this.Id = Id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Name> getNames() { return names; }
    public void setNames(List<Name> names) { this.names = names; }
    public NaturePokeathlonStatAffectSets getAffectingNatures() { return affectingNatures; }
    public void setAffectingNatures(NaturePokeathlonStatAffectSets affectingNatures) { this.affectingNatures = affectingNatures; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokeathlonStat that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getAffectingNatures(), that.getAffectingNatures());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getNames(), getAffectingNatures());
    }

    @Override
    public String toString() {
        return "PokeathlonStat{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", names=" + names +
                ", affectingNatures=" + affectingNatures +
                '}';
    }
}
