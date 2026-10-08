/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;
import net.minecraft.class_3965;

/*
 * Renamed from dev.zprestige.prestige.gq
 */
final class gq_0
extends Record {
    private class_2338 al;
    private class_3965 am;
    private double an;

    private gq_0(class_2338 class_23382, class_3965 class_39652, double d) {
        this.al = class_23382;
        this.am = class_39652;
        this.an = d;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gq_0.class, "al;am;an", "al", "am", "an"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gq_0.class, "al;am;an", "al", "am", "an"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gq_0.class, "al;am;an", "al", "am", "an"}, this);
    }

    public class_3965 am() {
        return this.am;
    }

    public class_2338 al() {
        return this.al;
    }

    public double an() {
        return this.an;
    }
}

