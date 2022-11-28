package org.tinger.core.cache;

/**
 * Created by tinger on 2022-11-09
 */
public interface CacheProvider {
    Cache get(CacheDriver driver, String cacheName);
}