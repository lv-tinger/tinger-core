package org.tinger.core.apps.provider;

import org.tinger.core.apps.Provider;

import java.util.Map;

public class NamedProvider<T> implements Provider<T> {
    private final Map<String, T> holder;

    public NamedProvider(Map<String, T> holder) {
        this.holder = holder;
    }

    @Override
    public T provide(String name) {
        return this.holder.get(name);
    }
}
