/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class gH
extends Record {
    private float bt;
    private double bu;
    private int bv;
    private double bw;

    private gH(float f, double d, int n, double d10) {
        this.bt = f;
        this.bu = d;
        this.bv = n;
        this.bw = d10;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gH.class, "bt;bu;bv;bw", "bt", "bu", "bv", "bw"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gH.class, "bt;bu;bv;bw", "bt", "bu", "bv", "bw"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gH.class, "bt;bu;bv;bw", "bt", "bu", "bv", "bw"}, this);
    }

    public double bw() {
        return this.bw;
    }

    public int bv() {
        return this.bv;
    }

    public float bt() {
        return this.bt;
    }

    public double bu() {
        return this.bu;
    }
}

