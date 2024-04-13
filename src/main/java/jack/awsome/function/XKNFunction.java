package jack.awsome.function;

@FunctionalInterface
public interface XKNFunction<X, K, N, V> {
    V apply(X x, K k, N n);
}
