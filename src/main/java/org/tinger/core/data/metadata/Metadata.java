package org.tinger.core.data.metadata;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Constructor;

/**
 * Created by tinger on 2022-10-18
 */
@Getter
@Setter
public abstract class Metadata<T, K> {
    private Class<?> type;
    private Constructor<T> constructor;
}
