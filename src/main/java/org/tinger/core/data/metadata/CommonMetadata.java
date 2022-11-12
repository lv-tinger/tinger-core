package org.tinger.core.data.metadata;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by tinger on 2022-11-13
 */
@Getter
@Setter
public class CommonMetadata<T, K> extends Metadata<T, K> {
    private List<CommonProperty> properties;

    public CommonProperty getPropertyByName(String name) {
        return this.properties.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
    }

    public CommonProperty getPrimaryProperty() {
        return this.properties.stream().filter(x -> x.getAttr(JdbcProperty.PRIMARY_KEY)).findFirst().orElse(null);
    }
}
