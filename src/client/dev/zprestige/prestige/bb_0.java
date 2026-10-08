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
 * Renamed from dev.zprestige.prestige.bb
 */
public class bb_0
extends aH {
    private final class_1297 a;
    private class_2561 b;

    public bb_0(class_1297 class_12972, class_2561 class_25612) {
        this.a = class_12972;
        this.b = class_25612;
    }

    public void b(Object[] objectArray) {
        class_2561 class_25612 = (class_2561)objectArray[0];
        this.b = class_25612;
    }

    public class_1297 a(Object[] objectArray) {
        return this.a;
    }

    public class_2561 a(Object[] objectArray) {
        return this.b;
    }
}

