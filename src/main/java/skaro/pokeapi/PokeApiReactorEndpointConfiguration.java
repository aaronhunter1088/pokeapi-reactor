package skaro.pokeapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import skaro.pokeapi.client.MapEndpointRegistry;
import skaro.pokeapi.client.PokeApiEndpointRegistry;
import skaro.pokeapi.resource.ability.Ability;
import skaro.pokeapi.resource.berry.Berry;
import skaro.pokeapi.resource.berryfirmness.BerryFirmness;
import skaro.pokeapi.resource.berryflavor.BerryFlavor;
import skaro.pokeapi.resource.characteristic.Characteristic;
import skaro.pokeapi.resource.contesteffect.ContestEffect;
import skaro.pokeapi.resource.contesttype.ContestType;
import skaro.pokeapi.resource.egggroup.EggGroup;
import skaro.pokeapi.resource.encountercondition.EncounterCondition;
import skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue;
import skaro.pokeapi.resource.encountermethod.EncounterMethod;
import skaro.pokeapi.resource.evolutionchain.EvolutionChain;
import skaro.pokeapi.resource.evolutiontrigger.EvolutionTrigger;
import skaro.pokeapi.resource.gender.Gender;
import skaro.pokeapi.resource.generation.Generation;
import skaro.pokeapi.resource.growthrate.GrowthRate;
import skaro.pokeapi.resource.item.Item;
import skaro.pokeapi.resource.itemattribute.ItemAttribute;
import skaro.pokeapi.resource.itemcategory.ItemCategory;
import skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect;
import skaro.pokeapi.resource.itempocket.ItemPocket;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.location.Location;
import skaro.pokeapi.resource.locationarea.LocationArea;
import skaro.pokeapi.resource.machine.Machine;
import skaro.pokeapi.resource.move.Move;
import skaro.pokeapi.resource.moveailment.MoveAilment;
import skaro.pokeapi.resource.movebattlestyle.MoveBattleStyle;
import skaro.pokeapi.resource.movecategory.MoveCategory;
import skaro.pokeapi.resource.movedamageclass.MoveDamageClass;
import skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod;
import skaro.pokeapi.resource.movetarget.MoveTarget;
import skaro.pokeapi.resource.nature.Nature;
import skaro.pokeapi.resource.palparkarea.PalParkArea;
import skaro.pokeapi.resource.pokedex.Pokedex;
import skaro.pokeapi.resource.pokemon.PokeathlonStat;
import skaro.pokeapi.resource.pokemon.Pokemon;
import skaro.pokeapi.resource.pokemoncolor.PokemonColor;
import skaro.pokeapi.resource.pokemonform.PokemonForm;
import skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat;
import skaro.pokeapi.resource.pokemonshape.PokemonShape;
import skaro.pokeapi.resource.pokemonspecies.PokemonSpecies;
import skaro.pokeapi.resource.region.Region;
import skaro.pokeapi.resource.stat.Stat;
import skaro.pokeapi.resource.supercontesteffect.SuperContestEffect;
import skaro.pokeapi.resource.type.Type;
import skaro.pokeapi.resource.version.Version;
import skaro.pokeapi.resource.versiongroup.VersionGroup;

import java.util.HashMap;
import java.util.Map;

import static skaro.pokeapi.utils.PokeApiConstants.*;

/**
 * Configuration for PokeApi Reactor endpoints
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
@Configuration
public class PokeApiReactorEndpointConfiguration {

    @Bean
    public PokeApiEndpointRegistry endpointRegistry() {
        final Map<Class<?>, String> endpoints = new HashMap<>();
        endpoints.put(Ability.class, ABILITY_API);
        endpoints.put(Berry.class, BERRY_API);
        endpoints.put(BerryFirmness.class, BERRY_FIRMNESS_API);
        endpoints.put(BerryFlavor.class, BERRY_FLAVOR_API);
        endpoints.put(Characteristic.class, CHARACTERISTIC_API);
        endpoints.put(ContestEffect.class, CONTEST_EFFECT_API);
        endpoints.put(ContestType.class, CONTEST_TYPE_API);
        endpoints.put(EggGroup.class, EGG_GROUP_API);
        endpoints.put(EncounterCondition.class, ENCOUNTER_CONDITION_API);
        endpoints.put(EncounterConditionValue.class, ENCOUNTER_CONDITION_VALUE_API);
        endpoints.put(EncounterMethod.class, ENCOUNTER_METHOD_API);
        endpoints.put(EvolutionChain.class, EVOLUTION_CHAIN_API);
        endpoints.put(EvolutionTrigger.class, EVOLUTION_TRIGGER_API);
        endpoints.put(Gender.class, GENDER_API);
        endpoints.put(Generation.class, GENERATION_API);
        endpoints.put(GrowthRate.class, GROWTH_RATE_API);
        endpoints.put(Item.class, ITEM_API);
        endpoints.put(ItemAttribute.class, ITEM_ATTRIBUTE_API);
        endpoints.put(ItemCategory.class, ITEM_CATEGORY_API);
        endpoints.put(ItemFlingEffect.class, ITEM_FLING_EFFECT_API);
        endpoints.put(ItemPocket.class, ITEM_POCKET_API);
        endpoints.put(Language.class, LANGUAGE_API);
        endpoints.put(Location.class, LOCATION_API);
        endpoints.put(LocationArea.class, LOCATION_AREA_API);
        endpoints.put(Machine.class, MACHINE_API);
        endpoints.put(Move.class, MOVE_API);
        endpoints.put(MoveAilment.class, MOVE_AILMENT_API);
        endpoints.put(MoveBattleStyle.class, MOVE_BATTLE_STYLE_API);
        endpoints.put(MoveCategory.class, MOVE_CATEGORY_API);
        endpoints.put(MoveDamageClass.class, MOVE_DAMAGE_CLASS_API);
        endpoints.put(MoveLearnMethod.class, MOVE_LEARN_METHOD_API);
        endpoints.put(MoveTarget.class, MOVE_TARGET_API);
        endpoints.put(Nature.class, NATURE_API);
        endpoints.put(PalParkArea.class, PAL_PARK_AREA_API);
        endpoints.put(PokeathlonStat.class, POKEATHLON_STAT_API);
        endpoints.put(Pokedex.class, POKEDEX_API);
        endpoints.put(Pokemon.class, POKEMON_API);
        endpoints.put(PokemonColor.class, POKEMON_COLOR_API);
        endpoints.put(PokemonForm.class, POKEMON_FORM_API);
        endpoints.put(PokemonHabitat.class, POKEMON_HABITAT_API);
        endpoints.put(PokemonShape.class, POKEMON_SHAPE_API);
        endpoints.put(PokemonSpecies.class, POKEMON_SPECIES_API);
        endpoints.put(Region.class, REGION_API);
        endpoints.put(Stat.class, STAT_API);
        endpoints.put(SuperContestEffect.class, SUPER_CONTEST_EFFECT_API);
        endpoints.put(Type.class, TYPE_API);
        endpoints.put(Version.class, VERSION_API);
        endpoints.put(VersionGroup.class, VERSION_GROUP_API);

        return new MapEndpointRegistry(endpoints);
    }

}
