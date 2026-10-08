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

/*
 * Renamed from dev.zprestige.prestige.gv
 */
final class gv_0
extends Record {
    private class_243 aA;
    private int aB;

    private gv_0(class_243 class_2432, int n) {
        this.aA = class_2432;
        this.aB = n;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gv_0.class, "aA;aB", "aA", "aB"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gv_0.class, "aA;aB", "aA", "aB"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gv_0.class, "aA;aB", "aA", "aB"}, this);
    }

    public class_243 aA() {
        return this.aA;
    }

    public int aB() {
        return this.aB;
    }
}

