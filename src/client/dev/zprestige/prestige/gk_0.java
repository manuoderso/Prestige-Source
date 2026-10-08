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
 * Renamed from dev.zprestige.prestige.gk
 */
final class gk_0
extends Record {
    private class_2338 j;
    private class_243 k;

    private gk_0(class_2338 class_23382, class_243 class_2432) {
        this.j = class_23382;
        this.k = class_2432;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gk_0.class, "j;k", "j", "k"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gk_0.class, "j;k", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gk_0.class, "j;k", "j", "k"}, this);
    }

    public class_243 k() {
        return this.k;
    }

    public class_2338 j() {
        return this.j;
    }
}

