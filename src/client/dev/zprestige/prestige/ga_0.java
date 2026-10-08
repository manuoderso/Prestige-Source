/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.dq_0;
import dev.zprestige.prestige.gC;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gY;
import dev.zprestige.prestige.gd_0;
import dev.zprestige.prestige.ge_0;
import dev.zprestige.prestige.hc;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Renamed from dev.zprestige.prestige.ga
 */
public class ga_0 {
    protected bS a;
    protected bS b;
    protected gd_0 c;
    private boolean d = 0;
    private final List e = new ArrayList();
    public float f = 0.0f;
    private static final long g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;
    private static final long[] k;
    private static final Long[] l;
    private static final Map m;
    private static final Object[] n;
    private static final String[] o;

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        ga_0.g = hc.a(-1426177497445602800L, 2949560170388933502L, MethodHandles.lookup().lookupClass()).a(246259743523515L);
                        ga_0.n = new Object[79];
                        ga_0.o = new String[79];
                        ga_0.a();
                        ga_0.j = new HashMap<K, V>(13);
                        var11 = ga_0.g ^ 60691079151082L;
                        var13_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new long[4];
                        var16_4 = 0;
                        var17_5 = "\u0002\u009dT\u00db-\u000f\u00e1\u0090\u00bd\u009dp_\u008a\u00c1\u00ac_";
                        var18_6 = "\u0002\u009dT\u00db-\u000f\u00e1\u0090\u00bd\u009dp_\u008a\u00c1\u00ac_".length();
                        var15_7 = 0;
                        while (true) {
                            var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                            v3 = var19_3;
                            v4 = var16_4++;
                            v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            var17_5 = "\u00e6\u0094e\u00d0\u0002\u000e\t\u00ac[\u001c}[\u00a8G\u00eb=";
                            var18_6 = "\u00e6\u0094e\u00d0\u0002\u000e\t\u00ac[\u001c}[\u00a8G\u00eb=".length();
                            var15_7 = 0;
                            while (true) {
                                var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                                v3 = var19_3;
                                v4 = var16_4++;
                                v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var21_9 = v5;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    v7 = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl73:
                        // 1 sources

                        ** continue;
                    }
                }
                ga_0.h = var19_3;
                ga_0.i = new Integer[4];
                ga_0.m = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u00e1\u00a7\u009e2\u0097\u00f0\u0096\u0000\u001c\u0083+\u00d7\u00d1/\u00e6\u00f8";
                var5_16 = "\u00e1\u00a7\u009e2\u0097\u00f0\u0096\u0000\u001c\u0083+\u00d7\u00d1/\u00e6\u00f8".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        ga_0.k = var6_13;
        ga_0.l = new Long[2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ga" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = ga_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x430D;
        if (ga_0.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ga", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            ga_0.l[n2] = l4;
        }
        return ga_0.l[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ga_0.a(l, l2);
            object = ga_0.n[n];
            try {
                if (!(object instanceof String)) break block2;
                ga_0.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ga_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ga_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ga_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ga_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void b(Object[] objectArray) {
        dq_0 dq_02 = (dq_0)objectArray[0];
        long l = (Long)objectArray[1];
        l = g ^ l;
        ga_0.c("r", (Object)this.e, (Object)new gY(dq_02, this.f), (long)-2754401949148766401L, (long)l);
        this.f = (float)ga_0.c("\u00e3", (float)this.f, (long)-2749354508738243061L, (long)l);
    }

    /*
     * Loose catch block
     * Could not resolve type clashes
     */
    public void c(Object[] objectArray) {
        block26: {
            Object object;
            CallSite callSite;
            long l;
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            long l7;
            long l8;
            long l9;
            long l10;
            long l11;
            gK gK2;
            block24: {
                long l12;
                block25: {
                    gK2 = (gK)objectArray[0];
                    l11 = (Long)objectArray[1];
                    long l13 = l11 = g ^ l11;
                    l10 = l13 ^ 0x4E6D02A9920AL;
                    l9 = l13 ^ 0x6325A5C9A5DDL;
                    l8 = l13 ^ 0x48B6BCB5D8F8L;
                    l7 = l13 ^ 0x6F9C5EB46191L;
                    l6 = l13 ^ 0x1D6C06FF7546L;
                    l12 = l13 ^ 0x636876BEBF41L;
                    l5 = l13 ^ 0x12DB71999EC1L;
                    l4 = l13 ^ 0x3646A4C83753L;
                    l3 = l13 ^ 0x58E23CA0E7FL;
                    l2 = l13 ^ 0xAF6004DC327L;
                    l = l13 ^ 0x29C0D37390F7L;
                    callSite = ga_0.c("\u00e3", (long)-4205953050145077453L, (long)l11);
                    object = ga_0.c("r", (Object)this.e, (long)-4204714972406625607L, (long)l11);
                    if (callSite != null) break block24;
                    try {
                        block32: {
                            if (object == false) break block25;
                            break block32;
                            catch (Throwable throwable) {
                                throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                            }
                        }
                        this.f = 0.0f;
                        return;
                    }
                    catch (Throwable throwable) {
                        throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                    }
                }
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l12;
                ga_0.c("r", (Object)this, (Object)objectArray2, (long)-4204594341754144545L, (long)l11);
                object = 0;
            }
            reference callSite2 = object;
            block20: while (true) {
                reference v5 = callSite2;
                block21: while (v5 < ga_0.c("r", (Object)this.e, (long)-4204646047101448218L, (long)l11)) {
                    block30: {
                        reference var31_19;
                        block31: {
                            CallSite callSite2;
                            CallSite callSite32;
                            CallSite callSite4;
                            CallSite callSite5;
                            CallSite callSite6;
                            block29: {
                                block28: {
                                    reference v7;
                                    List list;
                                    block27: {
                                        callSite6 = ga_0.c("r", (Object)ga_0.c("r", (Object)((gY)((Object)ga_0.c("r", (Object)this.e, (int)callSite2, (long)-4199060933899898606L, (long)l11))), (long)-4206340113490094922L, (long)l11), (Object)new Object[0], (long)-4204996211761232749L, (long)l11);
                                        reference var30_18 = callSite2;
                                        if (callSite != null) break block26;
                                        var31_19 = callSite2 + 1;
                                        while (var31_19 < ga_0.c("r", (Object)this.e, (long)-4204646047101448218L, (long)l11)) {
                                            try {
                                                list = this.e;
                                                v7 = var31_19++;
                                                if (callSite != null) break block27;
                                                v5 = ga_0.c("r", (Object)ga_0.c("r", (Object)ga_0.c("r", (Object)((gY)((Object)ga_0.c("r", (Object)list, (int)v7, (long)-4199060933899898606L, (long)l11))), (long)-4206340113490094922L, (long)l11), (Object)new Object[0], (long)-4204996211761232749L, (long)l11), (Object)callSite6, (long)-4205570600284661237L, (long)l11);
                                                if (callSite != null) continue block21;
                                            }
                                            catch (Throwable throwable) {
                                                throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                                            }
                                            try {
                                                if (v5 != false && callSite == null) continue;
                                                break;
                                            }
                                            catch (Throwable throwable) {
                                                throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                                            }
                                        }
                                        list = this.e;
                                        v7 = var30_18;
                                    }
                                    callSite5 = ga_0.c("r", (Object)list, (int)v7, (int)var31_19, (long)-4204393611170710635L, (long)l11);
                                    callSite4 = ga_0.c("r", (Object)callSite6, (long)-4205167642272521613L, (long)l11);
                                    if (callSite != null) break block28;
                                    try {
                                        block33: {
                                            if (callSite4 == null) break block29;
                                            break block33;
                                            catch (Throwable throwable) {
                                                throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                                            }
                                        }
                                        ga_0.c("\u00e3", (int)ga_0.a("m", (int)18031, (long)(0x72A2F8B944C0542DL ^ l11)), (long)-4204129716273528647L, (long)l11);
                                    }
                                    catch (Throwable throwable) {
                                        throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                                    }
                                }
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l3;
                                CallSite callSite72 = ga_0.c("\u00e3", (Object)objectArray3, (long)-4204530146331531481L, (long)l11);
                                Object[] objectArray4 = new Object[1];
                                objectArray4[0] = l2;
                                CallSite callSite8 = ga_0.c("\u00e3", (Object)objectArray4, (long)-4206269684069141769L, (long)l11);
                                ga_0.c("\u00e3", (int)((int)(ga_0.c("\u00c8", (Object)callSite4, (long)-4205027000293448918L, (long)l11) * callSite8)), (int)((int)((float)callSite72 - ga_0.c("\u00c8", (Object)callSite4, (long)-4198491958287995375L, (long)l11) * callSite8 - ga_0.c("\u00c8", (Object)callSite4, (long)-4205910131387314101L, (long)l11) * callSite8)), (int)((int)(ga_0.c("\u00c8", (Object)callSite4, (long)-4204258484861359605L, (long)l11) * callSite8)), (int)((int)(ga_0.c("\u00c8", (Object)callSite4, (long)-4205910131387314101L, (long)l11) * callSite8)), (long)-4198607917840607125L, (long)l11);
                            }
                            CallSite callSite9 = ga_0.c("r", (Object)callSite6, (long)-4199571348850496829L, (long)l11);
                            Object[] objectArray5 = new Object[3];
                            objectArray5[2] = l10;
                            objectArray5[1] = ga_0.c("r", (Object)callSite9, (Object)new Object[0], (long)-4204329235655541616L, (long)l11);
                            objectArray5[0] = this.a;
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l;
                            objectArray6[0] = ga_0.c("\u00e3", (Object)objectArray5, (long)-4199382698615471738L, (long)l11);
                            ga_0.c("r", (Object)this.c, (Object)objectArray6, (long)-4205629833434823501L, (long)l11);
                            bT bT2 = new bT((ge_0)((Object)ga_0.c("r", (Object)callSite9, (Object)new Object[0], (long)-4204329235655541616L, (long)l11)), this.a, this.b, l7);
                            try {
                                CallSite callSite10 = ga_0.c("r", (Object)callSite5, (long)-4198808575979232855L, (long)l11);
                                while (ga_0.c("r", (Object)callSite10, (long)-4204215645208833511L, (long)l11) != false) {
                                    gY gY2 = (gY)((Object)ga_0.c("r", (Object)callSite10, (long)-4204783087158389560L, (long)l11));
                                    Object[] objectArray7 = new Object[3];
                                    objectArray7[2] = l4;
                                    objectArray7[1] = Float.valueOf((float)ga_0.c("r", (Object)gY2, (long)-4199157227392017542L, (long)l11));
                                    objectArray7[0] = bT2;
                                    ga_0.c("r", (Object)ga_0.c("r", (Object)gY2, (long)-4206340113490094922L, (long)l11), (Object)objectArray7, (long)-4199499729973070972L, (long)l11);
                                    if (callSite != null) continue block20;
                                    if (callSite == null) continue;
                                }
                                Object[] objectArray8 = new Object[1];
                                objectArray8[0] = l6;
                                callSite32 = ga_0.c("r", (Object)bT2, (Object)objectArray8, (long)-4198976467046475079L, (long)l11);
                                Object[] objectArray9 = new Object[1];
                                objectArray9[0] = l5;
                                callSite2 = ga_0.c("r", (Object)bT2, (Object)objectArray9, (long)-4204895486258727155L, (long)l11);
                            }
                            catch (Throwable throwable) {
                                try {
                                    ga_0.c("r", (Object)bT2, (long)-4198844891184674336L, (long)l11);
                                }
                                catch (Throwable throwable2) {
                                    ga_0.c("r", (Object)throwable, (Object)throwable2, (long)-4205865824108272474L, (long)l11);
                                }
                                throw throwable;
                            }
                            ga_0.c("r", (Object)bT2, (long)-4198844891184674336L, (long)l11);
                            try {
                                try {
                                    Object[] objectArray10 = new Object[5];
                                    objectArray10[4] = l9;
                                    objectArray10[3] = new gC((ge_0)((Object)ga_0.c("r", (Object)callSite9, (Object)new Object[0], (long)-4204329235655541616L, (long)l11)), (int)callSite32, (int)callSite2);
                                    objectArray10[2] = this.b;
                                    objectArray10[1] = this.c;
                                    objectArray10[0] = gK2;
                                    ga_0.c("r", (Object)callSite9, (Object)objectArray10, (long)-4206213610603528359L, (long)l11);
                                    if (callSite != null) break block30;
                                    if (callSite4 == null) break block31;
                                }
                                catch (Throwable throwable) {
                                    throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                                }
                                ga_0.c("\u00e3", (int)ga_0.a("m", (int)31533, (long)(0x115242AF1EA9696EL ^ l11)), (long)-4206053091601398397L, (long)l11);
                            }
                            catch (Throwable throwable) {
                                throw ga_0.c("\u00e3", (Object)throwable, (long)-4204828517632840661L, (long)l11);
                            }
                        }
                        callSite2 = var31_19;
                    }
                    if (callSite != null) break block20;
                    continue block20;
                }
                break;
            }
            Object[] objectArray11 = new Object[1];
            objectArray11[0] = l8;
            ga_0.c("r", (Object)this, (Object)objectArray11, (long)-4199312419333847657L, (long)l11);
        }
    }

    private static Field c(long l, long l2) {
        int n = ga_0.a(l, l2);
        Object object = ga_0.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = ga_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ga_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ga_0.a(clazz3, string2, clazz2)) != null) {
                    ga_0.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ga_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ga_0.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ga_0.b(105729874490206L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ga" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = ga_0.a(l, l2);
        Object object = ga_0.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = ga_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ga_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ga_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ga_0.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ga_0.b(105729874490206L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ga_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ga_0.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ga_0.b(105729874490206L, 0L);
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

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        this.f = 0.0f;
        ga_0.c("r", (Object)this.e, (long)-8554500259261016464L, (long)l);
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == 'F' || c == '\u00ef' || c == '\u00ba') {
                field = ga_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ga_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'r' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ga_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private void a(Object[] objectArray) {
        block4: {
            ga_0 ga_02;
            long l;
            long l2;
            long l3;
            long l4;
            block5: {
                l4 = (Long)objectArray[0];
                long l5 = l4 = g ^ l4;
                l3 = l5 ^ 0x3B860103FDF1L;
                l2 = l5 ^ 0x586F0D95CB1L;
                l = l5 ^ 0x5FCAE301DB65L;
                CallSite callSite = ga_0.c("\u00e3", (long)-1230798952244188039L, (long)l4);
                try {
                    try {
                        ga_02 = this;
                        if (callSite != null) break block4;
                        if (!ga_02.d) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ga_0.c("\u00e3", (Object)matchException, (long)-1229672233624811679L, (long)l4);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw ga_0.c("\u00e3", (Object)matchException, (long)-1229672233624811679L, (long)l4);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l3;
            objectArray2[0] = bS::a;
            this.a = (bS)((Object)ga_0.c("\u00e3", (Object)objectArray2, (long)-1229175325798414951L, (long)l4));
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l3;
            objectArray3[0] = bS::a;
            this.b = (bS)((Object)ga_0.c("\u00e3", (Object)objectArray3, (long)-1229175325798414951L, (long)l4));
            Object[] objectArray4 = new Object[2];
            objectArray4[1] = l2;
            objectArray4[0] = null;
            this.c = ga_0.c("\u00e3", (Object)objectArray4, (long)-1230932051524970183L, (long)l4);
            Object[] objectArray5 = new Object[3];
            objectArray5[2] = l;
            objectArray5[1] = (long)ga_0.b("f", (int)6475, (long)(0x46F8892B8FC0B4A7L ^ l4));
            objectArray5[0] = (int)ga_0.a("m", (int)28983, (long)(0x5D852014C86E483CL ^ l4));
            ga_0.c("r", (Object)this.a, (Object)objectArray5, (long)-1228530411868514092L, (long)l4);
            Object[] objectArray6 = new Object[3];
            objectArray6[2] = l;
            objectArray6[1] = (long)ga_0.b("f", (int)27994, (long)(0x20FA3EF05984C0B7L ^ l4));
            objectArray6[0] = (int)ga_0.a("m", (int)1073, (long)(0x4CC00C2ABBB3BD3BL ^ l4));
            ga_0.c("r", (Object)this.b, (Object)objectArray6, (long)-1228530411868514092L, (long)l4);
            ga_02 = this;
        }
        ga_02.d = 1;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ga_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ga" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57EB;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ga", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ga_0.i[n2] = n3;
        }
        return i[n2];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n3] != null) {
            return n3;
        }
        Object object = ga_0.n[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 62;
            case 2 -> 19;
            case 3 -> 50;
            case 4 -> 6;
            case 5 -> 25;
            case 6 -> 42;
            case 7 -> 34;
            case 8 -> 58;
            case 9 -> 12;
            case 10 -> 59;
            case 11 -> 44;
            case 12 -> 29;
            case 13 -> 38;
            case 14 -> 27;
            case 15 -> 39;
            case 16 -> 4;
            case 17 -> 48;
            case 18 -> 18;
            case 19 -> 63;
            case 20 -> 21;
            case 21 -> 45;
            case 22 -> 57;
            case 23 -> 16;
            case 24 -> 37;
            case 25 -> 28;
            case 26 -> 24;
            case 27 -> 14;
            case 28 -> 47;
            case 29 -> 17;
            case 30 -> 26;
            case 31 -> 60;
            case 32 -> 54;
            case 33 -> 35;
            case 34 -> 3;
            case 35 -> 61;
            case 36 -> 1;
            case 37 -> 33;
            case 38 -> 51;
            case 39 -> 7;
            case 40 -> 8;
            case 41 -> 36;
            case 42 -> 55;
            case 43 -> 56;
            case 44 -> 15;
            case 45 -> 49;
            case 46 -> 10;
            case 47 -> 0;
            case 48 -> 11;
            case 49 -> 43;
            case 50 -> 41;
            case 51 -> 32;
            case 52 -> 22;
            case 53 -> 2;
            case 54 -> 23;
            case 55 -> 53;
            case 56 -> 5;
            case 57 -> 31;
            case 58 -> 30;
            case 59 -> 40;
            case 60 -> 46;
            case 61 -> 20;
            case 62 -> 9;
            default -> 52;
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
        ga_0.o[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "5*Gc\u0000L#*B9\u0013[4aA?\u001fO%&V(T[\u001d";
        objectArray[1] = "\n\fa-oU\u0001\u0003pb\u000e[\n\bt8";
        objectArray[2] = Boolean.TYPE;
        ga_0.o[2] = "java/lang/Boolean";
        objectArray[3] = "K\u000e\u001e\u001fmG]\u000e\u001bE~PJE\u0018CrD[\u0002\u000fT9PK";
        objectArray[4] = "$\"\u001al\r\u0007Q\u0002\u0011c\u001cH0\f\u001ah\u0018\u0012D";
        objectArray[5] = Void.TYPE;
        ga_0.o[5] = "java/lang/Void";
        objectArray[6] = "bB<9P\btB9cC\u001fc\t:eO\u000brN-r\u0004\u0019N";
        objectArray[7] = "\u0006\u0017&xu\u0002s7-wdM\u000e/>pm\u0004f";
        objectArray[8] = "[cb(#+^vi( ,Q\u007fbja\u001bx 4";
        objectArray[9] = Integer.TYPE;
        ga_0.o[9] = "java/lang/Integer";
        objectArray[10] = "J\u001e}p\u0005\u0017A\u0011l?\u007f\u0013R\u0010|pI\u0017E";
        objectArray[11] = "8+\u0010y&\u001e:5Y\u0001)\u0012#6\u0005c*";
        objectArray[12] = Float.TYPE;
        ga_0.o[12] = "java/lang/Float";
        objectArray[13] = "!)NIx{7)K\u0013kl bH\u0015gx1%_\u0002,o5";
        objectArray[14] = "9/k\u0003;ML\u000f`\f*\u0002-\u0001k\u0007.XY";
        objectArray[15] = "7PLD\n@!PI\u001e\u0019W6\u001bJ\u0018\u0015C'\\]\u000f^W\n";
        objectArray[16] = "\u001c\u0003?do9\n\u0003:>|.\u001dH98p:\f\u000f./;-\t";
        objectArray[17] = "\u0013\u0010YC\u000eW\u0005\u0010\\\u0019\u001d@\u0012[_\u001f\u0011T\u0003\u001cH\bZC\u0003";
        objectArray[18] = "$]\fD3DQ}\u0007K\"\u000b0s\f@&QD";
        objectArray[19] = "GX.y\n\b2x%v\u001bGSv.}\u001f\u001d'";
        objectArray[20] = "0\u000b\u001389^&\u000b\u0016b*I1@\u0015d&] \u0007\u0002smI1";
        objectArray[21] = "M\u0011P7L=S\u0019Jx+<B\u0002G\"\r:";
        objectArray[22] = "&k\u00107y)0k\u0015mj>' \u0016kf*6g\u0001|->#";
        objectArray[23] = "\u000ej\u0002/\u0014J{J\t \u0005\u0005\u001aD\u0002+\u0001_n";
        objectArray[24] = "r\u000170{\u0017l\t-\u007f\u0019\u000bk\u0014";
        objectArray[25] = "hM2ZH`\u001dm9UY/|c2^]u\b";
        objectArray[26] = "\u0015i:dD@\u0003i?>WW\u0014\"<8[C\u0005e+/\u0010R%";
        objectArray[27] = "cpgji \u0016Plexow^gn|5\u0003";
        objectArray[28] = "VFAb`k#fJmq$BhAfu~6";
        objectArray[29] = "\rI\f]\u0014&xi\u0007R\u0005i\u0019g\fY\u00013m";
        objectArray[30] = "KD\u0003gd^>d\bhu\u0011_j\u0003cqK+";
        objectArray[31] = "<X\u0002t)GIx\t{8\b(v\u0002p<R\\";
        objectArray[32] = "*:t6s>_\u001a\u007f9bq>\u0014t2f+J";
        objectArray[33] = "d\u00172v\"9o\u0018#9A4z\u001e";
        objectArray[34] = "oa{\u007fIT\u001aAppX\u001b{O{{\\A\u000f";
        objectArray[35] = "J#\n-`'?\u0003\u0001\"qh^\r\n)u2*";
        objectArray[36] = "E)9\u0013e)S)<Iv>Db?Oz*U%(X1;r";
        objectArray[37] = "m\u0018~zrT\u00188uuc\u001by6~~gA\r";
        objectArray[38] = "\u0012D\rmMiS\u0007[]Yl^\u0016\u0006&4,\u001a\u001f]8HxE\u001f\u000b]\u000e,Y\u001e\u001f:F.\u001c\u0011b";
        objectArray[39] = "\u0007ua^t\bE;a\u001aE\u0002=3`S)\u0005F.6Y5k\u00065:M8SGt&\u001aE";
        objectArray[40] = "1B\u0016P4\u00116\u0010Q\u001cW\u0010\r@\u0003\u0001k\u0000g\u0014\u0003^'z";
        objectArray[41] = "\r*A\"\u0001{\n-\u000e\u007fx\u007fWZPa\u0011zW{1$\u0001-Hy\u0001pFpY\u0016\ne\u001b\u007fN.K$\u0007(3";
        objectArray[42] = ",\u00158\u0012~\u0000oAm\u0014\u0017\u000b\u007fBRUo\u001aiCrSz\u000e\u0013\u00112\u0019-\u000bqRfL+b(QjGjZi\u0010v\u0010\u0017";
        objectArray[43] = "GT\u0000hE\u001d\u0016\tSa~\\wX\u0002)OZ\n\u0016Zz\u000e";
        objectArray[44] = "w\u001b,+\u0000?vD)}`7F\u0003{=\f0=\u001e-7\u0010^wBz}\u0019#9\u001a)<`";
        objectArray[45] = "\u001cMElA\u001dO^[{}\u0013\u001c1Ld\u0003@\tC\u0017c\u0012@u";
        objectArray[46] = "xu`\u001fV3:;`[g:B3a\u0012\u000b>9.7\u0018\u0017Pxu`\u001fV3:;`[g";
        objectArray[47] = "KAt1YPS@\"0b\u0006!F|9\u000e\u0001Z[*3\u0012o\u001a@&'\u001fW[\u0001:pb";
        objectArray[48] = "r%.\u000b\u000bO#x}\u00020\u0003B),J\u0001\b?gt\u0019@";
        objectArray[49] = "p=^f\u0005Hh<\bg>\u001e\u001a:VnR\u0019a'\u0000dNwv1\n}\u0004\rw-\u0011|>";
        objectArray[50] = "PPC\u001b\"8WW\fF[<\n!UJ17\u0003l\rZf(\u0001\\Y\u001d;9nWL@4.V\u0016\r\\cS";
        objectArray[51] = "W_#J *TY8M\u0018{P\u001d\u0000Ihg9\\\u007f^yf^\u0014}\u001bv\u001b";
        objectArray[52] = "p^r\u0012U\u0016{Yq\be\u0006\u001eJ9\u0004\t\u0001eWo\u000e\u0015o%Lc\u001a\u0018Wd\r\u007fMe";
        objectArray[53] = "ZU3`iG\u0006\u0018m;\fN[\u001b;\u00012L\u0007\u001291f\u000bZ\u0003V";
        objectArray[54] = "{v\u001e\u0005\u001fN';@^zGf ?\u0005\u0001@\u001bt\u0002Y\u0001S+ E\u0004\u0010<%3F\u001f\u0015\fqt\u001b\u000ez\\'/\u001a\u0001\b\u0000jqAd";
        objectArray[55] = "US\"\"r\bT\f't\u0012\u0002dKu4~\u0007\u001fV#>biZKq>}Y\u000e\f,/\u0012";
        objectArray[56] = ";:$a\u0015+0='{%;Uhm7\u001f;7+9b\u0019Rjlg<L0)82:%";
        objectArray[57] = "V\u000eq\u001c\u0001\u0002R\r=\u000b>\u00157\u00115\u001fR\u0011L\fc\u0015N\u007f\t\u00111\u0015QO]Vl\u0004>";
        objectArray[58] = "e]\u0001Dzq9\u0010_\u001f\u001fb~,\u0001]cr\u0005[]_~~b\u0013_\u001aq\u0003";
        objectArray[59] = "X):,;u[/!+\u0003\"[`#B:}V/:>n\"Vy_";
        objectArray[60] = "cC3J\b\u001ac\u0003'NeDkC w\u001d\"7\u000bd\u001b\u001c_yS7Ze\u0013>\u000bmS\u0018]fX,*";
        objectArray[61] = ":\"jMDJ{a<}Wz\u000b)8GD\r5xe\u0014M6";
        objectArray[62] = "n6\u0013m\u000fK51\u0002msP\u00046T$\u001fW\u007f+\u0002.\u000395t\u0002e\nEt7TU";
        objectArray[63] = "2x\r'wNc%^.L\u0000\u0002t\u000ff}\t\u007f:W5<";
        objectArray[64] = "<j/n\\a`'q59x8;#u9(#5%r\u0001ib)r\u000f";
        objectArray[65] = "kel|O j:i*/(Z};jC/!`m`_Ac=b$J=7bbr/";
        objectArray[66] = "f\u0012Fh{\u001d7O\u0015a@RV\u001eD)qZ+P\u001cz0";
        objectArray[67] = "\u0000\u0004\"\u001bct\u0007\u0003mF\u001apZc9BadYBR\u001dc\"EWbI$\u007fT8lZ'dQ\b8\u001dzu>\u0006+\u001eap\u000eRlCp\u001f\u0000AoXu/T\u00062I\u001a$A[=^\"e\u0000Gj#";
        objectArray[68] = "\u0005eh\u0005\u000b;Y(6^n \t5\r]W)Z<q\t\b)\fY7]\u0014(\u0018>\u007f_Q'e";
        objectArray[69] = "?Jx*\u0013\r;I4=,\u0019^U<)@\u001e%Hj#\\p`U8#C@4\u0012e2,";
        objectArray[70] = "\u0006fG~*{Z+\u0019%Oh\u001a7Xv3n\u001cZL&*g^kO 1`f";
        objectArray[71] = "IO`:]hML,-b~LNf%b.WJr5Zo\u0016V%H";
        objectArray[72] = "\u0005\bxW[\u0006\u001cHgR&\u0016}H8LJ\u0011\u0006UnFV\u007fFNbR[G\u0007\u000f~\u0005&";
        objectArray[73] = "\u000eWpDy\f\u0005Ps^I\u0019`C;R%\u001b\u001b^mX9u[EaL4M\u001a\u0004}\u001bI";
        objectArray[74] = "E\\UgUr\u0019\u0011\u000b<0oH\u001c08I=^\u000f\u0000l\u000e`O`\t?P?@\u001c]`Pi%";
        objectArray[75] = "o\u0005z\n<q<\u0016d\u001d\u0000\u007fly(C8%\u007f\u0004f\u001bkd\u0006";
        objectArray[76] = "\u0005Y\nk\u0014Y^^\u001bkhBoYM\"\u0004E\u0014D\u001b(\u0018+T_\u0017<\u0015\u0013\u0015\u001e\u000bkh";
        objectArray[77] = "\u0002z9q38C9oA \t3+(p3\u007f\f3)&2D";
        Object[] objectArray2 = objectArray;
        objectArray[78] = "VX\u0017Pr\u001b\u0014\u0016\u0017\u0014C\u0011l\u001e\u0016]/\u0016\u0017\u0003@W3x\f[JM&\nP\u0016\u0014\u0016C";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ga_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(ga_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ga_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

