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
 * Renamed from dev.zprestige.prestige.gp
 */
final class gp_0
extends Record {
    private class_2338 aj;
    private long ak;

    private gp_0(class_2338 class_23382, long l) {
        this.aj = class_23382;
        this.ak = l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gp_0.class, "aj;ak", "aj", "ak"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gp_0.class, "aj;ak", "aj", "ak"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gp_0.class, "aj;ak", "aj", "ak"}, this);
    }

    public long ak() {
        return this.ak;
    }

    public class_2338 aj() {
        return this.aj;
    }
}

