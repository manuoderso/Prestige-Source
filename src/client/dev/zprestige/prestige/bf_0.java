/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.bf
 */
public class bf_0
extends aH {
    private float a;
    private class_243 b;

    public bf_0(float f) {
        this.a = f;
    }

    public bf_0(float f, class_243 class_2432) {
        this.a = f;
        this.b = class_2432;
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.a = f;
    }

    public void c(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        this.b = class_2432;
    }

    public class_243 a(Object[] objectArray) {
        return this.b;
    }

    public float a(Object[] objectArray) {
        return this.a;
    }
}

