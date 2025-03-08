package skaro.pokeapi.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import skaro.pokeapi.resource.language.Language;
import skaro.pokeapi.resource.version.Version;

public class FlavorText {

	@JsonProperty("flavor_text")
	private String flavorText;
	private NamedApiResource<Language> language;
	private NamedApiResource<Version> version;
	
	public String getFlavorText() {
		return flavorText;
	}
	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "FlavorText{" +
				"flavorText='" + flavorText + '\'' +
				", language=" + language +
				", version=" + version +
				'}';
	}
}
