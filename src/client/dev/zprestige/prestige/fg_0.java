/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2791
 *  net.minecraft.class_2919
 *  net.minecraft.class_3124$class_5876
 *  net.minecraft.class_4604
 *  net.minecraft.class_5321
 *  net.minecraft.class_5819
 *  net.minecraft.class_638
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aP;
import dev.zprestige.prestige.aU;
import dev.zprestige.prestige.as_0;
import dev.zprestige.prestige.bJ;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.c0;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dS;
import dev.zprestige.prestige.dT;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.gE;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.x_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2791;
import net.minecraft.class_2919;
import net.minecraft.class_3124;
import net.minecraft.class_4604;
import net.minecraft.class_5321;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import net.minecraft.class_6880;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.fg
 */
public class fg_0
extends dV {
    private dS a;
    private dT c;
    private dP d;
    public Map e = new ConcurrentHashMap();
    private long f;
    private boolean i;
    private Map g;
    private class_5321 h;
    private class_638 j;
    private class_4604 k;
    private static final long l;
    private static final String[] m;
    private static final String[] n;
    private static final Map o;
    private static final long[] p;
    private static final Integer[] q;
    private static final Map r;
    private static final long[] s;
    private static final Long[] t;
    private static final Map u;
    private static final Object[] v;
    private static final String[] w;

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                fg_0.l = hc.a(-6257375318676916802L, -450719354843011284L, MethodHandles.lookup().lookupClass()).a(19164119104203L);
                                fg_0.v = new Object[228];
                                fg_0.w = new String[228];
                                fg_0.f();
                                fg_0.o = new HashMap<K, V>(13);
                                var22 = fg_0.l ^ 73733591079729L;
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
                                var31_3 = new String[5];
                                var29_4 = 0;
                                var28_5 = "\u0002\u00f7b\u00ebz7#\u0088\u00d0\u00ff\u00aag\f\u00e7oV\u000e\u009c\u00ab\u0080%-\u0099o\u00ab\u00b0\u00ca\u0011\u00adc-\u00f4(\u00fdrl\u00e3\u001e\u00af\u0017U\u0088@JN$3\t\u00bb\u0016\u0090\u0003Z\u00a4\u0001o\u00e5\u00c0\u00f6\u000e\u00f9\u00e1\u00deU\u0006N\u00cc\u00be\u0007\u00dfz\u009e\u00d4 Y\u00ba75\u00f9\u00b8\u0098\u00e7\u00b7\u0096E;\u000e2\u00e3\u00f7kL\u00126[\u0089\u0011#4\u00f5\u00d4\u00cb\u00d013\u00a6";
                                var30_6 = "\u0002\u00f7b\u00ebz7#\u0088\u00d0\u00ff\u00aag\f\u00e7oV\u000e\u009c\u00ab\u0080%-\u0099o\u00ab\u00b0\u00ca\u0011\u00adc-\u00f4(\u00fdrl\u00e3\u001e\u00af\u0017U\u0088@JN$3\t\u00bb\u0016\u0090\u0003Z\u00a4\u0001o\u00e5\u00c0\u00f6\u000e\u00f9\u00e1\u00deU\u0006N\u00cc\u00be\u0007\u00dfz\u009e\u00d4 Y\u00ba75\u00f9\u00b8\u0098\u00e7\u00b7\u0096E;\u000e2\u00e3\u00f7kL\u00126[\u0089\u0011#4\u00f5\u00d4\u00cb\u00d013\u00a6".length();
                                var27_7 = 32;
                                var26_8 = -1;
lbl32:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl37:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = fg_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u00bf\u00b5\u009f\u00a7;\u00cf[\u0087>^\u00d6\u00car\u00e4\u00ea\u00d8\u0089S4\u0084%\u00b2y\u008ah\u00f0\u0095\u00fdW\u00d26q@\u00be,R\\\u009d\\\u00a5y\u00c1\u00e9\u00fd\u00ce\u0010\u0097\rD\u00f9\u001d\u00bb\nD(\u001c)\u007f\u00bb\u00d7Z\u00da5\u00c1Ra\u00c7\u00dazk\u00a4\u00ea\u00ff\u00bf\r\u0083#\u00d2I\u009455z\u009b\u00d4ev\u00fc\u00da\u00f7\u00a6\u00a8\u00126\u00e4vZ";
                                    var30_6 = "\u00bf\u00b5\u009f\u00a7;\u00cf[\u0087>^\u00d6\u00car\u00e4\u00ea\u00d8\u0089S4\u0084%\u00b2y\u008ah\u00f0\u0095\u00fdW\u00d26q@\u00be,R\\\u009d\\\u00a5y\u00c1\u00e9\u00fd\u00ce\u0010\u0097\rD\u00f9\u001d\u00bb\nD(\u001c)\u007f\u00bb\u00d7Z\u00da5\u00c1Ra\u00c7\u00dazk\u00a4\u00ea\u00ff\u00bf\r\u0083#\u00d2I\u009455z\u009b\u00d4ev\u00fc\u00da\u00f7\u00a6\u00a8\u00126\u00e4vZ".length();
                                    var27_7 = 32;
                                    var26_8 = -1;
lbl46:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl51:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = fg_0.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
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
                        fg_0.m = var31_3;
                        fg_0.n = new String[5];
                        fg_0.r = new HashMap<K, V>(13);
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
                        var17_12 = new long[5];
                        var14_13 = 0;
                        var15_14 = "\u0082\u00ce\u009a\u00c1\u00c6\u0095\u00ac94\u00fb2\u009f\u00e4\u0096Z\foZ\u0086\u0003H\u00f6X\u00d0";
                        var16_15 = "\u0082\u00ce\u009a\u00c1\u00c6\u0095\u00ac94\u00fb2\u009f\u00e4\u0096Z\foZ\u0086\u0003H\u00f6X\u00d0".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl102:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u0089\u0004y\u00f1\u0019&B\t\nC\u001d\u00b4\u00c5\u00de4\u0082";
                            var16_15 = "\u0089\u0004y\u00f1\u0019&B\t\nC\u001d\u00b4\u00c5\u00de4\u0082".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl121:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
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
                fg_0.p = var17_12;
                fg_0.q = new Integer[5];
                fg_0.u = new HashMap<K, V>(13);
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
                var6_22 = new long[3];
                var3_23 = 0;
                var4_24 = "[Z\u00bf\u00ad\u008b\u00de\u0011u$\u00c9>\u00c2\u00bc(?X\u00c6C\u00e3!y\u00bb\u0081\u00c2";
                var5_25 = "[Z\u00bf\u00ad\u008b\u00de\u0011u$\u00c9>\u00c2\u00bc(?X\u00c6C\u00e3!y\u00bb\u0081\u00c2".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl165:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        fg_0.s = var6_22;
        fg_0.t = new Long[3];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fg_0.h("B", (Object)this.e, (long)3985555201881606660L, (long)l);
        this.g = null;
        this.h = null;
        this.j = null;
        this.i = 0;
    }

    private boolean e(Object[] objectArray) {
        Object object;
        block14: {
            block15: {
                CallSite callSite;
                long l;
                block12: {
                    float f;
                    class_2919 class_29192;
                    block13: {
                        block10: {
                            block11: {
                                class_29192 = (class_2919)objectArray[0];
                                f = ((Float)objectArray[1]).floatValue();
                                l = (Long)objectArray[2];
                                l = fg_0.l ^ l;
                                callSite = fg_0.h("M", (long)6985643410244714939L, (long)l);
                                try {
                                    try {
                                        float f10 = f - 0.0f;
                                        object = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                        if (callSite != null) break block10;
                                        if (object > 0) break block11;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)6986067507774288869L, (long)l);
                                    }
                                    return true;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)6986067507774288869L, (long)l);
                                }
                            }
                            float f11 = f - 1.0f;
                            object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        }
                        try {
                            try {
                                if (callSite != null) break block12;
                                if (object < 0) break block13;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)6986067507774288869L, (long)l);
                            }
                            return false;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)6986067507774288869L, (long)l);
                        }
                    }
                    reference cfr_temp_2 = fg_0.h("B", (Object)class_29192, (long)6975187961479135594L, (long)l) - f;
                    object = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                }
                try {
                    if (callSite != null) break block14;
                    if (object < 0) break block15;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)6986067507774288869L, (long)l);
                }
                object = 1;
                break block14;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7262;
        if (fg_0.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = m[n2].getBytes("ISO-8859-1");
            fg_0.n[n2] = fg_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return fg_0.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fg_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private List b(Object[] objectArray) {
        Object object;
        block4: {
            long l;
            class_5321 class_53212;
            block5: {
                class_53212 = (class_5321)objectArray[0];
                l = (Long)objectArray[1];
                l = fg_0.l ^ l;
                CallSite callSite = fg_0.h("M", (long)-703235501879666825L, (long)l);
                try {
                    try {
                        object = this.g;
                        if (callSite != null) break block4;
                        if (object != null) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)-702814702008048343L, (long)l);
                    }
                    return fg_0.h("M", (long)-709912207960733423L, (long)l);
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)-702814702008048343L, (long)l);
                }
            }
            object = fg_0.h("B", (Object)this.g, (Object)class_53212, (Object)fg_0.h("M", (long)-709912207960733423L, (long)l), (long)-706807602540095066L, (long)l);
        }
        return (List)object;
    }

    private ArrayList b(Object[] objectArray) {
        int n;
        int n2;
        CallSite callSite;
        ArrayList arrayList;
        double[] dArray;
        class_2338.class_2339 class_23392;
        BitSet bitSet;
        long l;
        long l2;
        c0 c02;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        class_2919 class_29192;
        class_638 class_6382;
        block60: {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            block59: {
                class_6382 = (class_638)objectArray[0];
                class_29192 = (class_2919)objectArray[1];
                n8 = (Integer)objectArray[2];
                double d = (Double)objectArray[3];
                double d10 = (Double)objectArray[4];
                double d11 = (Double)objectArray[5];
                double d12 = (Double)objectArray[6];
                double d13 = (Double)objectArray[7];
                double d14 = (Double)objectArray[8];
                n7 = (Integer)objectArray[9];
                n6 = (Integer)objectArray[10];
                n5 = (Integer)objectArray[11];
                n4 = (Integer)objectArray[12];
                n3 = (Integer)objectArray[13];
                c02 = (c0)objectArray[14];
                l2 = (Long)objectArray[15];
                l = (l2 = fg_0.l ^ l2) ^ 0xD96FB13D9FAL;
                bitSet = new BitSet(n4 * n3 * n4);
                class_23392 = new class_2338.class_2339();
                dArray = new double[n8 * 4];
                arrayList = new ArrayList();
                callSite = fg_0.h("M", (long)5225525452055669198L, (long)l2);
                for (n2 = 0; n2 < n8; ++n2) {
                    float f = (float)n2 / (float)n8;
                    object4 = fg_0.h("M", (double)f, (double)d, (double)d10, (long)5227651380548996420L, (long)l2);
                    object3 = fg_0.h("M", (double)f, (double)d13, (double)d14, (long)5227651380548996420L, (long)l2);
                    object2 = fg_0.h("M", (double)f, (double)d11, (double)d12, (long)5227651380548996420L, (long)l2);
                    object = fg_0.h("B", (Object)class_29192, (long)5224197129857550812L, (long)l2) * (double)n8 / 16.0;
                    double d15 = ((double)(fg_0.h("M", (double)((float)Math.PI * f), (long)5228047893351725345L, (long)l2) + 1.0f) * object + 1.0) / 2.0;
                    try {
                        dArray[n2 * 4] = (double)object4;
                        dArray[n2 * 4 + 1] = (double)object3;
                        dArray[n2 * 4 + 2] = (double)object2;
                        dArray[n2 * 4 + 3] = d15;
                        if (callSite == null) {
                            if (callSite == null) continue;
                            break;
                        }
                        break block59;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                    }
                }
                n2 = 0;
            }
            block45: while (true) {
                int n9 = n2;
                block46: while (n9 < n8 - 1) {
                    block62: {
                        int n10;
                        block61: {
                            try {
                                try {
                                    try {
                                        double d = dArray[n2 * 4 + 3] - 0.0;
                                        n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                                        if (callSite != null) break block60;
                                        if (callSite != null) break block61;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                    }
                                    if (n <= 0) break block62;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                }
                                n10 = n2 + 1;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                            }
                        }
                        void var41_30 = n10;
                        while (var41_30 < n8) {
                            block65: {
                                block64: {
                                    double d;
                                    double d10;
                                    block63: {
                                        try {
                                            d10 = dArray[var41_30 * 4 + 3];
                                            d = 0.0;
                                            if (callSite != null) break block63;
                                            double d11 = d10 - d;
                                            n9 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                            if (callSite != null) continue block46;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                        }
                                        try {
                                            if (n9 <= 0) break block64;
                                            d10 = dArray[n2 * 4];
                                            d = dArray[var41_30 * 4];
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                        }
                                    }
                                    object4 = d10 - d;
                                    object3 = dArray[n2 * 4 + 1] - dArray[var41_30 * 4 + true];
                                    object2 = dArray[n2 * 4 + 2] - dArray[var41_30 * 4 + 2];
                                    object = dArray[n2 * 4 + 3] - dArray[var41_30 * 4 + 3];
                                    try {
                                        block66: {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite != null) break block65;
                                                        if (!(object * object > object4 * object4 + object3 * object3 + object2 * object2)) break block64;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                    }
                                                    if (!(object > 0.0)) break block66;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                }
                                                dArray[var41_30 * 4 + 3] = -1.0;
                                                if (callSite == null) break block64;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                            }
                                        }
                                        dArray[n2 * 4 + 3] = -1.0;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                    }
                                }
                                ++var41_30;
                            }
                            if (callSite == null) continue;
                        }
                    }
                    ++n2;
                    if (callSite == null) continue block45;
                }
                break;
            }
            n = 0;
        }
        n2 = n;
        block48: while (true) {
            int n11 = n2;
            block49: while (n11 < n8) {
                block67: {
                    double d = dArray[n2 * 4 + 3];
                    try {
                        if (callSite != null) continue block48;
                        if (d < 0.0) break block67;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                    }
                    double d18 = dArray[n2 * 4];
                    double d19 = dArray[n2 * 4 + 1];
                    double d20 = dArray[n2 * 4 + 2];
                    reference var49_37 = fg_0.h("M", (int)fg_0.h("M", (double)(d18 - d), (long)5240188219775864833L, (long)l2), (int)n7, (long)5227195428117597502L, (long)l2);
                    CallSite callSite2 = fg_0.h("M", (int)fg_0.h("M", (double)(d19 - d), (long)5240188219775864833L, (long)l2), (int)n6, (long)5227195428117597502L, (long)l2);
                    reference var51_39 = fg_0.h("M", (int)fg_0.h("M", (double)(d20 - d), (long)5240188219775864833L, (long)l2), (int)n5, (long)5227195428117597502L, (long)l2);
                    CallSite callSite3 = fg_0.h("M", (int)fg_0.h("M", (double)(d18 + d), (long)5240188219775864833L, (long)l2), (int)var49_37, (long)5227195428117597502L, (long)l2);
                    CallSite callSite4 = fg_0.h("M", (int)fg_0.h("M", (double)(d19 + d), (long)5240188219775864833L, (long)l2), (int)callSite2, (long)5227195428117597502L, (long)l2);
                    CallSite callSite5 = fg_0.h("M", (int)fg_0.h("M", (double)(d20 + d), (long)5240188219775864833L, (long)l2), (int)var51_39, (long)5227195428117597502L, (long)l2);
                    reference var55_43 = var49_37;
                    block50: while (true) {
                        Object object = var55_43;
                        block51: while (object <= callSite3) {
                            double d21 = ((double)var55_43 + 0.5 - d18) / d;
                            try {
                                if (callSite != null) continue block50;
                                double d12 = d21 * d21 - 1.0;
                                n11 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                if (callSite != null) continue block49;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                            }
                            if (n11 < 0) {
                                CallSite callSite6 = callSite2;
                                block52: while (true) {
                                    Object object2 = callSite6;
                                    block53: while (object2 <= callSite4) {
                                        double d23 = ((double)callSite6 + 0.5 - d19) / d;
                                        try {
                                            if (callSite != null) continue block52;
                                            double d13 = d21 * d21 + d23 * d23 - 1.0;
                                            object = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                                            if (callSite != null) continue block51;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                        }
                                        if (object < 0) {
                                            reference var61_47 = var51_39;
                                            while (var61_47 <= callSite5) {
                                                block68: {
                                                    block69: {
                                                        double d25 = ((double)var61_47 + 0.5 - d20) / d;
                                                        try {
                                                            if (callSite != null) break block68;
                                                            double d14 = d21 * d21 + d23 * d23 + d25 * d25 - 1.0;
                                                            object2 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                                            if (callSite != null) continue block53;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                        }
                                                        if (object2 < 0) {
                                                            CallSite callSite7;
                                                            block70: {
                                                                reference var64_33 = var55_43 - n7 + (callSite6 - n6) * n4 + (var61_47 - n5) * n4 * n3;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (callSite != null) break block68;
                                                                                        if (fg_0.h("B", (Object)bitSet, (int)var64_33, (long)5224444305208103593L, (long)l2) != false) break block69;
                                                                                    }
                                                                                    catch (NumberFormatException numberFormatException) {
                                                                                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                                    }
                                                                                    fg_0.h("B", (Object)bitSet, (int)var64_33, (long)5228439296596807321L, (long)l2);
                                                                                    fg_0.h("B", (Object)class_23392, (int)var55_43, (int)callSite6, (int)var61_47, (long)5227204305810551023L, (long)l2);
                                                                                    if (callSite != null) break block68;
                                                                                }
                                                                                catch (NumberFormatException numberFormatException) {
                                                                                    throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                                }
                                                                                if (callSite6 < fg_0.c("q", (int)11613, (long)(0x27CE00FD1DA3E5DDL ^ l2))) break block69;
                                                                            }
                                                                            catch (NumberFormatException numberFormatException) {
                                                                                throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                            }
                                                                            callSite7 = callSite6;
                                                                            if (callSite != null) break block70;
                                                                        }
                                                                        catch (NumberFormatException numberFormatException) {
                                                                            throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                        }
                                                                        if (callSite7 >= fg_0.c("q", (int)14382, (long)(0x27B9A067E43470AFL ^ l2))) break block69;
                                                                    }
                                                                    catch (NumberFormatException numberFormatException) {
                                                                        throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                    }
                                                                    Object[] objectArray2 = new Object[5];
                                                                    objectArray2[4] = l;
                                                                    objectArray2[3] = class_29192;
                                                                    objectArray2[2] = c02;
                                                                    objectArray2[1] = class_23392;
                                                                    objectArray2[0] = class_6382;
                                                                    callSite7 = fg_0.h("B", (Object)this, (Object)objectArray2, (long)5224536184743924468L, (long)l2);
                                                                }
                                                                catch (NumberFormatException numberFormatException) {
                                                                    throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (callSite != null || callSite7 == false) break block69;
                                                                }
                                                                catch (NumberFormatException numberFormatException) {
                                                                    throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                                }
                                                                callSite7 = fg_0.h("B", arrayList, (Object)new class_243((double)var55_43, (double)callSite6, (double)var61_47), (long)5240989815878661708L, (long)l2);
                                                            }
                                                            catch (NumberFormatException numberFormatException) {
                                                                throw fg_0.h("M", (Object)numberFormatException, (long)5225945229909941136L, (long)l2);
                                                            }
                                                        }
                                                    }
                                                    ++var61_47;
                                                }
                                                if (callSite == null) continue;
                                            }
                                        }
                                        ++callSite6;
                                        if (callSite == null) continue block52;
                                    }
                                    break;
                                }
                            }
                            ++var55_43;
                            if (callSite == null) continue block50;
                        }
                        break;
                    }
                }
                ++n2;
                if (callSite == null) continue block48;
            }
            break;
        }
        return arrayList;
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

    private ArrayList c(Object[] objectArray) {
        class_638 class_6382 = (class_638)objectArray[0];
        class_2919 class_29192 = (class_2919)objectArray[1];
        class_2338 class_23382 = (class_2338)objectArray[2];
        c0 c02 = (c0)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = fg_0.l ^ l;
        long l3 = l2 ^ 0x4A0187F6338AL;
        long l4 = l2 ^ 0x7D4F71B79187L;
        ArrayList arrayList = new ArrayList();
        CallSite callSite = fg_0.h("M", (long)70293358444945843L, (long)l);
        CallSite callSite2 = fg_0.h("B", (Object)class_29192, (int)(c02.i + 1), (long)67277282047044129L, (long)l);
        int n = 0;
        while (n < callSite2) {
            block5: {
                block6: {
                    CallSite callSite3 = fg_0.h("M", (int)n, (int)fg_0.c("q", (int)7746, (long)(0x1002D21F60B21EBCL ^ l)), (long)68758928295848867L, (long)l);
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l3;
                    objectArray2[1] = (int)callSite3;
                    objectArray2[0] = class_29192;
                    reference var17_14 = fg_0.h("B", (Object)this, (Object)objectArray2, (long)55730216666410807L, (long)l) + fg_0.h("B", (Object)class_23382, (long)68542051761032337L, (long)l);
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = l3;
                    objectArray3[1] = (int)callSite3;
                    objectArray3[0] = class_29192;
                    reference var18_15 = fg_0.h("B", (Object)this, (Object)objectArray3, (long)55730216666410807L, (long)l) + fg_0.h("B", (Object)class_23382, (long)55900483600032842L, (long)l);
                    Object[] objectArray4 = new Object[3];
                    objectArray4[2] = l3;
                    objectArray4[1] = (int)callSite3;
                    objectArray4[0] = class_29192;
                    reference var19_16 = fg_0.h("B", (Object)this, (Object)objectArray4, (long)55730216666410807L, (long)l) + fg_0.h("B", (Object)class_23382, (long)70875576291453361L, (long)l);
                    class_2338 class_23383 = new class_2338((int)var17_14, (int)var18_15, (int)var19_16);
                    try {
                        try {
                            if (callSite != null) break block5;
                            Object[] objectArray5 = new Object[5];
                            objectArray5[4] = l4;
                            objectArray5[3] = class_29192;
                            objectArray5[2] = c02;
                            objectArray5[1] = class_23383;
                            objectArray5[0] = class_6382;
                            if (fg_0.h("B", (Object)this, (Object)objectArray5, (long)70992318222719625L, (long)l) == false) break block6;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)70713604798256109L, (long)l);
                        }
                        fg_0.h("B", arrayList, (Object)new class_243((double)var17_14, (double)var18_15, (double)var19_16), (long)55957040409312817L, (long)l);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)70713604798256109L, (long)l);
                    }
                }
                ++n;
            }
            if (callSite == null) continue;
        }
        return arrayList;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fg_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x27;
        if (q[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fg_0.q[n2] = n3;
        }
        return q[n2];
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fg_0.m(l, l2);
            object = v[n];
            try {
                if (!(object instanceof String)) break block2;
                fg_0.v[n] = clazz = Class.forName(w[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fg_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fg_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fg_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fg_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/zprestige/prestige/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean f(Object[] objectArray) {
        Object object;
        block8: {
            class_638 class_6382 = (class_638)objectArray[0];
            class_2338 class_23382 = (class_2338)objectArray[1];
            long l = (Long)objectArray[2];
            l = fg_0.l ^ l;
            CallSite callSite = fg_0.h("M", (long)-503182096192726583L, (long)l);
            int n = ((CallSite)callSite).length;
            int n2 = 0;
            CallSite callSite2 = fg_0.h("M", (long)-498018454404409252L, (long)l);
            while (n2 < n) {
                block7: {
                    block9: {
                        CallSite callSite3 = callSite[n2];
                        try {
                            try {
                                try {
                                    if (callSite2 != null) break block7;
                                    object = fg_0.h("B", (Object)fg_0.h("B", (Object)class_6382, (Object)fg_0.h("B", (Object)class_23382, (Object)callSite3, (long)-497258551958347843L, (long)l), (long)-503729576162673932L, (long)l), (long)-496808649113057964L, (long)l);
                                    if (callSite2 != null) break block8;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)-498725197285332478L, (long)l);
                                }
                                if (!object) break block9;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)-498725197285332478L, (long)l);
                            }
                            return true;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)-498725197285332478L, (long)l);
                        }
                    }
                    ++n2;
                }
                if (callSite2 == null) continue;
            }
            object = false;
        }
        return object;
    }

    private static void f() {
        Object[] objectArray = v;
        v[0] = "Hl$#DE^l!yWRI'\"\u007f[FX`5h\u0010V~";
        objectArray[1] = "\t\u001bY,\u0014\u0000|;R#\u0005O\u001d5Y(\u0001\u0015i";
        objectArray[2] = Void.TYPE;
        fg_0.w[2] = "java/lang/Void";
        objectArray[3] = "\u001a\tHG\u0012\u000f\u0011\u0006Y\bs\u0001\u001a\r]R";
        objectArray[4] = Boolean.TYPE;
        fg_0.w[4] = "java/lang/Boolean";
        objectArray[5] = "+\u0014^\t\u0012\u0001+\u0014IU\u001e\u000e1_IK\u001e\u001b6.\u001f\u0014MY";
        objectArray[6] = "\\8sC<\u0019\\8d\u001f0\u0016Fsd\u00010\u0003A\u00025Tg@";
        objectArray[7] = "LR)5L\\ZR,o_KM\u0019/iS_\\^8~\u0018M`";
        objectArray[8] = "X)0BK9-\t;MZvP\u0011(JS?8";
        objectArray[9] = "eOmAUNeOz\u001dYA\u007f\u0004z\u0003YTxu/\\\u0000";
        objectArray[10] = "wO;f5\rwO,:9\u0002m\u0004,$9\u0017ju|yh";
        objectArray[11] = "<4\u0013VP\u0005*4\u0016\fC\u0012=\u007f\u0015\nO\u0006,8\u0002\u001d\u0004\u001648\u0000\u0016^[\b#\u0000\u000b^\u001c?4";
        objectArray[12] = ">Gc\u001dxf OyR\u001br$";
        objectArray[13] = "\u0005jI)H\u0016\u000eeXf5\u000e\u001dbQ/";
        objectArray[14] = "QF5\t\u0005xGF0S\u0016oP\r3U\u001a{AJ$BQlc";
        objectArray[15] = "+\u001b\u007fF?E^;tI.\n?5\u007fB*PK";
        objectArray[16] = "+\\|K.'=\\y\u0011=0*\u0017z\u00171$;Pm\u0000z1(";
        objectArray[17] = "\r\u000e\u0013}\u0007\tx.\u0018r\u0016F\u0019 \u0013y\u0012\u001cm";
        objectArray[18] = "\rF\u0003(RA\u001bF\u0006rAV\f\r\u0005tMB\u001dJ\u0012c\u0006RY";
        objectArray[19] = ".\n7\u0006 r[*<\t1=:$7\u00025gN";
        objectArray[20] = "H\u000f\u000e~p\u001cC\u0000\u001f1\u0010\u0005O\f\u001dm\u0018\u001fP\u0003\u0019k\u001b\bA\u000b\bk7\u001fL";
        objectArray[21] = ".%qF{Z0-k\t\u001c[!6fS:]";
        objectArray[22] = "\u000f\u001fH5AF\u000f\u001f_iMI\u0015T_wM\\\u0012%\u000e(\u001f\u0017";
        objectArray[23] = "Gg#X@\rGg4\u0004L\u0002],4\u001aL\u0017Z]e@\u0015T";
        objectArray[24] = "-\u001f|Y\u0014.-\u001fk\u0005\u0018!7Tk\u001b\u001840%;OKr";
        objectArray[25] = "\"\u0018/\u007f2 \"\u00188#>/8S8=>:?\"ninp";
        objectArray[26] = "T8}\tlk!\u0018v\u0006}$@\u0016}\ry~4";
        objectArray[27] = "v)8Mahv)/\u0011mglb/\u000fmrk\u0013\u007fR>5</ \u0002\u007frGytT:";
        objectArray[28] = "4\u00140>1\u0005*\u001c*qS\u0019-\u0001";
        objectArray[29] = "d5GG\r!d5P\u001b\u0001.~~P\u0005\u0001;y\u000f\u0001[Tp";
        objectArray[30] = "MQ5L\u0016+8q>C\u0007dY\u007f5H\u0003>-";
        objectArray[31] = "\\\\c\u0012pf)|h\u001da)Hrc\u0016es<";
        objectArray[32] = "\u00168dw\u0014Ac\u0018ox\u0005\u000e\u0002\u0016ds\u0001Tv";
        objectArray[33] = "+6`XwU=6e\u0002dB*}f\u0004hV;:q\u0013#D\u001a";
        objectArray[34] = "\u00109OA\u00060e\u0019DN\u0017\u007f\u0004\u0017OE\u0013%p";
        objectArray[35] = "U\u0018-Lr\u007fU\u0018:\u0010~pOS:\u000e~eH\"kZ..";
        objectArray[36] = "L\u001c\u000e0c\u0018G\u0013\u001f\u007f\u0004\u0000C\u000f\u00193!\u0011";
        objectArray[37] = "s4\f?~~s4\u001bcrqi\u007f\u001b}rdn\u000eO%%";
        objectArray[38] = "8\"e\u0000e\u0013M\u0002n\u000ft\\,\fe\u0004p\u0006X";
        objectArray[39] = "TRs2qb_]b}\u0012oJ[";
        objectArray[40] = Float.TYPE;
        fg_0.w[40] = "java/lang/Float";
        objectArray[41] = Integer.TYPE;
        fg_0.w[41] = "java/lang/Integer";
        objectArray[42] = "\nO\u0010t/;\nO\u0007(#4\u0010\u0004\u00076#!\u0017uVcsk";
        objectArray[43] = "Z5\u0014]\u0012yZ5\u0003\u0001\u001ev@~\u0003\u001f\u001ecG\u000fSFL\"";
        objectArray[44] = Double.TYPE;
        fg_0.w[44] = "java/lang/Double";
        objectArray[45] = "\t\ffg\\\u0005\t\fq;P\n\u0013Gq%P\u001f\u00146 z\u0002TC\n~(B\u001f8[!z\b";
        objectArray[46] = "31g3U,-9}|90-\u0003t&";
        objectArray[47] = "\u0001G2TRMtg9[C\u0002\u0015i2PGXa";
        objectArray[48] = "Pd8O\u0019dNl\"\u0000vcHd7b^bN";
        objectArray[49] = "a|\u001eDa\u001c\u0014\\\u0015KpSuR\u001e@t\t\u0001";
        objectArray[50] = "\u0006$`0[\u001b\u0006$wlW\u0014\u001cowrW\u0001\u001b\u001e&-\u0003B";
        objectArray[51] = "!#\u0019$a@\u0017\u0006\u0019$v\u001c\u001b\t\u0003ov\u0002\u001b\u001c\u0004\u001e']O_L";
        objectArray[52] = "$21\u001en/$2&Bb >y&\\b59\bw\u00055w";
        objectArray[53] = "Smy\u0014>oEm|N-xR&\u007fH!lCah_j{|";
        objectArray[54] = "4W+U1'Aw Z h y+Q$2T";
        objectArray[55] = "\u0005D$G\u0006m\u000eK5\bdn\u0001B";
        objectArray[56] = Long.TYPE;
        fg_0.w[56] = "java/lang/Long";
        objectArray[57] = "!\u0002GD3n!\u0002P\u0018?a;IP\u0006?t<8\u0001Sn5k\u0004_\u000b-t\u0010U\nZm";
        objectArray[58] = "h\u0003\u000ekf\u0010\u001d#\u0005dw_|-\u000eos\u0005\b";
        objectArray[59] = "\u0011\rE\u0012e8\u0011\rRNi7\u000bFRPi\"\f7\u0003\u0004:g";
        objectArray[60] = "qo\u0005g\f@qo\u0012;\u0000Ok$\u0012%\u0000ZlUF|S\u001b";
        objectArray[61] = "P~\u0016]^CP~\u0001\u0001RLJ5\u0001\u001fRYMDSJ\u0001\u0019";
        objectArray[62] = "\f2/>yx\f28buw\u0016y8|ub\u0011\bi'- ";
        objectArray[63] = "e\u0016\fA\u0002wS3\fA\u0015+_<\u0016\n\u00155_)\u0011{Da\flY";
        objectArray[64] = "l*\r9\bHr\"\u0017v@Hh(\u000f1IS(\b\u00146UHk.\t";
        objectArray[65] = "VTU%U\"VTByY-L\u001fBgY8Kn\u00133\b}";
        objectArray[66] = "0Pq\nJD.XkE\u0017E(Tf\u0006Jb.Cb\n\t";
        objectArray[67] = "82d\u0005\u001d\"&:~J@# 6s\t\u001d\u0014=?~\u0001P#=!";
        objectArray[68] = "zH5`_'zH\"<S(`\u0003\"\"S=grw~\u0003y";
        objectArray[69] = "\u0005c xuE\u001bk:7(D\u001dg7tus\u0000n:|8D\u0000p%";
        objectArray[70] = "1grfciDGyir&%Irbv|Q";
        objectArray[71] = "rNYA@\u001erNN\u001dL\u0011h\u0005N\u0003L\u0004ot\u001b^\u001fE";
        objectArray[72] = "6A\u0005A1\u00116A\u0012\u001d=\u001e,\n\u0012\u0003=\u000b+{DWj@";
        objectArray[73] = ",\u001ei:\u0003\u001b2\u0016su~\u000b2";
        objectArray[74] = "\u0000\u0011TdEp\u001e\u0019N+#d\u0019\u0018q`\u001f";
        objectArray[75] = "wkb%1~icxjWjnbY%o";
        objectArray[76] = "@f;\u0019@\u00005F0\u0016QOTH;\u001dU\u0015 ";
        objectArray[77] = "\u0002b\u0019*KrwB\u0012%Z=\u0016L\u0019.^gb";
        objectArray[78] = "\u0005&,H77\u0005&;\u0014;8\u001fm;\n;-\u0018\u001cj_kgO 4\u0007)-4unQo";
        objectArray[79] = "\u0003}B\u001e\\K\u0003}UBPD\u00196U\\PQ\u001eG\u0000\b\t\u0012";
        objectArray[80] = "F\u0018]\n#\"X\u0010GEB'X\u0010D\u0005l;";
        objectArray[81] = "`?\\\u001011~7F_\\+f2O\u0012k-e0";
        objectArray[82] = "aJe\u0010!\u0010aJrL-\u001f{\u0001rR-\n|p$\txK";
        objectArray[83] = "\u001e\u001a9\u00166@\u0000\u0012#Y~@\u001a\u0018;\u001ew[Z=:\u0019{A\u001d\u0014!";
        objectArray[84] = "n'\u0014x\u0015dx'\u0011\"\u0006sol\u0012$\ng~+\u00053AuZ";
        objectArray[85] = " sfz\u0012yUSmu\u000364]f~\u0007l@";
        objectArray[86] = "uU;9hl\u0000u06y#a{;=}y\u0015";
        objectArray[87] = "R\"~h\u0010\u0012R\"i4\u001c\u001dHii*\u001c\bO\u00188rN";
        objectArray[88] = "\u001d\bl\u0017&v\u001d\b{K*y\u0007C{U*l\u00002*\ns-";
        objectArray[89] = "@UJ'\u001d\u0018@U]{\u0011\u0017Z\u001e]e\u0011\u0002]o\n?@E";
        objectArray[90] = "\bi-\u0011:B\bi:M6M\u0012\":S6X\u0015Sk\fo";
        objectArray[91] = "u\u001a\"\u0004Stc\u001a'^@ctQ$XLwe\u00163O\u0007`P";
        objectArray[92] = "6E\u001b\u0006\u0014\fCe\u0010\t\u0005C\"k\u001b\u0002\u0001\u0019V";
        objectArray[93] = ";\r\u0013Em\n-\r\u0016\u001f~\u001d:F\u0015\u0019r\t+\u0001\u0002\u000e9\u001e\f";
        objectArray[94] = "%Xd\u0019\u001e8Pxo\u0016\u000fw1vd\u001d\u000b-E";
        objectArray[95] = "8\t\u000e(Ep&\u0001\u0014g&d\"L='\u001fw+";
        objectArray[96] = "b&\u0018s\bqt&\u001d)\u001bfcm\u001e/\u0017rr*\t8\\cL";
        objectArray[97] = "1\u001f\u001eCT6D?\u0015LEy%1\u001eGA#Q";
        objectArray[98] = ",X\rk\u0001\"'W\u001c$f 2\\\u001co]";
        objectArray[99] = "\u0000qryM.uQyv\\a\u0014_r}X;`";
        objectArray[100] = "q10\u000e^Wo9*A3Mw<#\f\u0004Kt>5";
        objectArray[101] = "\u0015;Fr\u00071A&G\u0010PZA3\u0002v@>\u00139\u0003|EZB{Ri]1\u00068Bq9";
        objectArray[102] = "F\u0018U/X\t\u001a\u001eW+\u001an\u0011BE\"M9F\u0018\u0011w\u001enF\u0018U/X\t\u001a\u001eW+\u001a";
        objectArray[103] = "J_-g5@DX>eU@\u0019J2\u007f9rN\tc(n%OQodi\u001c\u0015]kiU";
        objectArray[104] = "\u001e\u0006A]\u0003RP\u000eOHgGC\u0019$\u0018\u0004\u0016T[\\P\u000b\u0016Ue\u001eAYR\u0010\u001dVNYS.";
        objectArray[105] = "l(j\u0011\u0007Y6'cT\u0014%0zz\b\u0003I\u0002.<P\\\u001bU.9\u0014\u000fI.ft\u0003\u001aTU";
        objectArray[106] = "%|\u001fr\u000e\u001ekt\u0011gj\u001a|{\u0007`\u0011d,|\u00103Q\u0018sd\u0013bPd";
        objectArray[107] = "c\u0007,>W8p]%b((\n\u000e,3N8n\\&2D=\n\rdcQ%aI'sIA";
        objectArray[108] = "\u000e/M\u001evU\u0003#\u001e\u0019\u0016\u0005\u000b8]\u000bw\b\u0017^\u001b\u0001(\u0014R&S\u000e(\u0015ld[\u0012d\u0000\t/N\u0001kn";
        objectArray[109] = ":K9*<\u0019=Q?9FA+V'3*s\u007f\u0010yj\u007f$\u007f\u0011\u007f6/\u001f*[>6\"$:\u00108%,AwE<)FX|U6>#\u0015)Q:T\u007f\u001f~H.o*U?H#T";
        objectArray[110] = "w\u0014;\"^\u0002%\u001a26!\u0010\u001d\u0013z`G\u0000yApaM\u0005\u001dR`?\u001d\u001f#[g?[y";
        objectArray[111] = "PqY-\u0007uUgI+\b\u000b\bd\u007f6\u0010w\u0018\u001f\b)\u0018y\u0007zC<\u000bvi";
        objectArray[112] = "7\u0018z3ZJu\u0002q'\u00181`\u001e|8Mf7D,e!Lo\u000f,$@\bs\u001dc";
        objectArray[113] = "N|kVc,\u001crbB\u001c5${*\u0014z.@) \u0015p+$xbDe3O<!T}W";
        objectArray[114] = "|V\u0010)VC.X\u0019=)Q\u0016QQkOAr\u0003[jED\u0016\u0014\u001b)XRsYN-T8";
        objectArray[115] = "S\u001f&+\n\u0015DY2%p\u0001B\u001f?0\u001c3\u0016^djOdR\u0002/j\b\u0005\u0016\u001e=%p\u0018\u0015\u001c.=\u0015U@\u0018\"W";
        objectArray[116] = "\u0007w\u0002\u0007\u000f]\tp\u0011\u0005o]Tb\u001d\u001f\u0003o\t GDo\u0001\u0002c\u0014\u0001\b]\u0004a\u0010CoD\u0003a\f\u0012\n\tVe\u0000x\u0013\u0002Fo\u0017\u001d^WBc}\u0004UGHt\u0018I\u0000CD\u001e";
        objectArray[117] = "\tLLg4G[BEsKWcK\r%-E\u0007\u0019\u0007$'@c\u0002\u0005h-@\u001f\u0000\u0016('<";
        objectArray[118] = "LW\u0016@\r\u0002A[EGmBR\\\u0017U\b9\u0017\u0017\u0006\u0000\u0012_SG\u0001Q\\9";
        objectArray[119] = "V[Y\u000eV)QA_\u001d,qGFG\u0017@C\u0016\u0001\u001fM\u0013\u0014P@\u0018\u000e\u0014pDV^\u0019,";
        objectArray[120] = "\n~)\u0019K*U;}YNUV-9\u0000W9dp~Z\fU\n{}\u0002Yn_1<\u0002TU";
        objectArray[121] = "_m!\u001be4\u001f);\\{]\u000fTp\u0000&'X,8\u000f&&f";
        objectArray[122] = "\b[\u0010\u007f\u0000WRT\u0019:\u0013+T\t\u0000f\u0004Gf]F>[\u00171]Bj\u001aPN\u0002\u0007>ZU1";
        objectArray[123] = "\u001f\u001c*I%#[Xu\u0003\u0019d\u0004DMExoXZ,\u0001d}\u0017\"0Yi\"\u001dCtE{me";
        objectArray[124] = "V\u001cK\u001fI\u001d\u0004\u0012B\u000b6\u0002<\u001b\n]P\u001fXI\u0000\\Z\u001a<\u0018B\rO\u0002W\\\u0001\u001dWf";
        objectArray[125] = "Ev\u001f9/B@qL(\u0017^Q2\u00131{l\u0007wOi);\u0005p\u001f/lDZ5Koi;";
        objectArray[126] = "\u0007\u0013Mp\u000e\u0011\u0005\u0000\rzr\u0004\u001b\u0007=,\u0011S\rUEd\u001eS\fk\u0007l\u0002\u001f\u0019\u000eLy\u0011\u0010w";
        objectArray[127] = "i1A+C\u00009z\u001bu \u001fj7KrL->s\u0011+\u001cz{qTdJ\u001f6$Ph ";
        objectArray[128] = "8s'\nh+.%4GX,:a=\\4\u001em#g\u0003dI4w0V#8*mdGX";
        objectArray[129] = "D\u001eU\u007f;\u000b\u0000NR.um\u0016HM')\u0006\u0001/\u0010*$\u0013G@B,>\u0011\u0005/\u0013 z\u0017CW[/z\u0016}";
        objectArray[130] = "S\u001eM\u0017\u0013%\t\u0012I\u001a/y\u0005\u0005\u0010\fCKRHIT\u0010\u001cT\u0002MW\u001fnYGM\u0015/";
        objectArray[131] = "b(;6j.ana-\u0015'^k8<s*e:23$M";
        objectArray[132] = "efP6u57hY\"\n\"\u000fa\u0011tl7k3\u001buf2\u000fb\u001b9x j)\u000e*wN";
        objectArray[133] = "\u0014sY\u0005\u0015@O#Z\u001dzJJ.F\u000b-\u001d\u0015s\u001dgDMT<B\u0002JJG>";
        objectArray[134] = "q4\\d\n\u000f6$Qv\u001bt24]r\u0005\u0019Hc[+\u0001J0+T+\u0000tr#Hg\u0015\u001196[h{";
        objectArray[135] = "YR>Q0EN\u0014*_JQHR'J&c\u001c\u0013|\u001dt4_TxSrPKB>DJH\u001fQ6G/\u0005JU:-";
        objectArray[136] = "URwP\u001dCC\u0004d\u001d-DW@m\u0006Av\u0000\u0003=\\\u0017!YV`\fVPGL4\u001d-\u001b@L\u007f\u000fHPU_pa";
        objectArray[137] = "\u001dO0\u0000tbOA9\u0014\u000bpw\u001clDse\u0017\u001b{@`\u0019\u001a\u001c:\u0007wy\u001d\u000b>\u0014\u000b";
        objectArray[138] = "chUd$\u00173#\u000f:G\b`n_=+:4*\u0005d\u007fmq(@+-\b<}D'G";
        objectArray[139] = "l\u0006@~l%{\u000eY&V%l\u0007F\u0018l ?\r\u0004`$/?\f:";
        objectArray[140] = "IM\u0017~\u0006iJU@q\n\u0007\u0015YZ\u007f\u0013k'\u000e\u001d'E<p\r_g\u0012|N\tGv\u0011vp\u000e\\o\u0006i\u0015EI|\t\u0007";
        objectArray[141] = "UuNf\u0018C\u001c7P\"L*\u0003\u000f\u0013)OL\u0015kA#NF\u0010\u000f\u0010a\u001fS\bdT\"\u000fKl";
        objectArray[142] = "\u001a\u001dE6mkX\u0007N\"/\u0010M\u001bC=zG\u001aA\u0013a\u0016mB\n\u0013!w)^\u0018\\";
        objectArray[143] = "9\u001f\u0003-!\u0001w\u0017\r8E\u0016o\u0000\u001c#\u001e\u0016u|_?!\nx\u0007\u0018/,\u0018i|";
        objectArray[144] = "\"\u0011/z(e%\u000b)iR=3\f1c>\u000fbKi9bX#\u0011!9*9g\r3vR";
        objectArray[145] = "\"\u00199\u0019`xt\u0018yE}Ez\u00015!k!f\nI\u00038:j\r,Nm>fg";
        objectArray[146] = "\u001f?\u0000&\b+Cj\bin8\u001c>\u000689lLk\\dn9\f/\f5\b'\u0019l\u001c";
        objectArray[147] = ")|YUcYmu[V\u001a\f;j`L \u001c'|\u0005\u0001u\u0018+\u0016ZJj\u00118s\u0011_y\u001eV";
        objectArray[148] = "{_{\u001cbp9Ep\b \u000b'Ul\u0013~g\u0015\u0002,B$7B\u0001hO'6s\u0003mCc6B\u0001w\u0018vp9Cm\u0013b2B";
        objectArray[149] = "=\ng\u0015VNo\u0004n\u0001)\\W\r&WOL3_,VEIW\u000e,\u001a[[2E9\tT5";
        objectArray[150] = ",K1Cq;dO6Z%Xp\u001b4J}4BMy\u0015+c\u0015OxI`2qI1J`i\u0015LpGc<~\b3W{X";
        objectArray[151] = "aU\u001bjf\"fM\u0003&gC7Z\u001f\u001bd fM]c,/fLc";
        objectArray[152] = "+5\u0014dX%tp@$]Zwf\u0004}D6E0G'\u0018`\u0012e\u0002w\u001d9h5I-CZ+0@\u007fJa~z\u0001\u007fGZ";
        objectArray[153] = "Fx\u001ef26P.\r+\u00021Dj\u00040n\u0003\u0013(^m?T\u0013l\u0014%l1Xy\u0007*\u0002";
        objectArray[154] = "aA\u0011\u0018\u0011B:\u0011\u0012\u0000~H?\u001c\u000e\u0016)\u001faKVz\u0007\u001e2\u001eR\u0003\u0002\u0019a\u000f";
        objectArray[155] = "EhGz\u000fp\u0017fNnpn/o\u00068\u0016rK=\f9\u001cw/lNh\toD(\rx\u0011\u000b";
        objectArray[156] = "\u001e:+TJfA>v\u0014T\u0006[6N\u0001W\u0006\u001e8u\u0012\u0011iL>o\u0010S\u0006";
        objectArray[157] = "?4F,?\u00028.@?EZ.)X5)hzo\u0006ly?zn\u00000,\u0004/$A0!??oG#/Zr:C/ECy*I8 \u000e,.ER\u007f\u0007.,\\9;D>48";
        objectArray[158] = "eT\u0014mzR7Z\u001dy\u0005@\u000fSU/cPk\u0001_.iU\u000f\u001a]bcUs\u0018N\"i)";
        objectArray[159] = "2\\yY#<u\r/Aq\u0002n]:G(n\\\u000b{\u001c~;\u000bP$\u001b$24S!\u0016=\u00022]%H\u007fbz@7\u001f4\u0002w\n9V%g:_=ZO";
        objectArray[160] = "\"(z\u000e*^l t\u001bN\\o7\u001fK-\u001ahug\u0003\"\u001aiK%\u0012p^,3m\u001dp_\u0012q|O4\u001aj9sO5$";
        objectArray[161] = "\u001fkfJ>X\b-rDDL\u000ek\u007fQ(~Z)#\rz)\u001evo\u000b<HZj}DDT\u0002g\"N%\u0010\u001eum69H\u0013*gW}T\u0001e\u001fK%Y^o~\u000f9K\u0011\u0017";
        objectArray[162] = "(\t\u0015Sy.?\u0001\f\u000bC(,\u0003)X34EB\u0015E1& \t\u0000V>H";
        objectArray[163] = "\u0011UA;Q^_]O.5OFPX-TBZuI55\u001eB\b^zMVM\b_D\u000f^QDJ!DKBK$";
        objectArray[164] = "\u0005\u000b4K**ZN`\u000b/UYX$R69k\fi\bam<\ff^(.CS#\nh+<IbM ?Y\u00047I,U\u0005\u0004$\u000e.3AT#_`U";
        objectArray[165] = "\u000eFz{-O\u000eTrtVHDaf|*X?\u0016yt$GZ]lg+)";
        objectArray[166] = "/5X>\u0016-)b\u00028uuC6Jd\u0013e'd@e\u0019`C?Y<\nx9qQ2\u001f\u001c";
        objectArray[167] = "Dk\u001b\u0006/\u0006S-\u000f\bU\u0012Uk\u0002\u001d9 \u0001*YEiwEv\u0012G-\u0016\u0001j\u0000\bU\rB(\u001cB1\u0019Tn\u000bz";
        objectArray[168] = "K$HQp{NfQ\\9\u0011\u0017uDXe}%#\b\u00023-r!\u0005Akz\u0011i\u0001Fr.r";
        objectArray[169] = "\b]\u000f:*aQ\u001f\b!Ua7M\u0019!7!\\\u0019\u0004 ";
        objectArray[170] = "t3%\u0019\u0004=:;+\f`, =)\u001c`}|=9\u0002\u000b9?-!f";
        objectArray[171] = "jUIN\t`:\u001e\u0013\u0010j\u007fiSC\u0017\u0006M=\u0017\u0019NQ\u001ax\u0015\\\u0001\u0000\u007f5@X\rj";
        objectArray[172] = "s9\u0013q(870\u0011rQya/*hk}}9O%>yqS\u0010,<{h8To,c\f";
        objectArray[173] = "a\u0004=\u0000hp=X=\u00015\u001b1a\u007fL6}!\u0005-F7w$a)Rq*h\u0003?\u0004bgX";
        objectArray[174] = "\u001e<Yp@WW4G'\\1Bi]}Z]p?\u0019$\u0003\n'5KdBJA5YlM1\u001e<Yp@WW4G'\\1";
        objectArray[175] = "\u0013\u001cs\u0003Gy\u0010\u001f{\r\u0018\tO\u0010l\r\u0019e}F!UF7*D+U\u001c`\u0011\u0011a\u0014\u001cm*\u001drQ\u00159\u0015\u001ew\\\f\t";
        objectArray[176] = "\u0013VMN/l\u0013\u000e\u001a\u001f2VOY\u000fG%:}\bK\u001dyn*\r\u0011_3nK\n\tG\u007fo*";
        objectArray[177] = "\u000bR\u0004]E@HQ\n\rK'W[\u0016SOKe\rQ\n\u0010\u001f2JPLYMW\u0007\u0005HU'N\f\u0015BBB\u0003Y\u0011N(";
        objectArray[178] = "i>OfyA\u007fh\\+IFk,U0%t<n\u000fnt#<*E%'Fw?V*I";
        objectArray[179] = "\u0000>3n1:Dn4?\u007f\\Wk&.\u000b5A\u000fv6*!V5~\"'c\u0007\u000fvc2`Fi2351\b\u000f";
        objectArray[180] = "\u0010k|\u001azFT/#PF\u001f\u000b3\u001b\u0017|\u0005\u001b?~Z)\u0001\u0017UgQ9\u000b\u00000*\u0004=\u0007j)!\u00147\u0010\u000fdt\u0010;z";
        objectArray[181] = "Rv8\u001dH=\r3l]MB\u0005)9\u0000_\u0015Zqd]3>Q7%\u000eVs\u00043)";
        objectArray[182] = "\u0014a_\u0006BxZiQ\u0013&mI~}\u0003joJkG\u001dZ\u0002\u001ea\u0004\u0003\u0018zVn\u0004\u0002&8G<@G^pH<Ay\u001ca\u001ax\u0004\u0001Tn\u001ay:";
        objectArray[183] = "x\u0015\u001dy6@q\u0012\u001d?P\u001f|\u0012\u0005,,\u0019z\u007f\u00124*\u0018:\u0019\u0005<3@\u0000";
        objectArray[184] = "0\u0010 H9\u0007oUt\b<xgO!U./8\u0017|\tB\u00043Q=['IfU1";
        objectArray[185] = ")(;O@\u007fm;.\u0005Y\ru/)U_aGyh\r\u0000=\u0010\"7\tS=/!2\u0004J\rlx*DRh!-.H8";
        objectArray[186] = "YBt\\n]\u001d\u0006+\u0016R\u0004J\f\u0013Qh\u001eR\u0016v\u001c=\u001a^|o\u0017-\u0010I\u0019\"B)\u001c#\u0000)R#\u000bFM|V/a";
        objectArray[187] = ".l:%\u0000!a~!9b(={ /\u000e\u001ai?ypYM,=?9\b(ah;5b1jx1\"\u0007|?|=H\u001ew/v*-S\"+z@6\t7=e,y\u001b,!\u0007";
        objectArray[188] = "{hmF {+#7\u0018Cdxng\u001f/V,*?Ix\u0001g(g\u0018*n.cx\u0019Coox9\u001b9?$\"gx";
        objectArray[189] = "\u0000RKI\u0003hD\u0016\u0014\u0003?.\u001d\u0011JT?.\u0000SR\u0000[:\u0016\u0015E8Cn\u0005\u001dF]\u000e;\u0001\u0011,";
        objectArray[190] = "J\u007fh[\nFG:h\u0019:Q\u001bx5\u0000VcO>e\\\u00004Gn,\u0018ARG|$\u0017:";
        objectArray[191] = "\u001b\"5\u0007mp\u0013ul\u001bm\u001bZq-\u001b8_E~8`dq[g,\u0006dcShWYn#@ql\f$b@|W";
        objectArray[192] = "\u00028E\u0007H@E(H\u0015Y;Z)L\fPG\\/!\u001bHA]oG\f@X\u0005U";
        objectArray[193] = "kvU\u0001[\u0017uc\u0016\u0011:\u0014i{I\bV&=9\u0016Q\nqkiS^\n\u0013}?@\u0013:\u0011f;B_\u0005\u0012c6[o\u0000\u000btuG\nK\u001egz)";
        objectArray[194] = "+\u0002\u0012\u001aw$l\u0012\u001f\bf_i\u0013\f\u0006o:\u0012VG\u0017: t\u0012\u0017\u0010kn\u0012";
        objectArray[195] = "f\u00179\u0017Vhc\u0010j\u0006ntrS5\u001f\u0002F \u0014hCn('W8\u0005\ba/Io\u0019n+e_'\u0016\u000b`pL(xT)rV1\u0013\u0010jbNU";
        objectArray[196] = "]\u0014\u001a_\u0002r\u000f\u001a\u0013K}j7\u0013[\u001d\u001bpSAQ\u001c\u0011u7\u0010\u0013M\u0004m\\TP]\u001c\t";
        objectArray[197] = "\u0013>P'\u00118\u0013,X(j\"E\u000fU\"\u000b8MT\u00182\u0013!Y2\u0018 \u001b.\"";
        objectArray[198] = "&&+*Upbbt`i';cL&\b<a`-b\u0014..\u00181:\u0019q$yu&\u000b>\\";
        objectArray[199] = "\r\u001b\u0017f\u001a\u0017WG]p{\u000fkN\u001c!\u001d\u001f\u000f\u001c\u0016 \u0017\u001ak\u0010\u0005-\u0006\n\u0019\u001b\u001d\"Jf";
        objectArray[200] = "1\u000e\u0000/z>xE\u001f.\u0013/*P\u001d\"hQ1W\u0004\"ri;]\u000f%\u0013";
        objectArray[201] = "@4\u0001\u0011\u0010\u000e\u001f,\u0002@\u0011r\u0018+\u0006UB\u000e\u001e-kBZ\b\u001fm\rUR\u0011GW";
        objectArray[202] = "I\u00144o\b@\u0002\u000b6*\u000f,\b\u0006r\u0014JON\u00010l\u0002@N\u0000\u000e.\u0013\u0012\nEvf\u001c\u0012\u000b{4wNVN\u0003|xNWp";
        objectArray[203] = "@\u007f'bK9\u000ew)w/\"\u000bQ'eS2p&8m]-\u0015m-~RC";
        objectArray[204] = "\r@s9U3\u0003G`;53^Ul!Y\u0001\u0003\u00154|5*\tV},Pg\\RqFIlLXf#\u00049HT\f\u007f\u0004fVM64M/\bU\f|O&AGi7Z5N)5yY/PUovPjC)";
        objectArray[205] = "8Ed\u0004n\u0005jKm\u0010\u0011\u0014RB%Fw\u00076\u0010/G}\u0002R\u0019$\u0017m\u001ei\u0014(Dj~";
        objectArray[206] = "\u001eY\u0004{\tV\u0017\u0019\u0005%\u000b:N'\u0001h\f\\^CSb\rV['\u0001a\u0000[UI\u0002yWTY'";
        objectArray[207] = "R'b\u0011Ru\u001a(b\u0010l`\u001195\u000f\u0017\rR'b\u0011Ru\u001a(b\u0010l7\u00124.\u0005\t|\u0007'!k";
        objectArray[208] = "(JSI\u001a@&M@Kz@{_LQ\u0016r&\u0018\u0016\u000ezKlI\u0012U\u0000\u001b'\u0013L6\u0015Kl\u0012\u001cT\u0003\u001d\u007f_,";
        objectArray[209] = "\u0015\u0011\u0014Lv'\u0016\u0012\u001cB)WB\u0011\u001aF#\u0000\u0017MN\u001etW\u0015\u0011\u0014Lv'\u0016\u0012\u001cB)";
        objectArray[210] = "Xh7\u0000: \u000447\u0001gK\b\ruLd-\u0018i'Fe'\u001d\r\"F3u\u0002wr\ri+a";
        objectArray[211] = "YXS\u0001sQ\u0003WZD`-\u0005\nC\u0018wA7^\u0001C-\u001c`\u001b\u0005\u0007aG\u0005VP\u0003m-\u001c]@\tzHQ\bD\u0005\u0010QZ\u0018N\u0012u\u001c\u000f\u001cBx)O^\u000eRB)\u0017\t_Ox";
        objectArray[212] = "ZO\u000e\u001bW:\u001e\u001f\tJ\u0019\\\r\u0019\bjA7\u0003~K\u0017K&\t\u001aM^H&R~H\u001fE%\u0007\u0015\f\\U=c";
        objectArray[213] = "G#JF\u000e\u0004\u0017<\b\u0013Lm\u0017_K\\A\u000b\u0007;\u0019V@\u0001\u0002_HV\f\u001f\u0010:\u0003C\u001f\u0010~";
        objectArray[214] = "\u000eL4u\n%Q\u000f;`\u0000XX]9AS<J]E%YfM\u000e=mVfL0";
        objectArray[215] = "\u007f?\u0010a>,-1\u0019uA:\u00158Q#'.qj[\"-+\u0015;[n39ppN}<W";
        objectArray[216] = "w\b[\u001fE\u001f(M\u000f_@`+[K\u0006Y\f\u0019\u0006\f]\u0007`2\fH\u0017T\u0005\u007fYL\u001b>\u001ctIF\f[Q!MJf\u0007[vT^]R\u00117TSf";
        objectArray[217] = "\u0007c]m^z\u0000y[~$\"\u0016~CtH\u0010G9\u001b/\u0014G\u00078\\bN\"JmXn$;A}RyAv\u0014y^\u0013";
        objectArray[218] = "(.1fE'z 8r:6B)p$\\%&{z%V B`xi\\ >bk)V\\";
        objectArray[219] = "Yl\u0019\u0012-\b\\z\t\u0014\"v\tn\u001e%&\u0012`;\u0011\u0006|M\u001cd\t\u0005-L`8\b\u001c0\u0018\u0005s\u001d\u000f?v";
        objectArray[220] = "\u0002\t6|\u0018\u001a\u000f\u0005e{x@\u001c\u0015 i\u0004F\u001ax7q\u0002GZ\u001e y\u001b\u001f`";
        objectArray[221] = "Y3xP\t\u007f\u0006pwE\u0003\u0002\u000f\"uyTs`uj\u0004C<\u0018=e\u0004B\u0002";
        objectArray[222] = "0i\u0011_\u001a9l<\u0019\u0010|*3h\u0017A+~c=M\u001c|+<\u007fB\u001d\u001e=jl\u000f";
        objectArray[223] = "V=$&\u0002\u0003\u0011-)4\u0013x\u0006<,WI\u001bQ*~/\u0001\u0014Q+@m\t\b\u001d>%&\u001c\u001b\u0012P";
        objectArray[224] = ",\u001dUMO-gT\u001c\u0013W\u0017{M\bLG@,\u0016Z\u0019\u0017\u0017,\u001dUMO-gT\u001c\u0013W";
        objectArray[225] = "i\u001b\u0004\u0019<w+\u0001\u000f\r~\f>\u001d\u0002\u0012+[iGRLGq1\fR\u000e&5-\u001e\u001d";
        objectArray[226] = "yUEANn2TQS\u0016\u0003-@TD\u0004G!^P8\u0017r,YL\u0003\u001a~\u007f^,";
        Object[] objectArray2 = objectArray;
        objectArray[227] = "/i~`oa}gwt\u0010tEn?\"vc!<5#|fEm5obt & |m\u001a";
    }

    private void l(Object[] objectArray) {
        CallSite callSite;
        long l = (Long)objectArray[0];
        long l2 = l = fg_0.l ^ l;
        long l3 = l2 ^ 0x15A15C69AF5CL;
        long l4 = l2 ^ 0x1D81126C64B7L;
        try {
            callSite = fg_0.h("M", (Object)fg_0.h("B", (String)((Object)fg_0.h("B", (Object)this.c, (long)-9084597945303623669L, (long)l)), (long)-9096703156077706486L, (long)l), (long)-9089239962262944307L, (long)l);
        }
        catch (NumberFormatException numberFormatException) {
            this.i = 0;
            fg_0.h("B", (Object)this.e, (long)-9089983459387196270L, (long)l);
            this.g = null;
            this.h = null;
            this.j = null;
            Object[] objectArray2 = new Object[5];
            objectArray2[4] = l3;
            objectArray2[3] = x_0.ERROR;
            objectArray2[2] = (long)fg_0.d("v", (int)22513, (long)(0x6F8D248D6396BCA3L ^ l));
            objectArray2[1] = fg_0.b("o", (int)31178, (long)(0x1323C0DD91920A5BL ^ l));
            objectArray2[0] = fg_0.b("o", (int)19461, (long)(0x1ED007E21D953F97L ^ l));
            fg_0.h("B", (Object)fg_0.h("\u00a5", (long)-9090227955051773495L, (long)l), (Object)objectArray2, (long)-9085442305640207482L, (long)l);
            return;
        }
        this.f = (long)callSite;
        this.i = 1;
        this.h = null;
        this.j = null;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        fg_0.h("B", (Object)this, (Object)objectArray3, (long)-9092122715921562693L, (long)l);
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = fg_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6AA1;
        if (t[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = s[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])u.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fg", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            fg_0.t[n2] = l4;
        }
        return t[n2];
    }

    private boolean d(Object[] objectArray) {
        Object object;
        block33: {
            Map map;
            CallSite callSite;
            CallSite callSite2;
            long l;
            long l2;
            block34: {
                block31: {
                    Object object2;
                    CallSite callSite3;
                    long l3;
                    long l4;
                    block30: {
                        CallSite callSite4;
                        long l5;
                        block29: {
                            block28: {
                                CallSite callSite5;
                                block26: {
                                    block27: {
                                        int n;
                                        block24: {
                                            block25: {
                                                l2 = (Long)objectArray[0];
                                                long l6 = l2 = fg_0.l ^ l2;
                                                l5 = l6 ^ 0x22D33F6C46ECL;
                                                l4 = l6 ^ 0x537F58C23E4L;
                                                l3 = l6 ^ 0x32FBC1475AE7L;
                                                l = l6 ^ 0x308D329A8376L;
                                                callSite2 = fg_0.h("\u00ef", (Object)b, (long)8388283506694349487L, (long)l2);
                                                callSite3 = fg_0.h("M", (long)8388132703081551138L, (long)l2);
                                                try {
                                                    try {
                                                        try {
                                                            n = this.i;
                                                            if (callSite3 != null) break block24;
                                                            if (n == 0) break block25;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                                        }
                                                        callSite5 = callSite2;
                                                        if (callSite3 != null) break block26;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                                    }
                                                    if (callSite5 != null) break block27;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                                }
                                            }
                                            n = 0;
                                        }
                                        return n != 0;
                                    }
                                    callSite5 = callSite2;
                                }
                                callSite = fg_0.h("B", (Object)callSite5, (long)8381689034015343220L, (long)l2);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != this.j) break block28;
                                                    callSite4 = callSite;
                                                    if (callSite3 != null) break block29;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                                }
                                                if (fg_0.h("B", (Object)callSite4, (Object)this.h, (long)8393467421865593300L, (long)l2) == false) break block28;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                            }
                                            object2 = this.g;
                                            if (callSite3 != null) break block30;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                        }
                                        if (object2 == null) break block28;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                    }
                                    return true;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                }
                            }
                            callSite4 = callSite;
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l5;
                        objectArray2[0] = fg_0.h("B", (Object)fg_0.h("B", (Object)callSite4, (long)8388221245427674455L, (long)l2), (long)8387902507575821733L, (long)l2);
                        object2 = fg_0.h("M", (Object)objectArray2, (long)8386221375959299167L, (long)l2);
                    }
                    map = object2;
                    try {
                        block32: {
                            try {
                                try {
                                    try {
                                        if (callSite3 != null) break block31;
                                        if (map == null) break block32;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                    }
                                    object = fg_0.h("B", (Object)map, (long)8393198374920966712L, (long)l2);
                                    if (callSite3 != null) break block33;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                                }
                                if (object == false) break block34;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                            }
                        }
                        Object[] objectArray3 = new Object[5];
                        objectArray3[4] = l3;
                        objectArray3[3] = x_0.ERROR;
                        objectArray3[2] = (long)fg_0.d("v", (int)5564, (long)(0x72AAE72BADF70B54L ^ l2));
                        objectArray3[1] = fg_0.b("o", (int)22011, (long)(0x2BE969240452D3D5L ^ l2));
                        objectArray3[0] = fg_0.b("o", (int)17497, (long)(0x3AC1568C35A54271L ^ l2));
                        fg_0.h("B", (Object)fg_0.h("\u00a5", (long)8386303444549284978L, (long)l2), (Object)objectArray3, (long)8381516693384240701L, (long)l2);
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l4;
                        fg_0.h("B", (Object)this, (Object)objectArray4, (long)8381920794202854433L, (long)l2);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)8388553031580706684L, (long)l2);
                    }
                }
                return false;
            }
            this.g = map;
            this.h = callSite;
            this.j = callSite2;
            fg_0.h("B", (Object)this.e, (long)8386480336621685033L, (long)l2);
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l;
            fg_0.h("B", (Object)this, (Object)objectArray5, (long)8392857282138681694L, (long)l2);
            object = 1;
        }
        return (boolean)object;
    }

    @Override
    public void d(Object[] objectArray) {
        fg_0 fg_02;
        long l;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                long l3 = l2;
                long l4 = l3 ^ 0x148CA4297AAAL;
                l = l3 ^ 0xC3A43C93DF9L;
                CallSite callSite = fg_0.h("M", (long)3253485671467584620L, (long)l2);
                try {
                    try {
                        fg_02 = this;
                        if (callSite != null) break block4;
                        if (fg_0.h("B", (String)((Object)fg_0.h("B", (Object)fg_02.c, (long)3249400649701700862L, (long)l2)), (long)3255886711805632986L, (long)l2) == false) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)3252778925901856306L, (long)l2);
                    }
                    fg_0.h("B", (Object)fg_0.h("\u00ef", (Object)b, (long)3251863571495957612L, (long)l2), (Object)fg_0.h("M", (Object)fg_0.b("o", (int)17995, (long)(0x2818BC3344E4992EL ^ l2)), (long)3255519560051182785L, (long)l2), (boolean)false, (long)3257969631514535503L, (long)l2);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l4;
                    fg_0.h("B", (Object)this, (Object)objectArray2, (long)3250615103209246063L, (long)l2);
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)3252778925901856306L, (long)l2);
                }
            }
            fg_02 = this;
        }
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l;
        fg_0.h("B", (Object)fg_02, (Object)objectArray3, (long)3249719278250264322L, (long)l2);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == 'h' || c == '\u00a5' || c == '\u00dd') {
                field = fg_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fg_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fg_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @bP
    public void a(bt_0 bt_02) {
        Object object;
        CallSite callSite;
        long l;
        long l2;
        block21: {
            block22: {
                block19: {
                    block20: {
                        long l3 = l2 = fg_0.l ^ 0x1968B8996CAL;
                        l = l3 ^ 0x39CB58156469L;
                        long l4 = l3 ^ 0x6C0EE4EBE282L;
                        callSite = fg_0.h("M", (long)569411324697257644L, (long)l2);
                        try {
                            try {
                                try {
                                    if (fg_0.h("\u00ef", (Object)b, (long)567655718618963628L, (long)l2) == null) break block19;
                                    object = this.i;
                                    if (callSite != null) break block20;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                                }
                                if (object == 0) break block19;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l4;
                            object = fg_0.h("B", (Object)this, (Object)objectArray, (long)569488749771867534L, (long)l2);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                        }
                    }
                    try {
                        if (callSite != null) break block21;
                        if (object != 0) break block22;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                    }
                }
                return;
            }
            object = fg_0.h("\u00ef", (Object)fg_0.h("B", (Object)fg_0.h("\u00ef", (Object)b, (long)567655718618963628L, (long)l2), (long)565567053129132843L, (long)l2), (long)570682785299488923L, (long)l2);
        }
        int n = object;
        CallSite callSite2 = fg_0.h("\u00ef", (Object)fg_0.h("B", (Object)fg_0.h("\u00ef", (Object)b, (long)567655718618963628L, (long)l2), (long)565567053129132843L, (long)l2), (long)569755938606776030L, (long)l2);
        CallSite callSite3 = fg_0.h("B", (Object)((Integer)((Object)fg_0.h("B", (Object)this.d, (long)565333432509963838L, (long)l2))), (long)568098607904005680L, (long)l2);
        int n2 = 0;
        while (n2 <= callSite3) {
            block25: {
                int n3;
                block23: {
                    for (n3 = -n2 + n; n3 <= n2 + n; ++n3) {
                        try {
                            Object[] objectArray = new Object[4];
                            objectArray[3] = l;
                            objectArray[2] = (int)(callSite2 + n2 - callSite3);
                            objectArray[1] = n3;
                            objectArray[0] = bt_02;
                            fg_0.h("B", (Object)this, (Object)objectArray, (long)565848804106821855L, (long)l2);
                            if (callSite == null) {
                                if (callSite == null) continue;
                                break;
                            }
                            break block23;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                        }
                    }
                    n3 = -n2 + 1 + n;
                }
                try {
                    do {
                        try {
                            if (n3 >= n2 + n) break;
                            Object[] objectArray = new Object[4];
                            objectArray[3] = l;
                            objectArray[2] = (int)(callSite2 - n2 + callSite3 + 1);
                            objectArray[1] = n3;
                            objectArray[0] = bt_02;
                            fg_0.h("B", (Object)this, (Object)objectArray, (long)565848804106821855L, (long)l2);
                            ++n3;
                            if (callSite == null) {
                                continue;
                            }
                            break block25;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                        }
                    } while (callSite == null);
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)568709593707681010L, (long)l2);
                }
                ++n2;
            }
            if (callSite == null) continue;
        }
    }

    @bP
    public void a(aP aP2) {
        long l = fg_0.l ^ 0x2C14FB408CA5L;
        CallSite callSite = fg_0.h("M", (long)2128470992981540035L, (long)l);
        try {
            if (fg_0.h("B", (Object)fg_0.h("B", (Object)aP2, (Object)new Object[0], (long)2126370401680982884L, (long)l), (long)2130008654346737615L, (long)l) != false) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw fg_0.h("M", (Object)numberFormatException, (long)2128896260881813149L, (long)l);
        }
        try {
            if (fg_0.h("\u00ef", (Object)b, (long)2128039055859419982L, (long)l) == null) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw fg_0.h("M", (Object)numberFormatException, (long)2128896260881813149L, (long)l);
        }
        gE gE2 = new gE((class_5321)fg_0.h("B", (Object)fg_0.h("\u00ef", (Object)b, (long)2128039055859419982L, (long)l), (long)2139428160501312405L, (long)l), (long)fg_0.h("M", (Object)fg_0.h("B", (Object)aP2, (Object)new Object[0], (long)2134012906095637479L, (long)l), (long)2129971966732699134L, (long)l));
        if (fg_0.h("B", (Object)this.e, (Object)gE2, (long)2126258171641656290L, (long)l) != false) {
            CallSite callSite2 = fg_0.h("M", (Object)fg_0.h("B", (Object)aP2, (Object)new Object[0], (long)2134012906095637479L, (long)l), (long)2129083199616682935L, (long)l);
            CallSite callSite3 = fg_0.h("B", (Object)fg_0.h("B", (Object)((Map)((Object)fg_0.h("B", (Object)this.e, (Object)gE2, (long)2140085125930930172L, (long)l))), (long)2140262001531280319L, (long)l), (long)2133433159733672463L, (long)l);
            while (fg_0.h("B", (Object)callSite3, (long)2126138998336352377L, (long)l) != false) {
                Set set = (Set)((Object)fg_0.h("B", (Object)callSite3, (long)2129036854713867353L, (long)l));
                fg_0.h("B", (Object)set, (Object)callSite2, (long)2128123720153482515L, (long)l);
                if (callSite == null) continue;
            }
        }
    }

    @bP
    public void a(bJ bJ2) {
        long l = fg_0.l ^ 0x6D6C9FF6A668L;
        this.k = fg_0.h("B", (Object)bJ2, (Object)new Object[0], (long)3987930576764834464L, (long)l);
    }

    private int a(Object[] objectArray) {
        class_2919 class_29192 = (class_2919)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        l = fg_0.l ^ l;
        return (int)fg_0.h("M", (float)((fg_0.h("B", (Object)class_29192, (long)-6754574391624973340L, (long)l) - fg_0.h("B", (Object)class_29192, (long)-6754574391624973340L, (long)l)) * (float)n), (long)-6741760321262857638L, (long)l);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    private ArrayList a(Object[] objectArray) {
        class_638 class_6382 = (class_638)objectArray[0];
        class_2919 class_29192 = (class_2919)objectArray[1];
        class_2338 class_23382 = (class_2338)objectArray[2];
        c0 c02 = (c0)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = fg_0.l ^ l) ^ 0x617E879F4B7L;
        int n = c02.i;
        CallSite callSite = fg_0.h("M", (long)3260596758760197237L, (long)l);
        reference var12_10 = fg_0.h("B", (Object)class_29192, (long)3243386331511245988L, (long)l) * (float)Math.PI;
        float f = (float)n / 8.0f;
        CallSite callSite2 = fg_0.h("M", (float)(((float)n / 16.0f * 2.0f + 1.0f) / 2.0f), (long)3260257043497288140L, (long)l);
        double d = (double)fg_0.h("B", (Object)class_23382, (long)3257737194789118295L, (long)l) + fg_0.h("M", (double)((double)var12_10), (long)3243146329706656605L, (long)l) * (double)f;
        double d10 = (double)fg_0.h("B", (Object)class_23382, (long)3257737194789118295L, (long)l) - fg_0.h("M", (double)((double)var12_10), (long)3243146329706656605L, (long)l) * (double)f;
        double d11 = (double)fg_0.h("B", (Object)class_23382, (long)3259903421515646071L, (long)l) + fg_0.h("M", (double)((double)var12_10), (long)3255732959353362375L, (long)l) * (double)f;
        double d12 = (double)fg_0.h("B", (Object)class_23382, (long)3259903421515646071L, (long)l) - fg_0.h("M", (double)((double)var12_10), (long)3255732959353362375L, (long)l) * (double)f;
        double d13 = (double)(fg_0.h("B", (Object)class_23382, (long)3242826084422486412L, (long)l) + fg_0.h("B", (Object)class_29192, (int)3, (long)3254211649967556583L, (long)l) - 2);
        double d14 = (double)(fg_0.h("B", (Object)class_23382, (long)3242826084422486412L, (long)l) + fg_0.h("B", (Object)class_29192, (int)3, (long)3254211649967556583L, (long)l) - 2);
        reference var27_19 = fg_0.h("B", (Object)class_23382, (long)3257737194789118295L, (long)l) - fg_0.h("M", (float)f, (long)3260257043497288140L, (long)l) - callSite2;
        reference var28_20 = fg_0.h("B", (Object)class_23382, (long)3242826084422486412L, (long)l) - 2 - callSite2;
        reference var29_21 = fg_0.h("B", (Object)class_23382, (long)3259903421515646071L, (long)l) - fg_0.h("M", (float)f, (long)3260257043497288140L, (long)l) - callSite2;
        int n2 = 2 * (fg_0.h("M", (float)f, (long)3260257043497288140L, (long)l) + callSite2);
        int n3 = 2 * (2 + callSite2);
        reference var32_24 = var27_19;
        block2: while (true) {
            void var32_25;
            reference v0 = var32_25;
            CallSite callSite3 = var27_19 + n2;
            block3: while (v0 <= callSite3) {
                for (reference var33_26 = var29_21; var33_26 <= var29_21 + n2; ++var33_26) {
                    v0 = var28_20;
                    callSite3 = fg_0.h("B", (Object)class_6382, (Object)fg_0.h("\u00a5", (long)3244458513945156866L, (long)l), (int)var32_25, (int)var33_26, (long)3243170186319473609L, (long)l);
                    if (callSite != null) continue block3;
                    try {
                        if (v0 > callSite3) continue;
                        Object[] objectArray2 = new Object[16];
                        objectArray2[15] = l2;
                        objectArray2[14] = c02;
                        objectArray2[13] = n3;
                        objectArray2[12] = n2;
                        objectArray2[11] = (int)var29_21;
                        objectArray2[10] = (int)var28_20;
                        objectArray2[9] = (int)var27_19;
                        objectArray2[8] = d14;
                        objectArray2[7] = d13;
                        objectArray2[6] = d12;
                        objectArray2[5] = d11;
                        objectArray2[4] = d10;
                        objectArray2[3] = d;
                        objectArray2[2] = n;
                        objectArray2[1] = class_29192;
                        objectArray2[0] = class_6382;
                        return fg_0.h("B", (Object)this, (Object)objectArray2, (long)3254293860009821025L, (long)l);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)3259891121028251179L, (long)l);
                    }
                }
                ++var32_25;
                if (callSite == null) continue block2;
            }
            break;
        }
        return new ArrayList();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block18: {
            class_638 class_6382 = (class_638)objectArray[0];
            class_2338 class_23382 = (class_2338)objectArray[1];
            c0 c02 = (c0)objectArray[2];
            class_2919 class_29192 = (class_2919)objectArray[3];
            long l = (Long)objectArray[4];
            long l2 = l = fg_0.l ^ l;
            long l3 = l2 ^ 0x3B8B1EB6F18FL;
            long l4 = l2 ^ 0x68FA203B6868L;
            CallSite callSite = fg_0.h("B", (Object)class_6382, (Object)class_23382, (long)28770642170921872L, (long)l);
            CallSite callSite2 = fg_0.h("B", (Object)c02.j, (long)28458676246480407L, (long)l);
            CallSite callSite3 = fg_0.h("M", (long)32366302762574136L, (long)l);
            while (fg_0.h("B", (Object)callSite2, (long)34539831367921026L, (long)l) != false) {
                block25: {
                    Object object2;
                    block23: {
                        block24: {
                            block22: {
                                Object object3;
                                block19: {
                                    block21: {
                                        block20: {
                                            class_3124.class_5876 class_58762 = (class_3124.class_5876)fg_0.h("B", (Object)callSite2, (long)31804823105388962L, (long)l);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            object = fg_0.h("B", (Object)callSite, (Object)fg_0.h("B", (Object)fg_0.h("\u00ef", (Object)class_58762, (long)28623042206091060L, (long)l), (long)32115601774867983L, (long)l), (long)31531684953974173L, (long)l);
                                                            if (callSite3 != null) break block18;
                                                            if (callSite3 != null) break block19;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                                        }
                                                        if (object) break block20;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                                    }
                                                    object3 = fg_0.h("B", (Object)fg_0.h("\u00ef", (Object)class_58762, (long)33419358243689038L, (long)l), (Object)callSite, (Object)class_29192, (long)27688866502602615L, (long)l);
                                                    if (callSite3 != null) break block19;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                                }
                                                if (object3 == 0) break block21;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                            }
                                        }
                                        object3 = 1;
                                        break block19;
                                    }
                                    object3 = 0;
                                }
                                void var16_13 = object3;
                                try {
                                    object2 = var16_13;
                                    if (callSite3 != null) break block22;
                                    if (object2 == 0) {
                                        continue;
                                    }
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                }
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l3;
                                objectArray2[1] = Float.valueOf(c02.h);
                                objectArray2[0] = class_29192;
                                object2 = fg_0.h("B", (Object)this, (Object)objectArray2, (long)29232447962444844L, (long)l);
                            }
                            try {
                                try {
                                    try {
                                        if (callSite3 != null) break block23;
                                        if (object2 != false) break block24;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                    }
                                    Object[] objectArray3 = new Object[3];
                                    objectArray3[2] = l4;
                                    objectArray3[1] = class_23382;
                                    objectArray3[0] = class_6382;
                                    object2 = fg_0.h("B", (Object)this, (Object)objectArray3, (long)30072822620367001L, (long)l);
                                    if (callSite3 != null) break block23;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                                }
                                if (object2 != 0) break block25;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)31663954367124326L, (long)l);
                            }
                        }
                        object2 = 1;
                    }
                    return (boolean)object2;
                }
                if (callSite3 == null) continue;
            }
            object = false;
        }
        return object;
    }

    public static Iterable a(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        return () -> fg_0.lambda$chunks$0(bl);
    }

    @bP
    public void a(aU aU2) {
        fg_0 fg_02;
        long l;
        long l2;
        block4: {
            block5: {
                long l3 = l2 = fg_0.l ^ 0x667668980A6AL;
                long l4 = l3 ^ 0xBEE07FA7E22L;
                l = l3 ^ 0x4FB0509B3C50L;
                CallSite callSite = fg_0.h("M", (long)-7257951615104337396L, (long)l2);
                try {
                    try {
                        fg_02 = this;
                        if (callSite != null) break block4;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        if (fg_0.h("B", (Object)fg_02, (Object)objectArray, (long)-7257730153941673682L, (long)l2) != false) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)-7258657199686416302L, (long)l2);
                    }
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)-7258657199686416302L, (long)l2);
                }
            }
            fg_02 = this;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l;
        objectArray[0] = fg_0.h("B", (Object)aU2, (Object)new Object[0], (long)-7253126028025279167L, (long)l2);
        fg_0.h("B", (Object)fg_02, (Object)objectArray, (long)-7259637615354967594L, (long)l2);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (w[n3] != null) {
            return n3;
        }
        Object object = v[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 2;
            case 1 -> 21;
            case 2 -> 53;
            case 3 -> 50;
            case 4 -> 27;
            case 5 -> 40;
            case 6 -> 46;
            case 7 -> 36;
            case 8 -> 51;
            case 9 -> 12;
            case 10 -> 28;
            case 11 -> 22;
            case 12 -> 8;
            case 13 -> 38;
            case 14 -> 5;
            case 15 -> 4;
            case 16 -> 19;
            case 17 -> 59;
            case 18 -> 25;
            case 19 -> 35;
            case 20 -> 30;
            case 21 -> 9;
            case 22 -> 10;
            case 23 -> 63;
            case 24 -> 52;
            case 25 -> 7;
            case 26 -> 24;
            case 27 -> 44;
            case 28 -> 41;
            case 29 -> 58;
            case 30 -> 17;
            case 31 -> 13;
            case 32 -> 26;
            case 33 -> 16;
            case 34 -> 62;
            case 35 -> 60;
            case 36 -> 14;
            case 37 -> 20;
            case 38 -> 55;
            case 39 -> 11;
            case 40 -> 47;
            case 41 -> 0;
            case 42 -> 42;
            case 43 -> 18;
            case 44 -> 29;
            case 45 -> 1;
            case 46 -> 3;
            case 47 -> 49;
            case 48 -> 43;
            case 49 -> 6;
            case 50 -> 45;
            case 51 -> 37;
            case 52 -> 15;
            case 53 -> 61;
            case 54 -> 56;
            case 55 -> 48;
            case 56 -> 39;
            case 57 -> 57;
            case 58 -> 31;
            case 59 -> 33;
            case 60 -> 34;
            case 61 -> 54;
            case 62 -> 23;
            default -> 32;
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
        fg_0.w[n3] = new String(cArray);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void m(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        long l3;
        long l4;
        class_2791 class_27912;
        block48: {
            fg_0 fg_02;
            block47: {
                CallSite callSite3;
                block46: {
                    class_27912 = (class_2791)objectArray[0];
                    l4 = (Long)objectArray[1];
                    long l5 = l4 = fg_0.l ^ l4;
                    l3 = l5 ^ 0x2BBF81918A29L;
                    l2 = l5 ^ 0x67AA6C0EA7EFL;
                    l = l5 ^ 0x47CCFD24512BL;
                    callSite2 = fg_0.h("\u00ef", (Object)b, (long)3898832181558616285L, (long)l4);
                    callSite = fg_0.h("M", (long)3898681444089861968L, (long)l4);
                    try {
                        callSite3 = callSite2;
                        if (callSite != null) break block46;
                        if (callSite3 == null) return;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                    }
                    callSite3 = callSite2;
                }
                try {
                    try {
                        try {
                            if (callSite3 != this.j) return;
                            fg_02 = this;
                            if (callSite != null) break block47;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                        }
                        if (!fg_02.i) return;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                    }
                    fg_02 = this;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                }
            }
            try {
                try {
                    if (fg_02.g != null && fg_0.h("B", (Object)fg_0.h("B", (Object)callSite2, (long)3901236145897652230L, (long)l4), (Object)this.h, (long)3893874765768526758L, (long)l4) != false) break block48;
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
            }
        }
        CallSite callSite4 = fg_0.h("B", (Object)class_27912, (long)3901414773612396574L, (long)l4);
        gE gE2 = new gE((class_5321)fg_0.h("B", (Object)callSite2, (long)3901236145897652230L, (long)l4), (long)fg_0.h("B", (Object)callSite4, (long)3901260749854348371L, (long)l4));
        try {
            if (fg_0.h("B", (Object)this.e, (Object)gE2, (long)3896391598819891313L, (long)l4) != false) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
        }
        HashSet hashSet = new HashSet();
        fg_0.h("B", (Object)fg_0.h("M", (Object)callSite4, (int)1, (long)3896523779994963010L, (long)l4), arg_0 -> fg_0.lambda$doMathOnChunk$2((class_638)callSite2, hashSet, arg_0), (long)3895386132406620472L, (long)l4);
        Set set = (Set)((Object)fg_0.h("B", (Object)fg_0.h("B", (Object)fg_0.h("B", hashSet, (long)3894084431353921248L, (long)l4), this::lambda$doMathOnChunk$3, (long)3897569218293893430L, (long)l4), (Object)fg_0.h("M", (long)3899317157308834986L, (long)l4), (long)3898561856775209785L, (long)l4));
        reference var17_13 = fg_0.h("\u00ef", (Object)callSite4, (long)3897701044766691687L, (long)l4) << 4;
        reference var18_14 = fg_0.h("\u00ef", (Object)callSite4, (long)3896806144569200418L, (long)l4) << 4;
        class_2919 class_29192 = new class_2919((class_5819)fg_0.h("B", (Object)fg_0.h("\u00a5", (long)3895129087210327985L, (long)l4), (long)fg_0.d("v", (int)2231, (long)(0x247ADA256192D42EL ^ l4)), (long)3896114914839936408L, (long)l4));
        CallSite callSite5 = fg_0.h("B", (Object)class_29192, (long)this.f, (int)var17_13, (int)var18_14, (long)3900511222010531573L, (long)l4);
        HashMap hashMap = new HashMap();
        CallSite callSite6 = fg_0.h("B", (Object)set, (long)3893947334209547405L, (long)l4);
        while (fg_0.h("B", (Object)callSite6, (long)3896369240653978602L, (long)l4) != false) {
            block55: {
                Object object;
                Object object2;
                HashSet hashSet2;
                c0 c02;
                block49: {
                    c02 = (c0)((Object)fg_0.h("B", (Object)callSite6, (long)3898116941162641354L, (long)l4));
                    hashSet2 = new HashSet();
                    fg_0.h("B", (Object)class_29192, (long)callSite5, (int)c02.b, (int)c02.a, (long)3899399744217816571L, (long)l4);
                    Object object3 = fg_0.h("B", (Object)c02.d, (Object)class_29192, (long)3896840496577419924L, (long)l4);
                    if (callSite != null) return;
                    for (int i = 0; i < object3; ++i) {
                        Object object4;
                        class_2338 class_23382;
                        block52: {
                            reference v13;
                            block50: {
                                try {
                                    block51: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            float f = c02.g - 1.0f;
                                                            object2 = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                                            if (callSite != null) break block49;
                                                            if (callSite != null) break block50;
                                                        }
                                                        catch (NumberFormatException numberFormatException) {
                                                            throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                                        }
                                                        if (object2 == false) break block51;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                                    }
                                                    reference v13 = fg_0.h("B", (Object)class_29192, (long)3902302879352280961L, (long)l4) - 1.0f / c02.g;
                                                    v13 = v13 == 0 ? 0 : (v13 > 0 ? 1 : -1);
                                                    if (callSite != null) break block50;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                                }
                                                if (v13 < 0) break block51;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                            }
                                            if (callSite == null) continue;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                        }
                                    }
                                    v13 = fg_0.h("B", (Object)class_29192, (int)fg_0.c("q", (int)15592, (long)(0x6BE24B295CAB8AF1L ^ l4)), (long)3894585793260428482L, (long)l4) + var17_13;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                }
                            }
                            void var28_23 = v13;
                            reference var29_24 = fg_0.h("B", (Object)class_29192, (int)fg_0.c("q", (int)24945, (long)(0x7634B8515227D76DL ^ l4)), (long)3894585793260428482L, (long)l4) + var18_14;
                            CallSite callSite7 = fg_0.h("B", (Object)c02.e, (Object)class_29192, (Object)c02.f, (long)3899554058535974013L, (long)l4);
                            class_23382 = new class_2338((int)var28_23, (int)callSite7, (int)var29_24);
                            class_5321 class_53212 = (class_5321)fg_0.h("B", (Object)fg_0.h("B", (Object)fg_0.h("B", (Object)class_27912, (int)fg_0.h("M", (int)var28_23, (long)3897384652055829593L, (long)l4), (int)fg_0.h("M", (int)callSite7, (long)3897384652055829593L, (long)l4), (int)fg_0.h("M", (int)var29_24, (long)3897384652055829593L, (long)l4), (long)3895293944835772769L, (long)l4), (long)3897347495166955610L, (long)l4), (long)3900114708863598514L, (long)l4);
                            try {
                                block53: {
                                    try {
                                        try {
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l;
                                            objectArray2[0] = class_53212;
                                            object4 = fg_0.h("B", (Object)fg_0.h("B", (Object)this, (Object)objectArray2, (long)3893782827419576133L, (long)l4), (Object)c02, (long)3900428043390264660L, (long)l4);
                                            if (callSite != null) break block52;
                                            if (object4 != false) break block53;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                        }
                                        if (callSite == null) continue;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                    }
                                }
                                object4 = c02.l;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                            }
                        }
                        try {
                            block54: {
                                try {
                                    try {
                                        if (callSite != null) continue;
                                        if (object4 == false) break block54;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                    }
                                    Object[] objectArray3 = new Object[5];
                                    objectArray3[4] = l2;
                                    objectArray3[3] = c02;
                                    objectArray3[2] = class_23382;
                                    objectArray3[1] = class_29192;
                                    objectArray3[0] = callSite2;
                                    fg_0.h("B", hashSet2, (Object)fg_0.h("B", (Object)this, (Object)objectArray3, (long)3902226578821959687L, (long)l4), (long)3894718933617198767L, (long)l4);
                                    if (callSite == null) continue;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                                }
                            }
                            Object[] objectArray4 = new Object[5];
                            objectArray4[4] = l3;
                            objectArray4[3] = c02;
                            objectArray4[2] = class_23382;
                            objectArray4[1] = class_29192;
                            objectArray4[0] = callSite2;
                            object4 = fg_0.h("B", hashSet2, (Object)fg_0.h("B", (Object)this, (Object)objectArray4, (long)3899472211585169942L, (long)l4), (long)3894718933617198767L, (long)l4);
                            continue;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                        }
                    }
                    try {
                        object = hashSet2;
                        if (callSite != null) break block55;
                        object2 = fg_0.h("B", object, (long)3900663780858132993L, (long)l4);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                    }
                }
                try {
                    if (object2 == false) {
                        object = fg_0.h("B", hashMap, (Object)c02, hashSet2, (long)3893561825134573461L, (long)l4);
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)3897976356323304718L, (long)l4);
                }
            }
            if (callSite == null) continue;
        }
        fg_0.h("B", (Object)this.e, (Object)gE2, hashMap, (long)3896189449469954789L, (long)l4);
    }

    private static Field o(long l, long l2) {
        int n = fg_0.m(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            String string = w[n];
            int n2 = string.indexOf(8);
            Class clazz = fg_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fg_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fg_0.g(clazz3, string2, clazz2)) != null) {
                    fg_0.v[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fg_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fg_0.v[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fg_0.n(260071476031108L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fg_0.m(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = w[n];
                int n3 = string2.indexOf(8);
                clazz3 = fg_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fg_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fg_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fg_0.v[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fg_0.n(260071476031108L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fg_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fg_0.v[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fg_0.n(260071476031108L, 0L);
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
        long l = (Long)objectArray[0];
        long l2 = (l = fg_0.l ^ l) ^ 0x74D365FBC104L;
        CallSite callSite = fg_0.h("M", (long)7355125957882759000L, (long)l);
        try {
            if (fg_0.h("\u00ef", (Object)b, (long)7355762878239080280L, (long)l) == null) {
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw fg_0.h("M", (Object)numberFormatException, (long)7354425329151964422L, (long)l);
        }
        CallSite callSite2 = fg_0.h("B", (Object)fg_0.h("M", (Object)new Object[]{false}, (long)7361650761392375100L, (long)l), (long)7358802036574213559L, (long)l);
        while (fg_0.h("B", (Object)callSite2, (long)7357440498283908066L, (long)l) != false) {
            class_2791 class_27912 = (class_2791)fg_0.h("B", (Object)callSite2, (long)7354565918482442178L, (long)l);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l2;
            objectArray2[0] = class_27912;
            fg_0.h("B", (Object)this, (Object)objectArray2, (long)7355694781102879874L, (long)l);
            if (callSite == null) continue;
        }
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void j(Object[] objectArray) {
        block23: {
            gE gE2;
            Map map;
            CallSite callSite;
            long l;
            long l2;
            long l3;
            bt_0 bt_02;
            block22: {
                int n;
                int n2;
                block21: {
                    class_4604 class_46042;
                    block20: {
                        bt_02 = (bt_0)objectArray[0];
                        n2 = (Integer)objectArray[1];
                        n = (Integer)objectArray[2];
                        l3 = (Long)objectArray[3];
                        long l4 = l3 = fg_0.l ^ l3;
                        l2 = l4 ^ 0x5463432F8F2DL;
                        l = l4 ^ 0x13D8C7FA7A49L;
                        callSite = fg_0.h("M", (long)-971660940003126327L, (long)l3);
                        try {
                            try {
                                class_46042 = this.k;
                                if (callSite != null) break block20;
                                if (class_46042 == null) break block21;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                            }
                            class_46042 = this.k;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                        }
                    }
                    try {
                        if (fg_0.h("B", (Object)class_46042, (Object)new class_238((double)(n2 << 4), -64.0, (double)(n << 4), (double)((n2 << 4) + fg_0.c("q", (int)24945, (long)(0x7634A9CAB9B813F4L ^ l3))), 320.0, (double)((n << 4) + fg_0.c("q", (int)24945, (long)(0x7634A9CAB9B813F4L ^ l3)))), (long)-972723425205294489L, (long)l3) == false) {
                            return;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                    }
                }
                CallSite callSite2 = fg_0.h("\u00ef", (Object)b, (long)-972075284856150972L, (long)l3);
                try {
                    if (callSite2 == null) {
                        return;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                }
                gE gE3 = new gE((class_5321)fg_0.h("B", (Object)callSite2, (long)-956196879623060321L, (long)l3), (long)fg_0.h("M", (int)n2, (int)n, (long)-966864337740222642L, (long)l3));
                try {
                    try {
                        map = this.e;
                        gE2 = gE3;
                        if (callSite != null) break block22;
                        if (fg_0.h("B", (Object)map, (Object)gE2, (long)-969450294064309016L, (long)l3) == false) break block23;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                    }
                    map = this.e;
                    gE2 = gE3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                }
            }
            Map map2 = (Map)((Object)fg_0.h("B", (Object)map, (Object)gE2, (long)-956677886148140810L, (long)l3));
            CallSite callSite3 = fg_0.h("B", (Object)fg_0.h("B", (Object)map2, (long)-972560552490286032L, (long)l3), (long)-967423019112962028L, (long)l3);
            block16: while (fg_0.h("B", (Object)callSite3, (long)-969471606454771853L, (long)l3) != false) {
                block25: {
                    Object object;
                    Map.Entry entry;
                    block24: {
                        entry = (Map.Entry)((Object)fg_0.h("B", (Object)callSite3, (long)-972226459748682925L, (long)l3));
                        try {
                            try {
                                object = this.a;
                                if (callSite != null) break block24;
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l;
                                objectArray2[0] = ((c0)((Object)fg_0.h("B", (Object)entry, (long)-967059680542173695L, (long)l3))).c;
                                if (fg_0.h("B", (Object)object, (Object)objectArray2, (long)-966479122793017908L, (long)l3) == false) break block25;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                            }
                            object = fg_0.h("B", (Object)entry, (long)-966411732220564493L, (long)l3);
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw fg_0.h("M", (Object)numberFormatException, (long)-972367074886524521L, (long)l3);
                        }
                    }
                    CallSite callSite4 = fg_0.h("B", (Object)((Set)object), (long)-967423019112962028L, (long)l3);
                    while (fg_0.h("B", (Object)callSite4, (long)-969471606454771853L, (long)l3) != false) {
                        class_243 class_2432 = (class_243)fg_0.h("B", (Object)callSite4, (long)-972226459748682925L, (long)l3);
                        Object[] objectArray3 = new Object[10];
                        objectArray3[9] = l2;
                        objectArray3[8] = ((c0)((Object)fg_0.h("B", (Object)entry, (long)-967059680542173695L, (long)l3))).k;
                        objectArray3[7] = Float.valueOf((float)(fg_0.h("\u00ef", (Object)class_2432, (long)-972604883447792197L, (long)l3) + 1.0));
                        objectArray3[6] = Float.valueOf((float)(fg_0.h("\u00ef", (Object)class_2432, (long)-955021793890505364L, (long)l3) + 1.0));
                        objectArray3[5] = Float.valueOf((float)(fg_0.h("\u00ef", (Object)class_2432, (long)-965084787180679405L, (long)l3) + 1.0));
                        objectArray3[4] = Float.valueOf((float)fg_0.h("\u00ef", (Object)class_2432, (long)-972604883447792197L, (long)l3));
                        objectArray3[3] = Float.valueOf((float)fg_0.h("\u00ef", (Object)class_2432, (long)-955021793890505364L, (long)l3));
                        objectArray3[2] = Float.valueOf((float)fg_0.h("\u00ef", (Object)class_2432, (long)-965084787180679405L, (long)l3));
                        objectArray3[1] = bt_02.a;
                        objectArray3[0] = bt_02.b;
                        fg_0.h("M", (Object)objectArray3, (long)-972666186448179646L, (long)l3);
                        if (callSite != null) continue block16;
                        if (callSite == null) continue;
                    }
                }
                if (callSite == null) continue;
            }
        }
    }

    private static void lambda$doMathOnChunk$2(class_638 class_6382, Set set, class_1923 class_19232) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block3: {
            CallSite callSite3;
            block4: {
                l = fg_0.l ^ 0x52B81C066673L;
                callSite3 = fg_0.h("B", (Object)class_6382, (int)fg_0.h("\u00ef", (Object)class_19232, (long)-625389197196586974L, (long)l), (int)fg_0.h("\u00ef", (Object)class_19232, (long)-625581230282469785L, (long)l), (Object)fg_0.h("\u00a5", (long)-628448786176286508L, (long)l), (boolean)false, (long)-626999600714366221L, (long)l);
                callSite2 = fg_0.h("M", (long)-621593799064955371L, (long)l);
                try {
                    callSite = callSite3;
                    if (callSite2 != null) break block3;
                    if (callSite != null) break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    throw fg_0.h("M", (Object)numberFormatException, (long)-622300000495180725L, (long)l);
                }
                return;
            }
            callSite = callSite3;
        }
        for (CallSite callSite4 : fg_0.h("B", (Object)callSite, (long)-620049997035293255L, (long)l)) {
            fg_0.h("B", (Object)fg_0.h("B", (Object)callSite4, (long)-624495726330970530L, (long)l), arg_0 -> fg_0.lambda$doMathOnChunk$1(set, arg_0), (long)-622924964902181345L, (long)l);
            if (callSite2 == null) continue;
        }
    }

    private Stream lambda$doMathOnChunk$3(class_5321 class_53212) {
        long l = fg_0.l ^ 0x3BD6B5DCE998L;
        long l2 = l ^ 0x6F07FFB91F85L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_53212;
        return fg_0.h("B", (Object)fg_0.h("B", (Object)this, (Object)objectArray, (long)8694012245102914027L, (long)l), (long)8685670244295522778L, (long)l);
    }

    private static void lambda$doMathOnChunk$1(Set set, class_6880 class_68802) {
        long l = fg_0.l ^ 0x389A1444201FL;
        fg_0.h("B", (Object)set, (Object)((class_5321)fg_0.h("B", (Object)fg_0.h("B", (Object)class_68802, (long)-5674813284064503949L, (long)l), (long)-5677114785618806629L, (long)l)), (long)-5682137012344619901L, (long)l);
    }

    private static Iterator lambda$chunks$0(boolean bl) {
        long l = fg_0.l ^ 0xFB2A5674DC0L;
        long l2 = l ^ 0x21130BDF06D7L;
        return new as_0(bl, l2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fg_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fg_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fg_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fg_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

