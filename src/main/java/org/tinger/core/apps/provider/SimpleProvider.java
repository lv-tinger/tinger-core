package org.tinger.core.apps.provider;

import org.tinger.core.apps.Provider;

public class SimpleProvider<T> implements Provider<T> {
    private final T instance;

    public SimpleProvider(T instance) {
        this.instance = instance;
    }

    @Override
    public T provide() {
        return instance;
    }
}
