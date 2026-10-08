/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dC {
    private float a;
    private float b;
    private boolean c;

    public dC(float f, float f10) {
        this.a = f;
        this.b = f10;
    }

    public void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.b = f;
    }

    public float b(Object[] objectArray) {
        return this.b;
    }

    public void c(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        this.c = bl;
    }

    public void a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.a = f;
    }

    public boolean a(Object[] objectArray) {
        return this.c;
    }

    public float a(Object[] objectArray) {
        return this.a;
    }
}

