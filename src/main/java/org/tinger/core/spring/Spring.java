package org.tinger.core.spring;

import java.util.Map;

public interface Spring {
    <T> T getBean(Class<T> type);

    <T> Map<String, T> getBeans(Class<T> type);
}
