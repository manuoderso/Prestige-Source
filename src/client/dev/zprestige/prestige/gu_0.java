/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;

/*
 * Renamed from dev.zprestige.prestige.gu
 */
final class gu_0
extends Record {
    private class_2338 ay;
    private long az;

    private gu_0(class_2338 class_23382, long l) {
        this.ay = class_23382;
        this.az = l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gu_0.class, "ay;az", "ay", "az"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gu_0.class, "ay;az", "ay", "az"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gu_0.class, "ay;az", "ay", "az"}, this);
    }

    public long az() {
        return this.az;
    }

    public class_2338 ay() {
        return this.ay;
    }
}

