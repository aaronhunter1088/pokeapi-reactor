package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.ApiResource;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;

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
}
