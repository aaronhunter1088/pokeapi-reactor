package skaro.pokeapi.cache;

import reactor.core.publisher.Mono;

import java.util.function.Supplier;

/**
 * Specification for a cache entry
 *
 * @author skaro
 * @since 0.0.1-SNAPSHOT
 *
 * @param <T> Type of the cached object
 */
public class CacheSpec<T> {

    private String key;
    private Class<T> type;
    private Supplier<Mono<T>> monoSupplier;

    public static <T> CacheSpecBuilder<T> get(Class<T> type, String key) {
        CacheSpecBuilder<T> builder = new CacheSpecBuilder<>();
        builder.spec = new CacheSpec<>();
        builder.spec.key = key;
        builder.spec.type = type;

        return builder;
    }

    public String getKey() {
        return key;
    }

    public Class<T> getType() {
        return type;
    }

    public Supplier<Mono<T>> getMonoSupplier() {
        return monoSupplier;
    }

    public static class CacheSpecBuilder<T> {
        private CacheSpec<T> spec;

        private CacheSpecBuilder() {

        }

        public CacheSpec<T> orCache(Supplier<Mono<T>> monoSupplier) {
            this.spec.monoSupplier = monoSupplier;
            return this.spec;
        }

    }

}
