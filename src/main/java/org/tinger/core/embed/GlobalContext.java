package org.tinger.core.embed;

public interface GlobalContext {
    void filter(Filter filter);

    void interceptor(Interceptor interceptor);

    void controller(Controller controller);
}