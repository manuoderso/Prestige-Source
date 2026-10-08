/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;

final class gX
extends Record {
    private ArrayList b9;
    private boolean b_;

    private gX(ArrayList arrayList, boolean bl) {
        this.b9 = arrayList;
        this.b_ = bl;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gX.class, "b9;b_", "b9", "b_"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gX.class, "b9;b_", "b9", "b_"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gX.class, "b9;b_", "b9", "b_"}, this);
    }

    public ArrayList b9() {
        return this.b9;
    }

    public boolean b_() {
        return this.b_;
    }
}

