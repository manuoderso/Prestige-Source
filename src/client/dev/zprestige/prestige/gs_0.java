/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2596;

/*
 * Renamed from dev.zprestige.prestige.gs
 */
final class gs_0
extends Record {
    private class_2596 as;
    private long at;

    private gs_0(class_2596 class_25962, long l) {
        this.as = class_25962;
        this.at = l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gs_0.class, "as;at", "as", "at"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gs_0.class, "as;at", "as", "at"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gs_0.class, "as;at", "as", "at"}, this);
    }

    public long at() {
        return this.at;
    }

    public class_2596 as() {
        return this.as;
    }
}

