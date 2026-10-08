/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2561
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import net.minecraft.class_1297;
import net.minecraft.class_2561;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.bq
 */
public class bq_0
extends aH {
    private class_2561 a;
    private class_2561 b;
    private class_1297 c;

    public bq_0(class_2561 class_25612, class_2561 class_25613) {
        this(class_25612, class_25613, null);
    }

    public bq_0(class_2561 class_25612, class_2561 class_25613, class_1297 class_12972) {
        this.a = class_25612;
        this.b = class_25613;
        this.c = class_12972;
    }

    public void b(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        this.c = class_12972;
    }

    public class_2561 b(Object[] objectArray) {
        return this.b;
    }

    public void c(Object[] objectArray) {
        class_2561 class_25612 = (class_2561)objectArray[0];
        this.a = class_25612;
    }

    public void d(Object[] objectArray) {
        class_2561 class_25612 = (class_2561)objectArray[0];
        this.b = class_25612;
    }

    public class_1297 a(Object[] objectArray) {
        return this.c;
    }

    public class_2561 a(Object[] objectArray) {
        return this.a;
    }
}

