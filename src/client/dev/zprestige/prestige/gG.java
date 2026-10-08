/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_243;

final class gG
extends Record {
    private class_243 bq;
    private int br;
    private double bs;

    private gG(class_243 class_2432, int n, double d) {
        this.bq = class_2432;
        this.br = n;
        this.bs = d;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gG.class, "bq;br;bs", "bq", "br", "bs"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gG.class, "bq;br;bs", "bq", "br", "bs"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gG.class, "bq;br;bs", "bq", "br", "bs"}, this);
    }

    public double bs() {
        return this.bs;
    }

    public int br() {
        return this.br;
    }

    public class_243 bq() {
        return this.bq;
    }
}

