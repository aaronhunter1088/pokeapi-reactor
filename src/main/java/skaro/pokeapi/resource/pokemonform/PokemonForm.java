package skaro.pokeapi.resource.pokemonform;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.Name;
import skaro.pokeapi.resource.NamedApiResource;
import skaro.pokeapi.resource.PokeApiResource;
import skaro.pokeapi.resource.pokemon.Pokemon;
import skaro.pokeapi.resource.versiongroup.VersionGroup;
import skaro.pokeapi.utils.locale.Localizable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonForm implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer order;
	@JsonProperty("is_mega")
	private Boolean isMega;
	@JsonProperty("form_order")
	private Integer formOrder;
	@JsonProperty("is_default")
	private Boolean isDefault;
	@JsonProperty("is_battle_only")
	private Boolean isBattleOnly;
	@JsonProperty("form_name")
	private String formName;
	private NamedApiResource<Pokemon> pokemon;
	private PokemonFormSprites sprites;
	@JsonProperty("version_group")
	private NamedApiResource<VersionGroup> versionGroup;
	private List<Name> names;
	@JsonProperty("form_names")
	private List<Name> formNames;

	/**
	 * Get the id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Set the id
	 * @param id the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the name for this resource
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name for this resource
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the order in which forms should be sorted within all forms.
	 * Multiple forms may have equal order, in which case they
	 * should fall back on sorting by name.
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}
	/**
	 * Set the order in which forms should be sorted within all forms.
	 * Multiple forms may have equal order, in which case they
	 * should fall back on sorting by name.
	 * @param order the order
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * Get whether or not this form is a mega form
	 * @return isMega
	 */
	public Boolean getMega() {
		return isMega;
	}
	/**
	 * Set whether or not this form is a mega form
	 * @param mega isMega
	 */
	public void setMega(Boolean mega) {
		isMega = mega;
	}

	/**
	 * Get the order in which forms should be
	 * sorted within a species' forms
	 * @return the form order
	 */
	public Integer getFormOrder() {
		return formOrder;
	}
	/**
	 * Set the order in which forms should be
	 * sorted within a species' forms
	 * @param formOrder the form order
	 */
	public void setFormOrder(Integer formOrder) {
		this.formOrder = formOrder;
	}

	/**
	 * Get whether or not one form used as the default for each
	 * @return true if the form is the default, false otherwise
	 */
	public Boolean isDefault() {
		return isDefault;
	}
	/**
	 * Set whether or not one form used as the default for each
	 * @param isDefault true if the form is the default, false otherwise
	 */
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * Get whether or not this form can only happen during battle
	 * @return boolean isBattleOnly
	 */
	public Boolean isBattleOnly() {
		return isBattleOnly;
	}
	/**
	 * Set whether or not this form can only happen during battle
	 * @param isBattleOnly boolean isBattleOnly
	 */
	public void setIsBattleOnly(Boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}

	/**
	 * The name of this form
	 * @return the form name
	 */
	public String getFormName() {
		return formName;
	}
	/**
	 * Set the name of this form
	 * @param formName the form name
	 */
	public void setFormName(String formName) {
		this.formName = formName;
	}

	/**
	 * Get the Pokemon that this form belongs to
	 * @return the {@link NamedApiResource} Pokemon
	 */
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	/**
	 * Set the Pokemon that this form belongs to
	 * @param pokemon the {@link NamedApiResource} Pokemon
	 */
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	/**
	 * Get a set of sprites used to depict this Pokémon form in the game
	 * @return the sprites
	 */
	public PokemonFormSprites getSprites() {
		return sprites;
	}
	/**
	 * Set a set of sprites used to depict this Pokémon form in the game
	 * @param sprites the sprites
	 */
	public void setSprites(PokemonFormSprites sprites) {
		this.sprites = sprites;
	}

	/**
	 * Get the version group this Pokémon form was introduced in
	 * @return the {@link NamedApiResource} version group
	 */
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	/**
	 * Set the version group this Pokémon form was introduced in
	 * @param versionGroup the {@link NamedApiResource} version group
	 */
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}

	/**
	 * Get the form specific full name of this Pokémon form,
	 * or empty if the form does not have a specific name
	 * @return the names
	 */
	public List<Name> getNames() {
		return names;
	}
	/**
	 * Set the form specific full name of this Pokémon form,
	 * or empty if the form does not have a specific name
	 * @param names the names
	 */
	public void setNames(List<Name> names) {
		this.names = names;
	}

	/**
	 * Get the form specific form name of this Pokémon form,
	 * or empty if the form does not have a specific name.
	 * @return the form names
	 */
	public List<Name> getFormNames() {
		return formNames;
	}
	/**
	 * Set the form specific form name of this Pokémon form,
	 * or empty if the form does not have a specific name.
	 * @param formNames the form names
	 */
	public void setFormNames(List<Name> formNames) {
		this.formNames = formNames;
	}

	/**
	 * This method is used to compare two objects of the same type based on their attributes
	 * @param o the object to compare
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PokemonForm that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getOrder(), that.getOrder()) && Objects.equals(isMega, that.isMega) && Objects.equals(getFormOrder(), that.getFormOrder()) && Objects.equals(isDefault, that.isDefault) && Objects.equals(isBattleOnly, that.isBattleOnly) && Objects.equals(getFormName(), that.getFormName()) && Objects.equals(getPokemon(), that.getPokemon()) && Objects.equals(getSprites(), that.getSprites()) && Objects.equals(getVersionGroup(), that.getVersionGroup()) && Objects.equals(getNames(), that.getNames()) && Objects.equals(getFormNames(), that.getFormNames());
	}

	/**
	 * This method is used to generate a hash code for this object
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getOrder(), isMega, getFormOrder(), isDefault, isBattleOnly, getFormName(), getPokemon(), getSprites(), getVersionGroup(), getNames(), getFormNames());
	}

	/**
	 * This method is used to generate a string representation of the object
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "PokemonForm{" +
				"id=" + id +
				", name='" + name + '\'' +
				", order=" + order +
				", isMega=" + isMega +
				", formOrder=" + formOrder +
				", isDefault=" + isDefault +
				", isBattleOnly=" + isBattleOnly +
				", formName='" + formName + '\'' +
				", pokemon=" + pokemon +
				", sprites=" + sprites +
				", versionGroup=" + versionGroup +
				", names=" + names +
				", formNames=" + formNames +
				'}';
	}
}
