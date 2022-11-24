package org.tinger.core.apps;

import org.tinger.core.common.Named;
import org.tinger.core.common.Ordered;

public interface Module<T> extends Ordered, Named {
    void install();

    void destroy();

    Provider<T> provide();
}