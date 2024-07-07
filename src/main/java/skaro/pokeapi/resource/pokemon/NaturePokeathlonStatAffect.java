package skaro.pokeapi.resource.pokemon;

import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.nature.Nature;

public class NaturePokeathlonStatAffect {

    private Integer maxChange;
    private NamedApiResource<Nature> nature;

    public Integer getMaxChange() { return maxChange; }
    public void setMaxChange(Integer maxChange) { this.maxChange = maxChange; }
    public NamedApiResource<Nature> getNature() { return nature; }
    public void setNature(NamedApiResource<Nature> nature) { this.nature = nature; }
}
