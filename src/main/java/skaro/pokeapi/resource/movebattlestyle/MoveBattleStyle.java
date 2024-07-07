package skaro.pokeapi.resource.movebattlestyle;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;

public class MoveBattleStyle implements PokeApiResource, Localizable {

    private Integer Id;
    private String name;
    private List<Name> names;

    public Integer getId() { return Id; }
    public void setId(Integer Id) { this.Id = Id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Name> getNames() { return names; }
    public void setNames(List<Name> names) { this.names = names; }
}
