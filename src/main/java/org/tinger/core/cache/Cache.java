package org.tinger.core.cache;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public interface Cache {
    CacheDriver driver();

    Object get(String key);

    Object get(String key, int expiry);

    Object get(String key, Date expiry);

    Map<String, Object> get(Collection<String> keys);

    Map<String, Object> get(Collection<String> keys, int expiry);

    Map<String, Object> get(Collection<String> keys, Date expiry);

    void set(String key, Object value);

    void set(String key, Object value, int expiry);

    void set(String key, Object value, Date expiry);

    void set(Map<String, Object> kv);

    void set(Map<String, Object> kv, int expiry);

    void set(Map<String, Object> kv, Date expiry);

    void exp(String key, int expiry);

    void exp(String key, Date expiry);

    void exp(Collection<String> keys, int expiry);

    void exp(Collection<String> keys, Date expiry);

    void del(String key);

    void del(Collection<String> keys);
}