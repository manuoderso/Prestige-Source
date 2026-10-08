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
 * Renamed from dev.zprestige.prestige.gl
 */
final class gl_0
extends Record {
    private class_2338 l;
    private class_2338 m;
    private class_243 n;
    private boolean o;
    private class_2338 p;
    private class_2338 q;
    private class_243 r;

    private gl_0(class_2338 class_23382, class_2338 class_23383, class_243 class_2432, boolean bl, class_2338 class_23384, class_2338 class_23385, class_243 class_2433) {
        this.l = class_23382;
        this.m = class_23383;
        this.n = class_2432;
        this.o = bl;
        this.p = class_23384;
        this.q = class_23385;
        this.r = class_2433;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gl_0.class, "l;m;n;o;p;q;r", "l", "m", "n", "o", "p", "q", "r"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gl_0.class, "l;m;n;o;p;q;r", "l", "m", "n", "o", "p", "q", "r"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gl_0.class, "l;m;n;o;p;q;r", "l", "m", "n", "o", "p", "q", "r"}, this);
    }

    public class_243 n() {
        return this.n;
    }

    public class_2338 l() {
        return this.l;
    }

    public class_2338 m() {
        return this.m;
    }

    public boolean o() {
        return this.o;
    }

    public class_2338 p() {
        return this.p;
    }

    public class_2338 q() {
        return this.q;
    }

    public class_243 r() {
        return this.r;
    }
}

