/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;
import net.minecraft.class_243;

/*
 * Renamed from dev.zprestige.prestige.gm
 */
final class gm_0
extends Record {
    private class_2338 s;
    private class_2338 t;
    private class_243 u;
    private boolean v;
    private int w;
    private double x;
    private boolean y;
    private boolean z;
    private int aa;
    private double ab;
    private double ac;
    private double ad;

    public int aa() {
        return this.aa;
    }

    public double ab() {
        return this.ab;
    }

    private gm_0(class_2338 class_23382, class_2338 class_23383, class_243 class_2432, boolean bl, int n, double d, boolean bl2, boolean bl3, int n2, double d10, double d11, double d12) {
        this.s = class_23382;
        this.t = class_23383;
        this.u = class_2432;
        this.v = bl;
        this.w = n;
        this.x = d;
        this.y = bl2;
        this.z = bl3;
        this.aa = n2;
        this.ab = d10;
        this.ac = d11;
        this.ad = d12;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gm_0.class, "s;t;u;v;w;x;y;z;aa;ab;ac;ad", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ab", "ac", "ad"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gm_0.class, "s;t;u;v;w;x;y;z;aa;ab;ac;ad", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ab", "ac", "ad"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gm_0.class, "s;t;u;v;w;x;y;z;aa;ab;ac;ad", "s", "t", "u", "v", "w", "x", "y", "z", "aa", "ab", "ac", "ad"}, this);
    }

    public double ad() {
        return this.ad;
    }

    public double x() {
        return this.x;
    }

    public class_2338 s() {
        return this.s;
    }

    public class_2338 t() {
        return this.t;
    }

    public boolean v() {
        return this.v;
    }

    public boolean z() {
        return this.z;
    }

    public int w() {
        return this.w;
    }

    public class_243 u() {
        return this.u;
    }

    public boolean y() {
        return this.y;
    }

    public double ac() {
        return this.ac;
    }
}

