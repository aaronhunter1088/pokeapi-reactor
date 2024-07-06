package skaro.pokeapi.resource.palparkarea;

import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;

public class PalParkEncounterSpecies {

    private Integer baseScore;
    private Integer rate;
    private NamedApiResource<PokemonSpecies> pokemonSpecies;

    public Integer getBaseScore() { return baseScore; }
    public void setBaseScore(Integer baseScore) { this.baseScore = baseScore; }
    public Integer getRate() { return rate; }
    public void setRate(Integer rate) { this.rate = rate; }
    public NamedApiResource<PokemonSpecies> getPokemonSpecies() { return pokemonSpecies; }
    public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) { this.pokemonSpecies = pokemonSpecies; }
}
