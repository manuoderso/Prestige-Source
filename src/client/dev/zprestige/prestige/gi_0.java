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
 * Renamed from dev.zprestige.prestige.gi
 */
final class gi_0
extends Record {
    private class_243 a;
    private int b;

    private gi_0(class_243 class_2432, int n) {
        this.a = class_2432;
        this.b = n;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gi_0.class, "a;b", "a", "b"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gi_0.class, "a;b", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gi_0.class, "a;b", "a", "b"}, this);
    }

    public int b() {
        return this.b;
    }

    public class_243 a() {
        return this.a;
    }
}

