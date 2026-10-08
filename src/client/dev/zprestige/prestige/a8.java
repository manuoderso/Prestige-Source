/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import net.minecraft.class_1297;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a8
extends aH {
    private final class_1297 a;
    private float b;

    public a8(class_1297 class_12972, float f) {
        this.a = class_12972;
        this.b = f;
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.b = f;
    }

    public class_1297 a(Object[] objectArray) {
        return this.a;
    }

    public float a(Object[] objectArray) {
        return this.b;
    }
}

