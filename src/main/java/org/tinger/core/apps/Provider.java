package org.tinger.core.apps;

public interface Provider<T> {
    default T provide() {
        throw new UnsupportedOperationException();
    }

    default T provide(String name) {
        throw new UnsupportedOperationException();
    }

    default T provide(String driver, String name) {
        throw new UnsupportedOperationException();
    }
}