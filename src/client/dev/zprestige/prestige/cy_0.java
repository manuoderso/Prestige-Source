/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.cy
 */
public class cy_0 {
    private final Method a;
    private final Object b;
    private final Class c;
    private final MethodHandle d;

    public cy_0(Method method, Object object, Class clazz) {
        this(method, object, clazz, null);
    }

    public cy_0(Method method, Object object, Class clazz, MethodHandle methodHandle) {
        this.a = method;
        this.b = object;
        this.c = clazz;
        this.d = methodHandle;
    }

    public Class a(Object[] objectArray) {
        return this.c;
    }

    public MethodHandle a(Object[] objectArray) {
        return this.d;
    }

    public Object a(Object[] objectArray) {
        return this.b;
    }

    public Method a(Object[] objectArray) {
        return this.a;
    }
}

