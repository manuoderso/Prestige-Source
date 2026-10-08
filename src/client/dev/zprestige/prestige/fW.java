/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.dz_0;
import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.fX;
import dev.zprestige.prestige.fY;
import dev.zprestige.prestige.gN;
import dev.zprestige.prestige.gO;
import dev.zprestige.prestige.gP;
import dev.zprestige.prestige.gQ;
import dev.zprestige.prestige.gR;
import dev.zprestige.prestige.gS;
import dev.zprestige.prestige.gT;
import dev.zprestige.prestige.gU;
import dev.zprestige.prestige.gV;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface fW {
    public static final gU a = new gU(dp_0::a);

    public static gQ b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        boolean bl2 = (Boolean)objectArray[2];
        return new gQ(n, bl, bl2);
    }

    public static gP b(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        return new gP(bl, bl);
    }

    public static fW b(Object[] objectArray) {
        Consumer consumer = (Consumer)objectArray[0];
        return new fY(consumer);
    }

    default public void a(dz_0 dz_02) {
    }

    public static gN a(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        int n4 = (Integer)objectArray[5];
        return new gN(bl, bl2, n, n2, n3, n4);
    }

    public static gO a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        return new gO(n, n2);
    }

    public static gT a(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        return new gT(bl, bl2);
    }

    public static gR a(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        int n = (Integer)objectArray[2];
        int n2 = (Integer)objectArray[3];
        int n3 = (Integer)objectArray[4];
        int n4 = (Integer)objectArray[5];
        return new gR(bl, bl2, n, n2, n3, n4);
    }

    public static gV a(Object[] objectArray) {
        Consumer consumer = (Consumer)objectArray[0];
        return new gV(consumer);
    }

    public static fW a(Object[] objectArray) {
        Consumer consumer = (Consumer)objectArray[0];
        return new fX(consumer);
    }

    public static gP a(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        boolean bl2 = (Boolean)objectArray[1];
        return new gP(bl, bl2);
    }

    default public boolean a() {
        return false;
    }

    default public void a() {
    }

    default public void a(dy_0 dy_02) {
    }

    public static gQ a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        return new gQ(n, bl);
    }

    public static gS a(Object[] objectArray) {
        fT fT2 = (fT)objectArray[0];
        return new gS(fT2);
    }

    public static gU a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        return new gU(n);
    }
}

