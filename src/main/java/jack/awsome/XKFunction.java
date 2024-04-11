package jack.awsome;

@FunctionalInterface
public interface XKFunction<X, K, S> {
    S apply(X x, K k);
}
