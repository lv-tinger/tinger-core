package org.tinger.core.data.metadata;

import lombok.Getter;
import lombok.Setter;
import org.tinger.core.data.handler.JdbcHandler;

/**
 * Created by tinger on 2022-10-18
 */
@Getter
@Setter
public class JdbcProperty extends Property {
    private JdbcHandler<?> handler;
}
