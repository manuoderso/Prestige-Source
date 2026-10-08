/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1701
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1701;
import net.minecraft.class_243;

/*
 * Renamed from dev.zprestige.prestige.gr
 */
final class gr_0
extends Record {
    private class_1701 ao;
    private class_243 ap;
    private double aq;
    private double ar;

    public class_243 ap() {
        return this.ap;
    }

    private gr_0(class_1701 class_17012, class_243 class_2432, double d, double d10) {
        this.ao = class_17012;
        this.ap = class_2432;
        this.aq = d;
        this.ar = d10;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gr_0.class, "ao;ap;aq;ar", "ao", "ap", "aq", "ar"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gr_0.class, "ao;ap;aq;ar", "ao", "ap", "aq", "ar"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gr_0.class, "ao;ap;aq;ar", "ao", "ap", "aq", "ar"}, this);
    }

    public class_1701 ao() {
        return this.ao;
    }

    public double ar() {
        return this.ar;
    }

    public double aq() {
        return this.aq;
    }
}

