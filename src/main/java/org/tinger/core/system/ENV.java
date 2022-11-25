package org.tinger.core.system;

import java.util.Objects;

public enum ENV {
    DEV(0), TEST(1), STAG(2), PROD(3);

    public final int value;

    ENV(int value) {
        this.value = value;
    }

    public boolean gt(ENV env) {
        Objects.requireNonNull(env);

        return this.value > env.value;
    }

    public boolean ge(ENV env) {
        Objects.requireNonNull(env);

        return this.value >= env.value;
    }

    public boolean eq(ENV env) {
        Objects.requireNonNull(env);
        return this.value == env.value;
    }

    public boolean lt(ENV env) {
        Objects.requireNonNull(env);

        return this.value < env.value;
    }

    public boolean le(ENV env) {
        Objects.requireNonNull(env);

        return this.value <= env.value;
    }

    public static ENV of(String name) {
        for (ENV env : ENV.values()) {
            if (Objects.equals(name, env.name())) {
                return env;
            }
        }

        return null;
    }
}
