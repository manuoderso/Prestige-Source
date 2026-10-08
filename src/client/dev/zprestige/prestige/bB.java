/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bB
extends aH {
    private Color a;
    private Color b;

    public bB(Color color) {
        this.a = color;
        this.b = null;
    }

    public bB(Color color, Color color2) {
        this.a = color;
        this.b = color2;
    }

    public void b(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        this.a = color;
    }

    public Color b(Object[] objectArray) {
        return this.b;
    }

    public void c(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        this.b = color;
    }

    public Color a(Object[] objectArray) {
        return this.a;
    }
}

