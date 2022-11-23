package org.tinger.core.system;

public enum ENV {
    DEV(0), TST(1), STG(2), PRO(3);

    public final int value;

    ENV(int value) {
        this.value = value;
    }
}
