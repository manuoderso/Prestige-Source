/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1764
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_2378
 *  net.minecraft.class_243
 *  net.minecraft.class_6880
 *  org.joml.Quaternionf
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.g5;
import dev.zprestige.prestige.g6;
import dev.zprestige.prestige.gX;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
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
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2378;
import net.minecraft.class_243;
import net.minecraft.class_6880;
import org.joml.Quaternionf;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fJ
extends dV {
    private static final float[] a;
    public dR c;
    public dN d;
    private ArrayList e;
    private boolean i;
    private class_1799 f;
    private String h;
    private boolean g;
    private boolean j;
    private int k;
    private float l;
    private float m;
    private double n;
    private double o;
    private double p;
    private static final float q = 12.0f;
    private static final float r = 7.0f;
    private static final float s = 20.0f;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private long x;
    private static final long y;
    private static final String[] z;
    private static final String[] A;
    private static final Map B;
    private static final long[] C;
    private static final Integer[] D;
    private static final Map E;
    private static final long[] F;
    private static final Long[] G;
    private static final Map H;
    private static final Object[] I;
    private static final String[] J;

    public fJ() {
        long l = y ^ 0x11479E816E1AL;
        this.e = new ArrayList();
        this.i = 0;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = 0;
        this.x = (long)fJ.d("r", (int)14499, (long)(0x5C2448D8AA642591L ^ l));
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
                                fJ.y = hc.a(-7999499569549194020L, 833176042031669244L, MethodHandles.lookup().lookupClass()).a(28506729148146L);
                                fJ.I = new Object[155];
                                fJ.J = new String[155];
                                fJ.f();
                                fJ.B = new HashMap<K, V>(13);
                                var22 = fJ.y ^ 136947648330180L;
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
                                var31_3 = new String[10];
                                var29_4 = 0;
                                var28_5 = "L\u008e\f\u0096\u00a5\u0002.\u0096\u0090\u0003L\u00c5\u00ba;#o\u0010\u0006\u0095.\u00d6\u00a6\u00bf\u00dc\u0086\u00c9\u00few\u00ccn)\u00dfj\u00109kY\u0089\u009c\u0086\u000f\u00a1\u009aJd\u00b3\u00b8\u000bg\b\u0010\u00d6\u00c4\"P$\u00fa\u00c6T\u007f\u00ef\u00a6\u0097\u00c9\u0090\u0096\u0017\u0010g0\f\u009d\u00fb\u0096\u0087\u00f9\u00c4\u00bc\u0002\u0005\u00f2\u0005=\u00f8\u0018\u00a2\u00bd\u00c6\u00ef\u00cf)\u0005\u00dd\u00fe\u008ei\u00c1\\9\u0097\u0011Fmu!\u00b5\u0082x\u008c\u0018\u00eaJ1\u0002\u009f\u001aTNsz$x\u00a9T\u0005 k@\u001a\u00de\u00a3\u00ad\u00ae\u00e8\u0010\u00a9 \u0081^\u00d7\u0091F\u00ac\u0099\u00e5\u008a\u009c\u00f4\u00ab\u00e9\u00fc";
                                var30_6 = "L\u008e\f\u0096\u00a5\u0002.\u0096\u0090\u0003L\u00c5\u00ba;#o\u0010\u0006\u0095.\u00d6\u00a6\u00bf\u00dc\u0086\u00c9\u00few\u00ccn)\u00dfj\u00109kY\u0089\u009c\u0086\u000f\u00a1\u009aJd\u00b3\u00b8\u000bg\b\u0010\u00d6\u00c4\"P$\u00fa\u00c6T\u007f\u00ef\u00a6\u0097\u00c9\u0090\u0096\u0017\u0010g0\f\u009d\u00fb\u0096\u0087\u00f9\u00c4\u00bc\u0002\u0005\u00f2\u0005=\u00f8\u0018\u00a2\u00bd\u00c6\u00ef\u00cf)\u0005\u00dd\u00fe\u008ei\u00c1\\9\u0097\u0011Fmu!\u00b5\u0082x\u008c\u0018\u00eaJ1\u0002\u009f\u001aTNsz$x\u00a9T\u0005 k@\u001a\u00de\u00a3\u00ad\u00ae\u00e8\u0010\u00a9 \u0081^\u00d7\u0091F\u00ac\u0099\u00e5\u008a\u009c\u00f4\u00ab\u00e9\u00fc".length();
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
                                    var31_3[var29_4++] = fJ.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u007f\u00c4\\,\u007f\u00c1D\u009b\n\u0018\u00cez#\u00e7\u00cb4\u0010>\u00e1\u0015PQG\u00ec\u00f0\u00b0o\u00e2\u0097s\u0085.\u00fa";
                                    var30_6 = "\u007f\u00c4\\,\u007f\u00c1D\u009b\n\u0018\u00cez#\u00e7\u00cb4\u0010>\u00e1\u0015PQG\u00ec\u00f0\u00b0o\u00e2\u0097s\u0085.\u00fa".length();
                                    var27_7 = 16;
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
                                    var31_3[var29_4++] = fJ.b(var32_9).intern();
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
                        fJ.z = var31_3;
                        fJ.A = new String[10];
                        fJ.E = new HashMap<K, V>(13);
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
                        var17_12 = new long[7];
                        var14_13 = 0;
                        var15_14 = "\u008aS\u00dfG\u00f4\u0001n\u0084\u00a6\u00ad\u00d2\u00c3\u0089]\u00da\b\u00c3G\u00ecG2x#\u009b\u00b5\u0095\u00aax\u0091\u00f1\u00b5\u0017Cg\u00fb]#D\u007f\u0017";
                        var16_15 = "\u008aS\u00dfG\u00f4\u0001n\u0084\u00a6\u00ad\u00d2\u00c3\u0089]\u00da\b\u00c3G\u00ecG2x#\u009b\u00b5\u0095\u00aax\u0091\u00f1\u00b5\u0017Cg\u00fb]#D\u007f\u0017".length();
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
                            var15_14 = "\u00ac&K\u0010\u009f\u0000xF%\u008d\u00f4\u0091w\u0080\u00d2\r";
                            var16_15 = "\u00ac&K\u0010\u009f\u0000xF%\u008d\u00f4\u0091w\u0080\u00d2\r".length();
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
                fJ.C = var17_12;
                fJ.D = new Integer[7];
                fJ.H = new HashMap<K, V>(13);
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
                var6_22 = new long[7];
                var3_23 = 0;
                var4_24 = "\u009e\u00f7\u00d3\u00d2\u00e4\u0095\u00eb\u0011\u00c8\u00c2m\u0004\u0087\u001f9\u001bN\u008b\u00ddO\u0088-\u00dex\u0004h\u0096\u00b1\u00dcC\u000e\u000e\u0003'\u00ab\u00c2\u00fb\u00d1\u00f5Z";
                var5_25 = "\u009e\u00f7\u00d3\u00d2\u00e4\u0095\u00eb\u0011\u00c8\u00c2m\u0004\u0087\u001f9\u001bN\u008b\u00ddO\u0088-\u00dex\u0004h\u0096\u00b1\u00dcC\u000e\u000e\u0003'\u00ab\u00c2\u00fb\u00d1\u00f5Z".length();
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
                    var4_24 = "UH\u00ab\u0000<\u00a12\u0096\u009es\u00a6u'\u009b\u00e1%";
                    var5_25 = "UH\u00ab\u0000<\u00a12\u0096\u009es\u00a6u'\u009b\u00e1%".length();
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
        fJ.F = var6_22;
        fJ.G = new Long[7];
        fJ.a = new float[]{0.0f, -10.0f, 10.0f};
    }

    /*
     * Unable to fully structure code
     */
    private gX b(Object[] var1_1) {
        block12: {
            block11: {
                var2_2 = ((Float)var1_1[0]).floatValue();
                var4_3 = (class_1799)var1_1[1];
                var3_4 = (class_1799)var1_1[2];
                var5_5 = (Long)var1_1[3];
                v0 = var5_5 = fJ.y ^ var5_5;
                var7_6 = v0 ^ 92495623130178L;
                var9_7 = v0 ^ 51321322858487L;
                var11_8 = v0 ^ 2265100758867L;
                var14_9 = new ArrayList<E>();
                var15_10 = fJ.h("\u00f1", (Object)var3_4, (long)7004162855394447827L, (long)var5_5);
                var16_11 = fJ.h("\u00aa", (Object)fJ.b, (long)7007247552684034293L, (long)var5_5);
                v1 = new Object[2];
                v1[1] = var9_7;
                v1[0] = fJ.h("\u00aa", (Object)fJ.b, (long)7007247552684034293L, (long)var5_5);
                var17_12 = fJ.h("e", (Object)v1, (long)6993425107889318169L, (long)var5_5);
                v2 = new Object[1];
                v2[0] = var11_8;
                var18_13 = fJ.h("e", (Object)v2, (long)7004507662081004999L, (long)var5_5);
                var19_14 = fJ.h("\u00f1", (Object)var16_11, (long)7003202394145237481L, (long)var5_5);
                var20_15 = fJ.h("\u00f1", (Object)var16_11, (long)6991881405271398396L, (long)var5_5);
                v3 = fJ.h("e", (long)7003785815770561806L, (long)var5_5);
                fJ.h("\u00f1", (Object)var16_11, (double)fJ.h("\u00aa", (Object)var17_12, (long)6991927160396257886L, (long)var5_5), (double)fJ.h("\u00aa", (Object)var17_12, (long)7006164591066953887L, (long)var5_5), (double)fJ.h("\u00aa", (Object)var17_12, (long)6993950946135228680L, (long)var5_5), (long)7007543808104999468L, (long)var5_5);
                fJ.h("\u00f1", (Object)var16_11, (float)this.u, (long)7006295171709874303L, (long)var5_5);
                fJ.h("\u00f1", (Object)var16_11, (float)this.v, (long)7004937397186026806L, (long)var5_5);
                var13_16 = v3;
                var21_17 = new g5((class_1299)fJ.h("\u00e4", (long)7005250639244758416L, (long)var5_5), (class_1309)var16_11, (class_1937)fJ.h("\u00aa", (Object)fJ.b, (long)7003823533469383755L, (long)var5_5), var4_3);
                if (!(var15_10 instanceof class_1764)) ** GOTO lbl39
                var22_18 = fJ.h("\u00f1", (Object)var16_11, (float)1.0f, (long)7005357728358080272L, (long)var5_5);
                var23_20 = fJ.h("\u00f1", (Object)new Quaternionf(), (double)(var2_2 * 0.017453292f), (double)fJ.h("\u00aa", (Object)var22_18, (long)6991927160396257886L, (long)var5_5), (double)fJ.h("\u00aa", (Object)var22_18, (long)7006164591066953887L, (long)var5_5), (double)fJ.h("\u00aa", (Object)var22_18, (long)6993950946135228680L, (long)var5_5), (long)6993099773108245087L, (long)var5_5);
                var24_22 = fJ.h("\u00f1", (Object)var16_11, (float)1.0f, (long)6993179581885380880L, (long)var5_5);
                var25_23 = fJ.h("\u00f1", (Object)fJ.h("\u00f1", (Object)var24_22, (long)6992663211293368790L, (long)var5_5), (Object)var23_20, (long)7006514262615535826L, (long)var5_5);
                try {
                    fJ.h("\u00f1", (Object)var21_17, (double)((double)fJ.h("\u00f1", (Object)var25_23, (long)6993317429366252032L, (long)var5_5)), (double)((double)fJ.h("\u00f1", (Object)var25_23, (long)7006464338859218552L, (long)var5_5)), (double)((double)fJ.h("\u00f1", (Object)var25_23, (long)7007472989615058066L, (long)var5_5)), (float)3.15f, (float)1.0f, (long)7004736355898361312L, (long)var5_5);
                    if (var13_16 == null) break block11;
lbl39:
                    // 2 sources

                    fJ.h("\u00f1", (Object)var21_17, (Object)var16_11, (float)this.u, (float)this.v, (float)0.0f, (float)(fJ.h("e", (int)fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)7007247552684034293L, (long)var5_5), (long)7006663653261062103L, (long)var5_5), (long)7003544072433645218L, (long)var5_5) * 3.0f), (float)1.0f, (long)7006358592601249048L, (long)var5_5);
                }
                catch (MatchException v4) {
                    throw fJ.h("e", (Object)v4, (long)7007365279993182682L, (long)var5_5);
                }
            }
            var21_17.b = 1;
            var22_19 = 0;
            while (var21_17.b) {
                try {
                    try {
                        try {
                            v5 = var22_19++;
                            if (var13_16 != null || var13_16 != null) break block12;
                        }
                        catch (MatchException v6) {
                            throw fJ.h("e", (Object)v6, (long)7007365279993182682L, (long)var5_5);
                        }
                        if (v5 >= fJ.c("i", (int)13663, (long)(1293092068925727801L ^ var5_5))) break;
                    }
                    catch (MatchException v7) {
                        throw fJ.h("e", (Object)v7, (long)7007365279993182682L, (long)var5_5);
                    }
                    v8 = new Object[2];
                    v8[1] = var7_6;
                    v8[0] = var21_17;
                    fJ.h("\u00f1", var14_9, (Object)fJ.h("e", (Object)v8, (long)6992942185756963618L, (long)var5_5), (long)7004380286273491559L, (long)var5_5);
                    fJ.h("\u00f1", (Object)var21_17, (long)6992410169480928176L, (long)var5_5);
                    if (var13_16 == null) continue;
                    break;
                }
                catch (MatchException v9) {
                    throw fJ.h("e", (Object)v9, (long)7007365279993182682L, (long)var5_5);
                }
            }
            fJ.h("\u00f1", (Object)var16_11, (Object)var18_13, (long)7003354726772531695L, (long)var5_5);
            fJ.h("\u00f1", (Object)var16_11, (float)var19_14, (long)7006295171709874303L, (long)var5_5);
            fJ.h("\u00f1", (Object)var16_11, (float)var20_15, (long)7004937397186026806L, (long)var5_5);
            v5 = var23_21 = 0;
        }
        while (var23_21 < fJ.h("\u00f1", var14_9, (long)7004150484869395699L, (long)var5_5) - 1) {
            var24_22 = (class_243)fJ.h("\u00f1", var14_9, (int)var23_21, (long)7005126484961831907L, (long)var5_5);
            fJ.h("\u00f1", var14_9, (int)var23_21, (Object)new class_243((double)fJ.h("\u00aa", (Object)var24_22, (long)6991927160396257886L, (long)var5_5), (double)(fJ.h("\u00aa", (Object)var24_22, (long)7006164591066953887L, (long)var5_5) - 0.10000000149011612), (double)fJ.h("\u00aa", (Object)var24_22, (long)6993950946135228680L, (long)var5_5)), (long)7004017483148088001L, (long)var5_5);
            ++var23_21;
            if (var13_16 == null) continue;
        }
        return new gX(var14_9, var21_17.a);
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x72DA;
        if (A[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])B.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    B.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fJ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = z[n2].getBytes("ISO-8859-1");
            fJ.A[n2] = fJ.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return A[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fJ.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static float b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        float f12 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        l = y ^ l;
        return f + (f10 - f) * (1.0f - (float)fJ.h("e", (double)(-f12 * f11), (long)3192274726091321109L, (long)l));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fJ.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x304E;
        if (D[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = C[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])E.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    E.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fJ.D[n2] = n3;
        }
        return D[n2];
    }

    private static float c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        return ((f10 - f) % 360.0f + 540.0f) % 360.0f - 180.0f;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fJ.m(l, l2);
            object = I[n];
            try {
                if (!(object instanceof String)) break block2;
                fJ.I[n] = clazz = Class.forName(J[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite h(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fJ.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fJ.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fJ.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fJ.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = I;
        I[0] = "sk+@\u0017)ek.\u001a\u0004>r -\u001c\b*cg:\u000bC8_";
        objectArray[1] = "G\b7*B\u00192(<%SVO0/\"Z\u001f'";
        objectArray[2] = "}^k,j\u0014k^nvy\u0003|\u0015mpu\u0017mRzg>\u0002S";
        objectArray[3] = "{=0gb1\u000e\u001d;hs~o\u00130cw$\u001b";
        objectArray[4] = Void.TYPE;
        fJ.J[4] = "java/lang/Void";
        objectArray[5] = "X\u0014J\u0019d-S\u001b[V\u0007 F\u0016T=2\"W\u0005H\u0011%/";
        objectArray[6] = "I\u001b[\\\u0010pW\u0013A\u0013\u007fwQ\u001bTqWvW";
        objectArray[7] = Integer.TYPE;
        fJ.J[7] = "java/lang/Integer";
        objectArray[8] = "\u0004\u001d\u000f7fxq=\u00048w7\u00103\u000f3smd";
        objectArray[9] = "f\u00046n0/p\u000434#8gO02/,v\b'%d;I";
        objectArray[10] = "0-\u0019#\u000ei;\"\blog0)\f6";
        objectArray[11] = "/8$Xe[$75\u0017\u0018N6-7T";
        objectArray[12] = Long.TYPE;
        fJ.J[12] = "java/lang/Long";
        objectArray[13] = "noDN\u0002Ipg^\u0001\u007fYp";
        objectArray[14] = "/ z\u0003[^/ m_WQ5kmAWD2\u001a=\u001c\u0006";
        objectArray[15] = "B^\u000eh\u0014\fB^\u00194\u0018\u0003X\u0015\u0019*\u0018\u0016_dMrO";
        objectArray[16] = "y\u000e\u000fp\n%y\u000e\u0018,\u0006*cE\u00182\u0006?d4JiQx";
        objectArray[17] = "ppBlURppU0Y]j;U.YHmJ\u0007u\u0001\u0002";
        objectArray[18] = Boolean.TYPE;
        fJ.J[18] = "java/lang/Boolean";
        objectArray[19] = "aTB6\f\f\u007f\\Xyk\rnGU#M\u000b";
        objectArray[20] = "}FfFb\u0012\bfmIs]ihfBw\u0007\u001d";
        objectArray[21] = Float.TYPE;
        fJ.J[21] = "java/lang/Float";
        objectArray[22] = "vh(/^v}g9`={ha";
        objectArray[23] = Double.TYPE;
        fJ.J[23] = "java/lang/Double";
        objectArray[24] = "}\u00055|\f\u0017v\n$3q\u000fe\r-z";
        objectArray[25] = "KK`\u001c%\u0003>kk\u00134L_e`\u00180\u0016+";
        objectArray[26] = "g\u001a~\u0007'3\u0012:u\b6|s4~\u00032&\u0007";
        objectArray[27] = "&\u00079I\fF&\u0007.\u0015\u0000I<L.\u000b\u0000\\;=\u007fSR";
        objectArray[28] = "e\u001ee;\u0012\u0015e\u001erg\u001e\u001a\u007fUry\u001e\u000fx$ -ON";
        objectArray[29] = ",\u001ai({$,\u001a~tw+6Q~jw>1 ,1/\u007f";
        objectArray[30] = "\rE\u001eJ8C\u001bE\u001b\u0010+T\f\u000e\u0018\u0016'@\u001dI\u000f\u0001lW+";
        objectArray[31] = "\u001f[U,[xj{^#J7\u000buU(Nm\u007f";
        objectArray[32] = "-UsOkNXux@z\u00019{sK~[M";
        objectArray[33] = "y\u0003IzsM\f#Bub\u0002m-I~fX\u0019";
        objectArray[34] = "xju\n\\\u0013njpPO\u0004y!sVC\u0010hfdA\b\u0004)";
        objectArray[35] = "'_szAA'_d&MN=\u0014d8M[:e1g\u0014";
        objectArray[36] = "\u0000\u0005(A\bT\u0000\u0005?\u001d\u0004[\u001aN?\u0003\u0004N\u001d?m\\U\u0004";
        objectArray[37] = "\u001a}'\u0002[q\u0018cnzT}\u0001`2\u001fW";
        objectArray[38] = "B\u0012~d4Q@\f7\u001b+_Y\u0005k$7QC\u0006z";
        objectArray[39] = "`\u001c;\u0004d\u0019`\u001c,Xh\u0016zW,Fh\u0003}&~\u001d<C";
        objectArray[40] = ".u\u001bbg^.u\f>kQ4>\f kD3O^~3\u0000";
        objectArray[41] = "phZ_\u0000\u0016rv\u0013 \u001f\u0018k\u007fO\u001f\u0003\u0016q|";
        objectArray[42] = "Q!>R\u001aPG!;\b\tGPj8\u000e\u0005SA-/\u0019NC\r";
        objectArray[43] = "\u00161@u\"\u0007c\u0011Kz3H\u0002\u001f@q7\u0012v";
        objectArray[44] = "oiH5EDoi_iIKu\"_wI^rS\r)\u0011\u0014";
        objectArray[45] = "%b:\u0001&\u0003PB1\u000e7L1L:\u00053\u0016E";
        objectArray[46] = "PvG \txFvBz\u001aoQ=A|\u0016{@zVk]o\u0002";
        objectArray[47] = "I10DgyT$hf&tL\"";
        objectArray[48] = "J#uw\t@J#b+\u0005OPhb5\u0005ZW\u00192lW\u001b";
        objectArray[49] = "1FT\b091FCT<6+\rCJ<#,|\u0015\u0015oa";
        objectArray[50] = "Fm\u0014mV\u0005Fm\u00031Z\n\\&\u0003/Z\u001f[WRz\r\\";
        objectArray[51] = "k\t[k\"fk\tL7.iqBL).|v3\u001aqz:";
        objectArray[52] = "0@Pl!\u007f.HJ#@z.HIcnf";
        objectArray[53] = "pvS>\n%pvDb\u0006*j=D|\u0006?mL\u0015#Pt";
        objectArray[54] = "\u00075\u0007\u0019\u00156r\u0015\f\u0016\u0004y\u0013\u001b\u0007\u001d\u0000#g";
        objectArray[55] = "\u001bR:\u001d*y\rR?G9n\u001a\u0019<A5z\u000b^+V~n'";
        objectArray[56] = "U'q\\\u007f[ \u0007zSn\u0014A\tqXjN5";
        objectArray[57] = "\u0011 N\u0001iH\u0011 Y]eG\u000bkYCeR\f\u001a\u000b\u0017=\u0011";
        objectArray[58] = "`\u0016\u001673K`\u0016\u0001k?Dz]\u0001u?Q},T!f\u0012";
        objectArray[59] = "\u0004 0``@\u0004 '<lO\u001ek'\"lZ\u0019\u001auv4\u001a";
        objectArray[60] = "J,jjD%\\,o0W2Kgl6[&Z {!\u00101o";
        objectArray[61] = "*\t-jw6_)&efy>'-nb#J";
        objectArray[62] = "QHwts\u0010$h|{b_Efwpf\u00051";
        objectArray[63] = "\u0018015U\u0000m\u0010::DO\f\u001e11@\u0015x";
        objectArray[64] = "e\u0016\n, e\u00106\u0001#1*q8\n(5p\u0005";
        objectArray[65] = "u@7\u000b_Z\u0000`<\u0004N\u0015an7\u000fJO\u0015";
        objectArray[66] = "\rF\u001eVht\u001a\u0001\t\u0012Rx\u0010\u0002>\u0011?z\u001b~LT+o\u001eBM\rn~}";
        objectArray[67] = "w\n\u0017^r;8L\u0016\u001cI/'\u001a\u000b\u000f\u001exyMSc 8xG\u001e\u00134p/\r";
        objectArray[68] = "Ecq\t\\qXqq]d/ZnuS\b\u001d\u000b,*\tUJF.sD\u00007\u000fphSds\u000freD\u000f0Yq*Hd";
        objectArray[69] = "HKz\u0017M]\u0011RmP/\u000bq\rl\u0016\u0012\u0006\u0003KrITbJI*\u0012K\u0010\fWuT/";
        objectArray[70] = "i`:X\r/m1`Wi |raS\u0005\u0012,>8\bi+ca?]\bxl?:4\u00077~0hUT8 5\u0001Z\u001b*/g`\t\u0014t*\u000e:\u000fV<u\u007fhZ\u00144\u0011";
        objectArray[71] = "LU\u0000M}[\u000f\u0017JS\u001eM4DCByEPRCL\"?";
        objectArray[72] = ",lS[TN\u007f,\u0017W\nrp8\u0010GU\u001eBlT\u001d\bI\u0015'T\\S\u000by-\nG^r,m\fWB\u0019o;\u000f\u0018Nr";
        objectArray[73] = "mFQ\u0005\u0016:.\u0004\u001b\u001bu$rEB\u0017\u0018^lTS\u000f\u0017'kFVPu&jCE\b\u0011e(\t[k";
        objectArray[74] = "L\tv4\u000e?FVza3oI\u001cW`Cs \fapLo\\^wo\u000f\u000f";
        objectArray[75] = "@|pC&CT4'\tWVDy.\u0014;d\u0017=rCW\u000e\u0016|6\u0010k\u000fO9's";
        objectArray[76] = "D\u0019.\u0011\u0015`\u001d\u00009Vw:}]v@M`@\u0016-\u0016\u0007b}_|\u0016\u000e;\f\r)T\u0006_";
        objectArray[77] = "\b3J~b\u0000Q*]9\u0000U1w\u0012/:\u0000\f<Iyp\u00021 \u001a'gEU6\u001a)<?";
        objectArray[78] = "!\u0006Xy^Y5N\u000f3/L%\u0003\u0006.C~vF_t/B8\u0002\u0019)S\u0010.\u001dZI";
        objectArray[79] = "A8n8bz\u00051<>\u0001}\u0006\u000ed*}m}(q/~|\u0001zg0=\u001c";
        objectArray[80] = "'i \"{k*&?#F~xTfv$z+>05#d\u0016kg*%$|=$-;\u0019'i \"{k*&?#F";
        objectArray[81] = ":z\tg\r+cc\u001e o\u007f\u0003>Q6U+>u\n`\u001f)\u0003iY>\bng\u007fY0S\u0014";
        objectArray[82] = "h\u000e<\u0006Y]wI\"\u0019:Vh\u001f \u0010m\u00012O}|TJfL-\u001d\u0007E8I";
        objectArray[83] = "{t\t#1]\"m\u001edS\u000bB0Qri]\u007f{\n$#_B5\u001bt9\u0001$q\u0012&?b";
        objectArray[84] = "q\tX\u0000\u0005zuX\u0002\u000faud\u001b\u0003\u000b\rG2Y_Q^\u0010g^\u0002\u000b\u001btq^\fPa+2X\u001a\b\u0010yg\u001a\u0012l";
        objectArray[85] = "(J:Yp&~H\"Yg[}wf\u0011ba.J-J4+,wd\u001b4\"u\u00066Nv*\u0011";
        objectArray[86] = "2h!nQNq*kp2[JybaUP.obo\u000e*";
        objectArray[87] = "%2\u0011\u007f7\u007f:'ErK|.*Ij'Nyj\u00184z\u00199,\u001447(<;H4Kwz7Nw/az9\u0015\r% \"1Si3 ,j)crx$,Murv\u007fVG4*~92Q4$%C8\u0010l,c'.\u0010bw\u0019xm\u0016t/h*8T|K";
        objectArray[88] = "EgB\u0001 J\u001c~UFB\u001c|#\u001aPxJAhA\u00062H|j\u0013V\u007fO\u001f}TA;u";
        objectArray[89] = "_\u000f\u000f-\bD[^U\"lKJ\u001dT&\u0000y\u001eQ\u0004\u007fP.IXU&\u0016J_X[}lO[\u0019N\"\tP\u001c\u0007QA";
        objectArray[90] = "d.8\rgv;-g\u0014\u0015wg,`\u0003B)?y>ov}cxvR*~6|";
        objectArray[91] = "\u001eF\u0018cc5AEGz\u00114\u001dD@mFjE\u0011\u001b\u0001r>\u0019\u0010V<.=L\u0014";
        objectArray[92] = "K{\bOA{\u0011$\rH\\\u0018\u0017-\u0013K[t%pU\u0011\u0001\u0018K|\u0017MZ{\u0003%P@\u0001\u0018\u0018<\u001dRZi\u0015:T[<%M9\u0017H\u0000$\u0014|\u0006+";
        objectArray[93] = "s^\u0011~S\u000b*G\u000691WJ\u001aI/\u000b\u000bwQ\u0012yA\tJ\u0018CyHP;J\u0016;@4";
        objectArray[94] = "\u0017\tt2_/A\u000bl2HRE4(zMh\u0011\tc!\u001b\"\u00134*p\u001b+JEx%Y#.";
        objectArray[95] = "Mb\"~\u00173\f=.e\u000bM\u001a>$\u007f\u0005\u001aEfq+i<H99\u007f\u0014u\u0016\".";
        objectArray[96] = "\u0006U\u0006\tw\u0017PW\u001e\t`jQhZAeP\u0000U\u0011\u001a3\u001a\u0002hXK3\u0013[\u0019\n\u001eq\u001b?";
        objectArray[97] = "lT\u0001\"g\u0002(]S$\u0004\u000f4B\u00072\u0004_k\u0010\u0017,u\r>R\u001fH";
        objectArray[98] = "+'3goV,r9>\u0015G\u0015vf:v\u0013\u007f %=h.";
        objectArray[99] = "i=2+\u001fqmlh${~|/i \u0017L*m5zE\u001b\u007fjh \u0001\u007fijf{{ *lp#\nr\u007f.xG";
        objectArray[100] = "2*\u0013E7v:._WPn=*nF\"zb%\u000f\u0015-$gL\u0000Z?+5-SUa.\\";
        objectArray[101] = "J\u0018>>\u001d@\u000e\u0011l8~I\u001b\u001fQiA_\u000e\u0000mh\u0018\u001a\u001fcnj\u001cEK\t8)\u001b[v";
        objectArray[102] = "<Y-sv~u\u00076d\u0012f \u0019+d~TpUq<)\u0003<Y-sv~u\u00076d\u0012";
        objectArray[103] = "1sW^\u001bx0b\u0012\\+n-`N\u000b|>u7\u0010gV~14\u001a\u001fWot6";
        objectArray[104] = "\u0016\u0005gdpyC\u0012k+\u0016,T\u000ez{p;u\u0015e{S&M\u0010am\u0016wE\u0017:d|*Q\r~\u0016";
        objectArray[105] = "\u000268\u00049\u000b^a}R\u0007\u0006\u001b\")\t|k]a\"\u000e:\u0001\u000b\"%\u0010\u0007\u0000\u0012\"?\r{R\u0004=|m";
        objectArray[106] = "5wC\u0019\u0010!8q\n\u0010v52wQ\u0007\u001a\u0007d2\f_JP<oTY\u0004m`l\u0001]v;/vN\u0000\ni9i\r`";
        objectArray[107] = "r5\u0013;/I6<A=LF\"\"|nrM-s\u001681J3N\u0017!1P.2E7.\u0013N";
        objectArray[108] = "z;;\n)\rr?w\u0018N\u000bu;FZq\u0017l>z[(R}]{X7\u0016waz\u0001r\u0007\u0014`y\u001e6\r(a ['n";
        objectArray[109] = "\"_\r\u001f34%\u0019K\u0010T>^ZB\tnkc\u0011\u0019_$i^\u0002\u000f\u0018.7;\u001dH\u00061T";
        objectArray[110] = "YR~?iLFG*2\u0015ORJ&*y}\u0000\nvp\u0015DMYx$t\u0017B\u0007}M{XP\b/,(W\u000e\rF#gE\u0001_'ph\u001b\u00046(ttMER>tz\u0016?X\u007f,rP[N\u007f\")*\u0004\ry4q[VX;<\u0015";
        objectArray[111] = "P\u0006;\u0004d)\u0019X \u0013\u00001LF=\u0013l\u0003\u001b\u000bdK?TS\u0002&\u0015y8Y\\=\u0018\u0000";
        objectArray[112] = "(?r\n{\u001f7d>eo}=44Ub\u0011\"}qe";
        objectArray[113] = "\u00050h*\u000f\u001c\\)\u007fmmG<t0{W\u001c\u0001?k-\u001d\u001e<v:-\u0014GM$oo\u001c#";
        objectArray[114] = "{nIFqnl)^\u0002Kbf*|\u0016'\r6i_\u0003(170\u001a\u0012K";
        objectArray[115] = ".\u0000\f{&2aF\r9\u001d&~\u0010\u0010*Jq!MKFzy#\u0012\u000e9~rpC";
        objectArray[116] = ":;\u001f\u0005':~2M\u0003D'k<pR{%~#LS\"`o@OQ&?;*\u0019\u0012!!\u0006\u007fN\r'al)\r\n9\\";
        objectArray[117] = "adJj}Bi`\u0006x\u001a[h\u007fQk\u001aO6cP}~Y6m\u000b\u0007'\u001evzT;&G3k7";
        objectArray[118] = "9h){B14n`r$%>h;eH\u0017l%c3$#7qbp\u0019\u007f4$f\u0002";
        objectArray[119] = "B0{Ir%\u00069)O\u00118\u001f9y#,|\u00073w\u001f-%B\"\u0014";
        objectArray[120] = "VC}P4lR\u0012'_PcCQ&[<Q\u0015\u0013z\u0001m\u0006@\u0014'[*bV\u0014)\u0000P";
        objectArray[121] = "X/'^\u0014/Q%*\u000fv#_+!\u0007\u001a\u0011\rhqYv,N%8\u0006\u0007!Hl1`\u001d6O(!\u001cO PkA";
        objectArray[122] = "O4@#<rKe\u001a,X}Z&\u001b(4O\faFpd\u0018V&\u00035;}Ia\u001d*X#\fe\u0002+)qY'\nO";
        objectArray[123] = "aU\u0015mO> W\u00039!gs\u0016\u0011fMU$V@8\u0010\u0002d\u0010L8]3a\u0007\u00108!l'\u000b\u0016{Ez'\u0005M\u0001O;\u007f\r\u000beY;qVqo\u0018cy\u0010\u0015y\u0018m\"j\u001f8@ed\u000e\t8N>\u001e\u0004H`Fxz\u0012Hn\u001d\u0002%QNxEsw\u0004\fp!";
        objectArray[124] = ")Io^*@vJ0GXA*K7P\u000f\u001fu\u001do<;K.\u001f!\u0001gH{\u001b";
        objectArray[125] = "\u0000\u001eP m(\b\u001a\u001c2\n&\u001e\u0000-#x$P\u0011LpwzUxC?eu\u0007\u0019\u00100;pn";
        objectArray[126] = "\u001dPS\t;W\t\u0018\u0004CJB\u0019U\r^&pJ\u0011Q\u0006JM\b[\u0014_;@\u000e\u0012\u001d9";
        objectArray[127] = " $=vk\u00029\"9%\u0002\n732/n8ephr\u0002Re6*+>S<s;HlV;((,zV5sR";
        objectArray[128] = "|w_\u0001\u0000{  \u001aW>g{E[\u0012_}s\u001eG\u0001Fr\"~\u001bV\u0003$\u001c";
        objectArray[129] = "!y\u0010$=bx`\u0007c_4\u0018=Hueb%v\u0013#/`\u0018o\ta =d=\u001f~c]";
        objectArray[130] = "2;\u0004\r%p&sSGTe6>ZZ8W`|\u0006\u0000h\u00005{[Z.d#{U\u0001T";
        objectArray[131] = "\u0015AW\u00101\u001a\u001bA\u0005\u0018P\u0019\bB\u000fF<+\\\u0003T\u001dh|X\u0001\u0016Y3@YXSHPAZG\u0017Bl@\u0003\u0002\u0006!mC\u001cF\f\u001dl\u001aYWo\u001co\u0005\u001d]S\u001d6@\f>";
        objectArray[132] = "\u0018\u0015\u0015\u0005Qx\u0010\u0011Y\u00176~\u0017\u0015h\u0006\u000fz\u0011\t\f\u0010\u000ftJs\u0006QW|\f\u0017\u0010QY'v\u001dQ\tQa\u0012\u000bQ\u0007\n\u001b";
        objectArray[133] = "?<([\u0007l5c$\u000e::>\"3b\u0005b11r\bS!6/O";
        objectArray[134] = "c]xHOJ:Do\u000f-\u001cZ\u0019 \u0019\u0017JgR{O]HZ\u0019+\tD\u00137\u001a.\r@\nZ";
        objectArray[135] = "}v3JQMb1-U2F}g/\\e\u0011'7s0\\Zs4\"Q\u000fU-1";
        objectArray[136] = "dr\u0002a\u0011VseY2/Arh{k@^r]BlT:qf]3F[\"i\u00036/Tm{\fdN\u0007b%\t\rAHp*[l\u0012G./2c]U!}S0R\u000b$\u0014Ik\u001fV!x^|D\u0005\u001f";
        objectArray[137] = "\u00059\u0004NtEZ:[W\u0006D\u0006;\\@Q\u001a\\g\t,eN\u0002oJ\u00119MWk";
        objectArray[138] = "Prs>dtT#)1\u0000{E`(5lI\u0015,rb\u0000p\u0011}/(df\u0011stRabPf+7~%NyH";
        objectArray[139] = "_J\u00187a\"\u001eH\u000ec\u000f{M\t\u001c<cI\u001dJC`\u000f%\u001bJ\u0005?~wN\b\r[";
        objectArray[140] = "ul8o\u001cs6.rq\u007fg\r}{`\u0018mik{nC\u0017";
        objectArray[141] = "X2x\u007fle\u00041-{\u001e=V*}!r\u000f\u0004f z\u001e2G$d o?AmmF";
        objectArray[142] = "bp\\%%~;iKbG+[4\u0004t}~f\u007f_\"7|[4\u000fd.'67\n`*>[";
        objectArray[143] = "TsZ\u0000\t@^>Q_uF78\u001a\fO\u0013\nsAZ\u0005\u00117`W\u001d\u000fOR\u007f\u0010\u0003\u0010,";
        objectArray[144] = "\u0012@hr\u0010\b\u0006\b?8a\u001d\u0016E6%\r/@\u0007j\u007f\\x\u0015\u00007%\u001b\u001c\u0003\u00009~a";
        objectArray[145] = "mwVU<\u001frb\u0002X@\u001cfo\u000e@,.6,Q\u001c@B0,\u0017C1\u0010en\u001f'";
        objectArray[146] = "^9\tM/VA~\u0017RLVR9\u0011P d\u0003{M\u000f}3G:\u000bY/W\u0004xAGL";
        objectArray[147] = "V,\u0007T\u0003oR'T\u0005yu\\a[\\\u0015G\n%\u0000\u0007H\u0010Cl_\u0006A+^~_Ry";
        objectArray[148] = "\u001c3p&On\u000btgbub\u0001wU\u007f\b`l6 b\rnP7y'\u001c\r";
        objectArray[149] = "h\u00102+\fh,\u0019`-oo(\u0006'(\u0013i.k1/\b7i[;p\u0004bT";
        objectArray[150] = "nH\u000e\u0003\u001c3i\u000eH\f{:\u0012MA\u0015Al/\u0006\u001aC\u000bn\u0012\u0015\f\u0004\u00010w\nK\u001a\u001eS";
        objectArray[151] = "g7{\taX$axFm31bgy.\r<l&\u0013xN;r\u001b";
        objectArray[152] = "k\r\u000439!tJ\u001a,Z*k\u001c\u0018%\r}1LFI46eO\u0015(g9;J";
        objectArray[153] = "f\u0012\u007fx]tbC%w9{s\u0000$sUI%Bx)\u0005\u001epE%sCzfE+(9";
        Object[] objectArray2 = objectArray;
        objectArray[154] = "\u00185\u0016L/kA,\u0001\u000bM6!qN\u001dwk\u001c:\u0015K=i!sDK40P!\u0011\t<T";
    }

    private void l(Object[] objectArray) {
        Object object;
        bt_0 bt_02 = (bt_0)objectArray[0];
        ArrayList arrayList = (ArrayList)objectArray[1];
        Color color = (Color)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (Long)objectArray[4];
        long l3 = l2 = y ^ l2;
        long l4 = l3 ^ 0x63FB4AB735BAL;
        long l5 = l3 ^ 0x13D87B28B126L;
        long l6 = l3 ^ 0x241A997B50F1L;
        reference var16_10 = fJ.h("\u00f1", (Object)arrayList, (long)7433737399096849129L, (long)l2) - 1;
        Object object2 = fJ.h("e", (int)fJ.c("i", (int)10450, (long)(0x778370FAA01B7FA8L ^ l2)), (int)var16_10, (long)7435197138421711954L, (long)l2);
        CallSite callSite = fJ.h("e", (long)7433260530331908884L, (long)l2);
        for (int i = 0; i < object2; ++i) {
            float f;
            block14: {
                Object object3;
                block12: {
                    block13: {
                        try {
                            try {
                                object3 = object2;
                                if (callSite != null) break block12;
                                if (object3 != 1) break block13;
                            }
                            catch (MatchException matchException) {
                                throw fJ.h("e", (Object)matchException, (long)7432457392829710272L, (long)l2);
                            }
                            f = 0.0f;
                            break block14;
                        }
                        catch (MatchException matchException) {
                            throw fJ.h("e", (Object)matchException, (long)7432457392829710272L, (long)l2);
                        }
                    }
                    object3 = i;
                }
                f = (float)object3 / (float)(object2 - 1);
            }
            float f10 = f;
            object = fJ.h("e", (float)(255.0f - f10 * 175.0f), (long)7433548669245487330L, (long)l2);
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = l6;
            objectArray2[3] = (int)var16_10;
            objectArray2[2] = (int)object2;
            objectArray2[1] = i;
            objectArray2[0] = arrayList;
            Object[] objectArray3 = new Object[3];
            objectArray3[2] = l5;
            objectArray3[1] = object;
            objectArray3[0] = color;
            Object[] objectArray4 = new Object[5];
            objectArray4[4] = l4;
            objectArray4[3] = fJ.h("\u00f1", (Object)this, (Object)objectArray3, (long)7431551166995881618L, (long)l2);
            objectArray4[2] = fJ.h("e", (Object)objectArray2, (long)7431170639764099790L, (long)l2);
            objectArray4[1] = bt_02.a;
            objectArray4[0] = bt_02.b;
            fJ.h("e", (Object)objectArray4, (long)7431982882964962513L, (long)l2);
            if (callSite == null) continue;
        }
        float f = (float)(l % fJ.d("r", (int)6554, (long)(0x526420E5E9605BA3L ^ l2))) / 1200.0f;
        int n = (int)(f * (float)object2);
        object = 0;
        while (object < 4) {
            block15: {
                block16: {
                    int n2;
                    block17: {
                        n2 = n - object;
                        try {
                            try {
                                try {
                                    if (callSite != null) break block15;
                                    if (n2 < 0) break block16;
                                }
                                catch (MatchException matchException) {
                                    throw fJ.h("e", (Object)matchException, (long)7432457392829710272L, (long)l2);
                                }
                                if (n2 < object2) break block17;
                                break block16;
                            }
                            catch (MatchException matchException) {
                                throw fJ.h("e", (Object)matchException, (long)7432457392829710272L, (long)l2);
                            }
                        }
                        catch (MatchException matchException) {
                            throw fJ.h("e", (Object)matchException, (long)7432457392829710272L, (long)l2);
                        }
                    }
                    Object[] objectArray5 = new Object[5];
                    objectArray5[4] = l6;
                    objectArray5[3] = (int)var16_10;
                    objectArray5[2] = (int)object2;
                    objectArray5[1] = n2;
                    objectArray5[0] = arrayList;
                    Object[] objectArray6 = new Object[3];
                    objectArray6[2] = l5;
                    objectArray6[1] = (int)(fJ.c("i", (int)22852, (long)(0x72F3C3F7B8B58E3DL ^ l2)) - object * fJ.c("i", (int)31436, (long)(0xCF7EEE97202DB4L ^ l2)));
                    objectArray6[0] = color;
                    Object[] objectArray7 = new Object[5];
                    objectArray7[4] = l4;
                    objectArray7[3] = fJ.h("\u00f1", (Object)this, (Object)objectArray6, (long)7431551166995881618L, (long)l2);
                    objectArray7[2] = fJ.h("e", (Object)objectArray5, (long)7431170639764099790L, (long)l2);
                    objectArray7[1] = bt_02.a;
                    objectArray7[0] = bt_02.b;
                    fJ.h("e", (Object)objectArray7, (long)7431982882964962513L, (long)l2);
                }
                ++object;
            }
            if (callSite == null) continue;
        }
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = fJ.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x250E;
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
                throw new RuntimeException("dev/zprestige/prestige/fJ", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            fJ.G[n2] = l4;
        }
        return G[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fJ.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == 'c' || c == '\u00e4' || c == 'X') {
                field = fJ.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fJ.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static ArrayList a(Object[] objectArray) {
        ArrayList arrayList;
        block4: {
            ArrayList arrayList2 = (ArrayList)objectArray[0];
            int n = (Integer)objectArray[1];
            int n2 = (Integer)objectArray[2];
            int n3 = (Integer)objectArray[3];
            long l = (Long)objectArray[4];
            l = y ^ l;
            int n4 = n * n3 / n2;
            CallSite callSite = fJ.h("e", (long)7061199337512402370L, (long)l);
            int n5 = (n + 1) * n3 / n2;
            ArrayList arrayList3 = new ArrayList(n5 - n4 + 1);
            for (int i = n4; i <= n5; ++i) {
                try {
                    arrayList = arrayList3;
                    if (callSite == null) {
                        fJ.h("\u00f1", arrayList, (Object)((class_243)fJ.h("\u00f1", (Object)arrayList2, (int)i, (long)7060285329296501551L, (long)l)), (long)7059559231164158635L, (long)l);
                        if (callSite == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw fJ.h("e", (Object)matchException, (long)7058038838474324246L, (long)l);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bt_0 var1_1) {
        block125: {
            block123: {
                block124: {
                    block115: {
                        block116: {
                            block122: {
                                block121: {
                                    block120: {
                                        block119: {
                                            block118: {
                                                block117: {
                                                    block114: {
                                                        block112: {
                                                            block111: {
                                                                block110: {
                                                                    block109: {
                                                                        block108: {
                                                                            block106: {
                                                                                block107: {
                                                                                    block105: {
                                                                                        block104: {
                                                                                            block103: {
                                                                                                block101: {
                                                                                                    block102: {
                                                                                                        v0 = var2_2 = fJ.y ^ 12116786743894L;
                                                                                                        var4_3 = v0 ^ 79857934804484L;
                                                                                                        var6_4 = v0 ^ 96522249393978L;
                                                                                                        var8_5 = v0 ^ 66268874463912L;
                                                                                                        var10_6 = v0 ^ 92172524323784L;
                                                                                                        var12_7 = v0 ^ 76284987254088L;
                                                                                                        var14_8 = fJ.h("e", (long)6660086073330450513L, (long)var2_2);
                                                                                                        try {
                                                                                                            v1 = fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2);
                                                                                                            if (var14_8 != null) break block101;
                                                                                                            if (v1 != null) break block102;
                                                                                                        }
                                                                                                        catch (MatchException v2) {
                                                                                                            throw fJ.h("e", (Object)v2, (long)6656385602363655301L, (long)var2_2);
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    v1 = fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2);
                                                                                                }
                                                                                                var15_9 = fJ.h("\u00f1", (Object)v1, (long)6660474377633671978L, (long)var2_2);
                                                                                                var16_10 = fJ.h("\u00f1", (String)fJ.h("\u00f1", (Object)this.c, (long)6659115317811022662L, (long)var2_2), (long)6652179722146462427L, (long)var2_2);
                                                                                                v3 = new Object[2];
                                                                                                v3[1] = var8_5;
                                                                                                v3[0] = fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2);
                                                                                                var17_11 = fJ.h("e", (Object)v3, (long)6652575301752935494L, (long)var2_2);
                                                                                                var18_12 = fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2), (long)6657112092016851896L, (long)var2_2);
                                                                                                var19_13 = fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2), (long)6657368702323462792L, (long)var2_2);
                                                                                                try {
                                                                                                    try {
                                                                                                        v4 /* !! */  = fJ.h("\u00f1", (Object)var15_9, (Object)fJ.h("\u00e4", (long)6652673388661000527L, (long)var2_2), (long)6659657332500334076L, (long)var2_2);
                                                                                                        if (var14_8 != null) break block103;
                                                                                                        if (v4 /* !! */  == false) break block104;
                                                                                                    }
                                                                                                    catch (MatchException v5) {
                                                                                                        throw fJ.h("e", (Object)v5, (long)6656385602363655301L, (long)var2_2);
                                                                                                    }
                                                                                                    v4 /* !! */  = fJ.h("e", (Object)var15_9, (long)6660611139170196513L, (long)var2_2);
                                                                                                }
                                                                                                catch (MatchException v6) {
                                                                                                    throw fJ.h("e", (Object)v6, (long)6656385602363655301L, (long)var2_2);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var14_8 != null) break block105;
                                                                                                if (v4 /* !! */  == false) break block104;
                                                                                            }
                                                                                            catch (MatchException v7) {
                                                                                                throw fJ.h("e", (Object)v7, (long)6656385602363655301L, (long)var2_2);
                                                                                            }
                                                                                            v4 /* !! */  = (CallSite)true;
                                                                                            break block105;
                                                                                        }
                                                                                        v4 /* !! */  = (CallSite)false;
                                                                                    }
                                                                                    var20_14 /* !! */  = v4 /* !! */ ;
                                                                                    var21_15 = fJ.h("e", (long)6659507647608130223L, (long)var2_2);
                                                                                    try {
                                                                                        try {
                                                                                            v8 /* !! */  = this.x;
                                                                                            v9 /* !! */  = fJ.d("r", (int)18555, (long)(8452920563386429697L ^ var2_2));
                                                                                            if (var14_8 != null) break block106;
                                                                                            if (v8 /* !! */  != v9 /* !! */ ) break block107;
                                                                                        }
                                                                                        catch (MatchException v10) {
                                                                                            throw fJ.h("e", (Object)v10, (long)6656385602363655301L, (long)var2_2);
                                                                                        }
                                                                                        v11 = 0.016f;
                                                                                        break block108;
                                                                                    }
                                                                                    catch (MatchException v12) {
                                                                                        throw fJ.h("e", (Object)v12, (long)6656385602363655301L, (long)var2_2);
                                                                                    }
                                                                                }
                                                                                v8 /* !! */  = (long)var21_15;
                                                                                v9 /* !! */  = (CallSite)this.x;
                                                                            }
                                                                            v11 = (float)(v8 /* !! */  - v9 /* !! */ ) / 1000.0f;
                                                                        }
                                                                        var23_16 /* !! */  = v11;
                                                                        try {
                                                                            try {
                                                                                cfr_temp_0 = this.x - fJ.d("r", (int)14499, (long)(6639522572501271005L ^ var2_2));
                                                                                v13 /* !! */  = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                if (var14_8 != null) break block109;
                                                                                if (v13 /* !! */  == false) break block110;
                                                                            }
                                                                            catch (MatchException v14) {
                                                                                throw fJ.h("e", (Object)v14, (long)6656385602363655301L, (long)var2_2);
                                                                            }
                                                                            cfr_temp_1 = var21_15 - this.x - fJ.d("r", (int)2973, (long)(4441965813234889446L ^ var2_2));
                                                                            v13 /* !! */  = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                                                        }
                                                                        catch (MatchException v15) {
                                                                            throw fJ.h("e", (Object)v15, (long)6656385602363655301L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (var14_8 != null) break block111;
                                                                        if (v13 /* !! */  <= 0) break block110;
                                                                    }
                                                                    catch (MatchException v16) {
                                                                        throw fJ.h("e", (Object)v16, (long)6656385602363655301L, (long)var2_2);
                                                                    }
                                                                    v13 /* !! */  = 1;
                                                                    break block111;
                                                                }
                                                                v13 /* !! */  = 0;
                                                            }
                                                            var24_17 = v13 /* !! */ ;
                                                            this.x = (long)var21_15;
                                                            var23_16 /* !! */  = (float)fJ.h("e", (float)var23_16 /* !! */ , (float)0.1f, (long)6651889755351182662L, (long)var2_2);
                                                            var25_18 = fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2), (long)6653337274465148411L, (long)var2_2);
                                                            var26_19 = fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)6656791311325738410L, (long)var2_2), (long)6652346105397440224L, (long)var2_2);
                                                            try {
                                                                block113: {
                                                                    try {
                                                                        try {
                                                                            v17 = this;
                                                                            if (var14_8 != null) break block112;
                                                                            if (!v17.w) break block113;
                                                                        }
                                                                        catch (MatchException v18) {
                                                                            throw fJ.h("e", (Object)v18, (long)6656385602363655301L, (long)var2_2);
                                                                        }
                                                                        if (var24_17 != false) {
                                                                        }
                                                                        ** GOTO lbl131
                                                                    }
                                                                    catch (MatchException v19) {
                                                                        throw fJ.h("e", (Object)v19, (long)6656385602363655301L, (long)var2_2);
                                                                    }
                                                                }
                                                                this.u = (float)var25_18;
                                                                this.v = (float)var26_19;
                                                                v17 = this;
                                                            }
                                                            catch (MatchException v20) {
                                                                throw fJ.h("e", (Object)v20, (long)6656385602363655301L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            v17.w = true;
                                                            if (var14_8 == null) break block114;
lbl131:
                                                            // 2 sources

                                                            v21 = new Object[5];
                                                            v21[4] = var4_3;
                                                            v21[3] = Float.valueOf(20.0f);
                                                            v21[2] = Float.valueOf(var23_16 /* !! */ );
                                                            v21[1] = Float.valueOf((float)var25_18);
                                                            v21[0] = Float.valueOf(this.u);
                                                            this.u = (float)fJ.h("e", (Object)v21, (long)6656941218253504002L, (long)var2_2);
                                                            v22 = new Object[2];
                                                            v22[1] = Float.valueOf((float)var26_19);
                                                            v22[0] = Float.valueOf(this.v);
                                                            this.v += fJ.h("e", (Object)v22, (long)6657783595640953523L, (long)var2_2) * (1.0f - (float)fJ.h("e", (double)(-20.0f * var23_16 /* !! */ ), (long)6660265554495348534L, (long)var2_2));
                                                        }
                                                        catch (MatchException v23) {
                                                            throw fJ.h("e", (Object)v23, (long)6656385602363655301L, (long)var2_2);
                                                        }
                                                    }
                                                    v24 = new Object[3];
                                                    v24[2] = var12_7;
                                                    v24[1] = var16_10;
                                                    v24[0] = var15_9;
                                                    var27_20 = fJ.h("\u00f1", (Object)this, (Object)v24, (long)6652130356274633597L, (long)var2_2);
                                                    try {
                                                        v25 = this;
                                                        v26 = this.t;
                                                        v27 = var27_20 != false ? 1.0f : 0.0f;
                                                    }
                                                    catch (MatchException v28) {
                                                        throw fJ.h("e", (Object)v28, (long)6656385602363655301L, (long)var2_2);
                                                    }
                                                    try {
                                                        v29 /* !! */  = var23_16 /* !! */ ;
                                                        v30 = var27_20 != false ? 12.0f : 7.0f;
                                                    }
                                                    catch (MatchException v31) {
                                                        throw fJ.h("e", (Object)v31, (long)6656385602363655301L, (long)var2_2);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v32 = new Object[5];
                                                                            v32[4] = var4_3;
                                                                            v32[3] = Float.valueOf(v30);
                                                                            v32[2] = Float.valueOf(v29 /* !! */ );
                                                                            v32[1] = Float.valueOf(v27);
                                                                            v32[0] = Float.valueOf(v26);
                                                                            v25.t = (float)fJ.h("e", (Object)v32, (long)6656941218253504002L, (long)var2_2);
                                                                            v33 = var27_20;
                                                                            if (var14_8 != null) break block115;
                                                                            if (v33 != false) {
                                                                            }
                                                                            ** GOTO lbl340
                                                                        }
                                                                        catch (MatchException v34) {
                                                                            throw fJ.h("e", (Object)v34, (long)6656385602363655301L, (long)var2_2);
                                                                        }
                                                                        v35 = this;
                                                                        if (var14_8 != null) break block116;
                                                                    }
                                                                    catch (MatchException v36) {
                                                                        throw fJ.h("e", (Object)v36, (long)6656385602363655301L, (long)var2_2);
                                                                    }
                                                                    if (v35.i) {
                                                                    }
                                                                    ** GOTO lbl316
                                                                }
                                                                catch (MatchException v37) {
                                                                    throw fJ.h("e", (Object)v37, (long)6656385602363655301L, (long)var2_2);
                                                                }
                                                                if (var15_9 == this.f) {
                                                                }
                                                                ** GOTO lbl316
                                                            }
                                                            catch (MatchException v38) {
                                                                throw fJ.h("e", (Object)v38, (long)6656385602363655301L, (long)var2_2);
                                                            }
                                                            v39 /* !! */  = fJ.h("\u00f1", (Object)var16_10, (Object)this.h, (long)6659428961829063054L, (long)var2_2);
                                                            if (var14_8 != null) break block117;
                                                        }
                                                        catch (MatchException v40) {
                                                            throw fJ.h("e", (Object)v40, (long)6656385602363655301L, (long)var2_2);
                                                        }
                                                        if (v39 /* !! */  != false) {
                                                        }
                                                        ** GOTO lbl316
                                                    }
                                                    catch (MatchException v41) {
                                                        throw fJ.h("e", (Object)v41, (long)6656385602363655301L, (long)var2_2);
                                                    }
                                                    v39 /* !! */  = var18_12;
                                                }
                                                try {
                                                    try {
                                                        v42 = this.g;
                                                        if (var14_8 != null) break block118;
                                                        if (v39 /* !! */  == v42) {
                                                        }
                                                        ** GOTO lbl316
                                                    }
                                                    catch (MatchException v43) {
                                                        throw fJ.h("e", (Object)v43, (long)6656385602363655301L, (long)var2_2);
                                                    }
                                                    v39 /* !! */  = var20_14 /* !! */ ;
                                                    v42 = this.j;
                                                }
                                                catch (MatchException v44) {
                                                    throw fJ.h("e", (Object)v44, (long)6656385602363655301L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var14_8 != null) break block119;
                                                        if (v39 /* !! */  == v42) {
                                                        }
                                                        ** GOTO lbl316
                                                    }
                                                    catch (MatchException v45) {
                                                        throw fJ.h("e", (Object)v45, (long)6656385602363655301L, (long)var2_2);
                                                    }
                                                    v39 /* !! */  = var19_13;
                                                    if (var14_8 != null) break block120;
                                                }
                                                catch (MatchException v46) {
                                                    throw fJ.h("e", (Object)v46, (long)6656385602363655301L, (long)var2_2);
                                                }
                                                v42 = this.k;
                                            }
                                            catch (MatchException v47) {
                                                throw fJ.h("e", (Object)v47, (long)6656385602363655301L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                if (v39 /* !! */  == v42) {
                                                    v35 = this;
                                                    if (var14_8 != null) break block116;
                                                }
                                                ** GOTO lbl316
                                            }
                                            catch (MatchException v48) {
                                                throw fJ.h("e", (Object)v48, (long)6656385602363655301L, (long)var2_2);
                                            }
                                            cfr_temp_2 = v35.u - this.l;
                                            v39 /* !! */  = (CallSite)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                        }
                                        catch (MatchException v49) {
                                            throw fJ.h("e", (Object)v49, (long)6656385602363655301L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (v39 /* !! */  == false) {
                                                            v35 = this;
                                                            if (var14_8 != null) break block116;
                                                        }
                                                        ** GOTO lbl316
                                                    }
                                                    catch (MatchException v50) {
                                                        throw fJ.h("e", (Object)v50, (long)6656385602363655301L, (long)var2_2);
                                                    }
                                                    if (v35.v == this.m) {
                                                    }
                                                    ** GOTO lbl316
                                                }
                                                catch (MatchException v51) {
                                                    throw fJ.h("e", (Object)v51, (long)6656385602363655301L, (long)var2_2);
                                                }
                                                cfr_temp_3 = fJ.h("\u00aa", (Object)var17_11, (long)6653859943329572609L, (long)var2_2) - this.n;
                                                v33 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 > 0 ? 1 : -1);
                                                if (var14_8 != null) break block121;
                                            }
                                            catch (MatchException v52) {
                                                throw fJ.h("e", (Object)v52, (long)6656385602363655301L, (long)var2_2);
                                            }
                                            if (v33 == false) {
                                            }
                                            ** GOTO lbl316
                                        }
                                        catch (MatchException v53) {
                                            throw fJ.h("e", (Object)v53, (long)6656385602363655301L, (long)var2_2);
                                        }
                                        cfr_temp_4 = fJ.h("\u00aa", (Object)var17_11, (long)6657999731957433792L, (long)var2_2) - this.o;
                                        v33 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 > 0 ? 1 : -1);
                                    }
                                    catch (MatchException v54) {
                                        throw fJ.h("e", (Object)v54, (long)6656385602363655301L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var14_8 != null) break block122;
                                        if (v33 == false) {
                                        }
                                        ** GOTO lbl316
                                    }
                                    catch (MatchException v55) {
                                        throw fJ.h("e", (Object)v55, (long)6656385602363655301L, (long)var2_2);
                                    }
                                    cfr_temp_5 = fJ.h("\u00aa", (Object)var17_11, (long)6651979086252670039L, (long)var2_2) - this.p;
                                    v33 = cfr_temp_5 == 0 ? 0 : (cfr_temp_5 > 0 ? 1 : -1);
                                }
                                catch (MatchException v56) {
                                    throw fJ.h("e", (Object)v56, (long)6656385602363655301L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    if (var14_8 != null) break block123;
                                    if (v33 == false) break block124;
                                }
                                catch (MatchException v57) {
                                    throw fJ.h("e", (Object)v57, (long)6656385602363655301L, (long)var2_2);
                                }
lbl316:
                                // 11 sources

                                v58 = new Object[3];
                                v58[2] = var10_6;
                                v58[1] = var16_10;
                                v58[0] = var15_9;
                                fJ.h("\u00f1", (Object)this, (Object)v58, (long)6654017743922948853L, (long)var2_2);
                                this.f = var15_9;
                                this.h = var16_10;
                                this.g = var18_12;
                                this.j = var20_14 /* !! */ ;
                                this.k = (int)var19_13;
                                this.l = this.u;
                                this.m = this.v;
                                this.n = (double)fJ.h("\u00aa", (Object)var17_11, (long)6653859943329572609L, (long)var2_2);
                                this.o = (double)fJ.h("\u00aa", (Object)var17_11, (long)6657999731957433792L, (long)var2_2);
                                this.p = (double)fJ.h("\u00aa", (Object)var17_11, (long)6651979086252670039L, (long)var2_2);
                                v35 = this;
                            }
                            catch (MatchException v59) {
                                throw fJ.h("e", (Object)v59, (long)6656385602363655301L, (long)var2_2);
                            }
                        }
                        try {
                            v35.i = true;
                            if (var14_8 == null) break block124;
lbl340:
                            // 2 sources

                            v33 = (reference)((cfr_temp_6 = this.t - 0.005f) == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1));
                        }
                        catch (MatchException v60) {
                            throw fJ.h("e", (Object)v60, (long)6656385602363655301L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (var14_8 != null) break block123;
                                    if (v33 >= 0) break block124;
                                }
                                catch (MatchException v61) {
                                    throw fJ.h("e", (Object)v61, (long)6656385602363655301L, (long)var2_2);
                                }
                                v33 = fJ.h("\u00f1", (Object)this.e, (long)6657036451206452945L, (long)var2_2);
                                if (var14_8 != null) break block123;
                            }
                            catch (MatchException v62) {
                                throw fJ.h("e", (Object)v62, (long)6656385602363655301L, (long)var2_2);
                            }
                            if (v33 != false) break block124;
                        }
                        catch (MatchException v63) {
                            throw fJ.h("e", (Object)v63, (long)6656385602363655301L, (long)var2_2);
                        }
                        fJ.h("\u00f1", (Object)this.e, (long)6658867546847054072L, (long)var2_2);
                        this.i = false;
                    }
                    catch (MatchException v64) {
                        throw fJ.h("e", (Object)v64, (long)6656385602363655301L, (long)var2_2);
                    }
                }
                try {
                    v65 = this;
                    if (var14_8 != null) break block125;
                    cfr_temp_7 = v65.t - 0.005f;
                    v33 = (reference)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 < 0.0f ? -1 : 1));
                }
                catch (MatchException v66) {
                    throw fJ.h("e", (Object)v66, (long)6656385602363655301L, (long)var2_2);
                }
            }
            if (v33 < 0) {
                return;
            }
            v65 = this;
        }
        var28_21 = fJ.h("\u00f1", (Object)v65.e, (long)6652989886531573703L, (long)var2_2);
        while (fJ.h("\u00f1", (Object)var28_21, (long)6657398246491170254L, (long)var2_2) != false) {
            var29_22 = (gX)fJ.h("\u00f1", (Object)var28_21, (long)6651817141831581997L, (long)var2_2);
            v67 = new Object[3];
            v67[2] = var6_4;
            v67[1] = var29_22;
            v67[0] = var1_1;
            fJ.h("\u00f1", (Object)this, (Object)v67, (long)6658032981302375589L, (long)var2_2);
            if (var14_8 == null) continue;
        }
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block65: {
            block64: {
                CallSite callSite;
                long l;
                block63: {
                    Object object2;
                    block61: {
                        class_1799 class_17992;
                        block62: {
                            Object object3;
                            block59: {
                                block60: {
                                    Object object4;
                                    Object object5;
                                    block56: {
                                        block58: {
                                            block57: {
                                                Object object6;
                                                String string;
                                                block53: {
                                                    block55: {
                                                        block54: {
                                                            Object object7;
                                                            block50: {
                                                                block52: {
                                                                    block51: {
                                                                        class_17992 = (class_1799)objectArray[0];
                                                                        string = (String)objectArray[1];
                                                                        l = (Long)objectArray[2];
                                                                        l = y ^ l;
                                                                        callSite = fJ.h("e", (long)3387364392796566334L, (long)l);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            object7 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)22247, (long)(0x464C78A669838B24L ^ l)), (long)3387901347768859361L, (long)l);
                                                                                            if (callSite != null) break block50;
                                                                                            if (object7 != false) break block51;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                                        }
                                                                                        object7 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)13541, (long)(0x482BAD161382E924L ^ l)), (long)3387901347768859361L, (long)l);
                                                                                        if (callSite != null) break block50;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                                    }
                                                                                    if (object7 != false) break block51;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                                }
                                                                                object7 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)11822, (long)(0x595B49C9AB6473E2L ^ l)), (long)3387901347768859361L, (long)l);
                                                                                if (callSite != null) break block50;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                            }
                                                                            if (object7 == false) break block52;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                        }
                                                                    }
                                                                    object7 = 1;
                                                                    break block50;
                                                                }
                                                                object7 = 0;
                                                            }
                                                            object5 = object7;
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                object6 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)10292, (long)(0x199774DF59FAF5F1L ^ l)), (long)3387901347768859361L, (long)l);
                                                                                if (callSite != null) break block53;
                                                                                if (object6 != false) break block54;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                            }
                                                                            object6 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)17735, (long)(0x39FD88011E2B9880L ^ l)), (long)3387901347768859361L, (long)l);
                                                                            if (callSite != null) break block53;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                        }
                                                                        if (object6 != false) break block54;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                    }
                                                                    object6 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)12061, (long)(0x8EAC0C68037F2DBL ^ l)), (long)3387901347768859361L, (long)l);
                                                                    if (callSite != null) break block53;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                                }
                                                                if (object6 == false) break block55;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                            }
                                                        }
                                                        object6 = 1;
                                                        break block53;
                                                    }
                                                    object6 = 0;
                                                }
                                                object3 = object6;
                                                try {
                                                    try {
                                                        try {
                                                            object4 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)1082, (long)(0x53766DA25521D9F7L ^ l)), (long)3387901347768859361L, (long)l);
                                                            if (callSite != null) break block56;
                                                            if (object4 != false) break block57;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                        }
                                                        object4 = fJ.h("\u00f1", string, (Object)fJ.b("j", (int)12061, (long)(0x8EAC0C68037F2DBL ^ l)), (long)3387901347768859361L, (long)l);
                                                        if (callSite != null) break block56;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                    }
                                                    if (object4 == false) break block58;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                }
                                            }
                                            object4 = 1;
                                            break block56;
                                        }
                                        object4 = 0;
                                    }
                                    object2 = object4;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    object = fJ.h("\u00f1", (Object)class_17992, (Object)fJ.h("\u00e4", (long)3403663845716408864L, (long)l), (long)3388094537255843475L, (long)l);
                                                    if (callSite != null) break block59;
                                                    if (object == false) break block60;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                }
                                                object = object5;
                                                if (callSite != null) break block59;
                                            }
                                            catch (MatchException matchException) {
                                                throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                            }
                                            if (object == false) break block60;
                                        }
                                        catch (MatchException matchException) {
                                            throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                        }
                                        return (boolean)fJ.h("e", (Object)class_17992, (long)3386719574000840526L, (long)l);
                                    }
                                    catch (MatchException matchException) {
                                        throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                    }
                                }
                                object = fJ.h("\u00f1", (Object)class_17992, (Object)fJ.h("\u00e4", (long)3389231067839908771L, (long)l), (long)3388094537255843475L, (long)l);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (callSite != null) break block61;
                                                    if (object == false) break block62;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                                }
                                                object = fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)b, (long)3390816229809407685L, (long)l), (long)3390618044266858711L, (long)l);
                                                if (callSite != null) break block61;
                                            }
                                            catch (MatchException matchException) {
                                                throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                            }
                                            if (object == false) break block62;
                                        }
                                        catch (MatchException matchException) {
                                            throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                        }
                                        object = object3;
                                        if (callSite != null) break block61;
                                    }
                                    catch (MatchException matchException) {
                                        throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                    }
                                    if (object == false) break block62;
                                }
                                catch (MatchException matchException) {
                                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                                }
                                return true;
                            }
                            catch (MatchException matchException) {
                                throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                            }
                        }
                        object = fJ.h("\u00f1", (Object)class_17992, (Object)fJ.h("\u00e4", (long)3387081929542324940L, (long)l), (long)3388094537255843475L, (long)l);
                    }
                    try {
                        if (callSite != null) break block63;
                        if (object == false) break block64;
                    }
                    catch (MatchException matchException) {
                        throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                    }
                    object = object2;
                }
                try {
                    if (callSite != null) break block65;
                    if (object == false) break block64;
                }
                catch (MatchException matchException) {
                    throw fJ.h("e", (Object)matchException, (long)3390944956615522282L, (long)l);
                }
                object = 1;
                break block65;
            }
            object = 0;
        }
        return (boolean)object;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fJ.h("e", (Object)((Object)q_0.Crystal), (Object)((Object)q_0.Mace), (long)-2444305739916073542L, (long)l);
    }

    private Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = y ^ l;
        return new Color((int)fJ.h("\u00f1", (Object)color, (long)-9211563329541002193L, (long)l), (int)fJ.h("\u00f1", (Object)color, (long)-9212708660315895188L, (long)l), (int)fJ.h("\u00f1", (Object)color, (long)-9218761912350029394L, (long)l), (int)fJ.h("e", (int)fJ.h("e", (float)((float)n * this.t), (long)-9212070635027783709L, (long)l), (int)0, (int)fJ.c("i", (int)7280, (long)(0x3770B80772792C0FL ^ l)), (long)-9217303594689317454L, (long)l));
    }

    private gX a(Object[] objectArray) {
        int n;
        CallSite callSite;
        ArrayList arrayList;
        long l;
        block8: {
            int n2;
            l = (Long)objectArray[0];
            long l2 = l = y ^ l;
            long l3 = l2 ^ 0x4A8F48656C8DL;
            long l4 = l2 ^ 0x303DB5900738L;
            long l5 = l2 ^ 0x1C9FFA214F9CL;
            long l6 = l2 ^ 0x6AE13F76338CL;
            arrayList = new ArrayList();
            CallSite callSite2 = fJ.h("\u00aa", (Object)b, (long)-9083302959389677510L, (long)l);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l4;
            objectArray2[0] = fJ.h("\u00aa", (Object)b, (long)-9083302959389677510L, (long)l);
            CallSite callSite3 = fJ.h("e", (Object)objectArray2, (long)-9096499915459294762L, (long)l);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l5;
            CallSite callSite4 = fJ.h("e", (Object)objectArray3, (long)-9080914861169249016L, (long)l);
            CallSite callSite5 = fJ.h("e", (long)-9079981942752174655L, (long)l);
            fJ.h("\u00f1", (Object)callSite2, (double)fJ.h("\u00aa", (Object)callSite3, (long)-9095214998502442351L, (long)l), (double)fJ.h("\u00aa", (Object)callSite3, (long)-9082077079715915696L, (long)l), (double)fJ.h("\u00aa", (Object)callSite3, (long)-9097095579363565113L, (long)l), (long)-9083525806311748893L, (long)l);
            CallSite callSite6 = fJ.h("\u00aa", (Object)b, (long)-9079948485392769916L, (long)l);
            g6 g62 = new g6((class_1937)callSite6, (class_1309)callSite2, (class_1799)fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)-9079700630674965453L, (long)l), (long)-9096706562718214132L, (long)l), l6);
            fJ.h("\u00f1", (Object)((Object)g62), (Object)callSite2, (float)this.u, (float)this.v, (float)0.0f, (float)1.5f, (float)1.0f, (long)-9079338528594431447L, (long)l);
            int n3 = 0;
            callSite = callSite5;
            while (!g62.a) {
                try {
                    try {
                        try {
                            n2 = n3++;
                            if (callSite != null || callSite != null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw fJ.h("e", (Object)matchException, (long)-9083699936918120171L, (long)l);
                        }
                        if (n2 >= fJ.c("i", (int)7235, (long)(0x3CEECAE7550AADEDL ^ l))) break;
                    }
                    catch (MatchException matchException) {
                        throw fJ.h("e", (Object)matchException, (long)-9083699936918120171L, (long)l);
                    }
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l3;
                    objectArray4[0] = g62;
                    fJ.h("\u00f1", arrayList, (Object)fJ.h("e", (Object)objectArray4, (long)-9095875628866677779L, (long)l), (long)-9080505537846349144L, (long)l);
                    fJ.h("\u00f1", (Object)((Object)g62), (long)-9096247857082217143L, (long)l);
                    if (callSite == null) continue;
                    break;
                }
                catch (MatchException matchException) {
                    throw fJ.h("e", (Object)matchException, (long)-9083699936918120171L, (long)l);
                }
            }
            fJ.h("\u00f1", (Object)callSite2, (Object)callSite4, (long)-9079269405687054048L, (long)l);
            n2 = n = 0;
        }
        while (n < fJ.h("\u00f1", arrayList, (long)-9080203179380779972L, (long)l) - 1) {
            class_243 class_2432 = (class_243)fJ.h("\u00f1", arrayList, (int)n, (long)-9081460283931407572L, (long)l);
            fJ.h("\u00f1", arrayList, (int)n, (Object)new class_243((double)fJ.h("\u00aa", (Object)class_2432, (long)-9095214998502442351L, (long)l), (double)(fJ.h("\u00aa", (Object)class_2432, (long)-9082077079715915696L, (long)l) - (double)0.1f), (double)fJ.h("\u00aa", (Object)class_2432, (long)-9097095579363565113L, (long)l)), (long)-9080283404564614642L, (long)l);
            ++n;
            if (callSite == null) continue;
        }
        return new gX(arrayList, true);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (J[n3] != null) {
            return n3;
        }
        Object object = I[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 50;
            case 1 -> 0;
            case 2 -> 41;
            case 3 -> 7;
            case 4 -> 63;
            case 5 -> 33;
            case 6 -> 43;
            case 7 -> 26;
            case 8 -> 59;
            case 9 -> 22;
            case 10 -> 15;
            case 11 -> 27;
            case 12 -> 23;
            case 13 -> 57;
            case 14 -> 36;
            case 15 -> 32;
            case 16 -> 10;
            case 17 -> 2;
            case 18 -> 38;
            case 19 -> 60;
            case 20 -> 48;
            case 21 -> 30;
            case 22 -> 51;
            case 23 -> 31;
            case 24 -> 45;
            case 25 -> 55;
            case 26 -> 13;
            case 27 -> 24;
            case 28 -> 28;
            case 29 -> 29;
            case 30 -> 8;
            case 31 -> 4;
            case 32 -> 49;
            case 33 -> 61;
            case 34 -> 25;
            case 35 -> 1;
            case 36 -> 11;
            case 37 -> 17;
            case 38 -> 9;
            case 39 -> 52;
            case 40 -> 53;
            case 41 -> 58;
            case 42 -> 40;
            case 43 -> 56;
            case 44 -> 3;
            case 45 -> 21;
            case 46 -> 44;
            case 47 -> 42;
            case 48 -> 62;
            case 49 -> 14;
            case 50 -> 19;
            case 51 -> 54;
            case 52 -> 35;
            case 53 -> 18;
            case 54 -> 20;
            case 55 -> 46;
            case 56 -> 5;
            case 57 -> 34;
            case 58 -> 6;
            case 59 -> 39;
            case 60 -> 12;
            case 61 -> 16;
            case 62 -> 47;
            default -> 37;
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
        fJ.J[n3] = new String(cArray);
        return n3;
    }

    private void m(Object[] objectArray) {
        float f;
        CallSite callSite;
        bt_0 bt_02 = (bt_0)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        Color color = (Color)objectArray[2];
        boolean bl = (Boolean)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (Long)objectArray[5];
        long l3 = l2 = y ^ l2;
        long l4 = l3 ^ 0x17BDA4DCE6A1L;
        long l5 = l3 ^ 0x292134D78844L;
        long l6 = l3 ^ 0x537F1BEACEFCL;
        float f10 = (float)fJ.h("\u00aa", (Object)class_2432, (long)1785779594958234526L, (long)l2);
        float f11 = (float)fJ.h("\u00aa", (Object)class_2432, (long)1800006306527199583L, (long)l2);
        float f12 = (float)fJ.h("\u00aa", (Object)class_2432, (long)1787802564718672072L, (long)l2);
        try {
            callSite = bl ? fJ.d("r", (int)20371, (long)(0x60D8389B9ECCF273L ^ l2)) : fJ.d("r", (int)19870, (long)(0x6813CDA97CD6707CL ^ l2));
        }
        catch (MatchException matchException) {
            throw fJ.h("e", (Object)matchException, (long)1801198206744608794L, (long)l2);
        }
        CallSite callSite2 = callSite;
        float f13 = (float)(l % callSite2) / (float)callSite2;
        float f14 = 0.5f * (1.0f + (float)fJ.h("e", (double)(f13 * ((float)Math.PI * 2)), (long)1799007194749412563L, (long)l2));
        try {
            f = bl ? 0.45f : 0.25f;
        }
        catch (MatchException matchException) {
            throw fJ.h("e", (Object)matchException, (long)1801198206744608794L, (long)l2);
        }
        float f15 = f + 0.1f * f14;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l6;
        objectArray2[1] = (int)fJ.c("i", (int)7280, (long)(0x37709B11F113B4D4L ^ l2));
        objectArray2[0] = color;
        CallSite callSite3 = fJ.h("\u00f1", (Object)this, (Object)objectArray2, (long)1799307687149674824L, (long)l2);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l6;
        objectArray3[1] = 0;
        objectArray3[0] = color;
        Object[] objectArray4 = new Object[9];
        objectArray4[8] = l4;
        objectArray4[7] = fJ.h("\u00f1", (Object)this, (Object)objectArray3, (long)1799307687149674824L, (long)l2);
        objectArray4[6] = callSite3;
        objectArray4[5] = Float.valueOf(f15);
        objectArray4[4] = Float.valueOf(f12);
        objectArray4[3] = Float.valueOf(f11);
        objectArray4[2] = Float.valueOf(f10);
        objectArray4[1] = bt_02.a;
        objectArray4[0] = bt_02.b;
        fJ.h("e", (Object)objectArray4, (long)1800035388965701092L, (long)l2);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l6;
        objectArray5[1] = (int)fJ.c("i", (int)22201, (long)(0x2175BE5266F17E1CL ^ l2));
        objectArray5[0] = color;
        Object[] objectArray6 = new Object[11];
        objectArray6[10] = l5;
        objectArray6[9] = fJ.h("\u00f1", (Object)this, (Object)objectArray5, (long)1799307687149674824L, (long)l2);
        objectArray6[8] = callSite3;
        objectArray6[7] = Float.valueOf(0.06f);
        objectArray6[6] = Float.valueOf(0.02f);
        objectArray6[5] = Float.valueOf(f15 + 0.08f);
        objectArray6[4] = Float.valueOf(f12);
        objectArray6[3] = Float.valueOf(f11);
        objectArray6[2] = Float.valueOf(f10);
        objectArray6[1] = bt_02.a;
        objectArray6[0] = bt_02.b;
        fJ.h("e", (Object)objectArray6, (long)1798741456843103495L, (long)l2);
        if (bl) {
            float f16 = (float)(l % fJ.d("r", (int)17134, (long)(0xC7156F3ABCA7F08L ^ l2))) / 500.0f;
            float f17 = 0.3f + f16 * 0.9f;
            float f18 = 1.0f - f16;
            Object[] objectArray7 = new Object[3];
            objectArray7[2] = l6;
            objectArray7[1] = (int)fJ.h("e", (float)(255.0f * f18), (long)1797786750042900280L, (long)l2);
            objectArray7[0] = color;
            Object[] objectArray8 = new Object[3];
            objectArray8[2] = l6;
            objectArray8[1] = (int)fJ.h("e", (float)(60.0f * f18), (long)1797786750042900280L, (long)l2);
            objectArray8[0] = color;
            Object[] objectArray9 = new Object[11];
            objectArray9[10] = l5;
            objectArray9[9] = fJ.h("\u00f1", (Object)this, (Object)objectArray8, (long)1799307687149674824L, (long)l2);
            objectArray9[8] = fJ.h("\u00f1", (Object)this, (Object)objectArray7, (long)1799307687149674824L, (long)l2);
            objectArray9[7] = Float.valueOf(0.05f);
            objectArray9[6] = Float.valueOf(0.02f);
            objectArray9[5] = Float.valueOf(f17);
            objectArray9[4] = Float.valueOf(f12);
            objectArray9[3] = Float.valueOf(f11);
            objectArray9[2] = Float.valueOf(f10);
            objectArray9[1] = bt_02.a;
            objectArray9[0] = bt_02.b;
            fJ.h("e", (Object)objectArray9, (long)1798741456843103495L, (long)l2);
        }
    }

    private static Field o(long l, long l2) {
        int n = fJ.m(l, l2);
        Object object = I[n];
        if (object instanceof String) {
            String string = J[n];
            int n2 = string.indexOf(8);
            Class clazz = fJ.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fJ.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fJ.g(clazz3, string2, clazz2)) != null) {
                    fJ.I[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fJ.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fJ.I[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fJ.n(729379132201110L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fJ.m(l, l2);
        Object object = I[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = J[n];
                int n3 = string2.indexOf(8);
                clazz3 = fJ.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fJ.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fJ.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fJ.I[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fJ.n(729379132201110L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fJ.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fJ.I[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fJ.n(729379132201110L, 0L);
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
        Object object;
        ArrayList arrayList;
        long l;
        long l2;
        long l3;
        gX gX2;
        bt_0 bt_02;
        block4: {
            block5: {
                bt_02 = (bt_0)objectArray[0];
                gX2 = (gX)objectArray[1];
                l3 = (Long)objectArray[2];
                long l4 = l3 = y ^ l3;
                l2 = l4 ^ 0x827D15D6C7FL;
                l = l4 ^ 0x4880B19F13A5L;
                arrayList = gX2.b9;
                CallSite callSite = fJ.h("e", (long)6732959920301293900L, (long)l3);
                try {
                    try {
                        object = arrayList;
                        if (callSite != null) break block4;
                        if (fJ.h("\u00f1", (Object)object, (long)6733313040615803057L, (long)l3) > 1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fJ.h("e", (Object)matchException, (long)6736572301489866136L, (long)l3);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw fJ.h("e", (Object)matchException, (long)6736572301489866136L, (long)l3);
                }
            }
            object = fJ.h("\u00f1", (Object)this.d, (long)6734229140617955931L, (long)l3);
        }
        Color color = (Color)object;
        CallSite callSite = fJ.h("e", (long)6734699265484721074L, (long)l3);
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = (long)callSite;
        objectArray2[2] = color;
        objectArray2[1] = arrayList;
        objectArray2[0] = bt_02;
        fJ.h("\u00f1", (Object)this, (Object)objectArray2, (long)6732927907392101412L, (long)l3);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l;
        objectArray3[4] = (long)callSite;
        objectArray3[3] = gX2.b_;
        objectArray3[2] = color;
        objectArray3[1] = (class_243)fJ.h("\u00f1", (Object)arrayList, (int)(fJ.h("\u00f1", (Object)arrayList, (long)6733313040615803057L, (long)l3) - 1), (long)6734288975939803041L, (long)l3);
        objectArray3[0] = bt_02;
        fJ.h("\u00f1", (Object)this, (Object)objectArray3, (long)6737219833134367100L, (long)l3);
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void j(Object[] var1_1) {
        block86: {
            block89: {
                block87: {
                    block79: {
                        block84: {
                            block82: {
                                block83: {
                                    block80: {
                                        block81: {
                                            block76: {
                                                block78: {
                                                    block77: {
                                                        block73: {
                                                            block75: {
                                                                block74: {
                                                                    block70: {
                                                                        block72: {
                                                                            block71: {
                                                                                var2_2 = (class_1799)var1_1[0];
                                                                                var5_3 = (String)var1_1[1];
                                                                                var3_4 = (Long)var1_1[2];
                                                                                v0 = var3_4 = fJ.y ^ var3_4;
                                                                                var6_5 = v0 ^ 105193676660312L;
                                                                                var8_6 = v0 ^ 71729562861207L;
                                                                                v1 = fJ.h("e", (long)685184044873356734L, (long)var3_4);
                                                                                fJ.h("\u00f1", (Object)this.e, (long)686288211401530647L, (long)var3_4);
                                                                                var10_7 = v1;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v2 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)10292, (long)(1844050782873834353L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                                                    if (var10_7 != null) break block70;
                                                                                                    if (v2 /* !! */  != false) break block71;
                                                                                                }
                                                                                                catch (MatchException v3) {
                                                                                                    throw fJ.h("e", (Object)v3, (long)688796537747886442L, (long)var3_4);
                                                                                                }
                                                                                                v2 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)8900, (long)(6285027498563688838L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                                                if (var10_7 != null) break block70;
                                                                                            }
                                                                                            catch (MatchException v4) {
                                                                                                throw fJ.h("e", (Object)v4, (long)688796537747886442L, (long)var3_4);
                                                                                            }
                                                                                            if (v2 /* !! */  != false) break block71;
                                                                                        }
                                                                                        catch (MatchException v5) {
                                                                                            throw fJ.h("e", (Object)v5, (long)688796537747886442L, (long)var3_4);
                                                                                        }
                                                                                        v2 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)12061, (long)(642561688095478875L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                                        if (var10_7 != null) break block70;
                                                                                    }
                                                                                    catch (MatchException v6) {
                                                                                        throw fJ.h("e", (Object)v6, (long)688796537747886442L, (long)var3_4);
                                                                                    }
                                                                                    if (v2 /* !! */  == false) break block72;
                                                                                }
                                                                                catch (MatchException v7) {
                                                                                    throw fJ.h("e", (Object)v7, (long)688796537747886442L, (long)var3_4);
                                                                                }
                                                                            }
                                                                            v2 /* !! */  = (CallSite)1;
                                                                            break block70;
                                                                        }
                                                                        v2 /* !! */  = (CallSite)0;
                                                                    }
                                                                    var11_8 /* !! */  = v2 /* !! */ ;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v8 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)10292, (long)(1844050782873834353L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                                        if (var10_7 != null) break block73;
                                                                                        if (v8 /* !! */  != false) break block74;
                                                                                    }
                                                                                    catch (MatchException v9) {
                                                                                        throw fJ.h("e", (Object)v9, (long)688796537747886442L, (long)var3_4);
                                                                                    }
                                                                                    v8 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)12944, (long)(7320627100973976020L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                                    if (var10_7 != null) break block73;
                                                                                }
                                                                                catch (MatchException v10) {
                                                                                    throw fJ.h("e", (Object)v10, (long)688796537747886442L, (long)var3_4);
                                                                                }
                                                                                if (v8 /* !! */  != false) break block74;
                                                                            }
                                                                            catch (MatchException v11) {
                                                                                throw fJ.h("e", (Object)v11, (long)688796537747886442L, (long)var3_4);
                                                                            }
                                                                            v8 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)12061, (long)(642561688095478875L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                            if (var10_7 != null) break block73;
                                                                        }
                                                                        catch (MatchException v12) {
                                                                            throw fJ.h("e", (Object)v12, (long)688796537747886442L, (long)var3_4);
                                                                        }
                                                                        if (v8 /* !! */  == false) break block75;
                                                                    }
                                                                    catch (MatchException v13) {
                                                                        throw fJ.h("e", (Object)v13, (long)688796537747886442L, (long)var3_4);
                                                                    }
                                                                }
                                                                v8 /* !! */  = (CallSite)1;
                                                                break block73;
                                                            }
                                                            v8 /* !! */  = (CallSite)0;
                                                        }
                                                        var12_9 /* !! */  = v8 /* !! */ ;
                                                        try {
                                                            try {
                                                                try {
                                                                    v14 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)16030, (long)(3519620977564403166L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                    if (var10_7 != null) break block76;
                                                                    if (v14 /* !! */  != false) break block77;
                                                                }
                                                                catch (MatchException v15) {
                                                                    throw fJ.h("e", (Object)v15, (long)688796537747886442L, (long)var3_4);
                                                                }
                                                                v14 /* !! */  = fJ.h("\u00f1", var5_3, (Object)fJ.b("j", (int)12061, (long)(642561688095478875L ^ var3_4)), (long)685718013769899105L, (long)var3_4);
                                                                if (var10_7 != null) break block76;
                                                            }
                                                            catch (MatchException v16) {
                                                                throw fJ.h("e", (Object)v16, (long)688796537747886442L, (long)var3_4);
                                                            }
                                                            if (v14 /* !! */  == false) break block78;
                                                        }
                                                        catch (MatchException v17) {
                                                            throw fJ.h("e", (Object)v17, (long)688796537747886442L, (long)var3_4);
                                                        }
                                                    }
                                                    v14 /* !! */  = (CallSite)1;
                                                    break block76;
                                                }
                                                v14 /* !! */  = (CallSite)0;
                                            }
                                            var13_10 /* !! */  = v14 /* !! */ ;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v18 = fJ.h("\u00f1", (Object)var2_2, (Object)fJ.h("\u00e4", (long)701480232712346784L, (long)var3_4), (long)685946487520120851L, (long)var3_4);
                                                                    if (var10_7 != null) break block79;
                                                                    if (v18 != false) {
                                                                    }
                                                                    ** GOTO lbl212
                                                                }
                                                                catch (MatchException v19) {
                                                                    throw fJ.h("e", (Object)v19, (long)688796537747886442L, (long)var3_4);
                                                                }
                                                                v18 = var11_8 /* !! */ ;
                                                                if (var10_7 != null) break block79;
                                                            }
                                                            catch (MatchException v20) {
                                                                throw fJ.h("e", (Object)v20, (long)688796537747886442L, (long)var3_4);
                                                            }
                                                            if (v18 != false) {
                                                            }
                                                            ** GOTO lbl212
                                                        }
                                                        catch (MatchException v21) {
                                                            throw fJ.h("e", (Object)v21, (long)688796537747886442L, (long)var3_4);
                                                        }
                                                        v22 = var2_2;
                                                        if (var10_7 != null) break block80;
                                                    }
                                                    catch (MatchException v23) {
                                                        throw fJ.h("e", (Object)v23, (long)688796537747886442L, (long)var3_4);
                                                    }
                                                    if (fJ.h("e", (Object)v22, (long)684579268225501646L, (long)var3_4) != false) break block81;
                                                }
                                                catch (MatchException v24) {
                                                    throw fJ.h("e", (Object)v24, (long)688796537747886442L, (long)var3_4);
                                                }
                                                return;
                                            }
                                            catch (MatchException v25) {
                                                throw fJ.h("e", (Object)v25, (long)688796537747886442L, (long)var3_4);
                                            }
                                        }
                                        v22 = var2_2;
                                    }
                                    var14_11 = (class_1764)fJ.h("\u00f1", (Object)v22, (long)685664610893232483L, (long)var3_4);
                                    try {
                                        v26 /* !! */  = fJ.h("e", (Object)((class_6880)fJ.h("\u00f1", (Object)fJ.h("\u00f1", (Object)((class_2378)fJ.h("\u00f1", (Object)fJ.h("\u00f1", (Object)fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)685291719334024443L, (long)var3_4), (long)701016432328493874L, (long)var3_4), (Object)fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)687248647215334941L, (long)var3_4), (long)686731490038519818L, (long)var3_4), (long)688895313150604367L, (long)var3_4), (long)701331166180879860L, (long)var3_4)), (Object)fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)687248647215334941L, (long)var3_4), (long)686149862839258876L, (long)var3_4), (long)687998034686098235L, (long)var3_4), (long)701331166180879860L, (long)var3_4)), (Object)var2_2, (long)687164046252057391L, (long)var3_4);
                                        if (var10_7 != null) break block82;
                                        if (v26 /* !! */  <= 0) break block83;
                                    }
                                    catch (MatchException v27) {
                                        throw fJ.h("e", (Object)v27, (long)688796537747886442L, (long)var3_4);
                                    }
                                    v26 /* !! */  = (CallSite)1;
                                    break block82;
                                }
                                v26 /* !! */  = (CallSite)0;
                            }
                            var15_12 /* !! */  = v26 /* !! */ ;
                            try {
                                block85: {
                                    try {
                                        try {
                                            v28 /* !! */  = var15_12 /* !! */ ;
                                            if (var10_7 != null) break block84;
                                            if (v28 /* !! */  == false) break block85;
                                        }
                                        catch (MatchException v29) {
                                            throw fJ.h("e", (Object)v29, (long)688796537747886442L, (long)var3_4);
                                        }
                                        v30 = new Object[4];
                                        v30[3] = var8_6;
                                        v30[2] = var2_2;
                                        v30[1] = fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)686948949063112683L, (long)var3_4), (long)701768063976853619L, (long)var3_4);
                                        v30[0] = Float.valueOf(fJ.a[0]);
                                        fJ.h("\u00f1", (Object)this.e, (Object)fJ.h("\u00f1", (Object)this, (Object)v30, (long)701984347170304623L, (long)var3_4), (long)685883699543800535L, (long)var3_4);
                                        v31 = new Object[4];
                                        v31[3] = var8_6;
                                        v31[2] = var2_2;
                                        v31[1] = fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)686948949063112683L, (long)var3_4), (long)701768063976853619L, (long)var3_4);
                                        v31[0] = Float.valueOf(fJ.a[1]);
                                        fJ.h("\u00f1", (Object)this.e, (Object)fJ.h("\u00f1", (Object)this, (Object)v31, (long)701984347170304623L, (long)var3_4), (long)685883699543800535L, (long)var3_4);
                                        v32 = new Object[4];
                                        v32[3] = var8_6;
                                        v32[2] = var2_2;
                                        v32[1] = fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)686948949063112683L, (long)var3_4), (long)701768063976853619L, (long)var3_4);
                                        v32[0] = Float.valueOf(fJ.a[2]);
                                        fJ.h("\u00f1", (Object)this.e, (Object)fJ.h("\u00f1", (Object)this, (Object)v32, (long)701984347170304623L, (long)var3_4), (long)685883699543800535L, (long)var3_4);
                                        if (var10_7 == null) break block84;
                                    }
                                    catch (MatchException v33) {
                                        throw fJ.h("e", (Object)v33, (long)688796537747886442L, (long)var3_4);
                                    }
                                }
                                v34 = new Object[4];
                                v34[3] = var8_6;
                                v34[2] = var2_2;
                                v34[1] = fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)686948949063112683L, (long)var3_4), (long)701768063976853619L, (long)var3_4);
                                v34[0] = Float.valueOf(0.0f);
                                v28 /* !! */  = fJ.h("\u00f1", (Object)this.e, (Object)fJ.h("\u00f1", (Object)this, (Object)v34, (long)701984347170304623L, (long)var3_4), (long)685883699543800535L, (long)var3_4);
                            }
                            catch (MatchException v35) {
                                throw fJ.h("e", (Object)v35, (long)688796537747886442L, (long)var3_4);
                            }
                        }
                        try {
                            if (var10_7 == null) break block86;
lbl212:
                            // 3 sources

                            v18 = fJ.h("\u00f1", (Object)var2_2, (Object)fJ.h("\u00e4", (long)687046362974645539L, (long)var3_4), (long)685946487520120851L, (long)var3_4);
                        }
                        catch (MatchException v36) {
                            throw fJ.h("e", (Object)v36, (long)688796537747886442L, (long)var3_4);
                        }
                    }
                    try {
                        block88: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var10_7 != null) break block87;
                                                    if (v18 == false) break block88;
                                                }
                                                catch (MatchException v37) {
                                                    throw fJ.h("e", (Object)v37, (long)688796537747886442L, (long)var3_4);
                                                }
                                                v18 = fJ.h("\u00f1", (Object)fJ.h("\u00aa", (Object)fJ.b, (long)688645919258206277L, (long)var3_4), (long)688474119142731351L, (long)var3_4);
                                                if (var10_7 != null) break block87;
                                            }
                                            catch (MatchException v38) {
                                                throw fJ.h("e", (Object)v38, (long)688796537747886442L, (long)var3_4);
                                            }
                                            if (v18 == false) break block88;
                                        }
                                        catch (MatchException v39) {
                                            throw fJ.h("e", (Object)v39, (long)688796537747886442L, (long)var3_4);
                                        }
                                        v18 = var12_9 /* !! */ ;
                                        if (var10_7 != null) break block87;
                                    }
                                    catch (MatchException v40) {
                                        throw fJ.h("e", (Object)v40, (long)688796537747886442L, (long)var3_4);
                                    }
                                    if (v18 == false) break block88;
                                }
                                catch (MatchException v41) {
                                    throw fJ.h("e", (Object)v41, (long)688796537747886442L, (long)var3_4);
                                }
                                v42 = new Object[4];
                                v42[3] = var8_6;
                                v42[2] = var2_2;
                                v42[1] = fJ.h("\u00f1", (Object)fJ.h("\u00e4", (long)686948949063112683L, (long)var3_4), (long)701768063976853619L, (long)var3_4);
                                v42[0] = Float.valueOf(0.0f);
                                fJ.h("\u00f1", (Object)this.e, (Object)fJ.h("\u00f1", (Object)this, (Object)v42, (long)701984347170304623L, (long)var3_4), (long)685883699543800535L, (long)var3_4);
                                if (var10_7 == null) break block86;
                            }
                            catch (MatchException v43) {
                                throw fJ.h("e", (Object)v43, (long)688796537747886442L, (long)var3_4);
                            }
                        }
                        v18 = fJ.h("\u00f1", (Object)var2_2, (Object)fJ.h("\u00e4", (long)684902990770926668L, (long)var3_4), (long)685946487520120851L, (long)var3_4);
                    }
                    catch (MatchException v44) {
                        throw fJ.h("e", (Object)v44, (long)688796537747886442L, (long)var3_4);
                    }
                }
                try {
                    if (var10_7 != null) break block89;
                    if (v18 == false) break block86;
                }
                catch (MatchException v45) {
                    throw fJ.h("e", (Object)v45, (long)688796537747886442L, (long)var3_4);
                }
                v18 = var13_10 /* !! */ ;
            }
            try {
                try {
                    if (var10_7 != null || v18 == false) break block86;
                }
                catch (MatchException v46) {
                    throw fJ.h("e", (Object)v46, (long)688796537747886442L, (long)var3_4);
                }
                v47 = new Object[1];
                v47[0] = var6_5;
                v18 = fJ.h("\u00f1", (Object)this.e, (Object)fJ.h("\u00f1", (Object)this, (Object)v47, (long)702515685259565792L, (long)var3_4), (long)685883699543800535L, (long)var3_4);
            }
            catch (MatchException v48) {
                throw fJ.h("e", (Object)v48, (long)688796537747886442L, (long)var3_4);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fJ.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fJ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fJ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

