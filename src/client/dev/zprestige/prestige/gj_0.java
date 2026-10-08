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
 * Renamed from dev.zprestige.prestige.gj
 */
final class gj_0
extends Record {
    private class_2338 c;
    private class_2338 d;
    private class_243 e;
    private class_2338 f;
    private class_2338 g;
    private class_243 h;
    private boolean i;

    private gj_0(class_2338 class_23382, class_2338 class_23383, class_243 class_2432, class_2338 class_23384, class_2338 class_23385, class_243 class_2433, boolean bl) {
        this.c = class_23382;
        this.d = class_23383;
        this.e = class_2432;
        this.f = class_23384;
        this.g = class_23385;
        this.h = class_2433;
        this.i = bl;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gj_0.class, "c;d;e;f;g;h;i", "c", "d", "e", "f", "g", "h", "i"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gj_0.class, "c;d;e;f;g;h;i", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gj_0.class, "c;d;e;f;g;h;i", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    public class_243 e() {
        return this.e;
    }

    public boolean i() {
        return this.i;
    }

    public class_2338 c() {
        return this.c;
    }

    public class_243 h() {
        return this.h;
    }

    public class_2338 f() {
        return this.f;
    }

    public class_2338 d() {
        return this.d;
    }

    public class_2338 g() {
        return this.g;
    }
}

