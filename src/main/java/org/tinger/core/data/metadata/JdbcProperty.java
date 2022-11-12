package org.tinger.core.data.metadata;

import lombok.Data;
import org.tinger.core.data.handler.JdbcHandler;

/**
 * Created by tinger on 2022-10-18
 */
@Data
public class JdbcProperty extends Property {
    private JdbcHandler<?> handler;
}
