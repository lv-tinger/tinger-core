package org.tinger.core.system;

import java.util.Objects;

public enum ENV {
    DEV(0), TST(1), STG(2), PRO(3);

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
}
