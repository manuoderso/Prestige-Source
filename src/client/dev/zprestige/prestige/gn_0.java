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
 * Renamed from dev.zprestige.prestige.gn
 */
final class gn_0
extends Record {
    private class_2338 ae;
    private class_243 af;

    private gn_0(class_2338 class_23382, class_243 class_2432) {
        this.ae = class_23382;
        this.af = class_2432;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gn_0.class, "ae;af", "ae", "af"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gn_0.class, "ae;af", "ae", "af"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gn_0.class, "ae;af", "ae", "af"}, this);
    }

    public class_2338 ae() {
        return this.ae;
    }

    public class_243 af() {
        return this.af;
    }
}

