/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_2663
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.b0;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.eD;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.s_0;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import org.joml.Matrix4f;

public class eU
extends dV {
    private dP a;
    private dP c;
    private dM d;
    private dM e;
    private static bW f;
    private static bW g;
    private static final long h;
    private ArrayList i;
    private f5 j;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long[] o;
    private static final Integer[] p;
    private static final Map q;
    private static final long[] r;
    private static final Long[] s;
    private static final Map t;
    private static final Object[] u;
    private static final String[] v;

    public eU() {
        long l = k ^ 0x464090277109L;
        long l2 = l ^ 0x368E411A3F05L;
        this.i = new ArrayList();
        this.j = new f5(l2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            eU.k = hc.a(526500950205068540L, 1488821011885376669L, MethodHandles.lookup().lookupClass()).a(21068707293260L);
                            eU.u = new Object[160];
                            eU.v = new String[160];
                            eU.f();
                            eU.n = new HashMap<K, V>(13);
                            var22 = eU.k ^ 64416665230574L;
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
                            var31_3 = new String[2];
                            var29_4 = 0;
                            var28_5 = "\u001bZ\u00cf\u00cam\u0081=lS'U4\u008a}\u00c8\u001dH\u001c\u00d7Hf&\u00fbYo\u00f5\u0089\u00b6M9\u0018\u0091\u0002\u001b\u00e7\u00cc\u00e9\u00b7\u0019\u00f9KzW\u00b6+\u000b$_\u00a2\u0087\u00ab\u00d5\r\u0094\u00e6\u00a4[r\u00b4\u000f\u008dO\u00db\u008f8\u008f\u008f\u0094.\u00a8\u007f\u00a5\u00a8\u009dD\u00fc\u00b81)\u00af\u00f5\u0001,\u008c!\u00d2\u0099 \u00da\u00af$\u0017\u009a\u008btG;\u008e\u0002\u00cc\u00f5\u00c3\u00ad\u00e2\u00ad\u00f8\u00ee\u00d0\u00eb\u0097nS_\u000eB\u0099\u0003?z\u0088\u00a1";
                            var30_6 = "\u001bZ\u00cf\u00cam\u0081=lS'U4\u008a}\u00c8\u001dH\u001c\u00d7Hf&\u00fbYo\u00f5\u0089\u00b6M9\u0018\u0091\u0002\u001b\u00e7\u00cc\u00e9\u00b7\u0019\u00f9KzW\u00b6+\u000b$_\u00a2\u0087\u00ab\u00d5\r\u0094\u00e6\u00a4[r\u00b4\u000f\u008dO\u00db\u008f8\u008f\u008f\u0094.\u00a8\u007f\u00a5\u00a8\u009dD\u00fc\u00b81)\u00af\u00f5\u0001,\u008c!\u00d2\u0099 \u00da\u00af$\u0017\u009a\u008btG;\u008e\u0002\u00cc\u00f5\u00c3\u00ad\u00e2\u00ad\u00f8\u00ee\u00d0\u00eb\u0097nS_\u000eB\u0099\u0003?z\u0088\u00a1".length();
                            var27_7 = 64;
                            var26_8 = -1;
lbl32:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var31_3[var29_4++] = eU.b(var32_9).intern();
                                if ((var26_8 += var27_7) < var30_6) {
                                    var27_7 = var28_5.charAt(var26_8);
                                    ** continue;
                                }
                                break block15;
                                break;
                            }
                            v3 = ++var26_8;
                            var32_9 = var24_1.doFinal(var28_5.substring(v3, v3 + var27_7).getBytes("ISO-8859-1"));
                            ** while (true)
                        }
                        eU.l = var31_3;
                        eU.m = new String[2];
                        eU.q = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v4 = SecretKeyFactory.getInstance("DES");
                        v5 = new byte[8];
                        v6 = v5;
                        v5[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v6 = v6;
                            v6[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[7];
                        var14_13 = 0;
                        var15_14 = "\u00e4\u00eb\u00a3\u00a8\u000b\u00d9. \b\u00da\u00de\u00cc\u0000\u00ebt\u00ab\u00a2r\u0014\u00cb\u00f1\u0087\u00c7\u00c2\u00c0\u0084?\u00f8\u00efq\u00ba\u0095\u0005\u00a6\u00ae\u00cb\u00c8\r\u0011\u00ea";
                        var16_15 = "\u00e4\u00eb\u00a3\u00a8\u000b\u00d9. \b\u00da\u00de\u00cc\u0000\u00ebt\u00ab\u00a2r\u0014\u00cb\u00f1\u0087\u00c7\u00c2\u00c0\u0084?\u00f8\u00efq\u00ba\u0095\u0005\u00a6\u00ae\u00cb\u00c8\r\u0011\u00ea".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v7 = var17_12;
                            v8 = var14_13++;
                            v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v10 = -1;
                            break block16;
                            break;
                        }
lbl85:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u008b\u00de\u00dd'$\u00a6B\u008c\u0007\u00d9\u0011\"\u00cfL\u0089\u00dd";
                            var16_15 = "\u008b\u00de\u00dd'$\u00a6B\u008c\u0007\u00d9\u0011\"\u00cfL\u0089\u00dd".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v7 = var17_12;
                                v8 = var14_13++;
                                v9 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v10 = 0;
                                break block16;
                                break;
                            }
                            break;
                        }
lbl104:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var13_16 < var16_15) ** continue;
                            break block17;
                            break;
                        }
                    }
                    var19_18 = v9;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v11 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v10) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl117:
                        // 1 sources

                        ** continue;
                    }
                }
                eU.o = var17_12;
                eU.p = new Integer[7];
                eU.t = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v12 = SecretKeyFactory.getInstance("DES");
                v13 = new byte[8];
                v14 = v13;
                v13[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v14 = v14;
                    v14[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v12.generateSecret(new DESKeySpec(v14)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[3];
                var3_23 = 0;
                var4_24 = "\u00b0mA\u00e3\u009f\t\u00b19uzW\u00a25\u0001a\u00be\u00f4\u00c4\u007f\u00aa\u009d\u00c6\u00fac";
                var5_25 = "\u00b0mA\u00e3\u009f\t\u00b19uzW\u00a25\u0001a\u00be\u00f4\u00c4\u007f\u00aa\u009d\u00c6\u00fac".length();
                var2_26 = 0;
                while (true) {
                    break block18;
                    break;
                }
lbl148:
                // 1 sources

                while (true) {
                    var6_22[v15] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block19;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v15 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        eU.r = var6_22;
        eU.s = new Long[3];
        eU.h = (long)eU.d("n", (int)7877, (long)(var22 ^ 901841064119332189L));
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

    public static Color b(Object[] objectArray) {
        int n;
        int n2;
        int n3;
        block35: {
            Object object;
            block32: {
                CallSite callSite;
                int n4;
                long l;
                block34: {
                    CallSite callSite2;
                    block30: {
                        block31: {
                            Object object2;
                            block28: {
                                block26: {
                                    block27: {
                                        Object object3;
                                        block24: {
                                            Color color = (Color)objectArray[0];
                                            Color color2 = (Color)objectArray[1];
                                            double d = (Double)objectArray[2];
                                            l = (Long)objectArray[3];
                                            l = k ^ l;
                                            double d10 = 1.0 - d;
                                            callSite2 = eU.h("G", (long)9001065317229825484L, (long)l);
                                            n3 = (int)((double)eU.h("e", (Object)color, (long)9001131843052532522L, (long)l) * d + (double)eU.h("e", (Object)color2, (long)9001131843052532522L, (long)l) * d10);
                                            n2 = (int)((double)eU.h("e", (Object)color, (long)8999340375173686362L, (long)l) * d + (double)eU.h("e", (Object)color2, (long)8999340375173686362L, (long)l) * d10);
                                            n = (int)((double)eU.h("e", (Object)color, (long)8994468354424140833L, (long)l) * d + (double)eU.h("e", (Object)color2, (long)8994468354424140833L, (long)l) * d10);
                                            try {
                                                block25: {
                                                    try {
                                                        try {
                                                            try {
                                                                object3 = n3;
                                                                if (callSite2 != null) break block24;
                                                                if (object3 < 0) break block25;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                                            }
                                                            object2 = n3;
                                                            if (callSite2 != null) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                                        }
                                                        if (object2 <= eU.c("n", (int)4377, (long)(0x7CE1C10A31D88030L ^ l))) break block27;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                                    }
                                                }
                                                object3 = eU.h("G", (int)0, (int)eU.h("G", (int)eU.c("n", (int)29304, (long)(0x54CB273D1E4E6354L ^ l)), (int)n3, (long)9001291371467967987L, (long)l), (long)9000775809142598494L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                            }
                                        }
                                        n3 = object3;
                                    }
                                    object2 = n2;
                                }
                                try {
                                    block29: {
                                        try {
                                            try {
                                                try {
                                                    if (callSite2 != null) break block28;
                                                    if (object2 < 0) break block29;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                                }
                                                object = n2;
                                                if (callSite2 != null) break block30;
                                            }
                                            catch (MatchException matchException) {
                                                throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                            }
                                            if (object <= eU.c("n", (int)29304, (long)(0x54CB273D1E4E6354L ^ l))) break block31;
                                        }
                                        catch (MatchException matchException) {
                                            throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                        }
                                    }
                                    object2 = eU.h("G", (int)0, (int)eU.h("G", (int)eU.c("n", (int)29304, (long)(0x54CB273D1E4E6354L ^ l)), (int)n2, (long)9001291371467967987L, (long)l), (long)9000775809142598494L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                }
                            }
                            n2 = object2;
                        }
                        object = n;
                    }
                    try {
                        block33: {
                            try {
                                try {
                                    try {
                                        if (callSite2 != null) break block32;
                                        if (object < 0) break block33;
                                    }
                                    catch (MatchException matchException) {
                                        throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                    }
                                    n4 = n;
                                    callSite = eU.c("n", (int)29304, (long)(0x54CB273D1E4E6354L ^ l));
                                    if (callSite2 != null) break block34;
                                }
                                catch (MatchException matchException) {
                                    throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                                }
                                if (n4 <= callSite) break block35;
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                            }
                        }
                        n4 = 0;
                        callSite = eU.h("G", (int)eU.c("n", (int)29304, (long)(0x54CB273D1E4E6354L ^ l)), (int)n, (long)9001291371467967987L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)9001158989072750895L, (long)l);
                    }
                }
                object = eU.h("G", (int)n4, (int)callSite, (long)9000775809142598494L, (long)l);
            }
            n = object;
        }
        return new Color(n3, n2, n);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eU.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/eU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x671A;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eU.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eU.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eU", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eU.l[n2].getBytes("ISO-8859-1");
            eU.m[n2] = eU.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eU.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6DDA;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eU.p[n2] = n3;
        }
        return p[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eU.m(l, l2);
            object = u[n];
            try {
                if (!(object instanceof String)) break block2;
                eU.u[n] = clazz = Class.forName(v[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eU.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eU.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eU.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eU.h(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/eU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void f() {
        Object[] objectArray = u;
        u[0] = "1\u001c~Mz\u00143\u000275u\u0018*\u0001kPt";
        objectArray[1] = Double.TYPE;
        eU.v[1] = "java/lang/Double";
        objectArray[2] = "1y'?St'y\"e@c02!cLw!u6t\u0007`8";
        objectArray[3] = "*wbO\u000e5_Wi@\u001fz>YbK\u001b J";
        objectArray[4] = "Y;1gezO;4=vmXp7;zyI7 ,1hj";
        objectArray[5] = "@vM7F\\VvHmUKA=KkY_Pz\\|\u0012Ml";
        objectArray[6] = "/na\u000f\t)ZNj\u0000\u0018f'Vy\u0007\u0011/O";
        objectArray[7] = "3UCl\u000eg%UF6\u001dp2\u001eE0\u0011d#YR'Zs'";
        objectArray[8] = "s\u0005\u0007^$B\u0006%\fQ5\rg+\u0007Z1W\u0013";
        objectArray[9] = "8q#Br+3~2\r\u0011&&x";
        objectArray[10] = "(W\u00008\u001eV>W\u0005b\rA)\u001c\u0006d\u0001U8[\u0011sJC\u0019";
        objectArray[11] = "\u000bmI\u0011\rs\u0000bX^n~\u0015oW5[|\u0004|K\u0019Lq";
        objectArray[12] = "6U\u000b%#h6U\u001cy/g,\u001e\u001cg/r+oM?}";
        objectArray[13] = "L\u001e\u0005,\b\u0001L\u001e\u0012p\u0004\u000eVU\u0012n\u0004\u001bQ$E3]\\";
        objectArray[14] = Float.TYPE;
        eU.v[14] = "java/lang/Float";
        objectArray[15] = "u/\u0001\u0003\u0004+w1H`\u000f0h4\u001e\u0019\b";
        objectArray[16] = "\"^\u0014&>64^\u0011|-!#\u0015\u0012z!52R\u0005mj5";
        objectArray[17] = "2|(y~]9s96\u001fS2x=l";
        objectArray[18] = Boolean.TYPE;
        eU.v[18] = "java/lang/Boolean";
        objectArray[19] = "x\u000e\u000e/l\u0001n\u000e\u000bu\u007f\u0016yE\bss\u0002h\u0002\u001fd8\u0016W";
        objectArray[20] = "|vR\b{TjvWRhC}=TTdWlzCC/@t";
        objectArray[21] = "d=9u`b\u0011\u001d2zq-p\u00139quw\u0004";
        objectArray[22] = Void.TYPE;
        eU.v[22] = "java/lang/Void";
        objectArray[23] = "\u0017DTs\u0014e\u0017DC/\u0018j\r\u000fC1\u0018\u007f\n~\u0017iO";
        objectArray[24] = "LE/$JrLE8xF}V\u000e8fFhQ\u007fh;\u0017";
        objectArray[25] = "\u001a779\b|\f72c\u001bk\u001b|1e\u0017\u007f\n;&r\\jK";
        objectArray[26] = "\u0011\u0002Z\u0017t=d\"Q\u0018er\u0005,Z\u0013a(q";
        objectArray[27] = "J6lhK+A9}',)T2}l\u0017";
        objectArray[28] = Integer.TYPE;
        eU.v[28] = "java/lang/Integer";
        objectArray[29] = "D\\eY,KR\\`\u0003?\\E\u0017c\u00053HTPt\u0012x_k";
        objectArray[30] = "8L\u0011R}\u007f.L\u0014\bnh9\u0007\u0017\u000eb|(@\u0000\u0019)ml";
        objectArray[31] = "f>\u0005n{d\u0013\u001e\u000eaj+r\u0010\u0005jnq\u0006";
        objectArray[32] = "-\u000fN\u0000D[X/E\u000fU\u00149!N\u0004QNM";
        objectArray[33] = "c\u0013\u007f=B~\u00163t2S1w=\u007f9Wk\u0003";
        objectArray[34] = "\u001f^hr\u007f|\u0002K0P>q\u001aM";
        objectArray[35] = "'z|\u0010s\u0012,um_\u000e\u0007>oo\u001c";
        objectArray[36] = Long.TYPE;
        eU.v[36] = "java/lang/Long";
        objectArray[37] = "Op/|RmQx535l@c8i\u0013j";
        objectArray[38] = "Zf>tU\u0014Lf;.F\u0003[-8(J\u0017Jj/?\u0001\u0007Rj-4[Jnq-)[\rYf";
        objectArray[39] = "j@S\u0000xX|@VZkOk\u000bU\\g[zLBK,KD";
        objectArray[40] = "\u001aJ%\u001et?\fJ Dg(\u001b\u0001#Bk<\nF4U +(";
        objectArray[41] = "[,\u0006*<=E$\u001ce^!B9";
        objectArray[42] = "CV2O\u001cA6v9@\r\u000eWx2K\tT#";
        objectArray[43] = "O;L\u0014\u0001\u0003O;[H\r\fUp[V\r\u0019R\u0001\t\fY]";
        objectArray[44] = "\u001aG{ip\u0018\u001aGl5|\u0017\u0000\fl+|\u0002\u0007}=q+B";
        objectArray[45] = Byte.TYPE;
        eU.v[45] = "java/lang/Byte";
        objectArray[46] = "Y\f\u0017rE\u000fY\f\u0000.I\u0000CG\u00000I\u0015D6Uo\u0010";
        objectArray[47] = "5\u0014\u0019TB\u00075\u0014\u000e\bN\b/_\u000e\u0016N\u001d(.\\C\u001cY";
        objectArray[48] = "%=S\u001bJx%=DGFw?vDYFb8\u0007\u0016\u0007\u001e&";
        objectArray[49] = "n\u0003r\u0010`ip\u000bh_\u000fnv\u0003}='op";
        objectArray[50] = "<CK\u0010VU7LZ_:V9NX\u0010\u0016";
        objectArray[51] = "(n/ |\u001e>n*zo\t)%)|c\u001d8b>k(\f+";
        objectArray[52] = "^r\u0013+mo+R\u0018$| J\\\u0013/xz>";
        objectArray[53] = " \u0005\u001e\u0015Rt \u0005\tI^{:N\tW^n=?X\u000e\u0006+";
        objectArray[54] = "tb+?P\u001bbb.eC\fu)-cO\u0018dn:t\u0004\b(";
        objectArray[55] = "'%S\u001f6>R\u0005X\u0010'q3\u000bS\u001b#+G";
        objectArray[56] = "4gvDYh4ga\u0018Ug.,a\u0006Ur)]:S\f";
        objectArray[57] = "W?\u0002\\\"tW?\u0015\u0000.{Mt\u0015\u001e.nJ\u0005EG|/";
        objectArray[58] = "GsAvI\rQsD,Z\u001aF8G*V\u000eW\u007fP=\u001d\u0019a";
        objectArray[59] = "P\u0015\b%2m%5\u0003*#\"D;\b!'x0";
        objectArray[60] = "amX3QNamOo]A{&Oq]T|W\u001e.\u000f\u001f";
        objectArray[61] = "\u0005`\u0002\"\u0001O\u0005`\u0015~\r@\u001f+\u0015`\rU\u0018ZD:T\u0016";
        objectArray[62] = "T-i\u001d\u000eM!\rb\u0012\u001f\u0002@\u0003i\u0019\u001bX4";
        objectArray[63] = "wOFkZh\u0002oMdK'caFoO}\u0017";
        objectArray[64] = "\bZvmF\u001f}z}bWP\u001ctviS\nh";
        objectArray[65] = ";o!d!%;o68-*!$6&-?&Ugy{x";
        objectArray[66] = "3GT=U\u001cFg_2DS'iT9@\tS";
        objectArray[67] = "~X$OJk\u000bx/@[$jv$K_~\u001e";
        objectArray[68] = "\u001bo\u0015Y3#\ro\u0010\u0003 4\u001a$\u0013\u0005, \u000bc\u0004\u0012g2:";
        objectArray[69] = "_C8\u001b5\u000b*c3\u0014$DKm8\u001f \u001e?";
        objectArray[70] = "#+>G=hV\u000b5H,'7\u0005>C(}C";
        objectArray[71] = "!V&QxHTv-^i\u00075x&Um]A";
        objectArray[72] = "7L,\u0007 h)D6Hhh3N.\u000fass}(\u0003jt>L.\u0003";
        objectArray[73] = "K\u0000lpL\b> g\u007f]G_.ltY\u001d+";
        objectArray[74] = "\u007fo\"\u0019+rio'C8e~$$E4qoc3R\u007fcP";
        objectArray[75] = "A<8:V\u00174\u001c35GXU\u00128>C\u0002!";
        objectArray[76] = "5]\"\u0007,u+\u001a$U\u0013p?\u001aP\u001e~r4f|^bz+\n{Yv&R";
        objectArray[77] = "#_\tux2 @\u0011lH1-M\u000fi\u001ffs\u001aW\u0005&-,R\u000e{9$v]";
        objectArray[78] = "_ zd\u0007e\u0006!oo\u0002\t\u000fN'd\u0003w^<'p\u0013l\rNnb\b8\n7#vVjf";
        objectArray[79] = "B6946p\u00184-1P`\"w.3.1Pw:#5b\"%8 ap_*y!>\t";
        objectArray[80] = "\u0006\u001a|\u0005C2\u0018]zW|4\b[\"\u000b\u0006X\u0006\u001a|\u0005C2\u0018]zW|";
        objectArray[81] = "\u0017\u0005_+C\u000f\u0011\u0010H`3\u0013n\u0001\u001f%\nBP\u0017I+N";
        objectArray[82] = "<\u000e-g]\u0005aSjt-\u001b`O3nA)4\u0002h3\u001c~<I\"s\u0012\u0013=Nb6-";
        objectArray[83] = "|]([C\u000e-\u0003(*Zs,R-A[\u001d.[uH";
        objectArray[84] = "p }$Y\u0006p)=95\u0012Ov*.K@=v>>P\u0013O(~~VG%69x\u0004x";
        objectArray[85] = ".-\u001afh +q\u000e?aDyv\td|\u0013+)T>\u0010u*i\npk(w.\u0019";
        objectArray[86] = "/sLp\u001c7;,N\" |-yU\" 6<aKpM7;!\u000eOId;/\r\u007f];9}1";
        objectArray[87] = ":hO)l\n23O?\u0015Q**i9eMC:V*$H>5\u0017+{1";
        objectArray[88] = "U|v >NT;u7\u000fA.}~'q\u0010\\}j7jC.*n(hLP|x04(";
        objectArray[89] = "5;u\" [}&5\"F\u0004?\u0015.>:\u0014D328w\u001c9<s9(e";
        objectArray[90] = "#@g8<2nF:k[<rV;n\fk(\u0006f\u0002b;(P.l`2pY";
        objectArray[91] = "|4Um\u0017\u001bhkW?+Wo>N)OBi:(cQZohEbV\u001a*W\u0019(ZQ*:\u0018/\u001a\u0014\u0015fR#Q\u0014xgUc\u0014+|4Um\u0017\u001bhkW?+";
        objectArray[92] = "Vg\u0005}\u0004*H \u0003/;\nu\u0015s];'\na[!Q9Mg\t";
        objectArray[93] = "\u000e|rLH\u001b\u000e4pJ(\u001dj|eNVL\u0018|q^M\u001fj%r[B\u0012\u0013\u007fpOGt";
        objectArray[94] = "\u000fUhrF)NNy%7z6\u001dlrI+D\u001dxbRx6\u001e~/Kw[\u001fa/\b\u0013";
        objectArray[95] = "g0\u0003&:nq|\u000e.T:v>\b.8\b!ySpk_\"+S\"%1 \"\u000b+T";
        objectArray[96] = "3\u0004W>m73LU8\r1W\u0004@<s`%\u0004T,h3W\fU wg:\rR`2X";
        objectArray[97] = "\u000e}\u0016J\u001b\u0002\ns\u0006K+\u001325\u0007\u001fUB@5\u0013\u000fN\u00112e\u000eLZ\u0013O4PL+";
        objectArray[98] = "l]NX/+r\u001aH\n\u0010+q\u0007\u001c[l,qf\u0014\u0000-\"4\f\nG+p\u000b";
        objectArray[99] = "qb7]>mqkw@RzN4`W,+<4tG7xNj4\u00071,$ts\u0001c\u0013";
        objectArray[100] = "\u0016|Mn:P\u0018hE&]G\u0000iHs4K9gHc0-\fwR/$P\u00036Sp]";
        objectArray[101] = "]%y)1H\u00101'{]T@0\u007f\u007f1f\u0017w$!m1\u0014%$s,_\u0016,|z]";
        objectArray[102] = ";j$;[naq!(d*|k<G]8>z1)_1fs@~\rjn`.|\u00042g\u0011";
        objectArray[103] = "z\u0015\u0013[\"{ \u0017\u0007^Dk\u001aT\u0004\\::hT\u0010L!i\u001a\\\u0011@>=w]\u0016\u0000{\u0002";
        objectArray[104] = "7Oz2k^f\u0011zCp#g@\u007f(sMeI'!";
        objectArray[105] = "N\u000e\u0013f$IXB\u001enJ\u001d_\u0000\u0018n&/\bGC3sx\u000b\u0015Cb;\u0016\t\u001c\u001bkJ";
        objectArray[106] = "\tNRCIK\u000fLAG\u0014uU\u001e\\CC\u0019gO\u0011\u001d\u001fE0J\u0011\u001cG\u001eR\u000e]\u001fOK0J\u001dQD\u0018\u000eL\u001fB@E0";
        objectArray[107] = "0]Xi2\u0010-^\bjW\u0000SZ\u000e|i\u0007:^Xqfi";
        objectArray[108] = "\u007fb~\u0001\u000fX%y{\u00120\u001c \u007f\u001aDY\\*htFP\u0004#\u0019#\u0014\u000b\f0w!\u001dS\u0005A";
        objectArray[109] = "l40L\u0018s6v9T\u001e\u000b0g&EAg\u00020d\u001f\u001f6Ua#[\u0017r(nbZH\u000b";
        objectArray[110] = "\u000bD\u001cVbI\\_OCSR\u0011C\u0005G5E0X\u001aG\u0016X\b]\u001eQSAPZ\u0003\u00108R\u000fV\u0016*";
        objectArray[111] = ">Qs\u000e\nGvL3\u000el\u0010#^M\u0001Q\u001dq\\$\u0005\u0007\u0010~2&\u0013\u0012H6O)R\u0013\u0017O";
        objectArray[112] = ",G%^`Nv\\ M_\u0014sZAAe\u0000wE-Fb\u0014+<\"\u0018.\u0014kP%\u001f:H\u0012_{S:\b~X|Gfq";
        objectArray[113] = "\u001a>\fp=\u0018JaM}yqI\u0007Lpi\u000f\u001buLdy\u0014H\u0007Ed<KDg\bba\u0018#";
        objectArray[114] = "(R[5L[y\f[DT&x]^/THzT\u0006&";
        objectArray[115] = "dQ\u0018c/V)EF1CJyD\u001e5/x.\u0003Ehz/-QE92A/X\u001d0C";
        objectArray[116] = "\u0017\u00042\u000eC=S\u000e4S$g,H5\u0004\u001b4R\toEK\r";
        objectArray[117] = "[\u0004\u0017R?$EC\u0011\u0000\u0000!QCp\\lN_\u0005[Ty\"X\u0002O\b\u0000";
        objectArray[118] = ":W\u0012qCB:^Rl/U\u0005\u0007RxQ\u0003t\u0004@.\u001e<:@Dh\u0010M9R\u0012'/";
        objectArray[119] = "T#kI\u0006vW<sP6uZ1mUa\"\u0005l69Hj\u0006 pPOyJ$";
        objectArray[120] = "\u00060\u001eB)/\\+\u001bQ\u0016uQ;z],a]2\u0016Z+u\u0001K\u0019\u0004guA'\u001e\u0003s)8(@OsiT/G[/\u0010";
        objectArray[121] = "<\u0002\u001e#\u0014p=E\u001d4%\u007fGQ\u00007\u0014o:^A6K\u0016";
        objectArray[122] = "\u000b\u0013L6\"u\b\u0013X8]t\u0018VQ61FL\u0013\rol\u0011\u0005\u0010Cj2s\u0011\u0011\u000e.]a\u001cL\u0000=$,\b\u0012RQ";
        objectArray[123] = "\u0015I\u0012\t\u0015jJD\u001fNSZ@#E]\u0004$\u0014QEI\u0014?G#\u001b\tT9\u0013I\u0005NRk,";
        objectArray[124] = "\u0005-8i?\t\u0005e:o_\u000fa-/k!^\u0013-;{:\raz?d8\u0002\u001f,)|df";
        objectArray[125] = "\b\u007f|^\u000bP@b<^m\u0015\u0018n/:\u000eT\by;V\tS\u001c%B";
        objectArray[126] = "\u0001\u000bX32.\\V\u001f B0]JF:.\u0002\t\u0007\u001dfzU\u0001LW'}8\u0000K\u0017bB";
        objectArray[127] = "A?O\u001cc]B W\u0005SUC<M\u000b?g\u0017}\u0013US\t\u0014>K\u00147\fH*\u0012\u001dS";
        objectArray[128] = "A\u0019L{mXM\u0015Fp\u000f\u0005R\u0005@nth@EM4a\u0001D\u0013@;\u000f\u0003R\u0006\u0018sr\f\u0013\u0007G\n";
        objectArray[129] = "y4|l\b-4 \">d1d!z:\b\u00033f!d[T04!6\u0015:2=y?d";
        objectArray[130] = "{N s\u001dPm\u0002-{s\u0004j@+{\u001f6=\u0007p%Ca>Upw\u0002\u000f<\\(~s";
        objectArray[131] = "\u0000g\u0007S\u0014-\u0000/\u0005Ut(dg\u0010Q\nz\u0016g\u0004A\u0011)dn\u0004\u0004N%\u0004#\u0002Y\u001dB";
        objectArray[132] = "\u007f#\u0012rr|%!\u0006w\u0014l\u001fb\u0005uj=mb\u0011eqn\u001f5\u0015zsaac\u0003b/\u0005";
        objectArray[133] = "]q5%Fa\u001c7*#\u0002\u0002\u0001'**Zn3skq\u0001:d)l;X{\b.k/\u0004\u0002\u0007p'/Dn\u0000w3s=a^;33QfY/oJ^8\u0015//&Y?\u0001sV";
        objectArray[134] = "uB$OT{a\u001d&\u001dh1{]0\f\u0005\u001b\u001c\u0010#\u0001\u0012tq\u0011$AWKuB$OT{a\u001d&\u001dh";
        objectArray[135] = "b\u0017\u0002\\um8\f\u0007OJ7=\nf\u00110#&S\u000b\u00107cclWZ;(c\u0001V]{m\\]\u001cQ0m1\\\u001b\u0011uR";
        objectArray[136] = "46\u0012*\u0001y+?H%db78\u0012?\bPg{Jgd7!|H?\u0004z'!\u001bX]na/\u00036_g9&r";
        objectArray[137] = "H~\u0019U\u001ef\u0011}\u0010RXX\u001aBYQ\f&I0YE\u001c=\u001aBPEYb\u0016\"\u001dC\u00041q";
        objectArray[138] = ";k\u000e?\u000ep?=\u00030`t)+\u0003e\u001b\u0019;k\u000e?\u000ep?=\u00030`r)([x\u001d}h)\u0004\u0001";
        objectArray[139] = "\u001b6\u001aktV\u0013m\u001a}\r\u000b\u000f\u007f\u0006\u0016fP\u00061\u0014\u007fb\u0006\u000b>z";
        objectArray[140] = ";\u0017y\u0013&\u0015a\f|\u0000\u0019Pl\nq\b|*<\u0005&\u0004hD>\f~\r\u0019";
        objectArray[141] = "\u001f}XMB9\u0018n\u0014I;5\fp\u0005VW\u0007Q7_\t;i\\~\u0005\\\u0005o^m\u0001\u0001;i_f\f\u000fC3\u001do\u0014\t;";
        objectArray[142] = "zk0\u0001L\u000eyk$\u000f3\u000fi.-\u0001_==kqY\u000bjz*)\u0004]\u000b59r[3";
        objectArray[143] = "\twGGweSlBTH&PVJW)3Qw#\u0002!a\\}M\u0000(9U\f\u001aRs1Fb\u0018[+87";
        objectArray[144] = "M\u00047t\\\u000f\u0000\u0002j';\u0001\u001c\u0012k\"lVFB7N\u0002\u0006F\u0014~ \u0000\u000f\u001e\u001d";
        objectArray[145] = "09v\u00035\u0005006\u001eY\u0018\u000fo!\t'C}o5\u0019<\u0010\u000f81\u0006>\u001fqn'\u001eb{";
        objectArray[146] = "W#Ek/+W*\u0005vC7hu\u0012a=m\u001au\u0006q&>h\"\u0002n$1\u0016t\u0014vxU";
        objectArray[147] = "\u001f9\u0002pI\u0000\u0010u@b.Z\u00188!hJF\u0013D\u001c;_^\u0007(\u001b<K\u0002~";
        objectArray[148] = "\u0014\u0012&n\u0014h\u0002D(*)?nUd9\u0016:\u0017U m\u0019V";
        objectArray[149] = "W(J7c\u0015F6Q0\u0004\u0002%lW`zSWlCpa\u0000%l\u0000r9\u000bO5T2`\u0019%";
        objectArray[150] = "\u0007IYL@kJO\u0004\u001f'nZN\u0001\u0011K\\\u000e\n[L';L\n[\u0011GvJW\bv\u001eb\fY\u0010\u0018\u001ckTPa";
        objectArray[151] = "T\u0016b\nAYJQdX~\\^Q\u0015\r\u0003^3Ne\u0018\u001bJ_Ib\fG3";
        objectArray[152] = "\u00167\u001e\u0010Q{\u001f0\u001f\f7`1YHIId\n\"\u0015\u0014\u000ewz";
        objectArray[153] = "HFr2F\u0004\u0018\u00193?\u0002m\u0018\u007f22\u0012\u0013I\r2&\u0002\b\u001a\u007f;&GW\u0016\u001fv \u001a\u0004q";
        objectArray[154] = "2[R\u0013\u0014>zF\u0012\u0013ra?U\u0016\u001e\u000eg98\u0015N\u0012}:\u0003\u001d\u0015\u0012kC";
        objectArray[155] = "Ri5^\u0011lR-aQ}tUx!\b\u0001rS\u0015\"X\u001dhP.*\u0003\u001d~)";
        objectArray[156] = "$&G@\u0017E0yE\u0012+\u000f*9S\u0003F$Mt@\u000eQJ uGN\u0014u$&G@\u0017E0yE\u0012+";
        objectArray[157] = "\u0015\u0012\u0006(N\u0001]\u000fF((E\t\u0014_2E~\nq\u0001 VNZ\bR4\u0015\u0006\u000fqS5V\u000e\u001d\f\\tWQd";
        objectArray[158] = "hR;\u001e8t%TfM_z9DgH\b-c\u00149$f}cBrJdt;K";
        Object[] objectArray2 = objectArray;
        objectArray[159] = "(FUUY/;A\u0017K:rD\u0000DFD/6\u0000PV_|DWTI]s:\u0001BQ\u0001\u0017";
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = eU.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x148CA4297AAAL;
        CallSite callSite = eU.h("e", (Object)eU.h("e", (Object)eU.h("\u00d2", (long)3247666513544547706L, (long)l), (long)3252570628558583538L, (long)l), (long)3251798050040762533L, (long)l);
        CallSite callSite2 = eU.h("G", (long)3250282747259509821L, (long)l);
        while (eU.h("e", (Object)callSite, (long)3248128308117255135L, (long)l) != false) {
            block10: {
                dV dV2;
                block11: {
                    CallSite callSite3;
                    dV dV3;
                    block9: {
                        dV3 = (dV)((Object)eU.h("e", (Object)callSite, (long)3252900791910497542L, (long)l));
                        try {
                            try {
                                try {
                                    callSite3 = eU.h("e", dV3.getClass(), eD.class, (long)3252983653390700839L, (long)l);
                                    if (callSite2 != null) break block9;
                                    if (callSite3 == false) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw eU.h("G", (Object)matchException, (long)3250452889639291102L, (long)l);
                                }
                                dV2 = dV3;
                                if (callSite2 != null) break block11;
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)3250452889639291102L, (long)l);
                            }
                            callSite3 = eU.h("e", (Object)dV2, (long)3249356227000965213L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)3250452889639291102L, (long)l);
                        }
                    }
                    try {
                        if (callSite3 == false) break block10;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        eU.h("e", (Object)dV3, (Object)objectArray2, (long)3247207130579887149L, (long)l);
                        dV2 = dV3;
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)3250452889639291102L, (long)l);
                    }
                }
                Object[] objectArray3 = new Object[1];
                objectArray3[0] = l2;
                eU.h("e", (Object)dV2, (Object)objectArray3, (long)3247207130579887149L, (long)l);
            }
            if (callSite2 == null) continue;
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == '\u00ce' || c == '\u00d2' || c == '\u00e0') {
                field = eU.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eU.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AE6;
        if (s[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])t.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eU", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            eU.s[n2] = l4;
        }
        return s[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eU.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static Color a(Object[] objectArray) {
        Object object;
        block8: {
            CallSite callSite;
            long l;
            long l2;
            Color color;
            Color color2;
            float f;
            float f10;
            block9: {
                Object object2;
                block6: {
                    block7: {
                        f10 = ((Float)objectArray[0]).floatValue();
                        f = ((Float)objectArray[1]).floatValue();
                        color2 = (Color)objectArray[2];
                        color = (Color)objectArray[3];
                        l2 = (Long)objectArray[4];
                        l = (l2 = k ^ l2) ^ 0x1FB001443426L;
                        callSite = eU.h("\u00d2", (long)-191596313043677254L, (long)l2);
                        CallSite callSite2 = eU.h("G", (long)-189910258218496901L, (long)l2);
                        try {
                            try {
                                try {
                                    object2 = color2;
                                    if (callSite2 != null) break block6;
                                    if (object2 == null) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw eU.h("G", (Object)matchException, (long)-189728435600140136L, (long)l2);
                                }
                                object = color;
                                if (callSite2 != null) break block8;
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)-189728435600140136L, (long)l2);
                            }
                            if (object != null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)-189728435600140136L, (long)l2);
                        }
                    }
                    object2 = callSite;
                }
                return object2;
            }
            Object[] objectArray2 = new Object[4];
            objectArray2[3] = l;
            objectArray2[2] = (double)((eU.h("G", (double)((double)eU.h("G", (long)-190302444152977408L, (long)l2) / 1.0E8 * (double)f * 400000.0 + (double)(f10 * 0.55f)), (long)-190457988384240922L, (long)l2) + 1.0) * 0.5);
            objectArray2[1] = color;
            objectArray2[0] = color2;
            callSite = eU.h("G", (Object)objectArray2, (long)-192118989316617248L, (long)l2);
            object = callSite;
        }
        return object;
    }

    @bP
    public void a(bt_0 bt_02) {
        ArrayList arrayList;
        long l;
        long l2;
        long l3;
        long l4;
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l5;
            long l6;
            block9: {
                block10: {
                    long l7 = l4 = k ^ 0x3A4ABB77958FL;
                    l3 = l7 ^ 0x32C68A8B1428L;
                    l2 = l7 ^ 0x87EA1D63F83L;
                    l6 = l7 ^ 0x715597C783CFL;
                    l = l7 ^ 0x5163DCB7712DL;
                    l5 = l7 ^ 0x74ED547CBEECL;
                    callSite2 = eU.h("G", (long)2306814696897040677L, (long)l4);
                    try {
                        try {
                            callSite = eU.h("e", (Object)this.i, (long)2308101868996694303L, (long)l4);
                            if (callSite2 != null) break block9;
                            if (callSite == false) break block10;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)2306912699891484102L, (long)l4);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l2;
                        eU.h("e", (Object)this.j, (Object)objectArray, (long)2323702398580656477L, (long)l4);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)2306912699891484102L, (long)l4);
                    }
                }
                callSite = eU.h("e", (Object)((Boolean)((Object)eU.h("e", (Object)this.d, (long)2307148032443374184L, (long)l4))), (long)2307886988862704694L, (long)l4);
            }
            CallSite callSite3 = callSite;
            Object[] objectArray = new Object[1];
            objectArray[0] = l5;
            long l8 = (long)eU.h("G", (float)eU.h("e", (Object)this.j, (Object)objectArray, (long)2307980504709387066L, (long)l4), (float)20.0f, (long)2323745371037011562L, (long)l4);
            reference var18_11 = eU.d("n", (int)30169, (long)(0x3F75921BA99FCF21L ^ l4));
            while (var18_11 <= l8) {
                block12: {
                    arrayList = this.i;
                    if (callSite2 != null) break block11;
                    CallSite callSite4 = eU.h("e", (Object)arrayList, (long)2321846230195679917L, (long)l4);
                    while (eU.h("e", (Object)callSite4, (long)2309091181661863623L, (long)l4) != false) {
                        b0 b02 = (b0)((Object)eU.h("e", (Object)callSite4, (long)2322873652671967262L, (long)l4));
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l6;
                            objectArray2[0] = (boolean)callSite3;
                            eU.h("e", (Object)b02, (Object)objectArray2, (long)2306205441153147776L, (long)l4);
                            if (callSite2 == null) {
                                if (callSite2 == null) continue;
                                break;
                            }
                            break block12;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)2306912699891484102L, (long)l4);
                        }
                    }
                    var18_11 += eU.d("n", (int)15140, (long)(0x655065DE994781DEL ^ l4));
                }
                if (callSite2 == null) continue;
            }
            arrayList = this.i;
        }
        eU.h("e", (Object)arrayList, this::lambda$onRenderWorld$0, (long)2321931230346366698L, (long)l4);
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        eU.h("e", (Object)this.j, (Object)objectArray, (long)2323702398580656477L, (long)l4);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        Object[] objectArray5 = new Object[5];
        objectArray5[4] = l;
        objectArray5[3] = eU.h("e", (Object)eU.h("G", (Object)objectArray4, (long)2305984373464981107L, (long)l4), (long)2308791454396773531L, (long)l4);
        objectArray5[2] = eU.h("e", (Object)eU.h("G", (Object)objectArray3, (long)2305984373464981107L, (long)l4), (long)2307769474261549546L, (long)l4);
        objectArray5[1] = this.i;
        objectArray5[0] = bt_02;
        eU.h("e", (Object)this, (Object)objectArray5, (long)2322433692095830552L, (long)l4);
    }

    @bP
    public void a(aK aK2) {
        long l;
        long l2 = l = k ^ 0x12E3C2969F1DL;
        long l3 = l2 ^ 0x34F511DE5F03L;
        long l4 = l2 ^ 0x485FD4E7C7E0L;
        CallSite callSite = eU.h("e", (Object)aK2, (Object)new Object[0], (long)3071403388232213282L, (long)l);
        CallSite callSite2 = eU.h("G", (long)3067332979095493559L, (long)l);
        for (int i = 0; i < eU.h("e", (Object)((Integer)((Object)eU.h("e", (Object)this.a, (long)3068792204117299450L, (long)l))), (long)3073901645252774593L, (long)l); ++i) {
            CallSite callSite3;
            try {
                try {
                    callSite3 = eU.h("e", (Object)this.i, (long)3067831954024343062L, (long)l);
                    if (callSite2 != null || callSite3 > eU.h("e", (Object)((Integer)((Object)eU.h("e", (Object)this.c, (long)3068792204117299450L, (long)l))), (long)3073901645252774593L, (long)l) * eU.c("n", (int)9975, (long)(0x11EFCA14C04C61A3L ^ l))) {
                        continue;
                    }
                }
                catch (MatchException matchException) {
                    throw eU.h("G", (Object)matchException, (long)3067483826574823252L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eU.h("G", (Object)matchException, (long)3067483826574823252L, (long)l);
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l4;
            objectArray[0] = callSite;
            callSite3 = eU.h("e", (Object)this.i, (Object)new b0((class_243)eU.h("G", (Object)objectArray, (long)3074301873909673456L, (long)l), new class_243((double)(eU.h("e", (Object)callSite, (long)3074894883999244682L, (long)l) + (eU.h("G", (long)3075792804970340521L, (long)l) - 0.5) * 0.5), (double)(eU.h("e", (Object)callSite, (long)3068377035769971789L, (long)l) + eU.h("G", (long)3075792804970340521L, (long)l) * 1.0 + 0.5), (double)(eU.h("e", (Object)callSite, (long)3067118541119495753L, (long)l) + (eU.h("G", (long)3075792804970340521L, (long)l) - 0.5) * 0.5)), s_0.LEGACY, l3), (long)3069118250623178119L, (long)l);
            if (callSite2 == null) continue;
        }
    }

    @bP
    public void a(bg_0 bg_02) {
        block22: {
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            long l;
            long l2;
            long l3;
            block24: {
                class_2663 class_26632;
                block23: {
                    CallSite callSite4;
                    block21: {
                        long l4 = l3 = k ^ 0x2549D66DCB46L;
                        l2 = l4 ^ 0x35F05250B58L;
                        l = l4 ^ 0x7FF5C01C93BBL;
                        callSite3 = eU.h("G", (long)9136234356403638252L, (long)l3);
                        try {
                            if (eU.h("e", (Object)((Boolean)((Object)eU.h("e", (Object)this.e, (long)9137168031911052449L, (long)l3))), (long)9137344041463190271L, (long)l3) == false) {
                                return;
                            }
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                        }
                        callSite2 = eU.h("e", (Object)bg_02, (Object)new Object[0], (long)9147439732831483455L, (long)l3);
                        try {
                            try {
                                callSite4 = callSite2;
                                if (callSite3 != null) break block21;
                                if (!(callSite4 instanceof class_2663)) break block22;
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                            }
                            callSite4 = callSite2;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                        }
                    }
                    class_2663 class_26633 = (class_2663)callSite4;
                    try {
                        try {
                            class_26632 = class_26633;
                            if (callSite3 != null) break block23;
                            if (eU.h("e", (Object)class_26632, (long)9148172623969770277L, (long)l3) != eU.c("n", (int)21734, (long)(0x458AF6B07535C7E8L ^ l3))) break block22;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                        }
                        class_26632 = class_26633;
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                    }
                }
                CallSite callSite5 = eU.h("e", (Object)class_26632, (Object)eU.h("\u00e6", (Object)b, (long)9136255808645142258L, (long)l3), (long)9136055480442834175L, (long)l3);
                try {
                    try {
                        callSite = callSite5;
                        if (callSite3 != null) break block24;
                        if (!(callSite instanceof class_1657)) break block22;
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                    }
                    callSite = callSite5;
                }
                catch (MatchException matchException) {
                    throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                }
            }
            callSite2 = (class_1657)callSite;
            for (int i = 0; i < eU.h("e", (Object)((Integer)((Object)eU.h("e", (Object)this.a, (long)9137168031911052449L, (long)l3))), (long)9147803601311932058L, (long)l3) * 2; ++i) {
                CallSite callSite6;
                try {
                    try {
                        callSite6 = eU.h("e", (Object)this.i, (long)9135577418215322189L, (long)l3);
                        if (callSite3 != null || callSite6 > eU.h("e", (Object)((Integer)((Object)eU.h("e", (Object)this.c, (long)9137168031911052449L, (long)l3))), (long)9147803601311932058L, (long)l3) * eU.c("n", (int)4735, (long)(0x3E2AAA47D7670177L ^ l3))) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                    }
                }
                catch (MatchException matchException) {
                    throw eU.h("G", (Object)matchException, (long)9136347768833760015L, (long)l3);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l;
                objectArray[0] = callSite2;
                callSite6 = eU.h("e", (Object)this.i, (Object)new b0((class_243)eU.h("G", (Object)objectArray, (long)9147139519895533995L, (long)l3), new class_243((double)(eU.h("e", (Object)callSite2, (long)9133448481300710822L, (long)l3) + (eU.h("G", (long)9148041096072197362L, (long)l3) - 0.5) * 0.5), (double)(eU.h("e", (Object)callSite2, (long)9149026478797140959L, (long)l3) + eU.h("G", (long)9148041096072197362L, (long)l3) * 1.0 + 0.5), (double)(eU.h("e", (Object)callSite2, (long)9137026117158555994L, (long)l3) + (eU.h("G", (long)9148041096072197362L, (long)l3) - 0.5) * 0.5)), s_0.POP, l2), (long)9136824407143694812L, (long)l3);
                if (callSite3 == null) continue;
            }
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (v[n3] != null) {
            return n3;
        }
        Object object = u[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 35;
            case 1 -> 13;
            case 2 -> 24;
            case 3 -> 22;
            case 4 -> 47;
            case 5 -> 48;
            case 6 -> 11;
            case 7 -> 3;
            case 8 -> 9;
            case 9 -> 53;
            case 10 -> 1;
            case 11 -> 54;
            case 12 -> 50;
            case 13 -> 17;
            case 14 -> 55;
            case 15 -> 59;
            case 16 -> 46;
            case 17 -> 34;
            case 18 -> 62;
            case 19 -> 42;
            case 20 -> 49;
            case 21 -> 52;
            case 22 -> 20;
            case 23 -> 7;
            case 24 -> 0;
            case 25 -> 8;
            case 26 -> 23;
            case 27 -> 56;
            case 28 -> 33;
            case 29 -> 61;
            case 30 -> 5;
            case 31 -> 29;
            case 32 -> 60;
            case 33 -> 43;
            case 34 -> 15;
            case 35 -> 12;
            case 36 -> 36;
            case 37 -> 16;
            case 38 -> 39;
            case 39 -> 31;
            case 40 -> 38;
            case 41 -> 45;
            case 42 -> 44;
            case 43 -> 41;
            case 44 -> 40;
            case 45 -> 58;
            case 46 -> 37;
            case 47 -> 2;
            case 48 -> 18;
            case 49 -> 26;
            case 50 -> 6;
            case 51 -> 25;
            case 52 -> 10;
            case 53 -> 32;
            case 54 -> 4;
            case 55 -> 27;
            case 56 -> 57;
            case 57 -> 51;
            case 58 -> 14;
            case 59 -> 30;
            case 60 -> 63;
            case 61 -> 28;
            case 62 -> 19;
            default -> 21;
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
        eU.v[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eU.m(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            String string = v[n];
            int n2 = string.indexOf(8);
            Class clazz = eU.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eU.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eU.g(clazz3, string2, clazz2)) != null) {
                    eU.u[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eU.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eU.u[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eU.n(1234484662249521L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eU.m(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = v[n];
                int n3 = string2.indexOf(8);
                clazz3 = eU.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eU.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eU.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eU.u[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eU.n(1234484662249521L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eU.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eU.u[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eU.n(1234484662249521L, 0L);
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

    public static void k(Object[] objectArray) {
        bW bW2;
        long l;
        long l2;
        long l3;
        float f;
        Color color;
        b0 b02;
        bt_0 bt_02;
        block13: {
            Object object;
            block12: {
                CallSite callSite;
                long l4;
                block10: {
                    block11: {
                        bt_02 = (bt_0)objectArray[0];
                        b02 = (b0)objectArray[1];
                        color = (Color)objectArray[2];
                        f = ((Float)objectArray[3]).floatValue();
                        l3 = (Long)objectArray[4];
                        long l5 = l3 = k ^ l3;
                        l4 = l5 ^ 0x43D1E5A176BEL;
                        l2 = l5 ^ 0xEAF840681D1L;
                        l = l5 ^ 0x6867E571DD96L;
                        callSite = eU.h("G", (long)-8316978535600915022L, (long)l3);
                        try {
                            try {
                                object = eU.f;
                                if (callSite != null) break block10;
                                if (object != null) break block11;
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)-8316856275764172463L, (long)l3);
                            }
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l4;
                            objectArray2[0] = eU.b("r", (int)12454, (long)(0x14D5EB48A126DB35L ^ l3));
                            eU.f = eU.h("G", (Object)objectArray2, (long)-8314034240752304181L, (long)l3);
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)-8316856275764172463L, (long)l3);
                        }
                    }
                    object = g;
                }
                try {
                    try {
                        if (callSite != null) break block12;
                        if (object != null) break block13;
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)-8316856275764172463L, (long)l3);
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l4;
                    objectArray3[0] = eU.b("r", (int)5186, (long)(0x4615129995BFFD0L ^ l3));
                    object = eU.h("G", (Object)objectArray3, (long)-8314034240752304181L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw eU.h("G", (Object)matchException, (long)-8316856275764172463L, (long)l3);
                }
            }
            g = object;
        }
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l;
        objectArray4[3] = (double)eU.h("\u00e6", (Object)b02.c, (long)-8309974064907245452L, (long)l3);
        objectArray4[2] = (double)eU.h("\u00e6", (Object)b02.c, (long)-8313784616481393780L, (long)l3);
        objectArray4[1] = (double)eU.h("\u00e6", (Object)b02.c, (long)-8309507927359617953L, (long)l3);
        objectArray4[0] = bt_02.b;
        CallSite callSite = eU.h("G", (Object)objectArray4, (long)-8317782368877822919L, (long)l3);
        try {
            bW2 = eU.h("e", (Object)((Object)b02.g), (Object)((Object)s_0.POP), (long)-8311067592426548705L, (long)l3) != false ? g : eU.f;
        }
        catch (MatchException matchException) {
            throw eU.h("G", (Object)matchException, (long)-8316856275764172463L, (long)l3);
        }
        bW bW3 = bW2;
        Matrix4f matrix4f = new Matrix4f();
        eU.h("e", (Object)matrix4f, (float)((float)eU.h("\u00e6", (Object)callSite, (long)-8314230846658073456L, (long)l3)), (float)((float)eU.h("\u00e6", (Object)callSite, (long)-8316598874251435824L, (long)l3)), (float)((float)eU.h("\u00e6", (Object)callSite, (long)-8317244162028678444L, (long)l3)), (long)-8313650056734289743L, (long)l3);
        eU.h("e", (Object)matrix4f, (float)0.04f, (long)-8314628934912891597L, (long)l3);
        eU.h("e", (Object)matrix4f, (float)((float)eU.h("G", (double)((double)(-eU.h("e", (Object)eU.h("e", (Object)bt_02.b, (long)-8309372930327384950L, (long)l3), (long)-8316316880253372927L, (long)l3))), (long)-8310596457931019819L, (long)l3)), (long)-8309645461811894746L, (long)l3);
        eU.h("e", (Object)matrix4f, (float)((float)eU.h("G", (double)((double)eU.h("e", (Object)eU.h("e", (Object)bt_02.b, (long)-8309372930327384950L, (long)l3), (long)-8314337290530139125L, (long)l3)), (long)-8310596457931019819L, (long)l3)), (long)-8311239428980294970L, (long)l3);
        Object[] objectArray5 = new Object[13];
        objectArray5[12] = l2;
        objectArray5[11] = Float.valueOf(0.0f);
        objectArray5[10] = color;
        objectArray5[9] = Float.valueOf(0.0f);
        objectArray5[8] = Float.valueOf(f);
        objectArray5[7] = Float.valueOf(f);
        objectArray5[6] = Float.valueOf(0.0f);
        objectArray5[5] = Float.valueOf(0.0f);
        objectArray5[4] = Float.valueOf(0.0f);
        objectArray5[3] = bW3;
        objectArray5[2] = matrix4f;
        objectArray5[1] = bt_02.b;
        objectArray5[0] = bt_02.a;
        eU.h("G", (Object)objectArray5, (long)-8309488546152649032L, (long)l3);
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

    public void j(Object[] objectArray) {
        bt_0 bt_02 = (bt_0)objectArray[0];
        ArrayList arrayList = (ArrayList)objectArray[1];
        Color color = (Color)objectArray[2];
        Color color2 = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x341F3FAB7153L;
        long l4 = l2 ^ 0x7DADB0E241B6L;
        long l5 = l2 ^ 0xACB3B70DDBAL;
        long l6 = l2 ^ 0x6F7D202AAC73L;
        long l7 = l2 ^ 0xA2F48C2ADFL;
        CallSite callSite = eU.h("\u00e6", (Object)eU.h("e", (Object)b, (long)-1964223444010705296L, (long)l), (long)-1966034867614399838L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite2 = eU.h("G", (Object)objectArray2, (long)-1981527466605127098L, (long)l);
        CallSite callSite3 = eU.h("G", (long)-1963773971375843943L, (long)l);
        int n = 0;
        CallSite callSite4 = eU.h("e", new ArrayList(arrayList), (long)-1980197777784015343L, (long)l);
        while (eU.h("e", (Object)callSite4, (long)-1965895493049386373L, (long)l) != false) {
            float f;
            Color color3;
            b0 b02;
            bt_0 bt_03;
            b0 b03;
            block21: {
                reference v3;
                block20: {
                    reference var25_19;
                    block18: {
                        block19: {
                            block17: {
                                b03 = (b0)((Object)eU.h("e", (Object)callSite4, (long)-1981382611348573022L, (long)l));
                                ++n;
                                CallSite callSite5 = eU.h("e", (Object)b03, (Object)new Object[0], (long)-1980828340995264570L, (long)l);
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l7;
                                var25_19 = eU.h("e", (Object)eU.h("G", (Object)objectArray3, (long)-1964108835420508108L, (long)l), (Object)callSite5, (long)-1979361220374660819L, (long)l);
                                try {
                                    v3 = eU.h("e", (Object)eU.h("e", (Object)eU.h("\u00e6", (Object)b, (long)-1963665064884958073L, (long)l), (Object)eU.h("G", (Object)callSite5, (long)-1965546597302203261L, (long)l), (long)-1981269249240507209L, (long)l), (long)-1965512431988686074L, (long)l);
                                    if (callSite3 != null) break block17;
                                    if (v3 == false) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
                                }
                                v3 = (reference)(n % eU.c("n", (int)11613, (long)(0x5C2A82A9A86D2423L ^ l)));
                            }
                            try {
                                try {
                                    try {
                                        if (callSite3 != null) break block18;
                                        if (v3 == false) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
                                    }
                                    reference v3 = var25_19 - 25.0;
                                    v3 = v3 == 0 ? 0 : (v3 > 0 ? 1 : -1);
                                    if (callSite3 != null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
                                }
                                if (v3 > 0) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
                            }
                        }
                        v3 = (reference)(n % 3);
                    }
                    try {
                        try {
                            if (callSite3 != null) break block20;
                            if (v3 != false) break block21;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
                        }
                        reference v3 = var25_19 - 15.0;
                        v3 = v3 == 0 ? 0 : (v3 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
                    }
                }
                if (v3 > 0) continue;
            }
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l4;
            objectArray4[0] = Float.valueOf((float)eU.h("e", (Object)((Integer)((Object)eU.h("e", (Object)this.c, (long)-1965657764218167596L, (long)l))), (long)-1979701819929525009L, (long)l) * 1000.0f);
            CallSite callSite6 = eU.h("e", (Object)b03, (Object)objectArray4, (long)-1965118274729230814L, (long)l);
            Object object = (int)(255.0f * (1.0f - callSite6));
            object = eU.h("G", (int)object, (int)0, (int)eU.c("n", (int)29304, (long)(0x54CB57F03F20FB01L ^ l)), (long)-1980709417876189303L, (long)l);
            Object[] objectArray5 = new Object[5];
            objectArray5[4] = l6;
            objectArray5[3] = color2;
            objectArray5[2] = color;
            objectArray5[1] = Float.valueOf(0.5f);
            objectArray5[0] = Float.valueOf((float)n / 5.0f);
            CallSite callSite7 = eU.h("G", (Object)objectArray5, (long)-1965080948891528061L, (long)l);
            Color color4 = new Color((int)eU.h("e", (Object)callSite7, (long)-1963849308323910785L, (long)l), (int)eU.h("e", (Object)callSite7, (long)-1967680884595196913L, (long)l), (int)eU.h("e", (Object)callSite7, (long)-1979413823519462284L, (long)l), (int)object);
            try {
                bt_03 = bt_02;
                b02 = b03;
                color3 = color4;
                f = eU.h("e", (Object)((Object)b03.g), (Object)((Object)s_0.POP), (long)-1980944044608521676L, (long)l) != false ? 7.0f : 4.5f;
            }
            catch (MatchException matchException) {
                throw eU.h("G", (Object)matchException, (long)-1963575329439071878L, (long)l);
            }
            Object[] objectArray6 = new Object[5];
            objectArray6[4] = l5;
            objectArray6[3] = Float.valueOf(f);
            objectArray6[2] = color3;
            objectArray6[1] = b02;
            objectArray6[0] = bt_03;
            eU.h("G", (Object)objectArray6, (long)-1979825784452749819L, (long)l);
            if (callSite3 == null) continue;
        }
    }

    private boolean lambda$onRenderWorld$0(b0 b02) {
        Object object;
        block6: {
            block8: {
                block7: {
                    long l = k ^ 0x593299AFBCBDL;
                    long l2 = l ^ 0x3C52DA492E20L;
                    CallSite callSite = eU.h("G", (long)662329065103620119L, (long)l);
                    try {
                        try {
                            try {
                                reference cfr_temp_0 = eU.h("G", (double)eU.h("e", (Object)eU.h("\u00e6", (Object)b, (long)666384452758141013L, (long)l), (Object)eU.h("e", (Object)b02, (Object)new Object[0], (long)652171072898433608L, (long)l), (long)652494976321781438L, (long)l), (long)663598841968722862L, (long)l) - 20.0;
                                object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                if (callSite != null) break block6;
                                if (object > 0) break block7;
                            }
                            catch (MatchException matchException) {
                                throw eU.h("G", (Object)matchException, (long)662503691429260532L, (long)l);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l2;
                            objectArray[0] = Float.valueOf((float)(eU.h("e", (Object)((Integer)((Object)eU.h("e", (Object)this.c, (long)663930824753640282L, (long)l))), (long)651045658861431137L, (long)l) * eU.c("n", (int)14578, (long)(0x73C3E4CBBB02DC04L ^ l))));
                            object = eU.h("e", (Object)eU.h("e", (Object)b02, (Object)new Object[0], (long)665246910170341761L, (long)l), (Object)objectArray, (long)666471138734144696L, (long)l);
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw eU.h("G", (Object)matchException, (long)662503691429260532L, (long)l);
                        }
                        if (object == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw eU.h("G", (Object)matchException, (long)662503691429260532L, (long)l);
                    }
                }
                object = 1;
                break block6;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eU.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eU.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eU.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eU.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

