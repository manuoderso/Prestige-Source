/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 *  net.minecraft.class_4604
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bJ;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bo_0;
import dev.zprestige.prestige.cA;
import dev.zprestige.prestige.dB;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.f9;
import dev.zprestige.prestige.f_;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_4604;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fL
extends dV {
    private dM d;
    private dR a;
    private dO c;
    private dO e;
    private dS f;
    private dO g;
    private dO h;
    private dM i;
    private dO j;
    private dR k;
    private dM l;
    private dM m;
    private dO n;
    private dP o;
    private dP p;
    private dM q;
    private dN r;
    private dN s;
    private dN t;
    private dN u;
    private dN v;
    private class_4604 w;
    private long x;
    private long y;
    private Map z;
    private Map A;
    private static final long B;
    private static final String[] C;
    private static final String[] D;
    private static final Map E;
    private static final long[] F;
    private static final Integer[] G;
    private static final Map H;
    private static final long[] I;
    private static final Long[] J;
    private static final Map K;
    private static final Object[] L;
    private static final String[] M;

    public fL() {
        long l;
        long l2 = l = B ^ 0x7E5B66596809L;
        long l3 = l2 ^ 0x65769B1976CCL;
        long l4 = l2 ^ 0x17B657AA6D2AL;
        long l5 = l2 ^ 0x288C5C66D006L;
        long l6 = l2 ^ 0x383B21C80A27L;
        this.x = (long)fL.d("t", (int)16001, (long)(0x4AC1E551935C7E47L ^ l));
        this.y = (long)fL.d("t", (int)10701, (long)(0x41B900C4C592690CL ^ l));
        this.z = new LinkedHashMap();
        this.A = new HashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l6;
        objectArray[0] = this::lambda$new$5;
        fL.h("W", (Object)this.l, (Object)objectArray, (long)-7297608554557436529L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$9;
        fL.h("W", (Object)this.u, (Object)objectArray2, (long)-7307439227026189969L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l6;
        objectArray3[0] = this::lambda$new$6;
        fL.h("W", (Object)this.m, (Object)objectArray3, (long)-7297608554557436529L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l3;
        objectArray4[0] = this::lambda$new$3;
        fL.h("W", (Object)this.j, (Object)objectArray4, (long)-7308210892872282065L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l5;
        objectArray5[0] = this::lambda$new$4;
        fL.h("W", (Object)this.k, (Object)objectArray5, (long)-7308288118418753503L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l3;
        objectArray6[0] = this::lambda$new$0;
        fL.h("W", (Object)this.g, (Object)objectArray6, (long)-7308210892872282065L, (long)l);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l6;
        objectArray7[0] = this::lambda$new$2;
        fL.h("W", (Object)this.i, (Object)objectArray7, (long)-7297608554557436529L, (long)l);
        Object[] objectArray8 = new Object[2];
        objectArray8[1] = l4;
        objectArray8[0] = this::lambda$new$7;
        fL.h("W", (Object)this.r, (Object)objectArray8, (long)-7307439227026189969L, (long)l);
        Object[] objectArray9 = new Object[2];
        objectArray9[1] = l4;
        objectArray9[0] = this::lambda$new$8;
        fL.h("W", (Object)this.s, (Object)objectArray9, (long)-7307439227026189969L, (long)l);
        Object[] objectArray10 = new Object[2];
        objectArray10[1] = l4;
        objectArray10[0] = this::lambda$new$10;
        fL.h("W", (Object)this.v, (Object)objectArray10, (long)-7307439227026189969L, (long)l);
        Object[] objectArray11 = new Object[2];
        objectArray11[1] = l3;
        objectArray11[0] = this::lambda$new$1;
        fL.h("W", (Object)this.h, (Object)objectArray11, (long)-7308210892872282065L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                fL.B = hc.a(1596070207265691378L, -7675241761214000724L, MethodHandles.lookup().lookupClass()).a(140545619557164L);
                                fL.L = new Object[205];
                                fL.M = new String[205];
                                fL.f();
                                fL.E = new HashMap<K, V>(13);
                                var22 = fL.B ^ 124767925198947L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[19];
                                var29_4 = 0;
                                var28_5 = "5_\u001f\u009am!\u0083Q\u00c2\u00e4\u0005\u00db<\u00d5\u0099\u00c6\u0018\nYP\u00e7#j\u00ee\u00e0\u0099\u0087~*\u0016\u0082\u00a6\u00c0\u00cd\u00b6Be\u00c3\u00b9\u001b\u00fa\u0018l\u00dc\u0013g\u0083\u001eO\u00af\u0088P^\u00e4\u00d8p\u0010\u00a4\u00cc\u00c0\u00d0\u0098\u0088yU\u0099\u00102I\u00berF\u00e5\u009c\u00a6\u001a\u00e2`\u00e2\u00d0\u00bb\u00ce(\u0018$\u00d3\u008e\u00db@\u0007\u00a1Ae\u00db\u0019B\u00c8-\u00d9\u00f3\u00d9\n\u00f1\u00f6\u0006\u0094\u00b7&\u00181\u00e8\u00f5#\u00a0\u00eeoXz\u00a6U\u00a5k\u008b\u00f4\u0006\u00ed\u0012\u0007\u00e3X\u0082P\u00b4\u0010n\u00902\u00ed\u0001\u0013\u00dcj\u00938\u00b6dX\u00c0gs\u0010\u00a8k+\u0004\u00dd.\u00829p\u00fb\u000b\u000e\u00d8\u00ff#)\u0010\u00ab\u00f6\u0006.,W\u00d9\u00be\u00f2\u00fcT\u0096\u00dd\u00b5\u001a\u0087 ,N\u0090\u00e833}\u00bd\u00c1\u00d6\u00b4\u00b09\u00e3\u00cdv\u00d9D\u0005\u00f5\u00ab\u00bfF3\u0018CE.@\u00bdr5 \u00bb\u009d\bb\u00b3\u00c4\u009enBG\u008f\u00d2y#\u0000\r\u00f7%\u00b7{\u00f6\u00f8L\u0012\u00fa\u00ec\u0091\u00b9\u00c1\u00e4\u00fd\u00be\u0010\u008f,\u00c8\u0097o\u00a0T\u00d9}\u0083\rX\u001f\u00e5\u00c1\u00b3\u0010\u00b2\u00c5\u00f9\u00e3\u00ee\u009a\u00e8\u00db\u00a6{(\u00c8Z\u00efd(\u0010\u0081c\u0002\u0089\u00dc\u00ec\u00b7\u00d8+\u0014f\u00b7\u00a18U\u00e8\u0018 s\u0090'D2n0l\u00d1\u0003\u0084\u00ed8\u0012\u0000\u0011\u00a1\u00a9yxE\u00f1\u00a1\u0010,\u00b5\u00ebn\u00e3u\u00de\u00ec?\u00d3M6\u009bC\u00eba\u0010\u00eb=\u001d+~F;=\u008f\u0091\u00be0W3h\u009e";
                                var30_6 = "5_\u001f\u009am!\u0083Q\u00c2\u00e4\u0005\u00db<\u00d5\u0099\u00c6\u0018\nYP\u00e7#j\u00ee\u00e0\u0099\u0087~*\u0016\u0082\u00a6\u00c0\u00cd\u00b6Be\u00c3\u00b9\u001b\u00fa\u0018l\u00dc\u0013g\u0083\u001eO\u00af\u0088P^\u00e4\u00d8p\u0010\u00a4\u00cc\u00c0\u00d0\u0098\u0088yU\u0099\u00102I\u00berF\u00e5\u009c\u00a6\u001a\u00e2`\u00e2\u00d0\u00bb\u00ce(\u0018$\u00d3\u008e\u00db@\u0007\u00a1Ae\u00db\u0019B\u00c8-\u00d9\u00f3\u00d9\n\u00f1\u00f6\u0006\u0094\u00b7&\u00181\u00e8\u00f5#\u00a0\u00eeoXz\u00a6U\u00a5k\u008b\u00f4\u0006\u00ed\u0012\u0007\u00e3X\u0082P\u00b4\u0010n\u00902\u00ed\u0001\u0013\u00dcj\u00938\u00b6dX\u00c0gs\u0010\u00a8k+\u0004\u00dd.\u00829p\u00fb\u000b\u000e\u00d8\u00ff#)\u0010\u00ab\u00f6\u0006.,W\u00d9\u00be\u00f2\u00fcT\u0096\u00dd\u00b5\u001a\u0087 ,N\u0090\u00e833}\u00bd\u00c1\u00d6\u00b4\u00b09\u00e3\u00cdv\u00d9D\u0005\u00f5\u00ab\u00bfF3\u0018CE.@\u00bdr5 \u00bb\u009d\bb\u00b3\u00c4\u009enBG\u008f\u00d2y#\u0000\r\u00f7%\u00b7{\u00f6\u00f8L\u0012\u00fa\u00ec\u0091\u00b9\u00c1\u00e4\u00fd\u00be\u0010\u008f,\u00c8\u0097o\u00a0T\u00d9}\u0083\rX\u001f\u00e5\u00c1\u00b3\u0010\u00b2\u00c5\u00f9\u00e3\u00ee\u009a\u00e8\u00db\u00a6{(\u00c8Z\u00efd(\u0010\u0081c\u0002\u0089\u00dc\u00ec\u00b7\u00d8+\u0014f\u00b7\u00a18U\u00e8\u0018 s\u0090'D2n0l\u00d1\u0003\u0084\u00ed8\u0012\u0000\u0011\u00a1\u00a9yxE\u00f1\u00a1\u0010,\u00b5\u00ebn\u00e3u\u00de\u00ec?\u00d3M6\u009bC\u00eba\u0010\u00eb=\u001d+~F;=\u008f\u0091\u00be0W3h\u009e".length();
                                var27_7 = 16;
                                var26_8 = -1;
lbl32:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = fL.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00d3\u0007\u00aa\u00c2\u00d5\u00a7\f\u00aa\u001b\u00a3b\u00c1\u00a8W\u00e3|Q\u001d\u00a8P0\u00cb}f\u00b9T\u00c4W\u008dS\u00eb\f\u0010=\u0019\u00ce\u00f1o940\u0018\u00f1\u001a\u0016v\u00a8\u00aa\u00d4";
                                    var30_6 = "\u00d3\u0007\u00aa\u00c2\u00d5\u00a7\f\u00aa\u001b\u00a3b\u00c1\u00a8W\u00e3|Q\u001d\u00a8P0\u00cb}f\u00b9T\u00c4W\u008dS\u00eb\f\u0010=\u0019\u00ce\u00f1o940\u0018\u00f1\u001a\u0016v\u00a8\u00aa\u00d4".length();
                                    var27_7 = 32;
                                    var26_8 = -1;
lbl46:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = fL.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block27;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
                            switch (v5) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl63:
                                // 1 sources

                                ** continue;
                            }
                        }
                        fL.C = var31_3;
                        fL.D = new String[19];
                        fL.H = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[16];
                        var14_13 = 0;
                        var15_14 = "[\u00a6\u0099\u00f6\u00a4f\u000fX=H\u00e0\u00c5\u00e7\u0097\u009b;WU\u0091O\u00c9M%\nw\u0093\u00a0<n;\u00f3\u00dc$7\u008f'\u00b3\u009b\u00da\u00b4\u00d5\u00c0\u00dd\u001aA\u00a9\u00c34\u00ca\u0002\u00b5\u0010\"b\u0006\u00a8\u001aM/\u00e8\u00897\u00a0\u00f7\u009f7r\u0093\u00dc\u00ffG6\u00ed\u0018\u00b0?\u00d2\u0096\u00d6\u00de\u00cct\u0018\u00cfDnB\u00c0`\u0087~\n\u0013\u00ac\u00a1\"\u0002\u00b7<<\t\u00ad\u00a4\u0097v\u00b1\u008e\u00ceHi%A";
                        var16_15 = "[\u00a6\u0099\u00f6\u00a4f\u000fX=H\u00e0\u00c5\u00e7\u0097\u009b;WU\u0091O\u00c9M%\nw\u0093\u00a0<n;\u00f3\u00dc$7\u008f'\u00b3\u009b\u00da\u00b4\u00d5\u00c0\u00dd\u001aA\u00a9\u00c34\u00ca\u0002\u00b5\u0010\"b\u0006\u00a8\u001aM/\u00e8\u00897\u00a0\u00f7\u009f7r\u0093\u00dc\u00ffG6\u00ed\u0018\u00b0?\u00d2\u0096\u00d6\u00de\u00cct\u0018\u00cfDnB\u00c0`\u0087~\n\u0013\u00ac\u00a1\"\u0002\u00b7<<\t\u00ad\u00a4\u0097v\u00b1\u008e\u00ceHi%A".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block28;
                            break;
                        }
lbl102:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00a7\u008f\u00aaW\u001f\u00b6n\u00cf>\u00c8\u0010\u00d0\u0001\u001e\u009f\u00ae";
                            var16_15 = "\u00a7\u008f\u00aaW\u001f\u00b6n\u00cf>\u00c8\u0010\u00d0\u0001\u001e\u009f\u00ae".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl121:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block29;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl134:
                        // 1 sources

                        ** continue;
                    }
                }
                fL.F = var17_12;
                fL.G = new Integer[16];
                fL.K = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[5];
                var3_23 = 0;
                var4_24 = "\u0086Y!{D\u0097k\u00a4\u00b8\u00b2+\u00ber\u00deJ\u0007\u00d6\u00fc\u0097\u00b9P\u00e5\u00d7/";
                var5_25 = "\u0086Y!{D\u0097k\u00a4\u00b8\u00b2+\u00ber\u00deJ\u0007\u00d6\u00fc\u0097\u00b9P\u00e5\u00d7/".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v18 = var6_22;
                    v19 = var3_23++;
                    v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v21 = -1;
                    break block30;
                    break;
                }
lbl173:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "\u0012\u00f0\u00ee\u00db18\u00d87\u00f8\u008e\u00da:\u00d9\u00f9\u00a6\u00a4";
                    var5_25 = "\u0012\u00f0\u00ee\u00db18\u00d87\u00f8\u008e\u00da:\u00d9\u00f9\u00a6\u00a4".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v18 = var6_22;
                        v19 = var3_23++;
                        v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v21 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl192:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    break block31;
                    break;
                }
            }
            var8_28 = v20;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v22 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl205:
                // 1 sources

                ** continue;
            }
        }
        fL.I = var6_22;
        fL.J = new Long[5];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fL.h("W", (Object)this.A, (long)3985102429512052115L, (long)l);
        fL.h("W", (Object)this.z, (long)3985102429512052115L, (long)l);
        this.x = (long)fL.d("t", (int)10701, (long)(0x41B95DCDF867C4E1L ^ l));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fL.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x8F7;
        if (D[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])E.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    E.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fL", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = C[n2].getBytes("ISO-8859-1");
            fL.D[n2] = fL.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return D[n2];
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static float b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = B ^ l) ^ 0x2132C8C36510L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(f11);
        return f + (f10 - f) * fL.h("\u00db", (Object)objectArray2, (long)-6619024462735541864L, (long)l);
    }

    private static Color b(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        Color color2 = (Color)objectArray[1];
        Object object = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x258AF541B01DL;
        long l4 = l2 ^ 0x573B486FC9DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = Float.valueOf(object);
        object = fL.h("\u00db", (Object)objectArray2, (long)8154194739923790997L, (long)l);
        CallSite callSite = fL.h("\u00db", (float)((float)fL.h("W", (Object)color, (long)8147844914937453127L, (long)l) + (float)(fL.h("W", (Object)color2, (long)8147844914937453127L, (long)l) - fL.h("W", (Object)color, (long)8147844914937453127L, (long)l)) * object), (long)8151704748581985208L, (long)l);
        CallSite callSite2 = fL.h("\u00db", (float)((float)fL.h("W", (Object)color, (long)8154136657183548992L, (long)l) + (float)(fL.h("W", (Object)color2, (long)8154136657183548992L, (long)l) - fL.h("W", (Object)color, (long)8154136657183548992L, (long)l)) * object), (long)8151704748581985208L, (long)l);
        CallSite callSite3 = fL.h("\u00db", (float)((float)fL.h("W", (Object)color, (long)8159859785183100985L, (long)l) + (float)(fL.h("W", (Object)color2, (long)8159859785183100985L, (long)l) - fL.h("W", (Object)color, (long)8159859785183100985L, (long)l)) * object), (long)8151704748581985208L, (long)l);
        CallSite callSite4 = fL.h("\u00db", (float)((float)fL.h("W", (Object)color, (long)8152383416794541673L, (long)l) + (float)(fL.h("W", (Object)color2, (long)8152383416794541673L, (long)l) - fL.h("W", (Object)color, (long)8152383416794541673L, (long)l)) * object), (long)8151704748581985208L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = (int)callSite;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l4;
        objectArray4[0] = (int)callSite2;
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = (int)callSite3;
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l4;
        objectArray6[0] = (int)callSite4;
        return new Color((int)fL.h("\u00db", (Object)objectArray3, (long)8153473779608607285L, (long)l), (int)fL.h("\u00db", (Object)objectArray4, (long)8153473779608607285L, (long)l), (int)fL.h("\u00db", (Object)objectArray5, (long)8153473779608607285L, (long)l), (int)fL.h("\u00db", (Object)objectArray6, (long)8153473779608607285L, (long)l));
    }

    private void s(Object[] objectArray) {
        int n;
        int n2;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        float f;
        float f10;
        float f11;
        float f12;
        cA cA2;
        Matrix4f matrix4f;
        gK gK2;
        aq_0 aq_02;
        block2: {
            int n3;
            block3: {
                aq_02 = (aq_0)objectArray[0];
                gK2 = (gK)objectArray[1];
                matrix4f = (Matrix4f)objectArray[2];
                cA2 = (cA)objectArray[3];
                f12 = ((Float)objectArray[4]).floatValue();
                f11 = ((Float)objectArray[5]).floatValue();
                f10 = ((Float)objectArray[6]).floatValue();
                float f13 = ((Float)objectArray[7]).floatValue();
                f = ((Float)objectArray[8]).floatValue();
                l6 = (Long)objectArray[9];
                long l7 = l6 = B ^ l6;
                l5 = l7 ^ 0x3C6D3FE50C76L;
                l4 = l7 ^ 0x5C8B9C6291BAL;
                l3 = l7 ^ 0x502F7CB8A093L;
                l2 = l7 ^ 0x28F90C9F89E3L;
                l = l7 ^ 0x3AEFC4067B51L;
                n3 = (int)f13;
                n2 = (int)(f13 * 10.0f) - n3 * fL.c("j", (int)4478, (long)(0x7EA2B1D72FC6D91EL ^ l6));
                CallSite callSite = fL.h("\u00db", (long)1547886747925369493L, (long)l6);
                try {
                    n = n2;
                    if (callSite != null) break block2;
                    if (n >= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)1532572081022925988L, (long)l6);
                }
                n2 = -n2;
            }
            n = n3;
        }
        String string = n + "." + n2 + "m";
        float f14 = 0.75f;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = string;
        reference var28_22 = fL.h("W", (Object)cA2, (Object)objectArray2, (long)1536983731649523632L, (long)l6) * f14;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        reference var29_23 = fL.h("W", (Object)cA2, (Object)objectArray3, (long)1533298076821296873L, (long)l6) * f14;
        float f15 = 3.5f;
        float f16 = 1.5f;
        reference var32_26 = var28_22 + f15 * 2.0f;
        float f17 = (f12 + f10) * 0.5f;
        float f18 = f17 - var32_26 * 0.5f;
        float f19 = f18 + var32_26;
        float f20 = f11 + 3.0f;
        float f21 = f20 + var29_23 + f16 * 2.0f;
        Object[] objectArray4 = new Object[9];
        objectArray4[8] = l4;
        objectArray4[7] = Float.valueOf(f);
        objectArray4[6] = Float.valueOf(f21);
        objectArray4[5] = Float.valueOf(f19);
        objectArray4[4] = Float.valueOf(f20);
        objectArray4[3] = Float.valueOf(f18);
        objectArray4[2] = matrix4f;
        objectArray4[1] = gK2;
        objectArray4[0] = aq_02;
        fL.h("W", (Object)this, (Object)objectArray4, (long)1548204724002108200L, (long)l6);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l2;
        objectArray5[1] = Float.valueOf(f);
        objectArray5[0] = new Color((int)fL.c("j", (int)13718, (long)(0x110CCFF18B7A7DF2L ^ l6)), (int)fL.c("j", (int)20224, (long)(0x8C8216742D18767L ^ l6)), (int)fL.c("j", (int)19664, (long)(0x5077DFCC77D684B2L ^ l6)));
        CallSite callSite = fL.h("\u00db", (Object)objectArray5, (long)1534269863061915376L, (long)l6);
        Object[] objectArray6 = new Object[7];
        objectArray6[6] = l;
        objectArray6[5] = callSite;
        objectArray6[4] = Float.valueOf(f14);
        objectArray6[3] = Float.valueOf(f20 + f16);
        objectArray6[2] = Float.valueOf(f18 + f15);
        objectArray6[1] = string;
        objectArray6[0] = matrix4f;
        fL.h("W", (Object)cA2, (Object)objectArray6, (long)1531699437108656348L, (long)l6);
    }

    private static Color c(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        Color color2 = (Color)objectArray[1];
        long l = (Long)objectArray[2];
        l = B ^ l;
        return new Color((int)((fL.h("W", (Object)color, (long)7397964179873648127L, (long)l) + fL.h("W", (Object)color2, (long)7397964179873648127L, (long)l)) / 2), (int)((fL.h("W", (Object)color, (long)7390825799379956216L, (long)l) + fL.h("W", (Object)color2, (long)7390825799379956216L, (long)l)) / 2), (int)((fL.h("W", (Object)color, (long)7387462237560674177L, (long)l) + fL.h("W", (Object)color2, (long)7387462237560674177L, (long)l)) / 2), (int)((fL.h("W", (Object)color, (long)7393566402620029393L, (long)l) + fL.h("W", (Object)color2, (long)7393566402620029393L, (long)l)) / 2));
    }

    private static int c(Object[] objectArray) {
        Object object;
        block10: {
            int n;
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    block9: {
                        n = (Integer)objectArray[0];
                        l = (Long)objectArray[1];
                        l = B ^ l;
                        callSite = fL.h("\u00db", (long)9155258031961356512L, (long)l);
                        try {
                            try {
                                object = n;
                                if (callSite != null) break block8;
                                if (object >= 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fL.h("\u00db", (Object)matchException, (long)9165381971041588945L, (long)l);
                            }
                            object = 0;
                            break block10;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)9165381971041588945L, (long)l);
                        }
                    }
                    object = n;
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object <= fL.c("j", (int)31155, (long)(0x53FDFDF981A0DBA5L ^ l))) break block11;
                    }
                    catch (MatchException matchException) {
                        throw fL.h("\u00db", (Object)matchException, (long)9165381971041588945L, (long)l);
                    }
                    object = fL.c("j", (int)31155, (long)(0x53FDFDF981A0DBA5L ^ l));
                    break block10;
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)9165381971041588945L, (long)l);
                }
            }
            object = n;
        }
        return object;
    }

    private static float c(Object[] objectArray) {
        float f;
        block8: {
            float f10;
            float f11;
            block6: {
                CallSite callSite;
                long l;
                block7: {
                    f11 = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = B ^ l;
                    callSite = fL.h("\u00db", (long)3714944491763692640L, (long)l);
                    try {
                        try {
                            float f12 = f11 - 0.0f;
                            f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (callSite != null) break block6;
                            if (f10 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)3724998811554372177L, (long)l);
                        }
                        f = 0.0f;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw fL.h("\u00db", (Object)matchException, (long)3724998811554372177L, (long)l);
                    }
                }
                try {
                    f = f11;
                    if (callSite != null) break block8;
                    float f13 = f - 1.0f;
                    f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)3724998811554372177L, (long)l);
                }
            }
            f = f10 > 0 ? 1.0f : f11;
        }
        return f;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5D02;
        if (G[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = F[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])H.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    H.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fL.G[n2] = n3;
        }
        return G[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fL.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void n(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        long l = (Long)objectArray[7];
        long l2 = (l = B ^ l) ^ 0x349003F66105L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = color2;
        objectArray2[4] = Float.valueOf(f12 + 0.5f);
        objectArray2[3] = Float.valueOf(f11 + 0.5f);
        objectArray2[2] = Float.valueOf(f10 - 0.5f);
        objectArray2[1] = Float.valueOf(f - 0.5f);
        objectArray2[0] = matrix4f;
        fL.h("\u00db", (Object)objectArray2, (long)6701256348266179874L, (long)l);
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = l2;
        objectArray3[5] = color;
        objectArray3[4] = Float.valueOf(f12);
        objectArray3[3] = Float.valueOf(f11);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = matrix4f;
        fL.h("\u00db", (Object)objectArray3, (long)6701256348266179874L, (long)l);
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fL.m(l, l2);
            object = L[n];
            try {
                if (!(object instanceof String)) break block2;
                fL.L[n] = clazz = Class.forName(M[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fL.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fL.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fL.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fL.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void f() {
        Object[] objectArray = L;
        L[0] = "G\u0003\u0018Nb\u000bY\u000b\u0002\u0001\u0001\u001f]";
        objectArray[1] = Void.TYPE;
        fL.M[1] = "java/lang/Void";
        objectArray[2] = "RRF,\tODRCv\u001aXS\u0019@p\u0016LB^Wg][w";
        objectArray[3] = "bG\u00133:c\u0017g\u0018<+,vi\u00137/v\u0002";
        objectArray[4] = "\u0001SwQ:R\u0017Sr\u000b)E\u0000\u0018q\r%Q\u0011_f\u001anF6";
        objectArray[5] = "JebSr$?Ei\\ck^KbWg1*";
        objectArray[6] = Boolean.TYPE;
        fL.M[6] = "java/lang/Boolean";
        objectArray[7] = "[/9_?EM/<\u0005,RZd?\u0003 FK#(\u0014kTw";
        objectArray[8] = "G?ftV=2\u001fm{GrO\u0007~|N;'";
        objectArray[9] = "S\u0015\u0002n%4S\u0015\u00152);I^\u0015,).N/Dt{";
        objectArray[10] = Double.TYPE;
        fL.M[10] = "java/lang/Double";
        objectArray[11] = "wNiq=\naNl+.\u001dv\u0005o-\"\tgBx:i\u001c_";
        objectArray[12] = "ag|z4'jhm5W*\u007feb^b(nv~ru%";
        objectArray[13] = "#wQ\u0016FT5wTLUC\"<WJYW3{@]\u0012@\u0005";
        objectArray[14] = "Z\u0002\u0000\r*\u0018/\"\u000b\u0002;WN,\u0000\t?\r:";
        objectArray[15] = "a;\u0005*n\u0017\u0014\u001b\u000e%\u007fXu\u0015\u0005.{\u0002\u0001";
        objectArray[16] = Float.TYPE;
        fL.M[16] = "java/lang/Float";
        objectArray[17] = "ZUk^W\u0004QZz\u00114\tD\\";
        objectArray[18] = Integer.TYPE;
        fL.M[18] = "java/lang/Integer";
        objectArray[19] = "r\u0002`Q&wy\rq\u001e[oj\nxW";
        objectArray[20] = "B\u0010:`V7701oGxV>:dC\"\"";
        objectArray[21] = "\f\u0016=$\u001f;y66+\u000et\u00188= \n.l";
        objectArray[22] = "\fd\np\u0014J\u0011qRRUG\tw";
        objectArray[23] = "G1,li\u00122\u0011'cx]S\u001f,h|\u0007'";
        objectArray[24] = "Xd\u001b\u000e?\u0010Nd\u001eT,\u0007Y/\u001dR \u0013Hh\nEk\u0003}";
        objectArray[25] = "ci<nk!\u0016I7aznwG<j~4\u0003";
        objectArray[26] = "V cbl(]/r-\u0000+S-pb,";
        objectArray[27] = "~.s9?$\u000b\u000ex6.kj\u0000s=*1\u001e";
        objectArray[28] = ")\u001e\u001fA&<\\>\u0014N7s=0\u001fE3)I";
        objectArray[29] = "9m\\\"nY/mYx}N8&Z~qZ)aMi:M\u0016";
        objectArray[30] = "T\u0013s d\t_\u001cbo\u0005\u0007T\u0017f5";
        objectArray[31] = "\f%\nVL\u0001y\u0005\u0001Y]N\u0018\u000b\nRY\u0014l";
        objectArray[32] = "]%~ `\u001b(\u0005u/qTI\u000b~$u\u000e=";
        objectArray[33] = "H$yn/t=\u0004ra>;\\\nyj:a(";
        objectArray[34] = "Em+\u001d\u0013n0M \u0012\u0002!QC+\u0019\u0006{%";
        objectArray[35] = "\u007f/wX~x\n\u000f|Wo7k\u0001w\\km\u001f";
        objectArray[36] = "\u0006oV \u000f*sO]/\u001ee\u0012AV$\u001a?f";
        objectArray[37] = "\u0003E{ m/vep/|`\u0017k{$x:c";
        objectArray[38] = "=g$W}\u0007HG/XlH)I$Sh\u0012]";
        objectArray[39] = "oo'[#E\u001aO,T2\n{A'_6P\u000f";
        objectArray[40] = "\u001e=\r\t}5\u00152\u001cF\u00155\u001b=\u000f";
        objectArray[41] = "Br*\u001d\u007fd7R!\u0012n+V\\*\u0019jq\"";
        objectArray[42] = "}XQV!<\bxZY0sivQR4)\u001d";
        objectArray[43] = "U\u001aNb&. :Em7aA4Nf3;5";
        objectArray[44] = "\u00122ev2&g\u0012ny#i\u0006\u001cer'3r";
        objectArray[45] = "h\n~]\u000f[\u001d*uR\u001e\u0014|$~Y\u001aN\b";
        objectArray[46] = "(\u0004\u0005y\u000fe>\u0004\u0000#\u001cr)O\u0003%\u0010f8\b\u00142[q'";
        objectArray[47] = "8\rE?(lM-N09#,#E;=yX";
        objectArray[48] = "S\u001f\u007f\u000b}%E\u001fzQn2RTyWb&C\u0013n@)1S";
        objectArray[49] = "Db\\\u0004L\u00111BW\u000b]^PL\\\u0000Y\u0004$";
        objectArray[50] = "<1\u007fD9\u0019<1h\u00185\u0016&zh\u00065\u0003!\u000b<^b";
        objectArray[51] = "\u0003k_K\\'\u0003kH\u0017P(\u0019 H\tP=\u001eQ\u001aW\by";
        objectArray[52] = "'P\t?rw'P\u001ec~x=\u001b\u001e}~m:jL'*)";
        objectArray[53] = "<Ipv\u0003><Ig*\u000f1&\u0002g4\u000f$!s7i^";
        objectArray[54] = "\u0016P[)X\t\u0016PLuT\u0006\f\u001bLkT\u0013\u000bj\u00194\r";
        objectArray[55] = "U\u000bjH\u0012\nK\u0003p\u0007p\u0016L\u001e";
        objectArray[56] = "<>\u001enOi*>\u001b4\\~=u\u00182Pj,2\u000f%\u001bz42\r.A7\b)\r3Ap?>";
        objectArray[57] = ",\u0017|BD :\u0017y\u0018W7-\\z\u001e[#<\u001bm\t\u00106\u001e";
        objectArray[58] = "U\u0006ck\u0001|U\u0006t7\rsOMt)\rfH<%pZ$";
        objectArray[59] = "\u0011&n\u001fN\u0018\u000f.tP)\u0019\u001e5y\n\u000f\u001f";
        objectArray[60] = "f+\u001c\u0010W!p+\u0019JD6g`\u001aLH\"v'\r[\u00030k";
        objectArray[61] = "Bhqt)E7Hz{8\nVFqp<P\"";
        objectArray[62] = "0A\u0019F\u001d\u001b;N\b\tz\u0019.E\bBA";
        objectArray[63] = "W6\u0013`sNI>\t/\u001eTP'\u0004s<OR%";
        objectArray[64] = ">\u001b$?l- \u0013>p\u0017\r\u001d>";
        objectArray[65] = "$[\u001c\u000e\u0000}Q{\u0017\u0001\u001120u\u001c\n\u0015hD";
        objectArray[66] = "U'|4{\nK/f{3\nQ%~<:\u0011\u0011\u0012e\u0011:\n]*o\u0013 \u0011\\2c:;";
        objectArray[67] = "H\u0010D2c$=0O=rk\\>D6v1(";
        objectArray[68] = "B^UIGdT^P\u0013TsC\u0015S\u0015XgRRD\u0002\u0013vl";
        objectArray[69] = "( \u0018U}n]\u0000\u0013Zl!<\u000e\u0018Qh{H";
        objectArray[70] = "\"q\rY\u0012_\"q\u001a\u0005\u001eP8:\u001a\u001b\u001eE?KMAO\u0002";
        objectArray[71] = "?\u000b()'F?\u000b?u+I%@?k+\\\"1m7~\u001e";
        objectArray[72] = "\u0002}.\u0013U%\u0002}9OY*\u001869QY?\u001fGh\u000e\u0000";
        objectArray[73] = "0Q\"1\r\u0011&Q'k\u001e\u00061\u001a$m\u0012\u0012 ]3zY\u0002\u001e";
        objectArray[74] = "Zm_\u001a'[DeEUZKD";
        objectArray[75] = "\u001apr2\u001a0\u001apen\u0016?\u0000;ep\u0016*\u0007J2/@";
        objectArray[76] = "mcjs@C{co)STl(l/_@}o{8\u0014VV";
        objectArray[77] = "\u0006:1cl\ns\u001a:l}E\u0012\u00141gy\u001ff";
        objectArray[78] = "\u0005\u0017\r\u0016\rX\u0013\u0017\bL\u001eO\u0004\\\u000bJ\u0012[\u0015\u001b\u001c]YL/";
        objectArray[79] = "yT(\u00161SoT-L\"Dx\u001f.J.PiX9]e@^";
        objectArray[80] = "MJ\u0014\u0017+R8j\u001f\u0018:\u001dYd\u0014\u0013>G-";
        objectArray[81] = "\u001c=\u001f\u0000\u0010ci\u001d\u0014\u000f\u0001,\b\u0013\u001f\u0004\u0005v|";
        objectArray[82] = "\u0010o\u000e\u0015\u0011\u001e\u000eg\u0014Zr\n\n*=\u001aK\u0019\u0003";
        objectArray[83] = ")Rue\u007f:\\r~jnu=|uaj/I";
        objectArray[84] = ">C";
        objectArray[85] = ";M~A4pNmuN%?/c~E!e[";
        objectArray[86] = "^Uqp;l+uz\u007f*#J{qt.y>";
        objectArray[87] = "/{Wy\u0014f$tF6is6nDu";
        objectArray[88] = Long.TYPE;
        fL.M[88] = "java/lang/Long";
        objectArray[89] = "YO\u0005vbY,o\u000eys\u0016Ma\u0005rwL9";
        objectArray[90] = "=mH\u000f\rjHMC\u0000\u001c%)CH\u000b\u0018\u007f]";
        objectArray[91] = "\f\tS{%Zy)Xt4\u0015\u0018'S\u007f0Ol";
        objectArray[92] = "7T\u0004h7]!T\u00012$J6\u001f\u00024(^'X\u0015#cI\u0001";
        objectArray[93] = "\u0006\u000ewo\u0001]s.|`\u0010\u0012\u0012 wk\u0014Hf";
        objectArray[94] = "_[\u000f\u007fW#I[\n%D4^\u0010\t#H OW\u001e4\u00037t";
        objectArray[95] = "MkZ'!\u000e8KQ(0AYEZ#4\u001b-";
        objectArray[96] = "\u0010R)I\u000bh\u0006R,\u0013\u0018\u007f\u0011\u0019/\u0015\u0014k\u0000^8\u0002_|9";
        objectArray[97] = "BeWX*\u00047E\\W;KVKW\\?\u0011\"";
        objectArray[98] = "U9+#\u001a\u0014 \u0019 ,\u000b[A\u0017+'\u000f\u00015";
        objectArray[99] = ".\u0015\u0013h2,t\u0015Wm HrAU18$@\u0016\u0013oos\u0017\u0015E8n,*O\u0011a?v\u0017";
        objectArray[100] = "e62\u001bxi5/7P\u0000tZptUaq (l\u0016d.Z9nR}`=94Q\u0000";
        objectArray[101] = "UPM~\\\\\u0005IH5$Yj\u0016\u000b0ED\u0010N\u0013s@\u001bj_\u00117YU\r_K4$";
        objectArray[102] = "E\\!H\u001b=\u0019\u001e<_\u0017Z\u0013gt\u0018\u0004?@\u001f?\u0018\u000b \u001f";
        objectArray[103] = "[B\u0010eA?\u000b[\u0015.9/d\u0004V+X'\u001e\\Nh]xdQ\u0010'\u00047\b\u0005E)^F";
        objectArray[104] = "(x\u0007K\u0019\u001b(w\u0019uG\u0010;\u0018\u0004MX\u001f}~QNA\u001cG|X\u0005JG!)[\u001cI}";
        objectArray[105] = "\u0002j\u007f\n.XRszAVD=,9D7@Gt!\u00072\u001f=e#C+QZey@V";
        objectArray[106] = "\u0002.\u0011\u00076ER7\u0014LNV=hWI/]G0O\n*\u0002=?O\u0017$@B3\u0011\u0018%<";
        objectArray[107] = "$N;S<AnF3NC]\u0015F#\u0013\"Fo\u001e;P'\u0019\u0015\u000f9\u0014>Wr\u000fc\u0017C";
        objectArray[108] = "o\u0019P\u0016\u0001m>KO\u001cl:0\u001aI\u001f;mjJ\u0014sS;4\u0019H\u0017\u0002o?\u0005";
        objectArray[109] = "\u001a 7uj\u0010E8dmS\u0001u\u007f%(2\u001e\u000f'=k7Au6?/.\u000f\u00126e,S";
        objectArray[110] = ".w^r\u0006\u001f/rQ:\u0004$r\"K\"\u0003H@r\u000b}[$.s^!\u001e^k.S-Y$";
        objectArray[111] = "C@\u001d*Mz\u0002\u0002\\?M\u0013\u0013:[/\u0003r\u001b@\u00037@wD:[*@i\bS\u001ah\u0001|\b:";
        objectArray[112] = "RNF ;#\u0002WCkC3m\b\u0000n\";\u0017P\u0018-'dm\b\u001a(3'\u0016OB9?5m";
        objectArray[113] = "\n\ns\u001am.B\u0013a\ri\u0012Zv(\u001e<sR\fp\u0006\u007fv\rv(\u001dbi^J`\u0004p~Zv";
        objectArray[114] = "=[6\\ohmB3\u0017\u0017j\u0002\u001dp\u0012vpxEhQs/\u0002Tj\u0015jaeT0\u0016\u0017";
        objectArray[115] = "ke\u001f5\u0012\nd5W1k[\u0014<P1\nQndHr\u000f\u000e\u0014uJ6\u0016@su\u00105k";
        objectArray[116] = ":\u0010\u0016X\t>|D\u0002B\u001bLhG\u0019E\u001c6bF\u0013q\u00121iD\u0011=L}y\u001fLO\u0004+m\u001c\u0016=L|iE\u0000O\n(}_\u0012=";
        objectArray[117] = "a\u0015%gb\u001d\u007fVqx\u0019\u0016\u0002Jpr{Ed\u001fskx\u007f";
        objectArray[118] = "\bj^\u0010xX\u0000`_\u0002\u001f\u001d\u0002c`Ep\u0003\r`\u0004\u0014$\b\u0011\u0005_\u0015z\b\u0006a\u000eAq\u0014c";
        objectArray[119] = "\u00020\nh\u001e5R)\u000f#f4=vL&\u0007-G.Te\u0002r=?V!\u001b<Z?\f\"f";
        objectArray[120] = "L\u0018\rC\fvK\u0016HNl'qD\u0003V\b1\u0018\u0006NX\u0017M";
        objectArray[121] = "\u0013\u001bH\u0002\u00128\u0012\u001eGJ\u0010\u0003ON]R\u0017o}\u0018\u0018\u000e@:*\u001f\u001eT\u001clP^\u001f[K\u0003";
        objectArray[122] = "KSjTe(\u001fY3UhW\u001b20H;6\u0013HhPx3L20Vd4\u0010Md\\=5\u001d2";
        objectArray[123] = "\"e0\u001fUa.;?\u001e)q!~\b\u0018E\u001e ;bHXrtnl\u0012)";
        objectArray[124] = "n&t} Z,e-/+#2rh$-O\u0000&$xw\u001dW&.!q\u001b(o*&&LW";
        objectArray[125] = "\u0004>3\u0005Yu^>w\u0000K\u0011SfdXXF\u000499\u00034(\u0004g0VMjG>b]";
        objectArray[126] = "i\u00032)Z@#\u000b:4%@X\u000b*iDG\"S2*A\u0018XB0nXV?Bjm%";
        objectArray[127] = "\u000bTQ\u001cvu[MTW\u000eu4\u0012\u0017RomNJ\u000f\u0011j24[\rUs|S[WV\u000e";
        objectArray[128] = "K\u0003j|.PC\tknI\u0003P\u0014T)&\u000bN\t0xr\u0000Rlky,\u0000E\b:-'\u001c ";
        objectArray[129] = "#p\u0015TCWy$L\u0005\u0019j\u007fq\u0000\u0005@\u0006M A]\u001djv%LXV\u0006\"pB\u0002'";
        objectArray[130] = "g]j~\u0012\u00018O|\u007f\tg7?9eH\u0006?Ea}\u000b\u0003`?o|\u0019\u0006gP0dJ\u001e^";
        objectArray[131] = "+\u0006_vy\n#\f^d\u001eQ!\u000fav\"S&T\u0005$$T;i\u000b yR}\rY&~O@\u0003]{x\t$Q[|e4";
        objectArray[132] = "\u0005bjgJ\u0014Ee*7D)Z2'!tM\u0004/5g\u0012\u0018\u000766]";
        objectArray[133] = "Ex^\u0005c^\u0005n\u0019\u0017'$\u0019~[\u0018:H+)\u001c@l\u001f|*J\u0011lN\raX\t>\u001b|/\u0018\u001e1K\u0006n\u0019\u0011f$";
        objectArray[134] = " ;=\u0011icqi\"\u001b\u00044\u007f8$\u0018Sc%hxt;5{;%\u0010jap'";
        objectArray[135] = "9\u0004E6Vei\u001d@}.u\u0006K\u001b<D\u007fz\n\u001b-_\u001c6\u001c\u0004.M`w\u001c\u00155.";
        objectArray[136] = "H\u0000E\u0015>\rH\u000f[+b\r[\u001aSpb\u0017'YLWu\u0006M\u000f\u001a\u0015pQ'";
        objectArray[137] = "\u001c\"\u0010\u0018a2C:C\u0000X6s}\u0002E9<\t%\u001a\u0006<cs.A\u001e>`\u0017|G\u0019#]";
        objectArray[138] = "u-bS\u0010m\"{>\u0019\n\u0007-t\u007f}\u0002c1\u007f\u0003OR7qco\u001b\u00079+\u0012";
        objectArray[139] = "\u0013D3Kb,\u0012A<\u0003`\u0017O\u0011&\u001bg{}EeE0.*\u0016f\u001cf*ND`\u001b{\u0017";
        objectArray[140] = "%BU\u0010\u0004\u0010$GZX\u0006+y\u0017@@\u0001GKG\u0002\u001eY+%JM\u0011\fOe@RM\u0018+";
        objectArray[141] = "#gEj/ns~@!W{\u001c!\u0003$6vfy\u001bg3)\u001cr@\u007f1*x Fx,\u0017";
        objectArray[142] = "=X\u0013\u0001+ !\u0001\fA\u001atM\u0006\rA{x7^\u0015\u0002~'MO\u0017Fgi*OME\u001a";
        objectArray[143] = "{\u0018an'\u0019xC+w\"(+&`u#I#\\8m`L|&e5yD-\\$4v\u0013B";
        objectArray[144] = " \\\u0015*6(iX\u0012}aWv\u000b\f\u0011bn)[\u0001}6;'\u0001pu6'{\\\u0016 5>xf";
        objectArray[145] = "f3\u001f{EG,;\u0017f:HW;\u0007;[@-c\u001fx^\u001fW<\u0016z_LnmDeU!";
        objectArray[146] = "5\u000fwUqyj\u0017$MHiZPe\b)w \b}K,(Z\u0019\u007f\u000f5f=\u0019%\fH";
        objectArray[147] = "Y{\u0006uGzX~\t=EA\u0005.\u0013%B-7}W{\u001eA\n\u007f\b#\u0018%Xy\u000f>%";
        objectArray[148] = "\u001eVNi?lNOK\"G~!\u0010\b'&t[H\u0010d#+!G\u0010y-i^KNv,\u0015";
        objectArray[149] = "t\u001cCL\tlxBLMu|w\u0007n\\\u0018~|{M\u001fE.k\u0017\u0019JKt\u001a";
        objectArray[150] = "\u0003B,Gc\u0000S[)\f\u001b\u0012<\u0004j\tz\u0018F\\rJ\u007fG<W)R}DX\u0005/U`y";
        objectArray[151] = "0\\Z~'\rj\\\u001e{5ig\u0004\r#&>0ZZ{J\u0018v\\\u0005yp\u0016mY\u0004";
        objectArray[152] = "\u001eX^5ACB\u001aC\"M$Kc\u000b0\u0004T\u001a\bH<GI]";
        objectArray[153] = "BB(\nZB\u0002EhZT\u007f\u0001\u0012pW\u001a\u0012{\u000fp\u000b\u0019\u000f\u001c\u000f*\bd";
        objectArray[154] = "v \r\u0006:\u001dv/\u00138s\u0006e@\u000e\u0000{\u0019#&[\u0003b\u001a\u0019$RHiA\u007fqQQj{}x\u001aZ1\u001d({\u0003Y\u000b";
        objectArray[155] = "t\u001e7{1A1KrzClMH1\u007f\"F7\u0010)<'\u0019M\u0001+x>W*\u0001q{C";
        objectArray[156] = "%d?~u]\u007fd{{g9r<h#tn%b8z\u0018\u0000sb;xu^g98&";
        objectArray[157] = "\u0001xP-(eA\u007f\u0010}&XX,\u0016Q{(DEQ(p4W?\u0010)\u007fc8";
        objectArray[158] = ")((RSiuj5E_\u000eq\u0013}\u0007\u0017j(\"~\\]s-";
        objectArray[159] = "8gg0B^qc`g\u0015!z<pfzM8m?z\u0016\u0019mce\u000b";
        objectArray[160] = "\"20![N~p-6W)p\te(MM}o::[Lf";
        objectArray[161] = "[s\u0001\u0019wqZv\u000eQuJ\u0007&\u0014Ir&5uP\u0012/J\bw\u000fO(.Zq\bR\u0015";
        objectArray[162] = "s\u00149^@\fr\u00116\u0016B7/A,\u000eE[\u001d\u0011oP\u001d7v\u00136\u0002MM7\u00129U\"";
        objectArray[163] = "mk2}CUmd,C\u0019Wob/C\u0002V9v%$\u0002\f:\u000b";
        objectArray[164] = "y[:\u0003\"i2[5\u001c}\u0011)``\u0019\"p!\u001a8\u0001au~`eYx}/\u001a$Xw*@";
        objectArray[165] = "R\"y8\u001d\r\fz%|l\u0002T{{/\u0005\u000emu{?\u0001h\u000f#y.\u0003\u0012N\"vyl";
        objectArray[166] = "\u0017nE^\u0014W\u001fdDLs\u0000\u0016z{^O\u000e\u001a<\u001f\fI\t\u0007\u0001\u0011\b\u0014\u000fAeC\u000e\u0013\u0012|";
        objectArray[167] = "\u001e=%jm:]1fw*QNS%el0F)}}/5\u0019S%u6,Alyz(6\u001aS";
        objectArray[168] = "H(dAuy\r}!@\u0007`q~bEf~\u000b&z\u0006c!q7xBzo\u00167\"A\u0007";
        objectArray[169] = "gZt\nIS7CqA1@X\u001c2DPK\"D*\u0007U\u0014XOq\u001fW\u0017<\u001dw\u0018J*";
        objectArray[170] = "y\u0004_6\u001b\u0019)\u001e]kwNl\u0019Q7\f#q\\H1ME$_Q2w\u001f*\u0002T<\r^+\r\u0003S";
        objectArray[171] = "\u0005<eeQuU%`.)g:z#+Hm@\";hM2:/e'\u0014}V{0)N\f";
        objectArray[172] = "\u0012WylXBEMek\u0010=@M{+G[Wl`4GxJTe0Q=\u0012H<7L\\V]yhJ=";
        objectArray[173] = "vMtl\n\f&Tq'r\u0017I\u000b2\"\u0013\u00143S*a\u0016KIB(%\u000f\u0005.Br&r";
        objectArray[174] = "cn@\t,\u0005muE\b\u0012Z\u007fm\u0019\u000b~h/.B]\u0012Mk(\u0003\u000f+\u0004rj\u001elx\u0003uwD\b*\u0005rjy";
        objectArray[175] = "5\tU{~De\u0010P0\u0006Z\nO\u00135g\\p\u0017\u000bvb\u0003\n\u0006\t2{Mm\u0006S1\u0006";
        objectArray[176] = "D\u0013EW_\u001aE\u0016J\u001f]!\u0018FP\u0007ZM*\u0016\u001c]\f!DFEVWP\u000fT]\u0004\u0002!";
        objectArray[177] = "\u0006yzGG\u001dV`\u007f\f?\u00029?<\t^\u0005Cg$J[Z9v&\u000eB\u0014^v|\r?";
        objectArray[178] = "*Q/w:\u0002\"[.e]F&Cwq]V}Yw 9\u0004{^j\u001d1\u0005q\u0003`qeP\u007fY\u0011";
        objectArray[179] = ">Hh-%\r?Mge'6b\u001d}} ZPI>#w\f\u0007\u001a=z!\u000bcH;}<6";
        objectArray[180] = "\u0006\u0005oAKoCXbM\f\u0015PTzyMo^_i\"]uX\\j\u0018\roZ\u0001\u0006";
        objectArray[181] = "czRI3W9.\u000b\u0018ij?{G\u00180\u0006\r*\u0007Hij6/\u000bE&\u0006bz\u0005\u001fW";
        objectArray[182] = "cr)\u0015\u0017u5$k\u0010@\u001f;`8\u0015\u0013c=fUVG\"`\"h\u0016@b0,U";
        objectArray[183] = "U>\u001e{b\u0019\u0005'\u001b0\u001a\u0003jxX5{\u0001\u0010 @v~^j1B2g\u0010\r1\u00181\u001a";
        objectArray[184] = "\b^'\u0003\fkXD%^`1\rE -\u0007=\t>,_Pl\u0015Rx\n^6d";
        objectArray[185] = "(3\u0004MgVt<\u001aW<i{\\[O=\bp&\u0003W~\r/\\[Qb\ns#\u000f[;\u000b~\\";
        objectArray[186] = "S^O!\u0019\u0017\u0003GJja\u0014l\u0018\to\u0000\u000f\u0016@\u0011,\u0005PlQ\u0013h\u001c\u001e\u000bQIka";
        objectArray[187] = "sNf`\u0014\nrKi(\u00161/\u001bs0\u0011]\u001dH7nI1 Jh6KUrLo+v";
        objectArray[188] = "5k\u0003BT095\fC( 6p(LP/2\f\r\u0011\u0018r*`YD\u0016([";
        objectArray[189] = "qR^\u0018\r\u001a,Y\u001a\u001aN*!8\u001f\u0001\tK)BG\u0019JNv8\u001f\u0015LWvB_\u0003\u000bE28";
        objectArray[190] = "*^f\u0010P7zDdM<s/Z|\u0018{cFR8E\u0001|*\u0006mK[\r*^f\u0010P7zDdM<";
        objectArray[191] = "\u00118\u001d*ivA!\u0018a\u0011f.~[dpnT&C'u1.)C:{sQ%\u001d5z\u000f";
        objectArray[192] = "\u0002\u001b.I\u0005qP\u001c6Vof9\u0018.\u0017\u000enC@6T\u000b19\u001dnM\u0003`C\\oBT\u000f";
        objectArray[193] = "HgXh\"^\u0002oPu]Ryo@(<Y\u00037Xk9\u0006yhQi8U@9\u0003v28";
        objectArray[194] = "5\u0014:\r\u000fR|\u0010=ZX-wI%J7\u0014<D:JERhP X7]i\u0015\"FP]3\u0016_";
        objectArray[195] = "\u001c\u0018\u000brCNOAU O<J\u0011KAKXX\u00117{\u001aLGFQ.\u0019UD|";
        objectArray[196] = "\u000e!\u001fY1 G%\u0018\u000ef_^w\u0016bmgGy@\u00048d^zz^69[t\u0000\u001f76\f\u001b";
        objectArray[197] = "L6a:E3\u0013.2\"|5#isg\u001d=Y1k$\u0018b#:0<\u001aaGh6;\u0007\\";
        objectArray[198] = "<|Au\"^0\"Nt^N?gi{#LRw\u001a/cP>#O!9!";
        objectArray[199] = "R_\u0004\u0014\u0016{W\u001d\b\u0010EB\u0002\"A\u0014E#\nX\u0019\f\u0006&U\"A\u0016\u0005=\u0004\u001bDT\t9W\"";
        objectArray[200] = "tp\u001c1QU=t\u001bf\u0006*,6\u0014p\u0000V*0y3T\u0017wtDsSW'zy";
        objectArray[201] = "|\u001f\\k\u001c2/F\u00029\u0010@*\u0016\u001cE\u00101E\u001fXv\u001fz#J[o\u001c@";
        objectArray[202] = "m7\\>\b4i5\u000b#r7s/\t ,0s5\r\\\u0018ep.]8Jcw3`";
        objectArray[203] = "4\u0018\u007fvF\u0005eJ`|+Rk\u001bf\u007f|\u00051K8\u0013\u0014So\u0018gwE\u0007d\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[204] = "\u0017~)\u001eKX\u001ft(\f,\u0003\u0015a\u0017\u001e\u0010\u0001\u001a,sL\u0016\u0006\u0007\u0011}HK\u0000Au/NL\u001d|{+\u0013J[\u0018)-\u0014Wf";
    }

    private void l(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x63EB84948C3L;
        long l4 = l2 ^ 0x3BBCF7924A94L;
        float f14 = f11 - f;
        float f15 = f12 - f10;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l4;
        objectArray2[2] = Float.valueOf(22.0f);
        objectArray2[1] = Float.valueOf(4.0f);
        objectArray2[0] = Float.valueOf((float)(fL.h("\u00db", (float)f14, (float)f15, (long)-1835319818612896176L, (long)l) * 0.28f));
        CallSite callSite = fL.h("\u00db", (Object)objectArray2, (long)-1836307439608517135L, (long)l);
        float f16 = f13 * 0.5f;
        Color color3 = new Color(0, 0, 0, (int)fL.h("\u00db", (float)(120.0f * ((float)fL.h("W", (Object)color, (long)-1835118120979367486L, (long)l) / 255.0f)), (long)-1834126081248031725L, (long)l));
        Object[] objectArray3 = new Object[8];
        objectArray3[7] = l3;
        objectArray3[6] = color3;
        objectArray3[5] = color;
        objectArray3[4] = Float.valueOf(f10 + f16);
        objectArray3[3] = Float.valueOf(f + callSite);
        objectArray3[2] = Float.valueOf(f10 - f16);
        objectArray3[1] = Float.valueOf(f - f16);
        objectArray3[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray3, (long)-1834354164907239887L, (long)l);
        Object[] objectArray4 = new Object[8];
        objectArray4[7] = l3;
        objectArray4[6] = color3;
        objectArray4[5] = color;
        objectArray4[4] = Float.valueOf(f10 + callSite);
        objectArray4[3] = Float.valueOf(f + f16);
        objectArray4[2] = Float.valueOf(f10 - f16);
        objectArray4[1] = Float.valueOf(f - f16);
        objectArray4[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray4, (long)-1834354164907239887L, (long)l);
        Object[] objectArray5 = new Object[8];
        objectArray5[7] = l3;
        objectArray5[6] = color3;
        objectArray5[5] = color;
        objectArray5[4] = Float.valueOf(f10 + f16);
        objectArray5[3] = Float.valueOf(f11 + f16);
        objectArray5[2] = Float.valueOf(f10 - f16);
        objectArray5[1] = Float.valueOf(f11 - callSite);
        objectArray5[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray5, (long)-1834354164907239887L, (long)l);
        Object[] objectArray6 = new Object[8];
        objectArray6[7] = l3;
        objectArray6[6] = color3;
        objectArray6[5] = color;
        objectArray6[4] = Float.valueOf(f10 + callSite);
        objectArray6[3] = Float.valueOf(f11 + f16);
        objectArray6[2] = Float.valueOf(f10 - f16);
        objectArray6[1] = Float.valueOf(f11 - f16);
        objectArray6[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray6, (long)-1834354164907239887L, (long)l);
        Object[] objectArray7 = new Object[8];
        objectArray7[7] = l3;
        objectArray7[6] = color3;
        objectArray7[5] = color2;
        objectArray7[4] = Float.valueOf(f12 + f16);
        objectArray7[3] = Float.valueOf(f + callSite);
        objectArray7[2] = Float.valueOf(f12 - f16);
        objectArray7[1] = Float.valueOf(f - f16);
        objectArray7[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray7, (long)-1834354164907239887L, (long)l);
        Object[] objectArray8 = new Object[8];
        objectArray8[7] = l3;
        objectArray8[6] = color3;
        objectArray8[5] = color2;
        objectArray8[4] = Float.valueOf(f12 + f16);
        objectArray8[3] = Float.valueOf(f + f16);
        objectArray8[2] = Float.valueOf(f12 - callSite);
        objectArray8[1] = Float.valueOf(f - f16);
        objectArray8[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray8, (long)-1834354164907239887L, (long)l);
        Object[] objectArray9 = new Object[8];
        objectArray9[7] = l3;
        objectArray9[6] = color3;
        objectArray9[5] = color2;
        objectArray9[4] = Float.valueOf(f12 + f16);
        objectArray9[3] = Float.valueOf(f11 + f16);
        objectArray9[2] = Float.valueOf(f12 - f16);
        objectArray9[1] = Float.valueOf(f11 - callSite);
        objectArray9[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray9, (long)-1834354164907239887L, (long)l);
        Object[] objectArray10 = new Object[8];
        objectArray10[7] = l3;
        objectArray10[6] = color3;
        objectArray10[5] = color2;
        objectArray10[4] = Float.valueOf(f12 + f16);
        objectArray10[3] = Float.valueOf(f11 + f16);
        objectArray10[2] = Float.valueOf(f12 - callSite);
        objectArray10[1] = Float.valueOf(f11 - f16);
        objectArray10[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray10, (long)-1834354164907239887L, (long)l);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == 's' || c == 'n' || c == '\u00dc') {
                field = fL.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fL.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00db' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = fL.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static float d(Object[] objectArray) {
        float f;
        block8: {
            float f10;
            float f11;
            float f12;
            block6: {
                CallSite callSite;
                long l;
                block7: {
                    f12 = ((Float)objectArray[0]).floatValue();
                    float f13 = ((Float)objectArray[1]).floatValue();
                    f11 = ((Float)objectArray[2]).floatValue();
                    l = (Long)objectArray[3];
                    l = B ^ l;
                    callSite = fL.h("\u00db", (long)6821950885644147010L, (long)l);
                    try {
                        try {
                            f10 = f12 == f13 ? 0 : (f12 < f13 ? -1 : 1);
                            if (callSite != null) break block6;
                            if (f10 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)6814941107090503539L, (long)l);
                        }
                        f = f13;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw fL.h("\u00db", (Object)matchException, (long)6814941107090503539L, (long)l);
                    }
                }
                try {
                    f = f12;
                    if (callSite != null) break block8;
                    float f14 = f - f11;
                    f10 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)6814941107090503539L, (long)l);
                }
            }
            f = f10 > 0 ? f11 : f12;
        }
        return f;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fL.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A4A;
        if (J[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = I[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])K.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    K.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fL", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            fL.J[n2] = l4;
        }
        return J[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bo_0 var1_1) {
        block71: {
            block70: {
                block69: {
                    block68: {
                        block66: {
                            block67: {
                                block65: {
                                    block64: {
                                        block62: {
                                            block63: {
                                                block61: {
                                                    v0 = var2_2 = fL.B ^ 39265227987668L;
                                                    var4_3 = v0 ^ 130533931549798L;
                                                    var6_4 = v0 ^ 42175718186260L;
                                                    var8_5 = v0 ^ 106025314889356L;
                                                    var10_6 = v0 ^ 1108207009493L;
                                                    var12_7 = v0 ^ 14024035016895L;
                                                    var14_8 = v0 ^ 102463369547017L;
                                                    var16_9 = v0 ^ 105753523339375L;
                                                    var18_10 = fL.h("\u00db", (long)-6319955015354683483L, (long)var2_2);
                                                    try {
                                                        try {
                                                            v1 = fL.b;
                                                            if (var18_10 != null) break block61;
                                                            if (fL.h("C", (Object)v1, (long)-6320153368481036434L, (long)var2_2) != null) {
                                                            }
                                                            ** GOTO lbl32
                                                        }
                                                        catch (MatchException v2) {
                                                            throw fL.h("\u00db", (Object)v2, (long)-6308141620823277164L, (long)var2_2);
                                                        }
                                                        v1 = fL.b;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw fL.h("\u00db", (Object)v3, (long)-6308141620823277164L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var18_10 != null) break block62;
                                                        if (fL.h("C", (Object)v1, (long)-6309276212142958645L, (long)var2_2) != null) break block63;
                                                    }
                                                    catch (MatchException v4) {
                                                        throw fL.h("\u00db", (Object)v4, (long)-6308141620823277164L, (long)var2_2);
                                                    }
lbl32:
                                                    // 2 sources

                                                    return;
                                                }
                                                catch (MatchException v5) {
                                                    throw fL.h("\u00db", (Object)v5, (long)-6308141620823277164L, (long)var2_2);
                                                }
                                            }
                                            v1 = fL.b;
                                        }
                                        try {
                                            try {
                                                v6 = fL.h("C", (Object)v1, (long)-6308942732886902256L, (long)var2_2);
                                                if (var18_10 != null) break block64;
                                                if (v6 == null) break block65;
                                            }
                                            catch (MatchException v7) {
                                                throw fL.h("\u00db", (Object)v7, (long)-6308141620823277164L, (long)var2_2);
                                            }
                                            v6 = fL.h("C", (Object)fL.b, (long)-6308942732886902256L, (long)var2_2);
                                        }
                                        catch (MatchException v8) {
                                            throw fL.h("\u00db", (Object)v8, (long)-6308141620823277164L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        if (!(v6 instanceof class_408)) {
                                            return;
                                        }
                                    }
                                    catch (MatchException v9) {
                                        throw fL.h("\u00db", (Object)v9, (long)-6308141620823277164L, (long)var2_2);
                                    }
                                }
                                this.y += fL.d("t", (int)12925, (long)(8476847215060762723L ^ var2_2));
                                var19_11 = fL.h("\u00db", (long)-6305569638968950607L, (long)var2_2);
                                try {
                                    v10 /* !! */  = this.x == fL.d("t", (int)10701, (long)(4735918916083932113L ^ var2_2)) ? 0.0f : (float)fL.h("\u00db", (float)0.1f, (float)((float)(var19_11 - this.x) / 1000.0f), (long)-6307872516436836190L, (long)var2_2);
                                }
                                catch (MatchException v11) {
                                    throw fL.h("\u00db", (Object)v11, (long)-6308141620823277164L, (long)var2_2);
                                }
                                var21_12 = v10 /* !! */ ;
                                this.x = (long)var19_11;
                                var22_13 = 1.0f - (float)fL.h("\u00db", (double)(-var21_12 * fL.h("W", (Object)((Float)fL.h("W", (Object)this.n, (long)-6320694255051591486L, (long)var2_2)), (long)-6311921309786179153L, (long)var2_2)), (long)-6308117672004413705L, (long)var2_2);
                                var23_14 = fL.h("W", (Object)fL.h("W", (Object)fL.b, (long)-6319133491510140626L, (long)var2_2), (long)-6307206752515249967L, (long)var2_2);
                                var24_15 = fL.h("W", (Object)fL.h("W", (Object)fL.b, (long)-6319133491510140626L, (long)var2_2), (long)-6307997434986602763L, (long)var2_2);
                                v12 = new Object[1];
                                v12[0] = var6_4;
                                var25_16 = fL.h("W", (Object)fL.h("n", (long)-6305864936675795576L, (long)var2_2), (Object)v12, (long)-6307936961075240100L, (long)var2_2);
                                var26_17 = new Matrix4f();
                                try {
                                    try {
                                        v13 = (Boolean)fL.h("W", (Object)this.q, (long)-6320694255051591486L, (long)var2_2);
                                        if (var18_10 != null) break block66;
                                        if (fL.h("W", (Object)v13, (long)-6306031899335565636L, (long)var2_2) == false) break block67;
                                    }
                                    catch (MatchException v14) {
                                        throw fL.h("\u00db", (Object)v14, (long)-6308141620823277164L, (long)var2_2);
                                    }
                                    v15 = (Color)fL.h("W", (Object)fL.h("W", (Object)fL.h("W", (Object)fL.h("n", (long)-6308643724646038010L, (long)var2_2), (Object)new Object[0], (long)-6305924748945455608L, (long)var2_2), (Object)new Object[0], (long)-6306360424295023146L, (long)var2_2), (long)-6320694255051591486L, (long)var2_2);
                                    break block68;
                                }
                                catch (MatchException v16) {
                                    throw fL.h("\u00db", (Object)v16, (long)-6308141620823277164L, (long)var2_2);
                                }
                            }
                            v13 = fL.h("W", (Object)this.r, (long)-6320694255051591486L, (long)var2_2);
                        }
                        v15 = (Color)v13;
                    }
                    var27_18 = v15;
                    var28_19 = (Color)fL.h("W", (Object)this.s, (long)-6320694255051591486L, (long)var2_2);
                    try {
                        try {
                            v17 = new Object[2];
                            v17[1] = var12_7;
                            v17[0] = fL.b("m", (int)32747, (long)(6946487882748452683L ^ var2_2));
                            v18 = fL.h("W", (Object)this.f, (Object)v17, (long)-6312615971031422224L, (long)var2_2);
                            if (var18_10 != null) break block69;
                            if (v18 == false) break block70;
                        }
                        catch (MatchException v19) {
                            throw fL.h("\u00db", (Object)v19, (long)-6308141620823277164L, (long)var2_2);
                        }
                        v18 = fL.h("W", (Object)((Boolean)fL.h("W", (Object)this.i, (long)-6320694255051591486L, (long)var2_2)), (long)-6306031899335565636L, (long)var2_2);
                    }
                    catch (MatchException v20) {
                        throw fL.h("\u00db", (Object)v20, (long)-6308141620823277164L, (long)var2_2);
                    }
                }
                try {
                    if (v18 == false) break block70;
                    v21 = (float)((fL.h("\u00db", (double)((double)var19_11 / 1000.0 * (double)fL.h("W", (Object)((Float)fL.h("W", (Object)this.j, (long)-6320694255051591486L, (long)var2_2)), (long)-6311921309786179153L, (long)var2_2)), (long)-6320594656888980438L, (long)var2_2) + 1.0) * 0.5);
                    break block71;
                }
                catch (MatchException v22) {
                    throw fL.h("\u00db", (Object)v22, (long)-6308141620823277164L, (long)var2_2);
                }
            }
            v21 = 0.0f;
        }
        var29_20 = v21;
        var30_21 = fL.h("W", (Object)fL.h("W", (Object)this.z, (long)-6307530101796901712L, (long)var2_2), (long)-6307095574967643191L, (long)var2_2);
        while (fL.h("W", (Object)var30_21, (long)-6308899512208658377L, (long)var2_2) != false) {
            block77: {
                block78: {
                    block76: {
                        block75: {
                            block74: {
                                block73: {
                                    block72: {
                                        var31_22 = (Map.Entry)fL.h("W", (Object)var30_21, (long)-6308355312849585128L, (long)var2_2);
                                        var32_23 = (UUID)fL.h("W", (Object)var31_22, (long)-6311948650252737998L, (long)var2_2);
                                        var33_24 = (f9)fL.h("W", (Object)var31_22, (long)-6312385472179867537L, (long)var2_2);
                                        var34_25 = var33_24.a;
                                        try {
                                            try {
                                                v23 /* !! */  = var34_25;
                                                if (var18_10 == null) {
                                                    if (var18_10 != null) break block72;
                                                }
                                                ** GOTO lbl277
                                            }
                                            catch (MatchException v24) {
                                                throw fL.h("\u00db", (Object)v24, (long)-6308141620823277164L, (long)var2_2);
                                            }
                                            if (v23 /* !! */  == null) continue;
                                        }
                                        catch (MatchException v25) {
                                            throw fL.h("\u00db", (Object)v25, (long)-6308141620823277164L, (long)var2_2);
                                        }
                                        v26 = var34_25;
                                    }
                                    try {
                                        if (fL.h("W", (Object)v26, (long)-6319867655765590807L, (long)var2_2) != false) {
                                            continue;
                                        }
                                    }
                                    catch (MatchException v27) {
                                        throw fL.h("\u00db", (Object)v27, (long)-6308141620823277164L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            v28 = this.w;
                                            if (var18_10 != null) break block73;
                                            if (v28 == null) break block74;
                                        }
                                        catch (MatchException v29) {
                                            throw fL.h("\u00db", (Object)v29, (long)-6308141620823277164L, (long)var2_2);
                                        }
                                        v28 = this.w;
                                    }
                                    catch (MatchException v30) {
                                        throw fL.h("\u00db", (Object)v30, (long)-6308141620823277164L, (long)var2_2);
                                    }
                                }
                                try {
                                    if (fL.h("W", (Object)v28, (Object)fL.h("W", (Object)var34_25, (long)-6306983585777335918L, (long)var2_2), (long)-6308307331765333351L, (long)var2_2) == false) {
                                        continue;
                                    }
                                }
                                catch (MatchException v31) {
                                    throw fL.h("\u00db", (Object)v31, (long)-6308141620823277164L, (long)var2_2);
                                }
                            }
                            v32 = new Object[2];
                            v32[1] = var8_5;
                            v32[0] = var34_25;
                            var35_26 = fL.h("\u00db", (Object)v32, (long)-6312513866763604164L, (long)var2_2);
                            v33 = new Object[4];
                            v33[3] = var14_8;
                            v33[2] = Float.valueOf(var33_24.f);
                            v33[1] = Float.valueOf(var33_24.e);
                            v33[0] = var35_26;
                            var36_27 = fL.h("W", (Object)this, (Object)v33, (long)-6320493387285806328L, (long)var2_2);
                            try {
                                v34 = var36_27;
                                if (var18_10 != null) break block75;
                                if (v34 == null) {
                                    continue;
                                }
                            }
                            catch (MatchException v35) {
                                throw fL.h("\u00db", (Object)v35, (long)-6308141620823277164L, (long)var2_2);
                            }
                            v34 = var36_27;
                        }
                        v36 = new Object[4];
                        v36[3] = var4_3;
                        v36[2] = Float.valueOf((float)(var23_14 + fL.c("j", (int)29741, (long)(8490671581356917115L ^ var2_2))));
                        v36[1] = Float.valueOf(-20.0f);
                        v36[0] = Float.valueOf((float)v34[0]);
                        var37_28 = fL.h("\u00db", (Object)v36, (long)-6307734276750744829L, (long)var2_2);
                        v37 = new Object[4];
                        v37[3] = var4_3;
                        v37[2] = Float.valueOf((float)(var24_15 + fL.c("j", (int)22257, (long)(5153471146167542703L ^ var2_2))));
                        v37[1] = Float.valueOf(-20.0f);
                        v37[0] = Float.valueOf((float)var36_27[1]);
                        var38_29 = fL.h("\u00db", (Object)v37, (long)-6307734276750744829L, (long)var2_2);
                        v38 = new Object[4];
                        v38[3] = var4_3;
                        v38[2] = Float.valueOf((float)(var23_14 + fL.c("j", (int)22257, (long)(5153471146167542703L ^ var2_2))));
                        v38[1] = Float.valueOf(-20.0f);
                        v38[0] = Float.valueOf((float)var36_27[2]);
                        var39_30 = fL.h("\u00db", (Object)v38, (long)-6307734276750744829L, (long)var2_2);
                        v39 = new Object[4];
                        v39[3] = var4_3;
                        v39[2] = Float.valueOf((float)(var24_15 + fL.c("j", (int)22257, (long)(5153471146167542703L ^ var2_2))));
                        v39[1] = Float.valueOf(-20.0f);
                        v39[0] = Float.valueOf((float)var36_27[3]);
                        var40_31 = fL.h("\u00db", (Object)v39, (long)-6307734276750744829L, (long)var2_2);
                        try {
                            cfr_temp_0 = var39_30 - var37_28 - 3.0f;
                            v40 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var18_10 != null) break block76;
                            if (v40 < 0) continue;
                        }
                        catch (MatchException v41) {
                            throw fL.h("\u00db", (Object)v41, (long)-6308141620823277164L, (long)var2_2);
                        }
                        cfr_temp_1 = var40_31 - var38_29 - 3.0f;
                        v40 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                    }
                    if (v40 < 0) continue;
                    var41_32 = (f_)fL.h("W", (Object)this.A, (Object)var32_23, (long)-6318818425208506812L, (long)var2_2);
                    try {
                        v42 = var41_32;
                        if (var18_10 != null) break block77;
                        if (v42 != null) break block78;
                    }
                    catch (MatchException v43) {
                        throw fL.h("\u00db", (Object)v43, (long)-6308141620823277164L, (long)var2_2);
                    }
                    var41_32 = new f_();
                    var41_32.e = 0.0f;
                    fL.h("W", (Object)this.A, (Object)var32_23, (Object)var41_32, (long)-6308550720709673522L, (long)var2_2);
                }
                var41_32.a = (float)var37_28;
                var41_32.b = (float)var38_29;
                var41_32.c = (float)var39_30;
                var41_32.d = (float)var40_31;
                v44 = new Object[4];
                v44[3] = var10_6;
                v44[2] = Float.valueOf(var22_13);
                v44[1] = Float.valueOf(1.0f);
                v44[0] = Float.valueOf(var41_32.e);
                var41_32.e = (float)fL.h("\u00db", (Object)v44, (long)-6305225012526801785L, (long)var2_2);
                var41_32.f = this.y;
                v42 = var41_32;
            }
            v42.g = var33_24;
            v45 = new Object[11];
            v45[10] = var16_9;
            v45[9] = (long)var19_11;
            v45[8] = Float.valueOf(var29_20);
            v45[7] = var28_19;
            v45[6] = var27_18;
            v45[5] = var41_32;
            v45[4] = var33_24;
            v45[3] = var25_16;
            v45[2] = var26_17;
            v45[1] = var1_1.b;
            v45[0] = var1_1.a;
            fL.h("W", (Object)this, (Object)v45, (long)-6305518479358777782L, (long)var2_2);
            if (var18_10 == null) continue;
        }
        var30_21 = fL.h("W", (Object)fL.h("W", (Object)this.A, (long)-6307530101796901712L, (long)var2_2), (long)-6307095574967643191L, (long)var2_2);
        while (fL.h("W", (Object)var30_21, (long)-6308899512208658377L, (long)var2_2) != false) {
            block81: {
                block80: {
                    block79: {
                        var31_22 = (Map.Entry)fL.h("W", (Object)var30_21, (long)-6308355312849585128L, (long)var2_2);
                        v23 /* !! */  = fL.h("W", (Object)var31_22, (long)-6312385472179867537L, (long)var2_2);
lbl277:
                        // 2 sources

                        var32_23 = (f_)v23 /* !! */ ;
                        try {
                            cfr_temp_2 = var32_23.f - this.y;
                            v46 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                            if (var18_10 != null) break block79;
                            if (v46 == false) {
                                continue;
                            }
                        }
                        catch (MatchException v47) {
                            throw fL.h("\u00db", (Object)v47, (long)-6308141620823277164L, (long)var2_2);
                        }
                        try {
                            v48 = new Object[4];
                            v48[3] = var10_6;
                            v48[2] = Float.valueOf(var22_13);
                            v48[1] = Float.valueOf(0.0f);
                            v48[0] = Float.valueOf(var32_23.e);
                            var32_23.e = (float)fL.h("\u00db", (Object)v48, (long)-6305225012526801785L, (long)var2_2);
                            if (var18_10 != null) break block80;
                            cfr_temp_3 = var32_23.e - 0.02f;
                            v46 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                        }
                        catch (MatchException v49) {
                            throw fL.h("\u00db", (Object)v49, (long)-6308141620823277164L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            if (v46 >= 0 && var32_23.g != null) break block81;
                        }
                        catch (MatchException v50) {
                            throw fL.h("\u00db", (Object)v50, (long)-6308141620823277164L, (long)var2_2);
                        }
                        fL.h("W", (Object)var30_21, (long)-6308573140530562331L, (long)var2_2);
                    }
                    catch (MatchException v51) {
                        throw fL.h("\u00db", (Object)v51, (long)-6308141620823277164L, (long)var2_2);
                    }
                }
                if (var18_10 == null) continue;
            }
            v52 = new Object[11];
            v52[10] = var16_9;
            v52[9] = (long)var19_11;
            v52[8] = Float.valueOf(var29_20);
            v52[7] = var28_19;
            v52[6] = var27_18;
            v52[5] = var32_23;
            v52[4] = var32_23.g;
            v52[3] = var25_16;
            v52[2] = var26_17;
            v52[1] = var1_1.b;
            v52[0] = var1_1.a;
            fL.h("W", (Object)this, (Object)v52, (long)-6305518479358777782L, (long)var2_2);
            if (var18_10 == null) continue;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bG bG2) {
        Object object;
        ArrayList arrayList;
        CallSite callSite;
        long l;
        block27: {
            CallSite callSite2;
            long l2;
            long l3;
            block25: {
                block26: {
                    block24: {
                        class_310 class_3102;
                        block23: {
                            long l4 = l = B ^ 0x5A3C65CB15FFL;
                            l3 = l4 ^ 0x4857F50286F4L;
                            l2 = l4 ^ 0x6FBFED659341L;
                            callSite = fL.h("\u00db", (long)-1774281983914303346L, (long)l);
                            try {
                                try {
                                    class_3102 = b;
                                    if (callSite != null) break block23;
                                    if (fL.h("C", (Object)class_3102, (long)-1774079099052013499L, (long)l) == null) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                                }
                                class_3102 = b;
                            }
                            catch (MatchException matchException) {
                                throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                            }
                        }
                        try {
                            callSite2 = fL.h("C", (Object)class_3102, (long)-1775672534875121440L, (long)l);
                            if (callSite != null) break block25;
                            if (callSite2 != null) break block26;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                        }
                    }
                    return;
                }
                fL.h("W", (Object)this.z, (long)-1777069289283814008L, (long)l);
                callSite2 = fL.h("W", (Object)this.o, (long)-1773543479982391319L, (long)l);
            }
            CallSite callSite3 = fL.h("W", (Object)((Integer)((Object)callSite2)), (long)-1775323668260924566L, (long)l);
            CallSite callSite4 = fL.h("W", (Object)((Boolean)((Object)fL.h("W", (Object)this.d, (long)-1773543479982391319L, (long)l))), (long)-1776950498357800553L, (long)l);
            arrayList = new ArrayList();
            CallSite callSite5 = fL.h("W", (Object)fL.h("W", (Object)fL.h("C", (Object)b, (long)-1774079099052013499L, (long)l), (long)-1774054325479926868L, (long)l), (long)-1779959706205496122L, (long)l);
            while (fL.h("W", (Object)callSite5, (long)-1776334858397237476L, (long)l) != false) {
                reference var14_12;
                block32: {
                    CallSite callSite6;
                    block31: {
                        block30: {
                            CallSite callSite7;
                            block29: {
                                object = (class_1657)fL.h("W", (Object)callSite5, (long)-1774627373587975373L, (long)l);
                                try {
                                    try {
                                        if (callSite != null) break block27;
                                        if (object == fL.h("C", (Object)b, (long)-1775672534875121440L, (long)l)) {
                                            continue;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                                }
                                try {
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l2;
                                    objectArray[0] = object;
                                    callSite7 = fL.h("W", (Object)fL.h("n", (long)-1776132862076794297L, (long)l), (Object)objectArray, (long)-1775120343666457293L, (long)l);
                                    if (callSite != null) break block29;
                                    if (callSite7 == false) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                                }
                                callSite7 = fL.h("W", (Object)object, (long)-1774373913441061950L, (long)l);
                            }
                            if (callSite7 != false) continue;
                            var14_12 = fL.h("W", (Object)fL.h("C", (Object)b, (long)-1775672534875121440L, (long)l), (Object)object, (long)-1777292138155824958L, (long)l);
                            try {
                                reference cfr_temp_0 = var14_12 - (float)callSite3;
                                callSite6 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                if (callSite != null) break block30;
                                if (callSite6 > 0) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                            }
                            callSite6 = callSite4;
                        }
                        try {
                            try {
                                if (callSite != null) break block31;
                                if (callSite6 != false) break block32;
                            }
                            catch (MatchException matchException) {
                                throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                            }
                            callSite6 = fL.h("W", (Object)object, (long)-1776954162165494247L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)-1774555604463612225L, (long)l);
                        }
                    }
                    if (callSite6 != false) continue;
                }
                f9 f92 = new f9();
                f92.a = object;
                f92.b = fL.h("W", (Object)fL.h("W", (Object)object, (long)-1772773100526114784L, (long)l), (long)-1777970922643815082L, (long)l);
                f92.c = (float)(fL.h("W", (Object)object, (long)-1777206881781232377L, (long)l) + fL.h("W", (Object)object, (long)-1778721757658221021L, (long)l));
                f92.d = (float)fL.h("\u00db", (float)1.0f, (float)fL.h("W", (Object)object, (long)-1775938345402352983L, (long)l), (long)-1779663474045651954L, (long)l);
                f92.e = (float)fL.h("W", (Object)object, (long)-1775373392674116525L, (long)l);
                f92.f = (float)fL.h("W", (Object)object, (long)-1778154157760083792L, (long)l);
                f92.g = (float)var14_12;
                Object[] objectArray = new Object[2];
                objectArray[1] = l3;
                objectArray[0] = f92.b;
                f92.h = fL.h("W", (Object)fL.h("n", (long)-1772226921598886615L, (long)l), (Object)objectArray, (long)-1776830590283547319L, (long)l);
                fL.h("W", arrayList, (Object)f92, (long)-1779097089586257636L, (long)l);
                if (callSite == null) continue;
            }
            fL.h("W", arrayList, (Object)fL.h("\u00db", fL::lambda$onTick$11, (long)-1773449787847099006L, (long)l), (long)-1779234822023949907L, (long)l);
        }
        for (int i = 0; i < fL.h("W", arrayList, (long)-1776186671739229133L, (long)l) && i < fL.h("W", (Object)((Integer)((Object)fL.h("W", (Object)this.p, (long)-1773543479982391319L, (long)l))), (long)-1775323668260924566L, (long)l); ++i) {
            object = (f9)((Object)fL.h("W", arrayList, (int)i, (long)-1776011039140973314L, (long)l));
            fL.h("W", (Object)this.z, (Object)fL.h("W", (Object)object.a, (long)-1775191418131715535L, (long)l), (Object)object, (long)-1776389671414336795L, (long)l);
            if (callSite == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float[] a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = B ^ l) ^ 0x3CEC991DAFC6L;
        double d = (double)f * 0.5;
        double d10 = f10;
        float f11 = Float.POSITIVE_INFINITY;
        CallSite callSite = fL.h("\u00db", (long)-2899372960167325651L, (long)l);
        float f12 = Float.POSITIVE_INFINITY;
        float f13 = Float.NEGATIVE_INFINITY;
        float f14 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < fL.c("j", (int)11342, (long)(0x4AD985AAE635269EL ^ l)); ++i) {
            float f15;
            block32: {
                float f16;
                float f17;
                block30: {
                    block31: {
                        block28: {
                            block29: {
                                float f18;
                                block26: {
                                    block27: {
                                        reference v12;
                                        CallSite callSite2;
                                        block25: {
                                            reference v10;
                                            block24: {
                                                double d11;
                                                CallSite callSite3;
                                                double d12;
                                                CallSite callSite4;
                                                double d13;
                                                CallSite callSite5;
                                                try {
                                                    callSite5 = fL.h("C", (Object)class_2432, (long)-2886922034145250299L, (long)l);
                                                    d13 = (i & 1) == 0 ? -d : d;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                                }
                                                reference var19_15 = callSite5 + d13;
                                                try {
                                                    callSite4 = fL.h("C", (Object)class_2432, (long)-2898495240372868179L, (long)l);
                                                    d12 = (i & 2) == 0 ? 0.0 : d10;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                                }
                                                reference var21_16 = callSite4 + d12;
                                                try {
                                                    callSite3 = fL.h("C", (Object)class_2432, (long)-2883148666883023997L, (long)l);
                                                    d11 = (i & 4) == 0 ? -d : d;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                                }
                                                reference var23_17 = callSite3 + d11;
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l2;
                                                objectArray2[0] = new class_243((double)var19_15, (double)var21_16, (double)var23_17);
                                                callSite2 = fL.h("\u00db", (Object)objectArray2, (long)-2884249293738885738L, (long)l);
                                                try {
                                                    try {
                                                        try {
                                                            reference v10 = fL.h("C", (Object)callSite2, (long)-2883148666883023997L, (long)l) - 0.0;
                                                            v10 = v10 == 0 ? 0 : (v10 < 0 ? -1 : 1);
                                                            if (callSite != null) break block24;
                                                            if (v10 < 0) return null;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                                        }
                                                        v12 = fL.h("C", (Object)callSite2, (long)-2883148666883023997L, (long)l);
                                                        if (callSite != null) break block25;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                                    }
                                                    reference v10 = v12 - 1.0;
                                                    v10 = v10 == 0 ? 0 : (v10 > 0 ? 1 : -1);
                                                }
                                                catch (MatchException matchException) {
                                                    throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                                }
                                            }
                                            try {
                                                if (v10 >= 0) {
                                                    return null;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                            }
                                            v12 = fL.h("C", (Object)callSite2, (long)-2886922034145250299L, (long)l);
                                        }
                                        f18 = (float)v12;
                                        f17 = (float)fL.h("C", (Object)callSite2, (long)-2898495240372868179L, (long)l);
                                        try {
                                            f16 = f18 == f11 ? 0 : (f18 < f11 ? -1 : 1);
                                            if (callSite != null) break block26;
                                            if (f16 >= 0) break block27;
                                        }
                                        catch (MatchException matchException) {
                                            throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                        }
                                        f11 = f18;
                                    }
                                    f16 = f18 == f13 ? 0 : (f18 > f13 ? 1 : -1);
                                }
                                try {
                                    if (callSite != null) break block28;
                                    if (f16 <= 0) break block29;
                                }
                                catch (MatchException matchException) {
                                    throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                                }
                                f13 = f18;
                            }
                            f16 = f17 == f12 ? 0 : (f17 < f12 ? -1 : 1);
                        }
                        try {
                            if (callSite != null) break block30;
                            if (f16 >= 0) break block31;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                        }
                        f12 = f17;
                    }
                    try {
                        f15 = f17;
                        if (callSite != null) break block32;
                        float f16 = f15 - f14;
                        f16 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw fL.h("\u00db", (Object)matchException, (long)-2883250042712900068L, (long)l);
                    }
                }
                if (f16 <= 0) continue;
                f15 = f17;
            }
            f14 = f15;
            if (callSite == null) continue;
        }
        return new float[]{f11, f12, f13, f14};
    }

    private static int a(Object[] objectArray) {
        Object object;
        block10: {
            CallSite callSite;
            block11: {
                CallSite callSite2;
                long l;
                block8: {
                    block9: {
                        float f = ((Float)objectArray[0]).floatValue();
                        l = (Long)objectArray[1];
                        l = B ^ l;
                        callSite = fL.h("\u00db", (float)(f * 255.0f), (long)6781492494892414084L, (long)l);
                        callSite2 = fL.h("\u00db", (long)6786392561301592512L, (long)l);
                        try {
                            try {
                                object = callSite;
                                if (callSite2 != null) break block8;
                                if (object >= 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fL.h("\u00db", (Object)matchException, (long)6778450633110403057L, (long)l);
                            }
                            object = 0;
                            break block10;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)6778450633110403057L, (long)l);
                        }
                    }
                    object = callSite;
                }
                try {
                    try {
                        if (callSite2 != null) break block10;
                        if (object <= fL.c("j", (int)26232, (long)(0x5E9085012A49E54CL ^ l))) break block11;
                    }
                    catch (MatchException matchException) {
                        throw fL.h("\u00db", (Object)matchException, (long)6778450633110403057L, (long)l);
                    }
                    object = fL.c("j", (int)31155, (long)(0x53FDE341C505FA85L ^ l));
                    break block10;
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)6778450633110403057L, (long)l);
                }
            }
            object = callSite;
        }
        return (int)object;
    }

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x3867F9E1AF16L;
        long l4 = l2 ^ 0x189EB826E396L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = Float.valueOf(f);
        CallSite callSite = fL.h("\u00db", (float)((float)fL.h("W", (Object)color, (long)7937603599741415778L, (long)l) * fL.h("\u00db", (Object)objectArray2, (long)7936073739230524318L, (long)l)), (long)7938634113781073075L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = (int)callSite;
        return new Color((int)fL.h("W", (Object)color, (long)7933627489491993932L, (long)l), (int)fL.h("W", (Object)color, (long)7935991235318823243L, (long)l), (int)fL.h("W", (Object)color, (long)7941738200240070450L, (long)l), (int)fL.h("\u00db", (Object)objectArray3, (long)7939257737159394622L, (long)l));
    }

    @bP
    public void a(bJ bJ2) {
        long l = B ^ 0x30A77091351CL;
        this.w = fL.h("W", (Object)bJ2, (Object)new Object[0], (long)-4057085350745663298L, (long)l);
    }

    private void m(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x33C16148F09EL;
        long l4 = l2 ^ 0x51BF0C79CACFL;
        long l5 = l2 ^ 0x6C3D43A2C898L;
        float f14 = f12 - f10;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l5;
        objectArray2[2] = Float.valueOf(26.0f);
        objectArray2[1] = Float.valueOf(5.0f);
        objectArray2[0] = Float.valueOf(f14 * 0.35f);
        CallSite callSite = fL.h("\u00db", (Object)objectArray2, (long)7244171518287720445L, (long)l);
        float f15 = f13 * 0.5f;
        float f16 = (f10 + f12) * 0.5f;
        Color color3 = new Color(0, 0, 0, (int)fL.h("\u00db", (float)(120.0f * ((float)fL.h("W", (Object)color, (long)7242929816038865870L, (long)l) / 255.0f)), (long)7243960330087173663L, (long)l));
        Object[] objectArray3 = new Object[8];
        objectArray3[7] = l4;
        objectArray3[6] = color3;
        objectArray3[5] = color;
        objectArray3[4] = Float.valueOf(f10 + callSite);
        objectArray3[3] = Float.valueOf(f + f15);
        objectArray3[2] = Float.valueOf(f10 - f15);
        objectArray3[1] = Float.valueOf(f - f15);
        objectArray3[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray3, (long)7243836705533498429L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l3;
        objectArray4[1] = color2;
        objectArray4[0] = color;
        Object[] objectArray5 = new Object[8];
        objectArray5[7] = l4;
        objectArray5[6] = color3;
        objectArray5[5] = fL.h("\u00db", (Object)objectArray4, (long)7245755148328276242L, (long)l);
        objectArray5[4] = Float.valueOf(f16 + callSite * 0.4f);
        objectArray5[3] = Float.valueOf(f + f15);
        objectArray5[2] = Float.valueOf(f16 - callSite * 0.4f);
        objectArray5[1] = Float.valueOf(f - f15);
        objectArray5[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray5, (long)7243836705533498429L, (long)l);
        Object[] objectArray6 = new Object[8];
        objectArray6[7] = l4;
        objectArray6[6] = color3;
        objectArray6[5] = color2;
        objectArray6[4] = Float.valueOf(f12 + f15);
        objectArray6[3] = Float.valueOf(f + f15);
        objectArray6[2] = Float.valueOf(f12 - callSite);
        objectArray6[1] = Float.valueOf(f - f15);
        objectArray6[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray6, (long)7243836705533498429L, (long)l);
        Object[] objectArray7 = new Object[8];
        objectArray7[7] = l4;
        objectArray7[6] = color3;
        objectArray7[5] = color;
        objectArray7[4] = Float.valueOf(f10 + callSite);
        objectArray7[3] = Float.valueOf(f11 + f15);
        objectArray7[2] = Float.valueOf(f10 - f15);
        objectArray7[1] = Float.valueOf(f11 - f15);
        objectArray7[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray7, (long)7243836705533498429L, (long)l);
        Object[] objectArray8 = new Object[3];
        objectArray8[2] = l3;
        objectArray8[1] = color2;
        objectArray8[0] = color;
        Object[] objectArray9 = new Object[8];
        objectArray9[7] = l4;
        objectArray9[6] = color3;
        objectArray9[5] = fL.h("\u00db", (Object)objectArray8, (long)7245755148328276242L, (long)l);
        objectArray9[4] = Float.valueOf(f16 + callSite * 0.4f);
        objectArray9[3] = Float.valueOf(f11 + f15);
        objectArray9[2] = Float.valueOf(f16 - callSite * 0.4f);
        objectArray9[1] = Float.valueOf(f11 - f15);
        objectArray9[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray9, (long)7243836705533498429L, (long)l);
        Object[] objectArray10 = new Object[8];
        objectArray10[7] = l4;
        objectArray10[6] = color3;
        objectArray10[5] = color2;
        objectArray10[4] = Float.valueOf(f12 + f15);
        objectArray10[3] = Float.valueOf(f11 + f15);
        objectArray10[2] = Float.valueOf(f12 - callSite);
        objectArray10[1] = Float.valueOf(f11 - f15);
        objectArray10[0] = matrix4f;
        fL.h("W", (Object)this, (Object)objectArray10, (long)7243836705533498429L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (M[n3] != null) {
            return n3;
        }
        Object object = L[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 2;
            case 1 -> 20;
            case 2 -> 33;
            case 3 -> 22;
            case 4 -> 23;
            case 5 -> 39;
            case 6 -> 19;
            case 7 -> 44;
            case 8 -> 63;
            case 9 -> 43;
            case 10 -> 28;
            case 11 -> 56;
            case 12 -> 30;
            case 13 -> 60;
            case 14 -> 47;
            case 15 -> 11;
            case 16 -> 38;
            case 17 -> 32;
            case 18 -> 55;
            case 19 -> 3;
            case 20 -> 31;
            case 21 -> 57;
            case 22 -> 62;
            case 23 -> 9;
            case 24 -> 1;
            case 25 -> 54;
            case 26 -> 34;
            case 27 -> 18;
            case 28 -> 48;
            case 29 -> 49;
            case 30 -> 42;
            case 31 -> 13;
            case 32 -> 12;
            case 33 -> 50;
            case 34 -> 0;
            case 35 -> 58;
            case 36 -> 26;
            case 37 -> 5;
            case 38 -> 17;
            case 39 -> 15;
            case 40 -> 40;
            case 41 -> 27;
            case 42 -> 41;
            case 43 -> 29;
            case 44 -> 52;
            case 45 -> 51;
            case 46 -> 8;
            case 47 -> 46;
            case 48 -> 6;
            case 49 -> 14;
            case 50 -> 59;
            case 51 -> 24;
            case 52 -> 53;
            case 53 -> 61;
            case 54 -> 7;
            case 55 -> 45;
            case 56 -> 10;
            case 57 -> 16;
            case 58 -> 36;
            case 59 -> 21;
            case 60 -> 37;
            case 61 -> 35;
            case 62 -> 25;
            default -> 4;
        };
        int[] nArray = new int[6];
        int n5 = 0;
        while (n5 < 6) {
            n2 = 7 * (5 - n5);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n4) < 0) {
                n += 128;
            }
            nArray[n5] = n;
            ++n5;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        fL.M[n3] = new String(cArray);
        return n3;
    }

    private void o(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        float f13 = ((Float)objectArray[6]).floatValue();
        float f14 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x4E37C13C3E0BL;
        long l4 = l2 ^ 0x38505D8AC605L;
        float f15 = 4.0f;
        CallSite callSite = fL.h("\u00db", (long)-7880077988389071542L, (long)l);
        CallSite callSite2 = fL.h("W", (Object)((Float)((Object)fL.h("W", (Object)this.h, (long)-7879268943932159443L, (long)l))), (long)-7887815368459304128L, (long)l);
        int n = 1;
        while ((float)n <= f15) {
            float f16 = (float)n / f15;
            reference var21_18 = callSite2 * f16;
            float f17 = f13 * 0.14f * (1.0f - f16);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l3;
            objectArray2[0] = Float.valueOf(f17);
            Color color2 = new Color((int)fL.h("W", (Object)color, (long)-7879997268989953551L, (long)l), (int)fL.h("W", (Object)color, (long)-7881574318609185290L, (long)l), (int)fL.h("W", (Object)color, (long)-7886945607036017777L, (long)l), (int)fL.h("\u00db", (Object)objectArray2, (long)-7880256855806980762L, (long)l));
            Object[] objectArray3 = new Object[8];
            objectArray3[7] = l4;
            objectArray3[6] = Float.valueOf(f14 + var21_18);
            objectArray3[5] = color2;
            objectArray3[4] = Float.valueOf(f12 + var21_18);
            objectArray3[3] = Float.valueOf(f11 + var21_18);
            objectArray3[2] = Float.valueOf(f10 - var21_18);
            objectArray3[1] = Float.valueOf(f - var21_18);
            objectArray3[0] = matrix4f;
            fL.h("\u00db", (Object)objectArray3, (long)-7879619401794618022L, (long)l);
            ++n;
            if (callSite == null) continue;
        }
    }

    private static Field o(long l, long l2) {
        int n = fL.m(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            String string = M[n];
            int n2 = string.indexOf(8);
            Class clazz = fL.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fL.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fL.g(clazz3, string2, clazz2)) != null) {
                    fL.L[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fL.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fL.L[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fL.n(2135386626303978L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void p(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        float f13 = ((Float)objectArray[6]).floatValue();
        float f14 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = (l = B ^ l) ^ 0x20EBA29800BEL;
        Object[] objectArray2 = new Object[11];
        objectArray2[10] = l2;
        objectArray2[9] = Float.valueOf(f14);
        objectArray2[8] = Float.valueOf(f13);
        objectArray2[7] = color;
        objectArray2[6] = Float.valueOf(f12);
        objectArray2[5] = Float.valueOf(f11);
        objectArray2[4] = Float.valueOf(f10);
        objectArray2[3] = Float.valueOf(f);
        objectArray2[2] = matrix4f;
        objectArray2[1] = dB.h;
        objectArray2[0] = dB.g;
        fL.h("\u00db", (Object)objectArray2, (long)4263771370688428905L, (long)l);
    }

    private static Method p(long l, long l2) {
        int n = fL.m(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = M[n];
                int n3 = string2.indexOf(8);
                clazz3 = fL.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = fL.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fL.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fL.L[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fL.n(2135386626303978L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fL.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fL.L[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fL.n(2135386626303978L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private void k(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        Color color2 = (Color)objectArray[6];
        float f13 = ((Float)objectArray[7]).floatValue();
        float f14 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x3FA67AFCBDE7L;
        long l4 = l2 ^ 0x13FE7F43E05EL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = color2;
        objectArray2[0] = color;
        CallSite callSite = fL.h("\u00db", (Object)objectArray2, (long)3023915971135200363L, (long)l);
        Color color3 = new Color(0, 0, 0, (int)fL.h("\u00db", (float)(80.0f * ((float)fL.h("W", (Object)callSite, (long)3025576913094620855L, (long)l) / 255.0f)), (long)3026062627738108774L, (long)l));
        Object[] objectArray3 = new Object[9];
        objectArray3[8] = l4;
        objectArray3[7] = Float.valueOf(1.0f);
        objectArray3[6] = Float.valueOf(f14 + 0.5f);
        objectArray3[5] = color3;
        objectArray3[4] = Float.valueOf(f12 + 0.5f);
        objectArray3[3] = Float.valueOf(f11 + 0.5f);
        objectArray3[2] = Float.valueOf(f10 - 0.5f);
        objectArray3[1] = Float.valueOf(f - 0.5f);
        objectArray3[0] = matrix4f;
        fL.h("\u00db", (Object)objectArray3, (long)3012891086292587416L, (long)l);
        Object[] objectArray4 = new Object[9];
        objectArray4[8] = l4;
        objectArray4[7] = Float.valueOf(f13);
        objectArray4[6] = Float.valueOf(f14);
        objectArray4[5] = callSite;
        objectArray4[4] = Float.valueOf(f12);
        objectArray4[3] = Float.valueOf(f11);
        objectArray4[2] = Float.valueOf(f10);
        objectArray4[1] = Float.valueOf(f);
        objectArray4[0] = matrix4f;
        fL.h("\u00db", (Object)objectArray4, (long)3012891086292587416L, (long)l);
    }

    private void t(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        float f = ((Float)objectArray[3]).floatValue();
        float f10 = ((Float)objectArray[4]).floatValue();
        float f11 = ((Float)objectArray[5]).floatValue();
        float f12 = ((Float)objectArray[6]).floatValue();
        float f13 = ((Float)objectArray[7]).floatValue();
        long l = (Long)objectArray[8];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x4104B410AA87L;
        long l4 = l2 ^ 0x6FC65A43273CL;
        long l5 = l2 ^ 0x72546C7EDAEFL;
        long l6 = l2 ^ 0x64169606FEB4L;
        float f14 = f11 - f;
        float f15 = f12 - f10;
        try {
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l6;
            objectArray2[0] = fL.b("m", (int)11045, (long)(0x11F7C4BEA40B5585L ^ l));
            if (fL.h("W", (Object)this.f, (Object)objectArray2, (long)8533896813601633531L, (long)l) != false) {
                Object[] objectArray3 = new Object[10];
                objectArray3[9] = l4;
                objectArray3[8] = Float.valueOf(2.5f);
                objectArray3[7] = 5;
                objectArray3[6] = Float.valueOf(f15);
                objectArray3[5] = Float.valueOf(f14);
                objectArray3[4] = Float.valueOf(f10);
                objectArray3[3] = Float.valueOf(f);
                objectArray3[2] = matrix4f;
                objectArray3[1] = gK2;
                objectArray3[0] = aq_02;
                fL.h("\u00db", (Object)objectArray3, (long)8538241046212455271L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fL.h("\u00db", (Object)matchException, (long)8538704263002333087L, (long)l);
        }
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = Float.valueOf(f13 * 0.72f);
        Color color = new Color((int)fL.c("j", (int)31062, (long)(0x344BE70AC0A65204L ^ l)), (int)fL.c("j", (int)13491, (long)(0x250CC19C0A4A1FEDL ^ l)), (int)fL.c("j", (int)27667, (long)(0xA03706A5FFCC747L ^ l)), (int)fL.h("\u00db", (Object)objectArray4, (long)8522930661425359234L, (long)l));
        Object[] objectArray5 = new Object[10];
        objectArray5[9] = l3;
        objectArray5[8] = Float.valueOf(2.5f);
        objectArray5[7] = color;
        objectArray5[6] = Float.valueOf(f15);
        objectArray5[5] = Float.valueOf(f14);
        objectArray5[4] = Float.valueOf(f10);
        objectArray5[3] = Float.valueOf(f);
        objectArray5[2] = matrix4f;
        objectArray5[1] = gK2;
        objectArray5[0] = aq_02;
        fL.h("\u00db", (Object)objectArray5, (long)8521546204258957875L, (long)l);
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    private void j(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void q(Object[] var1_1) {
        block72: {
            block78: {
                block77: {
                    block71: {
                        block69: {
                            block70: {
                                block67: {
                                    block68: {
                                        block76: {
                                            block65: {
                                                block66: {
                                                    block64: {
                                                        block62: {
                                                            block63: {
                                                                block61: {
                                                                    block75: {
                                                                        block74: {
                                                                            block59: {
                                                                                block73: {
                                                                                    block60: {
                                                                                        block56: {
                                                                                            block58: {
                                                                                                block57: {
                                                                                                    var4_2 = (Matrix4f)var1_1[0];
                                                                                                    var2_3 = (cA)var1_1[1];
                                                                                                    var14_4 = ((Float)var1_1[2]).floatValue();
                                                                                                    var6_5 = ((Float)var1_1[3]).floatValue();
                                                                                                    var5_6 = ((Float)var1_1[4]).floatValue();
                                                                                                    var11_7 = ((Float)var1_1[5]).floatValue();
                                                                                                    var3_8 = ((Float)var1_1[6]).floatValue();
                                                                                                    var13_9 = ((Float)var1_1[7]).floatValue();
                                                                                                    var12_10 = ((Float)var1_1[8]).floatValue();
                                                                                                    var7_11 = (Long)var1_1[9];
                                                                                                    var9_12 = (Long)var1_1[10];
                                                                                                    v0 = var9_12 = fL.B ^ var9_12;
                                                                                                    var15_13 = v0 ^ 4428948817655L;
                                                                                                    var17_14 = v0 ^ 48408362557173L;
                                                                                                    var19_15 = v0 ^ 133426880095119L;
                                                                                                    var21_16 = v0 ^ 64073203559255L;
                                                                                                    var23_17 = v0 ^ 41230823818347L;
                                                                                                    var25_18 = v0 ^ 62202941512544L;
                                                                                                    var27_19 = v0 ^ 70663756624400L;
                                                                                                    var29_20 = v0 ^ 46746568911314L;
                                                                                                    var31_21 = v0 ^ 83707440354137L;
                                                                                                    var33_22 = v0 ^ 100734159960582L;
                                                                                                    v1 = new Object[2];
                                                                                                    v1[1] = var15_13;
                                                                                                    v1[0] = Float.valueOf(var3_8 / var13_9);
                                                                                                    var36_23 = fL.h("\u00db", (Object)v1, (long)559472627675978367L, (long)var9_12);
                                                                                                    var37_24 = (Color)fL.h("W", (Object)this.u, (long)575126863079120753L, (long)var9_12);
                                                                                                    var35_25 = fL.h("\u00db", (long)574247023583445014L, (long)var9_12);
                                                                                                    var38_26 = (Color)fL.h("W", (Object)this.v, (long)575126863079120753L, (long)var9_12);
                                                                                                    v2 = new Object[4];
                                                                                                    v2[3] = var23_17;
                                                                                                    v2[2] = Float.valueOf((float)var36_23);
                                                                                                    v2[1] = var37_24;
                                                                                                    v2[0] = var38_26;
                                                                                                    var39_27 = fL.h("\u00db", (Object)v2, (long)575525557328851003L, (long)var9_12);
                                                                                                    var40_28 = var38_26;
                                                                                                    v3 = new Object[2];
                                                                                                    v3[1] = var21_16;
                                                                                                    v3[0] = Float.valueOf(var12_10 * 0.63f);
                                                                                                    var41_29 = new Color(0, 0, 0, (int)fL.h("\u00db", (Object)v3, (long)576390752649369658L, (long)var9_12));
                                                                                                    var42_30 = (String)fL.h("W", (Object)this.k, (long)575126863079120753L, (long)var9_12);
                                                                                                    var43_31 = 2.6f;
                                                                                                    var44_32 = 3.0f;
                                                                                                    var45_33 = 1.6f;
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v4 /* !! */  = fL.h("W", var42_30, (Object)fL.b("m", (int)24233, (long)(7604853093275881908L ^ var9_12)), (long)561989228088150819L, (long)var9_12);
                                                                                                                if (var35_25 != null) break block56;
                                                                                                                if (v4 /* !! */  != false) break block57;
                                                                                                            }
                                                                                                            catch (MatchException v5) {
                                                                                                                throw fL.h("\u00db", (Object)v5, (long)560656766743440935L, (long)var9_12);
                                                                                                            }
                                                                                                            v4 /* !! */  = fL.h("W", var42_30, (Object)fL.b("m", (int)70, (long)(3235021972429246303L ^ var9_12)), (long)561989228088150819L, (long)var9_12);
                                                                                                            if (var35_25 != null) break block56;
                                                                                                        }
                                                                                                        catch (MatchException v6) {
                                                                                                            throw fL.h("\u00db", (Object)v6, (long)560656766743440935L, (long)var9_12);
                                                                                                        }
                                                                                                        if (v4 /* !! */  == false) break block58;
                                                                                                    }
                                                                                                    catch (MatchException v7) {
                                                                                                        throw fL.h("\u00db", (Object)v7, (long)560656766743440935L, (long)var9_12);
                                                                                                    }
                                                                                                }
                                                                                                v4 /* !! */  = (CallSite)true;
                                                                                                break block56;
                                                                                            }
                                                                                            v4 /* !! */  = (CallSite)false;
                                                                                        }
                                                                                        var50_34 /* !! */  = v4 /* !! */ ;
                                                                                        try {
                                                                                            try {
                                                                                                v8 /* !! */  = var50_34 /* !! */ ;
                                                                                                if (var35_25 != null) break block59;
                                                                                                if (v8 /* !! */  != false) {
                                                                                                }
                                                                                                ** GOTO lbl99
                                                                                            }
                                                                                            catch (MatchException v9) {
                                                                                                throw fL.h("\u00db", (Object)v9, (long)560656766743440935L, (long)var9_12);
                                                                                            }
                                                                                            if (fL.h("W", var42_30, (Object)fL.b("m", (int)31375, (long)(8507886106040235421L ^ var9_12)), (long)561989228088150819L, (long)var9_12) == false) break block60;
                                                                                        }
                                                                                        catch (MatchException v10) {
                                                                                            throw fL.h("\u00db", (Object)v10, (long)560656766743440935L, (long)var9_12);
                                                                                        }
                                                                                        var48_35 = var14_4 - var44_32;
                                                                                        var46_36 = var48_35 - var43_31;
                                                                                        if (var35_25 == null) break block73;
                                                                                    }
                                                                                    var46_36 = var5_6 + var44_32;
                                                                                    var48_35 = var46_36 + var43_31;
                                                                                }
                                                                                var47_37 = var6_5;
                                                                                var49_38 = var11_7;
                                                                                try {
                                                                                    if (var35_25 == null) break block61;
lbl99:
                                                                                    // 2 sources

                                                                                    v8 /* !! */  = fL.h("W", var42_30, (Object)fL.b("m", (int)30480, (long)(831681734592231436L ^ var9_12)), (long)561989228088150819L, (long)var9_12);
                                                                                }
                                                                                catch (MatchException v11) {
                                                                                    throw fL.h("\u00db", (Object)v11, (long)560656766743440935L, (long)var9_12);
                                                                                }
                                                                            }
                                                                            if (v8 /* !! */  == false) break block74;
                                                                            var49_38 = var6_5 - var44_32;
                                                                            var47_37 = var49_38 - var43_31;
                                                                            if (var35_25 == null) break block75;
                                                                        }
                                                                        var47_37 = var11_7 + var44_32;
                                                                        var49_38 = var47_37 + var43_31;
                                                                    }
                                                                    var46_36 = var14_4;
                                                                    var48_35 = var5_6;
                                                                }
                                                                v12 = new Object[8];
                                                                v12[7] = var31_21;
                                                                v12[6] = Float.valueOf(var45_33);
                                                                v12[5] = var41_29;
                                                                v12[4] = Float.valueOf(var49_38 + 0.6f);
                                                                v12[3] = Float.valueOf(var48_35 + 0.6f);
                                                                v12[2] = Float.valueOf(var47_37 - 0.6f);
                                                                v12[1] = Float.valueOf(var46_36 - 0.6f);
                                                                v12[0] = var4_2;
                                                                fL.h("\u00db", (Object)v12, (long)574635112490395654L, (long)var9_12);
                                                                if (var50_34 /* !! */  == false) break block76;
                                                                var51_39 = (var49_38 - var47_37) * var36_23;
                                                                var52_41 = var49_38 - var51_39;
                                                                try {
                                                                    try {
                                                                        cfr_temp_0 = var51_39 - 1.0f;
                                                                        v13 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                        if (var35_25 != null) break block62;
                                                                        if (v13 <= 0) break block63;
                                                                    }
                                                                    catch (MatchException v14) {
                                                                        throw fL.h("\u00db", (Object)v14, (long)560656766743440935L, (long)var9_12);
                                                                    }
                                                                    v15 = new Object[3];
                                                                    v15[2] = var25_18;
                                                                    v15[1] = Float.valueOf(var12_10);
                                                                    v15[0] = var40_28;
                                                                    v16 = new Object[3];
                                                                    v16[2] = var25_18;
                                                                    v16[1] = Float.valueOf(var12_10);
                                                                    v16[0] = var40_28;
                                                                    v17 = new Object[3];
                                                                    v17[2] = var25_18;
                                                                    v17[1] = Float.valueOf(var12_10);
                                                                    v17[0] = var39_27;
                                                                    v18 = new Object[3];
                                                                    v18[2] = var25_18;
                                                                    v18[1] = Float.valueOf(var12_10);
                                                                    v18[0] = var39_27;
                                                                    v19 = new Object[11];
                                                                    v19[10] = var19_15;
                                                                    v19[9] = new Vector4f(var45_33);
                                                                    v19[8] = fL.h("\u00db", (Object)v18, (long)561193088689673331L, (long)var9_12);
                                                                    v19[7] = fL.h("\u00db", (Object)v17, (long)561193088689673331L, (long)var9_12);
                                                                    v19[6] = fL.h("\u00db", (Object)v16, (long)561193088689673331L, (long)var9_12);
                                                                    v19[5] = fL.h("\u00db", (Object)v15, (long)561193088689673331L, (long)var9_12);
                                                                    v19[4] = Float.valueOf(var49_38);
                                                                    v19[3] = Float.valueOf(var48_35);
                                                                    v19[2] = Float.valueOf(var52_41);
                                                                    v19[1] = Float.valueOf(var46_36);
                                                                    v19[0] = var4_2;
                                                                    fL.h("\u00db", (Object)v19, (long)561862151796431524L, (long)var9_12);
                                                                }
                                                                catch (MatchException v20) {
                                                                    throw fL.h("\u00db", (Object)v20, (long)560656766743440935L, (long)var9_12);
                                                                }
                                                            }
                                                            v13 = (float)fL.h("W", (Object)((Boolean)fL.h("W", (Object)this.m, (long)575126863079120753L, (long)var9_12)), (long)562767022417768719L, (long)var9_12);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var35_25 != null) break block64;
                                                                    if (v13 == false) break block65;
                                                                }
                                                                catch (MatchException v21) {
                                                                    throw fL.h("\u00db", (Object)v21, (long)560656766743440935L, (long)var9_12);
                                                                }
                                                                v22 = var51_39;
                                                                if (var35_25 != null) break block66;
                                                            }
                                                            catch (MatchException v23) {
                                                                throw fL.h("\u00db", (Object)v23, (long)560656766743440935L, (long)var9_12);
                                                            }
                                                            cfr_temp_1 = v22 - 4.0f;
                                                            v13 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                        }
                                                        catch (MatchException v24) {
                                                            throw fL.h("\u00db", (Object)v24, (long)560656766743440935L, (long)var9_12);
                                                        }
                                                    }
                                                    try {
                                                        if (v13 <= 0) break block65;
                                                        v22 = (float)((double)(var7_11 % fL.d("t", (int)14603, (long)(1087237660537513127L ^ var9_12))) / 1600.0);
                                                    }
                                                    catch (MatchException v25) {
                                                        throw fL.h("\u00db", (Object)v25, (long)560656766743440935L, (long)var9_12);
                                                    }
                                                }
                                                var53_43 = v22;
                                                var54_44 /* !! */  = var52_41 + (var49_38 - var52_41) * var53_43;
                                                var55_45 = fL.h("\u00db", (float)8.0f, (float)(var51_39 * 0.35f), (long)560363455899823889L, (long)var9_12);
                                                v26 = new Object[2];
                                                v26[1] = var21_16;
                                                v26[0] = Float.valueOf(var12_10 * 0.28f * (1.0f - fL.h("\u00db", (float)(var53_43 - 0.5f), (long)562856545273072536L, (long)var9_12) * 2.0f));
                                                var56_46 = new Color((int)fL.c("j", (int)31155, (long)(6052237522782495571L ^ var9_12)), (int)fL.c("j", (int)31155, (long)(6052237522782495571L ^ var9_12)), (int)fL.c("j", (int)31155, (long)(6052237522782495571L ^ var9_12)), (int)fL.h("\u00db", (Object)v26, (long)576390752649369658L, (long)var9_12));
                                                v27 = new Object[7];
                                                v27[6] = var33_22;
                                                v27[5] = var56_46;
                                                v27[4] = Float.valueOf(var54_44 /* !! */  + var55_45 * 0.5f);
                                                v27[3] = Float.valueOf(var48_35);
                                                v27[2] = Float.valueOf(var54_44 /* !! */  - var55_45 * 0.5f);
                                                v27[1] = Float.valueOf(var46_36);
                                                v27[0] = var4_2;
                                                fL.h("\u00db", (Object)v27, (long)575557130494998049L, (long)var9_12);
                                            }
                                            if (var35_25 == null) break block70;
                                        }
                                        var51_39 = (var48_35 - var46_36) * var36_23;
                                        var52_41 = var46_36 + var51_39;
                                        try {
                                            try {
                                                cfr_temp_2 = var51_39 - 1.0f;
                                                v28 /* !! */  = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                if (var35_25 != null) break block67;
                                                if (v28 /* !! */  <= 0) break block68;
                                            }
                                            catch (MatchException v29) {
                                                throw fL.h("\u00db", (Object)v29, (long)560656766743440935L, (long)var9_12);
                                            }
                                            v30 = new Object[3];
                                            v30[2] = var25_18;
                                            v30[1] = Float.valueOf(var12_10);
                                            v30[0] = var40_28;
                                            v31 = new Object[3];
                                            v31[2] = var25_18;
                                            v31[1] = Float.valueOf(var12_10);
                                            v31[0] = var39_27;
                                            v32 = new Object[3];
                                            v32[2] = var25_18;
                                            v32[1] = Float.valueOf(var12_10);
                                            v32[0] = var39_27;
                                            v33 = new Object[3];
                                            v33[2] = var25_18;
                                            v33[1] = Float.valueOf(var12_10);
                                            v33[0] = var40_28;
                                            v34 = new Object[11];
                                            v34[10] = var19_15;
                                            v34[9] = new Vector4f(var45_33);
                                            v34[8] = fL.h("\u00db", (Object)v33, (long)561193088689673331L, (long)var9_12);
                                            v34[7] = fL.h("\u00db", (Object)v32, (long)561193088689673331L, (long)var9_12);
                                            v34[6] = fL.h("\u00db", (Object)v31, (long)561193088689673331L, (long)var9_12);
                                            v34[5] = fL.h("\u00db", (Object)v30, (long)561193088689673331L, (long)var9_12);
                                            v34[4] = Float.valueOf(var49_38);
                                            v34[3] = Float.valueOf(var52_41);
                                            v34[2] = Float.valueOf(var47_37);
                                            v34[1] = Float.valueOf(var46_36);
                                            v34[0] = var4_2;
                                            fL.h("\u00db", (Object)v34, (long)561862151796431524L, (long)var9_12);
                                        }
                                        catch (MatchException v35) {
                                            throw fL.h("\u00db", (Object)v35, (long)560656766743440935L, (long)var9_12);
                                        }
                                    }
                                    v28 /* !! */  = (float)fL.h("W", (Object)((Boolean)fL.h("W", (Object)this.m, (long)575126863079120753L, (long)var9_12)), (long)562767022417768719L, (long)var9_12);
                                }
                                try {
                                    try {
                                        try {
                                            if (var35_25 != null) break block69;
                                            if (v28 /* !! */  == false) break block70;
                                        }
                                        catch (MatchException v36) {
                                            throw fL.h("\u00db", (Object)v36, (long)560656766743440935L, (long)var9_12);
                                        }
                                        cfr_temp_3 = var51_39 - 4.0f;
                                        v28 /* !! */  = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                        if (var35_25 != null) break block69;
                                    }
                                    catch (MatchException v37) {
                                        throw fL.h("\u00db", (Object)v37, (long)560656766743440935L, (long)var9_12);
                                    }
                                    if (v28 /* !! */  <= 0) break block70;
                                }
                                catch (MatchException v38) {
                                    throw fL.h("\u00db", (Object)v38, (long)560656766743440935L, (long)var9_12);
                                }
                                var53_43 = (float)((double)(var7_11 % fL.d("t", (int)14324, (long)(8408542817475619418L ^ var9_12))) / 1600.0);
                                var54_44 /* !! */  = var46_36 + var51_39 * var53_43;
                                var55_45 = fL.h("\u00db", (float)8.0f, (float)(var51_39 * 0.35f), (long)560363455899823889L, (long)var9_12);
                                v39 = new Object[2];
                                v39[1] = var21_16;
                                v39[0] = Float.valueOf(var12_10 * 0.28f * (1.0f - fL.h("\u00db", (float)(var53_43 - 0.5f), (long)562856545273072536L, (long)var9_12) * 2.0f));
                                var56_46 = new Color((int)fL.c("j", (int)31155, (long)(6052237522782495571L ^ var9_12)), (int)fL.c("j", (int)31155, (long)(6052237522782495571L ^ var9_12)), (int)fL.c("j", (int)31155, (long)(6052237522782495571L ^ var9_12)), (int)fL.h("\u00db", (Object)v39, (long)576390752649369658L, (long)var9_12));
                                v40 = new Object[7];
                                v40[6] = var33_22;
                                v40[5] = var56_46;
                                v40[4] = Float.valueOf(var49_38);
                                v40[3] = Float.valueOf(var54_44 /* !! */  + var55_45 * 0.5f);
                                v40[2] = Float.valueOf(var47_37);
                                v40[1] = Float.valueOf(var54_44 /* !! */  - var55_45 * 0.5f);
                                v40[0] = var4_2;
                                fL.h("\u00db", (Object)v40, (long)575557130494998049L, (long)var9_12);
                            }
                            v28 /* !! */  = (float)fL.h("W", (Object)((Boolean)fL.h("W", (Object)this.l, (long)575126863079120753L, (long)var9_12)), (long)562767022417768719L, (long)var9_12);
                        }
                        try {
                            try {
                                if (var35_25 != null) break block71;
                                if (v28 /* !! */  == false) break block72;
                            }
                            catch (MatchException v41) {
                                throw fL.h("\u00db", (Object)v41, (long)560656766743440935L, (long)var9_12);
                            }
                            v28 /* !! */  = (float)fL.h("\u00db", (float)var3_8, (long)561417005399436626L, (long)var9_12);
                        }
                        catch (MatchException v42) {
                            throw fL.h("\u00db", (Object)v42, (long)560656766743440935L, (long)var9_12);
                        }
                    }
                    var51_40 = fL.h("\u00db", (int)v28 /* !! */ , (long)561148324323010162L, (long)var9_12);
                    v43 = new Object[2];
                    v43[1] = var21_16;
                    v43[0] = Float.valueOf(var12_10 * 0.55f);
                    var52_42 = new Color(0, 0, 0, (int)fL.h("\u00db", (Object)v43, (long)576390752649369658L, (long)var9_12));
                    var53_43 = 0.5f;
                    v44 = new Object[2];
                    v44[1] = var17_14;
                    v44[0] = var51_40;
                    var54_44 /* !! */  = (float)(fL.h("W", (Object)var2_3, (Object)v44, (long)565033408940621107L, (long)var9_12) * var53_43);
                    v45 = new Object[1];
                    v45[0] = var27_19;
                    var55_45 = fL.h("W", (Object)var2_3, (Object)v45, (long)559658092633850986L, (long)var9_12) * var53_43;
                    if (var50_34 /* !! */  == false) break block77;
                    var56_47 = (var46_36 + var48_35) * 0.5f - var54_44 /* !! */  * 0.5f;
                    var57_48 = var49_38 + 2.0f;
                    if (var35_25 == null) break block78;
                }
                var56_47 = (var46_36 + var48_35) * 0.5f - var54_44 /* !! */  * 0.5f;
                try {
                    v46 = fL.h("W", var42_30, (Object)fL.b("m", (int)8121, (long)(7471090168311845048L ^ var9_12)), (long)561989228088150819L, (long)var9_12) != false ? var47_37 - var55_45 - 2.0f : var49_38 + 2.0f;
                }
                catch (MatchException v47) {
                    throw fL.h("\u00db", (Object)v47, (long)560656766743440935L, (long)var9_12);
                }
                var57_48 = v46;
            }
            v48 = new Object[8];
            v48[7] = var31_21;
            v48[6] = Float.valueOf(1.5f);
            v48[5] = var52_42;
            v48[4] = Float.valueOf(var57_48 + var55_45 + 1.0f);
            v48[3] = Float.valueOf(var56_47 + var54_44 /* !! */  + 2.0f);
            v48[2] = Float.valueOf(var57_48 - 1.0f);
            v48[1] = Float.valueOf(var56_47 - 2.0f);
            v48[0] = var4_2;
            fL.h("\u00db", (Object)v48, (long)574635112490395654L, (long)var9_12);
            v49 = new Object[3];
            v49[2] = var25_18;
            v49[1] = Float.valueOf(var12_10);
            v49[0] = new Color((int)fL.c("j", (int)22749, (long)(2531174989668549172L ^ var9_12)), (int)fL.c("j", (int)30224, (long)(4544931900328488191L ^ var9_12)), (int)fL.c("j", (int)16959, (long)(1189024280051161297L ^ var9_12)));
            var58_49 = fL.h("\u00db", (Object)v49, (long)561193088689673331L, (long)var9_12);
            v50 = new Object[7];
            v50[6] = var29_20;
            v50[5] = var58_49;
            v50[4] = Float.valueOf(var53_43);
            v50[3] = Float.valueOf(var57_48);
            v50[2] = Float.valueOf(var56_47);
            v50[1] = var51_40;
            v50[0] = var4_2;
            fL.h("W", (Object)var2_3, (Object)v50, (long)559186248332405343L, (long)var9_12);
        }
    }

    private void r(Object[] objectArray) {
        aq_0 aq_02 = (aq_0)objectArray[0];
        gK gK2 = (gK)objectArray[1];
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        cA cA2 = (cA)objectArray[3];
        float f = ((Float)objectArray[4]).floatValue();
        float f10 = ((Float)objectArray[5]).floatValue();
        float f11 = ((Float)objectArray[6]).floatValue();
        String string = (String)objectArray[7];
        float f12 = ((Float)objectArray[8]).floatValue();
        long l = (Long)objectArray[9];
        long l2 = l = B ^ l;
        long l3 = l2 ^ 0x300CB7EEF7B0L;
        long l4 = l2 ^ 0x50EA14696A7CL;
        long l5 = l2 ^ 0x5C4EF4B35B55L;
        long l6 = l2 ^ 0x249884947225L;
        long l7 = l2 ^ 0x3ABB60251843L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = string;
        CallSite callSite = fL.h("W", (Object)cA2, (Object)objectArray2, (long)-1255806183217965962L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l5;
        CallSite callSite2 = fL.h("W", (Object)cA2, (Object)objectArray3, (long)-1260636141888803537L, (long)l);
        float f13 = 4.0f;
        float f14 = 1.5f;
        reference var27_21 = callSite + f13 * 2.0f;
        float f15 = (f + f11) * 0.5f;
        float f16 = f15 - var27_21 * 0.5f;
        float f17 = f16 + var27_21;
        float f18 = f10 - 3.0f;
        float f19 = f18 - (callSite2 + f14 * 2.0f);
        Object[] objectArray4 = new Object[9];
        objectArray4[8] = l4;
        objectArray4[7] = Float.valueOf(f12);
        objectArray4[6] = Float.valueOf(f18);
        objectArray4[5] = Float.valueOf(f17);
        objectArray4[4] = Float.valueOf(f19);
        objectArray4[3] = Float.valueOf(f16);
        objectArray4[2] = matrix4f;
        objectArray4[1] = gK2;
        objectArray4[0] = aq_02;
        fL.h("W", (Object)this, (Object)objectArray4, (long)-1244577206522230546L, (long)l);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l6;
        objectArray5[1] = Float.valueOf(f12);
        objectArray5[0] = new Color((int)fL.c("j", (int)30224, (long)(0x3F12CB71F3C445BAL ^ l)), (int)fL.c("j", (int)30224, (long)(0x3F12CB71F3C445BAL ^ l)), (int)fL.c("j", (int)13910, (long)(0x3E73325958CB85FBL ^ l)));
        CallSite callSite3 = fL.h("\u00db", (Object)objectArray5, (long)-1257385905561305802L, (long)l);
        Object[] objectArray6 = new Object[6];
        objectArray6[5] = l7;
        objectArray6[4] = callSite3;
        objectArray6[3] = Float.valueOf(f19 + f14);
        objectArray6[2] = Float.valueOf(f16 + f13);
        objectArray6[1] = string;
        objectArray6[0] = matrix4f;
        fL.h("W", (Object)cA2, (Object)objectArray6, (long)-1245113400356022230L, (long)l);
    }

    private boolean lambda$new$0(Float f) {
        long l = B ^ 0x46A6B3A7798DL;
        long l2 = l ^ 0x69D1AFF003E6L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)26723, (long)(0x7E32EF7C9BE96B8AL ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)-8413726683422078551L, (long)l);
    }

    private boolean lambda$new$2(Boolean bl) {
        long l = B ^ 0x259C9FFD2FD6L;
        long l2 = l ^ 0xAEB83AA55BDL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)32747, (long)(0x6066E7C665CCAA49L ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)-2493002896782876686L, (long)l);
    }

    private boolean lambda$new$1(Float f) {
        long l = B ^ 0x390BB8CA0E3L;
        long l2 = l ^ 0x2CE7A7DBDA88L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)19901, (long)(0x7D6AA7C567621723L ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)5931862065610035399L, (long)l);
    }

    private boolean lambda$new$3(Float f) {
        Object object;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = B ^ 0x50AED1794486L;
                    long l2 = l ^ 0x7FD9CD2E3EEDL;
                    callSite = fL.h("\u00db", (long)-5325100302203096585L, (long)l);
                    try {
                        try {
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l2;
                            objectArray[0] = fL.b("m", (int)19932, (long)(0x6C559C5A59EF328L ^ l));
                            object = fL.h("W", (Object)this.f, (Object)objectArray, (long)-5316668544648678238L, (long)l);
                            if (callSite != null) break block6;
                            if (object == false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fL.h("\u00db", (Object)matchException, (long)-5321414697357484090L, (long)l);
                        }
                        object = fL.h("W", (Object)((Boolean)((Object)fL.h("W", (Object)this.i, (long)-5324924880313766256L, (long)l))), (long)-5319302577666637586L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fL.h("\u00db", (Object)matchException, (long)-5321414697357484090L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (object == false) break block7;
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)-5321414697357484090L, (long)l);
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private boolean lambda$new$4(String string) {
        long l = B ^ 0x616FE3ECC4EAL;
        long l2 = l ^ 0x4E18FFBBBE81L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)27523, (long)(0x697A70C47A425511L ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)3916820927310820558L, (long)l);
    }

    private boolean lambda$new$10(Color color) {
        long l = B ^ 0x1FDD93B2C6BEL;
        long l2 = l ^ 0x30AA8FE5BCD5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)27523, (long)(0x697A0E760A1C5745L ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)3751262454931486362L, (long)l);
    }

    private boolean lambda$new$5(Boolean bl) {
        long l = B ^ 0x1EE1B38DDCE5L;
        long l2 = l ^ 0x3196AFDAA68EL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)11724, (long)(0x2802E2CBF9130B4EL ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)3338337684304981185L, (long)l);
    }

    private boolean lambda$new$9(Color color) {
        long l = B ^ 0x6F167F48A888L;
        long l2 = l ^ 0x4061631FD2E3L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)27523, (long)(0x697A7EBDE6E63973L ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)6501326046615902380L, (long)l);
    }

    private boolean lambda$new$6(Boolean bl) {
        long l = B ^ 0x2D0F835B52E6L;
        long l2 = l ^ 0x2789F0C288DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)27523, (long)(0x697A3CA41AF5C31DL ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)-6893010459681955134L, (long)l);
    }

    private boolean lambda$new$8(Color color) {
        long l = B ^ 0x6685903FEABBL;
        long l2 = l ^ 0x49F28C6890D0L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fL.b("m", (int)32747, (long)(0x6066A4DF6A0E6F24L ^ l));
        return (boolean)fL.h("W", (Object)this.f, (Object)objectArray, (long)1732285018727668383L, (long)l);
    }

    private boolean lambda$new$7(Color color) {
        Object object;
        block2: {
            block3: {
                long l = B ^ 0x3D378C2CC1EBL;
                CallSite callSite = fL.h("\u00db", (long)3707620159893959834L, (long)l);
                try {
                    object = fL.h("W", (Object)((Boolean)((Object)fL.h("W", (Object)this.q, (long)3708569784268860413L, (long)l))), (long)3693910349666960771L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw fL.h("\u00db", (Object)matchException, (long)3696298743132543659L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static double lambda$onTick$11(f9 f92) {
        return f92.g;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fL.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(fL.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(fL.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(fL.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

