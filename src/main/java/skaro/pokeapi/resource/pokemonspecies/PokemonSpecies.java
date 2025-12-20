package skaro.pokeapi.resource.pokemonspecies;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.*;
import skaro.pokeapi.resource.egggroup.EggGroup;
import skaro.pokeapi.resource.evolutionchain.EvolutionChain;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.growthrate.GrowthRate;
import skaro.pokeapi.resource.palparkarea.PalParkEncounterSpecies;
import skaro.pokeapi.resource.pokemoncolor.PokemonColor;
import skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat;
import skaro.pokeapi.resource.pokemonshape.PokemonShape;
import skaro.pokeapi.utils.locale.Localizable;

import java.util.List;
import java.util.Objects;

public class PokemonSpecies implements PokeApiResource, Localizable {

    private Integer id;
    private String name;
    private Integer order;
    @JsonProperty("gender_rate")
    private Integer genderRate;
    @JsonProperty("capture_rate")
    private Integer captureRate;
    @JsonProperty("base_happiness")
    private Integer baseHappiness;
    @JsonProperty("is_baby")
    private Boolean isBaby;
    @JsonProperty("is_legendary")
    private Boolean isLegendary;
    @JsonProperty("is_mythical")
    private Boolean isMythical;
    @JsonProperty("hatch_counter")
    private Integer hatchCounter;
    @JsonProperty("has_gender_differences")
    private Boolean hasGenderDifferences;
    @JsonProperty("forms_switchable")
    private Boolean formsSwitchable;
    @JsonProperty("growth_rate")
    private NamedApiResource<GrowthRate> growthRate;
    @JsonProperty("pokedex_numbers")
    private List<PokemonSpeciesDexEntry> pokedexNumbers;
    @JsonProperty("egg_groups")
    private List<NamedApiResource<EggGroup>> eggGroups;
    private NamedApiResource<PokemonColor> color;
    private NamedApiResource<PokemonShape> shape;
    @JsonProperty("evolves_from_species")
    private NamedApiResource<PokemonSpecies> evolvesFromSpecies;
    @JsonProperty("evolution_chain")
    private NamedApiResource<EvolutionChain> evolutionChain;
    private NamedApiResource<PokemonHabitat> habitat;
    private NamedApiResource<Generation> generation;
    private List<Name> names;
    @JsonProperty("flavor_text_entries")
    private List<FlavorText> flavorTextEntries;
    @JsonProperty("form_descriptions")
    private List<Description> formDescriptions;
    private List<Genus> genera;
    private List<PokemonSpeciesVariety> varieties;
    @JsonProperty("pal_park_encounters")
    private List<PalParkEncounterSpecies> palParkEncounters;

    /**
     * Get the id
     *
     * @return the id
     */
    @Override
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
     * Get the name of this resource
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Set the name of this resource
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the order in which species should be sorted.
     * Based on National Dex order, except families are
     * grouped together and sorted by stage
     *
     * @return the order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Set the order in which species should be sorted.
     * Based on National Dex order, except families are
     * grouped together and sorted by stage
     *
     * @param order the order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get the chance of this Pokémon being
     * female, in eighths; or -1 for genderless
     *
     * @return the genderRate
     */
    public Integer getGenderRate() {
        return genderRate;
    }

    /**
     * Set the chance of this Pokémon being
     * female, in eighths; or -1 for genderless
     *
     * @param genderRate the genderRate
     */
    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    /**
     * Get the base capture rate; up to 255.
     * The higher the number, the easier the catch
     *
     * @return the captureRate
     */
    public Integer getCaptureRate() {
        return captureRate;
    }

    /**
     * Set the base capture rate; up to 255.
     * The higher the number, the easier the catch
     *
     * @param captureRate the captureRate
     */
    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    /**
     * Get the happiness when caught by a normal
     * Pokéball; up to 255. The higher the number,
     * the happier the Pokémon
     *
     * @return the baseHappiness
     */
    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    /**
     * Set the happiness when caught by a normal
     * Pokéball; up to 255. The higher the number,
     * the happier the Pokémon
     *
     * @param baseHappiness the baseHappiness
     */
    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    /**
     * Get whether or not this is a baby Pokémon
     */
    public Boolean isBaby() {
        return isBaby;
    }

    /**
     * Set whether or not this is a baby Pokémon
     *
     * @param baby the value to set
     */
    public void setBaby(Boolean baby) {
        isBaby = baby;
    }

    /**
     * Get whether or not this is a legendary Pokémon
     */
    public Boolean isLegendary() {
        return isLegendary;
    }

    /**
     * Set whether or not this is a legendary Pokémon
     *
     * @param legendary the value to set
     */
    public void setLegendary(Boolean legendary) {
        isLegendary = legendary;
    }

    /**
     * Get whether or not this is a mythical Pokémon
     */
    public Boolean isMythical() {
        return isMythical;
    }

    /**
     * Set whether or not this is a mythical Pokémon
     *
     * @param mythical the value to set
     */
    public void setMythical(Boolean mythical) {
        isMythical = mythical;
    }

    /**
     * Get the initial hatch counter: one must walk
     * Y × (hatch_counter + 1) steps before this Pokémon's
     * egg hatches, unless utilizing bonuses like Flame
     * Body's. Y varies per generation. In Generations II,
     * III, and VII, Egg cycles are 256 steps long. In
     * Generation IV, Egg cycles are 255 steps long. In
     * Pokémon Brilliant Diamond and Shining Pearl, Egg
     * cycles are also 255 steps long, but are shorter on
     * special dates. In Generations V and VI, Egg cycles
     * are 257 steps long. In Pokémon Sword and Shield, and
     * in Pokémon Scarlet and Violet, Egg cycles are 128
     * steps long
     *
     * @return the hatchCounter
     */
    public Integer getHatchCounter() {
        return hatchCounter;
    }

    /**
     * Set the initial hatch counter: one must walk
     * Y × (hatch_counter + 1) steps before this Pokémon's
     * egg hatches, unless utilizing bonuses like Flame
     * Body's. Y varies per generation. In Generations II,
     * III, and VII, Egg cycles are 256 steps long. In
     * Generation IV, Egg cycles are 255 steps long. In
     * Pokémon Brilliant Diamond and Shining Pearl, Egg
     * cycles are also 255 steps long, but are shorter on
     * special dates. In Generations V and VI, Egg cycles
     * are 257 steps long. In Pokémon Sword and Shield, and
     * in Pokémon Scarlet and Violet, Egg cycles are 128
     * steps long
     *
     * @param hatchCounter the hatchCounter
     */
    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    /**
     * Get whether or not this Pokémon has visual gender differences
     *
     * @return the hasGenderDifferences
     */
    public Boolean hasGenderDifferences() {
        return hasGenderDifferences;
    }

    /**
     * Set whether or not this Pokémon has visual gender differences
     *
     * @param hasGenderDifferences the value to set
     */
    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    /**
     * Get whether or not this Pokémon has multiple
     * forms and can switch between them
     *
     * @return the formsSwitchable
     */
    public Boolean isFormsSwitchable() {
        return formsSwitchable;
    }

    /**
     * Set whether or not this Pokémon has multiple
     * forms and can switch between them
     *
     * @param formsSwitchable the value to set
     */
    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    /**
     * Get the rate at which this Pokémon species gains levels
     *
     * @return the {@link GrowthRate} growthRate
     */
    public NamedApiResource<GrowthRate> getGrowthRate() {
        return growthRate;
    }

    /**
     * Set the rate at which this Pokémon species gains levels
     *
     * @param growthRate the {@link GrowthRate} growthRate
     */
    public void setGrowthRate(NamedApiResource<GrowthRate> growthRate) {
        this.growthRate = growthRate;
    }

    /**
     * Get a list of Pokedexes and the indexes
     * reserved within them for this Pokémon species
     *
     * @return the list of {@link PokemonSpeciesDexEntry} pokedexNumbers
     */
    public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
        return pokedexNumbers;
    }

    /**
     * Set a list of Pokedexes and the indexes
     * reserved within them for this Pokémon species
     *
     * @param pokedexNumbers the list of {@link PokemonSpeciesDexEntry} pokedexNumbers
     */
    public void setPokedexNumbers(List<PokemonSpeciesDexEntry> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    /**
     * Get a list of egg groups this Pokémon
     * species is a member of
     *
     * @return the list of {@link EggGroup} eggGroups
     */
    public List<NamedApiResource<EggGroup>> getEggGroups() {
        return eggGroups;
    }

    /**
     * Set a list of egg groups this Pokémon
     * species is a member of
     *
     * @param eggGroups the list of {@link EggGroup} eggGroups
     */
    public void setEggGroups(List<NamedApiResource<EggGroup>> eggGroups) {
        this.eggGroups = eggGroups;
    }

    /**
     * Get the color of this Pokémon for Pokédex search
     *
     * @return the {@link PokemonColor} color
     */
    public NamedApiResource<PokemonColor> getColor() {
        return color;
    }

    /**
     * Set the color of this Pokémon for Pokédex search
     *
     * @param color the {@link PokemonColor} color
     */
    public void setColor(NamedApiResource<PokemonColor> color) {
        this.color = color;
    }

    /**
     * Get the shape of this Pokémon for Pokédex search
     *
     * @return the {@link PokemonShape} shape
     */
    public NamedApiResource<PokemonShape> getShape() {
        return shape;
    }

    /**
     * Set the shape of this Pokémon for Pokédex search
     *
     * @param shape the {@link PokemonShape} shape
     */
    public void setShape(NamedApiResource<PokemonShape> shape) {
        this.shape = shape;
    }

    /**
     * Get the Pokémon species that evolves
     * into this Pokemon_species
     *
     * @return the {@link PokemonSpecies} evolvesFromSpecies
     */
    public NamedApiResource<PokemonSpecies> getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    /**
     * Set the Pokémon species that evolves
     * into this Pokemon_species
     *
     * @param evolvesFromSpecies the {@link PokemonSpecies} evolvesFromSpecies
     */
    public void setEvolvesFromSpecies(NamedApiResource<PokemonSpecies> evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    /**
     * Get the evolution chain this
     * Pokémon species is a member of
     *
     * @return the {@link EvolutionChain} evolutionChain
     */
    public NamedApiResource<EvolutionChain> getEvolutionChain() {
        return evolutionChain;
    }

    /**
     * Set the evolution chain this
     * Pokémon species is a member of
     *
     * @param evolutionChain the {@link EvolutionChain} evolutionChain
     */
    public void setEvolutionChain(NamedApiResource<EvolutionChain> evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    /**
     * Get the habitat this Pokémon species can be encountered in
     *
     * @return the {@link PokemonHabitat} habitat
     */
    public NamedApiResource<PokemonHabitat> getHabitat() {
        return habitat;
    }

    /**
     * Set the habitat this Pokémon species can be encountered in
     *
     * @param habitat the {@link PokemonHabitat} habitat
     */
    public void setHabitat(NamedApiResource<PokemonHabitat> habitat) {
        this.habitat = habitat;
    }

    /**
     * Get the generation this Pokémon species was introduced in
     *
     * @return the {@link Generation} generation
     */
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    /**
     * Set the generation this Pokémon species was introduced in
     *
     * @param generation the {@link Generation} generation
     */
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    /**
     * Get the name of this resource listed in different languages
     *
     * @return the list of {@link Name} names
     */
    @Override
    public List<Name> getNames() {
        return names;
    }

    /**
     * Set the name of this resource listed in different languages
     *
     * @param names the list of {@link Name} names
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Get a list of flavor text entries for this Pokémon species
     *
     * @return the list of {@link FlavorText} flavorTextEntries
     */
    public List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Set a list of flavor text entries for this Pokémon species
     *
     * @param flavorTextEntries the list of {@link FlavorText} flavorTextEntries
     */
    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get the descriptions of different forms Pokémon
     * take on within the Pokémon species
     *
     * @return the list of {@link Description} formDescriptions
     */
    public List<Description> getFormDescriptions() {
        return formDescriptions;
    }

    /**
     * Set the descriptions of different forms Pokémon
     * take on within the Pokémon species
     *
     * @param formDescriptions the list of {@link Description} formDescriptions
     */
    public void setFormDescriptions(List<Description> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    /**
     * Get the genus of this Pokémon species listed in multiple languages
     *
     * @return the list of {@link Genus} genera
     */
    public List<Genus> getGenera() {
        return genera;
    }

    /**
     * Set the genus of this Pokémon species listed in multiple languages
     *
     * @param genera the list of {@link Genus} genera
     */
    public void setGenera(List<Genus> genera) {
        this.genera = genera;
    }

    /**
     * Get a list of the Pokémon that exist within this Pokémon species
     *
     * @return the list of {@link PokemonSpeciesVariety} varieties
     */
    public List<PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }

    /**
     * Set a list of the Pokémon that exist within this Pokémon species
     *
     * @param varieties the list of {@link PokemonSpeciesVariety} varieties
     */
    public void setVarieties(List<PokemonSpeciesVariety> varieties) {
        this.varieties = varieties;
    }

    /**
     * Get a list of encounters that can be had with this Pokémon species in pal park
     *
     * @return the list of {@link PalParkEncounterSpecies}
     */
    public List<PalParkEncounterSpecies> getPalParkEncounters() {
        return palParkEncounters;
    }

    /**
     * Set a list of encounters that can be had with this Pokémon species in pal park
     *
     * @param palParkEncounters the list of {@link PalParkEncounterSpecies}
     */
    public void setPalParkEncounters(List<PalParkEncounterSpecies> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    /**
     * Returns whether the given object o is
     * equal to this instance of PokemonSpecies
     *
     * @param o the object to compare
     * @return true if equal otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PokemonSpecies species)) return false;
        return Objects.equals(getId(), species.getId()) && Objects.equals(getName(), species.getName()) && Objects.equals(getOrder(), species.getOrder()) && Objects.equals(getGenderRate(), species.getGenderRate()) && Objects.equals(getCaptureRate(), species.getCaptureRate()) && Objects.equals(getBaseHappiness(), species.getBaseHappiness()) && Objects.equals(isBaby, species.isBaby) && Objects.equals(isLegendary, species.isLegendary) && Objects.equals(isMythical, species.isMythical) && Objects.equals(getHatchCounter(), species.getHatchCounter()) && Objects.equals(hasGenderDifferences, species.hasGenderDifferences) && Objects.equals(formsSwitchable, species.formsSwitchable) && Objects.equals(getGrowthRate(), species.getGrowthRate()) && Objects.equals(getPokedexNumbers(), species.getPokedexNumbers()) && Objects.equals(getEggGroups(), species.getEggGroups()) && Objects.equals(getColor(), species.getColor()) && Objects.equals(getShape(), species.getShape()) && Objects.equals(getEvolvesFromSpecies(), species.getEvolvesFromSpecies()) && Objects.equals(getEvolutionChain(), species.getEvolutionChain()) && Objects.equals(getHabitat(), species.getHabitat()) && Objects.equals(getGeneration(), species.getGeneration()) && Objects.equals(getNames(), species.getNames()) && Objects.equals(getFlavorTextEntries(), species.getFlavorTextEntries()) && Objects.equals(getFormDescriptions(), species.getFormDescriptions()) && Objects.equals(getGenera(), species.getGenera()) && Objects.equals(getVarieties(), species.getVarieties()) && Objects.equals(getPalParkEncounters(), species.getPalParkEncounters());
    }

    /**
     * Returns the hash code of the PokemonSpecies
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOrder(), getGenderRate(), getCaptureRate(), getBaseHappiness(), isBaby, isLegendary, isMythical, getHatchCounter(), hasGenderDifferences, formsSwitchable, getGrowthRate(), getPokedexNumbers(), getEggGroups(), getColor(), getShape(), getEvolvesFromSpecies(), getEvolutionChain(), getHabitat(), getGeneration(), getNames(), getFlavorTextEntries(), getFormDescriptions(), getGenera(), getVarieties(), getPalParkEncounters());
    }

    /**
     * Returns a string representation of the PokemonSpecies
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "PokemonSpecies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", genderRate=" + genderRate +
                ", captureRate=" + captureRate +
                ", baseHappiness=" + baseHappiness +
                ", isBaby=" + isBaby +
                ", isLegendary=" + isLegendary +
                ", isMythical=" + isMythical +
                ", hatchCounter=" + hatchCounter +
                ", hasGenderDifferences=" + hasGenderDifferences +
                ", formsSwitchable=" + formsSwitchable +
                ", growthRate=" + growthRate +
                ", pokedexNumbers=" + pokedexNumbers +
                ", eggGroups=" + eggGroups +
                ", color=" + color +
                ", shape=" + shape +
                ", evolvesFromSpecies=" + evolvesFromSpecies +
                ", evolutionChain=" + evolutionChain +
                ", habitat=" + habitat +
                ", generation=" + generation +
                ", names=" + names +
                ", flavorTextEntries=" + flavorTextEntries +
                ", formDescriptions=" + formDescriptions +
                ", genera=" + genera +
                ", varieties=" + varieties +
                ", palParkEncounters=" + palParkEncounters +
                '}';
    }
}
