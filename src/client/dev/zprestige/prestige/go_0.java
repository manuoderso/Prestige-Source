/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1297;

/*
 * Renamed from dev.zprestige.prestige.go
 */
final class go_0
extends Record {
    private class_1297 ag;
    private float ah;
    private float ai;

    public float ai() {
        return this.ai;
    }

    private go_0(class_1297 class_12972, float f, float f10) {
        this.ag = class_12972;
        this.ah = f;
        this.ai = f10;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{go_0.class, "ag;ah;ai", "ag", "ah", "ai"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{go_0.class, "ag;ah;ai", "ag", "ah", "ai"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{go_0.class, "ag;ah;ai", "ag", "ah", "ai"}, this);
    }

    public float ah() {
        return this.ah;
    }

    public class_1297 ag() {
        return this.ag;
    }
}

