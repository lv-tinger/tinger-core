package org.tinger.core.data.metadata;

import lombok.Data;

import java.lang.reflect.Constructor;

/**
 * Created by tinger on 2022-10-18
 */
@Data
public abstract class Metadata<T, K> {
    private Class<?> type;
    private Constructor<T> constructor;
}
