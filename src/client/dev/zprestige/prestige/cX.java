/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;

public class cX {
    public final Field a;
    public final boolean b;
    public final Object c;
    public final long d;
    public final VarHandle e;

    cX(Field field, boolean bl, Object object, long l, VarHandle varHandle) {
        this.a = field;
        this.b = bl;
        this.c = object;
        this.d = l;
        this.e = varHandle;
    }
}

