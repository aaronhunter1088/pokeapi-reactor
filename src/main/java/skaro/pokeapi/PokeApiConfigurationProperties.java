package skaro.pokeapi;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

import static skaro.pokeapi.utils.locale.PokeApiConstants.CONFIGURATION_PROPERTIES_PREFIX;

/**
 * Configuration properties for PokeApi client
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 */
@Configuration
@ConfigurationProperties(CONFIGURATION_PROPERTIES_PREFIX)
public class PokeApiConfigurationProperties {

    @NotNull
    private URI baseUri;
    private int maxBytesToBuffer = 565_000;

    public URI getBaseUri() {
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
