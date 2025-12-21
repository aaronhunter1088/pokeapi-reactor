package skaro.pokeapi.cache;

import reactor.core.publisher.Mono;

import java.util.function.Supplier;

/**
 * Specification for a cache entry.
 * @param <T> Type of the cached object
 * <p>
 * Existed with @author skaro @since 0.0.1-SNAPSHOT
 * as a class until this version.
 *           
 * @author michael ball
 * @since 2.0.0
 */
public record CacheSpec<T> (
    String key,
    Class<T> type,
    Supplier<Mono<T>> monoSupplier
) {
    public static <T> CacheSpecBuilder<T> get(Class<T> type, String key) {
        return new CacheSpecBuilder<>(key, type);
    }

    public static record CacheSpecBuilder<T> (
            String key,
            Class<T> type,
            Supplier<Mono<T>> monoSupplier
    ) {

        public CacheSpecBuilder(String key, Class<T> type) { this(key, type, null); }

        public CacheSpec<T> orCache(Supplier<Mono<T>> monoSupplier) {
            return build(monoSupplier);
        }

        public CacheSpec<T> build() {
            return build(null);
        }

        public CacheSpec<T> build(Supplier<Mono<T>> monoSupplier) {
            return new CacheSpec<>(key, type, monoSupplier);
        }
    }

}
