/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a2
extends aH {
    private float a;
    private float b;
    private Color c;
    private Float d;

    public a2(float f, float f10, Color color) {
        this.a = f;
        this.b = f10;
        this.c = color;
    }

    public void e(Object[] objectArray) {
        Float f = (Float)objectArray[0];
        this.d = f;
    }

    public float b(Object[] objectArray) {
        return this.b;
    }

    public void b(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        this.c = color;
    }

    public void c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.a = f;
    }

    public void d(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.b = f;
    }

    public Color a(Object[] objectArray) {
        return this.c;
    }

    public Float a(Object[] objectArray) {
        return this.d;
    }

    public float a(Object[] objectArray) {
        return this.a;
    }
}

