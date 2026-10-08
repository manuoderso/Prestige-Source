/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import net.minecraft.class_1297;
import net.minecraft.class_238;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aR
extends aH {
    private final class_1297 a;
    private class_238 b;

    public aR(class_1297 class_12972, class_238 class_2382) {
        this.a = class_12972;
        this.b = class_2382;
    }

    public void b(Object[] objectArray) {
        class_238 class_2382 = (class_238)objectArray[0];
        this.b = class_2382;
    }

    public class_1297 a(Object[] objectArray) {
        return this.a;
    }

    public class_238 a(Object[] objectArray) {
        return this.b;
    }
}

