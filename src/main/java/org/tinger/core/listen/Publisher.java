package org.tinger.core.listen;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by tinger on 2022-10-09
 */
public class Publisher {
    private List<Listener> listeners = new ArrayList<>();

    public void subscriber(Listener listener) {
        if (listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    public void publisher(String channel, Object object) {
        for (Listener listener : listeners) {
            if (Objects.equals(channel, listener.getChannel())) {
                listener.process(object);
            }
        }
    }
}