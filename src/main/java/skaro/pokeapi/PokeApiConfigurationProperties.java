package skaro.pokeapi;

import org.jspecify.annotations.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

import static skaro.pokeapi.utils.PokeApiConstants.CONFIGURATION_PROPERTIES_PREFIX;

/**
 * Configuration properties for PokeApi client
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
@ConfigurationProperties(CONFIGURATION_PROPERTIES_PREFIX)
public class PokeApiConfigurationProperties
{
    private URI baseUri = URI.create("https://pokeapi.co/api/v2/");
    private int maxBytesToBuffer = 5_065_000;

    public @NonNull URI getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(URI baseUri) {
        this.baseUri = baseUri;
    }

    public int getMaxBytesToBuffer() {
        return maxBytesToBuffer;
    }

    public void setMaxBytesToBuffer(int maxBytesToBuffer) {
        this.maxBytesToBuffer = maxBytesToBuffer;
    }

}
