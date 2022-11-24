package org.tinger.core.apps.provider;

import org.tinger.core.apps.Provider;

import java.util.Map;

public class DriverProvider<T> implements Provider<T> {
    private final Map<String, Map<String, T>> mapper;

    public DriverProvider(Map<String, Map<String, T>> mapper) {
        this.mapper = mapper;
    }

    @Override
    public T provide(String driver, String name) {
        Map<String, T> map = mapper.get(driver);
        return map == null ? null : map.get(name);
    }
}
