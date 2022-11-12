package org.tinger.core.cache;

/**
 * Created by tinger on 2022-11-13
 */
public interface CacheBuilder {
    CacheProvider build(CacheDriver driver, String name);
}