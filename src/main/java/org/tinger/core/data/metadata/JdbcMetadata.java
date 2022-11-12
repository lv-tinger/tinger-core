package org.tinger.core.data.metadata;

import lombok.Data;

import java.util.List;

/**
 * Created by tinger on 2022-11-13
 */
@Data
public class JdbcMetadata<T, K> extends Metadata<T, K> {
    private List<JdbcProperty> properties;


    public JdbcProperty getPropertyByName(String name) {
        return this.properties.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }

    public JdbcProperty getPrimaryProperty() {
        return this.properties.stream().filter(x -> x.getAttr(JdbcProperty.PRIMARY_KEY)).findFirst().orElse(null);
    }
}
