package skaro.pokeapi;

import jakarta.validation.constraints.NotNull;

import java.net.URI;

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
