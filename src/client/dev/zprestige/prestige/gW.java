/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class gW
extends Record {
    private int b5;
    private int b6;
    private int b7;
    private int b8;

    private gW(int n, int n2, int n3, int n4) {
        this.b5 = n;
        this.b6 = n2;
        this.b7 = n3;
        this.b8 = n4;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gW.class, "b5;b6;b7;b8", "b5", "b6", "b7", "b8"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gW.class, "b5;b6;b7;b8", "b5", "b6", "b7", "b8"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gW.class, "b5;b6;b7;b8", "b5", "b6", "b7", "b8"}, this);
    }

    public int b6() {
        return this.b6;
    }

    public int b5() {
        return this.b5;
    }

    public int b7() {
        return this.b7;
    }

    public int b8() {
        return this.b8;
    }
}

