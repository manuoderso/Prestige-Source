/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Pair
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.gC;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gd_0;
import dev.zprestige.prestige.gt_0;
import dev.zprestige.prestige.hc;
import it.unimi.dsi.fastutil.Pair;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.aq
 */
public class aq_0 {
    private final WeakHashMap a = new WeakHashMap();
    private final Set b = new LinkedHashSet();
    static final boolean c;
    private static final long d;
    private static final String e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final long i;
    private static final Object[] j;
    private static final String[] k;

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block15: {
                block14: {
                    block16: {
                        aq_0.d = hc.a(-2197740917844219876L, -5418236077129041400L, MethodHandles.lookup().lookupClass()).a(191228713794287L);
                        var19 = aq_0.d ^ 36716864657069L;
                        aq_0.j = new Object[58];
                        aq_0.k = new String[58];
                        aq_0.a();
                        var16_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var19 >>> 56);
                        for (var17_2 = 1; var17_2 < 8; ++var17_2) {
                            v2 = v2;
                            v2[var17_2] = (byte)(var19 << var17_2 * 8 >>> 56);
                        }
                        break block16;
lbl22:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var16_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var18_3 = var16_1.doFinal("a\u001a\u00aac&N\u00b9]bb\u00a1k\u00f0j\u00e9\u00c7g.\u00a9\u00e3o\u00c7\u0015\u0091?l\u009f\u0090\u00e1\u00af\u009f\u00be\u00b6a_a\u0099\\i\u0019A\u0086\u00f9\u0017!Jh\u00b7\u00c8\u0018\u00b1j7\u00f0\u00bbC\u00d5\u001e\u0098B~\u00eb\u00bfS".getBytes("ISO-8859-1"));
                    ** while (true)
                    aq_0.e = aq_0.a(var18_3).intern();
                    aq_0.h = new HashMap<K, V>(13);
                    var5_4 = Cipher.getInstance("DES/CBC/NoPadding");
                    v3 = SecretKeyFactory.getInstance("DES");
                    v4 = new byte[8];
                    v5 = v4;
                    v4[0] = (byte)(var19 >>> 56);
                    for (var6_5 = 1; var6_5 < 8; ++var6_5) {
                        v5 = v5;
                        v5[var6_5] = (byte)(var19 << var6_5 * 8 >>> 56);
                    }
                    var5_4.init(2, (Key)v3.generateSecret(new DESKeySpec(v5)), new IvParameterSpec(new byte[8]));
                    var11_6 = new long[4];
                    var8_7 = 0;
                    var9_8 = "\u00d00\u00b6\u00e3\u00db\u0016\u00f4g\u00eeMa\u0080\u00ea\u0017 0";
                    var10_9 = "\u00d00\u00b6\u00e3\u00db\u0016\u00f4g\u00eeMa\u0080\u00ea\u0017 0".length();
                    var7_10 = 0;
                    while (true) {
                        var12_11 = var9_8.substring(var7_10, var7_10 += 8).getBytes("ISO-8859-1");
                        v6 = var11_6;
                        v7 = var8_7++;
                        v8 = ((long)var12_11[0] & 255L) << 56 | ((long)var12_11[1] & 255L) << 48 | ((long)var12_11[2] & 255L) << 40 | ((long)var12_11[3] & 255L) << 32 | ((long)var12_11[4] & 255L) << 24 | ((long)var12_11[5] & 255L) << 16 | ((long)var12_11[6] & 255L) << 8 | (long)var12_11[7] & 255L;
                        v9 = -1;
                        break block14;
                        break;
                    }
lbl71:
                    // 1 sources

                    while (true) {
                        v6[v7] = v10;
                        if (var7_10 < var10_9) ** continue;
                        var9_8 = "\u00c7\u0088ZO\u00f5\u00dal+\u00ce\u0002\u0085\u0016\u0097\u00d6VM";
                        var10_9 = "\u00c7\u0088ZO\u00f5\u00dal+\u00ce\u0002\u0085\u0016\u0097\u00d6VM".length();
                        var7_10 = 0;
                        while (true) {
                            var12_11 = var9_8.substring(var7_10, var7_10 += 8).getBytes("ISO-8859-1");
                            v6 = var11_6;
                            v7 = var8_7++;
                            v8 = ((long)var12_11[0] & 255L) << 56 | ((long)var12_11[1] & 255L) << 48 | ((long)var12_11[2] & 255L) << 40 | ((long)var12_11[3] & 255L) << 32 | ((long)var12_11[4] & 255L) << 24 | ((long)var12_11[5] & 255L) << 16 | ((long)var12_11[6] & 255L) << 8 | (long)var12_11[7] & 255L;
                            v9 = 0;
                            break block14;
                            break;
                        }
                        break;
                    }
lbl90:
                    // 1 sources

                    while (true) {
                        v6[v7] = v10;
                        if (var7_10 < var10_9) ** continue;
                        break block15;
                        break;
                    }
                }
                var13_12 = v8;
                var15_13 = var5_4.doFinal(new byte[]{(byte)(var13_12 >>> 56), (byte)(var13_12 >>> 48), (byte)(var13_12 >>> 40), (byte)(var13_12 >>> 32), (byte)(var13_12 >>> 24), (byte)(var13_12 >>> 16), (byte)(var13_12 >>> 8), (byte)var13_12});
                v10 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                switch (v9) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl103:
                    // 1 sources

                    ** continue;
                }
            }
            aq_0.f = var11_6;
            aq_0.g = new Integer[4];
            var0_14 = Cipher.getInstance("DES/CBC/NoPadding");
            v11 = SecretKeyFactory.getInstance("DES");
            v12 = new byte[8];
            v13 = v12;
            v12[0] = (byte)(var19 >>> 56);
            for (var1_15 = 1; var1_15 < 8; ++var1_15) {
                v13 = v13;
                v13[var1_15] = (byte)(var19 << var1_15 * 8 >>> 56);
            }
            break block17;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
        var2_16 = -782789349732719171L;
        var4_17 = var0_14.doFinal(new byte[]{(byte)(var2_16 >>> 56), (byte)(var2_16 >>> 48), (byte)(var2_16 >>> 40), (byte)(var2_16 >>> 32), (byte)(var2_16 >>> 24), (byte)(var2_16 >>> 16), (byte)(var2_16 >>> 8), (byte)var2_16});
        ** while (true)
        aq_0.i = ((long)var4_17[0] & 255L) << 56 | ((long)var4_17[1] & 255L) << 48 | ((long)var4_17[2] & 255L) << 40 | ((long)var4_17[3] & 255L) << 32 | ((long)var4_17[4] & 255L) << 24 | ((long)var4_17[5] & 255L) << 16 | ((long)var4_17[6] & 255L) << 8 | (long)var4_17[7] & 255L;
        try {
            v14 = aq_0.b("\u00fb", aq_0.class, (long)8671089377607777551L, (long)var19) == false ? 1 : 0;
        }
        catch (MatchException v15) {
            throw aq_0.b("\u00ba", (Object)v15, (long)8670269640243560610L, (long)var19);
        }
        aq_0.c = v14;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = aq_0.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                aq_0.j[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = aq_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = aq_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = aq_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = aq_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void b(Object[] objectArray) {
        block4: {
            gK gK2 = (gK)objectArray[0];
            long l = (Long)objectArray[1];
            long l2 = (l = d ^ l) ^ 0x40A6493BA187L;
            CallSite callSite = aq_0.b("\u00fb", (Object)this.b, (long)-2119260761677562624L, (long)l);
            CallSite callSite2 = aq_0.b("\u00ba", (long)-2118435243779805967L, (long)l);
            while (aq_0.b("\u00fb", (Object)callSite, (long)-2119109714185777211L, (long)l) != false) {
                dt_0 dt_02 = (dt_0)((Object)aq_0.b("\u00fb", (Object)callSite, (long)-2119777032731144263L, (long)l));
                try {
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l2;
                    objectArray2[1] = dt_02;
                    objectArray2[0] = gK2;
                    aq_0.b("\u00fb", (Object)this, (Object)objectArray2, (long)-2119808075782460700L, (long)l);
                    if (callSite2 == null) {
                        if (callSite2 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw aq_0.b("\u00ba", (Object)matchException, (long)-2119553227747239323L, (long)l);
                }
            }
            aq_0.b("\u00fb", (Object)this.b, (long)-2120003039323592220L, (long)l);
            aq_0.b("\u00fb", (Object)this.a, (long)-2120321150178948129L, (long)l);
        }
    }

    public bT b(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        int n;
        int n2;
        dt_0 dt_02;
        block8: {
            block9: {
                gt_0 gt_02;
                block11: {
                    CallSite callSite;
                    block10: {
                        dt_02 = (dt_0)objectArray[0];
                        n2 = (Integer)objectArray[1];
                        n = (Integer)objectArray[2];
                        l5 = (Long)objectArray[3];
                        long l6 = l5 = d ^ l5;
                        l4 = l6 ^ 0x63FC9ED681A8L;
                        l3 = l6 ^ 0x16C554CF3682L;
                        l2 = l6 ^ 0x4E6822AE236AL;
                        l = l6 ^ 0x7B07CD4A73CL;
                        CallSite callSite2 = aq_0.b("\u00ba", (long)-7872323774100972329L, (long)l5);
                        aq_0.b("\u00fb", (Object)this.b, (Object)dt_02, (long)-7875134357204840510L, (long)l5);
                        gt_02 = (gt_0)((Object)aq_0.b("\u00fb", (Object)this.a, (Object)dt_02, (long)-7876239329477259045L, (long)l5));
                        CallSite callSite3 = callSite2;
                        try {
                            try {
                                try {
                                    try {
                                        object = gt_02;
                                        if (callSite3 != null) break block8;
                                        if (object == null) break block9;
                                    }
                                    catch (MatchException matchException) {
                                        throw aq_0.b("\u00ba", (Object)matchException, (long)-7875677598622635453L, (long)l5);
                                    }
                                    callSite = aq_0.b("\u00fb", (Object)gt_02.ax, (long)-7876630456896522371L, (long)l5);
                                    if (callSite3 != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw aq_0.b("\u00ba", (Object)matchException, (long)-7875677598622635453L, (long)l5);
                                }
                                if (callSite == null) break block11;
                            }
                            catch (MatchException matchException) {
                                throw aq_0.b("\u00ba", (Object)matchException, (long)-7875677598622635453L, (long)l5);
                            }
                            callSite = aq_0.b("\u00fb", (Object)gt_02.ax, (long)-7876630456896522371L, (long)l5);
                        }
                        catch (MatchException matchException) {
                            throw aq_0.b("\u00ba", (Object)matchException, (long)-7875677598622635453L, (long)l5);
                        }
                    }
                    return (bT)((Object)callSite);
                }
                bT bT2 = new bT(dt_02.a, gt_02.au, gt_02.av, l3);
                aq_0.b("\u00fb", (Object)gt_02.ax, (Object)bT2, (long)-7875070870402578072L, (long)l5);
                return bT2;
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l4;
            objectArray2[0] = bS::a;
            object = aq_0.b("\u00ba", (Object)objectArray2, (long)-7875817477262370166L, (long)l5);
        }
        bS bS2 = (bS)object;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = bS::a;
        bS bS3 = (bS)((Object)aq_0.b("\u00ba", (Object)objectArray3, (long)-7875817477262370166L, (long)l5));
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l;
        objectArray4[1] = (long)n2 * (long)dt_02.a.b;
        objectArray4[0] = (int)aq_0.a("c", (int)20825, (long)(0x74B3DFB53C0CD86BL ^ l5));
        aq_0.b("\u00fb", (Object)bS2, (Object)objectArray4, (long)-7875184250665229733L, (long)l5);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l;
        objectArray5[1] = (long)n * i;
        objectArray5[0] = (int)aq_0.a("c", (int)5177, (long)(0x3B00839C9B631D08L ^ l5));
        aq_0.b("\u00fb", (Object)bS3, (Object)objectArray5, (long)-7875184250665229733L, (long)l5);
        bT bT3 = new bT(dt_02.a, bS2, bS3, l3);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l2;
        objectArray6[1] = dt_02.a;
        objectArray6[0] = bS2;
        CallSite callSite = aq_0.b("\u00ba", (Object)objectArray6, (long)-7875668209462783973L, (long)l5);
        aq_0.b("\u00fb", (Object)this.a, (Object)dt_02, (Object)new gt_0(bS2, bS3, (gd_0)((Object)callSite), new AtomicReference<bT>(bT3)), (long)-7875774576334114634L, (long)l5);
        return bT3;
    }

    private static Field c(long l, long l2) {
        int n = aq_0.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = aq_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = aq_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = aq_0.a(clazz3, string2, clazz2)) != null) {
                    aq_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = aq_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        aq_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = aq_0.b(281877302553826L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = aq_0.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = aq_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = aq_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = aq_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        aq_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = aq_0.b(281877302553826L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = aq_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        aq_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = aq_0.b(281877302553826L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/aq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00e2' || c == '\u00ed' || c == 'h') {
                field = aq_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = aq_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public bT a(Object[] objectArray) {
        dt_0 dt_02 = (dt_0)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = d ^ l) ^ 0x3E559724A1DL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = (int)aq_0.a("c", (int)3714, (long)(0x69954D467464E358L ^ l));
        objectArray2[1] = (int)aq_0.a("c", (int)10700, (long)(0x2DC3C1B5B774415L ^ l));
        objectArray2[0] = dt_02;
        return aq_0.b("\u00fb", (Object)this, (Object)objectArray2, (long)8529060550241285915L, (long)l);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = aq_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static String a(byte[] byArray) {
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public Stream a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        return aq_0.b("\u00fb", (Object)aq_0.b("\u00fb", (Object)this.b, (long)-6812406025940062816L, (long)l), this::lambda$getAllActiveBuffers$0, (long)-6812290557508679749L, (long)l);
    }

    private void a(Object[] objectArray) {
        Object object;
        bT bT2;
        gt_0 gt_02;
        long l;
        long l2;
        long l3;
        dt_0 dt_02;
        gK gK2;
        block16: {
            bT bT3;
            long l4;
            block18: {
                block17: {
                    Object object2;
                    CallSite callSite;
                    block15: {
                        block14: {
                            gK2 = (gK)objectArray[0];
                            dt_02 = (dt_0)objectArray[1];
                            l3 = (Long)objectArray[2];
                            long l5 = l3 = d ^ l3;
                            l2 = l5 ^ 0x6D9FFED98D9BL;
                            l = l5 ^ 0x13D65DEF5D00L;
                            l4 = l5 ^ 0x1C612A89B687L;
                            gt_02 = (gt_0)((Object)aq_0.b("\u00fb", (Object)this.a, (Object)dt_02, (long)-1304761947112640626L, (long)l3));
                            callSite = aq_0.b("\u00ba", (long)-1303065453203938430L, (long)l3);
                            try {
                                try {
                                    try {
                                        if (c) break block14;
                                        object2 = gt_02;
                                        if (callSite != null) break block15;
                                    }
                                    catch (MatchException matchException) {
                                        throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                                    }
                                    if (object2 != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                                }
                                throw new AssertionError();
                            }
                            catch (MatchException matchException) {
                                throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                            }
                        }
                        object2 = aq_0.b("\u00fb", (Object)gt_02.ax, (long)-1304388337925912536L, (long)l3);
                    }
                    bT2 = (bT)object2;
                    try {
                        try {
                            try {
                                try {
                                    object = c;
                                    if (callSite != null) break block16;
                                    if (object != 0) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                                }
                                bT3 = bT2;
                                if (callSite != null) break block18;
                            }
                            catch (MatchException matchException) {
                                throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                            }
                            if (bT3 != null) break block17;
                        }
                        catch (MatchException matchException) {
                            throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                        }
                        throw new AssertionError((Object)e);
                    }
                    catch (MatchException matchException) {
                        throw aq_0.b("\u00ba", (Object)matchException, (long)-1304197739672513258L, (long)l3);
                    }
                }
                bT3 = bT2;
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            object = aq_0.b("\u00fb", (Object)bT3, (Object)objectArray2, (long)-1303817119854856294L, (long)l3);
        }
        int n = object;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l;
        CallSite callSite = aq_0.b("\u00fb", (Object)bT2, (Object)objectArray3, (long)-1305486133101383492L, (long)l3);
        aq_0.b("\u00fb", (Object)bT2, (long)-1306016334081791854L, (long)l3);
        aq_0.b("\u00fb", (Object)gt_02.ax, null, (long)-1305103640955210179L, (long)l3);
        aq_0.b("\u00ba", (int)aq_0.b("\u00fb", (Object)gt_02.aw, (Object)new Object[0], (long)-1304535020777202596L, (long)l3), (long)-1305162804333815531L, (long)l3);
        Object[] objectArray4 = new Object[5];
        objectArray4[4] = l2;
        objectArray4[3] = new gC(dt_02.a, (int)callSite, n);
        objectArray4[2] = gt_02.av;
        objectArray4[1] = gt_02.aw;
        objectArray4[0] = gK2;
        aq_0.b("\u00fb", (Object)dt_02, (Object)objectArray4, (long)-1304594549679672137L, (long)l3);
        aq_0.b("\u00ba", (int)0, (long)-1305162804333815531L, (long)l3);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "Q=j\u0000GoO5pO:\u007fO";
        objectArray[1] = "\u0013uc!I$\r}yn\u0014%\u000bqt-I\u0002\rfp!\n";
        objectArray[2] = "\u0002z\u0015\u0001\u0001b\u001cr\u000fNIb\u0006x\u0017\t@yF]\u0016\u000eLc\u0001t\r";
        objectArray[3] = "IcI\u0019\bGWkSVE]MaJ\nTWMv\u0011\u0019R]Nk\\VgFLoV\u001btWEgM\u001dHQF";
        objectArray[4] = "\u0010($\u0002f=\u001b'5M\u00073\u0010,1\u0017";
        objectArray[5] = "\u001d2x\r%~\u0003:bB\\n\u00168F\rxc:2~";
        objectArray[6] = "J]f\u0016V\u0014N@f\u0007K\u0014\rO)\u0010L\bW@$Mh\u001cJ[";
        objectArray[7] = "\f\u007f\u001e|\u0001\u0000\u001a\u007f\u001b&\u0012\u0017\r4\u0018 \u001e\u0003\u001cs\u000f7U\u0011\u0019";
        objectArray[8] = "UZZ\u0007:i zQ\b+&AtZ\u0003/|5";
        objectArray[9] = "\u00110VvW~\u00070S,Di\u0010{P*H}\u0001<G=\u0003l!";
        objectArray[10] = "X\u0006g\u0016dxS\tvY\u0007uF\u0004y22wW\u0017e\u001e%z";
        objectArray[11] = "\r\u000b\u0015O@\u001f\u0006\u0004\u0004\u0000-\u001f\u0006\u0019\u0010";
        objectArray[12] = Boolean.TYPE;
        aq_0.k[12] = "java/lang/Boolean";
        objectArray[13] = "+%X2\u001c,5-B}{-$6O']+";
        objectArray[14] = "K\u0007\tC<6]\u0007\f\u0019/!JL\u000f\u001f#5[\u000b\u0018\bh'g";
        objectArray[15] = "v/\u000b\rJ_\u0003\u000f\u0000\u0002[\u0010~\u0017\u0013\u0005RY\u0016";
        objectArray[16] = Void.TYPE;
        aq_0.k[16] = "java/lang/Void";
        objectArray[17] = Integer.TYPE;
        aq_0.k[17] = "java/lang/Integer";
        objectArray[18] = "%-\u007f\u001d\u0007WP\rt\u0012\u0016\u00181\u0003\u007f\u0019\u0012BE";
        objectArray[19] = "V$[D\u0017s@$^\u001e\u0004dWo]\u0018\bpF(J\u000fCgB";
        objectArray[20] = "9oF,P*LOM#Ae-AF(E?Y";
        objectArray[21] = "l\u0011G\u0010+8z\u0011BJ8/mZAL4;|\u001dV[\u007f/l";
        objectArray[22] = ":\u0017\u001dy\u0019VO7\u0016v\b\u0019.9\u001d}\fCZ";
        objectArray[23] = "TBG*P\u000eBBBpC\u0019U\tAvO\rDNVa\u0004\u001cc";
        objectArray[24] = "f C\u0003HS\u0013\u0000H\fY\u001cr\u000eC\u0007]F\u0006";
        objectArray[25] = "&l\u001b8\u0003JSL\u00107\u0012\u00052B\u001b<\u0016_F";
        objectArray[26] = "\u0013I=\u007f\u0001j\u0005I8%\u0012}\u0012\u0002;#\u001ei\u0003E,4U~\u0003";
        objectArray[27] = "\u0006}kM\u0015ts]`B\u0004;\u0012SkI\u0000af";
        objectArray[28] = "IZ]\rK0<zV\u0002Z\u007f]t]\t^%)";
        objectArray[29] = "(u]\u0013\u0012'-`V\u0013\u0011 \"i]QP\u0011\u0015ElX\f$\"\u007f{O\f1>HXW\u001b33";
        objectArray[30] = "H\u000f\u001bt:\u0013=/\u0010{+\\\\!\u001bp/\u0006(";
        objectArray[31] = "A\u00180S\u0015}\n\u00172\u001bt-p\u0001&\u000e\u0017:\u0015\u000e1T\u001bG";
        objectArray[32] = "\r\u0002EO'|\u0003\u0005\u0017@In`\u0005G@7i\u001d\u001d\u0002N3\u0007\n\u001a\u001e^/b\u0001\u000f\u0011\\I";
        objectArray[33] = "*#u\u001c\\\"9<r\u0007'6K)u\u0019Y1610\u0017]_!s ZGa/2<\u0004'";
        objectArray[34] = "\u001d8CZu\u0006\u001et\\KMXJu$\r7G\u001fo\u0014\ft\bB\t";
        objectArray[35] = "Kq\u0004#qNJ*E\\r\u000e\u00180\u0014 t\bu{\u001e7w\tO1\u0016>hr";
        objectArray[36] = "\fD\r\u001d\u001d\u000e\r\u001fLb\u0004NH\u0012\u001d\u0007\u007f\u000b\u000e\u001b\u0005^F]K\u0014\u0019b";
        objectArray[37] = "%&$DZ\u0018o.-[!B}>\tMQ^\u0014u/\u001a\u001d]-,v_Y\"";
        objectArray[38] = "R\u0003\\b\u0000\u001f\u0004FS~<C\u0002G8*ED\u0002R\tj\u0003\\R?\u0001/XWW\u0006WjWKk";
        objectArray[39] = "\u0013m\u0005W\u0013\"I{OIn\"Ej5\n\u0014=\u0010p\u0005\u000bWrM\u0016\u000fJ\u001euN&\u000e\tQ((";
        objectArray[40] = "|0cxiS}k\"\u0007`\u000b/b`\u0007aQ.7z9o\u00102i\u001a";
        objectArray[41] = "E'ls<y\u0004z}}S!\u0017\u0016+k#~\u001f&*(l#y,kak I-(.6FE'ls<y\u0004z}}S";
        objectArray[42] = "HlIEj+\u0014iE\u0013\u00063vfL\u000bx7\u000b~\t\u0005|Y\u001cy\u0015\u0015`<\u0017l\u001a\u0017\u0006";
        objectArray[43] = "q#=\u007fYb*,1)c4M5jf\u001d30-/h\u0019]'o?%\u0003c).#{c";
        objectArray[44] = "Nt FM9\u0004|)Y6e\u0012g7\"\fy\u000f/-\u0012\r:@rK";
        objectArray[45] = "w&_ak\u0004%0\u001c1S\u001c\u001b%Zp-\u001bf=\u001f~)u!;\u001375E x\\jS";
        objectArray[46] = "\u001bz\u0014{p(Al^e\r?]}$&w7\u0018g\u0014'4xE\u0001\u001ef}\u007fF1\u001f%2\" ;^l5!\u0010:\u001d#hG";
        objectArray[47] = "w)\u001b\baj,&\u0017^[<Kd\u001e\b%dv$\b\u0010kUt0\u0013\u0010jh4&\u000b^[";
        objectArray[48] = "\u007f1KA)\u001eq6\u0019NG\f\u00126IN9\u000bo.\f@=e\u007f1KA)\u001eq6\u0019NG";
        objectArray[49] = "*\u001dJ7G\nq\u0012Fa}_\u0016\u000b\u001d.\u0003[k\u0013X \u00075(\u0001\u0018`\u0011Gt\u0004\u00146}";
        objectArray[50] = "\b:\u0005\u0003i^T?\tU\u0005E60\u0000M{BK(EC\u007f,\\/YScIW:VQ\u0005";
        objectArray[51] = "\u000b [i\u0001N\u0005`L0bRVbAz\u000fRrb[m\u0018BZ~F[\u001eWGd[\u0000R^\u0001%_9\u000b\u0007Da ";
        objectArray[52] = "\u0011Q<\u0001HKKGv\u001f5_KXaf__JKj\u0003TJEI\f";
        objectArray[53] = "A)_a\u0004/\u001d,S7h6\u001b \u0018=h7A+_0V9\u00007\u0001P";
        objectArray[54] = "i\n\u0006&\u0016I>]\u0012p,G\u0006\u0000A2R@{\u0018\u0004<V.lZ\u0014qL\u0010b\u001b\b/,";
        objectArray[55] = "+\u0010jDRL*K+;Y\u001cy+)A@Hs\u001b(\u0002\u000f\u0015\u0015\u001bs\u0001\f\u000f,B*DHp";
        objectArray[56] = "\r^=X?\u0011\u000e\u0012\"I\u0007[Z\u0013Z\u000f}P\u000f\tj\u000e>\u001fRo0\u000bk\u001cWQ>JwB7";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "p\u0015z)5\u0019,\u001ca,T\fw0e/8=~\u0000x$$*i\u0000m8T\th\u001ae/1\u0002}\u0015gI>]\u007fFdw0\u001cc\u0018\u0004";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 17;
            case 1 -> 51;
            case 2 -> 21;
            case 3 -> 58;
            case 4 -> 24;
            case 5 -> 34;
            case 6 -> 28;
            case 7 -> 40;
            case 8 -> 60;
            case 9 -> 46;
            case 10 -> 27;
            case 11 -> 19;
            case 12 -> 5;
            case 13 -> 56;
            case 14 -> 55;
            case 15 -> 54;
            case 16 -> 16;
            case 17 -> 53;
            case 18 -> 12;
            case 19 -> 41;
            case 20 -> 42;
            case 21 -> 20;
            case 22 -> 0;
            case 23 -> 59;
            case 24 -> 14;
            case 25 -> 7;
            case 26 -> 13;
            case 27 -> 3;
            case 28 -> 47;
            case 29 -> 26;
            case 30 -> 49;
            case 31 -> 57;
            case 32 -> 4;
            case 33 -> 61;
            case 34 -> 52;
            case 35 -> 25;
            case 36 -> 50;
            case 37 -> 11;
            case 38 -> 1;
            case 39 -> 63;
            case 40 -> 38;
            case 41 -> 48;
            case 42 -> 6;
            case 43 -> 31;
            case 44 -> 45;
            case 45 -> 23;
            case 46 -> 29;
            case 47 -> 22;
            case 48 -> 43;
            case 49 -> 30;
            case 50 -> 44;
            case 51 -> 36;
            case 52 -> 15;
            case 53 -> 8;
            case 54 -> 2;
            case 55 -> 32;
            case 56 -> 33;
            case 57 -> 9;
            case 58 -> 39;
            case 59 -> 35;
            case 60 -> 18;
            case 61 -> 10;
            case 62 -> 62;
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
        aq_0.k[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = aq_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B8A;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/aq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            aq_0.g[n2] = n3;
        }
        return g[n2];
    }

    private Pair lambda$getAllActiveBuffers$0(dt_0 dt_02) {
        long l = d ^ 0x73F2380F1819L;
        return aq_0.b("\u00ba", (Object)dt_02, (Object)((bT)((Object)aq_0.b("\u00fb", (Object)((gt_0)((Object)aq_0.b("\u00fb", (Object)this.a, (Object)dt_02, (long)-5267896381382249330L, (long)l))).ax, (long)-5267592544174091480L, (long)l))), (long)-5267234130833729092L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aq_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(aq_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

