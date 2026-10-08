/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5321
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_5321;

public final class gE
extends Record {
    private class_5321 bn;
    private long bo;

    public gE(class_5321 class_53212, long l) {
        this.bn = class_53212;
        this.bo = l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gE.class, "bn;bo", "bn", "bo"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gE.class, "bn;bo", "bn", "bo"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gE.class, "bn;bo", "bn", "bo"}, this);
    }

    public long bo() {
        return this.bo;
    }

    public class_5321 bn() {
        return this.bn;
    }
}

