/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_243;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public class fE
extends dV {
    private dR a;
    private bW b;
    private bW c;
    private static final float d = 850.0f;
    private static final float e = 1100.0f;
    private static final float f = 14.0f;
    private float g;
    private class_243 h;
    private float i;
    private float j;
    private float k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private float p;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;
    private static final long[] u;
    private static final Integer[] v;
    private static final Map w;
    private static final long[] x;
    private static final Long[] y;
    private static final Map z;
    private static final Object[] A;
    private static final String[] B;

    public fE() {
        long l = q ^ 0x287FED3F151BL;
        this.k = 0.0f;
        this.l = (long)fE.h("y", (long)7405581471466468400L, (long)l);
        this.m = (long)fE.d("h", (int)2449, (long)(0x7EED3BA76269CE0FL ^ l));
        this.n = (long)fE.d("h", (int)2449, (long)(0x7EED3BA76269CE0FL ^ l));
        this.o = 0;
        this.p = 0.0f;
    }

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
                                fE.q = hc.a(-278115560424772664L, -4627998232979203026L, MethodHandles.lookup().lookupClass()).a(250644273415481L);
                                fE.A = new Object[106];
                                fE.B = new String[106];
                                fE.f();
                                fE.t = new HashMap<K, V>(13);
                                var22 = fE.q ^ 40214672983524L;
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
                                var31_3 = new String[4];
                                var29_4 = 0;
                                var28_5 = "B\u00f1\u001b\u00b6A\u00d5\u00ef\u00ce[d\u00a2\u00d1-\u0080r\u00a58%~\u00e2\u0018\u001b=\u00b3>%r\u00a4\u0005\u00e2\u0092\u0095\u00c7[=\u00e6M\u00b2\u0083\u0082\u00ff\u00a7S.\u009a\u00c8\f\u00b2\f\u0002F\u0083\u00896\u00cd~\u009ea\u001c$\u00a6\r\u00a6T^P\u00de\u00dbn\u001f\u0086@y";
                                var30_6 = "B\u00f1\u001b\u00b6A\u00d5\u00ef\u00ce[d\u00a2\u00d1-\u0080r\u00a58%~\u00e2\u0018\u001b=\u00b3>%r\u00a4\u0005\u00e2\u0092\u0095\u00c7[=\u00e6M\u00b2\u0083\u0082\u00ff\u00a7S.\u009a\u00c8\f\u00b2\f\u0002F\u0083\u00896\u00cd~\u009ea\u001c$\u00a6\r\u00a6T^P\u00de\u00dbn\u001f\u0086@y".length();
                                var27_7 = 16;
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
                                    var31_3[var29_4++] = fE.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "?\u00c1;7eF\u008b\u00da=\u00f87!\u00db+Df@<C\u00f6[\u0011\u009e\u00ee\u00d8\u00ba\u00ce\u0090\u00ecH\u001b4\u00f3C_5\u0097 \u0013\u0016\u009b\u0096\u0084O\u00be\u0084z\u0012\u0005\u00ad\u00f1&\u00ca%\u00d0\u00ed\u00ff\u00be\u00adv]\u0091o\u0088\u00b0j\u00c4\u0091q\u00151@\u00ae\u00f3\u00f0\u0084\u00c0\u00ca!\u00a7\u009e";
                                    var30_6 = "?\u00c1;7eF\u008b\u00da=\u00f87!\u00db+Df@<C\u00f6[\u0011\u009e\u00ee\u00d8\u00ba\u00ce\u0090\u00ecH\u001b4\u00f3C_5\u0097 \u0013\u0016\u009b\u0096\u0084O\u00be\u0084z\u0012\u0005\u00ad\u00f1&\u00ca%\u00d0\u00ed\u00ff\u00be\u00adv]\u0091o\u0088\u00b0j\u00c4\u0091q\u00151@\u00ae\u00f3\u00f0\u0084\u00c0\u00ca!\u00a7\u009e".length();
                                    var27_7 = 16;
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
                                    var31_3[var29_4++] = fE.b(var32_9).intern();
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
                        fE.r = var31_3;
                        fE.s = new String[4];
                        fE.w = new HashMap<K, V>(13);
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
                        var17_12 = new long[6];
                        var14_13 = 0;
                        var15_14 = "\u00b0eW\u00e0\u00dc\u0010D\u0014\u00b6\u00bd9\u00f9\u00fdE\u0094\u00b58\u00b8\u0086\u00d4\u00dc\u0087\u00f6;\u00e8\u00d8\u00eb\u0097\u00d9N\u0015\u0010";
                        var16_15 = "\u00b0eW\u00e0\u00dc\u0010D\u0014\u00b6\u00bd9\u00f9\u00fdE\u0094\u00b58\u00b8\u0086\u00d4\u00dc\u0087\u00f6;\u00e8\u00d8\u00eb\u0097\u00d9N\u0015\u0010".length();
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
                            var15_14 = "\u00d3\u00dfz\u00d4\u00f28\u00a4\"T\u00a1\u00f0\u009a\u0013\u008c\u0018\u00fd";
                            var16_15 = "\u00d3\u00dfz\u00d4\u00f28\u00a4\"T\u00a1\u00f0\u009a\u0013\u008c\u0018\u00fd".length();
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
                fE.u = var17_12;
                fE.v = new Integer[6];
                fE.z = new HashMap<K, V>(13);
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
                var4_24 = "\u00c5\u00f4\u00e7K\u00ec\u00ac\u0092\u0082\u00eeaW(\u00deL\u001a\u00a3h\u00e7\u00ee5\u0080\u00f9\u00b9]";
                var5_25 = "\u00c5\u00f4\u00e7K\u00ec\u00ac\u0092\u0082\u00eeaW(\u00deL\u001a\u00a3h\u00e7\u00ee5\u0080\u00f9\u00b9]".length();
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
        fE.x = var6_22;
        fE.y = new Long[3];
    }

    private float e(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        return f + f11 * (f10 - f);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fE.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E71;
        if (s[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])t.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fE", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = r[n2].getBytes("ISO-8859-1");
            fE.s[n2] = fE.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static float b(Object[] objectArray) {
        Object object = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = (l = q ^ l) ^ 0x7E0394C8BA06L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(object);
        object = fE.h("y", (Object)objectArray2, (long)5364154904988595613L, (long)l);
        return object * object * object * (object * (object * 6.0f - 15.0f) + 10.0f);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fE.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x18D2;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = u[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])w.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fE.v[n2] = n3;
        }
        return v[n2];
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
                    l = q ^ l;
                    callSite = fE.h("y", (long)-8953572543835507851L, (long)l);
                    try {
                        try {
                            float f12 = f11 - 0.0f;
                            f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (callSite != null) break block6;
                            if (f10 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fE.h("y", (Object)matchException, (long)-8955102453055414802L, (long)l);
                        }
                        f = 0.0f;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw fE.h("y", (Object)matchException, (long)-8955102453055414802L, (long)l);
                    }
                }
                try {
                    f = f11;
                    if (callSite != null) break block8;
                    float f13 = f - 1.0f;
                    f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fE.h("y", (Object)matchException, (long)-8955102453055414802L, (long)l);
                }
            }
            f = f10 > 0 ? 1.0f : f11;
        }
        return f;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fE.m(l, l2);
            object = A[n];
            try {
                if (!(object instanceof String)) break block2;
                fE.A[n] = clazz = Class.forName(B[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/fE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fE.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fE.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fE.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fE.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = A;
        A[0] = "O.*M\u001e8M0c5\u00114T3?P\u0010";
        objectArray[1] = Double.TYPE;
        fE.B[1] = "java/lang/Double";
        objectArray[2] = "\u001f\u001b$';\u001d\u0002\u000e|\u0005z\u0010\u001a\b";
        objectArray[3] = Integer.TYPE;
        fE.B[3] = "java/lang/Integer";
        objectArray[4] = "J52\u0017v\u0002\\57Me\u0015K~4Ki\u0001Z9#\\\"\u0013f";
        objectArray[5] = "/N\\`u;ZnWodt'vDhm=O";
        objectArray[6] = "2}c;1Q$}fa\"F36eg.R\"qrpeG\u0013";
        objectArray[7] = "\u0017{=\bX\\\u001ct,G;Q\ty#,\u000eS\u0018j?\u0000\u0019^";
        objectArray[8] = " ;nC\r:6;k\u0019\u001e-!ph\u001f\u0012907\u007f\bY)(7}\u0003\u0003d\u0014,}\u001e\u0003##;";
        objectArray[9] = "w2\u001a\u001b-.a2\u001fA>9vy\u001cG2-g>\u000bPy=Y";
        objectArray[10] = ";pM\t<q-pHS/f:;KU#r+|\\Bhe3";
        objectArray[11] = "\u0000g\u0013\u00043DuG\u0018\u000b\"\u000b\u0014I\u0013\u0000&Q`";
        objectArray[12] = Void.TYPE;
        fE.B[12] = "java/lang/Void";
        objectArray[13] = "\u001c\u0018@p\u0004\u0016\u001c\u0018W,\b\u0019\u0006SW2\b\f\u0001\"\u0000oQK";
        objectArray[14] = Float.TYPE;
        fE.B[14] = "java/lang/Float";
        objectArray[15] = "Mm\u0011E5A8M\u001aJ$\u000eYC\u0011A T-";
        objectArray[16] = "Z<4\u0015KzL<1OXm[w2ITyJ0%^\u001foa";
        objectArray[17] = "}b-_.\u0014\bB&P?[iL-[;\u0001\u001d";
        objectArray[18] = "%\u007f\u001c\u0006\u0004\u00043\u007f\u0019\\\u0017\u0013$4\u001aZ\u001b\u00075s\rMP\u0010\u000f";
        objectArray[19] = "`%6<\u0019\tk*'sz\u0004~,";
        objectArray[20] = "pF\u0007\u0004\r;pF\u0010X\u00014j\r\u0010F\u0001!m|A\u001eS";
        objectArray[21] = "?eq\u001f\u001c|={8|\u0017g\"~n\u0005\u0010";
        objectArray[22] = "\u0000J(i/%\u0016J-3<2\u0001\u0001.50&\u0010F9\"{1\t";
        objectArray[23] = "@A;h:l5a0g+#To;l/y ";
        objectArray[24] = ")`7,p\u000b?`2vc\u001c(+1po\b9l&g$\u0019\u001a";
        objectArray[25] = "c/Va>\u0012a1\u001f\u001e!\u001cx8C!=\u0012b;";
        objectArray[26] = "uNm2\u0013McNhh\u0000Zt\u0005kn\fNeB|yGYa";
        objectArray[27] = "VP|\u00012y#pw\u000e#6B~|\u0005'l6";
        objectArray[28] = "iVFV><kH\u000f)!2rAS\u0016=<hBB";
        objectArray[29] = "?\u0016U\u0011*^)\u0016PK9I>]SM5]/\u001aDZ~I\u0010";
        objectArray[30] = "x\u000f;\u0014U|\r/0\u001bD3l!;\u0010@i\u0018";
        objectArray[31] = "o`_a3\u0001y`Z; \u0016n+Y=,\u0002\u007flN*g\u0015@";
        objectArray[32] = "\u0000C\u00181!.\u000bL\t~@ \u0000G\r$";
        objectArray[33] = "f\u001e\n.\u0013um\u0011\u001ban`\u007f\u000b\u0019\"";
        objectArray[34] = Long.TYPE;
        fE.B[34] = "java/lang/Long";
        objectArray[35] = "xjB],\u0005\rJIR=JlDBY9\u0010\u0018";
        objectArray[36] = "\u0000\u0013<\u001f\u0010Ou37\u0010\u0001\u0000\u0014=<\u001b\u0005Z`";
        objectArray[37] = "DrR}u!DrE!y.^9E?y;YH\u0017e-\u007f";
        objectArray[38] = "\\i\u0019\rm\u0018Ji\u001cW~\u000f]\"\u001fQr\u001bLe\bF9\u000e\b";
        objectArray[39] = "\\\u001dh \u0010S)=c/\u0001\u001cH3h$\u0005F<";
        objectArray[40] = "b&HS\u0004\fi)Y\u001cy\u0014z.PU";
        objectArray[41] = "#}_\u000bi=V]T\u0004xr7S_\u000f|(C";
        objectArray[42] = "\rm.wn\b\u001bm+-}\u001f\f&(+q\u000b\u001da?<:\u001c+";
        objectArray[43] = "gt!g;A\u0012T*h*\u000esZ!c.T\u0007";
        objectArray[44] = ")xO\u0017Z&?xJMI1(3IKE%9t^\\\u000e5u";
        objectArray[45] = "\u0005F`j\u0005/pfke\u0014`\u0011h`n\u0010:e";
        objectArray[46] = "w3H\na1\u0002\u0013C\u0005p~c\u001dH\u000et$\u0017";
        objectArray[47] = "/xt\u000eD\"ZX\u007f\u0001Um;Vt\nQ7O";
        objectArray[48] = Boolean.TYPE;
        fE.B[48] = "java/lang/Boolean";
        objectArray[49] = "('&! g]\u0007-.1(<\t&%5rH";
        objectArray[50] = "<E+\u0016\u0019p|J1\u0018'/hY\u0007\u000eJ-c%rKF/b\u001b+\u000e\u001d%\u0005";
        objectArray[51] = "O6p|Lc\t3u}*1q3'vUcH|! P";
        objectArray[52] = "D@M\u000e&#KM\u0015Z\u001e{{]@T#e\u0001P\u0010Ne\u001cKC\u0001\u0003}-\u001cQ\u000fA\u001e";
        objectArray[53] = "\u001e'%jU}I,614}B;84XO\u0016vci\u0005\u0018Fx5>NzU\"4h4";
        objectArray[54] = "hUU)\u001a|aECX\u0017\u00074LW6\u000bi3H\n%";
        objectArray[55] = "\u0013\u00019\u0015i\u0004\u0015\u001feOQ\u000e/\n8El\u001bU\u0007h_*bFDdB+\u0000U\u001ee\u0014Q";
        objectArray[56] = "RW\u00056\n\u0004AT\u0004ys\u0016(\u001eU.N\u0006R\u0013\u00054\b\u007fQQ\u0018\"B\u0005Z\u0014_'s";
        objectArray[57] = "w\u007fYH\u001fE!%\u0003Bm\u0010{#\f_:G!sQ3T\u0015w \u0004]S\u0011*3";
        objectArray[58] = "g\u0016\\QD4c\u001e[I%:p\u0007\\XA/v\u0003:J\u001a+g\u0014XY@*1nS\u001cH+p\f@FI}\n\u0007\u0005NH<h\u0014_O\u001eFg\u0016\\QD4c\u001e[I%";
        objectArray[59] = "'x\u007fF\u0002D&#?SrU[l4POE!adJ\t<2\"hW\b^!xi\u0001r";
        objectArray[60] = "},\u0011O#DbtBX\u001cW\u00139\u0019W!Gi4IMg>|/\u0018\\\"Yq%EZ\u001c";
        objectArray[61] = ".\u001c+a\u001ce(\u0013*zyy\"\u0012|o\u0018d?\u007fzpHj+\u0002|\u007fIqN";
        objectArray[62] = "T{=\rT$_>z\be;@9!\f\t\t\u0017~zRZ^\u0014.,\u0005\t0\u0013*q\u0016e";
        objectArray[63] = "v[1SEJ(R7Q%X\u0017G\u007fU\u0018HmJ/O^1rD!NXJ{T7?";
        objectArray[64] = "$\u0005\u0004\"^\u0000d\n\u001e,`Zg\u0004\b \u001c]ge^ \u0003R#U\u001e/\u0019\\\u001d";
        objectArray[65] = "A\u0005E\u001fF4G\u001b\u0019E~1}\u000eDOC+\u0007\u0003\u0014U\u0005RM\u0010\u0005\u0018\u001dc\u001a\u0002\u000bZ~";
        objectArray[66] = "w\u0001Wq\u001ctq\u001f\u000b+${K\nV!\u0019k1\u0007\u0006;_\u0012r\u001b\u0004)\u001a\"2\u0014\u001e'$";
        objectArray[67] = "\u001a.^\u0016GR\\+[\u0017!\n$oZFS\u0015_|YG\u001c";
        objectArray[68] = "\u000f\u0019H=|u\t\u0007\u0014gD~3\u0012ImyjI\u001f\u0019w?\u0013Z\\\u0015j>qI\u0006\u0014<D";
        objectArray[69] = "\u0011\u0001n5$4Q\u000et;\u001akE\u001dW\u0018P\u0004\u0012^l8}:K\u001b72\u001a";
        objectArray[70] = "Mx2\u001f1:Dh$n>A\u0011a0\u0000 /\u0016em\u0013";
        objectArray[71] = "\u001c/ p<HS)vu\u0002\u0018\"5*e?\bX8z\u007fyqH{\u007fco\u0012\u001f=}\u007f\u0002";
        objectArray[72] = "cfuG\u001e\bh#2B/\u0017w$iFC% c2\u001b\u0016r#3dOC\u001c$79\\/";
        objectArray[73] = "zT=QjC$Q3\b\rR\u001eI,Ss\u0001|\u0014rEw;";
        objectArray[74] = "\u0003M\u001ap\u0007\u0006U\nF`c\u0007\u000ePw2\b\u0011\u0001Z\u00195\fL\u00126N`\u000e\u0012\u0003XIdS\u0001o";
        objectArray[75] = "\u007fWMGi\u0005{K\u0007S\u0016\u0003dCMGp\u0014EXRGS\t}]VQ\u0016\u000ecS\t\u0010,\u000fh\u0000\u000e*";
        objectArray[76] = " \u00170T\u0017Vf\u0014gZnV#\u00133L\u0015;?\u0000=VTYb^+RnK+Q H\u000bGc\u000b'(";
        objectArray[77] = "\u0012+\f\u0012F;\u001b;\u001acJ@N2\u000e\rW.I6S\u001e";
        objectArray[78] = "MW\u0002AU\u0013\u000b\u0007L\u001f<Iv\u0001\n\u0012\u0002\u0012\t@L\\V#";
        objectArray[79] = ",B/A'|*\\s\u001b\u001fp\u0010I.\u0011\"cjD~\u000bd\u001ay\u0007r\u0016exj]s@\u001f";
        objectArray[80] = "\u0013_\u0015\u001a\u001e[\u0015AI@&T/\u0019WA@BV\\B\u0019W=\u0013WDFYDVB\u001cQ&";
        objectArray[81] = "&gd\u001dL0fh~\u0013ror{]\u0012\u001e\u0000%8f\u0010\u0015>|}=\u001ar";
        objectArray[82] = ";\"\u0005Unz=<Y\u000fV~\u0007)\u0004\u0005ke}$T\u001f-\u001c77ER5-`%K\u0010V";
        objectArray[83] = "k#G@L\u0012`f\u0000E}\r\u007fa[A\u0011?+\"\u0005\u0016Gh{\"VK\u0007\nhxW\u001d}";
        objectArray[84] = "o<8$E\u001287+\u007f$\u00123 %zH gm~&\u001cw7c(p^\u0015$9)&$";
        objectArray[85] = "bT\u001bTy>4\u0013GD\u001d)~Wv\u0016v)`C\u0018\u0011rts/ODp*bAH@-9\u000e";
        objectArray[86] = "d-A.+\u001e3kC2F\u0017\u000ec\u0014({\u0004tnD2=}evA#\u007f\u0003tlAsF";
        objectArray[87] = "?#\u0010\u0001^\u0015y G\u000f'\u0018,!\u001a6@\u0014(Z@BF\u0017\"d\u0019\u0007\u001d\u001dE";
        objectArray[88] = "\u00032v\u0005O\u0014\u0005,*_w\u0019?9wUJ\u000bE4'O\frVw+R\r\u0010E-*\u0004w";
        objectArray[89] = "D\u001boYjQ\u0012\\3I\u000e@O\u001b\u0002\u001beFF\fl\u001ca\u001bU`;IcED\u000e<M>V(";
        objectArray[90] = "YH1oL;R\rvj}$M\n-n\u0011\u0016\u001aMv0MA\u0019\u001d g\u0011/\u001e\u0019}t}";
        objectArray[91] = "Wqpyg\\\u00016,i\u0003CZl\u001dk<KVp\u007fxfJ\u0000\nt=nKAhggo\u001d;c\"on\\Ypxn8&";
        objectArray[92] = "_aH\u0006\u0019eYnI\u001d|bX~\u0010\b\u0011J?kF\u0019\u0011b]x\u001c\u0018G\u0018_aH\u0006\u0019eYnI\u001d|";
        objectArray[93] = "\u000b\u001f\u0006m\u0016\u001fDY\u000e9dNuUV?Y\\\u000fX\u0006%\u001f%\u0018\u0015V.\u0016\u001eNO\f$d";
        objectArray[94] = "F#wl\u0001v\u0010d+|epM\u0002s{\u0004eL#\u001a.\u000eaD4t)\n<WX#|\bbF6$xUq*";
        objectArray[95] = "\u0012\u0005\t\u001c\u0011-\u0016\r\u000e\u0004p%\u0018\u0001\u0006\u0012\u001d_\u001d\u001e\u0013\u001f\u0000o\u0001\u0006\f\u0004p2\u0007\u001b\u001d\u000f\u00026\u000f\u001c\u0005n";
        objectArray[96] = "t\u001bj\u000bT\t\"A0\u0001&\\xG?\u001cq\u000b\"\u0017cp\u001fYtD7\u001e\u0018])W";
        objectArray[97] = "[q)r\u0006h\r6ubbjPuD0\t\u007fYf*7\r\"J\n}b\u000f|[dzfRo73/d\f~Y4+9\u001f\u0012";
        objectArray[98] = "Lo^0G,J`_+\"+Kp\u0006>O\u0000,eP/O+Nv\n.\u0019QLo^0G,J`_+\"";
        objectArray[99] = "*DuXmY!\u00012]\\F>\u0006iY0tjE7\u000ee#:EdS&A)\u001fe\u0005\\";
        objectArray[100] = "'nU\u0000\u000b\u0010gaO\u000e5Osr|\u0006HM\u001e4\t\u0003ZG mLXP ";
        objectArray[101] = "S3gu\nw\u0005i=\u007fx)S~6i\u0014\u001b\u0007:l4x!\u000f3-|CwUi'\u000eA'Sl:`F#\u000e\u007fV";
        objectArray[102] = "#Nq\r_:#\u0015m\n2+\u000b--SOx!HzX\\#@";
        objectArray[103] = "e\u00144\u0015i+c\u001b5\u000e\f,b\u000bl\u001ba\u0006\u0005\u001e:\na,g\r`\u000b7Ve\u00144\u0015i+c\u001b5\u000e\f";
        objectArray[104] = "V<o%T\u0002\u0000f5/&WZ`:2q\u0000\u00000d^\u001fRVc20\u0018V\u000bp";
        Object[] objectArray2 = objectArray;
        objectArray[105] = "\f\ff\u0013:eZK:\u0003^z\t\u0007\u000b\u0001ar\r\ri\u0012;s[wbW3r\u001a\u0015q\r2$`\u001e4\u00053e\u0002\rn\u0004e\u001f";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'M' || c == '\u00fb' || c == 'h') {
                field = fE.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fE.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fE.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static float d(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        return (f - f10) / (f11 - f10);
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2149;
        if (y[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = x[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])z.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fE", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            fE.y[n2] = l4;
        }
        return y[n2];
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = fE.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private Color a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        l = q ^ l;
        int n3 = (int)((float)(n >> fE.c("n", (int)7753, (long)(0x79282B554841927AL ^ l)) & fE.c("n", (int)15415, (long)(0x7303600E35C4B002L ^ l))) * (1.0f - f) + (float)(n2 >> fE.c("n", (int)29868, (long)(0x7A2BEF1B7CE6789EL ^ l)) & fE.c("n", (int)26433, (long)(0x3B6E438069DEB76L ^ l))) * f);
        int n4 = (int)((float)(n >> fE.c("n", (int)13521, (long)(0x45F4E56D6FF038E5L ^ l)) & fE.c("n", (int)26433, (long)(0x3B6E438069DEB76L ^ l))) * (1.0f - f) + (float)(n2 >> fE.c("n", (int)20486, (long)(0xE5BF8AB3BABDC30L ^ l)) & fE.c("n", (int)26433, (long)(0x3B6E438069DEB76L ^ l))) * f);
        int n5 = (int)((float)(n & fE.c("n", (int)26433, (long)(0x3B6E438069DEB76L ^ l))) * (1.0f - f) + (float)(n2 & fE.c("n", (int)26433, (long)(0x3B6E438069DEB76L ^ l))) * f);
        return new Color(n3 << fE.c("n", (int)29868, (long)(0x7A2BEF1B7CE6789EL ^ l)) | n4 << fE.c("n", (int)20486, (long)(0xE5BF8AB3BABDC30L ^ l)) | n5);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bt_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[TRYBLOCK]], but top level block is 22[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (B[n3] != null) {
            return n3;
        }
        Object object = A[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 53;
            case 2 -> 51;
            case 3 -> 18;
            case 4 -> 8;
            case 5 -> 41;
            case 6 -> 33;
            case 7 -> 14;
            case 8 -> 50;
            case 9 -> 0;
            case 10 -> 52;
            case 11 -> 12;
            case 12 -> 2;
            case 13 -> 31;
            case 14 -> 63;
            case 15 -> 42;
            case 16 -> 4;
            case 17 -> 9;
            case 18 -> 21;
            case 19 -> 16;
            case 20 -> 25;
            case 21 -> 61;
            case 22 -> 62;
            case 23 -> 26;
            case 24 -> 3;
            case 25 -> 11;
            case 26 -> 27;
            case 27 -> 48;
            case 28 -> 56;
            case 29 -> 17;
            case 30 -> 34;
            case 31 -> 35;
            case 32 -> 32;
            case 33 -> 5;
            case 34 -> 57;
            case 35 -> 45;
            case 36 -> 15;
            case 37 -> 30;
            case 38 -> 44;
            case 39 -> 13;
            case 40 -> 28;
            case 41 -> 10;
            case 42 -> 40;
            case 43 -> 47;
            case 44 -> 58;
            case 45 -> 20;
            case 46 -> 19;
            case 47 -> 49;
            case 48 -> 46;
            case 49 -> 55;
            case 50 -> 23;
            case 51 -> 22;
            case 52 -> 60;
            case 53 -> 59;
            case 54 -> 29;
            case 55 -> 7;
            case 56 -> 6;
            case 57 -> 38;
            case 58 -> 37;
            case 59 -> 36;
            case 60 -> 54;
            case 61 -> 1;
            case 62 -> 43;
            default -> 24;
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
        fE.B[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fE.m(l, l2);
        Object object = A[n];
        if (object instanceof String) {
            String string = B[n];
            int n2 = string.indexOf(8);
            Class clazz = fE.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fE.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fE.g(clazz3, string2, clazz2)) != null) {
                    fE.A[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fE.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fE.A[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fE.n(2278584068364387L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fE.m(l, l2);
        Object object = A[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = B[n];
                int n3 = string2.indexOf(8);
                clazz3 = fE.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fE.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fE.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fE.A[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fE.n(2278584068364387L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fE.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fE.A[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fE.n(2278584068364387L, 0L);
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

    public void k(Object[] objectArray) {
        long l;
        long l2;
        long l3;
        long l4;
        bt_0 bt_02;
        block5: {
            long l5;
            block4: {
                bt_02 = (bt_0)objectArray[0];
                l4 = (Long)objectArray[1];
                long l6 = l4 = q ^ l4;
                l5 = l6 ^ 0x2B670FB449DBL;
                l3 = l6 ^ 0xD10F64E2F3L;
                l2 = l6 ^ 0x54E7E7B5C6BEL;
                l = l6 ^ 0x36AE2B43D4C5L;
                CallSite callSite = fE.h("y", (long)-5476408833185660108L, (long)l4);
                try {
                    fE fE2;
                    try {
                        fE2 = this;
                        if (callSite != null) break block4;
                        if (fE2.b != null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fE.h("y", (Object)matchException, (long)-5478501574228496977L, (long)l4);
                    }
                    fE2 = this;
                }
                catch (MatchException matchException) {
                    throw fE.h("y", (Object)matchException, (long)-5478501574228496977L, (long)l4);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l5;
            objectArray2[0] = fE.b("g", (int)12016, (long)(0x411416EF83A636EL ^ l4));
            fE2.b = fE.h("y", (Object)objectArray2, (long)-5484457803482269222L, (long)l4);
        }
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l3;
        objectArray3[3] = (double)fE.h("e", (Object)this.h, (long)-5479628915779752540L, (long)l4);
        objectArray3[2] = (double)fE.h("e", (Object)this.h, (long)-5484751927253562141L, (long)l4);
        objectArray3[1] = (double)fE.h("e", (Object)this.h, (long)-5479108420285422371L, (long)l4);
        objectArray3[0] = bt_02.b;
        CallSite callSite = fE.h("y", (Object)objectArray3, (long)-5484377404307713731L, (long)l4);
        Matrix4f matrix4f = new Matrix4f();
        fE.h("\u00c2", (Object)matrix4f, (float)((float)fE.h("e", (Object)callSite, (long)-5484874725852727737L, (long)l4)), (float)((float)fE.h("e", (Object)callSite, (long)-5476612209649799747L, (long)l4)), (float)((float)fE.h("e", (Object)callSite, (long)-5476975171928044774L, (long)l4)), (long)-5484602441258739430L, (long)l4);
        CallSite callSite2 = fE.h("\u00c2", (Object)new Quaternionf(), (long)-5484533896904100409L, (long)l4);
        fE.h("\u00c2", (Object)callSite2, (float)(-fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)bt_02.b, (long)-5479203069574692711L, (long)l4), (long)-5478256811684177723L, (long)l4) * (float)Math.PI / 180.0f), (long)-5479495010726046059L, (long)l4);
        fE.h("\u00c2", (Object)callSite2, (float)((float)((double)(fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)bt_02.b, (long)-5479203069574692711L, (long)l4), (long)-5485101993076832852L, (long)l4) * (float)Math.PI / 180.0f) + fE.h("y", (double)(this.k / 50.0f), (long)-5476690691502325811L, (long)l4) / 4.0)), (long)-5479270854643274635L, (long)l4);
        fE.h("\u00c2", (Object)callSite2, (float)((float)fE.h("y", (double)this.k, (long)-5477547174534302725L, (long)l4)), (long)-5477660989677751566L, (long)l4);
        fE.h("\u00c2", (Object)matrix4f, (Object)callSite2, (long)-5477628819598242639L, (long)l4);
        float f = (this.j / 2.0f + 0.5f) * 80.0f / 100.0f * this.g * 0.85f;
        float f10 = f / 2.0f;
        Object[] objectArray4 = new Object[4];
        objectArray4[3] = l;
        objectArray4[2] = Float.valueOf((float)(fE.h("y", (double)((double)fE.h("y", (long)-5476743627699461877L, (long)l4) * 0.001), (long)-5476690691502325811L, (long)l4) * 0.5 + 0.5));
        objectArray4[1] = (int)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477190022753331544L, (long)l4);
        objectArray4[0] = (int)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477393866809536858L, (long)l4), (long)-5477190022753331544L, (long)l4);
        CallSite callSite3 = fE.h("\u00c2", (Object)this, (Object)objectArray4, (long)-5477233621567316054L, (long)l4);
        Object[] objectArray5 = new Object[4];
        objectArray5[3] = l;
        objectArray5[2] = Float.valueOf((float)(fE.h("y", (double)((double)fE.h("y", (long)-5476743627699461877L, (long)l4) * 0.001 + 1.0), (long)-5476690691502325811L, (long)l4) * 0.5 + 0.5));
        objectArray5[1] = (int)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477190022753331544L, (long)l4);
        objectArray5[0] = (int)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477393866809536858L, (long)l4), (long)-5477190022753331544L, (long)l4);
        CallSite callSite4 = fE.h("\u00c2", (Object)this, (Object)objectArray5, (long)-5477233621567316054L, (long)l4);
        Object[] objectArray6 = new Object[4];
        objectArray6[3] = l;
        objectArray6[2] = Float.valueOf((float)(fE.h("y", (double)((double)fE.h("y", (long)-5476743627699461877L, (long)l4) * 0.001 + 2.0), (long)-5476690691502325811L, (long)l4) * 0.5 + 0.5));
        objectArray6[1] = (int)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477190022753331544L, (long)l4);
        objectArray6[0] = (int)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477393866809536858L, (long)l4), (long)-5477190022753331544L, (long)l4);
        CallSite callSite5 = fE.h("\u00c2", (Object)this, (Object)objectArray6, (long)-5477233621567316054L, (long)l4);
        Object[] objectArray7 = new Object[4];
        objectArray7[3] = l;
        objectArray7[2] = Float.valueOf((float)(fE.h("y", (double)((double)fE.h("y", (long)-5476743627699461877L, (long)l4) * 0.001 + 3.0), (long)-5476690691502325811L, (long)l4) * 0.5 + 0.5));
        objectArray7[1] = (int)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477190022753331544L, (long)l4);
        objectArray7[0] = (int)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)((Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-5485200786572202240L, (long)l4), (Object)new Object[0], (long)-5477023665312810132L, (long)l4), (Object)new Object[0], (long)-5478071150558411265L, (long)l4), (long)-5476882004706192867L, (long)l4))), (long)-5477393866809536858L, (long)l4), (long)-5477190022753331544L, (long)l4);
        CallSite callSite6 = fE.h("\u00c2", (Object)this, (Object)objectArray7, (long)-5477233621567316054L, (long)l4);
        Object[] objectArray8 = new Object[17];
        objectArray8[16] = l2;
        objectArray8[15] = false;
        objectArray8[14] = Float.valueOf(0.0f);
        objectArray8[13] = callSite6;
        objectArray8[12] = callSite5;
        objectArray8[11] = callSite4;
        objectArray8[10] = callSite3;
        objectArray8[9] = Float.valueOf(0.0f);
        objectArray8[8] = Float.valueOf(f10);
        objectArray8[7] = Float.valueOf(f10);
        objectArray8[6] = Float.valueOf(0.0f);
        objectArray8[5] = Float.valueOf(-f10);
        objectArray8[4] = Float.valueOf(-f10);
        objectArray8[3] = this.b;
        objectArray8[2] = matrix4f;
        objectArray8[1] = bt_02.b;
        objectArray8[0] = bt_02.a;
        fE.h("y", (Object)objectArray8, (long)-5485002919977031329L, (long)l4);
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

    public void j(Object[] objectArray) {
        CallSite callSite;
        long l;
        long l2;
        long l3;
        bt_0 bt_02;
        block20: {
            long l4;
            block19: {
                fE fE2;
                block17: {
                    block18: {
                        bt_02 = (bt_0)objectArray[0];
                        l3 = (Long)objectArray[1];
                        long l5 = l3 = q ^ l3;
                        l4 = l5 ^ 0x1A257B0C6798L;
                        l2 = l5 ^ 0x31937BDCCCB0L;
                        l = l5 ^ 0x65A5930DE8FDL;
                        callSite = fE.h("y", (long)-7080553152808718985L, (long)l3);
                        try {
                            try {
                                fE2 = this;
                                if (callSite != null) break block17;
                                if (fE2.h != null) break block18;
                            }
                            catch (MatchException matchException) {
                                throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                            }
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                        }
                    }
                    fE2 = this;
                }
                try {
                    try {
                        if (callSite != null) break block19;
                        if (fE2.c != null) break block20;
                    }
                    catch (MatchException matchException) {
                        throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                    }
                    fE2 = this;
                }
                catch (MatchException matchException) {
                    throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l4;
            objectArray2[0] = fE.b("g", (int)3635, (long)(0x54A7C4591A48EDECL ^ l3));
            fE2.c = fE.h("y", (Object)objectArray2, (long)-7088529551593449575L, (long)l3);
        }
        Object[] objectArray3 = new Object[5];
        objectArray3[4] = l2;
        objectArray3[3] = (double)fE.h("e", (Object)this.h, (long)-7082117349972311065L, (long)l3);
        objectArray3[2] = (double)fE.h("e", (Object)this.h, (long)-7088368481312071008L, (long)l3);
        objectArray3[1] = (double)fE.h("e", (Object)this.h, (long)-7082619969754559842L, (long)l3);
        objectArray3[0] = bt_02.b;
        CallSite callSite2 = fE.h("y", (Object)objectArray3, (long)-7088487088639213698L, (long)l3);
        Matrix4f matrix4f = new Matrix4f();
        fE.h("\u00c2", (Object)matrix4f, (float)((float)fE.h("e", (Object)callSite2, (long)-7087823324293654524L, (long)l3)), (float)((float)fE.h("e", (Object)callSite2, (long)-7080754327560027138L, (long)l3)), (float)((float)fE.h("e", (Object)callSite2, (long)-7079991375321602727L, (long)l3)), (long)-7088113441525696679L, (long)l3);
        CallSite callSite3 = fE.h("\u00c2", (Object)new Quaternionf(), (long)-7088608394855507068L, (long)l3);
        fE.h("\u00c2", (Object)callSite3, (float)(-fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)bt_02.b, (long)-7082257220074901798L, (long)l3), (long)-7081238380045175162L, (long)l3) * (float)Math.PI / 180.0f), (long)-7081948812295653162L, (long)l3);
        fE.h("\u00c2", (Object)callSite3, (float)(fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)bt_02.b, (long)-7082257220074901798L, (long)l3), (long)-7088048377482023953L, (long)l3) * (float)Math.PI / 180.0f), (long)-7082322239723535818L, (long)l3);
        fE.h("\u00c2", (Object)matrix4f, (Object)callSite3, (long)-7081702751148727566L, (long)l3);
        float f = (float)((double)((float)(fE.h("y", (long)-7080357961642619064L, (long)l3) - this.l) / 3000.0f) + fE.h("y", (double)((float)(fE.h("y", (long)-7080357961642619064L, (long)l3) - this.l) / 2500.0f), (long)-7080270392574045810L, (long)l3) / 10.0);
        float f10 = -0.05f;
        float f11 = this.j / 4.0f;
        int n = 1;
        Color color = (Color)((Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00c2", (Object)fE.h("\u00fb", (long)-7087654605339524797L, (long)l3), (Object)new Object[0], (long)-7080077816889928401L, (long)l3), (Object)new Object[0], (long)-7081125283346076740L, (long)l3), (long)-7080496889493570466L, (long)l3));
        CallSite callSite4 = fE.h("\u00c2", (Object)color, (long)-7081055452533258646L, (long)l3);
        CallSite callSite5 = fE.h("\u00c2", (Object)color, (long)-7087568268964692748L, (long)l3);
        CallSite callSite6 = fE.h("\u00c2", (Object)color, (long)-7082361636143569976L, (long)l3);
        for (int i = 0; i < 4; ++i) {
            int n2;
            block24: {
                block25: {
                    float f12;
                    float f13;
                    block21: {
                        float f14 = f * 360.0f;
                        float f15 = f14 + 150.0f;
                        for (float f16 = f14; f16 < f14 + 100.0f; f16 += 1.0f) {
                            Object object;
                            double d;
                            CallSite callSite7;
                            CallSite callSite8;
                            float f17;
                            Object object2;
                            block23: {
                                block22: {
                                    Object[] objectArray4 = new Object[3];
                                    objectArray4[2] = Float.valueOf(f15);
                                    objectArray4[1] = Float.valueOf(f14 - 90.0f);
                                    objectArray4[0] = Float.valueOf(f16);
                                    object2 = fE.h("y", (Object)objectArray4, (long)-7087899074282134977L, (long)l3);
                                    f17 = this.i * this.g;
                                    CallSite callSite9 = fE.h("y", (double)f16, (long)-7081656840214798920L, (long)l3);
                                    CallSite callSite10 = fE.h("y", (double)(callSite9 * 1.5), (long)-7080270392574045810L, (long)l3);
                                    callSite8 = fE.h("y", (double)callSite9, (long)-7081622601361080370L, (long)l3);
                                    callSite7 = fE.h("y", (double)callSite9, (long)-7080270392574045810L, (long)l3);
                                    d = (double)f11 + callSite10 * 0.25;
                                    try {
                                        try {
                                            f13 = 0.15f;
                                            f12 = 0.15f;
                                            if (callSite != null) break block21;
                                            if (n == 0) break block22;
                                        }
                                        catch (MatchException matchException) {
                                            throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                                        }
                                        object = object2;
                                        break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                                    }
                                }
                                object = (1.0f - object2) * 1.5f;
                            }
                            float f18 = f13 * (fE.h("y", (float)f12, (float)object, (long)-7082743731154856837L, (long)l3) + 0.45f);
                            float f19 = f18 * (1.7f + (0.5f - f10) * 2.0f);
                            if (n != 0) {
                                object2 = 1.0f - object2;
                            }
                            float f20 = 5.0f;
                            float f21 = 1.0f - (float)fE.h("y", (double)((double)object2), (double)f20, (long)-7082182190908633480L, (long)l3);
                            float f22 = f19 * f21 * this.g;
                            float f23 = 0.5f;
                            float f24 = 1.0f - (float)fE.h("y", (double)((double)object2), (double)f23, (long)-7082182190908633480L, (long)l3);
                            float f25 = f19 * f24 * this.g;
                            float f26 = (float)(callSite8 * (double)f17);
                            float f27 = (float)((d - (double)0.9f) * (double)this.g);
                            float f28 = (float)(callSite7 * (double)f17);
                            CallSite callSite11 = fE.h("y", (float)(f25 * 2.5f), (float)1.0f, (long)-7081457161896033933L, (long)l3);
                            int n3 = (int)((float)callSite4 * (1.0f - callSite11) + 255.0f * callSite11);
                            int n4 = (int)((float)callSite5 * (1.0f - callSite11) + 255.0f * callSite11);
                            int n5 = (int)((float)callSite6 * (1.0f - callSite11) + 255.0f * callSite11);
                            float f29 = (float)n3 / 255.0f;
                            float f30 = (float)n4 / 255.0f;
                            float f31 = (float)n5 / 255.0f;
                            Color color2 = new Color(f29, f30, f31, f25);
                            Object[] objectArray5 = new Object[17];
                            objectArray5[16] = l;
                            objectArray5[15] = true;
                            objectArray5[14] = Float.valueOf(0.0f);
                            objectArray5[13] = color2;
                            objectArray5[12] = color2;
                            objectArray5[11] = color2;
                            objectArray5[10] = color2;
                            objectArray5[9] = Float.valueOf(f28);
                            objectArray5[8] = Float.valueOf(f27 + f22 / 2.0f);
                            objectArray5[7] = Float.valueOf(f26 + f22 / 2.0f);
                            objectArray5[6] = Float.valueOf(f28);
                            objectArray5[5] = Float.valueOf(f27 - f22 / 2.0f);
                            objectArray5[4] = Float.valueOf(f26 - f22 / 2.0f);
                            objectArray5[3] = this.c;
                            objectArray5[2] = matrix4f;
                            objectArray5[1] = bt_02.b;
                            objectArray5[0] = bt_02.a;
                            fE.h("y", (Object)objectArray5, (long)-7087984503784618212L, (long)l3);
                            if (callSite == null) continue;
                        }
                        f13 = f;
                        f12 = -1.35f;
                    }
                    f = f13 * f12;
                    try {
                        n2 = n;
                        if (callSite != null) break block24;
                        if (n2 != 0) break block25;
                    }
                    catch (MatchException matchException) {
                        throw fE.h("y", (Object)matchException, (long)-7080992758809689108L, (long)l3);
                    }
                    n2 = 1;
                    break block24;
                }
                n2 = 0;
            }
            n = n2;
            f11 += this.j / 4.0f;
            if (callSite == null) continue;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fE.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fE.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fE.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fE.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

